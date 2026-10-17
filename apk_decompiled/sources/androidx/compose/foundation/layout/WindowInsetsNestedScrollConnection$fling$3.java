package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$3 extends us0 implements my {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {355}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, hm hmVar) {
            super(2, hmVar);
            this.$current = i;
            this.$target = i2;
            this.$flingAmount = f;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
            this.this$0 = windowInsetsNestedScrollConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Animatable animatable) {
            windowInsetsNestedScrollConnection.adjustInsets(((Number) animatable.getValue()).floatValue());
            return w01.a;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                p10.Q(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float f = new Float(this.$target);
                Float f2 = new Float(this.$flingAmount);
                k kVar = new k(this.this$0, i2);
                this.label = 1;
                anonymousClass1 = this;
                Object animateTo$default = Animatable.animateTo$default(Animatable$default, f, null, f2, kVar, anonymousClass1, 2, null);
                vn vnVar = vn.d;
                if (animateTo$default == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                anonymousClass1 = this;
            }
            anonymousClass1.$animationController.finish(anonymousClass1.$targetShown);
            anonymousClass1.this$0.animationController = null;
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, hm hmVar) {
        super(2, hmVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i;
        this.$target = i2;
        this.$flingAmount = f;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, hmVar);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
        windowInsetsNestedScrollConnection.animationJob = p01.t(unVar, null, null, new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, windowInsetsNestedScrollConnection, null), 3);
        return w01.a;
    }
}
