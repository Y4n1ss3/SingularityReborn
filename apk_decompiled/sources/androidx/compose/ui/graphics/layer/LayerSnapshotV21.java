package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV21 INSTANCE = new LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, hm hmVar) {
        long m5426getSizeYbymL2g = graphicsLayer.m5426getSizeYbymL2g();
        Bitmap createBitmap = Bitmap.createBitmap((int) (m5426getSizeYbymL2g >> 32), (int) (m5426getSizeYbymL2g & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(new Canvas(createBitmap)), null);
        return createBitmap;
    }
}
