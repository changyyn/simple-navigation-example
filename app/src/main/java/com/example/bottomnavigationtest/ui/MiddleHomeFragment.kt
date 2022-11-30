package com.example.bottomnavigationtest.ui

import android.os.Bundle
import android.provider.DocumentsContract.Root
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationtest.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MiddleHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MiddleHomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var buttonToLast : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_middle_home, container, false)

        buttonToLast = root.findViewById(R.id.middle_button_to_last)
        buttonToLast.setOnClickListener {
            println("debug: it is working")
            findNavController().navigate(R.id.action_navigation_middle_to_navigation_last)
        }

        return root
    }


}