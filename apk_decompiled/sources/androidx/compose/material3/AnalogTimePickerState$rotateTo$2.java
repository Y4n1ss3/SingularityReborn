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
@bq(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnalogTimePickerState$rotateTo$2 extends us0 implements ky {
    final /* synthetic */ float $angle;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    int label;
    final /* synthetic */ AnalogTimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$rotateTo$2(AnalogTimePickerState analogTimePickerState, float f, boolean z, AnimationSpec<Float> animationSpec, hm hmVar) {
        super(1, hmVar);
        this.this$0 = analogTimePickerState;
        this.$angle = f;
        this.$animate = z;
        this.$animationSpec = animationSpec;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new AnalogTimePickerState$rotateTo$2(this.this$0, this.$angle, this.$animate, this.$animationSpec, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((AnalogTimePickerState$rotateTo$2) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
    
        if (r13.snapTo(r1, r12) == r3) goto L28;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int minute;
        float f;
        int minute2;
        float offsetAngle;
        float endValueForAnimation;
        Animatable animatable;
        Animatable animatable2;
        float offsetAngle2;
        int hour;
        float f2;
        int hour2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            boolean m2673equalsimpl0 = TimePickerSelectionMode.m2673equalsimpl0(this.this$0.mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI());
            AnalogTimePickerState analogTimePickerState = this.this$0;
            if (m2673equalsimpl0) {
                hour = analogTimePickerState.toHour(this.$angle);
                analogTimePickerState.hourAngle = (hour % 12) * 0.5235988f;
                TimePickerState state = this.this$0.getState();
                AnalogTimePickerState analogTimePickerState2 = this.this$0;
                f2 = analogTimePickerState2.hourAngle;
                hour2 = analogTimePickerState2.toHour(f2);
                state.setHour((hour2 % 12) + (TimePickerKt.isPm(this.this$0) ? 12 : 0));
            } else {
                minute = analogTimePickerState.toMinute(this.$angle);
                analogTimePickerState.minuteAngle = minute * 0.10471976f;
                TimePickerState state2 = this.this$0.getState();
                AnalogTimePickerState analogTimePickerState3 = this.this$0;
                f = analogTimePickerState3.minuteAngle;
                minute2 = analogTimePickerState3.toMinute(f);
                state2.setMinute(minute2);
            }
            boolean z = this.$animate;
            AnalogTimePickerState analogTimePickerState4 = this.this$0;
            vn vnVar = vn.d;
            if (z) {
                offsetAngle = analogTimePickerState4.offsetAngle(this.$angle);
                endValueForAnimation = analogTimePickerState4.endValueForAnimation(offsetAngle);
                animatable = this.this$0.anim;
                Float f3 = new Float(endValueForAnimation);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                this.label = 2;
                Object animateTo$default = Animatable.animateTo$default(animatable, f3, animationSpec, null, null, this, 12, null);
                if (animateTo$default != vnVar) {
                    return animateTo$default;
                }
            } else {
                animatable2 = analogTimePickerState4.anim;
                offsetAngle2 = this.this$0.offsetAngle(this.$angle);
                Float f4 = new Float(offsetAngle2);
                this.label = 1;
            }
            return vnVar;
        }
        if (i != 1) {
            if (i == 2) {
                p10.Q(obj);
                return obj;
            }
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        return w01.a;
    }
}
