package com.mine.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mine.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val mvm = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.number.text = mvm.getInitialCounter().toString()


        binding.countdownPlus.setOnClickListener{

            binding.number.text = mvm.getCounterPlus().toString()
        }

        binding.countdownMinus.setOnClickListener{

            binding.number.text = mvm.getCounterMinus().toString()
        }

    }
}