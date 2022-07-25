package com.app.asakatsuyaro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatingActionButton.setOnClickListener {
            Toast.makeText(this, "タップされました。", Toast.LENGTH_SHORT).show()
        }
    }
    val floatingActionButton = findViewById<FloatingActionButton>(R.id.floating_action_button)

// FloatingActionButtonに、タップイベントを追加

}