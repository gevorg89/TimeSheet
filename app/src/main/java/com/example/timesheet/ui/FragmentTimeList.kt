package com.example.timesheet.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.example.timesheet.domain.model.TimeItem
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class FragmentTimeList : Fragment() {

    @ExperimentalFoundationApi
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val listTime = mutableListOf<TimeItem>().apply {
                    repeat(20) {
                        add(TimeItem())
                    }
                }
                LazyColumn {
                    item {
                        LazyVerticalGrid(cells = GridCells.Adaptive(150.dp)) {
                            itemsIndexed(
                                    items = listTime
                            ) { index, timeItem ->
                                TestCard(timeItem = timeItem, onClick = {})
                            }
                            item {
                                Box(Modifier
                                        .background(color = Color.LightGray)
                                        .fillMaxWidth()
                                        .padding(16.dp)) {
                                    Text(text = "Some row")
                                }

                            }
                        }
                    }

                }

                /*LazyColumn {
                    item {


                    }
                    item {
                        Box(Modifier
                                .background(color = Color.LightGray)
                                .fillMaxWidth()
                                .padding(16.dp)) {
                            Text(text = "Some row")
                        }

                    }
                }*/

                /*LazyColumn {

                }*/
            }


        }
    }
}