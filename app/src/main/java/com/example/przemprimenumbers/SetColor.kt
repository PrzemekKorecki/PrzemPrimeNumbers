package com.example.przemprimenumbers

import android.widget.TextView
import androidx.core.text.HtmlCompat

fun setColor(_textView: TextView, _string: String){
    _textView.text = HtmlCompat.fromHtml("<font color='#ff0000'>$_string</font>", HtmlCompat.FROM_HTML_MODE_LEGACY)
}