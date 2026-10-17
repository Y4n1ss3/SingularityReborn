package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f, float f2) {
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.inset(f, f2, f, f2);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m5400rotateRad0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo5262rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m5401rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo5260getCenterF1C5BW0();
        }
        drawTransform.mo5262rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m5402scale0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo5263scale0AR0LA0(f, f, j);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m5403scale0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo5260getCenterF1C5BW0();
        }
        drawTransform.mo5263scale0AR0LA0(f, f, j);
    }

    public static final void inset(DrawTransform drawTransform, float f) {
        drawTransform.inset(f, f, f, f);
    }
}
