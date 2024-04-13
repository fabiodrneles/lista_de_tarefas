package com.fabiodrneles.listadetarefascompose.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import com.fabiodrneles.listadetarefascompose.ui.theme.BLACK
import com.fabiodrneles.listadetarefascompose.ui.theme.LIGHT_BLUE
import com.fabiodrneles.listadetarefascompose.ui.theme.ShapeEditText
import com.fabiodrneles.listadetarefascompose.ui.theme.WHITE


@Composable
fun CaixaDeTexto(
    value: String,  // Valor atual do texto dentro da caixa
    onValueChange: (String) -> Unit, // Função callback para atualizar o valor do texto
    modifier: Modifier, // Aplica modificadores de estilo
    label: String, // Texto do label que aparece acima da caixa
    maxLines: Int, // Número máximo de linhas permitidas na caixa
    keyboardType: KeyboardType // Tipo de teclado (texto, número, etc.)
) {
    OutlinedTextField( // Componente principal para criar a caixa de texto
        value = value,
        onValueChange,
        modifier, // Aplica modificadores de estilo
        label = {
            Text(text = label)
        },
        maxLines = maxLines,

        colors = OutlinedTextFieldDefaults.colors( // Define as cores da caixa de texto


            // Cor da borda quando clicar na caixa
            focusedBorderColor = LIGHT_BLUE,
            // Cor da borda quando não clicar na caixa
            unfocusedBorderColor = BLACK,
            // Texto de dentro da caixa quando clicar dentro
            focusedLabelColor = LIGHT_BLUE,
            // Texto de dentro da caixa quando não clicar dentro
            unfocusedLabelColor = BLACK,
            // Cor do background da caixa quando clicar nela
            focusedContainerColor = WHITE,
            // Cor do cursor do mouse quando clicar na caixa
            cursorColor = LIGHT_BLUE,
        ),
        shape = ShapeEditText.small, // Define a forma da caixa de texto
        keyboardOptions = KeyboardOptions( // Define as opções do teclado
            keyboardType = keyboardType // Define o tipo de teclado (texto, número, etc.)
        )

    )

}