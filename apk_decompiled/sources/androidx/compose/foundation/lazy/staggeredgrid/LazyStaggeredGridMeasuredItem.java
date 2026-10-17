package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i, Object obj, List<? extends Placeable> list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j) {
        int height;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.lane = i3;
        this.span = i4;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j;
        int i7 = 1;
        this.isVisible = true;
        int i8 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            height = isVertical() ? placeable.getHeight() : placeable.getWidth();
            int size = list.size() - 1;
            if (1 <= size) {
                int i9 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i9);
                    int height2 = isVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i9 == size) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        int i10 = height + i2;
        this.mainAxisSizeWithSpacings = i10 < 0 ? 0 : i10;
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            int width = isVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                while (true) {
                    Placeable placeable4 = list2.get(i7);
                    int width2 = isVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i7 == size2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            i8 = width;
        }
        this.crossAxisSize = i8;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        boolean isVertical = isVertical();
        int i11 = this.mainAxisSize;
        this.size = isVertical ? IntSize.m7777constructorimpl((i11 & 4294967295L) | (i8 << 32)) : IntSize.m7777constructorimpl((i11 << 32) | (i8 & 4294967295L));
        this.offset = IntOffset.Companion.m7750getZeronOccac();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m980copy4Tuh3kE(long j, ky kyVar) {
        return IntOffset.m7733constructorimpl(((isVertical() ? IntOffset.m7739getXimpl(j) : ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7739getXimpl(j)))).intValue()) << 32) | ((isVertical() ? ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7740getYimpl(j)))).intValue() : IntOffset.m7740getYimpl(j)) & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m981getMainAxisgyyYBs(long j) {
        return isVertical() ? IntOffset.m7740getYimpl(j) : IntOffset.m7739getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i, boolean z) {
        if (getNonScrollableItem()) {
            return;
        }
        long mo964getOffsetnOccac = mo964getOffsetnOccac();
        int m7739getXimpl = isVertical() ? IntOffset.m7739getXimpl(mo964getOffsetnOccac) : IntOffset.m7739getXimpl(mo964getOffsetnOccac) + i;
        boolean isVertical = isVertical();
        int m7740getYimpl = IntOffset.m7740getYimpl(mo964getOffsetnOccac);
        if (isVertical) {
            m7740getYimpl += i;
        }
        this.offset = IntOffset.m7733constructorimpl((m7739getXimpl << 32) | (m7740getYimpl & 4294967295L));
        if (z) {
            int placeablesCount = getPlaceablesCount();
            for (int i2 = 0; i2 < placeablesCount; i2++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
                if (animation != null) {
                    long m918getRawOffsetnOccac = animation.m918getRawOffsetnOccac();
                    int m7739getXimpl2 = isVertical() ? IntOffset.m7739getXimpl(m918getRawOffsetnOccac) : Integer.valueOf(IntOffset.m7739getXimpl(m918getRawOffsetnOccac) + i).intValue();
                    boolean isVertical2 = isVertical();
                    int m7740getYimpl2 = IntOffset.m7740getYimpl(m918getRawOffsetnOccac);
                    if (isVertical2) {
                        m7740getYimpl2 = Integer.valueOf(m7740getYimpl2 + i).intValue();
                    }
                    animation.m921setRawOffsetgyyYBs(IntOffset.m7733constructorimpl((m7740getYimpl2 & 4294967295L) | (m7739getXimpl2 << 32)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo870getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisOffset() {
        return !isVertical() ? IntOffset.m7739getXimpl(mo964getOffsetnOccac()) : IntOffset.m7740getYimpl(mo964getOffsetnOccac());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo871getOffsetBjo55l4(int i) {
        return mo964getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo964getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i) {
        return this.placeables.get(i).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo965getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void place(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, boolean z) {
        GraphicsLayer graphicsLayer;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int height = this.minMainAxisOffset - (isVertical() ? placeable.getHeight() : placeable.getWidth());
            int i2 = this.maxMainAxisOffset;
            long mo964getOffsetnOccac = mo964getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (z) {
                    animation.m920setLookaheadOffsetgyyYBs(mo964getOffsetnOccac);
                } else {
                    long m7743plusqkQi6aY = IntOffset.m7743plusqkQi6aY(!IntOffset.m7738equalsimpl0(animation.m916getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m922getNotInitializednOccac()) ? animation.m916getLookaheadOffsetnOccac() : mo964getOffsetnOccac, animation.m917getPlacementDeltanOccac());
                    if ((m981getMainAxisgyyYBs(mo964getOffsetnOccac) <= height && m981getMainAxisgyyYBs(m7743plusqkQi6aY) <= height) || (m981getMainAxisgyyYBs(mo964getOffsetnOccac) >= i2 && m981getMainAxisgyyYBs(m7743plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo964getOffsetnOccac = m7743plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                int m7739getXimpl = isVertical() ? IntOffset.m7739getXimpl(mo964getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m7739getXimpl(mo964getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth());
                mo964getOffsetnOccac = IntOffset.m7733constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m7740getYimpl(mo964getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m7740getYimpl(mo964getOffsetnOccac)) & 4294967295L) | (m7739getXimpl << 32));
            }
            long m7743plusqkQi6aY2 = IntOffset.m7743plusqkQi6aY(mo964getOffsetnOccac, lazyStaggeredGridMeasureContext.m969getContentOffsetnOccac());
            if (!z && animation != null) {
                animation.m919setFinalOffsetgyyYBs(m7743plusqkQi6aY2);
            }
            if (graphicsLayer != null) {
                Placeable.PlacementScope.m6306placeRelativeWithLayeraW9wM$default(placementScope, placeable, m7743plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m6305placeRelativeWithLayeraW9wM$default(placementScope, placeable, m7743plusqkQi6aY2, 0.0f, (ky) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i, int i2, int i3) {
        long m7733constructorimpl;
        this.mainAxisLayoutSize = i3;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i3 + this.afterContentPadding;
        if (isVertical()) {
            m7733constructorimpl = IntOffset.m7733constructorimpl((i2 << 32) | (4294967295L & i));
        } else {
            m7733constructorimpl = IntOffset.m7733constructorimpl((i2 & 4294967295L) | (i << 32));
        }
        this.offset = m7733constructorimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int i) {
        this.mainAxisLayoutSize = i;
        this.maxMainAxisOffset = i + this.afterContentPadding;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i, int i2, int i3, int i4) {
        if (isVertical()) {
            i3 = i4;
        }
        position(i, i2, i3);
    }

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j, dq dqVar) {
        this(i, obj, list, z, i2, i3, i4, i5, i6, obj2, lazyLayoutItemAnimator, j);
    }
}
