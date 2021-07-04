package com.jkdajac.socialmediapage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registry.*

class RegistryActivity : AppCompatActivity() {
    val loginValid : String = "Tom"
    val passwordValid : String = "1989"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registry)

        btEnter.setOnClickListener {
            var login: String = etLogins.text.toString()
            var password: String = etPassword.text.toString()

            if (login.equals(loginValid) && password.equals(passwordValid)){
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                tvInfoRegistry.text = " Invalid login or password "
            }
        }

    }
}