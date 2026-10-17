package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> list, long j, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.lane = i6;
        this.span = i7;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Placeable placeable = (Placeable) list.get(i9);
            i8 = Math.max(i8, isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i8;
        int i10 = i3 + i8;
        this.mainAxisSizeWithSpacings = i10 >= 0 ? i10 : 0;
        boolean isVertical = isVertical();
        int i11 = this.crossAxisSize;
        this.size = isVertical ? IntSize.m7777constructorimpl((i11 << 32) | (i8 & 4294967295L)) : IntSize.m7777constructorimpl((i11 & 4294967295L) | (i8 << 32));
        this.offset = IntOffset.Companion.m7750getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m896copy4Tuh3kE(long j, ky kyVar) {
        return IntOffset.m7733constructorimpl(((isVertical() ? IntOffset.m7739getXimpl(j) : ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7739getXimpl(j)))).intValue()) << 32) | ((isVertical() ? ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7740getYimpl(j)))).intValue() : IntOffset.m7740getYimpl(j)) & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m897getMainAxisgyyYBs(long j) {
        return isVertical() ? IntOffset.m7740getYimpl(j) : IntOffset.m7739getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i, boolean z) {
        if (getNonScrollableItem()) {
            return;
        }
        long mo891getOffsetnOccac = mo891getOffsetnOccac();
        int m7739getXimpl = isVertical() ? IntOffset.m7739getXimpl(mo891getOffsetnOccac) : IntOffset.m7739getXimpl(mo891getOffsetnOccac) + i;
        boolean isVertical = isVertical();
        int m7740getYimpl = IntOffset.m7740getYimpl(mo891getOffsetnOccac);
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo870getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
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
        return mo891getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo891getOffsetnOccac() {
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo892getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final void place(Placeable.PlacementScope placementScope, boolean z) {
        GraphicsLayer graphicsLayer;
        Placeable.PlacementScope placementScope2;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i < placeablesCount) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long mo891getOffsetnOccac = mo891getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (z) {
                    animation.m920setLookaheadOffsetgyyYBs(mo891getOffsetnOccac);
                } else {
                    long m7743plusqkQi6aY = IntOffset.m7743plusqkQi6aY(!IntOffset.m7738equalsimpl0(animation.m916getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m922getNotInitializednOccac()) ? animation.m916getLookaheadOffsetnOccac() : mo891getOffsetnOccac, animation.m917getPlacementDeltanOccac());
                    if ((m897getMainAxisgyyYBs(mo891getOffsetnOccac) <= mainAxisSize && m897getMainAxisgyyYBs(m7743plusqkQi6aY) <= mainAxisSize) || (m897getMainAxisgyyYBs(mo891getOffsetnOccac) >= i2 && m897getMainAxisgyyYBs(m7743plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo891getOffsetnOccac = m7743plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.reverseLayout) {
                mo891getOffsetnOccac = IntOffset.m7733constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m7740getYimpl(mo891getOffsetnOccac)) - getMainAxisSize(placeable) : IntOffset.m7740getYimpl(mo891getOffsetnOccac)) & 4294967295L) | ((isVertical() ? IntOffset.m7739getXimpl(mo891getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m7739getXimpl(mo891getOffsetnOccac)) - getMainAxisSize(placeable)) << 32));
            }
            long m7743plusqkQi6aY2 = IntOffset.m7743plusqkQi6aY(mo891getOffsetnOccac, this.visualOffset);
            if (!z && animation != null) {
                animation.m919setFinalOffsetgyyYBs(m7743plusqkQi6aY2);
            }
            if (!isVertical()) {
                placementScope2 = placementScope;
                GraphicsLayer graphicsLayer2 = graphicsLayer;
                if (graphicsLayer2 != null) {
                    Placeable.PlacementScope.m6306placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m7743plusqkQi6aY2, graphicsLayer2, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m6305placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m7743plusqkQi6aY2, 0.0f, (ky) null, 6, (Object) null);
                }
            } else if (graphicsLayer != null) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m6308placeWithLayeraW9wM$default(placementScope2, placeable, m7743plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m6307placeWithLayeraW9wM$default(placementScope2, placeable, m7743plusqkQi6aY2, 0.0f, (ky) null, 6, (Object) null);
            }
            i++;
            placementScope = placementScope2;
        }
    }

    public final void position(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mainAxisLayoutSize = isVertical() ? i4 : i3;
        if (!isVertical()) {
            i3 = i4;
        }
        if (isVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.crossAxisSize;
        }
        this.offset = isVertical() ? IntOffset.m7733constructorimpl((i2 << 32) | (4294967295L & i)) : IntOffset.m7733constructorimpl((i2 & 4294967295L) | (i << 32));
        this.row = i5;
        this.column = i6;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
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
        position(i, i2, i3, i4, -1, -1);
    }

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, dq dqVar) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }
}
