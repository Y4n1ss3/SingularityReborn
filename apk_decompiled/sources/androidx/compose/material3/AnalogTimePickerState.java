package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.e10;
import defpackage.hm;
import defpackage.ky;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 8;
    private Animatable<Float, AnimationVector1D> anim;
    private final MutableState currentDiameter$delegate;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex;
    private final TimePickerState state;
    private final Ref<Boolean> userOverride;

    public AnalogTimePickerState(TimePickerState timePickerState, Ref<Boolean> ref) {
        this.state = timePickerState;
        this.userOverride = ref;
        this.currentDiameter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7609boximpl(Dp.m7611constructorimpl(0.0f)), null, 2, null);
        this.hourAngle = ((timePickerState.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (timePickerState.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        this.mutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float endValueForAnimation(float f) {
        float floatValue = this.anim.getValue().floatValue() - f;
        while (floatValue > 3.1415927f) {
            floatValue -= 6.2831855f;
        }
        while (floatValue <= -3.1415927f) {
            floatValue += 6.2831855f;
        }
        return this.anim.getValue().floatValue() - floatValue;
    }

    private final boolean isUpdated() {
        int mo1597getSelectionyecRtBI = mo1597getSelectionyecRtBI();
        TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.Companion;
        if (TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI, companion.m2677getHouryecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.hourAngle)) {
            return false;
        }
        return (TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI(), companion.m2678getMinuteyecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.minuteAngle)) ? false : true;
    }

    private final float normalize(float f) {
        double d = f % 6.283185307179586d;
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetAngle(float f) {
        float f2 = f + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    public static /* synthetic */ Object rotateTo$default(AnalogTimePickerState analogTimePickerState, float f, AnimationSpec animationSpec, boolean z, hm hmVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return analogTimePickerState.rotateTo(f, animationSpec, z, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f) {
        return ((int) ((f + 1.8325957218792777d) / 0.5235987901687622d)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f) {
        return ((int) ((f + 1.6231562058117728d) / 0.10471975803375244d)) % 60;
    }

    private final void updateBaseStateMinute() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            this.state.setMinute(getMinute());
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final Object animateToCurrent(AnimationSpec<Float> animationSpec, hm hmVar) {
        boolean isUpdated = isUpdated();
        w01 w01Var = w01.a;
        if (!isUpdated) {
            return w01Var;
        }
        Object mutate = this.mutex.mutate(MutatePriority.PreventUserInput, new AnalogTimePickerState$animateToCurrent$2(this, TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI()) ? endValueForAnimation(this.hourAngle) : endValueForAnimation(this.minuteAngle), animationSpec, null), hmVar);
        return mutate == vn.d ? mutate : w01Var;
    }

    public final e10 getClockFaceValues() {
        e10 e10Var;
        e10 e10Var2;
        if (TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI())) {
            e10Var2 = TimePickerKt.Minutes;
            return e10Var2;
        }
        e10Var = TimePickerKt.Hours;
        return e10Var;
    }

    public final float getCurrentAngle() {
        return this.anim.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDiameter-D9Ej5fM, reason: not valid java name */
    public final float m1596getCurrentDiameterD9Ej5fM() {
        return ((Dp) this.currentDiameter$delegate.getValue()).m7625unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI, reason: not valid java name */
    public int mo1597getSelectionyecRtBI() {
        return this.state.mo1597getSelectionyecRtBI();
    }

    public final TimePickerState getState() {
        return this.state;
    }

    public final Ref<Boolean> getUserOverride() {
        return this.userOverride;
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.state.is24hour();
    }

    public final Object onGestureEnd(AnimationSpec<Float> animationSpec, hm hmVar) {
        Object mutate = this.mutex.mutate(MutatePriority.PreventUserInput, new AnalogTimePickerState$onGestureEnd$2(this, endValueForAnimation(TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI()) ? this.hourAngle : this.minuteAngle), animationSpec, null), hmVar);
        return mutate == vn.d ? mutate : w01.a;
    }

    public final Object rotateTo(float f, AnimationSpec<Float> animationSpec, boolean z, hm hmVar) {
        this.userOverride.setValue(Boolean.FALSE);
        Object mutate = this.mutex.mutate(MutatePriority.UserInput, new AnalogTimePickerState$rotateTo$2(this, f, z, animationSpec, null), hmVar);
        return mutate == vn.d ? mutate : w01.a;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z) {
        this.state.set24hour(z);
    }

    /* renamed from: setCurrentDiameter-0680j_4, reason: not valid java name */
    public final void m1598setCurrentDiameter0680j_4(float f) {
        this.currentDiameter$delegate.setValue(Dp.m7609boximpl(f));
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i) {
        this.hourAngle = ((i % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(i);
        if (TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2677getHouryecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i) {
        this.minuteAngle = (i * 0.10471976f) - 1.5707964f;
        this.state.setMinute(i);
        if (TimePickerSelectionMode.m2673equalsimpl0(mo1597getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2678getMinuteyecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
        }
        updateBaseStateMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo1599setSelection6_8s6DQ(int i) {
        this.state.mo1599setSelection6_8s6DQ(i);
    }

    public /* synthetic */ AnalogTimePickerState(TimePickerState timePickerState, Ref ref, int i, dq dqVar) {
        this(timePickerState, (i & 2) != 0 ? new Ref() : ref);
    }
}
