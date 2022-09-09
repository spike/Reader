package com.github.spike.bookreader

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.IntrinsicSize.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.spike.bookreader.ui.theme.ReadingTheme
import com.github.spike.bookreader.ui.theme.orange
import com.github.spike.bookreader.R

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

@Composable
fun SummaryStats() {
        Row(
            modifier = Modifier.padding(
                top = 8.dp,
            ).height(Min),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier.weight(.5f))
            Card(elevation = 2.dp,
                modifier = Modifier.weight(3f),

            ) {
                Row(
                    modifier = Modifier.padding(
                        top = 20.dp,
                        bottom = 20.dp
                    ).height(Min),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally,

                        ) {
                        Text(
                            text = "996",
                            style = MaterialTheme.typography.h4,
                        )
                        Text(
                            text = "Hours",
                            style = MaterialTheme.typography.body1,
                        )

                    }

                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "207",
                            style = MaterialTheme.typography.h4,
                        )
                        Text(
                            text = "Books",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "104",
                            style = MaterialTheme.typography.h4,
                        )
                        Text(
                            text = "Authors",
                            style = MaterialTheme.typography.body1,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.weight(.5f))
        }

    }
@Composable
fun WelcomeBack() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 26.dp, top = 30.dp)
    ){
        Column() {
            Card(
            modifier = Modifier.size(60.dp),
            shape = CircleShape,
            elevation = 0.dp,

        ) {
            Image(
                painterResource(R.drawable.ai_generated_face3),
                contentDescription = "",
            )
        }
        }
        Column(modifier = Modifier.padding(
            start = 32.dp,
            bottom = 32.dp
        )) {

            Text(text="Welcome back", style = MaterialTheme.typography.h4)
            Text(text="Cindy!", style= MaterialTheme.typography.h3)
        }
    }
}
@Composable
fun PickButton(){
    val mContext = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(mContext,"button clicked!", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = orange
        ),
        shape = RoundedCornerShape(50),
    )

    {
        Text(text="SMART PICKER",
            color = Color.White,
            style= MaterialTheme.typography.h5)
    }
}
@Composable
fun SmartPicker() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 26.dp, top = 30.dp, bottom = 8.dp)
    ){
        Column() {
            Text(text="Let our AI select a book",
                style= MaterialTheme.typography.body1)
            Text(text="for you based on your",
                style= MaterialTheme.typography.body1)
            Text(text="interests.",
                style= MaterialTheme.typography.body1)
        }
        Column(modifier = Modifier.padding(
            start = 16.dp,
            bottom = 16.dp
        )) {
            PickButton()
        }
    }
}

@Composable
fun BookList() {
    LazyColumn (modifier = Modifier
        .padding(top = 20.dp)
        .fillMaxWidth()
    ) {
        item {
            Text(
                text = "Continue Reading",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(
                    start = 30.dp,
                    top = 8.dp,
                    bottom = 8.dp),
            )
        }
        items(20) { index ->
            Row(
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        top = 8.dp,
                        bottom = 8.dp
                    )
                    .fillMaxWidth()) {
                Card(
                    modifier = Modifier.size(80.dp),
                    shape = RectangleShape,
                    elevation = 0.dp
                ) {
                    Image(
                        painterResource(R.drawable.enders_game_cover),
                        contentDescription = "",
                    )
                }
                Column(modifier = Modifier.padding(
                    start = 8.dp,
                    top = 4.dp,
                    bottom = 4.dp,
                    end = 20.dp
                )) {
                    Text(text = "Ender's Game",
                        style = MaterialTheme.typography.h4
                    )
                    Text(text = "Orson Scott Card",
                        style = MaterialTheme.typography.body2
                    )
                }
                Column(modifier = Modifier.padding(
                    start = 60.dp,
                    top = 4.dp,
                    bottom = 4.dp,
                    end = 8.dp
                )) {
                    Text(text = "7%", fontFamily = FontFamily.Default)
                    Spacer(modifier = Modifier.padding(top = 20.dp))
                    Card(
                        modifier = Modifier.size(24.dp),
                        shape = CircleShape,
                        elevation = 0.dp
                    ) {
                        Image(
                            painterResource(R.drawable.indicator),
                            contentDescription = "",
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black
    )
}
@Composable
fun BottomNavigationBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Favorites,
        NavigationItem.Stats,
        NavigationItem.Profile
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black,
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = false,
                selected = false,
                onClick = {
                    /* Add code later */
                }
            )
        }
    }
}
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
            CurrentReading()
            //Text("BodyContent")
        },
        bottomBar = {
            BottomNavigationBar()
            // BottomAppBar(backgroundColor = materialBlue700) { Text("BottomAppBar")
        }
    )
}

@Composable
fun CurrentReading() {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WelcomeBack()
        SmartPicker()
        SummaryStats()
        BookList()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        ScaffoldLayout()
    }
}