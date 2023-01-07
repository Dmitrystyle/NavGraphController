package com.example.navgraphcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
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

        val supportFragmentManager = requireActivity().supportFragmentManager

        // we have to implement setFragmentResultListener
        supportFragmentManager.setFragmentResultListener(
            "REQUEST_KEY",
            viewLifecycleOwner
        ) { resultKey, bundle ->
            if (resultKey == "REQUEST_KEY") {
                val date = bundle.getString("SELECTED_DATE")

                binding.textTimeFirst.text = date
            }
        }

        supportFragmentManager.setFragmentResultListener(
            "REQUEST_KEY1",
            viewLifecycleOwner
        ) {resultKey, bundle ->
            if (resultKey == "REQUEST_KEY1") {
                val time = bundle.getString("SELECTED_DATE1")
                binding.textTime.text=time
            }
        }



        binding.textView.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(22)

            Navigation.findNavController(view).navigate(action) }



    }


}