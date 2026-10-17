package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m4626ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        Bitmap createBitmap;
        m4627toBitmapConfig1JJdX4A(i3);
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m4627toBitmapConfig1JJdX4A(i3), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        return new AndroidImageBitmap(createBitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics();
        }
        lu0.a("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    public static final ImageBitmap createImageBitmap(byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m4627toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        return ImageBitmapConfig.m4987equalsimpl0(i, companion.m4992getArgb8888_sVssgQ()) ? Bitmap.Config.ARGB_8888 : ImageBitmapConfig.m4987equalsimpl0(i, companion.m4991getAlpha8_sVssgQ()) ? Bitmap.Config.ALPHA_8 : ImageBitmapConfig.m4987equalsimpl0(i, companion.m4995getRgb565_sVssgQ()) ? Bitmap.Config.RGB_565 : ImageBitmapConfig.m4987equalsimpl0(i, companion.m4993getF16_sVssgQ()) ? Bitmap.Config.RGBA_F16 : ImageBitmapConfig.m4987equalsimpl0(i, companion.m4994getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ() : config == Bitmap.Config.RGB_565 ? ImageBitmapConfig.Companion.m4995getRgb565_sVssgQ() : config == Bitmap.Config.ARGB_4444 ? ImageBitmapConfig.Companion.m4992getArgb8888_sVssgQ() : config == Bitmap.Config.RGBA_F16 ? ImageBitmapConfig.Companion.m4993getF16_sVssgQ() : config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.Companion.m4994getGpu_sVssgQ() : ImageBitmapConfig.Companion.m4992getArgb8888_sVssgQ();
    }
}
