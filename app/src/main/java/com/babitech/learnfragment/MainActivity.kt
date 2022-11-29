package com.babitech.learnfragment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.babitech.learnfragment.fragment.HomeFragment
import com.babitech.learnfragment.fragment.MenuFragment
import com.babitech.learnfragment.fragment.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragmant(HomeFragment())

        bottom_nav.selectedItemId = R.id.home

        bottom_nav.setOnNavigationItemSelectedListener { menuitem ->
            when (menuitem.itemId) {
                R.id.menu -> loadFragmant(MenuFragment())
                R.id.search -> loadFragmant(SearchFragment())
                R.id.home -> loadFragmant(HomeFragment())

            }
            true
        }


    }
    private fun loadFragmant(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayour,fragment)
            commit()
        }

}
