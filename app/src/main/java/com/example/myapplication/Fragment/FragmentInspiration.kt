package com.example.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class FragmentInspiration : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_inspiration, container, false)

        return v
    }

    companion object {
        fun newInstance(): FragmentHome{
            val fragment = FragmentHome()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }

    }
}