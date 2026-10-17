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
import defpackage.my;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ScrollingLogic2D implements ScrollLogic {
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final iy isScrollableNodeAttached;
    private int latestScrollSource = NestedScrollSource.Companion.m5969getUserInputWNlRxjI();
    private NestedScrollDispatcher nestedScrollDispatcher;
    private final ScrollingLogic2D$nestedScrollScope$1 nestedScrollScope;
    private Scroll2DScope outerStateScope;
    private OverscrollEffect overscrollEffect;
    private final ky performScrollForOverscroll;
    private Scrollable2DState scrollableState;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1] */
    public ScrollingLogic2D(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher, iy iyVar) {
        Scroll2DScope scroll2DScope;
        this.scrollableState = scrollable2DState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = iyVar;
        scroll2DScope = Scrollable2DKt.NoOpScrollScope;
        this.outerStateScope = scroll2DScope;
        this.nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public long mo491scrollByOzD1aCk(long j, int i) {
                Scroll2DScope scroll2DScope2;
                long m556performScroll3eAAhYA;
                scroll2DScope2 = ScrollingLogic2D.this.outerStateScope;
                m556performScroll3eAAhYA = ScrollingLogic2D.this.m556performScroll3eAAhYA(scroll2DScope2, j, i);
                return m556performScroll3eAAhYA;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public long mo492scrollByWithOverscrollOzD1aCk(long j, int i) {
                OverscrollEffect overscrollEffect2;
                Scroll2DScope scroll2DScope2;
                long m556performScroll3eAAhYA;
                int i2;
                ky kyVar;
                ScrollingLogic2D.this.latestScrollSource = i;
                overscrollEffect2 = ScrollingLogic2D.this.overscrollEffect;
                if (overscrollEffect2 == null || !ScrollingLogic2D.this.m559shouldDispatchOverscrollk4lQ0M(j)) {
                    scroll2DScope2 = ScrollingLogic2D.this.outerStateScope;
                    m556performScroll3eAAhYA = ScrollingLogic2D.this.m556performScroll3eAAhYA(scroll2DScope2, j, i);
                    return m556performScroll3eAAhYA;
                }
                i2 = ScrollingLogic2D.this.latestScrollSource;
                kyVar = ScrollingLogic2D.this.performScrollForOverscroll;
                return overscrollEffect2.mo206applyToScrollRhakbz0(j, i2, kyVar);
            }
        };
        this.performScrollForOverscroll = new p(this, 1);
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m555dispatchRawDeltaMKHz9U(long j) {
        return this.scrollableState.mo406dispatchRawDeltaMKHz9U(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long doFlingAnimation_QWom1Mo$toDecomposedOffset(float f, long j) {
        float m527getAngleTH1AsA0;
        float m527getAngleTH1AsA02;
        float m527getAngleTH1AsA03;
        m527getAngleTH1AsA0 = Scrollable2DKt.m527getAngleTH1AsA0(j);
        if (Float.isNaN(m527getAngleTH1AsA0)) {
            return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        }
        m527getAngleTH1AsA02 = Scrollable2DKt.m527getAngleTH1AsA0(j);
        float signum = Math.signum(Velocity.m7849getXimpl(j)) * Math.abs(((float) Math.cos(m527getAngleTH1AsA02)) * f);
        m527getAngleTH1AsA03 = Scrollable2DKt.m527getAngleTH1AsA0(j);
        float signum2 = Math.signum(Velocity.m7850getYimpl(j)) * Math.abs(((float) Math.sin(m527getAngleTH1AsA03)) * f);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(signum2) & 4294967295L) | (Float.floatToRawIntBits(signum) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long doFlingAnimation_QWom1Mo$toDecomposedVelocity(float f, long j) {
        float m527getAngleTH1AsA0;
        float m527getAngleTH1AsA02;
        float m527getAngleTH1AsA03;
        m527getAngleTH1AsA0 = Scrollable2DKt.m527getAngleTH1AsA0(j);
        if (Float.isNaN(m527getAngleTH1AsA0)) {
            return VelocityKt.Velocity(0.0f, f);
        }
        m527getAngleTH1AsA02 = Scrollable2DKt.m527getAngleTH1AsA0(j);
        float signum = Math.signum(Velocity.m7849getXimpl(j)) * Math.abs(((float) Math.cos(m527getAngleTH1AsA02)) * f);
        m527getAngleTH1AsA03 = Scrollable2DKt.m527getAngleTH1AsA0(j);
        return VelocityKt.Velocity(signum, Math.signum(Velocity.m7850getYimpl(j)) * Math.abs(((float) Math.sin(m527getAngleTH1AsA03)) * f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float doFlingAnimation_QWom1Mo$toMagnitudeFloat(long j) {
        return (float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat((int) (j >> 32)), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (j & 4294967295L)), 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m556performScroll3eAAhYA(Scroll2DScope scroll2DScope, long j, int i) {
        long m5953dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m5953dispatchPreScrollOzD1aCk(j, i);
        long m4520minusMKHz9U = Offset.m4520minusMKHz9U(j, m5953dispatchPreScrollOzD1aCk);
        long mo407scrollByMKHz9U = scroll2DScope.mo407scrollByMKHz9U(m4520minusMKHz9U);
        return Offset.m4521plusMKHz9U(Offset.m4521plusMKHz9U(m5953dispatchPreScrollOzD1aCk, mo407scrollByMKHz9U), this.nestedScrollDispatcher.m5951dispatchPostScrollDzOQY0M(mo407scrollByMKHz9U, Offset.m4520minusMKHz9U(m4520minusMKHz9U, mo407scrollByMKHz9U), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset performScrollForOverscroll$lambda$0(ScrollingLogic2D scrollingLogic2D, Offset offset) {
        return Offset.m4505boximpl(scrollingLogic2D.m556performScroll3eAAhYA(scrollingLogic2D.outerStateScope, offset.m4526unboximpl(), scrollingLogic2D.latestScrollSource));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic2D scrollingLogic2D, MutatePriority mutatePriority, my myVar, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic2D.scroll(mutatePriority, myVar, hmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo522doFlingAnimationQWom1Mo(long j, hm hmVar) {
        ScrollingLogic2D$doFlingAnimation$1 scrollingLogic2D$doFlingAnimation$1;
        int i;
        ScrollingLogic2D scrollingLogic2D;
        Throwable th;
        ii0 ii0Var;
        if (hmVar instanceof ScrollingLogic2D$doFlingAnimation$1) {
            scrollingLogic2D$doFlingAnimation$1 = (ScrollingLogic2D$doFlingAnimation$1) hmVar;
            int i2 = scrollingLogic2D$doFlingAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollingLogic2D$doFlingAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollingLogic2D$doFlingAnimation$1.result;
                i = scrollingLogic2D$doFlingAnimation$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var2 = new ii0();
                    ii0Var2.d = j;
                    this.isFlinging = true;
                    try {
                        MutatePriority mutatePriority = MutatePriority.Default;
                        scrollingLogic2D = this;
                        try {
                            ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new ScrollingLogic2D$doFlingAnimation$2(scrollingLogic2D, j, ii0Var2, null);
                            scrollingLogic2D$doFlingAnimation$1.L$0 = ii0Var2;
                            scrollingLogic2D$doFlingAnimation$1.label = 1;
                            Object scroll = scrollingLogic2D.scroll(mutatePriority, scrollingLogic2D$doFlingAnimation$2, scrollingLogic2D$doFlingAnimation$1);
                            vn vnVar = vn.d;
                            if (scroll == vnVar) {
                                return vnVar;
                            }
                            ii0Var = ii0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            scrollingLogic2D.isFlinging = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        scrollingLogic2D = this;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0Var = (ii0) scrollingLogic2D$doFlingAnimation$1.L$0;
                    try {
                        p10.Q(obj);
                        scrollingLogic2D = this;
                    } catch (Throwable th4) {
                        th = th4;
                        scrollingLogic2D = this;
                        scrollingLogic2D.isFlinging = false;
                        throw th;
                    }
                }
                scrollingLogic2D.isFlinging = false;
                return Velocity.m7840boximpl(ii0Var.d);
            }
        }
        scrollingLogic2D$doFlingAnimation$1 = new ScrollingLogic2D$doFlingAnimation$1(this, hmVar);
        Object obj2 = scrollingLogic2D$doFlingAnimation$1.result;
        i = scrollingLogic2D$doFlingAnimation$1.label;
        if (i != 0) {
        }
        scrollingLogic2D.isFlinging = false;
        return Velocity.m7840boximpl(ii0Var.d);
    }

    public final Scrollable2DState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean isFlinging() {
        return this.isFlinging;
    }

    /* renamed from: onScrollStopped-sF-c-tU, reason: not valid java name */
    public final Object m557onScrollStoppedsFctU(long j, hm hmVar) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        if (overscrollEffect == null || !m558shouldDispatchOverscrollTH1AsA0(j)) {
            Object invoke = scrollingLogic2D$onScrollStopped$performFling$1.invoke(Velocity.m7840boximpl(j), hmVar);
            return invoke == vnVar ? invoke : w01Var;
        }
        Object mo205applyToFlingBMRW4eQ = overscrollEffect.mo205applyToFlingBMRW4eQ(j, scrollingLogic2D$onScrollStopped$performFling$1, hmVar);
        return mo205applyToFlingBMRW4eQ == vnVar ? mo205applyToFlingBMRW4eQ : w01Var;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public long mo523performRawScrollMKHz9U(long j) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m4532getZeroF1C5BW0() : m555dispatchRawDeltaMKHz9U(j);
    }

    public final Object scroll(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, new ScrollingLogic2D$scroll$2(this, myVar, null), hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    public final void setScrollableState(Scrollable2DState scrollable2DState) {
        this.scrollableState = scrollable2DState;
    }

    /* renamed from: shouldDispatchOverscroll-TH1AsA0, reason: not valid java name */
    public final boolean m558shouldDispatchOverscrollTH1AsA0(long j) {
        Scrollable2DState scrollable2DState = this.scrollableState;
        float m7849getXimpl = Velocity.m7849getXimpl(j);
        float m7850getYimpl = Velocity.m7850getYimpl(j);
        return scrollable2DState.mo405canScrollk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(m7850getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m7849getXimpl) << 32)));
    }

    /* renamed from: shouldDispatchOverscroll-k-4lQ0M, reason: not valid java name */
    public final boolean m559shouldDispatchOverscrollk4lQ0M(long j) {
        return this.scrollableState.mo405canScrollk4lQ0M(j);
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    public final boolean update(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z;
        if (q10.b(this.scrollableState, scrollable2DState)) {
            z = false;
        } else {
            this.scrollableState = scrollable2DState;
            z = true;
        }
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z;
    }
}
