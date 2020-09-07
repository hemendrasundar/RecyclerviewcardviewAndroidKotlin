package com.hemendra.recyclerviewcardviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var datalist : ArrayList<RVdata> = ArrayList();
        datalist.add(RVdata("img1",R.drawable.img1))
        datalist.add(RVdata("img2",R.drawable.img2))
        datalist.add(RVdata("img3",R.drawable.img3))
        datalist.add(RVdata("img4",R.drawable.img4))
        datalist.add(RVdata("img5",R.drawable.img5))
        datalist.add(RVdata("img6",R.drawable.img6))
        datalist.add(RVdata("img7",R.drawable.img7))
        datalist.add(RVdata("img8",R.drawable.img8))
        datalist.add(RVdata("img9",R.drawable.img9))
        datalist.add(RVdata("img10",R.drawable.img10))


       // recyclerview.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)

        recyclerview.layoutManager = GridLayoutManager(this@MainActivity,2)
        recyclerview.adapter = RvAdapter(this,datalist)


    }
}