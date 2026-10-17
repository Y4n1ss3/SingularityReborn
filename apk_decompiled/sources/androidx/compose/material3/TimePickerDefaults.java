package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final TimePickerDefaults INSTANCE = new TimePickerDefaults();

    private TimePickerDefaults() {
    }

    public final TimePickerColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085808058, i, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:284)");
        }
        TimePickerColors defaultTimePickerColors$material3 = getDefaultTimePickerColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerColors$material3;
    }

    /* renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m2631colorsu3YEpmA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i, int i2, int i3) {
        long j15;
        long j16;
        long m4797getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i3 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long j17 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU9 = (i3 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i3 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        long m4797getUnspecified0d7_KjU11 = (i3 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i3 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        long m4797getUnspecified0d7_KjU13 = (i3 & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j13;
        long m4797getUnspecified0d7_KjU14 = (i3 & 8192) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j14;
        if (ComposerKt.isTraceInProgress()) {
            j15 = m4797getUnspecified0d7_KjU13;
            j16 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-646352288, i, i2, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:331)");
        } else {
            j15 = m4797getUnspecified0d7_KjU13;
            j16 = m4797getUnspecified0d7_KjU2;
        }
        TimePickerColors m2612copydVHXu7A = getDefaultTimePickerColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2612copydVHXu7A(j17, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, j16, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, m4797getUnspecified0d7_KjU11, m4797getUnspecified0d7_KjU12, j15, m4797getUnspecified0d7_KjU14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2612copydVHXu7A;
    }

    public final TimePickerColors getDefaultTimePickerColors$material3(ColorScheme colorScheme) {
        TimePickerColors defaultTimePickerColorsCached$material3 = colorScheme.getDefaultTimePickerColorsCached$material3();
        if (defaultTimePickerColorsCached$material3 != null) {
            return defaultTimePickerColorsCached$material3;
        }
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        TimePickerColors timePickerColors = new TimePickerColors(ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialSelectorHandleContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getClockDialUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorSelectedContainerColor()), Color.Companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getPeriodSelectorUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, timePickerTokens.getTimeSelectorUnselectedLabelTextColor()), null);
        colorScheme.setDefaultTimePickerColorsCached$material3(timePickerColors);
        return timePickerColors;
    }

    /* renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m2632layoutTypesDNSZnc(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, i, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:381)");
        }
        int defaultTimePickerLayoutType = TimePickerKt.getDefaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }
}
