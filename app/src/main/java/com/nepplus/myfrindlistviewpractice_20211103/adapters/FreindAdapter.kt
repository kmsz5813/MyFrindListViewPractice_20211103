package com.nepplus.myfrindlistviewpractice_20211103.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.myfrindlistviewpractice_20211103.R
import com.nepplus.myfrindlistviewpractice_20211103.datas.FreindData

class FreindAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<FreindData>) : ArrayAdapter<FreindData>( mContext, resId, mList ) {

        val mInflater =LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temRow = convertView
        if (temRow == null){
            temRow = mInflater.inflate(R.layout.friend_list_item, null)
        }

        val row = temRow!!

        return  row


    }


}