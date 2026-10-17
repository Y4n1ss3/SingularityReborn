package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.d41;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV22 INSTANCE = new LayerSnapshotV22();

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toBitmap(GraphicsLayer graphicsLayer, hm hmVar) {
        LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        int i;
        AutoCloseable autoCloseable;
        Bitmap bitmap;
        if (hmVar instanceof LayerSnapshotV22$toBitmap$1) {
            layerSnapshotV22$toBitmap$1 = (LayerSnapshotV22$toBitmap$1) hmVar;
            int i2 = layerSnapshotV22$toBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layerSnapshotV22$toBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = layerSnapshotV22$toBitmap$1.result;
                i = layerSnapshotV22$toBitmap$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    long m5426getSizeYbymL2g = graphicsLayer.m5426getSizeYbymL2g();
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    ImageReader newInstance = ImageReader.newInstance((int) (m5426getSizeYbymL2g >> 32), (int) (m5426getSizeYbymL2g & 4294967295L), 1, 1);
                    try {
                        layerSnapshotV22$toBitmap$1.L$0 = graphicsLayer;
                        layerSnapshotV22$toBitmap$1.L$1 = myLooper;
                        layerSnapshotV22$toBitmap$1.L$2 = newInstance;
                        layerSnapshotV22$toBitmap$1.L$3 = newInstance;
                        layerSnapshotV22$toBitmap$1.L$4 = layerSnapshotV22$toBitmap$1;
                        layerSnapshotV22$toBitmap$1.label = 1;
                        final gg ggVar = new gg(1, d41.C(layerSnapshotV22$toBitmap$1));
                        ggVar.u();
                        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1
                            @Override // android.media.ImageReader.OnImageAvailableListener
                            public final void onImageAvailable(ImageReader imageReader) {
                                fg.this.resumeWith(imageReader.acquireLatestImage());
                            }
                        }, Handler.createAsync(myLooper));
                        Surface surface = newInstance.getSurface();
                        Canvas lockCanvas = SurfaceUtils.INSTANCE.lockCanvas(surface);
                        try {
                            lockCanvas.drawColor(ColorKt.m4815toArgb8_81llA(Color.Companion.m4787getBlack0d7_KjU()), PorterDuff.Mode.CLEAR);
                            graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(lockCanvas), null);
                            surface.unlockCanvasAndPost(lockCanvas);
                            obj = ggVar.s();
                            vn vnVar = vn.d;
                            if (obj == vnVar) {
                                return vnVar;
                            }
                            autoCloseable = newInstance;
                        } catch (Throwable th) {
                            surface.unlockCanvasAndPost(lockCanvas);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseable = newInstance;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    autoCloseable = (AutoCloseable) layerSnapshotV22$toBitmap$1.L$2;
                    try {
                        p10.Q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            y80.e(autoCloseable, th);
                            throw th4;
                        }
                    }
                }
                bitmap = LayerSnapshot_androidKt.toBitmap((Image) obj);
                y80.e(autoCloseable, null);
                return bitmap;
            }
        }
        layerSnapshotV22$toBitmap$1 = new LayerSnapshotV22$toBitmap$1(this, hmVar);
        Object obj2 = layerSnapshotV22$toBitmap$1.result;
        i = layerSnapshotV22$toBitmap$1.label;
        if (i != 0) {
        }
        bitmap = LayerSnapshot_androidKt.toBitmap((Image) obj2);
        y80.e(autoCloseable, null);
        return bitmap;
    }
}
