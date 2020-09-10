package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            this.window.statusBarColor = resources.getColor(R.color.colorPrimary, null)
        }
    }

    fun goHome(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}