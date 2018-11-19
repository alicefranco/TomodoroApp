package br.pprojects.tomodoro.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import br.pprojects.tomodoro.fragments.CounterFragment
import br.pprojects.tomodoro.fragments.GenericPageFragment
import br.pprojects.tomodoro.models.Page
import java.util.*

class ScreenPagerAdapter(fragmentManager: FragmentManager, var pageList: ArrayList<Page>): FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        val page = pageList[position]
        when(position){
            0 -> return CounterFragment.newInstance(25L)
            1 -> return GenericPageFragment.newInstance(page)
            else -> return GenericPageFragment.newInstance(page)
        }
    }

    override fun getCount(): Int {
        return pageList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageList[position].title
    }
}