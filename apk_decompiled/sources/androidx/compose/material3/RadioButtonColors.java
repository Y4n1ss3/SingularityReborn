package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    private RadioButtonColors(long j, long j2, long j3, long j4) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledSelectedColor = j3;
        this.disabledUnselectedColor = j4;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m2281copyjRlVdoo$default(RadioButtonColors radioButtonColors, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = radioButtonColors.selectedColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = radioButtonColors.unselectedColor;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = radioButtonColors.disabledSelectedColor;
        }
        return radioButtonColors.m2282copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? radioButtonColors.disabledUnselectedColor : j4);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RadioButtonColors m2282copyjRlVdoo(long j, long j2, long j3, long j4) {
        return new RadioButtonColors(j != 16 ? j : this.selectedColor, j2 != 16 ? j2 : this.unselectedColor, j3 != 16 ? j3 : this.disabledSelectedColor, j4 != 16 ? j4 : this.disabledUnselectedColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.m4762equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m4762equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m4762equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m4762equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    /* renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2283getDisabledSelectedColor0d7_KjU() {
        return this.disabledSelectedColor;
    }

    /* renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2284getDisabledUnselectedColor0d7_KjU() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2285getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2286getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledUnselectedColor) + kp0.d(this.disabledSelectedColor, kp0.d(this.unselectedColor, Color.m4768hashCodeimpl(this.selectedColor) * 31, 31), 31);
    }

    public final State<Color> radioColor$material3(boolean z, boolean z2, Composer composer, int i) {
        State<Color> rememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:223)");
        }
        long j = (z && z2) ? this.selectedColor : (!z || z2) ? (z || !z2) ? this.disabledUnselectedColor : this.disabledSelectedColor : this.unselectedColor;
        if (z) {
            composer.startReplaceGroup(1194696477);
            rememberUpdatedState = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(j, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1194874138);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(j), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public /* synthetic */ RadioButtonColors(long j, long j2, long j3, long j4, dq dqVar) {
        this(j, j2, j3, j4);
    }
}
