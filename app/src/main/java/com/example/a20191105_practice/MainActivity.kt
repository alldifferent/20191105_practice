package com.example.a20191105_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191105_practice.adapter.RoomAdapter
import com.example.a20191105_practice.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var roomList = ArrayList<RoomData>()
    var roomAdapter:RoomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setData()
        roomAdapter = RoomAdapter(this, R.layout.room_list_item, roomList)
        lv_room.adapter = roomAdapter
    }

    fun sum(num1: Int, num2: Int) = num1 + num2

    private fun setData(){

        var room1 = RoomData()
        room1.price = 8000
        room1.address = "마포구 서교동"
        room1.floor = 1

        var room2 = RoomData()
        room2.price = 28000
        room2.address = "마포구 서교동"
        room2.floor = 3

        var room3 = RoomData()
        room3.price = 12000
        room3.address = "마포구 성산동"
        room3.floor = 5

        roomList.add(room1)
        roomList.add(room2)
        roomList.add(room3)

        var room4 = RoomData(12000,"마포구 망원1동", 3)
        roomList.add(room4)

        roomList.add(RoomData(15000, "마포구 망원동", 2))

        roomList.add(RoomData("은평구 불광동"))

    }
}
