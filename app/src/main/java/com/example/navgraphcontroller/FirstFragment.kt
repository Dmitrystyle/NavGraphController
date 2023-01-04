package com.example.navgraphcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navgraphcontroller.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

     //val chislo:String="chislo"

        binding.button.setOnClickListener{

        }
        binding.textView.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(22)

            Navigation.findNavController(view).navigate(action) }

    }


}