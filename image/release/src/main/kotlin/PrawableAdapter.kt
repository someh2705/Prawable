package com.mafia.prawable.image.release

import android.graphics.BitmapFactory
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.mafia.prawable.image.config.DrawableConfig

object PrawableAdapter {

    @BindingAdapter("assetImage")
    @JvmStatic
    fun ImageView.setAssetImage(imageName: DrawableConfig) {
        val assets = context.assets
        val ip = assets.open("${imageName.name}.${imageName.prefix}")
        val bitmap = BitmapFactory.decodeStream(ip)
        setImageBitmap(bitmap)
    }
}
