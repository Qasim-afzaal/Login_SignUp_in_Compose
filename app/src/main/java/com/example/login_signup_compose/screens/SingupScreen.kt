package com.example.login_signup_compose.screens

import android.transition.Scene
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login_signup_compose.R
import com.example.login_signup_compose.components.PassTextField
import com.example.login_signup_compose.components.TextField
import com.example.login_signup_compose.components.checkBox
import com.example.login_signup_compose.components.headingTextComponent
import com.example.login_signup_compose.components.normakTextComponent
import com.example.login_signup_compose.navigation.PostOfficeRoutes
import com.example.login_signup_compose.navigation.Screen

@Composable
fun signUpScreen(){
  Surface(

      modifier = Modifier
          .fillMaxSize()
          .background(Color.White)
          .padding(28.dp)) {
      Column(Modifier.fillMaxSize()) {
          normakTextComponent(value = stringResource(R.string.Hello))
          headingTextComponent(value = stringResource(id = R.string.Create))
          TextField("First Name")
          Spacer(modifier = Modifier.height(10.dp))
          TextField("Last Name")
          Spacer(modifier = Modifier.height(10.dp))
          TextField("Email")
          Spacer(modifier = Modifier.height(10.dp))
          PassTextField("Password")
          checkBox(value = "Terms and Condition", onTextSelected = {
              PostOfficeRoutes.navigateScreen(Screen.TermsAndCondtion)
          })
      }
      
      }
}
@Preview
@Composable
fun DefualtPreviewOfSignUpScreen(){
    signUpScreen()

}
