package com.babitech.learnfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.babitech.learnfragment.MainActivity
import com.babitech.learnfragment.Movie
import com.babitech.learnfragment.MoviesAdapter
import com.babitech.learnfragment.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    val liste_element = ArrayList<Movie>()
    val display = ArrayList<Movie>()


    override fun onCreateView(@NonNull
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root:View = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerv = root.findViewById<RecyclerView>(R.id.my_recycler)

        liste_element.add(Movie(R.drawable.captain_marvel,"baba","23"))
        liste_element.add(Movie(R.drawable.captain_marvel,"bobo","29"))
        liste_element.add(Movie(R.drawable.captain_marvel,"bibi","0"))
        display.addAll(liste_element)

        val monad = MoviesAdapter(display)
        recyclerv.layoutManager = LinearLayoutManager(activity)
        recyclerv.adapter = monad

        return root
    }

}

/*
val recy =
    liste_element.add(Movie(R.drawable.captain_marvel,"baba","23"))
    liste_element.add(Movie(R.drawable.captain_marvel,"bobo","29"))
    liste_element.add(Movie(R.drawable.captain_marvel,"bibi","0"))
    display.addAll(liste_element)
    may_recycler.setOnClickListener {
        Toast.makeText(getActivity(),"Text!", Toast.LENGTH_SHORT).show();
    }

    val monad = MoviesAdapter(display)
    may_recycler.adapter = monad

*/