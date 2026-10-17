package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.VertexMode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m4665toAndroidVertexModeJOOmi9M(int i) {
        VertexMode.Companion companion = VertexMode.Companion;
        return VertexMode.m5179equalsimpl0(i, companion.m5185getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m5179equalsimpl0(i, companion.m5184getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m5179equalsimpl0(i, companion.m5183getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
