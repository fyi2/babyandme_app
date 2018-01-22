package com.ovia.hackathon.babyandme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
    }

    fun splash3(view: View) {
        val intent = Intent(this, Splash3Activity::class.java)
        startActivity(intent)
    }
}
