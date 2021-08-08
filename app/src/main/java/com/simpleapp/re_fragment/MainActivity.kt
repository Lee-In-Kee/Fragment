package com.simpleapp.re_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simpleapp.re_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var first: FirstFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFragment()

        binding.btnSend.setOnClickListener {
            first.setValue("크하하하")
        }
    }

    fun setFragment() {

        first = FirstFragment()

        val bundle = Bundle()
        bundle.putString("key1", "First")
        bundle.putInt("key2", 210807)
        first.arguments = bundle

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, first)
        transaction.commit()
    }

    fun goSecond() {

        val second = SecondFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, second)
        transaction.addToBackStack("back")
        transaction.commit()
    }

    fun goBack() {
        onBackPressed()
    }
}