package com.hrithik.dailynews.android

import android.widget.Toolbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hrithik.dailynews.Platform

@Composable
fun AboutScreen(){
    Column {
        Toolbar()
        ContentView()
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Toolbar(){
    TopAppBar(title = { Text(text = "About Device")})

}

fun makeItems(): List<Pair<String,String>> {
    val platform = Platform()
    platform.logSystemInfo()
    return listOf(
        Pair("Device OS",platform.osName),
        Pair("Version OS",platform.osVersion),
        Pair("App Version",platform.appVersion),
        Pair("Device Mode",platform.deviceModel),
        Pair("Manufacturer",platform.manufacturer),
        Pair("Screen Density",platform.density.toString())
    )
}

@Composable
private fun ContentView(){
    val items = makeItems()
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items){
            RowView(title = it.first,subtitle = it.second)
        }
    }
}

@Composable
fun RowView(title: String, subtitle: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(Modifier.padding(10.dp)) {
            Text(text = title,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
            )
            Text(text = subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray,
            )
        }
        HorizontalDivider()
    }

}

@Preview
@Composable
private fun AboutPreview(){
    AboutScreen()
}