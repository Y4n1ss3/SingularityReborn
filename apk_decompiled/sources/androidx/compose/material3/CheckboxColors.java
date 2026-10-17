package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.state.ToggleableState;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CheckboxColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.checkedCheckmarkColor = j;
        this.uncheckedCheckmarkColor = j2;
        this.checkedBoxColor = j3;
        this.uncheckedBoxColor = j4;
        this.disabledCheckedBoxColor = j5;
        this.disabledUncheckedBoxColor = j6;
        this.disabledIndeterminateBoxColor = j7;
        this.checkedBorderColor = j8;
        this.uncheckedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledUncheckedBorderColor = j11;
        this.disabledIndeterminateBorderColor = j12;
    }

    private final AnimationSpec<Color> colorAnimationSpecForState(ToggleableState toggleableState, Composer composer, int i) {
        FiniteAnimationSpec value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1075456245, i, -1, "androidx.compose.material3.CheckboxColors.colorAnimationSpecForState (Checkbox.kt:684)");
        }
        if (toggleableState == ToggleableState.Off) {
            composer.startReplaceGroup(1539262271);
            value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1539355581);
            value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m1684copy2qZNXz8$default(CheckboxColors checkboxColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15 = (i & 1) != 0 ? checkboxColors.checkedCheckmarkColor : j;
        long j16 = (i & 2) != 0 ? checkboxColors.uncheckedCheckmarkColor : j2;
        long j17 = (i & 4) != 0 ? checkboxColors.checkedBoxColor : j3;
        long j18 = (i & 8) != 0 ? checkboxColors.uncheckedBoxColor : j4;
        long j19 = (i & 16) != 0 ? checkboxColors.disabledCheckedBoxColor : j5;
        long j20 = (i & 32) != 0 ? checkboxColors.disabledUncheckedBoxColor : j6;
        long j21 = (i & 64) != 0 ? checkboxColors.disabledIndeterminateBoxColor : j7;
        long j22 = j15;
        long j23 = (i & Fields.SpotShadowColor) != 0 ? checkboxColors.checkedBorderColor : j8;
        long j24 = (i & Fields.RotationX) != 0 ? checkboxColors.uncheckedBorderColor : j9;
        long j25 = (i & Fields.RotationY) != 0 ? checkboxColors.disabledBorderColor : j10;
        long j26 = (i & Fields.RotationZ) != 0 ? checkboxColors.disabledUncheckedBorderColor : j11;
        if ((i & Fields.CameraDistance) != 0) {
            j14 = j26;
            j13 = checkboxColors.disabledIndeterminateBorderColor;
        } else {
            j13 = j12;
            j14 = j26;
        }
        return checkboxColors.m1685copy2qZNXz8(j22, j16, j17, j18, j19, j20, j21, j23, j24, j25, j14, j13);
    }

    public final State<Color> borderColor$material3(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:657)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBorderColor;
            } else {
                if (i2 != 3) {
                    defpackage.o.n();
                    return null;
                }
                j = this.uncheckedBorderColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledBorderColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBorderColor;
            } else {
                if (i3 != 3) {
                    defpackage.o.n();
                    return null;
                }
                j = this.disabledUncheckedBorderColor;
            }
        }
        if (z) {
            composer.startReplaceGroup(633231558);
            rememberUpdatedState = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(j, colorAnimationSpecForState(toggleableState, composer, (i >> 3) & 126), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(633321768);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(j), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final State<Color> boxColor$material3(boolean z, ToggleableState toggleableState, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:625)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBoxColor;
            } else {
                if (i2 != 3) {
                    defpackage.o.n();
                    return null;
                }
                j = this.uncheckedBoxColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledCheckedBoxColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBoxColor;
            } else {
                if (i3 != 3) {
                    defpackage.o.n();
                    return null;
                }
                j = this.disabledUncheckedBoxColor;
            }
        }
        if (z) {
            composer.startReplaceGroup(496051715);
            rememberUpdatedState = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(j, colorAnimationSpecForState(toggleableState, composer, (i >> 3) & 126), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(496141925);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(j), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final State<Color> checkmarkColor$material3(ToggleableState toggleableState, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:606)");
        }
        State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(toggleableState == ToggleableState.Off ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, colorAnimationSpecForState(toggleableState, composer, i & 126), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m100animateColorAsStateeuL9pac;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final CheckboxColors m1685copy2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new CheckboxColors(j != 16 ? j : this.checkedCheckmarkColor, j2 != 16 ? j2 : this.uncheckedCheckmarkColor, j3 != 16 ? j3 : this.checkedBoxColor, j4 != 16 ? j4 : this.uncheckedBoxColor, j5 != 16 ? j5 : this.disabledCheckedBoxColor, j6 != 16 ? j6 : this.disabledUncheckedBoxColor, j7 != 16 ? j7 : this.disabledIndeterminateBoxColor, j8 != 16 ? j8 : this.checkedBorderColor, j9 != 16 ? j9 : this.uncheckedBorderColor, j10 != 16 ? j10 : this.disabledBorderColor, j11 != 16 ? j11 : this.disabledUncheckedBorderColor, j12 != 16 ? j12 : this.disabledIndeterminateBorderColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.m4762equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m4762equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m4762equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m4762equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m4762equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m4762equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m4762equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m4762equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m4762equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m4762equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m4762equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m4762equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1686getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1687getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* renamed from: getCheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m1688getCheckedCheckmarkColor0d7_KjU() {
        return this.checkedCheckmarkColor;
    }

    /* renamed from: getDisabledBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1689getDisabledBorderColor0d7_KjU() {
        return this.disabledBorderColor;
    }

    /* renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1690getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1691getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1692getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1693getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1694getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1695getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1696getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    /* renamed from: getUncheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m1697getUncheckedCheckmarkColor0d7_KjU() {
        return this.uncheckedCheckmarkColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledIndeterminateBorderColor) + kp0.d(this.disabledUncheckedBorderColor, kp0.d(this.disabledBorderColor, kp0.d(this.uncheckedBorderColor, kp0.d(this.checkedBorderColor, kp0.d(this.disabledIndeterminateBoxColor, kp0.d(this.disabledUncheckedBoxColor, kp0.d(this.disabledCheckedBoxColor, kp0.d(this.uncheckedBoxColor, kp0.d(this.checkedBoxColor, kp0.d(this.uncheckedCheckmarkColor, Color.m4768hashCodeimpl(this.checkedCheckmarkColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public /* synthetic */ CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }
}
