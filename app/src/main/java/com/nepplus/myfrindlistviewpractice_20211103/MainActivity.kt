package com.nepplus.myfrindlistviewpractice_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.nepplus.myfrindlistviewpractice_20211103.adapters.FreindAdapter
import com.nepplus.myfrindlistviewpractice_20211103.datas.FreindData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mFriendList = ArrayList<FreindData>()
    lateinit var mFreindAdapter: FreindAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFriendList.add( FreindData("김민성",1998,"서울시 도봉구 창2동",true) )
        mFriendList.add( FreindData("박유화",1999,"서울시 도봉구 창2동",false) )
        mFriendList.add( FreindData("윤혁진",1996,"경기 의정부",true) )
        mFriendList.add( FreindData("김다운",1997,"서울시 도봉구 창3동",false) )
        mFriendList.add( FreindData("안수현",1995,"경기 양주",false) )
        mFriendList.add( FreindData("유현식",1998,"서울시 도봉구 쌍문동",true) )
        mFriendList.add( FreindData("김태윤",1990,"서울시 도봉구 쌍문동",true) )
        mFriendList.add( FreindData("조성주",1998,"서울시 도봉구 쌍문동",true) )

        mFreindAdapter = FreindAdapter(this, R.layout.friend_list_item, mFriendList)
        myFriendsListView.adapter = mFreindAdapter

        myFriendsListView.setOnItemClickListener { parent, view, position, id ->

            Log.d("리스트뷰클릭","${position}번 줄 클릭됨")
            
            val clickedFrirend = mFriendList[position]

            Toast.makeText(this, "${clickedFrirend.name}이(가) 클릭됨", Toast.LENGTH_SHORT).show()

        }

    }
}