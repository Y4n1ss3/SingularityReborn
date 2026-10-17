package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import defpackage.bq;
import defpackage.hm;
import defpackage.jh;
import defpackage.ky;
import defpackage.my;
import defpackage.nf;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends us0 implements my {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ zg $channel;
    final /* synthetic */ State<ky> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<ky> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(T t, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends ky> state2, hm hmVar) {
            super(2, hmVar);
            this.$newTarget = t;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            AnimationSpec animateValueAsState$lambda$5;
            AnonymousClass1 anonymousClass1;
            ky animateValueAsState$lambda$3;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                if (!q10.b(this.$newTarget, this.$animatable.getTargetValue())) {
                    Animatable<T, V> animatable = this.$animatable;
                    T t = this.$newTarget;
                    animateValueAsState$lambda$5 = AnimateAsStateKt.animateValueAsState$lambda$5(this.$animSpec$delegate);
                    this.label = 1;
                    anonymousClass1 = this;
                    Object animateTo$default = Animatable.animateTo$default(animatable, t, animateValueAsState$lambda$5, null, null, anonymousClass1, 12, null);
                    vn vnVar = vn.d;
                    if (animateTo$default == vnVar) {
                        return vnVar;
                    }
                }
                return w01.a;
            }
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            anonymousClass1 = this;
            animateValueAsState$lambda$3 = AnimateAsStateKt.animateValueAsState$lambda$3(anonymousClass1.$listener$delegate);
            if (animateValueAsState$lambda$3 != null) {
                animateValueAsState$lambda$3.invoke(anonymousClass1.$animatable.getValue());
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3$1(zg zgVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends ky> state2, hm hmVar) {
        super(2, hmVar);
        this.$channel = zgVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, hmVar);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nf it;
        un unVar;
        vn vnVar;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar2 = (un) this.L$0;
            it = this.$channel.iterator();
            unVar = unVar2;
            this.L$0 = unVar;
            this.L$1 = it;
            this.label = 1;
            obj = it.b(this);
            vnVar = vn.d;
            if (obj == vnVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (nf) this.L$1;
            unVar = (un) this.L$0;
            p10.Q(obj);
            if (((Boolean) obj).booleanValue()) {
                Object c = it.c();
                Object g = this.$channel.g();
                if (g instanceof jh) {
                    g = null;
                }
                p01.t(unVar, null, null, new AnonymousClass1(g == null ? c : g, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, null), 3);
                this.L$0 = unVar;
                this.L$1 = it;
                this.label = 1;
                obj = it.b(this);
                vnVar = vn.d;
                if (obj == vnVar) {
                    return vnVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return w01.a;
                }
            }
        }
    }
}
