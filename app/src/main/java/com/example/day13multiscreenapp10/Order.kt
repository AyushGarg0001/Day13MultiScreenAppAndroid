package com.example.day13multiscreenapp10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day13multiscreenapp10.databinding.ActivityOrderBinding

class Order : AppCompatActivity() {

    private lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val orderOfCustomer= intent.getStringExtra(MainActivity.KEY)

        binding.tVOrder.text= "order Placed" + orderOfCustomer.toString()
    }
}