@file:OptIn(ExperimentalMaterial3Api::class)

package com.fabiodrneles.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fabiodrneles.listadetarefascompose.R
import com.fabiodrneles.listadetarefascompose.ui.theme.BLACK
import com.fabiodrneles.listadetarefascompose.ui.theme.Purple700


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListaTarefas(
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(
                        text = "Lista de Tarefas",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple700)
            )
        },
        containerColor = BLACK,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                          navController.navigate("salvarTarefa")

            },
                containerColor = Blue,
                shape = CircleShape
        ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_add),
                    contentDescription = "Ícone de salvar tarefa!"
                )

            }
        }
    ) {

    }

}
    