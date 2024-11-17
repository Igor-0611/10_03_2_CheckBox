package com.example.a10_03_2_checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var boxTV: TextView
    private lateinit var boxCB: CheckBox
    private lateinit var infoTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        boxTV = findViewById(R.id.boxTV)
        boxCB = findViewById(R.id.boxCB)
        infoTV = findViewById(R.id.infoTV)

        boxCB.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                boxTV.text = resources.getString(R.string.title_text_new)
                infoTV.text = resources.getString(R.string.info_text)
            }
            else {
                boxTV.text = resources.getString(R.string.title_text)
                infoTV.text = ""
            }
        }
    }
}
