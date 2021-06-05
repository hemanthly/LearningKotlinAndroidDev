package com.hemanthly.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.hemanthly.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       // binding.rollText.text = "hemanth"
        binding.rollButton.setOnClickListener{
//            Toast.makeText(this,"Hey , welcome ",Toast.LENGTH_SHORT).show()
//            binding.rollText.text = "Dice Rolled"
            rolldice()
        }
    }

    private fun rolldice() {
        val randomInt = Random.nextInt(6) + 1
        binding.rollText.text = randomInt.toString()
        val drawableResource = when(randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        binding.diceImage.setImageResource(drawableResource)

    }
}

