package androidx.compose.foundation.gestures;

import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import defpackage.er;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class NoOpOverscrollEffect implements OverscrollEffect {
        public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

        private NoOpOverscrollEffect() {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToFling-BMRW4eQ */
        public Object mo205applyToFlingBMRW4eQ(long j, my myVar, hm hmVar) {
            Object invoke = myVar.invoke(Velocity.m7840boximpl(j), hmVar);
            return invoke == vn.d ? invoke : w01.a;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToScroll-Rhakbz0 */
        public long mo206applyToScrollRhakbz0(long j, int i, ky kyVar) {
            return ((Offset) kyVar.invoke(Offset.m4505boximpl(j))).m4526unboximpl();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public DelegatableNode getNode() {
            return new Modifier.Node() { // from class: androidx.compose.foundation.gestures.ScrollableDefaults$NoOpOverscrollEffect$node$1
            };
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }
    }

    private ScrollableDefaults() {
    }

    public final FlingBehavior flingBehavior(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:591)");
        }
        FlingBehavior rememberPlatformDefaultFlingBehavior = Scrollable_androidKt.rememberPlatformDefaultFlingBehavior(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberPlatformDefaultFlingBehavior;
    }

    @er
    public final OverscrollEffect overscrollEffect(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:608)");
        }
        OverscrollEffect rememberPlatformOverscrollEffect = AndroidOverscroll_androidKt.rememberPlatformOverscrollEffect(composer, 0);
        if (rememberPlatformOverscrollEffect == null) {
            rememberPlatformOverscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberPlatformOverscrollEffect;
    }

    public final boolean reverseDirection(LayoutDirection layoutDirection, Orientation orientation, boolean z) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z : z;
    }
}
