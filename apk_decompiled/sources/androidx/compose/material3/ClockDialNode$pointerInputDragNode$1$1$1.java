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
@bq(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1532}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputDragNode$1$1$1 extends us0 implements my {
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1$1$1(ClockDialNode clockDialNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = clockDialNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ClockDialNode$pointerInputDragNode$1$1$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ClockDialNode$pointerInputDragNode$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnalogTimePickerState analogTimePickerState;
        AnimationSpec<Float> animationSpec;
        AnalogTimePickerState analogTimePickerState2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            z = this.this$0.autoSwitchToMinute;
            if (z) {
                analogTimePickerState2 = this.this$0.state;
                analogTimePickerState2.mo1599setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI());
            }
            analogTimePickerState = this.this$0.state;
            animationSpec = this.this$0.animationSpec;
            this.label = 1;
            Object onGestureEnd = analogTimePickerState.onGestureEnd(animationSpec, this);
            vn vnVar = vn.d;
            if (onGestureEnd == vnVar) {
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
