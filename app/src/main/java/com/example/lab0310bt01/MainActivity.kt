package com.example.lab0310bt01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab0310bt01.ui.theme.Lab0310bt01Theme

import android.animation.ObjectAnimator
import android.graphics.Color
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.graphics.drawable.AnimationDrawable
import android.widget.ImageView

import android.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val btnAnimateTransition = findViewById<Button>(R.id.btnAnimateTransition)
        btnAnimateTransition.setOnClickListener {
            // Bắt đầu hiệu ứng chuyển cảnh
            TransitionManager.beginDelayedTransition(constraintLayout)
            // Thay đổi vị trí và kích thước của button
            btnAnimateTransition.layoutParams.width = 500
            btnAnimateTransition.requestLayout()
        }
    }
}
