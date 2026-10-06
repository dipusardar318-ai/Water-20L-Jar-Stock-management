package com.example.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("20L Jar Stock Manager", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(2), verticalArrangement = Arrangement.spacedBy(8.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            item { StockCard("Total Jars", "0") }
            item { StockCard("Full Jars", "0") }
            item { StockCard("Empty Jars", "0") }
            item { StockCard("Customers", "0") }
            item { StockCard("Damaged", "0") }
            item { StockCard("Lost", "0") }
        }
    }
}

@Composable
fun StockCard(title: String, count: String) {
    Card {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Text(count, style = MaterialTheme.typography.headlineLarge)
        }
    }
}
