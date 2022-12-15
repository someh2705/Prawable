package com.mafia.prawable.image.debug

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.mafia.prawable.image.config.DrawableConfig
import com.mafia.prawable.image.debug.R.*

object PrawableAdapter {

    @BindingAdapter("assetImage")
    @JvmStatic
    fun ImageView.setAssetImage(imageName: DrawableConfig) {
        val resId = R.drawable::class.java.getDeclaredField(imageName.name).getInt(null)
        setImageResource(resId)
    }
}