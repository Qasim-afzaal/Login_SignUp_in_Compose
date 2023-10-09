package com.example.login_signup_compose.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.login_signup_compose.screens.signUpScreen

@Composable
fun postOfficeApp(){
    Surface(modifier =Modifier.fillMaxSize(), color = Color.White) {
        signUpScreen()
    }
}