package androidx.compose.material3.internal;

import androidx.compose.foundation.shape.RoundedCornerShape;
import defpackage.bq;
import defpackage.hm;
import defpackage.jh;
import defpackage.my;
import defpackage.nf;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1", f = "AnimatedShape.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnimatedShapeKt$rememberAnimatedShape$3$1 extends us0 implements my {
    final /* synthetic */ zg $channel;
    final /* synthetic */ AnimatedShapeState $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1", f = "AnimatedShape.kt", l = {142}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ RoundedCornerShape $newTarget;
        final /* synthetic */ AnimatedShapeState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnimatedShapeState animatedShapeState, RoundedCornerShape roundedCornerShape, hm hmVar) {
            super(2, hmVar);
            this.$state = animatedShapeState;
            this.$newTarget = roundedCornerShape;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$state, this.$newTarget, hmVar);
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
                AnimatedShapeState animatedShapeState = this.$state;
                RoundedCornerShape roundedCornerShape = this.$newTarget;
                this.label = 1;
                Object animateToShape = animatedShapeState.animateToShape(roundedCornerShape, this);
                vn vnVar = vn.d;
                if (animateToShape == vnVar) {
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
    public AnimatedShapeKt$rememberAnimatedShape$3$1(zg zgVar, AnimatedShapeState animatedShapeState, hm hmVar) {
        super(2, hmVar);
        this.$channel = zgVar;
        this.$state = animatedShapeState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AnimatedShapeKt$rememberAnimatedShape$3$1 animatedShapeKt$rememberAnimatedShape$3$1 = new AnimatedShapeKt$rememberAnimatedShape$3$1(this.$channel, this.$state, hmVar);
        animatedShapeKt$rememberAnimatedShape$3$1.L$0 = obj;
        return animatedShapeKt$rememberAnimatedShape$3$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AnimatedShapeKt$rememberAnimatedShape$3$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
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
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) it.c();
                Object g = this.$channel.g();
                if (g instanceof jh) {
                    g = null;
                }
                RoundedCornerShape roundedCornerShape2 = (RoundedCornerShape) g;
                if (roundedCornerShape2 != null) {
                    roundedCornerShape = roundedCornerShape2;
                }
                p01.t(unVar, null, null, new AnonymousClass1(this.$state, roundedCornerShape, null), 3);
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
