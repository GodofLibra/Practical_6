package com.example.practical_6_19012021095

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView


class ActivityLinear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
        val bottomNavBar = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        bottomNavBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.relative -> {
                    Intent(this, ActivityRelative::class.java).apply {
                        startActivity(this)
                    }
                    return@setOnItemSelectedListener true
                }
                R.id.constraint -> {
                    Intent(this, ActivityConstraint::class.java).apply {
                        startActivity(this)
                    }
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener true
                }
            }
        }
    }
    override fun onBackPressed() {
        finishAffinity()
        super.onBackPressed()
    }
}