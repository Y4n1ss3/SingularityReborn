package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1509}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputTapNode$1$2$1 extends us0 implements my {
    final /* synthetic */ Offset $it;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1$2$1(ClockDialNode clockDialNode, Offset offset, hm hmVar) {
        super(2, hmVar);
        this.this$0 = clockDialNode;
        this.$it = offset;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ClockDialNode$pointerInputTapNode$1$2$1(this.this$0, this.$it, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ClockDialNode$pointerInputTapNode$1$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AnalogTimePickerState analogTimePickerState;
        float maxDist;
        boolean z;
        long m1736getCenternOccac;
        AnimationSpec animationSpec;
        Object m2657onTapuYHVD98;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            analogTimePickerState = this.this$0.state;
            float intBitsToFloat = Float.intBitsToFloat((int) (this.$it.m4526unboximpl() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (this.$it.m4526unboximpl() & 4294967295L));
            maxDist = this.this$0.getMaxDist();
            z = this.this$0.autoSwitchToMinute;
            m1736getCenternOccac = this.this$0.m1736getCenternOccac();
            animationSpec = this.this$0.animationSpec;
            this.label = 1;
            m2657onTapuYHVD98 = TimePickerKt.m2657onTapuYHVD98(analogTimePickerState, intBitsToFloat, intBitsToFloat2, maxDist, z, m1736getCenternOccac, animationSpec, this);
            vn vnVar = vn.d;
            if (m2657onTapuYHVD98 == vnVar) {
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
