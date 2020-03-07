package com.example.sekolahku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var email = ""
    var pass = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            email = edt_email.text.toString()
            pass = edt_pass.text.toString()

            checkLogin(email, pass)
        }
    }

    fun checkLogin(email: String, pass: String) {
        if (email.equals("akil") && pass.equals("123")) {
            showToast("Login Berhasil")
        } else {
            showToast("Login gagal")
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(
            this,
            msg,
            Toast.LENGTH_SHORT).show()
    }

}
