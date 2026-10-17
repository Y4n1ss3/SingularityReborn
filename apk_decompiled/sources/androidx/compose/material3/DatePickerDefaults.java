package androidx.compose.material3;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.fp;
import defpackage.k10;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import defpackage.wd;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final k10 YearRange = new k10(1900, 2100, 1);
    private static final float TonalElevation = ElevationTokens.INSTANCE.m3254getLevel0D9Ej5fM();
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerHeadline_ISIPfiY$lambda$3$lambda$2(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6846setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m6820getPolite0phEisY());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerHeadline_ISIPfiY$lambda$4(DatePickerDefaults datePickerDefaults, Long l, int i, DatePickerFormatter datePickerFormatter, Modifier modifier, long j, int i2, int i3, Composer composer, int i4) {
        datePickerDefaults.m1877DatePickerHeadlineISIPfiY(l, i, datePickerFormatter, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DatePickerTitle_FNtVw6o$lambda$1(DatePickerDefaults datePickerDefaults, int i, Modifier modifier, long j, int i2, int i3, Composer composer, int i4) {
        datePickerDefaults.m1878DatePickerTitleFNtVw6o(i, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = YearMonthSkeleton;
        }
        if ((i & 2) != 0) {
            str2 = YearAbbrMonthDaySkeleton;
        }
        if ((i & 4) != 0) {
            str3 = YearMonthWeekdayDaySkeleton;
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009f  */
    /* renamed from: DatePickerHeadline-ISIPfiY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1877DatePickerHeadlineISIPfiY(Long l, final int i, DatePickerFormatter datePickerFormatter, Modifier modifier, long j, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j2;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        long j4;
        Modifier modifier4;
        int i6;
        final Long l2 = l;
        final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        Composer startRestartGroup = composer.startRestartGroup(1913724796);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & Fields.RotationY) == 0 ? startRestartGroup.changed(datePickerFormatter2) : startRestartGroup.changedInstance(datePickerFormatter2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i6 = Fields.Clip;
                        i4 |= i6;
                    }
                } else {
                    j2 = j;
                }
                i6 = 8192;
                i4 |= i6;
            } else {
                j2 = j;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i4 |= startRestartGroup.changed(this) ? Fields.RenderEffect : 65536;
            }
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 16) != 0) {
                        j2 = colors(startRestartGroup, (i4 >> 15) & 14).m1865getHeadlineContentColor0d7_KjU();
                        i4 &= -57345;
                    }
                    i5 = i4;
                    j4 = j2;
                    modifier4 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    i5 = i4;
                    j4 = j2;
                    modifier4 = modifier2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1913724796, i5, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:684)");
                }
                Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
                String formatDate$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l2, defaultLocale, false, 4, null);
                datePickerFormatter2 = datePickerFormatter;
                l2 = l2;
                String formatDate = datePickerFormatter2.formatDate(l2, defaultLocale, true);
                String str = "";
                if (formatDate == null) {
                    startRestartGroup.startReplaceGroup(380185931);
                    DisplayMode.Companion companion = DisplayMode.Companion;
                    if (DisplayMode.m1926equalsimpl0(i, companion.m1931getPickerjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843549871);
                        Strings.Companion companion2 = Strings.Companion;
                        formatDate = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_no_selection_description), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (DisplayMode.m1926equalsimpl0(i, companion.m1930getInputjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843552842);
                        Strings.Companion companion3 = Strings.Companion;
                        formatDate = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_no_input_description), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(380407362);
                        startRestartGroup.endReplaceGroup();
                        formatDate = "";
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(843542258);
                    startRestartGroup.endReplaceGroup();
                }
                if (formatDate$default == null) {
                    startRestartGroup.startReplaceGroup(380507587);
                    DisplayMode.Companion companion4 = DisplayMode.Companion;
                    if (DisplayMode.m1926equalsimpl0(i, companion4.m1931getPickerjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843560257);
                        Strings.Companion companion5 = Strings.Companion;
                        formatDate$default = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_headline), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (DisplayMode.m1926equalsimpl0(i, companion4.m1930getInputjFl4v0())) {
                        startRestartGroup.startReplaceGroup(843562784);
                        Strings.Companion companion6 = Strings.Companion;
                        formatDate$default = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_headline), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(380705954);
                        startRestartGroup.endReplaceGroup();
                        formatDate$default = "";
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(843557408);
                    startRestartGroup.endReplaceGroup();
                }
                DisplayMode.Companion companion7 = DisplayMode.Companion;
                if (DisplayMode.m1926equalsimpl0(i, companion7.m1931getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(843570444);
                    Strings.Companion companion8 = Strings.Companion;
                    str = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_headline_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m1926equalsimpl0(i, companion7.m1930getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(843573323);
                    Strings.Companion companion9 = Strings.Companion;
                    str = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_headline_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(381043234);
                    startRestartGroup.endReplaceGroup();
                }
                String format = String.format(str, Arrays.copyOf(new Object[]{formatDate}, 1));
                boolean changed = startRestartGroup.changed(format);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new wd(format, 10);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer2 = startRestartGroup;
                Modifier modifier6 = modifier4;
                TextKt.m2607TextNvy7gAk(formatDate$default, SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue, 1, null), j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, (i5 >> 6) & 896, 24576, 245752);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                j3 = j4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: ep
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 DatePickerHeadline_ISIPfiY$lambda$4;
                        int intValue = ((Integer) obj2).intValue();
                        DatePickerHeadline_ISIPfiY$lambda$4 = DatePickerDefaults.DatePickerHeadline_ISIPfiY$lambda$4(DatePickerDefaults.this, l2, i, datePickerFormatter2, modifier3, j3, i2, i3, (Composer) obj, intValue);
                        return DatePickerHeadline_ISIPfiY$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005a  */
    /* renamed from: DatePickerTitle-FNtVw6o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1878DatePickerTitleFNtVw6o(int i, Modifier modifier, long j, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j2;
        long j3;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-390880814);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = Fields.RotationX;
                        i4 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = Fields.SpotShadowColor;
                i4 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(this) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                j3 = j2;
                modifier3 = modifier2;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 4) != 0) {
                        long m1872getTitleContentColor0d7_KjU = colors(startRestartGroup, (i4 >> 9) & 14).m1872getTitleContentColor0d7_KjU();
                        i4 &= -897;
                        j4 = m1872getTitleContentColor0d7_KjU;
                    } else {
                        j4 = j2;
                    }
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    j4 = j2;
                    modifier3 = modifier2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-390880814, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:649)");
                }
                DisplayMode.Companion companion = DisplayMode.Companion;
                if (DisplayMode.m1926equalsimpl0(i, companion.m1931getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(-1974299164);
                    Strings.Companion companion2 = Strings.Companion;
                    TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_title), startRestartGroup, 0), modifier3, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, i4 & 1008, 0, 262136);
                    startRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m1926equalsimpl0(i, companion.m1930getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(-1974291869);
                    Strings.Companion companion3 = Strings.Companion;
                    TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_title), startRestartGroup, 0), modifier3, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, i4 & 1008, 0, 262136);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1073325776);
                    startRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new fp(this, i, modifier3, j3, i2, i3, 0));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final DatePickerColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275219611, i, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:447)");
        }
        DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColors;
    }

    /* renamed from: colors-bSRYm20, reason: not valid java name */
    public final DatePickerColors m1879colorsbSRYm20(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors, Composer composer, int i, int i2, int i3, int i4) {
        long j25;
        long j26;
        long m4797getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long j27 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU8 = (i4 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long m4797getUnspecified0d7_KjU9 = (i4 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i4 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        long m4797getUnspecified0d7_KjU11 = (i4 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i4 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        long m4797getUnspecified0d7_KjU13 = (i4 & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j13;
        long m4797getUnspecified0d7_KjU14 = (i4 & 8192) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j14;
        long m4797getUnspecified0d7_KjU15 = (i4 & Fields.Clip) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j15;
        long m4797getUnspecified0d7_KjU16 = (i4 & Fields.CompositingStrategy) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j16;
        long m4797getUnspecified0d7_KjU17 = (i4 & 65536) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j17;
        long m4797getUnspecified0d7_KjU18 = (i4 & Fields.RenderEffect) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j18;
        long m4797getUnspecified0d7_KjU19 = (i4 & Fields.ColorFilter) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j19;
        long m4797getUnspecified0d7_KjU20 = (i4 & Fields.BlendMode) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j20;
        long m4797getUnspecified0d7_KjU21 = (i4 & 1048576) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j21;
        long m4797getUnspecified0d7_KjU22 = (i4 & 2097152) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j22;
        long m4797getUnspecified0d7_KjU23 = (i4 & 4194304) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j23;
        long m4797getUnspecified0d7_KjU24 = (i4 & GroupFlagsKt.IsNodeFlag) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j24;
        TextFieldColors textFieldColors2 = (i4 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? null : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            j25 = m4797getUnspecified0d7_KjU15;
            j26 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1991626358, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:516)");
        } else {
            j25 = m4797getUnspecified0d7_KjU15;
            j26 = m4797getUnspecified0d7_KjU2;
        }
        DatePickerColors m1852copytNwlRmA = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i3 >> 12) & 112).m1852copytNwlRmA(j27, j26, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, m4797getUnspecified0d7_KjU11, m4797getUnspecified0d7_KjU12, m4797getUnspecified0d7_KjU13, m4797getUnspecified0d7_KjU14, j25, m4797getUnspecified0d7_KjU16, m4797getUnspecified0d7_KjU17, m4797getUnspecified0d7_KjU18, m4797getUnspecified0d7_KjU19, m4797getUnspecified0d7_KjU20, m4797getUnspecified0d7_KjU21, m4797getUnspecified0d7_KjU23, m4797getUnspecified0d7_KjU22, m4797getUnspecified0d7_KjU24, textFieldColors2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1852copytNwlRmA;
    }

    public final DatePickerFormatter dateFormatter(String str, String str2, String str3) {
        return new DatePickerFormatterImpl(str, str2, str3);
    }

    public final SelectableDates getAllDates() {
        return AllDates;
    }

    public final DatePickerColors getDefaultDatePickerColors(ColorScheme colorScheme, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:546)");
        }
        DatePickerColors defaultDatePickerColorsCached$material3 = colorScheme.getDefaultDatePickerColorsCached$material3();
        if (defaultDatePickerColorsCached$material3 == null) {
            composer.startReplaceGroup(642416503);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            DatePickerColors datePickerColors = new DatePickerColors(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getHeaderSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getHeaderHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getWeekdaysLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionMonthSubheadColor()), colorScheme.m1765getOnSurfaceVariant0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getDateTodayContainerOutlineColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getRangeSelectionActiveIndicatorContainerColor()), ColorSchemeKt.fromToken(colorScheme, datePickerModalTokens.getSelectionDateInRangeLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, (i & 14) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3(datePickerColors);
            composer.endReplaceGroup();
            defaultDatePickerColorsCached$material3 = datePickerColors;
        } else {
            composer.startReplaceGroup(642290457);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDatePickerColorsCached$material3;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:770)");
        }
        Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m1880getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final k10 getYearRange() {
        return YearRange;
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:741)");
        }
        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4) | composer.changed(decayAnimationSpec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final SnapLayoutInfoProvider SnapLayoutInfoProvider$default = LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            rememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateApproachOffset(float f, float f2) {
                    return 0.0f;
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f) {
                    return SnapLayoutInfoProvider.this.calculateSnapOffset(f);
                }
            }, decayAnimationSpec, value);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }
}
