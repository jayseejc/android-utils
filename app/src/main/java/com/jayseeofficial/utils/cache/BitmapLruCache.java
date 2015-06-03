package com.jayseeofficial.utils.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by jon on 03/06/15.
 */
public class BitmapLruCache extends LruCache<String, Bitmap> {
    /**
     * @param maxSize for caches that do not override {@link #sizeOf}, this is
     *                the maximum number of entries in the cache. For all other caches,
     *                this is the maximum sum of the sizes of the entries in this cache.
     */
    public BitmapLruCache(int maxSize) {
        super(maxSize);
    }

    @Override
    protected int sizeOf(String key, Bitmap value) {
        return value.getByteCount();
    }
}
