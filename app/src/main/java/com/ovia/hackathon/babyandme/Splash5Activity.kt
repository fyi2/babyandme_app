package com.ovia.hackathon.babyandme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash5)
    }

    fun splash6(view: View){
        val intent = Intent(this, Splash6Activity::class.java)
        startActivity(intent);
        finish()
    }
}
