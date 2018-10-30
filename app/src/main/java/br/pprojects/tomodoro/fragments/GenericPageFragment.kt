package br.pprojects.tomodoro.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.pprojects.tomodoro.R
import br.pprojects.tomodoro.models.Page
import kotlinx.android.synthetic.main.fragment_screen_page.*

class GenericPageFragment: Fragment() {
    private var title: String? = null
    //private lateinit var image: Int
    companion object {
        fun newInstance(page: Page): GenericPageFragment {
            return GenericPageFragment().apply {
                this.title = page.title
                //this.image = page.image
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_screen_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_title.text = title
        //iv_avatar.setImageDrawable(image)
    }
}