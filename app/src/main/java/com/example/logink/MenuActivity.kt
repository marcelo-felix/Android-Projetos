package com.example.logink

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.logink.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var buscar: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        buscar = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(buscar.root)

        buscar.btnCalc.setOnClickListener {
            val intent = Intent(this, CalcActivity::class.java)
            startActivity(intent)
        }


    }
}

