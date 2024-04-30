@file:OptIn(ExperimentalMaterial3Api::class)

package com.fabiodrneles.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fabiodrneles.listadetarefascompose.R
import com.fabiodrneles.listadetarefascompose.itemlista.TarefaItem
import com.fabiodrneles.listadetarefascompose.model.Tarefa
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
                        color = Color.White,
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

        val listaTarefas: MutableList<Tarefa> = mutableListOf(
            Tarefa(
                "Realizar os testes.",
                "A Aplicação de tarefas precisa ser testada.",
                0
            ),

            Tarefa(
                "Estudar Compose.",
                "Converter XML em componentes compose.",
                1
            ),

            Tarefa(
                "Realizar os testes.",
                "A Aplicação de tarefas precisa ser testada.",
                2
            ),

            Tarefa(
                "Realizar Entrevistas.",
                "O projeto voluntário precisa de desenvolvedores..",
                3
            )

        )

        LazyColumn(
            modifier = Modifier.padding(top = 65.dp)
        ){
            itemsIndexed(listaTarefas){position, _ ->
                TarefaItem(position, listaTarefas)

            }
        }

    }

}

    