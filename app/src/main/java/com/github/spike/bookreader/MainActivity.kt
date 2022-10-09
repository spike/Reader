package com.github.spike.bookreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.bookreader.ui.theme.ReadingTheme
import com.github.spike.bookreader.banner.WelcomeBack
import com.github.spike.bookreader.booklist.BookList
import com.github.spike.bookreader.bottomnavigation.BottomNavigationBar
import com.github.spike.bookreader.smartpickersection.SmartPickerSection
import com.github.spike.bookreader.stats.SummaryStats

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReadingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScaffoldLayout()
                }
            }
        }
    }
}

val covers = arrayOf(
    Triple(R.drawable.enders_game_cover, "Ender's Game", "Orson Scott Card"),
    Triple(R.drawable.dune_cover, "Dune", "Frank Herbert"),
    Triple(R.drawable.harry_potter_one_cover, "Harry Potter and the Sorcerer's Stone", "J. K. Rowling")
)
val percentages = arrayOf(23, 78, 34)

@Composable
fun ScaffoldLayout() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = {Text(
                    "Reading App",
                    style = MaterialTheme.typography.h5,
                    color = Color.Black,
                )},
                backgroundColor = Color.White,
                elevation = 0.dp
            )},
        content = {
            ScreenContent()
        },
        bottomBar = {
                BottomNavigationBar()
        }
    )
}

@Composable
fun ScreenContent() {
    val colorBlue = Color(0xFFD8E6E4)
    val colorWhite = Color.White

    // Creating a Vertical Gradient Color
    val gradientWhiteLightBlue = Brush.verticalGradient(0f to colorWhite, 1000f to colorBlue)

    Column (
        modifier = Modifier.fillMaxSize().background(gradientWhiteLightBlue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WelcomeBack()
        SmartPickerSection()
        SummaryStats()
        BookList()
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Blue
                        )
                    )
                )
        ) {
            ScaffoldLayout()

        }
    }
}