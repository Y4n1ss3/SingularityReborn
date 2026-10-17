package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1539}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputDragNode$1$2$1 extends us0 implements my {
    final /* synthetic */ Offset $dragAmount;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1$2$1(ClockDialNode clockDialNode, Offset offset, hm hmVar) {
        super(2, hmVar);
        this.this$0 = clockDialNode;
        this.$dragAmount = offset;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ClockDialNode$pointerInputDragNode$1$2$1(this.this$0, this.$dragAmount, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ClockDialNode$pointerInputDragNode$1$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        AnalogTimePickerState analogTimePickerState;
        float f3;
        long m1736getCenternOccac;
        float f4;
        long m1736getCenternOccac2;
        float atan;
        AnimationSpec animationSpec;
        ClockDialNode$pointerInputDragNode$1$2$1 clockDialNode$pointerInputDragNode$1$2$1;
        AnalogTimePickerState analogTimePickerState2;
        float f5;
        float f6;
        float maxDist;
        long m1736getCenternOccac3;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            ClockDialNode clockDialNode = this.this$0;
            f = clockDialNode.offsetX;
            clockDialNode.offsetX = Float.intBitsToFloat((int) (this.$dragAmount.m4526unboximpl() >> 32)) + f;
            ClockDialNode clockDialNode2 = this.this$0;
            f2 = clockDialNode2.offsetY;
            clockDialNode2.offsetY = Float.intBitsToFloat((int) (this.$dragAmount.m4526unboximpl() & 4294967295L)) + f2;
            analogTimePickerState = this.this$0.state;
            f3 = this.this$0.offsetY;
            m1736getCenternOccac = this.this$0.m1736getCenternOccac();
            float m7740getYimpl = f3 - IntOffset.m7740getYimpl(m1736getCenternOccac);
            f4 = this.this$0.offsetX;
            m1736getCenternOccac2 = this.this$0.m1736getCenternOccac();
            atan = TimePickerKt.atan(m7740getYimpl, f4 - IntOffset.m7739getXimpl(m1736getCenternOccac2));
            animationSpec = this.this$0.animationSpec;
            this.label = 1;
            clockDialNode$pointerInputDragNode$1$2$1 = this;
            Object rotateTo$default = AnalogTimePickerState.rotateTo$default(analogTimePickerState, atan, animationSpec, false, clockDialNode$pointerInputDragNode$1$2$1, 4, null);
            vn vnVar = vn.d;
            if (rotateTo$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            clockDialNode$pointerInputDragNode$1$2$1 = this;
        }
        analogTimePickerState2 = clockDialNode$pointerInputDragNode$1$2$1.this$0.state;
        f5 = clockDialNode$pointerInputDragNode$1$2$1.this$0.offsetX;
        f6 = clockDialNode$pointerInputDragNode$1$2$1.this$0.offsetY;
        maxDist = clockDialNode$pointerInputDragNode$1$2$1.this$0.getMaxDist();
        m1736getCenternOccac3 = clockDialNode$pointerInputDragNode$1$2$1.this$0.m1736getCenternOccac();
        TimePickerKt.m2655moveSelectord3b8Pxo(analogTimePickerState2, f5, f6, maxDist, m1736getCenternOccac3);
        return w01.a;
    }
}
