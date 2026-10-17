package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i, int i2, List<? extends Placeable> list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        this.index = i;
        this.size = i2;
        this.placeables = list;
        this.visualOffset = j;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            i3 = Math.max(i3, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = i3;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m999copy4Tuh3kE(long j, ky kyVar) {
        return IntOffset.m7733constructorimpl(((this.isVertical ? IntOffset.m7739getXimpl(j) : ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7739getXimpl(j)))).intValue()) << 32) | ((this.isVertical ? ((Number) kyVar.invoke(Integer.valueOf(IntOffset.m7740getYimpl(j)))).intValue() : IntOffset.m7740getYimpl(j)) & 4294967295L));
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m1000getOffsetBjo55l4(int i) {
        return IntOffset.m7733constructorimpl((r4[r5 + 1] & 4294967295L) | (this.placeableOffsets[i * 2] << 32));
    }

    public final void applyScrollDelta(int i) {
        this.offset = getOffset() + i;
        int length = this.placeableOffsets.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.isVertical;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        while (i < size) {
            Placeable placeable = this.placeables.get(i);
            long m1000getOffsetBjo55l4 = m1000getOffsetBjo55l4(i);
            if (this.reverseLayout) {
                m1000getOffsetBjo55l4 = IntOffset.m7733constructorimpl(((this.isVertical ? IntOffset.m7739getXimpl(m1000getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m7739getXimpl(m1000getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | ((this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m7740getYimpl(m1000getOffsetBjo55l4)) - getMainAxisSize(placeable) : IntOffset.m7740getYimpl(m1000getOffsetBjo55l4)) & 4294967295L));
            }
            long m7743plusqkQi6aY = IntOffset.m7743plusqkQi6aY(m1000getOffsetBjo55l4, this.visualOffset);
            if (this.isVertical) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m6307placeWithLayeraW9wM$default(placementScope2, placeable, m7743plusqkQi6aY, 0.0f, (ky) null, 6, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m6305placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m7743plusqkQi6aY, 0.0f, (ky) null, 6, (Object) null);
            }
            i++;
            placementScope = placementScope2;
        }
    }

    public final void position(int i, int i2, int i3) {
        int width;
        this.offset = i;
        this.mainAxisLayoutSize = this.isVertical ? i3 : i2;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = list.get(i4);
            int i5 = i4 * 2;
            boolean z = this.isVertical;
            int[] iArr = this.placeableOffsets;
            if (z) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment");
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
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment");
                    o.j();
                    return;
                } else {
                    iArr[i6] = vertical.align(placeable.getHeight(), i3);
                    width = placeable.getWidth();
                }
            }
            i = width + i;
        }
    }

    public /* synthetic */ MeasuredPage(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, dq dqVar) {
        this(i, i2, list, j, obj, orientation, horizontal, vertical, layoutDirection, z);
    }
}
