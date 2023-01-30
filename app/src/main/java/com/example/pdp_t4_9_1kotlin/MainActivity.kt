package com.example.pdp_t4_9_1kotlin

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var together: Button? = null
    private var bounce: Button? = null
    private var sequential: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bounce = findViewById(R.id.id_bounce)
        sequential = findViewById(R.id.id_sequential)
        together=findViewById(R.id.id_together)
        textView=findViewById(R.id.text)

        clickButton()
    }

    private fun clickButton() {
        bounce?.setOnClickListener(View.OnClickListener {
            val  animation = AnimationUtils.loadAnimation(applicationContext,R.anim.bounce)
            textView?.startAnimation(animation)
        })
        together?.setOnClickListener(View.OnClickListener {
            val  animation = AnimationUtils.loadAnimation(applicationContext,R.anim.together)
            textView?.startAnimation(animation)
        })
        sequential?.setOnClickListener(View.OnClickListener {
            val  animation = AnimationUtils.loadAnimation(applicationContext,R.anim.sequential)
            textView?.startAnimation(animation)
        })

    }
}