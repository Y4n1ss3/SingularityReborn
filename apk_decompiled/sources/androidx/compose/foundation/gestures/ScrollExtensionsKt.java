package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.geometry.Offset;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ii0;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollBy(ScrollableState scrollableState, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i;
        gi0 gi0Var;
        if (hmVar instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) hmVar;
            int i2 = scrollExtensionsKt$animateScrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label = i2 - Integer.MIN_VALUE;
                ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$12 = scrollExtensionsKt$animateScrollBy$1;
                Object obj = scrollExtensionsKt$animateScrollBy$12.result;
                i = scrollExtensionsKt$animateScrollBy$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    gi0 gi0Var2 = new gi0();
                    ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f, animationSpec, gi0Var2, null);
                    scrollExtensionsKt$animateScrollBy$12.L$0 = gi0Var2;
                    scrollExtensionsKt$animateScrollBy$12.label = 1;
                    Object scroll$default = ScrollableState.scroll$default(scrollableState, null, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$12, 1, null);
                    vn vnVar = vn.d;
                    if (scroll$default == vnVar) {
                        return vnVar;
                    }
                    gi0Var = gi0Var2;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gi0Var = (gi0) scrollExtensionsKt$animateScrollBy$12.L$0;
                    p10.Q(obj);
                }
                return new Float(gi0Var.d);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(hmVar);
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$122 = scrollExtensionsKt$animateScrollBy$1;
        Object obj2 = scrollExtensionsKt$animateScrollBy$122.result;
        i = scrollExtensionsKt$animateScrollBy$122.label;
        if (i != 0) {
        }
        return new Float(gi0Var.d);
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f, AnimationSpec animationSpec, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, hmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: animateScrollBy-ubNVwUQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m519animateScrollByubNVwUQ(Scrollable2DState scrollable2DState, long j, AnimationSpec<Offset> animationSpec, hm hmVar) {
        ScrollExtensionsKt$animateScrollBy$3 scrollExtensionsKt$animateScrollBy$3;
        int i;
        ii0 ii0Var;
        if (hmVar instanceof ScrollExtensionsKt$animateScrollBy$3) {
            scrollExtensionsKt$animateScrollBy$3 = (ScrollExtensionsKt$animateScrollBy$3) hmVar;
            int i2 = scrollExtensionsKt$animateScrollBy$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$3.label = i2 - Integer.MIN_VALUE;
                ScrollExtensionsKt$animateScrollBy$3 scrollExtensionsKt$animateScrollBy$32 = scrollExtensionsKt$animateScrollBy$3;
                Object obj = scrollExtensionsKt$animateScrollBy$32.result;
                i = scrollExtensionsKt$animateScrollBy$32.label;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var2 = new ii0();
                    ii0Var2.d = Offset.Companion.m4532getZeroF1C5BW0();
                    ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new ScrollExtensionsKt$animateScrollBy$4(j, animationSpec, ii0Var2, null);
                    scrollExtensionsKt$animateScrollBy$32.L$0 = ii0Var2;
                    scrollExtensionsKt$animateScrollBy$32.label = 1;
                    Object scroll$default = Scrollable2DState.scroll$default(scrollable2DState, null, scrollExtensionsKt$animateScrollBy$4, scrollExtensionsKt$animateScrollBy$32, 1, null);
                    vn vnVar = vn.d;
                    if (scroll$default == vnVar) {
                        return vnVar;
                    }
                    ii0Var = ii0Var2;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0Var = (ii0) scrollExtensionsKt$animateScrollBy$32.L$0;
                    p10.Q(obj);
                }
                return Offset.m4505boximpl(ii0Var.d);
            }
        }
        scrollExtensionsKt$animateScrollBy$3 = new ScrollExtensionsKt$animateScrollBy$3(hmVar);
        ScrollExtensionsKt$animateScrollBy$3 scrollExtensionsKt$animateScrollBy$322 = scrollExtensionsKt$animateScrollBy$3;
        Object obj2 = scrollExtensionsKt$animateScrollBy$322.result;
        i = scrollExtensionsKt$animateScrollBy$322.label;
        if (i != 0) {
        }
        return Offset.m4505boximpl(ii0Var.d);
    }

    /* renamed from: animateScrollBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m520animateScrollByubNVwUQ$default(Scrollable2DState scrollable2DState, long j, AnimationSpec animationSpec, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return m519animateScrollByubNVwUQ(scrollable2DState, j, animationSpec, hmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollBy(ScrollableState scrollableState, float f, hm hmVar) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        int i;
        gi0 gi0Var;
        if (hmVar instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) hmVar;
            int i2 = scrollExtensionsKt$scrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.label = i2 - Integer.MIN_VALUE;
                ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$12 = scrollExtensionsKt$scrollBy$1;
                Object obj = scrollExtensionsKt$scrollBy$12.result;
                i = scrollExtensionsKt$scrollBy$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    gi0 gi0Var2 = new gi0();
                    ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(gi0Var2, f, null);
                    scrollExtensionsKt$scrollBy$12.L$0 = gi0Var2;
                    scrollExtensionsKt$scrollBy$12.label = 1;
                    Object scroll$default = ScrollableState.scroll$default(scrollableState, null, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$12, 1, null);
                    vn vnVar = vn.d;
                    if (scroll$default == vnVar) {
                        return vnVar;
                    }
                    gi0Var = gi0Var2;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gi0Var = (gi0) scrollExtensionsKt$scrollBy$12.L$0;
                    p10.Q(obj);
                }
                return new Float(gi0Var.d);
            }
        }
        scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(hmVar);
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$122 = scrollExtensionsKt$scrollBy$1;
        Object obj2 = scrollExtensionsKt$scrollBy$122.result;
        i = scrollExtensionsKt$scrollBy$122.label;
        if (i != 0) {
        }
        return new Float(gi0Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: scrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m521scrollByd4ec7I(Scrollable2DState scrollable2DState, long j, hm hmVar) {
        ScrollExtensionsKt$scrollBy$3 scrollExtensionsKt$scrollBy$3;
        int i;
        ii0 ii0Var;
        if (hmVar instanceof ScrollExtensionsKt$scrollBy$3) {
            scrollExtensionsKt$scrollBy$3 = (ScrollExtensionsKt$scrollBy$3) hmVar;
            int i2 = scrollExtensionsKt$scrollBy$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$3.label = i2 - Integer.MIN_VALUE;
                ScrollExtensionsKt$scrollBy$3 scrollExtensionsKt$scrollBy$32 = scrollExtensionsKt$scrollBy$3;
                Object obj = scrollExtensionsKt$scrollBy$32.result;
                i = scrollExtensionsKt$scrollBy$32.label;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var2 = new ii0();
                    ii0Var2.d = Offset.Companion.m4532getZeroF1C5BW0();
                    ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new ScrollExtensionsKt$scrollBy$4(ii0Var2, j, null);
                    scrollExtensionsKt$scrollBy$32.L$0 = ii0Var2;
                    scrollExtensionsKt$scrollBy$32.label = 1;
                    Object scroll$default = Scrollable2DState.scroll$default(scrollable2DState, null, scrollExtensionsKt$scrollBy$4, scrollExtensionsKt$scrollBy$32, 1, null);
                    vn vnVar = vn.d;
                    if (scroll$default == vnVar) {
                        return vnVar;
                    }
                    ii0Var = ii0Var2;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0Var = (ii0) scrollExtensionsKt$scrollBy$32.L$0;
                    p10.Q(obj);
                }
                return Offset.m4505boximpl(ii0Var.d);
            }
        }
        scrollExtensionsKt$scrollBy$3 = new ScrollExtensionsKt$scrollBy$3(hmVar);
        ScrollExtensionsKt$scrollBy$3 scrollExtensionsKt$scrollBy$322 = scrollExtensionsKt$scrollBy$3;
        Object obj2 = scrollExtensionsKt$scrollBy$322.result;
        i = scrollExtensionsKt$scrollBy$322.label;
        if (i != 0) {
        }
        return Offset.m4505boximpl(ii0Var.d);
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, hm hmVar) {
        Object scroll = scrollableState.scroll(mutatePriority, new ScrollExtensionsKt$stopScroll$2(null), hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, hmVar);
    }

    public static /* synthetic */ Object stopScroll$default(Scrollable2DState scrollable2DState, MutatePriority mutatePriority, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollable2DState, mutatePriority, hmVar);
    }

    public static final Object stopScroll(Scrollable2DState scrollable2DState, MutatePriority mutatePriority, hm hmVar) {
        Object scroll = scrollable2DState.scroll(mutatePriority, new ScrollExtensionsKt$stopScroll$4(null), hmVar);
        return scroll == vn.d ? scroll : w01.a;
    }
}
