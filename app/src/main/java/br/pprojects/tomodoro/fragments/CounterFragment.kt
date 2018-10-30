package br.pprojects.tomodoro.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.pprojects.tomodoro.R
import kotlinx.android.synthetic.main.fragment_counter.*

class CounterFragment: Fragment() {
    private val s = 1000L
    private val milliS = 1L
    private var time: Long = 0
    private val startTime = 30*s
    private lateinit var counter: CountDownTimer

    companion object {
        fun newInstance(time: Long): CounterFragment {
            return CounterFragment().apply {
                this.time = time
                //iv_avatar.setImageDrawable(screenImage)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_start?.setOnClickListener{
            counter = object: CountDownTimer(startTime, s){
                override fun onTick(millisUntilFinished: Long) {
                    tv_counter?.setText((millisUntilFinished / 1000).toString())
                }

                override fun onFinish() {
                    tv_counter?.setText("done!")
                }
            }.start()
        }

        btn_stop?.setOnClickListener {
            counter.cancel()
//            counter = object: CountDownTimer(startTime, s){
//                override fun onTick(millisUntilFinished: Long) {
//                    tv_counter?.setText((millisUntilFinished / 1000).toString())
//                }
//
//                override fun onFinish() {
//                    tv_counter?.setText("done!")
//                }
//            }.start()
        }

    }


    private fun startClock(){}

    private fun stopClock(){}

}