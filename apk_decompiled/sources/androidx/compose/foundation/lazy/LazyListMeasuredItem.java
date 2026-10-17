package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i, List<? extends Placeable> list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j2) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            i5 += isVertical() ? placeable.getHeight() : placeable.getWidth();
            i6 = Math.max(i6, !isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i5;
        int size2 = getSize() + this.spacing;
        this.mainAxisSizeWithSpacings = size2 >= 0 ? size2 : 0;
        this.crossAxisSize = i6;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m868copy4Tuh3kE(long j, ky kyVar) {
        int intValue;
        int m7740getYimpl;
        if (isVertical()) {
            intValue = IntOffset.m7739getXimpl(j);
            m7740getYimpl = ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7740getYimpl(j)))).intValue();
        } else {
            intValue = ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7739getXimpl(j)))).intValue();
            m7740getYimpl = IntOffset.m7740getYimpl(j);
        }
        return IntOffset.m7733constructorimpl((m7740getYimpl & 4294967295L) | (intValue << 32));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m869getMainAxisgyyYBs(long j) {
        return isVertical() ? IntOffset.m7740getYimpl(j) : IntOffset.m7739getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i, boolean z) {
        int intValue;
        int m7740getYimpl;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + i;
        int length = this.placeableOffsets.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 & 1;
            if ((isVertical() && i3 != 0) || (!isVertical() && i3 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i2] = iArr[i2] + i;
            }
        }
        if (z) {
            int placeablesCount = getPlaceablesCount();
            for (int i4 = 0; i4 < placeablesCount; i4++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i4);
                if (animation != null) {
                    long m918getRawOffsetnOccac = animation.m918getRawOffsetnOccac();
                    if (isVertical()) {
                        intValue = IntOffset.m7739getXimpl(m918getRawOffsetnOccac);
                        m7740getYimpl = Integer.valueOf(IntOffset.m7740getYimpl(m918getRawOffsetnOccac) + i).intValue();
                    } else {
                        intValue = Integer.valueOf(IntOffset.m7739getXimpl(m918getRawOffsetnOccac) + i).intValue();
                        m7740getYimpl = IntOffset.m7740getYimpl(m918getRawOffsetnOccac);
                    }
                    animation.m921setRawOffsetgyyYBs(IntOffset.m7733constructorimpl((intValue << 32) | (4294967295L & m7740getYimpl)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public long mo870getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
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

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public long mo871getOffsetBjo55l4(int i) {
        if (i == 0 && getPlaceablesCount() == 0) {
            boolean isVertical = isVertical();
            int offset = getOffset();
            return isVertical ? IntOffset.m7733constructorimpl(offset & 4294967295L) : IntOffset.m7733constructorimpl(offset << 32);
        }
        int[] iArr = this.placeableOffsets;
        int i2 = i * 2;
        return IntOffset.m7733constructorimpl((iArr[i2 + 1] & 4294967295L) | (iArr[i2] << 32));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i) {
        return this.placeables.get(i).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
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

    public final void place(Placeable.PlacementScope placementScope, boolean z) {
        GraphicsLayer graphicsLayer;
        Placeable.PlacementScope placementScope2;
        long m7739getXimpl;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i < placeablesCount) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long mo871getOffsetBjo55l4 = mo871getOffsetBjo55l4(i);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (z) {
                    animation.m920setLookaheadOffsetgyyYBs(mo871getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m7738equalsimpl0(animation.m916getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m922getNotInitializednOccac())) {
                        mo871getOffsetBjo55l4 = animation.m916getLookaheadOffsetnOccac();
                    }
                    long m7743plusqkQi6aY = IntOffset.m7743plusqkQi6aY(mo871getOffsetBjo55l4, animation.m917getPlacementDeltanOccac());
                    if ((m869getMainAxisgyyYBs(mo871getOffsetBjo55l4) <= mainAxisSize && m869getMainAxisgyyYBs(m7743plusqkQi6aY) <= mainAxisSize) || (m869getMainAxisgyyYBs(mo871getOffsetBjo55l4) >= i2 && m869getMainAxisgyyYBs(m7743plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo871getOffsetBjo55l4 = m7743plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.reverseLayout) {
                if (isVertical()) {
                    m7739getXimpl = (((this.mainAxisLayoutSize - IntOffset.m7740getYimpl(mo871getOffsetBjo55l4)) - getMainAxisSize(placeable)) & 4294967295L) | (IntOffset.m7739getXimpl(mo871getOffsetBjo55l4) << 32);
                } else {
                    m7739getXimpl = (((this.mainAxisLayoutSize - IntOffset.m7739getXimpl(mo871getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | (4294967295L & IntOffset.m7740getYimpl(mo871getOffsetBjo55l4));
                }
                mo871getOffsetBjo55l4 = IntOffset.m7733constructorimpl(m7739getXimpl);
            }
            long m7743plusqkQi6aY2 = IntOffset.m7743plusqkQi6aY(mo871getOffsetBjo55l4, this.visualOffset);
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

    public final void position(int i, int i2, int i3) {
        int width;
        this.offset = i;
        this.mainAxisLayoutSize = isVertical() ? i3 : i2;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = list.get(i4);
            int i5 = i4 * 2;
            boolean isVertical = isVertical();
            int[] iArr = this.placeableOffsets;
            if (isVertical) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
                    o.j();
                    return;
                } else {
                    iArr[i5] = horizontal.align(placeable.getWidth(), i2, this.layoutDirection);
                    this.placeableOffsets[i5 + 1] = i;
                    width = placeable.getHeight();
                }
            } else {
                iArr[i5] = i;
                int i6 = i5 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
                    o.j();
                    return;
                } else {
                    iArr[i6] = vertical.align(placeable.getHeight(), i3);
                    width = placeable.getWidth();
                }
            }
            i = width + i;
        }
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i, int i2, int i3, int i4) {
        position(i, i3, i4);
    }

    public /* synthetic */ LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, dq dqVar) {
        this(i, list, z, horizontal, vertical, layoutDirection, z2, i2, i3, i4, j, obj, obj2, lazyLayoutItemAnimator, j2);
    }
}
