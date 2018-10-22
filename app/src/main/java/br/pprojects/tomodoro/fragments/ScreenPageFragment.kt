package br.pprojects.tomodoro.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.pprojects.tomodoro.R
import kotlinx.android.synthetic.main.fragment_screen_page.*

class ScreenPageFragment: Fragment() {
    private var title: String? = null
    private lateinit var image: Drawable
    companion object {
        fun newInstance(title: String, image: Drawable): ScreenPageFragment {
            return ScreenPageFragment().apply {
                this.title = title
                this.image = image
                //iv_avatar.setImageDrawable(screenImage)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_screen_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_title.text = title
        iv_avatar.setImageDrawable(image)
    }
}