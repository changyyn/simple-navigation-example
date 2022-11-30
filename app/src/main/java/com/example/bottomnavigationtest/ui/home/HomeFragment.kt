package com.example.bottomnavigationtest.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationtest.R
import com.example.bottomnavigationtest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var buttonFragmentMiddle : Button
    private lateinit var buttonFragmentLast : Button

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        buttonFragmentMiddle = root.findViewById(R.id.button_to_middle)
        buttonFragmentMiddle.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_navigation_middle)
        }

        buttonFragmentLast = root.findViewById(R.id.button_to_last)
        buttonFragmentLast.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_navigation_last)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}