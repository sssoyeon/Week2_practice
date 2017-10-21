package com.soyeon.week2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    var id: EditText? = null
    var pw: EditText? = null
    var login: Button? = null
    var signUp: Button? = null
    var get_id: String? = null
    var get_pw: String? = null
    var get_name: String? = null
    var get_major: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login = findViewById(R.id.log_login) as Button
        signUp = findViewById(R.id.log_signup) as Button
        id = findViewById(R.id.log_id_et1) as EditText //id
        pw = findViewById(R.id.log_id_et2) as EditText //pw

        login!!.setOnClickListener {
            if (intent.extras == null) {
                //intent가 비어 있다는 것은 가입조차 상태
                Toast.makeText(applicationContext, "등록된 정보가 없습니다.", Toast.LENGTH_SHORT).show()
            } else {
                get_id = getIntent().getStringExtra("id")
                get_pw = getIntent().getStringExtra("pw")
                get_name = getIntent().getStringExtra("name")
                get_major = getIntent().getStringExtra("major")

                if (!id!!.text.toString().equals(get_id))
                    Toast.makeText(applicationContext, "입력하신 Id와 일치하는 정보가 습니다", Toast.LENGTH_SHORT).show();
                else if (!pw!!.text.toString().equals(get_pw))
                    Toast.makeText(applicationContext, "입력하신 Pw와 일치하는 정보가 습니다", Toast.LENGTH_SHORT).show();
                else {
                    var Intent = Intent(applicationContext, ResultActivity::class.java)
                    Intent!!.putExtra("id", get_id)
                    Intent!!.putExtra("pw", get_pw)
                    Intent!!.putExtra("name", get_name)
                    Intent!!.putExtra("major", get_major)
                    startActivity(Intent)
                }
            }

        }

        signUp!!.setOnClickListener {
            var Intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(Intent)
        }

    }
}
