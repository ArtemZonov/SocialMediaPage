package com.jkdajac.socialmediapage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_more_tom_johns.*

class MoreTomJohns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_tom_johns)

        val ages = resources.getStringArray(R.array.age)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinAge)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, ages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MoreTomJohns, "Position = " + position,
                                                                         Toast.LENGTH_SHORT).show();
                    tvAgeMoreTom.text = position.toString();
                }

                override fun onNothingSelected(parent: AdapterView<*>) {

                }

            }

        }



        btChName.setOnClickListener {
            tvNameMoreTom.text = etNameMoreTom.text

        }
        btChSurname.setOnClickListener {
            tvSurnameMoreTom.text = etSurnameMoreTome.text
            //tvSurnameAvatar.text = etSurnameMoreTome.text
        }

         fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent?) {
             super.onActivityResult(requestCode, resultCode, data)
                if(requestCode == 1){
                     tvNameAvatar.text = data.toString()
}
         }
        tvNameMoreTom.setOnClickListener {
            var intent = Intent (this, MainActivity:: class.java)
            intent.putExtra("name", etNameMoreTom.text.toString())
            startActivityForResult(intent,1)

        }

        tvSurnameMoreTom.setOnClickListener {
            var intent = Intent (this, MainActivity:: class.java)
            intent.putExtra("Surname", etSurnameMoreTome.text.toString())
            startActivityForResult(intent,2)

        }
    }


}


