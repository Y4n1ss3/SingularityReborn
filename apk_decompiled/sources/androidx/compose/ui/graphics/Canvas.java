package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.lu0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Canvas {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m4739clipRectmtrdDE(Canvas canvas, Rect rect, int i) {
            Canvas.super.m4736clipRectmtrdDE(rect, i);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            Canvas.super.drawArc(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            Canvas.super.drawArcRad(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f, float f2) {
            Canvas.super.skewRad(f, f2);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4732clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        canvas.mo4610clipPathmtrdDE(path, i);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4733clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        canvas.mo4611clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4734clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        canvas.m4736clipRectmtrdDE(rect, i);
    }

    /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m4735drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
            return;
        }
        long m7750getZeronOccac = (i & 2) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j;
        long m7777constructorimpl = (i & 4) != 0 ? IntSize.m7777constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2;
        canvas.mo4615drawImageRectHPBpro0(imageBitmap, m7750getZeronOccac, m7777constructorimpl, (i & 8) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j3, (i & 16) != 0 ? m7777constructorimpl : j4, paint);
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: scale");
            return;
        }
        if ((i & 2) != 0) {
            f2 = f;
        }
        canvas.scale(f, f2);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo4610clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo4611clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m4736clipRectmtrdDE(Rect rect, int i) {
        mo4611clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    /* renamed from: concat-58bKbWc */
    void mo4612concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint);

    default void drawArc(Rect rect, float f, float f2, boolean z, Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    default void drawArcRad(Rect rect, float f, float f2, boolean z, Paint paint) {
        drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo4613drawCircle9KIMszo(long j, float f, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo4614drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo4615drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo4616drawLineWko1d7g(long j, long j2, Paint paint);

    void drawOval(float f, float f2, float f3, float f4, Paint paint);

    default void drawOval(Rect rect, Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(Path path, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo4617drawPointsO7TthRY(int i, List<Offset> list, Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo4618drawRawPointsO7TthRY(int i, float[] fArr, Paint paint);

    void drawRect(float f, float f2, float f3, float f4, Paint paint);

    default void drawRect(Rect rect, Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo4619drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f, float f2);

    void skew(float f, float f2);

    default void skewRad(float f, float f2) {
        skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    void translate(float f, float f2);
}
