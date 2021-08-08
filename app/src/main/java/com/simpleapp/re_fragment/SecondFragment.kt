package com.simpleapp.re_fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simpleapp.re_fragment.databinding.FragmentFirstBinding
import com.simpleapp.re_fragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    var mainActivity: MainActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mainActivity = context as MainActivity
    }

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.btnSecond.setOnClickListener {
            mainActivity?.goBack()
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}