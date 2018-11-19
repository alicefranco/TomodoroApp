package br.pprojects.tomodoro.fragments

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.pprojects.tomodoro.R
import kotlinx.android.synthetic.main.fragment_counter.*
import java.util.*

class CounterFragment: Fragment() {
    private val s = 1000L
    private val m = 60L*s

    private val milliS = 1L
    //private val startTime = 25*s
    private val startTime = 2*m

    //private var time = Date()

    private lateinit var counter: CountDownTimer

    companion object {
        fun newInstance(min: Long): CounterFragment {
            return CounterFragment().apply {
                //this.time = time
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
                    var paceSec = millisUntilFinished / s
                    var paceMin = millisUntilFinished / m
                    //todo contar em min
                    tv_counter_seg?.setText((paceSec).toString())
                    tv_counter_min?.setText((paceMin).toString())
                    //tv_counter_min?.setText((paceSec).)
                    //pb_clock.setProgress(paceSec.toInt())
                }

                override fun onFinish() {
                    //todo contar em min
                    //tv_counter?.setText("done!")
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