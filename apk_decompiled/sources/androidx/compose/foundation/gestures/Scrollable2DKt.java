package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.ii0;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Scrollable2DKt {
    private static final Scroll2DScope NoOpScrollScope = new Scroll2DScope() { // from class: androidx.compose.foundation.gestures.Scrollable2DKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.Scroll2DScope
        /* renamed from: scrollBy-MK-Hz9U */
        public long mo407scrollByMKHz9U(long j) {
            return j;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAngle-TH1AsA0, reason: not valid java name */
    public static final float m527getAngleTH1AsA0(long j) {
        return (float) Math.atan2(Velocity.m7850getYimpl(j), Velocity.m7849getXimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMagnitude-TH1AsA0, reason: not valid java name */
    public static final float m528getMagnitudeTH1AsA0(long j) {
        return (float) Math.sqrt(((float) Math.pow(Velocity.m7849getXimpl(j), 2.0d)) + ((float) Math.pow(Velocity.m7850getYimpl(j), 2.0d)));
    }

    public static final Modifier scrollable2D(Modifier modifier, Scrollable2DState scrollable2DState, boolean z, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        return modifier.then(new Scrollable2DElement(scrollable2DState, overscrollEffect, z, flingBehavior, mutableInteractionSource));
    }

    public static /* synthetic */ Modifier scrollable2D$default(Modifier modifier, Scrollable2DState scrollable2DState, boolean z, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return scrollable2D(modifier, scrollable2DState, z, (i & 4) != 0 ? null : overscrollEffect, (i & 8) != 0 ? null : flingBehavior, (i & 16) != 0 ? null : mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: semanticsScrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m529semanticsScrollByd4ec7I(ScrollingLogic2D scrollingLogic2D, long j, hm hmVar) {
        Scrollable2DKt$semanticsScrollBy$1 scrollable2DKt$semanticsScrollBy$1;
        int i;
        ii0 ii0Var;
        if (hmVar instanceof Scrollable2DKt$semanticsScrollBy$1) {
            scrollable2DKt$semanticsScrollBy$1 = (Scrollable2DKt$semanticsScrollBy$1) hmVar;
            int i2 = scrollable2DKt$semanticsScrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollable2DKt$semanticsScrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollable2DKt$semanticsScrollBy$1.result;
                i = scrollable2DKt$semanticsScrollBy$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var2 = new ii0();
                    ii0Var2.d = Offset.Companion.m4532getZeroF1C5BW0();
                    MutatePriority mutatePriority = MutatePriority.Default;
                    my scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(j, ii0Var2, null);
                    scrollable2DKt$semanticsScrollBy$1.L$0 = ii0Var2;
                    scrollable2DKt$semanticsScrollBy$1.label = 1;
                    Object scroll = scrollingLogic2D.scroll(mutatePriority, scrollable2DKt$semanticsScrollBy$2, scrollable2DKt$semanticsScrollBy$1);
                    Object obj2 = vn.d;
                    if (scroll == obj2) {
                        return obj2;
                    }
                    ii0Var = ii0Var2;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0Var = (ii0) scrollable2DKt$semanticsScrollBy$1.L$0;
                    p10.Q(obj);
                }
                return Offset.m4505boximpl(ii0Var.d);
            }
        }
        scrollable2DKt$semanticsScrollBy$1 = new Scrollable2DKt$semanticsScrollBy$1(hmVar);
        Object obj3 = scrollable2DKt$semanticsScrollBy$1.result;
        i = scrollable2DKt$semanticsScrollBy$1.label;
        if (i != 0) {
        }
        return Offset.m4505boximpl(ii0Var.d);
    }
}
