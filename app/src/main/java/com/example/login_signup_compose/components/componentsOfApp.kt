package com.example.login_signup_compose.components

import android.util.Log
import android.view.RoundedCorner
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login_signup_compose.R

@Composable
fun normakTextComponent(value:String){
  Text(text = value,
  modifier = Modifier
      .fillMaxWidth()
      .heightIn(min = 40.dp)
  , style = TextStyle(
          fontSize = 18.sp,
          fontWeight = FontWeight.Normal,
          fontStyle = FontStyle.Normal,
          color = Color(R.color.colorText),
          textAlign = TextAlign.Center



  )


      )

}

@Composable
fun headingTextComponent(value:String){
    Text(text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn()
        , style = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            color = Color(R.color.colorText),
            textAlign = TextAlign.Center
        ))
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun TextField(label:String){
    val text= remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp)),
        label= {Text(text = label)},
        colors = TextFieldDefaults.outlinedTextFieldColors(

            focusedBorderColor = colorResource(id = R.color.colorPrimary),
            focusedLabelColor =colorResource(id = R.color.colorPrimary),
           cursorColor = colorResource(id = R.color.colorPrimary),



            ),

        keyboardOptions=KeyboardOptions.Default,


        value = text.value, onValueChange = {
        text.value=it
    },
        leadingIcon = { Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Leading",Modifier.size(50.dp))}
     )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun PassTextField(label:String){
    val pasword= remember {
        mutableStateOf("")
    }
    val passVisible= remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp)),
        label= {Text(text = label)},
        colors = TextFieldDefaults.outlinedTextFieldColors(

            focusedBorderColor = colorResource(id = R.color.colorPrimary),
            focusedLabelColor =colorResource(id = R.color.colorPrimary),
            cursorColor = colorResource(id = R.color.colorPrimary),



            ),

        keyboardOptions=KeyboardOptions(keyboardType = KeyboardType.Password),


        value = pasword.value, onValueChange = {
            pasword.value=it
        },
        leadingIcon = { Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Leading",Modifier.size(50.dp))},
        trailingIcon = {
            val icon= if(passVisible.value){
                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Leading",Modifier.size(50.dp))
            }else{
                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Leading",Modifier.size(50.dp))
            }

            var des=if(passVisible.value){
                "hide"
            }else{
                "show"
            }
            IconButton(onClick = {passVisible.value=!passVisible.value}) {
//                Text(text = "eye")
                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription ="hid" )
            }
            
        },
        visualTransformation = if(passVisible.value) VisualTransformation.None else PasswordVisualTransformation()
    
    

    )
}

@Composable
fun checkBox(value: String){
    Row(modifier = Modifier
        .fillMaxWidth()
        .heightIn(58.dp),
    verticalAlignment = Alignment.CenterVertically
        ) {
        val check= remember {
            mutableStateOf(false)
        }
Checkbox(checked =check.value , onCheckedChange ={
     check.value = !check.value
} )
       ClickableText(value = value)

    }
}
@Composable
fun ClickableText(value: String) {
    val byContaining = "By Containing "
    val terms = "Terms and Condition "
    val information = "further information "
    val contact = "contact us "

    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Black)) {
            append(byContaining)
        }
        withStyle(style = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
            pushStringAnnotation(tag = terms, annotation = terms)
            append(terms)
            pop()
        }

        append(information)
        withStyle(style = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
            pushStringAnnotation(tag = contact, annotation = contact)
            append(contact)
            pop()
        }
    }

    val textLayoutResult = remember { mutableStateOf<TextLayoutResult?>(null) }

    ClickableText(
        text = annotatedString,
        onClick = { offset ->
            val annotations = annotatedString.getStringAnnotations(
                tag = "tag", // Change to the correct tag you want to check
                start = offset,
                end = offset
            )
            if (annotations.isNotEmpty()) {
                val annotation = annotations[0]
                Log.d("Clickable", "Clicked: ${annotation.item}")
            }
        }
    )
}


