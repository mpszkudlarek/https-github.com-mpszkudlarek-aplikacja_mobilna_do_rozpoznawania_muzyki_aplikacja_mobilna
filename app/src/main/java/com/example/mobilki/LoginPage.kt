package com.example.mobilki

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("test Credentials", "Username : $username and Password : $password")

        }

        fun onLoginTextClick(view: View) {
            // Intent to navigate to the login activity or perform any action
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }


}