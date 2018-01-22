package com.ovia.hackathon.babyandme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash6)
    }

    fun splash7(view: View){
        val intent = Intent(this, Splash7Activity::class.java)
        startActivity(intent);
        finish()
    }

    fun splash8(view: View){
        val intent = Intent(this, Splash7Activity::class.java)
        startActivity(intent);
        finish()
    }
}
