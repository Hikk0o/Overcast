package com.sameerasw.overcast.weather.island

import android.content.Context
import android.graphics.Bitmap
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap

object WeatherIslandIcons {
    private const val SIZE_PX = 96

    fun bitmap(context: Context, @DrawableRes res: Int): Bitmap? =
        ContextCompat.getDrawable(context, res)?.toBitmap(SIZE_PX, SIZE_PX)
}
