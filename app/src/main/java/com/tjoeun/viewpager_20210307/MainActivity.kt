package com.tjoeun.viewpager_20210307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.viewpager_20210307.adapters.MainViewpagerAdepter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewpagerAdepter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    private fun setupEvents() {

    }

    private fun setValues() {

        mvpa = MainViewpagerAdepter(supportFragmentManager)

        mainViewpager.adapter = mvpa

//        xml에 배치한 탭레이아웃과, 뷰페이저 연결
        tabLayout.setupWithViewPager(mainViewpager)

    }

}