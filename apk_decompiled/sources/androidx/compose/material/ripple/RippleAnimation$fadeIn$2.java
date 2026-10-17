package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
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
@bq(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class RippleAnimation$fadeIn$2 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleAnimation this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {86}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RippleAnimation rippleAnimation, hm hmVar) {
            super(2, hmVar);
            this.this$0 = rippleAnimation;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                animatable = this.this$0.animatedAlpha;
                Float f = new Float(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                Object animateTo$default = Animatable.animateTo$default(animatable, f, tween$default, null, null, this, 12, null);
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
            }
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {92}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RippleAnimation rippleAnimation, hm hmVar) {
            super(2, hmVar);
            this.this$0 = rippleAnimation;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                animatable = this.this$0.animatedRadiusPercent;
                Float f = new Float(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 1;
                Object animateTo$default = Animatable.animateTo$default(animatable, f, tween$default, null, null, this, 12, null);
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
            }
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {98}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends us0 implements my {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RippleAnimation rippleAnimation, hm hmVar) {
            super(2, hmVar);
            this.this$0 = rippleAnimation;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass3(this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass3) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                animatable = this.this$0.animatedCenterPercent;
                Float f = new Float(1.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                Object animateTo$default = Animatable.animateTo$default(animatable, f, tween$default, null, null, this, 12, null);
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
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, hm hmVar) {
        super(2, hmVar);
        this.this$0 = rippleAnimation;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.this$0, hmVar);
        rippleAnimation$fadeIn$2.L$0 = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((RippleAnimation$fadeIn$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        p01.t(unVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        p01.t(unVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return p01.t(unVar, null, null, new AnonymousClass3(this.this$0, null), 3);
    }
}
