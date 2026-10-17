package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.fi0;
import defpackage.g5;
import defpackage.gi0;
import defpackage.hi0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ji0;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutScrollScopeKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m7611constructorimpl(2500.0f);
    private static final float BoundDistance = Dp.m7611constructorimpl(1500.0f);
    private static final float MinimumDistance = Dp.m7611constructorimpl(50.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3 A[Catch: ItemFoundInScroll -> 0x01e0, TryCatch #9 {ItemFoundInScroll -> 0x01e0, blocks: (B:25:0x00df, B:27:0x00e3, B:29:0x00e9, B:37:0x0116, B:40:0x014f, B:43:0x0157), top: B:24:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a9 -> B:21:0x01b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollToItem(LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, Density density, hm hmVar) {
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        int i4;
        vn vnVar;
        float f;
        LazyLayoutScrollScope lazyLayoutScrollScope2;
        int i5;
        int i6;
        int i7;
        float mo367toPx0680j_4;
        float mo367toPx0680j_42;
        float mo367toPx0680j_43;
        fi0 fi0Var;
        ji0 ji0Var;
        final int i8;
        final int i9;
        final float f2;
        final hi0 hi0Var;
        float f3;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$12;
        float f4;
        int i10;
        int i11;
        LazyLayoutScrollScope lazyLayoutScrollScope3;
        AnimationState copy$default;
        Float f5;
        int i12;
        g5 g5Var;
        LazyLayoutScrollScope lazyLayoutScrollScope4;
        int i13;
        int i14;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$13;
        float f6;
        final LazyLayoutScrollScope lazyLayoutScrollScope5;
        final int i15;
        final fi0 fi0Var2;
        final ji0 ji0Var2;
        float f7;
        int i16;
        if (hmVar instanceof LazyLayoutScrollScopeKt$animateScrollToItem$1) {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = (LazyLayoutScrollScopeKt$animateScrollToItem$1) hmVar;
            int i17 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                lazyLayoutScrollScopeKt$animateScrollToItem$1.label = i17 - Integer.MIN_VALUE;
                Object obj = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
                i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
                int i18 = 0;
                int i19 = 1;
                vnVar = vn.d;
                if (i4 != 0) {
                    f = 0.0f;
                    p10.Q(obj);
                    if (i < 0.0f) {
                        InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
                    }
                    try {
                        mo367toPx0680j_4 = density.mo367toPx0680j_4(TargetDistance);
                        mo367toPx0680j_42 = density.mo367toPx0680j_4(BoundDistance);
                        mo367toPx0680j_43 = density.mo367toPx0680j_4(MinimumDistance);
                        fi0Var = new fi0();
                        fi0Var.d = true;
                        ji0Var = new ji0();
                        ji0Var.d = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    } catch (ItemFoundInScroll e) {
                        e = e;
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                        i5 = 0;
                    }
                    if (isItemVisible(lazyLayoutScrollScope, i)) {
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                        i5 = 0;
                        try {
                            throw new ItemFoundInScroll(LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope2, i, 0, 2, null), (AnimationState) ji0Var.d);
                        } catch (ItemFoundInScroll e2) {
                            e = e2;
                            i6 = i2;
                            i7 = i;
                            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            float itemOffset = e.getItemOffset() + i6;
                            gi0 gi0Var = new gi0();
                            f5 = new Float(itemOffset);
                            if (((Number) copy$default.getVelocity()).floatValue() == f) {
                            }
                            g5Var = new g5(itemOffset, gi0Var, lazyLayoutScrollScope2, 1);
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
                            if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
                            }
                            return vnVar;
                        }
                    }
                    try {
                        int i20 = i > lazyLayoutScrollScope.getFirstVisibleItemIndex() ? 1 : 0;
                        hi0 hi0Var2 = new hi0();
                        hi0Var2.d = 1;
                        i8 = i2;
                        i9 = i3;
                        f2 = mo367toPx0680j_42;
                        hi0Var = hi0Var2;
                        f3 = mo367toPx0680j_4;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                        f4 = mo367toPx0680j_43;
                        i10 = i;
                        i11 = i20;
                        lazyLayoutScrollScope3 = lazyLayoutScrollScope;
                        if (fi0Var.d) {
                        }
                    } catch (ItemFoundInScroll e3) {
                        e = e3;
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                        i6 = i2;
                        i7 = i;
                        i5 = 0;
                        copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                        float itemOffset2 = e.getItemOffset() + i6;
                        gi0 gi0Var2 = new gi0();
                        f5 = new Float(itemOffset2);
                        if (((Number) copy$default.getVelocity()).floatValue() == f) {
                        }
                        g5Var = new g5(itemOffset2, gi0Var2, lazyLayoutScrollScope2, 1);
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
                        lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
                        if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
                        }
                        return vnVar;
                    }
                    return w01.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
                    i13 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
                    lazyLayoutScrollScope4 = (LazyLayoutScrollScope) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
                    p10.Q(obj);
                    lazyLayoutScrollScope4.snapToItem(i13, i14);
                    return w01.a;
                }
                i11 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$3;
                float f8 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$2;
                float f9 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$1;
                f3 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$0;
                int i21 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$2;
                int i22 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
                int i23 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
                hi0 hi0Var3 = (hi0) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3;
                f = 0.0f;
                ji0 ji0Var3 = (ji0) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2;
                fi0 fi0Var3 = (fi0) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1;
                LazyLayoutScrollScope lazyLayoutScrollScope6 = (LazyLayoutScrollScope) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
                try {
                    p10.Q(obj);
                    ji0Var = ji0Var3;
                    fi0Var = fi0Var3;
                    f2 = f9;
                    i8 = i22;
                    i10 = i23;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    f4 = f8;
                    lazyLayoutScrollScope3 = lazyLayoutScrollScope6;
                    try {
                        try {
                            hi0Var3.d++;
                        } catch (ItemFoundInScroll e4) {
                            e = e4;
                            i7 = i10;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                            i6 = i8;
                            i5 = 0;
                            lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
                            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            float itemOffset22 = e.getItemOffset() + i6;
                            gi0 gi0Var22 = new gi0();
                            f5 = new Float(itemOffset22);
                            if (((Number) copy$default.getVelocity()).floatValue() == f) {
                            }
                            g5Var = new g5(itemOffset22, gi0Var22, lazyLayoutScrollScope2, 1);
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
                            if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
                            }
                            return vnVar;
                        }
                    } catch (ItemFoundInScroll e5) {
                        e = e5;
                        i7 = i10;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                        i6 = i8;
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
                    }
                    i9 = i21;
                    hi0Var = hi0Var3;
                    i18 = 0;
                    i19 = 1;
                } catch (ItemFoundInScroll e6) {
                    e = e6;
                    lazyLayoutScrollScope2 = lazyLayoutScrollScope6;
                    i5 = 0;
                    i6 = i22;
                    i7 = i23;
                }
                if (fi0Var.d && lazyLayoutScrollScope3.getItemCount() > 0) {
                    try {
                        try {
                            try {
                                int calculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope3, i10, i18, 2, null) + i8;
                                if (Math.abs(calculateDistanceTo$default) >= f3) {
                                    f6 = i11 != 0 ? f3 : -f3;
                                } else {
                                    try {
                                        f6 = Math.max(Math.abs(calculateDistanceTo$default), f4);
                                        if (i11 == 0) {
                                            f6 = -f6;
                                        }
                                    } catch (ItemFoundInScroll e7) {
                                        e = e7;
                                        i7 = i10;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                                        i5 = i18;
                                        i6 = i8;
                                        lazyLayoutScrollScope2 = lazyLayoutScrollScope3;
                                        copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                        float itemOffset222 = e.getItemOffset() + i6;
                                        gi0 gi0Var222 = new gi0();
                                        f5 = new Float(itemOffset222);
                                        if (((Number) copy$default.getVelocity()).floatValue() == f) {
                                        }
                                        g5Var = new g5(itemOffset222, gi0Var222, lazyLayoutScrollScope2, 1);
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
                                        if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
                                        }
                                        return vnVar;
                                    }
                                }
                                AnimationState copy$default2 = AnimationStateKt.copy$default((AnimationState) ji0Var.d, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                ji0Var.d = copy$default2;
                                final gi0 gi0Var3 = new gi0();
                                Float f10 = new Float(f6);
                                boolean z = (((Number) ((AnimationState) ji0Var.d).getVelocity()).floatValue() != f ? i19 : i18) ^ i19;
                                final boolean z2 = i11 == 0 ? i19 : i18;
                                ky kyVar = new ky() { // from class: y30
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj2) {
                                        w01 animateScrollToItem$lambda$5;
                                        animateScrollToItem$lambda$5 = LazyLayoutScrollScopeKt.animateScrollToItem$lambda$5(LazyLayoutScrollScope.this, i15, r3, gi0Var3, fi0Var2, z2, f2, hi0Var, i9, i8, ji0Var2, (AnimationScope) obj2);
                                        return animateScrollToItem$lambda$5;
                                    }
                                };
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = lazyLayoutScrollScope2;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = fi0Var2;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = ji0Var2;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = hi0Var3;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i7;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i6;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$2 = i16;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.F$0 = f3;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.F$1 = f7;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.F$2 = f4;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$3 = i11;
                                lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 1;
                                if (SuspendAnimationKt.animateTo$default(copy$default2, f10, null, z, kyVar, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2, null) != vnVar) {
                                    ji0Var = ji0Var2;
                                    fi0Var = fi0Var2;
                                    lazyLayoutScrollScope3 = lazyLayoutScrollScope2;
                                    i10 = i7;
                                    i21 = i16;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    f2 = f7;
                                    i8 = i6;
                                    hi0Var3.d++;
                                    i9 = i21;
                                    hi0Var = hi0Var3;
                                    i18 = 0;
                                    i19 = 1;
                                    if (fi0Var.d) {
                                        int calculateDistanceTo$default2 = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope3, i10, i18, 2, null) + i8;
                                        if (Math.abs(calculateDistanceTo$default2) >= f3) {
                                        }
                                        AnimationState copy$default22 = AnimationStateKt.copy$default((AnimationState) ji0Var.d, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                        ji0Var.d = copy$default22;
                                        final gi0 gi0Var32 = new gi0();
                                        Float f102 = new Float(f6);
                                        boolean z3 = (((Number) ((AnimationState) ji0Var.d).getVelocity()).floatValue() != f ? i19 : i18) ^ i19;
                                        if (i11 == 0) {
                                        }
                                        lazyLayoutScrollScope5 = lazyLayoutScrollScope3;
                                        i15 = i10;
                                        fi0Var2 = fi0Var;
                                        ji0Var2 = ji0Var;
                                        final float f11 = f6;
                                        ky kyVar2 = new ky() { // from class: y30
                                            @Override // defpackage.ky
                                            public final Object invoke(Object obj2) {
                                                w01 animateScrollToItem$lambda$5;
                                                animateScrollToItem$lambda$5 = LazyLayoutScrollScopeKt.animateScrollToItem$lambda$5(LazyLayoutScrollScope.this, i15, f11, gi0Var32, fi0Var2, z2, f2, hi0Var, i9, i8, ji0Var2, (AnimationScope) obj2);
                                                return animateScrollToItem$lambda$5;
                                            }
                                        };
                                        lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
                                        i7 = i15;
                                        f7 = f2;
                                        hi0Var3 = hi0Var;
                                        i16 = i9;
                                        i6 = i8;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = lazyLayoutScrollScope2;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = fi0Var2;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = ji0Var2;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = hi0Var3;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i7;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i6;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$2 = i16;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.F$0 = f3;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.F$1 = f7;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.F$2 = f4;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$3 = i11;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 1;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                                        if (SuspendAnimationKt.animateTo$default(copy$default22, f102, null, z3, kyVar2, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2, null) != vnVar) {
                                        }
                                    }
                                }
                            } catch (ItemFoundInScroll e8) {
                                e = e8;
                                lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                                lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
                                i7 = i15;
                                i6 = i8;
                            }
                            lazyLayoutScrollScope5 = lazyLayoutScrollScope3;
                            i15 = i10;
                            fi0Var2 = fi0Var;
                            ji0Var2 = ji0Var;
                            final float f112 = f6;
                        } catch (ItemFoundInScroll e9) {
                            e = e9;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                            i5 = 0;
                            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            float itemOffset2222 = e.getItemOffset() + i6;
                            gi0 gi0Var2222 = new gi0();
                            f5 = new Float(itemOffset2222);
                            if (((Number) copy$default.getVelocity()).floatValue() == f) {
                            }
                            g5Var = new g5(itemOffset2222, gi0Var2222, lazyLayoutScrollScope2, 1);
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
                            if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
                            }
                            return vnVar;
                        }
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                    } catch (ItemFoundInScroll e10) {
                        e = e10;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$12;
                    }
                    lazyLayoutScrollScope2 = lazyLayoutScrollScope5;
                    i7 = i15;
                    f7 = f2;
                    hi0Var3 = hi0Var;
                    i16 = i9;
                    i6 = i8;
                    return vnVar;
                }
                return w01.a;
                copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                float itemOffset22222 = e.getItemOffset() + i6;
                gi0 gi0Var22222 = new gi0();
                f5 = new Float(itemOffset22222);
                i12 = ((Number) copy$default.getVelocity()).floatValue() == f ? 1 : i5;
                g5Var = new g5(itemOffset22222, gi0Var22222, lazyLayoutScrollScope2, 1);
                lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
                lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
                if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
                    lazyLayoutScrollScope4 = lazyLayoutScrollScope2;
                    i13 = i7;
                    i14 = i6;
                    lazyLayoutScrollScope4.snapToItem(i13, i14);
                    return w01.a;
                }
                return vnVar;
            }
        }
        lazyLayoutScrollScopeKt$animateScrollToItem$1 = new LazyLayoutScrollScopeKt$animateScrollToItem$1(hmVar);
        Object obj2 = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
        i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
        int i182 = 0;
        int i192 = 1;
        vnVar = vn.d;
        if (i4 != 0) {
        }
        copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        float itemOffset222222 = e.getItemOffset() + i6;
        gi0 gi0Var222222 = new gi0();
        f5 = new Float(itemOffset222222);
        if (((Number) copy$default.getVelocity()).floatValue() == f) {
        }
        g5Var = new g5(itemOffset222222, gi0Var222222, lazyLayoutScrollScope2, 1);
        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = lazyLayoutScrollScope2;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i7;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i6;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 2;
        if (SuspendAnimationKt.animateTo$default(copy$default, f5, null, i12 ^ 1, g5Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2, null) != vnVar) {
        }
        return vnVar;
    }

    private static final boolean animateScrollToItem$isOvershot(boolean z, LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2) {
        if (z) {
            if (lazyLayoutScrollScope.getFirstVisibleItemIndex() > i) {
                return true;
            }
            return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() > i2;
        }
        if (lazyLayoutScrollScope.getFirstVisibleItemIndex() < i) {
            return true;
        }
        return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() < i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v5 float, still in use, count: 2, list:
          (r8v5 float) from 0x003d: PHI (r8v6 float) = (r8v5 float), (r8v8 float), (r8v11 float) binds: [B:37:0x003a, B:7:0x002b, B:6:0x0029] A[DONT_GENERATE, DONT_INLINE]
          (r8v5 float) from 0x0038: CMP_G (r8v5 float), (r16v0 float) A[WRAPPED] (LINE:57)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.w01 animateScrollToItem$lambda$5(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r14, int r15, float r16, defpackage.gi0 r17, defpackage.fi0 r18, boolean r19, float r20, defpackage.hi0 r21, int r22, int r23, defpackage.ji0 r24, androidx.compose.animation.core.AnimationScope r25) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            boolean r8 = isItemVisible(r14, r15)
            r9 = 2
            w01 r10 = defpackage.w01.a
            r11 = 0
            if (r8 != 0) goto Lab
            r8 = 0
            int r8 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r8 <= 0) goto L2e
            java.lang.Object r8 = r25.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r12 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r12 <= 0) goto L3d
        L2b:
            r8 = r16
            goto L3d
        L2e:
            java.lang.Object r8 = r25.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r12 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r12 >= 0) goto L3d
            goto L2b
        L3d:
            float r12 = r1.d
            float r8 = r8 - r12
            float r12 = r14.scrollBy(r8)
            boolean r13 = isItemVisible(r14, r15)
            if (r13 == 0) goto L4b
            goto Lab
        L4b:
            boolean r13 = animateScrollToItem$isOvershot(r3, r14, r15, r7)
            if (r13 != 0) goto Lab
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 != 0) goto La5
            float r12 = r1.d
            float r12 = r12 + r8
            r1.d = r12
            if (r3 == 0) goto L6e
            java.lang.Object r1 = r25.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L80
            r25.cancelAnimation()
            goto L80
        L6e:
            java.lang.Object r1 = r25.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r4 = -r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L80
            r25.cancelAnimation()
        L80:
            if (r3 == 0) goto L94
            int r1 = r5.d
            if (r1 < r9) goto Lab
            int r1 = r14.getLastVisibleItemIndex()
            int r1 = r15 - r1
            if (r1 <= r6) goto Lab
            int r1 = r15 - r6
            r14.snapToItem(r1, r11)
            goto Lab
        L94:
            int r1 = r5.d
            if (r1 < r9) goto Lab
            int r1 = r14.getFirstVisibleItemIndex()
            int r1 = r1 - r15
            if (r1 <= r6) goto Lab
            int r1 = r15 + r6
            r14.snapToItem(r1, r11)
            goto Lab
        La5:
            r25.cancelAnimation()
            r2.d = r11
            return r10
        Lab:
            boolean r1 = animateScrollToItem$isOvershot(r3, r14, r15, r7)
            if (r1 == 0) goto Lba
            r14.snapToItem(r15, r7)
            r2.d = r11
            r25.cancelAnimation()
            return r10
        Lba:
            boolean r1 = isItemVisible(r14, r15)
            if (r1 != 0) goto Lc1
            return r10
        Lc1:
            r1 = 0
            int r14 = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.calculateDistanceTo$default(r14, r15, r11, r9, r1)
            androidx.compose.foundation.lazy.layout.ItemFoundInScroll r0 = new androidx.compose.foundation.lazy.layout.ItemFoundInScroll
            r1 = r24
            java.lang.Object r1 = r1.d
            androidx.compose.animation.core.AnimationState r1 = (androidx.compose.animation.core.AnimationState) r1
            r0.<init>(r14, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem$lambda$5(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, int, float, gi0, fi0, boolean, float, hi0, int, int, ji0, androidx.compose.animation.core.AnimationScope):w01");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0 < r2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 > r2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        r0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w01 animateScrollToItem$lambda$7(float f, gi0 gi0Var, LazyLayoutScrollScope lazyLayoutScrollScope, AnimationScope animationScope) {
        float floatValue;
        float f2 = 0.0f;
        if (f > 0.0f) {
            floatValue = ((Number) animationScope.getValue()).floatValue();
        } else if (f < 0.0f) {
            floatValue = ((Number) animationScope.getValue()).floatValue();
        }
        float f3 = f2 - gi0Var.d;
        if (f3 != lazyLayoutScrollScope.scrollBy(f3) || f2 != ((Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        gi0Var.d += f3;
        return w01.a;
    }

    public static final boolean isItemVisible(LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        return i <= lazyLayoutScrollScope.getLastVisibleItemIndex() && lazyLayoutScrollScope.getFirstVisibleItemIndex() <= i;
    }

    private static final void debugLog(iy iyVar) {
    }
}
