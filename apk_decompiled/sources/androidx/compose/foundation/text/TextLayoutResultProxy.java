package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    public static final int $stable = 8;
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i, dq dqVar) {
        this(textLayoutResult, (i & 2) != 0 ? null : layoutCoordinates, (i & 4) != 0 ? null : layoutCoordinates2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m1200coercedInVisibleBoundsOfInputTextMKHz9U(long j) {
        Rect zero;
        long m1207coerceIn3MmeM6k;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
                zero = null;
                if (layoutCoordinates2 != null) {
                    zero = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, null);
                }
            } else {
                zero = Rect.Companion.getZero();
            }
        }
        zero = Rect.Companion.getZero();
        m1207coerceIn3MmeM6k = TextLayoutResultProxyKt.m1207coerceIn3MmeM6k(j, zero);
        return m1207coerceIn3MmeM6k;
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy.getLineEnd(i, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m1201getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m1202getOffsetForPosition3MmeM6k(j, z);
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i, boolean z) {
        return this.value.getLineEnd(i, z);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (m1204translateDecorationToInnerCoordinatesMKHz9U$foundation(m1200coercedInVisibleBoundsOfInputTextMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)))) & 4294967295L)));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m1202getOffsetForPosition3MmeM6k(long j, boolean z) {
        if (z) {
            j = m1200coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.value.m7030getOffsetForPositionk4lQ0M(m1204translateDecorationToInnerCoordinatesMKHz9U$foundation(j));
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m1203isPositionOnTextk4lQ0M(long j) {
        long m1204translateDecorationToInnerCoordinatesMKHz9U$foundation = m1204translateDecorationToInnerCoordinatesMKHz9U$foundation(m1200coercedInVisibleBoundsOfInputTextMKHz9U(j));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & m1204translateDecorationToInnerCoordinatesMKHz9U$foundation)));
        int i = (int) (m1204translateDecorationToInnerCoordinatesMKHz9U$foundation >> 32);
        return Float.intBitsToFloat(i) >= this.value.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i) <= this.value.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m1204translateDecorationToInnerCoordinatesMKHz9U$foundation(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates2.mo6243localPositionOfR5De75A(layoutCoordinates3, j);
                }
            }
        }
        return j;
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m1205translateInnerToDecorationCoordinatesMKHz9U$foundation(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates3.mo6243localPositionOfR5De75A(layoutCoordinates2, j);
                }
            }
        }
        return j;
    }

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }
}
