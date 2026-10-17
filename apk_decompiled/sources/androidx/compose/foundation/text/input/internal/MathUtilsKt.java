package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, iy iyVar) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ((Number) iyVar.invoke()).intValue() : i3;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m1307distanceSquaredToClosestCornerFromOutside3MmeM6k(long j, Rect rect) {
        if (SelectionManagerKt.m1535containsInclusiveUv8p0NA(rect, j)) {
            return 0.0f;
        }
        float m4515getDistanceSquaredimpl = Offset.m4515getDistanceSquaredimpl(Offset.m4520minusMKHz9U(rect.m4551getTopLeftF1C5BW0(), j));
        if (m4515getDistanceSquaredimpl >= Float.MAX_VALUE) {
            m4515getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float m4515getDistanceSquaredimpl2 = Offset.m4515getDistanceSquaredimpl(Offset.m4520minusMKHz9U(rect.m4552getTopRightF1C5BW0(), j));
        if (m4515getDistanceSquaredimpl2 < m4515getDistanceSquaredimpl) {
            m4515getDistanceSquaredimpl = m4515getDistanceSquaredimpl2;
        }
        float m4515getDistanceSquaredimpl3 = Offset.m4515getDistanceSquaredimpl(Offset.m4520minusMKHz9U(rect.m4544getBottomLeftF1C5BW0(), j));
        if (m4515getDistanceSquaredimpl3 < m4515getDistanceSquaredimpl) {
            m4515getDistanceSquaredimpl = m4515getDistanceSquaredimpl3;
        }
        float m4515getDistanceSquaredimpl4 = Offset.m4515getDistanceSquaredimpl(Offset.m4520minusMKHz9U(rect.m4545getBottomRightF1C5BW0(), j));
        return m4515getDistanceSquaredimpl4 < m4515getDistanceSquaredimpl ? m4515getDistanceSquaredimpl4 : m4515getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m1308findClosestRect9KIMszo(long j, Rect rect, Rect rect2) {
        float m1307distanceSquaredToClosestCornerFromOutside3MmeM6k = m1307distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect);
        float m1307distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m1307distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect2);
        if (m1307distanceSquaredToClosestCornerFromOutside3MmeM6k == m1307distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return m1307distanceSquaredToClosestCornerFromOutside3MmeM6k < m1307distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i, int i2, iy iyVar) {
        int i3 = i - i2;
        return ((i ^ i3) & (i2 ^ i)) < 0 ? ((Number) iyVar.invoke()).intValue() : i3;
    }
}
