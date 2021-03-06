package com.tjoeun.viewpager_20210307.adapters

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.viewpager_20210307.fragments.BirthFragment
import com.tjoeun.viewpager_20210307.fragments.DescFragment
import com.tjoeun.viewpager_20210307.fragments.NickFragment
import java.text.FieldPosition

class MainViewpagerAdepter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount() : Int {

        return 3
    }

    override fun getItem(position: Int) : FragmentManager {
        if (position == 0 ) {
            return NickFragment
        }
        else if (position == 1 ) {
            return BirthFragment
        }
        else {
            return DescFragment
        }

}