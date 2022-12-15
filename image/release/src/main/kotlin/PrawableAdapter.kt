package com.mafia.prawable.image.release

import android.graphics.BitmapFactory
import android.widget.ImageView
import androidx.databinding.BindingAdapter

object PrawableAdapter {

    @BindingAdapter("assetImage")
    @JvmStatic
    fun ImageView.setAssetImage(imageName: DrawableConfig) {
        val assets = context.assets
        val ip = assets.open("${imageName.name}.webp")
        val bitmap = BitmapFactory.decodeStream(ip)
        setImageBitmap(bitmap)
    }
}
