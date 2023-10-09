package com.example.login_signup_compose.navigation

import androidx.activity.OnBackPressedDispatcher
import androidx.activity.OnBackPressedDispatcherOwner
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.staticCompositionLocalOf

private  val LocalOnBackPressedDispatcherOwner = staticCompositionLocalOf<OnBackPressedDispatcherOwner?> {null}