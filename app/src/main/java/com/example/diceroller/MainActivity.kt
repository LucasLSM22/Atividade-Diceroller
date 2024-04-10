package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener { rollDice()


    }

}

    private fun rollDice() {
    val dice = Diceroller(6)
    val diceRoll = dice.roll()
    val diceImage: ImageView = findViewById(R.id.imageView)

    when (diceRoll) {
        1 -> diceImage.setImageResource(R.drawable.d1)
        2 -> diceImage.setImageResource(R.drawable.d2)
        3 -> diceImage.setImageResource(R.drawable.d3)
        4 -> diceImage.setImageResource(R.drawable.d4)
        5 -> diceImage.setImageResource(R.drawable.d5)
        6 -> diceImage.setImageResource(R.drawable.d6)
    }

    val sortRoll = dice.roll()
    val sortTextView: TextView = findViewById(R.id.luckyNumber)
    val txtResultado: TextView = findViewById(R.id.txtRes)

    sortTextView.text = sortRoll.toString();
//Exibição de resultados
    if( diceRoll == sortRoll){
        txtResultado.setText("Você ganhou pontos!")
    }else{
        txtResultado.setText("Você perdeu! Tente novamente.")
    }
}
}//Feito por Lucas - 3º DS