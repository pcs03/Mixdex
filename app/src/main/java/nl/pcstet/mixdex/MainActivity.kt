package nl.pcstet.mixdex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import nl.pcstet.core.ApiException
import nl.pcstet.core.onError
import nl.pcstet.core.onSuccess
import nl.pcstet.mixdex.data.network.dto.Cocktail
import nl.pcstet.mixdex.data.repository.CocktailRepository
import nl.pcstet.mixdex.ui.MixdexApp
import nl.pcstet.mixdex.ui.theme.MixdexTheme
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MixdexTheme {
                Surface {
                    val windowSize = calculateWindowSizeClass(this).widthSizeClass
                    MixdexApp(
                        windowSize = windowSize,
                        modifier = Modifier.fillMaxSize()
                    )
                }

            }
        }
    }
}

//@Composable
//fun MixdexApp(repository: CocktailRepository) {
//    var cocktails by remember {
//        mutableStateOf<List<nl.pcstet.mixdex.data.network.dto.Cocktail>>(emptyList())
//    }
//    var isLoading by remember {
//        mutableStateOf(false)
//    }
//    var errorMessage by remember {
//        mutableStateOf<ApiException?>(null)
//    }
//
//    val scope = rememberCoroutineScope()
//
//}