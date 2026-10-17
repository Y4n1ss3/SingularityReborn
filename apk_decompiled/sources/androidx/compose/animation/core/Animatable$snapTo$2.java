package androidx.compose.animation.core;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends us0 implements ky {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t, hm hmVar) {
        super(1, hmVar);
        this.this$0 = animatable;
        this.$targetValue = t;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((Animatable$snapTo$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object clampToBounds;
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.this$0.endAnimation();
        clampToBounds = this.this$0.clampToBounds(this.$targetValue);
        this.this$0.getInternalState$animation_core().setValue$animation_core(clampToBounds);
        this.this$0.setTargetValue(clampToBounds);
        return w01.a;
    }
}
