package com.example.birthdaycard
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
//        makeText(this, "Happy Birthday $name ", LENGTH_LONG).show()
        //Toast.makeText(applicationContext,  "Button was clicked ", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)

    }
}