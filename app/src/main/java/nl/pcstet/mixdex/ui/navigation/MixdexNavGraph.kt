package nl.pcstet.mixdex.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import nl.pcstet.mixdex.ui.screens.CocktailListScreen
import nl.pcstet.mixdex.ui.screens.CocktailListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MixdexNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.CocktailList,
        modifier = modifier
    ) {
        composable<Route.CocktailList> {
            val viewmodel = koinViewModel<CocktailListViewModel>()
            val uiState by viewmodel.uiState.collectAsState()
            CocktailListScreen(
                uiState = uiState
            )
        }
    }
}