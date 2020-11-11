package com.achsan_18102146.praktikum4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Practice5ReadDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_read_data)


        val lblProdiSaya: TextView = findViewById(lblProdiSaya)
        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }


     companion object {
            const val EXTRA_PRODI = "extra_prodi"
        }
    }


