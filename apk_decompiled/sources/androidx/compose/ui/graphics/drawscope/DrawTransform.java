package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawTransform {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5397getCenterF1C5BW0(DrawTransform drawTransform) {
            return DrawTransform.super.mo5260getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m5391clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        drawTransform.mo5258clipPathmtrdDE(path, i);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m5392clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawTransform.mo5261getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawTransform.mo5261getSizeNHjbRc() & 4294967295L));
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        drawTransform.mo5259clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m5393rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
            return;
        }
        if ((i & 2) != 0) {
            j = drawTransform.mo5260getCenterF1C5BW0();
        }
        drawTransform.mo5262rotateUv8p0NA(f, j);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m5394scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
            return;
        }
        if ((i & 4) != 0) {
            j = drawTransform.mo5260getCenterF1C5BW0();
        }
        drawTransform.mo5263scale0AR0LA0(f, f2, j);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: translate");
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo5258clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo5259clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo5260getCenterF1C5BW0() {
        float intBitsToFloat = Float.intBitsToFloat((int) (mo5261getSizeNHjbRc() >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo5261getSizeNHjbRc() & 4294967295L)) / 2.0f;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: getSize-NH-jbRc */
    long mo5261getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* renamed from: rotate-Uv8p0NA */
    void mo5262rotateUv8p0NA(float f, long j);

    /* renamed from: scale-0AR0LA0 */
    void mo5263scale0AR0LA0(float f, float f2, long j);

    /* renamed from: transform-58bKbWc */
    void mo5264transform58bKbWc(float[] fArr);

    void translate(float f, float f2);
}
