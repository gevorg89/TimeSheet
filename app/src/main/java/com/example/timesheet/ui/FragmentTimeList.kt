package com.example.timesheet.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.timesheet.domain.model.TimeItem
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class FragmentTimeList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val listTime = mutableListOf<TimeItem>().apply {
                    repeat(100) {
                        add(TimeItem())
                    }
                }
                LazyColumn {
                    itemsIndexed(
                        items = listTime
                    ) { index, timeItem ->
                        TestCard(timeItem = timeItem, onClick = {})
                    }
                }
            }


        }
    }
}