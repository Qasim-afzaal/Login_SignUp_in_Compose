package com.example.login_signup_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.login_signup_compose.components.headingTextComponent

@Composable
fun termsAndCondition(){
    
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(15.dp)) {
        headingTextComponent(value = "Terms and Condition")


        
    }
}