import android.graphics.BitmapFactory
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import androidx.viewbinding.BuildConfig
import com.mafia.prawable.image.R

object PrawableAdapter {

    @BindingAdapter("assetImage")
    @JvmStatic
    fun ImageView.setAssetImage(imageName: String) {
        when (BuildConfig.DEBUG) {
            true -> {
                @DrawableRes val resId =
                    R.drawable::class.java.getDeclaredField(imageName).getInt(null)
                setImageResource(resId)
            }
            false -> {
                val assets = context.assets
                val ip = assets.open("$imageName.webp")
                val bitmap = BitmapFactory.decodeStream(ip)
                setImageBitmap(bitmap)
            }
        }
    }
}
