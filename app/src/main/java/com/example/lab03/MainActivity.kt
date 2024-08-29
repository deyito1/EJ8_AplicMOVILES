package com.example.lab03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ej7_Lab03Theme {
                BusinessCard()
            }
        }
    }
}

// Definición de los colores
private val GreenAndroid = Color(0xFF3DDC84)
private val LightGreenBackground = Color(0xFFE0F2F1)
private val TextBlack = Color(0xFF000000)
private val TextGray = Color(0xFF757575)

// Definición de las tipografías
private val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = TextBlack,
        textAlign = TextAlign.Center
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = TextGray
    )
)

// Definición del tema de la aplicación
@Composable
fun Ej7_Lab03Theme(content: @Composable () -> Unit) {
    val colors = lightColorScheme(
        primary = GreenAndroid,
        background = LightGreenBackground,
        onBackground = TextBlack,
        onSurface = TextGray
    )

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}

// Composable para la tarjeta de presentación
@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Jennifer Doe",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Android Developer Extraordinaire",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Phone")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+11 (123) 444 555 666")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Twitter Handle")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@AndroidDev")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Email")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "jen.doe@android.com")
        }
    }
}

// Vista previa del composable
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Ej7_Lab03Theme {
        BusinessCard()
    }
}
