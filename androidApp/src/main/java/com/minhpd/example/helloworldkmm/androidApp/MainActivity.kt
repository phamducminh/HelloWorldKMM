package com.minhpd.example.helloworldkmm.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minhpd.example.helloworldkmm.shared.Greeting
import android.widget.TextView
import com.minhpd.example.helloworldkmm.shared.Platform

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
//        tv.text = greet()
        tv.text = "Hello World, ${Platform().platform}!"
    }
}
