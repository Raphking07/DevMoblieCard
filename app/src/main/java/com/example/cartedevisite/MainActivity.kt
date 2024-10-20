// MainActivity.kt
package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardApp()
        }
    }
}

@Composable
fun BusinessCardApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                UserInfo()
                Spacer(modifier = Modifier.height(48.dp))
                ContactInfo()
            }
        }
    }
}

@Composable
fun UserInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logo Android",
            modifier = Modifier.size(120.dp)
        )
        Text(
            text = "N'GUESSAN Aka Aman Raphaël",
            fontSize = 25.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Informaticien",
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp, top = 8.dp)
        )
    }
}

@Composable
fun ContactInfo() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.width(185.dp),  
            horizontalAlignment = Alignment.Start
        ) {
            ContactRow(
                icon = Icons.Default.Phone,
                text = "+225 07 78 99 99 12"
            )
            ContactRow(
                icon = Icons.Default.Share,
                text = "@Raphkingaka"
            )
            ContactRow(
                icon = Icons.Default.Email,
                text = "raphking@gmail.com"
            )
        }
    }
}

@Composable
fun ContactRow( icon: androidx.compose.ui.graphics.vector.ImageVector, text: String )
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier.width(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black,
            )
        }
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = text,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCardApp()
}