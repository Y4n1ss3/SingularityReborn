package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.iy;
import defpackage.ky;
import defpackage.n30;
import defpackage.ti;
import defpackage.ui;
import defpackage.w01;
import defpackage.y80;
import defpackage.yh0;
import defpackage.zh0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RangeSliderState {
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final MutableFloatState endThumbHeight$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final ky gestureEndAction;
    private final MutableState isDragging$delegate;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private ky onValueChange;
    private iy onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbHeight$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final ui valueRange;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RangeSliderState(float f, float f2, int i, iy iyVar, ui uiVar) {
        this.steps = i;
        this.onValueChangeFinished = iyVar;
        this.valueRange = uiVar;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        Boolean bool = Boolean.FALSE;
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isRtl$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.gestureEndAction = new yh0(this, 0);
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 gestureEndAction$lambda$0(RangeSliderState rangeSliderState, boolean z) {
        iy iyVar = rangeSliderState.onValueChangeFinished;
        if (iyVar != null) {
            iyVar.invoke();
        }
        return w01.a;
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState$delegate.getFloatValue();
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState$delegate.getFloatValue();
    }

    private final float getMaxPx() {
        return this.maxPx$delegate.getFloatValue();
    }

    private final float getMinPx() {
        return this.minPx$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f, float f2, float f3) {
        return SliderKt.scale(Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue(), f3, f, f2);
    }

    /* renamed from: scaleToUserValue-8bqG3aw, reason: not valid java name */
    private final long m2288scaleToUserValue8bqG3aw(boolean z, float f, float f2, long j) {
        return SliderKt.m2432scale2geJ7wY(z, f, f2, j, Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue());
    }

    private final void setActiveRangeEndState(float f) {
        this.activeRangeEndState$delegate.setFloatValue(f);
    }

    private final void setActiveRangeStartState(float f) {
        this.activeRangeStartState$delegate.setFloatValue(f);
    }

    private final void setMaxPx(float f) {
        this.maxPx$delegate.setFloatValue(f);
    }

    private final void setMinPx(float f) {
        this.minPx$delegate.setFloatValue(f);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3() {
        return SliderKt.calcFraction(Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue(), getActiveRangeEnd());
    }

    public final float getCoercedActiveRangeStartAsFraction$material3() {
        return SliderKt.calcFraction(Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue(), getActiveRangeStart());
    }

    public final int getEndSteps$material3() {
        return (int) Math.floor((1.0f - getCoercedActiveRangeStartAsFraction$material3()) * this.steps);
    }

    public final float getEndThumbHeight$material3() {
        return this.endThumbHeight$delegate.getFloatValue();
    }

    public final float getEndThumbWidth$material3() {
        return this.endThumbWidth$delegate.getFloatValue();
    }

    public final ky getGestureEndAction$material3() {
        return this.gestureEndAction;
    }

    public final ky getOnValueChange$material3() {
        return this.onValueChange;
    }

    public final iy getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final float getRawOffsetEnd$material3() {
        return this.rawOffsetEnd$delegate.getFloatValue();
    }

    public final float getRawOffsetStart$material3() {
        return this.rawOffsetStart$delegate.getFloatValue();
    }

    public final int getStartSteps$material3() {
        return (int) Math.floor(getCoercedActiveRangeEndAsFraction$material3() * this.steps);
    }

    public final float getStartThumbHeight$material3() {
        return this.startThumbHeight$delegate.getFloatValue();
    }

    public final float getStartThumbWidth$material3() {
        return this.startThumbWidth$delegate.getFloatValue();
    }

    public final int getSteps() {
        return this.steps;
    }

    public final float[] getTickFractions$material3() {
        return this.tickFractions;
    }

    public final int getTotalWidth$material3() {
        return this.totalWidth$delegate.getIntValue();
    }

    public final ui getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3() {
        return ((Boolean) this.isRtl$delegate.getValue()).booleanValue();
    }

    public final void onDrag$material3(boolean z, float f) {
        long SliderRange;
        if (z) {
            setRawOffsetStart$material3(getRawOffsetStart$material3() + f);
            setRawOffsetEnd$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3 = getRawOffsetEnd$material3();
            float snapValueToTick = SliderKt.snapValueToTick(y80.g(getRawOffsetStart$material3(), getMinPx(), rawOffsetEnd$material3), this.tickFractions, getMinPx(), getMaxPx());
            if (snapValueToTick > rawOffsetEnd$material3) {
                snapValueToTick = rawOffsetEnd$material3;
            }
            SliderRange = SliderKt.SliderRange(snapValueToTick, rawOffsetEnd$material3);
        } else {
            setRawOffsetEnd$material3(getRawOffsetEnd$material3() + f);
            setRawOffsetStart$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3 = getRawOffsetStart$material3();
            float snapValueToTick2 = SliderKt.snapValueToTick(y80.g(getRawOffsetEnd$material3(), rawOffsetStart$material3, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx());
            if (snapValueToTick2 < rawOffsetStart$material3) {
                snapValueToTick2 = rawOffsetStart$material3;
            }
            SliderRange = SliderKt.SliderRange(rawOffsetStart$material3, snapValueToTick2);
        }
        long m2288scaleToUserValue8bqG3aw = m2288scaleToUserValue8bqG3aw(z, getMinPx(), getMaxPx(), SliderRange);
        if (SliderRange.m2438equalsimpl0(m2288scaleToUserValue8bqG3aw, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        ky kyVar = this.onValueChange;
        if (kyVar == null) {
            setActiveRangeStart(SliderRange.m2440getStartimpl(m2288scaleToUserValue8bqG3aw));
            setActiveRangeEnd(SliderRange.m2439getEndInclusiveimpl(m2288scaleToUserValue8bqG3aw));
        } else if (kyVar != null) {
            kyVar.invoke(SliderRange.m2435boximpl(m2288scaleToUserValue8bqG3aw));
        }
    }

    public final void setActiveRangeEnd(float f) {
        setActiveRangeEndState(SliderKt.snapValueToTick(y80.g(f, getActiveRangeStart(), Float.valueOf(((ti) this.valueRange).b).floatValue()), this.tickFractions, Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue()));
    }

    public final void setActiveRangeStart(float f) {
        setActiveRangeStartState(SliderKt.snapValueToTick(y80.g(f, Float.valueOf(((ti) this.valueRange).a).floatValue(), getActiveRangeEnd()), this.tickFractions, Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue()));
    }

    public final void setDragging$material3(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setEndThumbHeight$material3(float f) {
        this.endThumbHeight$delegate.setFloatValue(f);
    }

    public final void setEndThumbWidth$material3(float f) {
        this.endThumbWidth$delegate.setFloatValue(f);
    }

    public final void setOnValueChange$material3(ky kyVar) {
        this.onValueChange = kyVar;
    }

    public final void setOnValueChangeFinished(iy iyVar) {
        this.onValueChangeFinished = iyVar;
    }

    public final void setRawOffsetEnd$material3(float f) {
        this.rawOffsetEnd$delegate.setFloatValue(f);
    }

    public final void setRawOffsetStart$material3(float f) {
        this.rawOffsetStart$delegate.setFloatValue(f);
    }

    public final void setRtl$material3(boolean z) {
        this.isRtl$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setStartThumbHeight$material3(float f) {
        this.startThumbHeight$delegate.setFloatValue(f);
    }

    public final void setStartThumbWidth$material3(float f) {
        this.startThumbWidth$delegate.setFloatValue(f);
    }

    public final void setTotalWidth$material3(int i) {
        this.totalWidth$delegate.setIntValue(i);
    }

    public final void updateMinMaxPx$material3() {
        float max = Math.max(getTotalWidth$material3() - (getEndThumbWidth$material3() / 2.0f), 0.0f);
        float min = Math.min(getStartThumbWidth$material3() / 2.0f, max);
        if (isDragging$material3()) {
            return;
        }
        if (getMinPx() == min && getMaxPx() == max && getActiveRangeStart() == getActiveRangeEnd()) {
            return;
        }
        setMinPx(min);
        setMaxPx(max);
        setRawOffsetStart$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, RangeSliderState rangeSliderState) {
            return y80.E(Float.valueOf(rangeSliderState.getActiveRangeStart()), Float.valueOf(rangeSliderState.getActiveRangeEnd()), Integer.valueOf(rangeSliderState.getSteps()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RangeSliderState Saver$lambda$1(iy iyVar, ui uiVar, List list) {
            Object obj = list.get(0);
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            float floatValue2 = ((Float) obj2).floatValue();
            Object obj3 = list.get(2);
            obj3.getClass();
            return new RangeSliderState(floatValue, floatValue2, ((Integer) obj3).intValue(), iyVar, uiVar);
        }

        public final Saver<RangeSliderState, ?> Saver(iy iyVar, ui uiVar) {
            return ListSaverKt.listSaver(new n30(9), new zh0(iyVar, uiVar, 0));
        }

        private Companion() {
        }
    }

    public RangeSliderState(float f, float f2, int i, iy iyVar, ui uiVar, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : iyVar, (i2 & 16) != 0 ? new ti(0.0f, 1.0f) : uiVar);
    }

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }
}
