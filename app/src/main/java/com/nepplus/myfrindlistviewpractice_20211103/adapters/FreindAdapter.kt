package com.nepplus.myfrindlistviewpractice_20211103.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.myfrindlistviewpractice_20211103.datas.FreindData

class FreindAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<FreindData>) : ArrayAdapter<FreindData>(  ) {
}