package com.simpleapp.re_fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simpleapp.re_fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    var mainActivity: MainActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mainActivity = context as MainActivity
    }

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.textF.text = arguments?.getString("key1")
        binding.textDate.text = "${arguments?.getInt("key2")}"

        binding.btnFirst.setOnClickListener {
            mainActivity?.goSecond()
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    fun setValue(value: String) {
        binding.textFromActivity.text = value
    }
}