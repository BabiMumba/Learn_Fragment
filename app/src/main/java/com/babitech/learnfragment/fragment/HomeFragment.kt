package com.babitech.learnfragment.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.babitech.learnfragment.MainActivity
import com.babitech.learnfragment.Movie
import com.babitech.learnfragment.MoviesAdapter
import com.babitech.learnfragment.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    val liste_element = ArrayList<Movie>()
    val display = ArrayList<Movie>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        liste_element.add(Movie(R.drawable.captain_marvel,"baba","23"))
        liste_element.add(Movie(R.drawable.captain_marvel,"bobo","29"))
        liste_element.add(Movie(R.drawable.captain_marvel,"bibi","0"))
        display.addAll(liste_element)
        val monad = MoviesAdapter(display)
        may_recycler.layoutManager = LinearLayoutManager(activity)
        may_recycler.adapter = monad

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}