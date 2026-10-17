package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.i2;
import defpackage.iy;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    private DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors) {
        this.containerColor = j;
        this.titleContentColor = j2;
        this.headlineContentColor = j3;
        this.weekdayContentColor = j4;
        this.subheadContentColor = j5;
        this.navigationContentColor = j6;
        this.yearContentColor = j7;
        this.disabledYearContentColor = j8;
        this.currentYearContentColor = j9;
        this.selectedYearContentColor = j10;
        this.disabledSelectedYearContentColor = j11;
        this.selectedYearContainerColor = j12;
        this.disabledSelectedYearContainerColor = j13;
        this.dayContentColor = j14;
        this.disabledDayContentColor = j15;
        this.selectedDayContentColor = j16;
        this.disabledSelectedDayContentColor = j17;
        this.selectedDayContainerColor = j18;
        this.disabledSelectedDayContainerColor = j19;
        this.todayContentColor = j20;
        this.todayDateBorderColor = j21;
        this.dayInSelectionRangeContainerColor = j22;
        this.dayInSelectionRangeContentColor = j23;
        this.dividerColor = j24;
        this.dateTextFieldColors = textFieldColors;
    }

    /* renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m1852copytNwlRmA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors) {
        return new DatePickerColors(j != 16 ? j : this.containerColor, j2 != 16 ? j2 : this.titleContentColor, j3 != 16 ? j3 : this.headlineContentColor, j4 != 16 ? j4 : this.weekdayContentColor, j5 != 16 ? j5 : this.subheadContentColor, j6 != 16 ? j6 : this.navigationContentColor, j7 != 16 ? j7 : this.yearContentColor, j8 != 16 ? j8 : this.disabledYearContentColor, j9 != 16 ? j9 : this.currentYearContentColor, j10 != 16 ? j10 : this.selectedYearContentColor, j11 != 16 ? j11 : this.disabledSelectedYearContentColor, j12 != 16 ? j12 : this.selectedYearContainerColor, j13 != 16 ? j13 : this.disabledSelectedYearContainerColor, j14 != 16 ? j14 : this.dayContentColor, j15 != 16 ? j15 : this.disabledDayContentColor, j16 != 16 ? j16 : this.selectedDayContentColor, j17 != 16 ? j17 : this.disabledSelectedDayContentColor, j18 != 16 ? j18 : this.selectedDayContainerColor, j19 != 16 ? j19 : this.disabledSelectedDayContainerColor, j20 != 16 ? j20 : this.todayContentColor, j21 != 16 ? j21 : this.todayDateBorderColor, j22 != 16 ? j22 : this.dayInSelectionRangeContainerColor, j23 != 16 ? j23 : this.dayInSelectionRangeContentColor, j24 != 16 ? j24 : this.dividerColor, takeOrElse$material3(textFieldColors, new i2(this, 11)), null);
    }

    public final State<Color> dayContainerColor$material3(boolean z, boolean z2, boolean z3, Composer composer, int i) {
        State<Color> rememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:976)");
        }
        long m4796getTransparent0d7_KjU = z ? z2 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor : Color.Companion.m4796getTransparent0d7_KjU();
        if (z3) {
            composer.startReplaceGroup(-1319856736);
            rememberUpdatedState = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(m4796getTransparent0d7_KjU, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1319630064);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(m4796getTransparent0d7_KjU), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public final State<Color> dayContentColor$material3(boolean z, boolean z2, boolean z3, boolean z4, Composer composer, int i) {
        State<Color> m100animateColorAsStateeuL9pac;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:940)");
        }
        long j = (z2 && z4) ? this.selectedDayContentColor : (!z2 || z4) ? (z3 && z4) ? this.dayInSelectionRangeContentColor : (!z3 || z4) ? (z && z4) ? this.todayContentColor : z4 ? this.dayContentColor : this.disabledDayContentColor : this.disabledDayContentColor : this.disabledSelectedDayContentColor;
        if (z3) {
            composer.startReplaceGroup(-969483020);
            m100animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(j), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-969417610);
            m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(j, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m100animateColorAsStateeuL9pac;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m4762equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m4762equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m4762equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m4762equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m4762equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m4762equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m4762equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m4762equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m4762equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m4762equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m4762equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m4762equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m4762equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m4762equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m4762equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m4762equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m4762equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m4762equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m4762equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m4762equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m4762equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1853getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1854getCurrentYearContentColor0d7_KjU() {
        return this.currentYearContentColor;
    }

    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* renamed from: getDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1855getDayContentColor0d7_KjU() {
        return this.dayContentColor;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1856getDayInSelectionRangeContainerColor0d7_KjU() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name */
    public final long m1857getDayInSelectionRangeContentColor0d7_KjU() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1858getDisabledDayContentColor0d7_KjU() {
        return this.disabledDayContentColor;
    }

    /* renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1859getDisabledSelectedDayContainerColor0d7_KjU() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1860getDisabledSelectedDayContentColor0d7_KjU() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1861getDisabledSelectedYearContainerColor0d7_KjU() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1862getDisabledSelectedYearContentColor0d7_KjU() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1863getDisabledYearContentColor0d7_KjU() {
        return this.disabledYearContentColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m1864getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m1865getHeadlineContentColor0d7_KjU() {
        return this.headlineContentColor;
    }

    /* renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name */
    public final long m1866getNavigationContentColor0d7_KjU() {
        return this.navigationContentColor;
    }

    /* renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1867getSelectedDayContainerColor0d7_KjU() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1868getSelectedDayContentColor0d7_KjU() {
        return this.selectedDayContentColor;
    }

    /* renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1869getSelectedYearContainerColor0d7_KjU() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1870getSelectedYearContentColor0d7_KjU() {
        return this.selectedYearContentColor;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name */
    public final long m1871getSubheadContentColor0d7_KjU() {
        return this.subheadContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m1872getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1873getTodayContentColor0d7_KjU() {
        return this.todayContentColor;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1874getTodayDateBorderColor0d7_KjU() {
        return this.todayDateBorderColor;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name */
    public final long m1875getWeekdayContentColor0d7_KjU() {
        return this.weekdayContentColor;
    }

    /* renamed from: getYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m1876getYearContentColor0d7_KjU() {
        return this.yearContentColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.dayInSelectionRangeContentColor) + kp0.d(this.dayInSelectionRangeContainerColor, kp0.d(this.todayDateBorderColor, kp0.d(this.todayContentColor, kp0.d(this.disabledSelectedDayContainerColor, kp0.d(this.selectedDayContainerColor, kp0.d(this.disabledSelectedDayContentColor, kp0.d(this.selectedDayContentColor, kp0.d(this.disabledDayContentColor, kp0.d(this.dayContentColor, kp0.d(this.disabledSelectedYearContainerColor, kp0.d(this.selectedYearContainerColor, kp0.d(this.disabledSelectedYearContentColor, kp0.d(this.selectedYearContentColor, kp0.d(this.currentYearContentColor, kp0.d(this.disabledYearContentColor, kp0.d(this.yearContentColor, kp0.d(this.subheadContentColor, kp0.d(this.weekdayContentColor, kp0.d(this.headlineContentColor, kp0.d(this.titleContentColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final TextFieldColors takeOrElse$material3(TextFieldColors textFieldColors, iy iyVar) {
        return textFieldColors == null ? (TextFieldColors) iyVar.invoke() : textFieldColors;
    }

    public final State<Color> yearContainerColor$material3(boolean z, boolean z2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1030)");
        }
        State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(z ? z2 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor : Color.Companion.m4796getTransparent0d7_KjU(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m100animateColorAsStateeuL9pac;
    }

    public final State<Color> yearContentColor$material3(boolean z, boolean z2, boolean z3, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1006)");
        }
        State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac((z2 && z3) ? this.selectedYearContentColor : (!z2 || z3) ? (z && z3) ? this.currentYearContentColor : z3 ? this.yearContentColor : this.disabledYearContentColor : this.disabledSelectedYearContentColor, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m100animateColorAsStateeuL9pac;
    }

    public /* synthetic */ DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, textFieldColors);
    }
}
