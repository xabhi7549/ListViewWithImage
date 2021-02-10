package com.site_valley.listviewwithimage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var array: ArrayList<DataClass> = ArrayList()
    lateinit var rv:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv=findViewById(R.id.rv)
        addDataTo(array)
    }

    private fun addDataTo(array: ArrayList<DataClass>) {
        val data1=DataClass("Title1","subTitle1","https://www.attendit.net/images/easyblog_shared/July_2018/7-4-18/b2ap3_large_totw_network_profile_400.jpg")
        val data2=DataClass("Title2","subTitle2","https://www.attendit.net/images/easyblog_shared/July_2018/7-4-18/b2ap3_large_totw_network_profile_400.jpg")
        val data3=DataClass("Title3","subTitle3","https://www.attendit.net/images/easyblog_shared/July_2018/7-4-18/b2ap3_large_totw_network_profile_400.jpg")
        array.add(data1)
        array.add(data2)
        array.add(data3)
        showInView(array)
    }

    private fun showInView(arrayWithData: java.util.ArrayList<DataClass>) {
        val adapter=Adapter(this,arrayWithData)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter=adapter
    }

}