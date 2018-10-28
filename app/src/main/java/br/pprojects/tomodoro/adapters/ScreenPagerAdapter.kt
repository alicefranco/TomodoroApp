package br.pprojects.tomodoro.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import br.pprojects.tomodoro.fragments.CounterFragment
import br.pprojects.tomodoro.fragments.ScreenPageFragment
import br.pprojects.tomodoro.models.Page

class ScreenPagerAdapter(fragmentManager: FragmentManager, var pageList: ArrayList<Page>): FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        val page = pageList[position]
        when(position){
            1 -> return CounterFragment.newInstance(60)
            2 -> return ScreenPageFragment.newInstance(page.title, page.image)
            else -> return  ScreenPageFragment.newInstance(page.title, page.image)
        }
    }

    override fun getCount(): Int {
        return pageList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageList[position].title
    }
}