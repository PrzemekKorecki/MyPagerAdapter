package com.example.mypageradapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagerAdapter(fm: FragmentManager, private val numberOfFrags: Int): FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment? {
        when(position){
            0 -> return Frag1()
            1 -> return Frag2()
            2 -> return Frag3()
        }
         return null
    }

    override fun getCount(): Int {
        return numberOfFrags
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Frag1"
            1 -> return "Frag2"
            2 -> return "Frag3"
        }
        return super.getPageTitle(position)
    }
}