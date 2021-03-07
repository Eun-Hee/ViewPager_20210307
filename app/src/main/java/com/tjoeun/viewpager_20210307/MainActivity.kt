package com.tjoeun.viewpager_20210307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.viewpager_20210307.adapters.MainViewpagerAdepter

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewpagerAdepter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
}