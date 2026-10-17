package androidx.compose.material3;

import androidx.compose.material3.TooltipAnchorPosition;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TooltipPositionProviderImpl implements PopupPositionProvider {
    private final int tooltipAnchorSpacing;
    private final int type;

    private TooltipPositionProviderImpl(int i, int i2) {
        this.type = i;
        this.tooltipAnchorSpacing = i2;
    }

    /* renamed from: abovePositioning-uHY26d4, reason: not valid java name */
    public final long m2794abovePositioninguHY26d4(IntRect intRect, long j, long j2) {
        int i = (int) (j >> 32);
        int width = ((intRect.getWidth() - i) / 2) + intRect.getLeft();
        if (width < 0) {
            width = intRect.getLeft();
        } else if (width + i > ((int) (j2 >> 32))) {
            width = intRect.getRight() - i;
        }
        int top = (intRect.getTop() - ((int) (j & 4294967295L))) - this.tooltipAnchorSpacing;
        if (top < 0) {
            top = intRect.getBottom() + this.tooltipAnchorSpacing;
        }
        return IntOffset.m7733constructorimpl((width << 32) | (top & 4294967295L));
    }

    /* renamed from: belowPositioning-uHY26d4, reason: not valid java name */
    public final long m2795belowPositioninguHY26d4(IntRect intRect, long j, long j2) {
        int i = (int) (j >> 32);
        int width = ((intRect.getWidth() - i) / 2) + intRect.getLeft();
        if (width < 0) {
            width = intRect.getLeft();
        } else if (width + i > ((int) (j2 >> 32))) {
            width = intRect.getRight() - i;
        }
        int bottom = intRect.getBottom() + this.tooltipAnchorSpacing;
        int i2 = (int) (j & 4294967295L);
        if (bottom + i2 > ((int) (j2 & 4294967295L))) {
            bottom = (intRect.getTop() - i2) - this.tooltipAnchorSpacing;
        }
        return IntOffset.m7733constructorimpl((width << 32) | (bottom & 4294967295L));
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i = this.type;
        TooltipAnchorPosition.Companion companion = TooltipAnchorPosition.Companion;
        return TooltipAnchorPosition.m2769equalsimpl0(i, companion.m2776getLeftlOKsHw4()) ? m2798leftPositioningoFUgxo0(intRect, j2) : TooltipAnchorPosition.m2769equalsimpl0(i, companion.m2777getRightlOKsHw4()) ? m2799rightPositioninguHY26d4(intRect, j2, j) : TooltipAnchorPosition.m2769equalsimpl0(i, companion.m2773getAbovelOKsHw4()) ? m2794abovePositioninguHY26d4(intRect, j2, j) : TooltipAnchorPosition.m2769equalsimpl0(i, companion.m2774getBelowlOKsHw4()) ? m2795belowPositioninguHY26d4(intRect, j2, j) : TooltipAnchorPosition.m2769equalsimpl0(i, companion.m2778getStartlOKsHw4()) ? m2800startPositioning_JLpSYE(layoutDirection, intRect, j2, j) : TooltipAnchorPosition.m2769equalsimpl0(i, companion.m2775getEndlOKsHw4()) ? m2796endPositioning_JLpSYE(layoutDirection, intRect, j2, j) : m2794abovePositioninguHY26d4(intRect, j2, j);
    }

    /* renamed from: endPositioning-_JLpSYE, reason: not valid java name */
    public final long m2796endPositioning_JLpSYE(LayoutDirection layoutDirection, IntRect intRect, long j, long j2) {
        return layoutDirection == LayoutDirection.Ltr ? m2799rightPositioninguHY26d4(intRect, j, j2) : m2798leftPositioningoFUgxo0(intRect, j);
    }

    public final int getTooltipAnchorSpacing() {
        return this.tooltipAnchorSpacing;
    }

    /* renamed from: getType-lOKsHw4, reason: not valid java name */
    public final int m2797getTypelOKsHw4() {
        return this.type;
    }

    /* renamed from: leftPositioning-oFUgxo0, reason: not valid java name */
    public final long m2798leftPositioningoFUgxo0(IntRect intRect, long j) {
        int left = intRect.getLeft() - (((int) (j >> 32)) + this.tooltipAnchorSpacing);
        if (left < 0) {
            left = intRect.getRight() + this.tooltipAnchorSpacing;
        }
        return IntOffset.m7733constructorimpl(((((intRect.getBottom() + intRect.getTop()) - ((int) (j & 4294967295L))) / 2) & 4294967295L) | (left << 32));
    }

    /* renamed from: rightPositioning-uHY26d4, reason: not valid java name */
    public final long m2799rightPositioninguHY26d4(IntRect intRect, long j, long j2) {
        int right = intRect.getRight() + this.tooltipAnchorSpacing;
        int i = (int) (j >> 32);
        if (right + i > ((int) (j2 >> 32))) {
            right = intRect.getLeft() - (i + this.tooltipAnchorSpacing);
        }
        return IntOffset.m7733constructorimpl(((((intRect.getBottom() + intRect.getTop()) - ((int) (j & 4294967295L))) / 2) & 4294967295L) | (right << 32));
    }

    /* renamed from: startPositioning-_JLpSYE, reason: not valid java name */
    public final long m2800startPositioning_JLpSYE(LayoutDirection layoutDirection, IntRect intRect, long j, long j2) {
        return layoutDirection == LayoutDirection.Ltr ? m2798leftPositioningoFUgxo0(intRect, j) : m2799rightPositioninguHY26d4(intRect, j, j2);
    }

    public /* synthetic */ TooltipPositionProviderImpl(int i, int i2, dq dqVar) {
        this(i, i2);
    }
}
