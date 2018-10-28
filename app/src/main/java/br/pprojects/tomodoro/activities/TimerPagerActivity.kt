package br.pprojects.tomodoro.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerTabStrip
import android.support.v4.view.ViewPager
import br.pprojects.tomodoro.R
import br.pprojects.tomodoro.adapters.ScreenPagerAdapter
import br.pprojects.tomodoro.models.Page

class TimerPagerActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private var pages = arrayListOf<Page>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_pager)

        initPages()
        viewPager = findViewById(R.id.pager_main)
        viewPager.adapter = ScreenPagerAdapter(supportFragmentManager, pages)

    }

    fun initPages(){
        pages = arrayListOf(Page("Strawberry", resources.getDrawable(R.drawable.strawberry)),
                            Page("Lemon", resources.getDrawable(R.drawable.lemon)))
    }
}
