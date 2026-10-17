package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {641}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FloatingActionButtonElevation$animateElevation$1$1 extends us0 implements my {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    int label;
    final /* synthetic */ FloatingActionButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, FloatingActionButtonElevation floatingActionButtonElevation, hm hmVar) {
        super(2, hmVar);
        this.$animatable = floatingActionButtonElevationAnimatable;
        this.this$0 = floatingActionButtonElevation;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.$animatable, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            f = this.this$0.defaultElevation;
            f2 = this.this$0.pressedElevation;
            f3 = this.this$0.hoveredElevation;
            f4 = this.this$0.focusedElevation;
            this.label = 1;
            Object m2005updateElevationlDy3nrA = floatingActionButtonElevationAnimatable.m2005updateElevationlDy3nrA(f, f2, f3, f4, this);
            vn vnVar = vn.d;
            if (m2005updateElevationlDy3nrA == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
