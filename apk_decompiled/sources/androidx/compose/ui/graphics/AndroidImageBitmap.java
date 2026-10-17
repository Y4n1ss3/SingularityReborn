package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidImageBitmap implements ImageBitmap {
    public static final int $stable = 8;
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap$ui_graphics() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public ColorSpace getColorSpace() {
        Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
        return Api26Bitmap.composeColorSpace$ui_graphics(this.bitmap);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo4625getConfig_sVssgQ() {
        Bitmap.Config config = this.bitmap.getConfig();
        config.getClass();
        return AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void readPixels(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z = false;
        if (asAndroidBitmap.getConfig() == Bitmap.Config.HARDWARE) {
            asAndroidBitmap = asAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        Bitmap bitmap = asAndroidBitmap;
        bitmap.getPixels(iArr, i5, i6, i, i2, i3, i4);
        if (z) {
            bitmap.recycle();
        }
    }
}
