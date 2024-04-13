package com.fabiodrneles.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fabiodrneles.listadetarefascompose.R
import com.fabiodrneles.listadetarefascompose.componentes.CaixaDeTexto
import com.fabiodrneles.listadetarefascompose.ui.theme.BLACK
import com.fabiodrneles.listadetarefascompose.ui.theme.Purple700
import com.fabiodrneles.listadetarefascompose.ui.theme.WHITE

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SalvarTarefa(
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(
                        text = "Salvar Tarefa",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple700)
            )
        },
        containerColor = WHITE,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("listaTarefas")

                },
                containerColor = Color.Blue,
                shape = CircleShape
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                    contentDescription = "Ícone de salvar tarefa!"
                )

            }
        }

    ) {


        var tituloTarefa by remember {
            mutableStateOf("")
        }


        Box (
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
                .padding(start = 20.dp, top = 80.dp, end = 20.dp, bottom = 0.dp)
        ){

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ){
                CaixaDeTexto(
                    value = tituloTarefa,
                    onValueChange = {
                        tituloTarefa = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 20.dp, 20.dp, 0.dp),
                    label = "Titulo Tarefa",
                    maxLines = 1,
                    keyboardType = KeyboardType.Text
                )

            }


        }



    }

}