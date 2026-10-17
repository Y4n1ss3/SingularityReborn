package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.hm;
import defpackage.ii0;
import defpackage.iy;
import defpackage.ky;
import defpackage.mb0;
import defpackage.my;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollingLogic implements ScrollLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final iy isScrollableNodeAttached;
    private int latestScrollSource = NestedScrollSource.Companion.m5969getUserInputWNlRxjI();
    private NestedScrollDispatcher nestedScrollDispatcher;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope;
    private OnScrollChangedDispatcher onScrollChangedDispatcher;
    private Orientation orientation;
    private ScrollScope outerStateScope;
    private OverscrollEffect overscrollEffect;
    private final ky performScrollForOverscroll;
    private boolean reverseDirection;
    private ScrollableState scrollableState;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, OnScrollChangedDispatcher onScrollChangedDispatcher, iy iyVar) {
        ScrollScope scrollScope;
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.onScrollChangedDispatcher = onScrollChangedDispatcher;
        this.isScrollableNodeAttached = iyVar;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.outerStateScope = scrollScope;
        this.nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public long mo491scrollByOzD1aCk(long j, int i) {
                ScrollScope scrollScope2;
                long m542performScroll3eAAhYA;
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                m542performScroll3eAAhYA = ScrollingLogic.this.m542performScroll3eAAhYA(scrollScope2, j, i);
                return m542performScroll3eAAhYA;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public long mo492scrollByWithOverscrollOzD1aCk(long j, int i) {
                OverscrollEffect overscrollEffect2;
                ScrollScope scrollScope2;
                long m542performScroll3eAAhYA;
                boolean shouldDispatchOverscroll;
                int i2;
                ky kyVar;
                ScrollingLogic.this.latestScrollSource = i;
                overscrollEffect2 = ScrollingLogic.this.overscrollEffect;
                if (overscrollEffect2 != null) {
                    shouldDispatchOverscroll = ScrollingLogic.this.getShouldDispatchOverscroll();
                    if (shouldDispatchOverscroll) {
                        i2 = ScrollingLogic.this.latestScrollSource;
                        kyVar = ScrollingLogic.this.performScrollForOverscroll;
                        return overscrollEffect2.mo206applyToScrollRhakbz0(j, i2, kyVar);
                    }
                }
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                m542performScroll3eAAhYA = ScrollingLogic.this.m542performScroll3eAAhYA(scrollScope2, j, i);
                return m542performScroll3eAAhYA;
            }
        };
        this.performScrollForOverscroll = new mb0(this, 15);
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m541dispatchRawDeltaMKHz9U(long j) {
        return m550toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m549toFloatk4lQ0M(j)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m542performScroll3eAAhYA(ScrollScope scrollScope, long j, int i) {
        long m5953dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m5953dispatchPreScrollOzD1aCk(j, i);
        long m4520minusMKHz9U = Offset.m4520minusMKHz9U(j, m5953dispatchPreScrollOzD1aCk);
        long m547reverseIfNeededMKHz9U = m547reverseIfNeededMKHz9U(m550toOffsettuRUvjQ(scrollScope.scrollBy(m549toFloatk4lQ0M(m547reverseIfNeededMKHz9U(m548singleAxisOffsetMKHz9U(m4520minusMKHz9U))))));
        this.onScrollChangedDispatcher.mo494dispatchScrollDeltaInfok4lQ0M(m547reverseIfNeededMKHz9U);
        return Offset.m4521plusMKHz9U(Offset.m4521plusMKHz9U(m5953dispatchPreScrollOzD1aCk, m547reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m5951dispatchPostScrollDzOQY0M(m547reverseIfNeededMKHz9U, Offset.m4520minusMKHz9U(m4520minusMKHz9U, m547reverseIfNeededMKHz9U), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset performScrollForOverscroll$lambda$0(ScrollingLogic scrollingLogic, Offset offset) {
        return Offset.m4505boximpl(scrollingLogic.m542performScroll3eAAhYA(scrollingLogic.outerStateScope, offset.m4526unboximpl(), scrollingLogic.latestScrollSource));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, myVar, hmVar);
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m543singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m7845copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m7845copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m544toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m7849getXimpl(j) : Velocity.m7850getYimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m545updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m7845copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m7845copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo522doFlingAnimationQWom1Mo(long j, hm hmVar) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        ScrollingLogic scrollingLogic;
        Throwable th;
        ii0 ii0Var;
        if (hmVar instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) hmVar;
            int i2 = scrollingLogic$doFlingAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollingLogic$doFlingAnimation$1.result;
                i = scrollingLogic$doFlingAnimation$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var2 = new ii0();
                    ii0Var2.d = j;
                    this.isFlinging = true;
                    try {
                        MutatePriority mutatePriority = MutatePriority.Default;
                        scrollingLogic = this;
                        try {
                            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(scrollingLogic, ii0Var2, j, null);
                            scrollingLogic$doFlingAnimation$1.L$0 = ii0Var2;
                            scrollingLogic$doFlingAnimation$1.label = 1;
                            Object scroll = scrollingLogic.scroll(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1);
                            vn vnVar = vn.d;
                            if (scroll == vnVar) {
                                return vnVar;
                            }
                            ii0Var = ii0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            scrollingLogic.isFlinging = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        scrollingLogic = this;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0Var = (ii0) scrollingLogic$doFlingAnimation$1.L$0;
                    try {
                        p10.Q(obj);
                        scrollingLogic = this;
                    } catch (Throwable th4) {
                        th = th4;
                        scrollingLogic = this;
                        scrollingLogic.isFlinging = false;
                        throw th;
                    }
                }
                scrollingLogic.isFlinging = false;
                return Velocity.m7840boximpl(ii0Var.d);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, hmVar);
        Object obj2 = scrollingLogic$doFlingAnimation$1.result;
        i = scrollingLogic$doFlingAnimation$1.label;
        if (i != 0) {
        }
        scrollingLogic.isFlinging = false;
        return Velocity.m7840boximpl(ii0Var.d);
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean isFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m546onScrollStoppedBMRW4eQ(long j, boolean z, hm hmVar) {
        boolean shouldBeTriggeredByMouseWheel;
        w01 w01Var = w01.a;
        if (z) {
            shouldBeTriggeredByMouseWheel = ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior);
            if (!shouldBeTriggeredByMouseWheel) {
                return w01Var;
            }
        }
        long m543singleAxisVelocityAH228Gc = m543singleAxisVelocityAH228Gc(j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        vn vnVar = vn.d;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object invoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m7840boximpl(m543singleAxisVelocityAH228Gc), hmVar);
            return invoke == vnVar ? invoke : w01Var;
        }
        Object mo205applyToFlingBMRW4eQ = overscrollEffect.mo205applyToFlingBMRW4eQ(m543singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, hmVar);
        return mo205applyToFlingBMRW4eQ == vnVar ? mo205applyToFlingBMRW4eQ : w01Var;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public long mo523performRawScrollMKHz9U(long j) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m4532getZeroF1C5BW0() : m541dispatchRawDeltaMKHz9U(j);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1.0f) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m547reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m4523timestuRUvjQ(j, -1.0f) : j;
    }

    public final Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, new ScrollingLogic$scroll$2(this, myVar, null), hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    public final void setScrollableState(ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m548singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m4510copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m4510copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m549toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m550toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    /* renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M, reason: not valid java name */
    public final float m551toSingleAxisDeltaFromAnglek4lQ0M(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.orientation;
        if (atan2 >= 0.7853981633974483d) {
            if (orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m552toVelocityadjELrA(float f) {
        return f == 0.0f ? Velocity.Companion.m7860getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, 0.0f) : VelocityKt.Velocity(0.0f, f);
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z2;
        boolean z3 = true;
        if (q10.b(this.scrollableState, scrollableState)) {
            z2 = false;
        } else {
            this.scrollableState = scrollableState;
            z2 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z2 = true;
        }
        if (this.reverseDirection != z) {
            this.reverseDirection = z;
        } else {
            z3 = z2;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z3;
    }
}
