package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.runtime.MutableState;
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
@bq(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TimePickerKt$ClockText$2$1$1$1 extends us0 implements my {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ MutableState<Offset> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
    final /* synthetic */ AnalogTimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1$1$1(AnalogTimePickerState analogTimePickerState, float f, boolean z, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, hm hmVar) {
        super(2, hmVar);
        this.$state = analogTimePickerState;
        this.$maxDist = f;
        this.$autoSwitchToMinute = z;
        this.$center$delegate = mutableState;
        this.$parentCenter$delegate = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TimePickerKt$ClockText$2$1$1$1(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TimePickerKt$ClockText$2$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        long ClockText$lambda$64;
        long ClockText$lambda$642;
        long ClockText$lambda$67;
        Object m2657onTapuYHVD98;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            AnalogTimePickerState analogTimePickerState = this.$state;
            ClockText$lambda$64 = TimePickerKt.ClockText$lambda$64(this.$center$delegate);
            float intBitsToFloat = Float.intBitsToFloat((int) (ClockText$lambda$64 >> 32));
            ClockText$lambda$642 = TimePickerKt.ClockText$lambda$64(this.$center$delegate);
            float intBitsToFloat2 = Float.intBitsToFloat((int) (ClockText$lambda$642 & 4294967295L));
            float f = this.$maxDist;
            boolean z = this.$autoSwitchToMinute;
            ClockText$lambda$67 = TimePickerKt.ClockText$lambda$67(this.$parentCenter$delegate);
            SnapSpec snapSpec = new SnapSpec(0, 1, null);
            this.label = 1;
            m2657onTapuYHVD98 = TimePickerKt.m2657onTapuYHVD98(analogTimePickerState, intBitsToFloat, intBitsToFloat2, f, z, ClockText$lambda$67, snapSpec, this);
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
