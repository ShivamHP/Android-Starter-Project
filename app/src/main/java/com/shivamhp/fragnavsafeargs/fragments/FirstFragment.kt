package com.shivamhp.fragnavsafeargs.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.shivamhp.fragnavsafeargs.R
import com.shivamhp.fragnavsafeargs.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFirstFragment.setOnClickListener {
            val navAction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(binding.textViewFirstFragment.text.toString())
            view.findNavController().navigate(navAction)
        }
    }
}