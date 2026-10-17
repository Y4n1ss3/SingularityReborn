package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntRectKt {
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m7771IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m7739getXimpl(j), IntOffset.m7740getYimpl(j), IntOffset.m7739getXimpl(j2), IntOffset.m7740getYimpl(j2));
    }

    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m7772IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m7739getXimpl(j), IntOffset.m7740getYimpl(j), IntOffset.m7739getXimpl(j) + ((int) (j2 >> 32)), IntOffset.m7740getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m7773IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m7739getXimpl(j) - i, IntOffset.m7740getYimpl(j) - i, IntOffset.m7739getXimpl(j) + i, IntOffset.m7740getYimpl(j) + i);
    }

    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
