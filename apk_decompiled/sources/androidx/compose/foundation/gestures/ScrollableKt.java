package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Density;
import defpackage.gi0;
import defpackage.hm;
import defpackage.in;
import defpackage.jn;
import defpackage.kl0;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final double VerticalAxisThresholdAngle = 0.7853981633974483d;
    private static final ky CanDragCalculation = new kl0(23);
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f) {
            return f;
        }
    };
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
        public /* bridge */ <R> R fold(R r, my myVar) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r, myVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
        public /* bridge */ <E extends in> E get(jn jnVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, jnVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
        public /* bridge */ kn minusKey(jn jnVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, jnVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
        public /* bridge */ kn plus(kn knVar) {
            return MotionDurationScale.DefaultImpls.plus(this, knVar);
        }
    };
    private static final Density UnityDensity = new Density() { // from class: androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1
        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CanDragCalculation$lambda$0(PointerType pointerType) {
        return !(pointerType == null ? false : PointerType.m6174equalsimpl0(pointerType.m6177unboximpl(), PointerType.Companion.m6179getMouseT8wyACA()));
    }

    public static final ky getCanDragCalculation() {
        return CanDragCalculation;
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldBeTriggeredByMouseWheel(FlingBehavior flingBehavior) {
        return !(flingBehavior instanceof ScrollableDefaultFlingBehavior);
    }

    public static final Density getUnityDensity() {
        return UnityDensity;
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        return modifier.then(new ScrollableElement(scrollableState, orientation, overscrollEffect, z, z2, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i, Object obj) {
        BringIntoViewSpec bringIntoViewSpec2;
        Modifier modifier2;
        ScrollableState scrollableState2;
        Orientation orientation2;
        OverscrollEffect overscrollEffect2;
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        boolean z4 = (i & 16) != 0 ? false : z2;
        FlingBehavior flingBehavior2 = (i & 32) != 0 ? null : flingBehavior;
        MutableInteractionSource mutableInteractionSource2 = (i & 64) != 0 ? null : mutableInteractionSource;
        if ((i & Fields.SpotShadowColor) != 0) {
            bringIntoViewSpec2 = null;
            modifier2 = modifier;
            orientation2 = orientation;
            overscrollEffect2 = overscrollEffect;
            scrollableState2 = scrollableState;
        } else {
            bringIntoViewSpec2 = bringIntoViewSpec;
            modifier2 = modifier;
            scrollableState2 = scrollableState;
            orientation2 = orientation;
            overscrollEffect2 = overscrollEffect;
        }
        return scrollable(modifier2, scrollableState2, orientation2, overscrollEffect2, z3, z4, flingBehavior2, mutableInteractionSource2, bringIntoViewSpec2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: semanticsScrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m532semanticsScrollByd4ec7I(ScrollingLogic scrollingLogic, long j, hm hmVar) {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        int i;
        gi0 gi0Var;
        ScrollingLogic scrollingLogic2;
        if (hmVar instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) hmVar;
            int i2 = scrollableKt$semanticsScrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableKt$semanticsScrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollableKt$semanticsScrollBy$1.result;
                i = scrollableKt$semanticsScrollBy$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    gi0Var = new gi0();
                    MutatePriority mutatePriority = MutatePriority.Default;
                    ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(scrollingLogic, j, gi0Var, null);
                    scrollableKt$semanticsScrollBy$1.L$0 = scrollingLogic;
                    scrollableKt$semanticsScrollBy$1.L$1 = gi0Var;
                    scrollableKt$semanticsScrollBy$1.label = 1;
                    Object scroll = scrollingLogic.scroll(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1);
                    vn vnVar = vn.d;
                    if (scroll == vnVar) {
                        return vnVar;
                    }
                    scrollingLogic2 = scrollingLogic;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gi0 gi0Var2 = (gi0) scrollableKt$semanticsScrollBy$1.L$1;
                    ScrollingLogic scrollingLogic3 = (ScrollingLogic) scrollableKt$semanticsScrollBy$1.L$0;
                    p10.Q(obj);
                    gi0Var = gi0Var2;
                    scrollingLogic2 = scrollingLogic3;
                }
                return Offset.m4505boximpl(scrollingLogic2.m550toOffsettuRUvjQ(gi0Var.d));
            }
        }
        scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(hmVar);
        Object obj2 = scrollableKt$semanticsScrollBy$1.result;
        i = scrollableKt$semanticsScrollBy$1.label;
        if (i != 0) {
        }
        return Offset.m4505boximpl(scrollingLogic2.m550toOffsettuRUvjQ(gi0Var.d));
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        return scrollable$default(modifier, scrollableState, orientation, null, z, z2, flingBehavior, mutableInteractionSource, null, Fields.SpotShadowColor, null);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z3, z2, (i & 16) != 0 ? null : flingBehavior, (i & 32) != 0 ? null : mutableInteractionSource);
    }
}
