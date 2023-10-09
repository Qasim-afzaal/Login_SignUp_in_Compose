package com.example.login_signup_compose.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class  Screen {

    object SingUpScreen : Screen()
    object  TermsAndCondtion :Screen()


}

object PostOfficeRoutes{

    var currentScreen : MutableState<Screen> = mutableStateOf(Screen.SingUpScreen)

    fun navigateScreen (destination:Screen){
        currentScreen.value=destination
    }
}