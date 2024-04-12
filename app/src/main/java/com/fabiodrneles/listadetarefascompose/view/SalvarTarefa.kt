package com.fabiodrneles.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fabiodrneles.listadetarefascompose.ui.theme.BLACK
import com.fabiodrneles.listadetarefascompose.ui.theme.Purple700

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SalvarTarefa(
    navController: NavController
){
    Scaffold (
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
        containerColor = BLACK

    ){



    }

}