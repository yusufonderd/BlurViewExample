package com.yonder.blurrecyclerview.adapter

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.yonder.blurrecyclerview.R
import eightbitlab.com.blurview.BlurView

/**
 * Created by Yusuf Önder on 26,March,2021
 */

class PhotoItemViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    var tvTitle : TextView = v.findViewById(R.id.tvTitle)
    var blurView : BlurView = v.findViewById(R.id.blurView)
    var blurViewRoot : ConstraintLayout = v.findViewById(R.id.blurViewRoot)

    fun bind(title : String){
        tvTitle.text = title
    }
}