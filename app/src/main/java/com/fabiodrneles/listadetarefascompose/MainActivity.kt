package com.fabiodrneles.listadetarefascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fabiodrneles.listadetarefascompose.ui.theme.ListaDeTarefasComposeTheme
import com.fabiodrneles.listadetarefascompose.view.ListaTarefas
import com.fabiodrneles.listadetarefascompose.view.SalvarTarefa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeTarefasComposeTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "listaTarefas" ){

                    composable(
                        route = "listaTarefas"
                    ){
                        ListaTarefas(navController)
                    }

                    composable(
                        route = "salvarTarefa"
                    ){
                        SalvarTarefa(navController)
                    }

                }

            }
        }
    }
}
