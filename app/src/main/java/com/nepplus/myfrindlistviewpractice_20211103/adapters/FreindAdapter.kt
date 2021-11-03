package com.nepplus.myfrindlistviewpractice_20211103.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        val data = mList[ position ]

        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtMale = row.findViewById<TextView>(R.id.txtMale)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)


        txtName.text = data.name
//        txtAge.text = data.birthYear.toString()
        txtMale.text = data.isMale.toString()
        txtAddress.text = data.address

        val age = 2021 - data.birthYear + 1
        txtAge.text = "(${age}"


        return  row


    }


}