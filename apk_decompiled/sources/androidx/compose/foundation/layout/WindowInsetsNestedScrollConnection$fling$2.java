package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2;
import defpackage.bq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {345}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$2 extends us0 implements my {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ gi0 $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {329}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ gi0 $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, float f, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i2, int i3, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, gi0 gi0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, hm hmVar) {
            super(2, hmVar);
            this.$current = i;
            this.$flingAmount = f;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i2;
            this.$shown = i3;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = gi0Var;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(int i, int i2, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, gi0 gi0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, float f, float f2) {
            z10 z10Var;
            float f3 = i;
            if (f > i2 || f3 > f) {
                gi0Var.d = f2;
                windowInsetsAnimationController.finish(z);
                windowInsetsNestedScrollConnection.animationController = null;
                z10Var = windowInsetsNestedScrollConnection.animationJob;
                if (z10Var != null) {
                    z10Var.cancel(new WindowInsetsAnimationCancelledException());
                }
            } else {
                windowInsetsNestedScrollConnection.adjustInsets(f);
            }
            return w01.a;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                float f = this.$current;
                float f2 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                final int i2 = this.$hidden;
                final int i3 = this.$shown;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                final gi0 gi0Var = this.$endVelocity;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
                final boolean z = this.$targetShown;
                my myVar = new my() { // from class: androidx.compose.foundation.layout.m
                    @Override // defpackage.my
                    public final Object invoke(Object obj2, Object obj3) {
                        w01 invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = WindowInsetsNestedScrollConnection$fling$2.AnonymousClass1.invokeSuspend$lambda$0(i2, i3, windowInsetsNestedScrollConnection, gi0Var, windowInsetsAnimationController, z, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        return invokeSuspend$lambda$0;
                    }
                };
                this.label = 1;
                Object animateDecay = SuspendAnimationKt.animateDecay(f, f2, splineBasedFloatDecayAnimationSpec, myVar, this);
                vn vnVar = vn.d;
                if (animateDecay == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, float f, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i2, int i3, gi0 gi0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, hm hmVar) {
        super(2, hmVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i;
        this.$flingAmount = f;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i2;
        this.$shown = i3;
        this.$endVelocity = gi0Var;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, hmVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        z10 z10Var;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            windowInsetsNestedScrollConnection.animationJob = p01.t(unVar, null, null, new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3);
            z10Var = this.this$0.animationJob;
            if (z10Var != null) {
                this.label = 1;
                Object n = z10Var.n(this);
                vn vnVar = vn.d;
                if (n == vnVar) {
                    return vnVar;
                }
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        this.this$0.animationJob = null;
        return w01.a;
    }
}
