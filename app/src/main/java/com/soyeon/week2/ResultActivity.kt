package com.soyeon.week2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    var result_id: TextView? = null
    var result_pw: TextView? = null
    var result_name: TextView? = null
    var result_major: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        result_id = findViewById(R.id.result_id) as TextView
        result_pw = findViewById(R.id.result_pw) as TextView
        result_name = findViewById(R.id.result_name) as TextView
        result_major = findViewById(R.id.result_major) as TextView

        result_id!!.setText(getIntent().getStringExtra("id"))
        result_pw!!.setText(getIntent().getStringExtra("pw"))
        result_name!!.setText(getIntent().getStringExtra("name"))
        result_major!!.setText(getIntent().getStringExtra("major"))

    }
}
