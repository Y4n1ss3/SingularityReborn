package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", l = {1581}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClockDialNode$updateNode$1 extends us0 implements my {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ AnalogTimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$updateNode$1(AnalogTimePickerState analogTimePickerState, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(2, hmVar);
        this.$state = analogTimePickerState;
        this.$animationSpec = animationSpec;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ClockDialNode$updateNode$1(this.$state, this.$animationSpec, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ClockDialNode$updateNode$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnalogTimePickerState analogTimePickerState = this.$state;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            this.label = 1;
            Object animateToCurrent = analogTimePickerState.animateToCurrent(animationSpec, this);
            vn vnVar = vn.d;
            if (animateToCurrent == vnVar) {
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
