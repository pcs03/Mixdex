package nl.pcstet.mixdex.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import nl.pcstet.mixdex.ui.navigation.MixdexNavHost

@Composable
fun MixdexApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    MixdexNavHost(
        navController = navController,
        modifier = modifier
    )
}