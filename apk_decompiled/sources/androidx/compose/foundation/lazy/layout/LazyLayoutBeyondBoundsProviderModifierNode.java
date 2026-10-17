package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.h7;
import defpackage.ji0;
import defpackage.ky;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsProviderModifierNode extends Modifier.Node implements LayoutModifierNode, BeyondBoundsLayoutProviderModifierNode, BeyondBoundsLayout {
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private Orientation orientation;
    private boolean reverseLayout;
    private LazyLayoutBeyondBoundsState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final LazyLayoutBeyondBoundsProviderModifierNode$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsProviderModifierNode(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m905addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m907isForward4vf7U8o(i)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m906hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        if (m908isOppositeToOrientation4vf7U8o(i)) {
            return false;
        }
        return m907isForward4vf7U8o(i) ? interval.getEnd() < this.state.getItemCount() - 1 : interval.getStart() > 0;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m907isForward4vf7U8o(int i) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6223getBeforehoxUOeE())) {
            return false;
        }
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6222getAfterhoxUOeE())) {
            return true;
        }
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6221getAbovehoxUOeE())) {
            return this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6224getBelowhoxUOeE())) {
            return !this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6225getLefthoxUOeE())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
            if (i2 == 1) {
                return this.reverseLayout;
            }
            if (i2 == 2) {
                return !this.reverseLayout;
            }
            o.n();
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6226getRighthoxUOeE())) {
            LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            o.j();
            return false;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        if (i3 == 1) {
            return !this.reverseLayout;
        }
        if (i3 == 2) {
            return this.reverseLayout;
        }
        o.n();
        return false;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m908isOppositeToOrientation4vf7U8o(int i) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6221getAbovehoxUOeE()) || BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6224getBelowhoxUOeE())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6225getLefthoxUOeE()) || BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6226getRighthoxUOeE())) {
            return this.orientation == Orientation.Vertical;
        }
        if (BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6223getBeforehoxUOeE()) || BeyondBoundsLayout.LayoutDirection.m6217equalsimpl0(i, companion.m6222getAfterhoxUOeE())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
        o.j();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo909layouto7g1Pn8(final int i, ky kyVar) {
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems() || !isAttached()) {
            return (T) kyVar.invoke(emptyBeyondBoundsScope);
        }
        boolean m907isForward4vf7U8o = m907isForward4vf7U8o(i);
        LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState = this.state;
        int lastPlacedIndex = m907isForward4vf7U8o ? lazyLayoutBeyondBoundsState.getLastPlacedIndex() : lazyLayoutBeyondBoundsState.getFirstPlacedIndex();
        final ji0 ji0Var = new ji0();
        ji0Var.d = this.beyondBoundsInfo.addInterval(lastPlacedIndex, lastPlacedIndex);
        int itemsPerViewport = this.state.itemsPerViewport() * 2;
        int itemCount = this.state.getItemCount();
        if (itemsPerViewport > itemCount) {
            itemsPerViewport = itemCount;
        }
        T t = null;
        int i2 = 0;
        while (t == null && m906hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ji0Var.d, i) && i2 < itemsPerViewport) {
            LazyLayoutBeyondBoundsInfo.Interval m905addNextIntervalFR3nfPY = m905addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ji0Var.d, i);
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) ji0Var.d);
            ji0Var.d = m905addNextIntervalFR3nfPY;
            i2++;
            LayoutModifierNodeKt.remeasureSync(this);
            t = (T) kyVar.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    boolean m906hasMoreContentFR3nfPY;
                    m906hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsProviderModifierNode.this.m906hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) ji0Var.d, i);
                    return m906hasMoreContentFR3nfPY;
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) ji0Var.d);
        LayoutModifierNodeKt.remeasureSync(this);
        return t;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h7(5, mo6234measureBRTryo0), 4, null);
    }

    public final void update(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.orientation = orientation;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode
    public BeyondBoundsLayout getBeyondBoundsLayout() {
        return this;
    }
}
