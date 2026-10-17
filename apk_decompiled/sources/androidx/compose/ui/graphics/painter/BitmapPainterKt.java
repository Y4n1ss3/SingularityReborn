package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m5457BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j, long j2, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j, j2, null);
        bitmapPainter.m5456setFilterQualityvDHp3xo$ui_graphics(i);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m5458BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = IntOffset.Companion.m7750getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = IntSize.m7777constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = FilterQuality.Companion.m4861getLowfv9h1I();
        }
        return m5457BitmapPainterQZhYCtY(imageBitmap, j3, j4, i);
    }
}
