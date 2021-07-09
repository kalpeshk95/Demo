package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: MyListAdapter

    private val list = mutableListOf<DataList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initView()

    }

    private fun initView() {

        listAdapter = MyListAdapter()
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(binding.recyclerView.context, RecyclerView.VERTICAL, false)
            this.adapter = listAdapter
        }

        var data = DataList("Alphabet", true)
        list.add(data)

        data = DataList("A", false)
        list.add(data)

        data = DataList("B", false)
        list.add(data)

        data = DataList("C", false)
        list.add(data)

        data = DataList("D", false)
        list.add(data)

        data = DataList("Number", true)
        list.add(data)

        data = DataList("1", false)
        list.add(data)

        data = DataList("2", false)
        list.add(data)

        data = DataList("3", false)
        list.add(data)

        data = DataList("4", false)
        list.add(data)

        listAdapter.setItems(list)

    }
}