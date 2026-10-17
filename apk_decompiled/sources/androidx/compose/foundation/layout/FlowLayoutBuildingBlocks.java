package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.c10;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;

    private FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4) {
        this.maxItemsInMainAxis = i;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j;
        this.maxLines = i2;
        this.mainAxisSpacing = i3;
        this.crossAxisSpacing = i4;
    }

    public final WrapEllipsisInfo getWrapEllipsisInfo(WrapInfo wrapInfo, boolean z, int i, int i2, int i3, int i4) {
        WrapEllipsisInfo ellipsisInfo$foundation_layout;
        if (!wrapInfo.isLastItemInContainer() || (ellipsisInfo$foundation_layout = this.overflow.ellipsisInfo$foundation_layout(z, i, i2)) == null) {
            return null;
        }
        ellipsisInfo$foundation_layout.setPlaceEllipsisOnLastContentLine(i >= 0 && (i4 == 0 || (i3 - ((int) (ellipsisInfo$foundation_layout.m687getEllipsisSizeOO21N7I() >> 32)) >= 0 && i4 < this.maxItemsInMainAxis)));
        return ellipsisInfo$foundation_layout;
    }

    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m686getWrapInfoOpUlnko(boolean z, int i, long j, c10 c10Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (c10Var == null) {
            return new WrapInfo(true, true);
        }
        long j2 = c10Var.a;
        if (this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible && (i2 >= this.maxLines || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0)) {
            return new WrapInfo(true, true);
        }
        if (i != 0 && (i >= this.maxItemsInMainAxis || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new WrapInfo(true, true) : new WrapInfo(true, m686getWrapInfoOpUlnko(z, 0, c10.a(Constraints.m7564getMaxWidthimpl(this.constraints), (((int) (j & 4294967295L)) - this.crossAxisSpacing) - i4), new c10(c10.a(((int) (j2 >> 32)) - this.mainAxisSpacing, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).isLastItemInContainer());
        }
        int max = Math.max(i4, (int) (j2 & 4294967295L)) + i3;
        c10 m691ellipsisSizeF35zmw$foundation_layout = z3 ? null : this.overflow.m691ellipsisSizeF35zmw$foundation_layout(z, i2, max);
        if (m691ellipsisSizeF35zmw$foundation_layout != null) {
            long j3 = m691ellipsisSizeF35zmw$foundation_layout.a;
            if (i + 1 >= this.maxItemsInMainAxis || ((((int) (j >> 32)) - ((int) (j2 >> 32))) - this.mainAxisSpacing) - ((int) (j3 >> 32)) < 0) {
                if (z3) {
                    return new WrapInfo(true, true);
                }
                WrapInfo m686getWrapInfoOpUlnko = m686getWrapInfoOpUlnko(false, 0, c10.a(Constraints.m7564getMaxWidthimpl(this.constraints), (((int) (j & 4294967295L)) - this.crossAxisSpacing) - Math.max(i4, (int) (j2 & 4294967295L))), m691ellipsisSizeF35zmw$foundation_layout, i2 + 1, max, 0, true, true);
                return new WrapInfo(m686getWrapInfoOpUlnko.isLastItemInContainer(), m686getWrapInfoOpUlnko.isLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;
        private final Placeable placeable;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j, boolean z, int i, dq dqVar) {
            this(measurable, placeable, j, (i & 8) != 0 ? true : z, null);
        }

        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m687getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public final Placeable getPlaceable() {
            return this.placeable;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z) {
            this.placeEllipsisOnLastContentLine = z;
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j, boolean z) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j;
            this.placeEllipsisOnLastContentLine = z;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j, boolean z, dq dqVar) {
            this(measurable, placeable, j, z);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        public /* synthetic */ WrapInfo(boolean z, boolean z2, int i, dq dqVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }

        public WrapInfo(boolean z, boolean z2) {
            this.isLastItemInLine = z;
            this.isLastItemInContainer = z2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WrapInfo() {
            this(r2, r2, 3, null);
            boolean z = false;
        }
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4, dq dqVar) {
        this(i, flowLayoutOverflowState, j, i2, i3, i4);
    }
}
