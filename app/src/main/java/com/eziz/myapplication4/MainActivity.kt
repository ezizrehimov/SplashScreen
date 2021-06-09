package com.eziz.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = 10000
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)
        val animation3 = AnimationUtils.loadAnimation(this, R.anim.animation3)

        val imageView = imageView
        val imageView2 = imageView2
        val title = textView
        val text = textView2

        imageView.animation = animation1
        imageView2.animation = animation2
        title.animation = animation3
        text.animation = animation3


        Handler().postDelayed({
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())
    }
}