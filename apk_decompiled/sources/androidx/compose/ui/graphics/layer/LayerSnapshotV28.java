package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayerSnapshotV28 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV28 INSTANCE = new LayerSnapshotV28();

    private LayerSnapshotV28() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, hm hmVar) {
        return Bitmap.createBitmap(new GraphicsLayerPicture(graphicsLayer));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class GraphicsLayerPicture extends Picture {
        private final GraphicsLayer graphicsLayer;

        public GraphicsLayerPicture(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // android.graphics.Picture
        public Canvas beginRecording(int i, int i2) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public void draw(Canvas canvas) {
            this.graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(canvas), null);
        }

        public final GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // android.graphics.Picture
        public int getHeight() {
            return (int) (this.graphicsLayer.m5426getSizeYbymL2g() & 4294967295L);
        }

        @Override // android.graphics.Picture
        public int getWidth() {
            return (int) (this.graphicsLayer.m5426getSizeYbymL2g() >> 32);
        }

        @Override // android.graphics.Picture
        public boolean requiresHardwareAcceleration() {
            return true;
        }

        @Override // android.graphics.Picture
        public void endRecording() {
        }
    }
}
