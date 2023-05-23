package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private val LOG_TAG = "LOG_TAG::" + FirstActivity::class.java.simpleName

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "---FirstActivity----");
        Log.d(LOG_TAG, "onCreate");
        setContentView(R.layout.activity_first)
        initUI()
    }

    private fun initUI() {
        val btnStartSecondActivity = findViewById<Button>(R.id.btn_start_second_activity)
        btnStartSecondActivity.setOnClickListener {
            Log.d(LOG_TAG, "btn_start_second_activity clicked!")
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause");
    }


    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart");
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy");
        Log.d(LOG_TAG, "---FirstActivity onDestroy----");

    }
}