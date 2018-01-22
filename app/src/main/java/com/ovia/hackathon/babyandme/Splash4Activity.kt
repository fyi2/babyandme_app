package com.ovia.hackathon.babyandme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash4)
    }

    fun splash5(view: View){
        val intent = Intent(this, Splash5Activity::class.java)
        startActivity(intent);
        finish()
    }
}
