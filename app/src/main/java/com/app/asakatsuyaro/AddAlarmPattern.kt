package com.app.asakatsuyaro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AddAlarmPattern: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_alarm_pattern)
    }


    fun registerButtonOnClick(view: View) {
//        Toast.makeText(this, "タップされました。", Toast.LENGTH_SHORT).show()
        val intent = Intent(applicationContext, SetAlarmPattern::class.java)
        startActivity(intent)
    }


}