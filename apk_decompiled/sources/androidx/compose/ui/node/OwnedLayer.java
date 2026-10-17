package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer);

    float getFrameRate();

    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo6630getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo6631inverseTransform58bKbWc(float[] fArr);

    boolean isFrameRateFromParent();

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo6632isInLayerk4lQ0M(long j);

    void mapBounds(MutableRect mutableRect, boolean z);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo6633mapOffset8S9VItk(long j, boolean z);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo6634movegyyYBs(long j);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo6635resizeozmzZPI(long j);

    void reuseLayer(my myVar, iy iyVar);

    void setFrameRate(float f);

    void setFrameRateFromParent(boolean z);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo6636transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
