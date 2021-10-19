package app.pmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import app.pmi.theme.Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            Theme { MyScreen() }
        }
    }
}

@Composable
private fun MyScreen(
) {
    Text(text = "Hello Yo!")
}