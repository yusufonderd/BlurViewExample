package com.yonder.blurrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.recyclerview.widget.RecyclerView
import com.yonder.blurrecyclerview.R
import eightbitlab.com.blurview.RenderScriptBlur

/**
 * Created by Yusuf Önder on 26,March,2021
 */
private const val BLUR_RADIUS = 20F

class PhotosRecyclerViewAdapter(private val titles: List<String>) :
    RecyclerView.Adapter<PhotoItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_photo, parent, false)
        return PhotoItemViewHolder(view).also { viewHolder ->
            viewHolder.blurView.apply {
                outlineProvider = ViewOutlineProvider.BACKGROUND
                clipToOutline = true

                setupWith(parent)
                    .setBlurAlgorithm(RenderScriptBlur(viewHolder.clRoot.context))
                    .setBlurRadius(BLUR_RADIUS)
                    .setHasFixedTransformationMatrix(false)
            }
        }
    }

    override fun onBindViewHolder(holderItem: PhotoItemViewHolder, position: Int) {
        holderItem.bind(titles[position])
    }

    override fun getItemCount() = titles.size
}