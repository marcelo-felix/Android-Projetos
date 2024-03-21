package com.example.logink

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.logink.databinding.ActivityCalcBinding


class CalcActivity : AppCompatActivity() {

    private lateinit var buscar: ActivityCalcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buscar = ActivityCalcBinding.inflate(layoutInflater)
        setContentView(buscar.root)

        val n1 = buscar.etNum1.text
        val n2 = buscar.etNum2.text

        var resul = buscar.etResul.text

        buscar.btnSoma.setOnClickListener {
            if (n1.isEmpty() || n2.isEmpty()){
                Toast.makeText(this, "Penchant Todos os Campos", Toast.LENGTH_SHORT).show()
            }else {
                val valor = (n1.toString().toInt() + n2.toString().toInt())
                resul = valor.toString()

            }
        }

    }
}