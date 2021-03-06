package com.achsan_18102146.praktikum4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Practice5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5)

        btnProdi.setOnClickListener {
            val namaProdi = inputProdi.text.toString()
            if (namaProdi.isEmpty()) {
                inputProdi.error = "Prodi Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val moveWithDataIntent = Intent(this@Practice5Activity, Practice5ReadDataActivity::class.java)
            moveWithDataIntent.putExtra(Practice5ReadDataActivity.EXTRA_PRODI, namaProdi)
            startActivity(moveWithDataIntent)
        }
    }
}