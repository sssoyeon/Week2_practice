package com.soyeon.week2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class SignUpActivity : AppCompatActivity() {
    var sign_id : EditText ?= null
    var sign_pw : EditText ?= null
    var sign_name : EditText ?= null
    var sign_major : EditText ?= null
    var submit : Button?= null
    var reset : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        sign_id = findViewById(R.id.sign_id) as EditText
        sign_pw = findViewById(R.id.sign_pwd) as EditText
        sign_name = findViewById(R.id.sign_name) as EditText
        sign_major = findViewById(R.id.sign_major) as EditText
        submit = findViewById(R.id.sign_submit) as Button
        reset = findViewById(R.id.sign_reset) as Button

        submit!!.setOnClickListener{
            var Intent = Intent(applicationContext, LoginActivity::class.java)
            Intent.putExtra("id", sign_id!!.text.toString())
            Intent.putExtra("pw", sign_pw!!.text.toString())
            Intent.putExtra("name", sign_name!!.text.toString())
            Intent.putExtra("major", sign_major!!.text.toString())
            startActivity(Intent)
        }

        reset!!.setOnClickListener{
            sign_id!!.text.clear()
            sign_pw!!.text.clear()
            sign_name!!.text.clear()
            sign_major!!.text.clear()
        }
    }
}
