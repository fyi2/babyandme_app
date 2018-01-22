package com.ovia.hackathon.babyandme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash8)
    }

    fun splash9(view: View){
        val intent = Intent(this, Splash9Activity::class.java)
        startActivity(intent);
        finish()
    }
}
