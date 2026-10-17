package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {804}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnalogTimePickerState$onGestureEnd$2 extends us0 implements ky {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $end;
    int label;
    final /* synthetic */ AnalogTimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$onGestureEnd$2(AnalogTimePickerState analogTimePickerState, float f, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(1, hmVar);
        this.this$0 = analogTimePickerState;
        this.$end = f;
        this.$animationSpec = animationSpec;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new AnalogTimePickerState$onGestureEnd$2(this.this$0, this.$end, this.$animationSpec, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((AnalogTimePickerState$onGestureEnd$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return obj;
            }
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        animatable = this.this$0.anim;
        Float f = new Float(this.$end);
        AnimationSpec<Float> animationSpec = this.$animationSpec;
        this.label = 1;
        Object animateTo$default = Animatable.animateTo$default(animatable, f, animationSpec, null, null, this, 12, null);
        vn vnVar = vn.d;
        return animateTo$default == vnVar ? vnVar : animateTo$default;
    }
}
