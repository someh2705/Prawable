package com.mafia.prawable.image.debug

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.mafia.prawable.image.debug.R

object PrawableAdapter {

    @BindingAdapter("assetImage")
    @JvmStatic
    fun ImageView.setAssetImage(imageName: String) {
        val resId = R.drawable::class.java.getDeclaredField(imageName).getInt(null)
        setImageResource(resId)
    }
}