package com.example.navgraphcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navgraphcontroller.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val myNamber = args.number
       // val myCalor = args.calor
        binding.textView2.text = myNamber.toString()
       // binding.textView3.text = myCalor
        binding.btnToFirst.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment) }

    }


}

