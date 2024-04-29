package com.fabiodrneles.listadetarefascompose.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.fabiodrneles.listadetarefascompose.ui.theme.LIGHT_BLUE
import com.fabiodrneles.listadetarefascompose.ui.theme.WHITE

@Composable
fun Botao(
    onClick: () -> Unit,
    modifier: Modifier,
    texto: String
){

    Button(
        onClick,
        modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = LIGHT_BLUE,
            contentColor = WHITE
        )
    ) {

        Text(
            text = texto,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

    }
}