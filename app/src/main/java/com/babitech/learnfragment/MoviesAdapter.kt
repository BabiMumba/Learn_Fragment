package com.babitech.learnfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_movie.view.*

class MoviesAdapter(private val movies : ArrayList<Movie>) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_movie, parent, false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val movie = movies[position]
        holder.titre.text = movie.title
        holder.type.text = movie.type
        holder.image.setImageResource(movie.image)

    }


    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titre: TextView = itemView.findViewById(R.id.textViewTitle)
        val type: TextView = itemView.findViewById(R.id.textViewType)
        val image:ImageView = itemView.findViewById(R.id.imageView)
    }
}