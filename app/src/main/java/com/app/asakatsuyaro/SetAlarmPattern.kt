package com.app.asakatsuyaro

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SetAlarmPattern : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun floatingActionButtonClick(view: View) {
        Toast.makeText(this, "タップされました。", Toast.LENGTH_SHORT).show()
//        val intent = Intent(applicationContext, AddAlarmPattern::class.java)
//        startActivity(intent)
    }
}