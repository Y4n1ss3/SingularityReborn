package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
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
@bq(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2", f = "AnimatedShape.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnimatedShapeState$animateToShape$2 extends us0 implements my {
    final /* synthetic */ CornerBasedShape $shape;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnimatedShapeState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$1", f = "AnimatedShape.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ CornerBasedShape $shape;
        int label;
        final /* synthetic */ AnimatedShapeState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, hm hmVar) {
            super(2, hmVar);
            this.this$0 = animatedShapeState;
            this.$shape = cornerBasedShape;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, this.$shape, hmVar);
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
                animatable = this.this$0.topStart;
                if (animatable != null) {
                    Float f = new Float(this.$shape.getTopStart().mo1047toPxTmRCtEA(this.this$0.m2885getSizeNHjbRc(), this.this$0.getDensity()));
                    FiniteAnimationSpec<Float> spec = this.this$0.getSpec();
                    this.label = 1;
                    obj = Animatable.animateTo$default(animatable, f, spec, null, null, this, 12, null);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
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
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$2", f = "AnimatedShape.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ CornerBasedShape $shape;
        int label;
        final /* synthetic */ AnimatedShapeState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, hm hmVar) {
            super(2, hmVar);
            this.this$0 = animatedShapeState;
            this.$shape = cornerBasedShape;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.this$0, this.$shape, hmVar);
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
                animatable = this.this$0.topEnd;
                if (animatable != null) {
                    Float f = new Float(this.$shape.getTopEnd().mo1047toPxTmRCtEA(this.this$0.m2885getSizeNHjbRc(), this.this$0.getDensity()));
                    FiniteAnimationSpec<Float> spec = this.this$0.getSpec();
                    this.label = 1;
                    obj = Animatable.animateTo$default(animatable, f, spec, null, null, this, 12, null);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
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
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$3", f = "AnimatedShape.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends us0 implements my {
        final /* synthetic */ CornerBasedShape $shape;
        int label;
        final /* synthetic */ AnimatedShapeState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, hm hmVar) {
            super(2, hmVar);
            this.this$0 = animatedShapeState;
            this.$shape = cornerBasedShape;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass3(this.this$0, this.$shape, hmVar);
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
                animatable = this.this$0.bottomStart;
                if (animatable != null) {
                    Float f = new Float(this.$shape.getBottomStart().mo1047toPxTmRCtEA(this.this$0.m2885getSizeNHjbRc(), this.this$0.getDensity()));
                    FiniteAnimationSpec<Float> spec = this.this$0.getSpec();
                    this.label = 1;
                    obj = Animatable.animateTo$default(animatable, f, spec, null, null, this, 12, null);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
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
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$4", f = "AnimatedShape.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$4, reason: invalid class name */
    public static final class AnonymousClass4 extends us0 implements my {
        final /* synthetic */ CornerBasedShape $shape;
        int label;
        final /* synthetic */ AnimatedShapeState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, hm hmVar) {
            super(2, hmVar);
            this.this$0 = animatedShapeState;
            this.$shape = cornerBasedShape;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass4(this.this$0, this.$shape, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass4) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                animatable = this.this$0.bottomEnd;
                if (animatable != null) {
                    Float f = new Float(this.$shape.getBottomEnd().mo1047toPxTmRCtEA(this.this$0.m2885getSizeNHjbRc(), this.this$0.getDensity()));
                    FiniteAnimationSpec<Float> spec = this.this$0.getSpec();
                    this.label = 1;
                    obj = Animatable.animateTo$default(animatable, f, spec, null, null, this, 12, null);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
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
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedShapeState$animateToShape$2(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, hm hmVar) {
        super(2, hmVar);
        this.this$0 = animatedShapeState;
        this.$shape = cornerBasedShape;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AnimatedShapeState$animateToShape$2 animatedShapeState$animateToShape$2 = new AnimatedShapeState$animateToShape$2(this.this$0, this.$shape, hmVar);
        animatedShapeState$animateToShape$2.L$0 = obj;
        return animatedShapeState$animateToShape$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AnimatedShapeState$animateToShape$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        p01.t(unVar, null, null, new AnonymousClass1(this.this$0, this.$shape, null), 3);
        p01.t(unVar, null, null, new AnonymousClass2(this.this$0, this.$shape, null), 3);
        p01.t(unVar, null, null, new AnonymousClass3(this.this$0, this.$shape, null), 3);
        return p01.t(unVar, null, null, new AnonymousClass4(this.this$0, this.$shape, null), 3);
    }
}
