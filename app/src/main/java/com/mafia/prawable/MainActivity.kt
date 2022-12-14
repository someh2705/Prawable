package com.mafia.prawable

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mafia.prawable.ui.theme.PrawableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        startActivity(Intent(this, LegacyActivity::class.java))
    }
}
