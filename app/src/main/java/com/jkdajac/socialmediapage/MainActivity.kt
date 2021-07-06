package com.jkdajac.socialmediapage

import android.R.attr.data
import android.content.Intent
import android.graphics.*
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_more_tom_johns.*
import java.io.FileNotFoundException
import java.io.InputStream


class MainActivity : AppCompatActivity() {

    val PICK_IMAGE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = intent.getStringExtra("name")
        tvNameAvatar.text = message

        val messageTwo = intent.getStringExtra("Surname")
        tvSurnameAvatar.text = messageTwo



        tvMoreTom.setOnClickListener {
            var intent = Intent(this, MoreTomJohns::class.java)
            startActivity(intent)
        }

        ivAvatar.setOnClickListener{
            val intent = Intent()
            intent.setType("image/*")
            intent.setAction(Intent.ACTION_GET_CONTENT)
            startActivityForResult(Intent.createChooser(intent, "Select image"), PICK_IMAGE)

        }


    }
}

