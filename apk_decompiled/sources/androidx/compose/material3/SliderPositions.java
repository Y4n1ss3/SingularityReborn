package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.dq;
import defpackage.er;
import defpackage.q10;
import defpackage.ti;
import defpackage.ui;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class SliderPositions {
    public static final int $stable = 0;
    private final MutableState activeRange$delegate;
    private final MutableState tickFractions$delegate;

    public SliderPositions(ui uiVar, float[] fArr, int i, dq dqVar) {
        this((i & 1) != 0 ? new ti(0.0f, 1.0f) : uiVar, (i & 2) != 0 ? new float[0] : fArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        return q10.b(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final ui getActiveRange() {
        return (ui) this.activeRange$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return Arrays.hashCode(getTickFractions()) + (getActiveRange().hashCode() * 31);
    }

    public final void setActiveRange$material3(ui uiVar) {
        this.activeRange$delegate.setValue(uiVar);
    }

    public final void setTickFractions$material3(float[] fArr) {
        this.tickFractions$delegate.setValue(fArr);
    }

    public SliderPositions() {
        this(null, null, 3, null);
    }

    public SliderPositions(ui uiVar, float[] fArr) {
        this.activeRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(uiVar, null, 2, null);
        this.tickFractions$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }
}
