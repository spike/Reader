package com.github.spike.bookreader.bottomnavigation

import com.github.spike.bookreader.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Search : NavigationItem("search", R.drawable.ic_search, "Search")
    object Favorites : NavigationItem("favorites", R.drawable.ic_favorites, "Favorites")
    object Stats : NavigationItem("stats", R.drawable.ic_stats, "Stats")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}