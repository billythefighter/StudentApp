package com.example.myapplication.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.ReportBullyActivity
import kotlinx.android.synthetic.main.fragment_home.*


class FragmentHome : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_home, container, false)

        val reportBully: Button = v.findViewById<View>(R.id.report_bully) as Button
        reportBully?.setOnClickListener {
            val intent = Intent (activity, ReportBullyActivity::class.java)
            startActivity(intent)
        }
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