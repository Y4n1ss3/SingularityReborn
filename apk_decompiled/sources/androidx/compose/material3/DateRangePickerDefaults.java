package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import defpackage.fp;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d3, code lost:
    
        if (defpackage.q10.b(r2.rememberedValue(), java.lang.Integer.valueOf(r4)) == false) goto L144;
     */
    /* renamed from: DateRangePickerHeadline-nZrIstQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m1899DateRangePickerHeadlinenZrIstQ(Long l, final Long l2, final int i, final DatePickerFormatter datePickerFormatter, final Modifier modifier, final long j, final String str, final String str2, final my myVar, final my myVar2, final my myVar3, final Locale locale, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Long l3;
        Composer composer2;
        String str3;
        ComposeUiNode.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1381313200);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? Fields.Clip : 8192;
        }
        int i6 = i4;
        if ((196608 & i2) == 0) {
            i6 |= startRestartGroup.changed(j) ? Fields.RenderEffect : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= startRestartGroup.changed(str) ? 1048576 : Fields.BlendMode;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= startRestartGroup.changed(str2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i7 = i6;
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changedInstance(myVar3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(locale) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381313200, i7, i5, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:468)");
            }
            int i8 = i5;
            String formatDate$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l, locale, false, 4, null);
            l3 = l;
            String formatDate$default2 = DatePickerFormatter.formatDate$default(datePickerFormatter, l2, locale, false, 4, null);
            String formatDate = datePickerFormatter.formatDate(l3, locale, true);
            String str4 = "";
            if (formatDate == null) {
                startRestartGroup.startReplaceGroup(620891895);
                DisplayMode.Companion companion2 = DisplayMode.Companion;
                str3 = formatDate$default2;
                if (DisplayMode.m1926equalsimpl0(i, companion2.m1931getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(297125251);
                    Strings.Companion companion3 = Strings.Companion;
                    String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_no_selection_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    formatDate = m2983getString2EP1pXo;
                } else if (DisplayMode.m1926equalsimpl0(i, companion2.m1930getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(297128222);
                    Strings.Companion companion4 = Strings.Companion;
                    formatDate = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_no_input_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(621113326);
                    startRestartGroup.endReplaceGroup();
                    formatDate = "";
                }
                startRestartGroup.endReplaceGroup();
            } else {
                str3 = formatDate$default2;
                startRestartGroup.startReplaceGroup(297117483);
                startRestartGroup.endReplaceGroup();
            }
            String formatDate2 = datePickerFormatter.formatDate(l2, locale, true);
            if (formatDate2 == null) {
                startRestartGroup.startReplaceGroup(621382935);
                DisplayMode.Companion companion5 = DisplayMode.Companion;
                if (DisplayMode.m1926equalsimpl0(i, companion5.m1931getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(297141091);
                    Strings.Companion companion6 = Strings.Companion;
                    str4 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_picker_no_selection_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m1926equalsimpl0(i, companion5.m1930getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(297144062);
                    Strings.Companion companion7 = Strings.Companion;
                    str4 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_input_no_input_description), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(621604366);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
                formatDate2 = str4;
            } else {
                startRestartGroup.startReplaceGroup(297133385);
                startRestartGroup.endReplaceGroup();
            }
            String str5 = str + ": " + formatDate;
            String str6 = str2 + ": " + formatDate2;
            boolean changed = startRestartGroup.changed(str5) | startRestartGroup.changed(str6);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new defpackage.g(15, str5, str6);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (ky) rememberedValue);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(4.0f)), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
            ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
            iy constructor = companion8.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            my b = k4.b(companion8, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
                companion = companion8;
            } else {
                companion = companion8;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (formatDate$default != null) {
                startRestartGroup.startReplaceGroup(-177386503);
                TextKt.m2607TextNvy7gAk(formatDate$default, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, (i7 >> 9) & 896, 0, 262138);
                composer2 = startRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-177297192);
                myVar.invoke(composer2, Integer.valueOf((i7 >> 24) & 14));
                composer2.endReplaceGroup();
            }
            myVar3.invoke(composer2, Integer.valueOf(i8 & 14));
            if (str3 != null) {
                composer2.startReplaceGroup(-177171301);
                TextKt.m2607TextNvy7gAk(str3, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i7 >> 9) & 896, 0, 262138);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-177083974);
                myVar2.invoke(composer2, Integer.valueOf((i7 >> 27) & 14));
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            l3 = l;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Long l4 = l3;
            endRestartGroup.updateScope(new my() { // from class: xp
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DateRangePickerHeadline_nZrIstQ$lambda$5;
                    int intValue = ((Integer) obj2).intValue();
                    DateRangePickerHeadline_nZrIstQ$lambda$5 = DateRangePickerDefaults.DateRangePickerHeadline_nZrIstQ$lambda$5(DateRangePickerDefaults.this, l4, l2, i, datePickerFormatter, modifier, j, str, str2, myVar, myVar2, myVar3, locale, i2, i3, (Composer) obj, intValue);
                    return DateRangePickerHeadline_nZrIstQ$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2(String str, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6846setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m6820getPolite0phEisY());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str + ", " + str2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangePickerHeadline_nZrIstQ$lambda$5(DateRangePickerDefaults dateRangePickerDefaults, Long l, Long l2, int i, DatePickerFormatter datePickerFormatter, Modifier modifier, long j, String str, String str2, my myVar, my myVar2, my myVar3, Locale locale, int i2, int i3, Composer composer, int i4) {
        dateRangePickerDefaults.m1899DateRangePickerHeadlinenZrIstQ(l, l2, i, datePickerFormatter, modifier, j, str, str2, myVar, myVar2, myVar3, locale, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangePickerHeadline_qS89cEg$lambda$1(DateRangePickerDefaults dateRangePickerDefaults, Long l, Long l2, int i, DatePickerFormatter datePickerFormatter, Modifier modifier, long j, int i2, int i3, Composer composer, int i4) {
        dateRangePickerDefaults.m1900DateRangePickerHeadlineqS89cEg(l, l2, i, datePickerFormatter, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DateRangePickerTitle_FNtVw6o$lambda$0(DateRangePickerDefaults dateRangePickerDefaults, int i, Modifier modifier, long j, int i2, int i3, Composer composer, int i4) {
        dateRangePickerDefaults.m1901DateRangePickerTitleFNtVw6o(i, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004f  */
    /* renamed from: DateRangePickerHeadline-qS89cEg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1900DateRangePickerHeadlineqS89cEg(final Long l, final Long l2, final int i, final DatePickerFormatter datePickerFormatter, Modifier modifier, long j, Composer composer, final int i2, final int i3) {
        Long l3;
        int i4;
        Long l4;
        int i5;
        int i6;
        Modifier modifier2;
        final long j2;
        DateRangePickerDefaults dateRangePickerDefaults;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1655228151);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            l3 = l;
        } else if ((i2 & 6) == 0) {
            l3 = l;
            i4 = (startRestartGroup.changed(l3) ? 4 : 2) | i2;
        } else {
            l3 = l;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            l4 = l2;
            i4 |= startRestartGroup.changed(l4) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 = i;
                i4 |= startRestartGroup.changed(i5) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= (i2 & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? Fields.CameraDistance : Fields.RotationZ;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            j2 = j;
                            if (startRestartGroup.changed(j2)) {
                                i7 = Fields.RenderEffect;
                                i4 |= i7;
                            }
                        } else {
                            j2 = j;
                        }
                        i7 = 65536;
                        i4 |= i7;
                    } else {
                        j2 = j;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        dateRangePickerDefaults = this;
                        i4 |= startRestartGroup.changed(dateRangePickerDefaults) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                    j2 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6).m1865getHeadlineContentColor0d7_KjU();
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1655228151, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                            }
                            Strings.Companion companion = Strings.Companion;
                            final String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_start_headline), startRestartGroup, 0);
                            final String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_end_headline), startRestartGroup, 0);
                            int i8 = (458752 & i4) | (i4 & 14) | 905969664 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4);
                            int i9 = ((i4 >> 12) & 896) | 6;
                            int i10 = i5;
                            Modifier modifier5 = modifier4;
                            long j4 = j2;
                            dateRangePickerDefaults.m1899DateRangePickerHeadlinenZrIstQ(l3, l4, i10, datePickerFormatter, modifier5, j4, m2983getString2EP1pXo, m2983getString2EP1pXo2, ComposableLambdaKt.rememberComposableLambda(850203865, true, new my() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
                                public final void invoke(Composer composer2, int i11) {
                                    if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(850203865, i11, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:421)");
                                    }
                                    TextKt.m2607TextNvy7gAk(m2983getString2EP1pXo, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262138);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(282231642, true, new my() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
                                public final void invoke(Composer composer2, int i11) {
                                    if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(282231642, i11, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:422)");
                                    }
                                    TextKt.m2607TextNvy7gAk(m2983getString2EP1pXo2, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262138);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-320655704, true, new my() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3
                                public final void invoke(Composer composer2, int i11) {
                                    if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-320655704, i11, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:423)");
                                    }
                                    TextKt.m2607TextNvy7gAk("-", null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 262138);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0), startRestartGroup, i8, i9);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j3 = j4;
                            modifier3 = modifier5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            j3 = j2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: yp
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 DateRangePickerHeadline_qS89cEg$lambda$1;
                                    int intValue = ((Integer) obj2).intValue();
                                    DateRangePickerHeadline_qS89cEg$lambda$1 = DateRangePickerDefaults.DateRangePickerHeadline_qS89cEg$lambda$1(DateRangePickerDefaults.this, l, l2, i, datePickerFormatter, modifier3, j3, i2, i3, (Composer) obj, intValue);
                                    return DateRangePickerHeadline_qS89cEg$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    dateRangePickerDefaults = this;
                    if (startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                if ((196608 & i2) != 0) {
                }
                if ((i3 & 64) == 0) {
                }
                dateRangePickerDefaults = this;
                if (startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i;
            if ((i3 & 8) != 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            modifier2 = modifier;
            if ((196608 & i2) != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            dateRangePickerDefaults = this;
            if (startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        l4 = l2;
        if ((i3 & 4) == 0) {
        }
        i5 = i;
        if ((i3 & 8) != 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        modifier2 = modifier;
        if ((196608 & i2) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        dateRangePickerDefaults = this;
        if (startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058  */
    /* renamed from: DateRangePickerTitle-FNtVw6o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1901DateRangePickerTitleFNtVw6o(int i, Modifier modifier, long j, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j2;
        Modifier modifier3;
        long j3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        Modifier modifier4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(694693107);
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
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 4) != 0) {
                        j2 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6).m1872getTitleContentColor0d7_KjU();
                        i4 &= -897;
                    }
                    j4 = j2;
                    modifier4 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    j4 = j2;
                    modifier4 = modifier2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(694693107, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)");
                }
                DisplayMode.Companion companion = DisplayMode.Companion;
                if (DisplayMode.m1926equalsimpl0(i, companion.m1931getPickerjFl4v0())) {
                    startRestartGroup.startReplaceGroup(1880154051);
                    Strings.Companion companion2 = Strings.Companion;
                    TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_picker_title), startRestartGroup, 0), modifier4, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, i4 & 1008, 0, 262136);
                    startRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m1926equalsimpl0(i, companion.m1930getInputjFl4v0())) {
                    startRestartGroup.startReplaceGroup(1880161282);
                    Strings.Companion companion3 = Strings.Companion;
                    TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_date_range_input_title), startRestartGroup, 0), modifier4, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, i4 & 1008, 0, 262136);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1844364305);
                    startRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new fp(this, i, modifier3, j3, i2, i3, 1));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
