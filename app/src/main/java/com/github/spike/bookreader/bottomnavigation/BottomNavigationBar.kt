package com.github.spike.bookreader.bottomnavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.github.spike.bookreader.R
import com.github.spike.bookreader.booklist.BookList
import com.github.spike.bookreader.ui.theme.ReadingTheme

@Composable
fun BottomNavigationBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Favorites,
        NavigationItem.Stats,
        NavigationItem.Profile
    )
    val colorBlue = Color(0xFFD8E6E4)
    val colorWhite = Color.White

    // Creating a Vertical Gradient Color
    val gradientGrayWhite = Brush.verticalGradient(0f to colorWhite, 1000f to colorBlue)

    BottomNavigation(
        backgroundColor = colorBlue,
        contentColor = Color.Black,
    ) {
        items.forEach { item ->
            if (item == NavigationItem.Favorites) {
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painterResource(id = item.icon),
                            contentDescription = item.title
                        )
                    },
                    label = {  },
                    selectedContentColor = Color.Black.copy(0.4f),
                    unselectedContentColor = Color.Black.copy(0.4f),
                    alwaysShowLabel = false,
                    selected = false,
                    onClick = {
                    }
                )
            } else {
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painterResource(id = item.icon),
                            contentDescription = item.title
                        )
                    },
                    label = {  },
                    selectedContentColor = Color.Black,
                    unselectedContentColor = Color.Black.copy(0.4f),
                    alwaysShowLabel = false,
                    selected = false,
                    onClick = {
                    }
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReadingTheme {
        BottomNavigationBar()
    }
}