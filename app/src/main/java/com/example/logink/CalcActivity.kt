package com.example.logink

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.logink.databinding.ActivityCalcBinding


class CalcActivity : AppCompatActivity() {

    private lateinit var buscar: ActivityCalcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        buscar = ActivityCalcBinding.inflate(layoutInflater)
        setContentView(buscar.root)

        val n1 = buscar.etNum1.text
        val n2 = buscar.etNum2.text

        buscar.btnSoma.setOnClickListener {
            if (n1.isEmpty() || n2.isEmpty()){
                Toast.makeText(this, "Penchant Todos os Campos", Toast.LENGTH_SHORT).show()
            }else {
                val valor = (n1.toString().toInt() + n2.toString().toInt())
                buscar.etResul.text = valor.toString()
            }
        }

        buscar.btnSub.setOnClickListener {
            if (n1.isEmpty() || n2.isEmpty()){
                Toast.makeText(this, "Penchant Todos os Campos", Toast.LENGTH_SHORT).show()
            }else {
                val valor = (n1.toString().toInt() - n2.toString().toInt())
                buscar.etResul.text = valor.toString()
            }
        }

        buscar.btnMul.setOnClickListener {
            if (n1.isEmpty() || n2.isEmpty()){
                Toast.makeText(this, "Penchant Todos os Campos", Toast.LENGTH_SHORT).show()
            }else {
                val valor = (n1.toString().toInt() * n2.toString().toInt())
                buscar.etResul.text = valor.toString()
            }
        }

        buscar.btnDiv.setOnClickListener {
            if (n1.isEmpty() || n2.isEmpty()){
                Toast.makeText(this, "Penchant Todos os Campos", Toast.LENGTH_SHORT).show()
            }else {
                val valor = (n1.toString().toInt() / n2.toString().toInt())
                buscar.etResul.text = valor.toString()
            }
        }

    }
}