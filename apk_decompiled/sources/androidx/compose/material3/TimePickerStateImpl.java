package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.qu0;
import defpackage.y80;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerStateImpl implements TimePickerState {
    public static final Companion Companion = new Companion(null);
    private final MutableIntState hourState;
    private boolean is24hour;
    private final MutableIntState minuteState;
    private final MutableState selection$delegate;

    public TimePickerStateImpl(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            defpackage.o.m("initialHour should in [0..23] range");
            throw null;
        }
        if (i2 < 0 || i2 >= 60) {
            defpackage.o.m("initialMinute should be in [0..59] range");
            throw null;
        }
        this.is24hour = z;
        this.selection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimePickerSelectionMode.m2670boximpl(TimePickerSelectionMode.Companion.m2677getHouryecRtBI()), null, 2, null);
        this.hourState = SnapshotIntStateKt.mutableIntStateOf(i);
        this.minuteState = SnapshotIntStateKt.mutableIntStateOf(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.hourState.getIntValue();
    }

    public final MutableIntState getHourState() {
        return this.hourState;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.minuteState.getIntValue();
    }

    public final MutableIntState getMinuteState() {
        return this.minuteState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI */
    public int mo1597getSelectionyecRtBI() {
        return ((TimePickerSelectionMode) this.selection$delegate.getValue()).m2676unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.is24hour;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z) {
        this.is24hour = z;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i) {
        this.hourState.setIntValue(i);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i) {
        this.minuteState.setIntValue(i);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ */
    public void mo1599setSelection6_8s6DQ(int i) {
        this.selection$delegate.setValue(TimePickerSelectionMode.m2670boximpl(i));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, TimePickerStateImpl timePickerStateImpl) {
            return y80.E(Integer.valueOf(timePickerStateImpl.getHour()), Integer.valueOf(timePickerStateImpl.getMinute()), Boolean.valueOf(timePickerStateImpl.is24hour()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TimePickerStateImpl Saver$lambda$1(List list) {
            Object obj = list.get(0);
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            int intValue2 = ((Integer) obj2).intValue();
            Object obj3 = list.get(2);
            obj3.getClass();
            return new TimePickerStateImpl(intValue, intValue2, ((Boolean) obj3).booleanValue());
        }

        public final Saver<TimePickerStateImpl, ?> Saver() {
            return SaverKt.Saver(new c(12), new qu0(10));
        }

        private Companion() {
        }
    }
}
