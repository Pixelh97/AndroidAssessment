package com.example.androidassessment.ui.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("url")
fun bindImage(
    imageView: ImageView,
    url: String?,
) {
    Glide
        .with(imageView)
        .load(url)
        .into(imageView)
}
