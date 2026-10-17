package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$drag$1$1 extends us0 implements ny {
    final /* synthetic */ SliderState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(SliderState sliderState, hm hmVar) {
        super(3, hmVar);
        this.$state = sliderState;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((un) obj, ((Number) obj2).floatValue(), (hm) obj3);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.$state.getGestureEndAction$material3().invoke();
        return w01.a;
    }

    public final Object invoke(un unVar, float f, hm hmVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.$state, hmVar).invokeSuspend(w01.a);
    }
}
