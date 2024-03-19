package com.example.logink

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.logink.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var busca:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        busca = ActivityMainBinding.inflate(layoutInflater)
        setContentView(busca.root)

        busca.btnEnt.setOnClickListener {
            if (busca.inpEmail.text.toString() == "" && busca.inpPasswd.text.toString() == "") run {
                Toast.makeText(this, "Penchant Todos os Campos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}