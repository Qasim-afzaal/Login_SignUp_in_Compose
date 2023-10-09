package com.example.login_signup_compose.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.login_signup_compose.navigation.PostOfficeRoutes
import com.example.login_signup_compose.navigation.Screen
import com.example.login_signup_compose.screens.signUpScreen
import com.example.login_signup_compose.screens.termsAndCondition

@Composable
fun postOfficeApp(){
    Surface(modifier =Modifier.fillMaxSize(), color = Color.White) {
        Crossfade(targetState = PostOfficeRoutes.currentScreen) {
            currentState->
            when(currentState.value){
                is Screen.SingUpScreen ->{
                    signUpScreen()
                }
                is Screen.TermsAndCondtion ->{
                    termsAndCondition()
                }
            }
        }
    }
}