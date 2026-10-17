package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
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
import defpackage.hm;
import defpackage.hm0;
import defpackage.iy;
import defpackage.ky;
import defpackage.ll0;
import defpackage.my;
import defpackage.p10;
import defpackage.ti;
import defpackage.ui;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.zh0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderState implements DraggableState {
    private final DragScope dragScope;
    private final iy gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private ky onValueChange;
    private iy onValueChangeFinished;
    private Orientation orientation;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private boolean reverseVerticalDirection;
    private final MutatorMutex scrollMutex;
    private boolean shouldAutoSnap;
    private final int steps;
    private final MutableIntState thumbHeight$delegate;
    private final MutableIntState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalHeight$delegate;
    private final MutableIntState totalWidth$delegate;
    private final ui valueRange;
    private final MutableFloatState valueState$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public SliderState(float f, int i, iy iyVar, ui uiVar) {
        this.steps = i;
        this.onValueChangeFinished = iyVar;
        this.valueRange = uiVar;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.shouldAutoSnap = true;
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.totalHeight$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbHeight$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.orientation = Orientation.Horizontal;
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new hm0(this, 7);
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f2) {
                SliderState.this.dispatchRawDelta(f2);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    private final float calculateSnappedValue(float f) {
        return SliderKt.snapValueToTick(y80.g(f, Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue()), this.tickFractions, Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 gestureEndAction$lambda$1(SliderState sliderState) {
        iy iyVar;
        if (!sliderState.isDragging() && (iyVar = sliderState.onValueChangeFinished) != null) {
            iyVar.invoke();
        }
        return w01.a;
    }

    private final float getPressOffset() {
        return this.pressOffset$delegate.getFloatValue();
    }

    private final float getRawOffset() {
        return this.rawOffset$delegate.getFloatValue();
    }

    private final int getTotalHeight() {
        return this.totalHeight$delegate.getIntValue();
    }

    private final int getTotalWidth() {
        return this.totalWidth$delegate.getIntValue();
    }

    private final float getValueState() {
        return this.valueState$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f, float f2, float f3) {
        return SliderKt.scale(Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue(), f3, f, f2);
    }

    private final float scaleToUserValue(float f, float f2, float f3) {
        return SliderKt.scale(f, f2, f3, Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setPressOffset(float f) {
        this.pressOffset$delegate.setFloatValue(f);
    }

    private final void setRawOffset(float f) {
        this.rawOffset$delegate.setFloatValue(f);
    }

    private final void setTotalHeight(int i) {
        this.totalHeight$delegate.setIntValue(i);
    }

    private final void setTotalWidth(int i) {
        this.totalWidth$delegate.setIntValue(i);
    }

    private final void setValueState(float f) {
        this.valueState$delegate.setFloatValue(f);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        float max;
        float min;
        if (this.orientation == Orientation.Vertical) {
            max = Math.max(getTotalHeight() - (getThumbHeight$material3() / 2.0f), 0.0f);
            min = Math.min(getThumbHeight$material3() / 2.0f, max);
        } else {
            max = Math.max(getTotalWidth() - (getThumbWidth$material3() / 2.0f), 0.0f);
            min = Math.min(getThumbWidth$material3() / 2.0f, max);
        }
        setRawOffset(getRawOffset() + f + getPressOffset());
        setPressOffset(0.0f);
        float scaleToUserValue = scaleToUserValue(min, max, SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, min, max));
        if (scaleToUserValue == getValue()) {
            return;
        }
        ky kyVar = this.onValueChange;
        if (kyVar == null) {
            setValue(scaleToUserValue);
        } else if (kyVar != null) {
            kyVar.invoke(Float.valueOf(scaleToUserValue));
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, my myVar, hm hmVar) {
        Object n = p10.n(new SliderState$drag$2(this, mutatePriority, myVar, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public final float getCoercedValueAsFraction() {
        return SliderKt.calcFraction(Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue(), y80.g(getValue(), Float.valueOf(((ti) this.valueRange).a).floatValue(), Float.valueOf(((ti) this.valueRange).b).floatValue()));
    }

    public final iy getGestureEndAction$material3() {
        return this.gestureEndAction;
    }

    public final ky getOnValueChange() {
        return this.onValueChange;
    }

    public final iy getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final Orientation getOrientation$material3() {
        return this.orientation;
    }

    public final boolean getReverseVerticalDirection$material3() {
        return this.reverseVerticalDirection;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int getThumbHeight$material3() {
        return this.thumbHeight$delegate.getIntValue();
    }

    public final int getThumbWidth$material3() {
        return this.thumbWidth$delegate.getIntValue();
    }

    public final float[] getTickFractions$material3() {
        return this.tickFractions;
    }

    public final float getValue() {
        return getValueState();
    }

    public final ui getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    public final boolean isRtl$material3() {
        return this.isRtl;
    }

    /* renamed from: onPress-k-4lQ0M$material3, reason: not valid java name */
    public final void m2446onPressk4lQ0M$material3(long j) {
        float intBitsToFloat;
        float totalWidth;
        float intBitsToFloat2;
        if (this.orientation == Orientation.Vertical) {
            if (this.reverseVerticalDirection) {
                totalWidth = getTotalHeight();
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                intBitsToFloat = totalWidth - intBitsToFloat2;
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
        } else if (this.isRtl) {
            totalWidth = getTotalWidth();
            intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
            intBitsToFloat = totalWidth - intBitsToFloat2;
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        setPressOffset(intBitsToFloat - getRawOffset());
    }

    public final void setOnValueChange(ky kyVar) {
        this.onValueChange = kyVar;
    }

    public final void setOnValueChangeFinished(iy iyVar) {
        this.onValueChangeFinished = iyVar;
    }

    public final void setOrientation$material3(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setReverseVerticalDirection$material3(boolean z) {
        this.reverseVerticalDirection = z;
    }

    public final void setRtl$material3(boolean z) {
        this.isRtl = z;
    }

    public final void setShouldAutoSnap(boolean z) {
        this.shouldAutoSnap = z;
    }

    public final void setThumbHeight$material3(int i) {
        this.thumbHeight$delegate.setIntValue(i);
    }

    public final void setThumbWidth$material3(int i) {
        this.thumbWidth$delegate.setIntValue(i);
    }

    public final void setValue(float f) {
        if (this.shouldAutoSnap) {
            f = calculateSnappedValue(f);
        }
        setValueState(f);
    }

    public final boolean shouldAutoSnap() {
        return this.shouldAutoSnap;
    }

    public final void updateDimensions$material3(int i, int i2) {
        setTotalWidth(i);
        setTotalHeight(i2);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, SliderState sliderState) {
            return y80.E(Float.valueOf(sliderState.getValue()), Integer.valueOf(sliderState.getSteps()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SliderState Saver$lambda$1(iy iyVar, ui uiVar, List list) {
            Object obj = list.get(0);
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            return new SliderState(floatValue, ((Integer) obj2).intValue(), iyVar, uiVar);
        }

        public final Saver<SliderState, ?> Saver(iy iyVar, ui uiVar) {
            return ListSaverKt.listSaver(new ll0(22), new zh0(iyVar, uiVar, 1));
        }

        private Companion() {
        }
    }

    public SliderState(float f, int i, iy iyVar, ui uiVar, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : iyVar, (i2 & 8) != 0 ? new ti(0.0f, 1.0f) : uiVar);
    }

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }
}
