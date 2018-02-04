package com.naco3x.githubtest01.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.naco3x.githubtest01.R
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        txt_Lbl1.text = "Por fin!!! New Activity is HERE!!!"
    }
}
