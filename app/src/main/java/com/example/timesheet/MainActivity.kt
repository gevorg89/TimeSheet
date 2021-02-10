package com.example.timesheet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {
            //Greeting(name = "test")
            ListItemsSection()
        }*/
        setContentView(R.layout.main_activity)
    }

    @Composable
    fun Greeting(name: String) {
        Row(
            Modifier
                .background(color = Color.Black)
                .alpha(0.95f)
                .border(width = 5.dp, color = Color.Yellow, shape = RoundedCornerShape(16.dp))
                .padding(16.dp)

        ) {
            Text(text = "Hello", color = Color.Green)
            Text(text = " $name!", color = Color.Red)
        }

    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting("Android")
    }

    @Preview
    @Composable
    fun ListItems() {
        val itemsList = (0..50).toList()
        val itemsList2 = (50..100).toList()
        val itemsIndexedList = listOf("A", "B", "C")
        LazyColumn {
            items(itemsList) {
                Text("Item is $it")
            }

            item {
                Text("Single item")
            }

            itemsIndexed(itemsIndexedList) { index, item ->
                Text("Item at index $index is $item")
            }

            item {
                Text("Single Test")
            }
        }
    }

    @Preview
    @Composable
    fun ListItemsSection() {
        val sections = listOf("A", "B", "C", "D", "E", "F", "G")
        LazyColumn(Modifier.fillMaxWidth()) {
            items(10000) {
                Text("Item $it from the section $it")
            }
        }
    }
}