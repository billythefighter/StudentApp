package com.example.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.Adapter.PagerForumsAdapter
import com.example.myapplication.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_forums.*

class FragmentForums : Fragment() {

    private var tabLayout: TabLayout? = null

    companion object {
        fun newInstance(): FragmentHome{
            val fragment = FragmentHome()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val v: View = inflater.inflate(R.layout.fragment_forums, container, false)

        val vp: ViewPager = v.findViewById<View>(R.id.viewpager) as ViewPager
        tabLayout = v.findViewById<View>(R.id.tabs) as TabLayout

        setupViewPager(vp)
        return v
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = PagerForumsAdapter(activity?.supportFragmentManager)
        adapter.populateFragment(FragmentThreads(), "Threads")
        adapter.populateFragment(FragmentInspiration(), "Inspiration")
        viewPager.adapter = adapter
        tabLayout?.setupWithViewPager(viewPager)
    }


}