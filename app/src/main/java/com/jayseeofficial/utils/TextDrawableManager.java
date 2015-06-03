package com.jayseeofficial.utils;

import android.os.Build;
import android.util.ArrayMap;

import com.amulyakhare.textdrawable.TextDrawable;
import com.meg7.color.MaterialColorPalette;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jon on 03/06/15.
 */
public class TextDrawableManager {
    private static Map<String, TextDrawable> drawableMap;

    static {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            drawableMap = new ArrayMap<>();
        } else {
            drawableMap = new HashMap<>();
        }
    }

    public static TextDrawable getTextDrawable(String text) {
        TextDrawable drawable = drawableMap.get(text);
        if (drawable == null) {
            drawable = TextDrawable.builder().buildRect(text, MaterialColorPalette.randomColor());
            drawableMap.put(text, drawable);
        }
        return drawable;
    }

}
