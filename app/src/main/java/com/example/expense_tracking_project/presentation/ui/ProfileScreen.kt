package com.example.expense_tracking_project.presentation.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.expense_tracking_project.presentation.vm.SignOutViewModel

@Composable
fun ProfileScreen(
//    onSignOut: () -> Unit
    signOutViewModel: SignOutViewModel = viewModel() )
{
    // Sign Out Button
    Button(
//        onClick = { onSignOut() },
        onClick = { signOutViewModel.signout() },
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        Text("Sign Out")
    }
}