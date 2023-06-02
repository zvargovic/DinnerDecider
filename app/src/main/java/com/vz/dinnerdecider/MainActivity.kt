package com.vz.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vz.dinnerdecider.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val  foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonads","Barrow Pizza")
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Primjer kako textu dodjeliti drugu vrijednost
        //this.binding.selectedFoodTxt.text = "Burger King"
        binding.decideBtn.setOnClickListener {
            val random = java.util.Random()
            val randomFood = random.nextInt(foodList.count())
            binding.selectedFoodTxt.text = foodList[randomFood]
        }
        binding.addFoodBtn.setOnClickListener {
            val newFood = binding.addFoodTxt.text.toString()
            foodList.add(newFood)
            binding.addFoodTxt.text.clear()
            println(foodList)
        }
    }
}