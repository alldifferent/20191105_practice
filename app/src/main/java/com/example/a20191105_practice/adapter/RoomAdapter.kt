package com.example.a20191105_practice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.a20191105_practice.R
import com.example.a20191105_practice.datas.RoomData

class RoomAdapter(context: Context, resource: Int, list: ArrayList<RoomData>) :ArrayAdapter<RoomData>(context, resource, list) {

    var mContext: Context? = null
    var mList: ArrayList<RoomData>? = null
    var inf: LayoutInflater? = null

    init {
        mContext = context
        mList = list
        inf = LayoutInflater.from(mContext)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var row = convertView
        if (row == null){
            row = inf?.inflate(R.layout.room_list_item, parent,false)
        }

        var roomData = mList?.get(position)

        var priceTxt = row?.findViewById<TextView>(R.id.priceTxt)
        var adressTxt = row?.findViewById<TextView>(R.id.adressTxt)

        priceTxt?.text = roomData?.price.toString()
        adressTxt?.text = "${roomData?.address}, ${roomData?.floor}"

        return row!!
    }

}