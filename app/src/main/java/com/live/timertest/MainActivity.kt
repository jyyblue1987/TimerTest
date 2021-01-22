package com.live.timertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.concurrent.schedule

open class MainActivity : AppCompatActivity() {
    var mDelay: Long = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEvent()
    }

    fun initEvent() {
        val btnRun = findViewById<Button>(R.id.btn_run)
        btnRun.setOnClickListener {
            runTimer(3000)
        }
    }

    fun runTimer(delay: Long) {
        var st: Long = System.currentTimeMillis()
        Timer("SettingUp", false).schedule(delay) {
            var et: Long = System.currentTimeMillis()

            mDelay = et - st
            var flag = mDelay > delay
            displayResult(flag)
        }
    }

    fun runMyTimer(delay: Long) : Long {
        var st: Long = System.currentTimeMillis()

        val handler = object: onListener {
            override fun onComplete() {

            }
        }
        MyTimer("SettingUp", false).schedule(delay, handler)

        var et1: Long = System.currentTimeMillis()

        return et1 - st
    }

    fun displayResult(flag: Boolean) {
        runOnUiThread {
            var txtResult = findViewById<TextView>(R.id.txt_result)

            var text1: String = "True"
            if( flag == false )
                text1 = "False"

            txtResult.setText(text1)
        }
    }
}