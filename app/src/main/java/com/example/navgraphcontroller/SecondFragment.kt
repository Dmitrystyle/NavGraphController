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
    //lateinit var binding: FragmentSecondBinding
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!


    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentSecondBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myNamber = args.number
       // val myCalor = args.calor
        binding.textView2.text = myNamber.toString()
       // binding.textView3.text = myCalor
        binding.btnToFirst.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment) }

//_____________add time module_____________
    _binding= FragmentSecondBinding.bind(view)
        binding.btnTime.setOnClickListener{
            val datePickerFragment = DatePickerFragment()
            val supportFragmentManager = requireActivity().supportFragmentManager
            // show
            datePickerFragment.show(supportFragmentManager, "DatePickerFragment")
        }


        binding.button3.setOnClickListener{
            val timePickerFragment = TimePikerFragment()
            val supportFragmentManager = requireActivity().supportFragmentManager
            // show
            timePickerFragment.show(supportFragmentManager, "TimePikerFragment")
        }




    }

   override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

