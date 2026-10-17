package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.ac;
import defpackage.er;
import defpackage.fq0;
import defpackage.gq0;
import defpackage.h7;
import defpackage.kq0;
import defpackage.ky;
import defpackage.lm0;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.ti;
import defpackage.tp;
import defpackage.u5;
import defpackage.v5;
import defpackage.w01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TickSize;
    private static final float TrackStopIndicatorSize;
    private static final Path trackPath;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackStopIndicatorSize = sliderTokens.m3625getStopIndicatorSizeD9Ej5fM();
        TickSize = sliderTokens.m3625getStopIndicatorSizeD9Ej5fM();
        trackPath = AndroidPath_androidKt.Path();
    }

    private SliderDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CenteredTrack_7LSsfP0$lambda$23$lambda$22(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, offset.m4526unboximpl(), TrackStopIndicatorSize, m2405trackColorWaAFU9c$material3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CenteredTrack_7LSsfP0$lambda$25(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, float f3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2411CenteredTrack7LSsfP0$material3(sliderState, modifier, z, sliderColors, myVar, nyVar, f, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Thumb_9LiSoMs$lambda$3(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2412Thumb9LiSoMs(mutableInteractionSource, modifier, sliderColors, z, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Thumb_HwbPF3A$lambda$6(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2413ThumbHwbPF3A$material3(mutableInteractionSource, sliderState, modifier, sliderColors, z, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track$lambda$11$lambda$10(long j, SliderPositions sliderPositions, long j2, long j3, long j4, DrawScope drawScope) {
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        long j5 = m4508constructorimpl;
        long j6 = z ? m4508constructorimpl2 : j5;
        if (!z) {
            j5 = m4508constructorimpl2;
        }
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(TickSize);
        float mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(SliderKt.getTrackHeight());
        StrokeCap.Companion companion = StrokeCap.Companion;
        DrawScope.m5321drawLineNGM6Ib0$default(drawScope, j, j6, j5, mo367toPx0680j_42, companion.m5136getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        int i = (int) (j6 >> 32);
        long m4508constructorimpl3 = Offset.m4508constructorimpl((Float.floatToRawIntBits((Float.valueOf(((ti) sliderPositions.getActiveRange()).b).floatValue() * (Float.intBitsToFloat(r2) - Float.intBitsToFloat(i))) + Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
        float floatValue = (Float.valueOf(((ti) sliderPositions.getActiveRange()).a).floatValue() * (Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat(i))) + Float.intBitsToFloat(i);
        long j7 = j6;
        long j8 = j5;
        DrawScope.m5321drawLineNGM6Ib0$default(drawScope, j2, Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32)), m4508constructorimpl3, mo367toPx0680j_42, companion.m5136getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] tickFractions = sliderPositions.getTickFractions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f = tickFractions[i2];
            Boolean valueOf = Boolean.valueOf(f > Float.valueOf(((ti) sliderPositions.getActiveRange()).b).floatValue() || f < Float.valueOf(((ti) sliderPositions.getActiveRange()).a).floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            boolean z2 = booleanValue;
            ArrayList arrayList = new ArrayList(list.size());
            int i3 = 0;
            for (int size = list.size(); i3 < size; size = size) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (OffsetKt.m4539lerpWko1d7g(j7, j8, ((Number) list.get(i3)).floatValue()) >> 32));
                arrayList.add(Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32))));
                i3++;
                z2 = z2;
            }
            j7 = j7;
            j8 = j8;
            DrawScope.m5326drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m5081getPointsr_lszbg(), z2 ? j3 : j4, mo367toPx0680j_4, StrokeCap.Companion.m5136getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track$lambda$12(SliderDefaults sliderDefaults, SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, Composer composer, int i3) {
        sliderDefaults.Track(sliderPositions, modifier, sliderColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track$lambda$13(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, Composer composer, int i3) {
        sliderDefaults.Track(sliderState, modifier, sliderColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track$lambda$33(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, Composer composer, int i3) {
        sliderDefaults.Track(rangeSliderState, modifier, sliderColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* renamed from: TrackImpl-VvwgllI, reason: not valid java name */
    private final void m2406TrackImplVvwgllI(final SliderState sliderState, final float f, final Modifier modifier, final boolean z, final SliderColors sliderColors, final my myVar, final ny nyVar, final float f2, final float f3, final boolean z2, final boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Modifier m793height3ABfNKs;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(133396521);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(sliderColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(z2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(133396521, i3, i4, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1587)");
            }
            int i5 = i3;
            final long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, false);
            final long m2405trackColorWaAFU9c$material32 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
            final long m2404tickColorWaAFU9c$material3 = sliderColors.m2404tickColorWaAFU9c$material3(z, false);
            int i6 = i4;
            final long m2404tickColorWaAFU9c$material32 = sliderColors.m2404tickColorWaAFU9c$material3(z, true);
            if (sliderState.getOrientation$material3() == Orientation.Vertical) {
                m793height3ABfNKs = SizeKt.fillMaxHeight$default(SizeKt.m812width3ABfNKs(modifier, SliderKt.getTrackHeight()), 0.0f, 1, null);
                if (sliderState.getReverseVerticalDirection$material3()) {
                    m793height3ABfNKs = ScaleKt.scale(m793height3ABfNKs, 1.0f, -1.0f);
                }
            } else {
                m793height3ABfNKs = SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SliderKt.getTrackHeight());
            }
            Modifier.Companion companion = Modifier.Companion;
            int i7 = i5 & 112;
            boolean changedInstance = (i7 == 32) | startRestartGroup.changedInstance(sliderState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ny() { // from class: hq0
                    @Override // defpackage.ny
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult TrackImpl_VvwgllI$lambda$29$lambda$28;
                        TrackImpl_VvwgllI$lambda$29$lambda$28 = SliderDefaults.TrackImpl_VvwgllI$lambda$29$lambda$28(f, sliderState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                        return TrackImpl_VvwgllI$lambda$29$lambda$28;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier then = m793height3ABfNKs.then(LayoutModifierKt.layout(companion, (ny) rememberedValue));
            boolean changedInstance2 = (i7 == 32) | startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2405trackColorWaAFU9c$material3) | startRestartGroup.changed(m2405trackColorWaAFU9c$material32) | startRestartGroup.changed(m2404tickColorWaAFU9c$material3) | startRestartGroup.changed(m2404tickColorWaAFU9c$material32) | ((i5 & 29360128) == 8388608) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i6 & 14) == 4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                modifier2 = then;
                ky kyVar = new ky() { // from class: iq0
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 TrackImpl_VvwgllI$lambda$31$lambda$30;
                        TrackImpl_VvwgllI$lambda$31$lambda$30 = SliderDefaults.TrackImpl_VvwgllI$lambda$31$lambda$30(f, sliderState, m2405trackColorWaAFU9c$material3, m2405trackColorWaAFU9c$material32, m2404tickColorWaAFU9c$material3, m2404tickColorWaAFU9c$material32, f2, f3, myVar, nyVar, z2, z3, (DrawScope) obj);
                        return TrackImpl_VvwgllI$lambda$31$lambda$30;
                    }
                };
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(kyVar);
                rememberedValue2 = kyVar;
            } else {
                modifier2 = then;
                composer2 = startRestartGroup;
            }
            CanvasKt.Canvas(modifier2, (ky) rememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: jq0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 TrackImpl_VvwgllI$lambda$32;
                    int intValue = ((Integer) obj2).intValue();
                    TrackImpl_VvwgllI$lambda$32 = SliderDefaults.TrackImpl_VvwgllI$lambda$32(SliderDefaults.this, sliderState, f, modifier, z, sliderColors, myVar, nyVar, f2, f3, z2, z3, i, i2, (Composer) obj, intValue);
                    return TrackImpl_VvwgllI$lambda$32;
                }
            });
        }
    }

    /* renamed from: TrackImpl-xlyIBlM, reason: not valid java name */
    private final void m2407TrackImplxlyIBlM(final RangeSliderState rangeSliderState, final float f, final Modifier modifier, final boolean z, final SliderColors sliderColors, final my myVar, final ny nyVar, final float f2, final float f3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-1719396904);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 38347923) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719396904, i2, -1, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1811)");
            }
            final long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, false);
            int i3 = i2;
            final long m2405trackColorWaAFU9c$material32 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
            final long m2404tickColorWaAFU9c$material3 = sliderColors.m2404tickColorWaAFU9c$material3(z, false);
            final long m2404tickColorWaAFU9c$material32 = sliderColors.m2404tickColorWaAFU9c$material3(z, true);
            Modifier m793height3ABfNKs = SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SliderKt.getTrackHeight());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new kq0(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier layout = LayoutModifierKt.layout(m793height3ABfNKs, (ny) rememberedValue);
            boolean changedInstance = ((i3 & 29360128) == 8388608) | ((i3 & 112) == 32) | startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2405trackColorWaAFU9c$material3) | startRestartGroup.changed(m2405trackColorWaAFU9c$material32) | startRestartGroup.changed(m2404tickColorWaAFU9c$material3) | startRestartGroup.changed(m2404tickColorWaAFU9c$material32) | ((i3 & 234881024) == 67108864) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                composer2 = startRestartGroup;
                modifier2 = layout;
                ky kyVar = new ky() { // from class: lq0
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 TrackImpl_xlyIBlM$lambda$46$lambda$45;
                        TrackImpl_xlyIBlM$lambda$46$lambda$45 = SliderDefaults.TrackImpl_xlyIBlM$lambda$46$lambda$45(f, rangeSliderState, m2405trackColorWaAFU9c$material3, m2405trackColorWaAFU9c$material32, m2404tickColorWaAFU9c$material3, m2404tickColorWaAFU9c$material32, f2, f3, myVar, nyVar, (DrawScope) obj);
                        return TrackImpl_xlyIBlM$lambda$46$lambda$45;
                    }
                };
                composer2.updateRememberedValue(kyVar);
                rememberedValue2 = kyVar;
            } else {
                composer2 = startRestartGroup;
                modifier2 = layout;
            }
            CanvasKt.Canvas(modifier2, (ky) rememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: mq0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 TrackImpl_xlyIBlM$lambda$47;
                    int intValue = ((Integer) obj2).intValue();
                    TrackImpl_xlyIBlM$lambda$47 = SliderDefaults.TrackImpl_xlyIBlM$lambda$47(SliderDefaults.this, rangeSliderState, f, modifier, z, sliderColors, myVar, nyVar, f2, f3, i, (Composer) obj, intValue);
                    return TrackImpl_xlyIBlM$lambda$47;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult TrackImpl_VvwgllI$lambda$29$lambda$28(float f, SliderState sliderState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        int width = Dp.m7616equalsimpl0(f, Dp.Companion.m7631getUnspecifiedD9Ej5fM()) ? sliderState.getOrientation$material3() == Orientation.Vertical ? mo6234measureBRTryo0.getWidth() / 2 : mo6234measureBRTryo0.getHeight() / 2 : measureScope.mo361roundToPx0680j_4(f);
        int width2 = mo6234measureBRTryo0.getWidth();
        int height = mo6234measureBRTryo0.getHeight();
        Map<AlignmentLine, Integer> singletonMap = Collections.singletonMap(SliderKt.getCornerSizeAlignmentLine(), Integer.valueOf(width));
        singletonMap.getClass();
        return measureScope.layout(width2, height, singletonMap, new h7(7, mo6234measureBRTryo0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrackImpl_VvwgllI$lambda$31$lambda$30(float f, SliderState sliderState, long j, long j2, long j3, long j4, float f2, float f3, my myVar, ny nyVar, boolean z, boolean z2, DrawScope drawScope) {
        float mo367toPx0680j_4;
        if (Dp.m7616equalsimpl0(f, Dp.Companion.m7631getUnspecifiedD9Ej5fM())) {
            mo367toPx0680j_4 = (sliderState.getOrientation$material3() == Orientation.Vertical ? Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) : Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) / 2.0f;
        } else {
            mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(f);
        }
        INSTANCE.m2408drawTrackGVD57ws(drawScope, sliderState.getTickFractions$material3(), 0.0f, sliderState.getCoercedValueAsFraction(), j, j2, j3, j4, drawScope.mo364toDpu2uoSUM(0), drawScope.mo364toDpu2uoSUM(0), drawScope.mo364toDpu2uoSUM(sliderState.getThumbWidth$material3()), drawScope.mo364toDpu2uoSUM(sliderState.getThumbHeight$material3()), f2, f3, drawScope.mo363toDpu2uoSUM(mo367toPx0680j_4), myVar, nyVar, false, z, sliderState.getOrientation$material3(), z2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrackImpl_VvwgllI$lambda$32(SliderDefaults sliderDefaults, SliderState sliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2406TrackImplVvwgllI(sliderState, f, modifier, z, sliderColors, myVar, nyVar, f2, f3, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult TrackImpl_xlyIBlM$lambda$44$lambda$43(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        int height = mo6234measureBRTryo0.getHeight() / 2;
        int width = mo6234measureBRTryo0.getWidth();
        int height2 = mo6234measureBRTryo0.getHeight();
        Map<AlignmentLine, Integer> singletonMap = Collections.singletonMap(SliderKt.getCornerSizeAlignmentLine(), Integer.valueOf(height));
        singletonMap.getClass();
        return measureScope.layout(width, height2, singletonMap, new h7(6, mo6234measureBRTryo0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrackImpl_xlyIBlM$lambda$46$lambda$45(float f, RangeSliderState rangeSliderState, long j, long j2, long j3, long j4, float f2, float f3, my myVar, ny nyVar, DrawScope drawScope) {
        m2409drawTrackGVD57ws$default(INSTANCE, drawScope, rangeSliderState.getTickFractions$material3(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3(), j, j2, j3, j4, drawScope.mo363toDpu2uoSUM(rangeSliderState.getStartThumbWidth$material3()), drawScope.mo363toDpu2uoSUM(rangeSliderState.getStartThumbHeight$material3()), drawScope.mo363toDpu2uoSUM(rangeSliderState.getEndThumbWidth$material3()), drawScope.mo363toDpu2uoSUM(rangeSliderState.getEndThumbHeight$material3()), f2, f3, drawScope.mo363toDpu2uoSUM(Dp.m7616equalsimpl0(f, Dp.Companion.m7631getUnspecifiedD9Ej5fM()) ? Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) / 2.0f : drawScope.mo367toPx0680j_4(f)), myVar, nyVar, true, false, null, false, 917504, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrackImpl_xlyIBlM$lambda$47(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, int i, Composer composer, int i2) {
        sliderDefaults.m2407TrackImplxlyIBlM(rangeSliderState, f, modifier, z, sliderColors, myVar, nyVar, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_4EFweAY$lambda$15$lambda$14(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, offset.m4526unboximpl(), TrackStopIndicatorSize, m2405trackColorWaAFU9c$material3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_4EFweAY$lambda$17(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2415Track4EFweAY(sliderState, modifier, z, sliderColors, myVar, nyVar, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_4EFweAY$lambda$35$lambda$34(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, offset.m4526unboximpl(), TrackStopIndicatorSize, m2405trackColorWaAFU9c$material3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_4EFweAY$lambda$37(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2414Track4EFweAY(rangeSliderState, modifier, z, sliderColors, myVar, nyVar, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_mnvyFg4$lambda$19$lambda$18(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, offset.m4526unboximpl(), TrackStopIndicatorSize, m2405trackColorWaAFU9c$material3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_mnvyFg4$lambda$21(SliderDefaults sliderDefaults, SliderState sliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2417TrackmnvyFg4$material3(sliderState, f, modifier, z, sliderColors, myVar, nyVar, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_mnvyFg4$lambda$39$lambda$38(SliderColors sliderColors, boolean z, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = INSTANCE;
        long m2405trackColorWaAFU9c$material3 = sliderColors.m2405trackColorWaAFU9c$material3(z, true);
        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, offset.m4526unboximpl(), TrackStopIndicatorSize, m2405trackColorWaAFU9c$material3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Track_mnvyFg4$lambda$41(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, int i, int i2, Composer composer, int i3) {
        sliderDefaults.m2416TrackmnvyFg4$material3(rangeSliderState, f, modifier, z, sliderColors, myVar, nyVar, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x04eb, code lost:
    
        if (r10 == (r35.length - 1)) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0507, code lost:
    
        if (((r3 < r33 || r3 > r4) ? false : r29) == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0517, code lost:
    
        if (((r3 < r5 || r3 > r24) ? false : r29) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        if ((r35.length == 0) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0260, code lost:
    
        if ((r35.length == 0 ? r29 : false) == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d5  */
    /* renamed from: drawTrack-GVD57ws, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m2408drawTrackGVD57ws(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, float f8, float f9, my myVar, ny nyVar, boolean z, boolean z2, Orientation orientation, boolean z3) {
        float f10;
        float f11;
        boolean z4;
        long m4508constructorimpl;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int length;
        int i;
        float f17;
        float f18;
        float f19;
        long m4508constructorimpl2;
        float mo367toPx0680j_4;
        float mo367toPx0680j_42;
        float mo367toPx0680j_43;
        boolean z5 = orientation == Orientation.Vertical;
        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        boolean z7 = z6 && !z5;
        float mo367toPx0680j_44 = drawScope.mo367toPx0680j_4(f9);
        long mo5335getSizeNHjbRc = drawScope.mo5335getSizeNHjbRc();
        float intBitsToFloat = Float.intBitsToFloat((int) (z5 ? mo5335getSizeNHjbRc & 4294967295L : mo5335getSizeNHjbRc >> 32));
        boolean z8 = q10.a(ac.b0(fArr), f) || q10.a(ac.i0(fArr), f);
        float f20 = ((fArr.length == 0) || (q10.a(ac.b0(fArr), f2) || q10.a(ac.i0(fArr), f2))) ? ((intBitsToFloat - 0.0f) * f2) + 0.0f : (((intBitsToFloat - 0.0f) - (mo367toPx0680j_44 * 2.0f)) * f2) + 0.0f + mo367toPx0680j_44;
        float f21 = ((fArr.length == 0) || z8) ? ((intBitsToFloat - 0.0f) * f) + 0.0f : (((intBitsToFloat - 0.0f) - (mo367toPx0680j_44 * 2.0f)) * f) + 0.0f + mo367toPx0680j_44;
        float mo367toPx0680j_45 = drawScope.mo367toPx0680j_4(f8);
        if (Dp.m7610compareTo0680j_4(f7, Dp.m7611constructorimpl(0.0f)) > 0) {
            if (z5) {
                mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(f7) + (drawScope.mo367toPx0680j_4(f4) / 2.0f);
                mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(f6) / 2.0f;
                mo367toPx0680j_43 = drawScope.mo367toPx0680j_4(f7);
            } else {
                mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(f7) + (drawScope.mo367toPx0680j_4(f3) / 2.0f);
                mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(f5) / 2.0f;
                mo367toPx0680j_43 = drawScope.mo367toPx0680j_4(f7);
            }
            f10 = mo367toPx0680j_43 + mo367toPx0680j_42;
            f11 = mo367toPx0680j_4;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (z5 ? mo5334getCenterF1C5BW0 & 4294967295L : mo5334getCenterF1C5BW0 >> 32));
        float f22 = f11 + 0.0f;
        if (z2) {
        }
        f22 += mo367toPx0680j_44;
        float min = z3 ? Math.min(f20, intBitsToFloat2) : f21;
        if ((z3 || z) && min > f22) {
            float f23 = z7 ? mo367toPx0680j_45 : mo367toPx0680j_44;
            float f24 = z7 ? mo367toPx0680j_44 : mo367toPx0680j_45;
            float f25 = min - f11;
            if (z7) {
                z4 = true;
                m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - f25) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            } else {
                z4 = true;
                m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }
            f12 = intBitsToFloat2;
            f13 = f20;
            m2410drawTrackPathzXTsYAs(drawScope, orientation, m4508constructorimpl, z5 ? Size.m4576constructorimpl((Float.floatToRawIntBits(f25 - 0.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) << 32)) : Size.m4576constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f25 - 0.0f) << 32)), j, f23, f24);
            long m4508constructorimpl3 = z5 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_44 + 0.0f) & 4294967295L)) : z6 ? Offset.m4508constructorimpl((Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - 0.0f) - mo367toPx0680j_44) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L)) : Offset.m4508constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_44 + 0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
            if (myVar != null) {
                myVar.invoke(drawScope, Offset.m4505boximpl(m4508constructorimpl3));
            }
        } else {
            f12 = intBitsToFloat2;
            f13 = f20;
            z4 = true;
        }
        float f26 = intBitsToFloat - f10;
        if (z2) {
        }
        f26 -= mo367toPx0680j_44;
        float max = z3 ? Math.max(f13, f12) : f13;
        if (max < f26) {
            float f27 = intBitsToFloat - (max + f10);
            m2410drawTrackPathzXTsYAs(drawScope, orientation, z5 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L)) : z6 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)) : Offset.m4508constructorimpl((Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), z5 ? Size.m4576constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L)) : (!z6 || z) ? Size.m4576constructorimpl((Float.floatToRawIntBits(f27) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L)) : Size.m4576constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - r0) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L)), j, z7 ? mo367toPx0680j_44 : mo367toPx0680j_45, z7 ? mo367toPx0680j_45 : mo367toPx0680j_44);
            long m4508constructorimpl4 = z5 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat - mo367toPx0680j_44) & 4294967295L)) : z6 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_44) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L)) : Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat - mo367toPx0680j_44) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
            if (myVar != null) {
                myVar.invoke(drawScope, Offset.m4505boximpl(m4508constructorimpl4));
            }
        }
        if (z3) {
            f14 = min + (min < f12 ? f11 : 0.0f);
        } else {
            f14 = z ? f21 + f11 : 0.0f;
        }
        if (z3) {
            f15 = max - (max > f12 ? f10 : 0.0f);
        } else {
            f15 = f13 - f10;
        }
        float f28 = (z7 || z3 || z) ? mo367toPx0680j_45 : mo367toPx0680j_44;
        float f29 = (!z7 || z3 || z) ? mo367toPx0680j_45 : mo367toPx0680j_44;
        float f30 = (!z7 || z3 || z) ? f15 - f14 : f15;
        if (z2) {
            if (fArr.length == 0 ? z4 : false) {
                f16 = 0.0f;
                if (f30 > f16) {
                    m2410drawTrackPathzXTsYAs(drawScope, orientation, z5 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L)) : z6 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - f15) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)) : Offset.m4508constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), z5 ? Size.m4576constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f30) & 4294967295L)) : (!z6 || z3 || z) ? Size.m4576constructorimpl((Float.floatToRawIntBits(f30) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L)) : Size.m4576constructorimpl((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) & 4294967295L)), j2, f28, f29);
                }
                float f31 = 0.0f + mo367toPx0680j_44;
                float f32 = intBitsToFloat - mo367toPx0680j_44;
                float f33 = f12 - f10;
                float f34 = f12 + f10;
                float f35 = f21 - f11;
                float f36 = f21 + f11;
                float f37 = f13 - f10;
                float f38 = f13 + f10;
                length = fArr.length;
                i = 0;
                int i2 = 0;
                while (i < length) {
                    float f39 = fArr[i];
                    int i3 = i2 + 1;
                    if (myVar != null) {
                        if ((z3 || z) && i2 == 0) {
                            f17 = f33;
                        } else {
                            f17 = f33;
                        }
                        f18 = f32;
                        i++;
                        f33 = f17;
                        f32 = f18;
                        i2 = i3;
                    } else {
                        f17 = f33;
                    }
                    float lerp = MathHelpersKt.lerp(f31, f32, f39);
                    if (z3) {
                    }
                    if (z) {
                    }
                    if (!((lerp < f37 || lerp > f38) ? false : z4)) {
                        if (z5) {
                            f18 = f32;
                            f19 = lerp;
                            m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L));
                        } else {
                            f18 = f32;
                            f19 = lerp;
                            m4508constructorimpl2 = z6 ? Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - f19) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L)) : Offset.m4508constructorimpl((Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5334getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
                        }
                        nyVar.invoke(drawScope, Offset.m4505boximpl(m4508constructorimpl2), Color.m4751boximpl(((f19 > f14 ? 1 : (f19 == f14 ? 0 : -1)) < 0 || (f19 > f15 ? 1 : (f19 == f15 ? 0 : -1)) > 0) ? false : z4 ? j4 : j3));
                        i++;
                        f33 = f17;
                        f32 = f18;
                        i2 = i3;
                    }
                    f18 = f32;
                    i++;
                    f33 = f17;
                    f32 = f18;
                    i2 = i3;
                }
            }
        }
        f16 = f28;
        if (f30 > f16) {
        }
        float f312 = 0.0f + mo367toPx0680j_44;
        float f322 = intBitsToFloat - mo367toPx0680j_44;
        float f332 = f12 - f10;
        float f342 = f12 + f10;
        float f352 = f21 - f11;
        float f362 = f21 + f11;
        float f372 = f13 - f10;
        float f382 = f13 + f10;
        length = fArr.length;
        i = 0;
        int i22 = 0;
        while (i < length) {
        }
    }

    /* renamed from: drawTrack-GVD57ws$default, reason: not valid java name */
    public static /* synthetic */ void m2409drawTrackGVD57ws$default(SliderDefaults sliderDefaults, DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, float f8, float f9, my myVar, ny nyVar, boolean z, boolean z2, Orientation orientation, boolean z3, int i, Object obj) {
        sliderDefaults.m2408drawTrackGVD57ws(drawScope, fArr, f, f2, j, j2, j3, j4, f3, f4, f5, f6, f7, f8, f9, myVar, nyVar, z, (i & Fields.RenderEffect) != 0 ? false : z2, (i & Fields.ColorFilter) != 0 ? Orientation.Horizontal : orientation, (i & Fields.BlendMode) != 0 ? false : z3);
    }

    /* renamed from: drawTrackPath-zXTsYAs, reason: not valid java name */
    private final void m2410drawTrackPathzXTsYAs(DrawScope drawScope, Orientation orientation, long j, long j2, long j3, float f, float f2) {
        RoundRect m4568RoundRectZAM2FJo;
        long m4470constructorimpl = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        long m4470constructorimpl2 = CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        if (orientation == Orientation.Vertical) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            m4568RoundRectZAM2FJo = RoundRectKt.m4568RoundRectZAM2FJo(RectKt.m4556Recttz77jQw(j, Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32))), m4470constructorimpl, m4470constructorimpl, m4470constructorimpl2, m4470constructorimpl2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            m4568RoundRectZAM2FJo = RoundRectKt.m4568RoundRectZAM2FJo(RectKt.m4556Recttz77jQw(j, Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32))), m4470constructorimpl, m4470constructorimpl2, m4470constructorimpl2, m4470constructorimpl);
        }
        Path path = trackPath;
        Path.addRoundRect$default(path, m4568RoundRectZAM2FJo, null, 2, null);
        DrawScope.m5325drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: CenteredTrack-7LSsfP0$material3, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2411CenteredTrack7LSsfP0$material3(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, float f3, Composer composer, int i, int i2) {
        SliderState sliderState2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        SliderColors sliderColors2;
        my myVar2;
        int i5;
        int i6;
        float f4;
        int i7;
        float f5;
        int i8;
        int i9;
        float f6;
        Modifier modifier3;
        boolean z3;
        SliderColors sliderColors3;
        float f7;
        my myVar3;
        ny nyVar2;
        float f8;
        ScopeUpdateScope endRestartGroup;
        ny nyVar3;
        float m7631getUnspecifiedD9Ej5fM;
        float f9;
        float f10;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1199441071);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            sliderState2 = sliderState;
        } else if ((i & 6) == 0) {
            sliderState2 = sliderState;
            i3 = (startRestartGroup.changedInstance(sliderState2) ? 4 : 2) | i;
        } else {
            sliderState2 = sliderState;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i11 = Fields.CameraDistance;
                            i3 |= i11;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i11 = Fields.RotationZ;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        myVar2 = myVar;
                        if (startRestartGroup.changedInstance(myVar2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        myVar2 = myVar;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    myVar2 = myVar;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f4 = f;
                } else {
                    f4 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 1048576 : Fields.BlendMode;
                    }
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f5 = f2;
                } else {
                    f5 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f5) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                i8 = i2 & Fields.RotationX;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i9 = i8;
                    i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i2 & Fields.RotationY) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i3) == 306783378, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        f6 = f4;
                        modifier3 = modifier2;
                        z3 = z2;
                        sliderColors3 = sliderColors2;
                        f7 = f5;
                        myVar3 = myVar2;
                        nyVar2 = nyVar;
                        f8 = f3;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 27) & 14);
                                i3 &= -7169;
                                sliderColors2 = colors;
                            }
                            if ((i2 & 16) != 0) {
                                boolean z4 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new fq0(sliderColors2, z2, 2);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                myVar2 = (my) rememberedValue;
                                i3 = (-57345) & i3;
                            }
                            if (i5 != 0) {
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new ny() { // from class: androidx.compose.material3.SliderDefaults$CenteredTrack$2$1
                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            m2422invokewPWG1Vc((DrawScope) obj, ((Offset) obj2).m4526unboximpl(), ((Color) obj3).m4771unboximpl());
                                            return w01.a;
                                        }

                                        /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                        public final void m2422invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m2420getTickSizeD9Ej5fM(), j2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                nyVar3 = (ny) rememberedValue2;
                            } else {
                                nyVar3 = nyVar;
                            }
                            if (i6 != 0) {
                                f10 = SliderKt.ThumbTrackGapSize;
                                f4 = f10;
                            }
                            if (i7 != 0) {
                                f9 = SliderKt.TrackInsideCornerSize;
                                f5 = f9;
                            }
                            if (i9 != 0) {
                                m7631getUnspecifiedD9Ej5fM = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
                                f6 = f4;
                                z3 = z2;
                                f7 = f5;
                                myVar3 = myVar2;
                                int i13 = i3;
                                sliderColors3 = sliderColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1199441071, i13, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                                }
                                int i14 = i13 << 3;
                                Modifier modifier4 = modifier2;
                                nyVar2 = nyVar3;
                                SliderState sliderState3 = sliderState2;
                                modifier3 = modifier4;
                                m2406TrackImplVvwgllI(sliderState3, m7631getUnspecifiedD9Ej5fM, modifier3, z3, sliderColors3, myVar3, nyVar2, f6, f7, true, true, startRestartGroup, (i14 & 234881024) | (i13 & 14) | 805306368 | ((i13 >> 21) & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14), ((i13 >> 24) & 112) | 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f8 = m7631getUnspecifiedD9Ej5fM;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            nyVar3 = nyVar;
                        }
                        m7631getUnspecifiedD9Ej5fM = f3;
                        f6 = f4;
                        z3 = z2;
                        f7 = f5;
                        myVar3 = myVar2;
                        int i132 = i3;
                        sliderColors3 = sliderColors2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i142 = i132 << 3;
                        Modifier modifier42 = modifier2;
                        nyVar2 = nyVar3;
                        SliderState sliderState32 = sliderState2;
                        modifier3 = modifier42;
                        m2406TrackImplVvwgllI(sliderState32, m7631getUnspecifiedD9Ej5fM, modifier3, z3, sliderColors3, myVar3, nyVar2, f6, f7, true, true, startRestartGroup, (i142 & 234881024) | (i132 & 14) | 805306368 | ((i132 >> 21) & 112) | (i142 & 896) | (i142 & 7168) | (57344 & i142) | (458752 & i142) | (3670016 & i142) | (29360128 & i142), ((i132 >> 24) & 112) | 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f8 = m7631getUnspecifiedD9Ej5fM;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new gq0(this, sliderState, modifier3, z3, sliderColors3, myVar3, nyVar2, f6, f7, f8, i, i2));
                        return;
                    }
                    return;
                }
                i9 = i8;
                if ((i2 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i3) == 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i2 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i3) == 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i2 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i3) == 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0065  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2412Thumb9LiSoMs(MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        long j3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        long j5;
        Object rememberedValue;
        Composer.Companion companion;
        boolean z3;
        Object rememberedValue2;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-290277409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = Fields.RotationX;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = Fields.SpotShadowColor;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? Fields.Clip : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= startRestartGroup.changed(this) ? Fields.RenderEffect : 65536;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        j3 = j2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = colors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                j4 = SliderKt.ThumbSize;
                                j5 = j4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                companion = Composer.Companion;
                                if (rememberedValue == companion.getEmpty()) {
                                    rememberedValue = SnapshotStateKt.mutableStateListOf();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
                                int i8 = i3 & 14;
                                z3 = i8 == 4;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z3 || rememberedValue2 == companion.getEmpty()) {
                                    rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                EffectsKt.LaunchedEffect(mutableInteractionSource, (my) rememberedValue2, startRestartGroup, i8);
                                SpacerKt.Spacer(BackgroundKt.m226backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m808size6HolHcs(modifier2, snapshotStateList.isEmpty() ? DpSize.m7702copyDwJknco$default(j5, Dp.m7611constructorimpl(DpSize.m7709getWidthD9Ej5fM(j5) / 2.0f), 0.0f, 2, null) : j5), mutableInteractionSource, false, 2, null), sliderColors2.m2403thumbColorvNxB06k$material3(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j3 = j5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        }
                        j5 = j2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue;
                        int i82 = i3 & 14;
                        if (i82 == 4) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        EffectsKt.LaunchedEffect(mutableInteractionSource, (my) rememberedValue2, startRestartGroup, i82);
                        SpacerKt.Spacer(BackgroundKt.m226backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m808size6HolHcs(modifier2, snapshotStateList2.isEmpty() ? DpSize.m7702copyDwJknco$default(j5, Dp.m7611constructorimpl(DpSize.m7709getWidthD9Ej5fM(j5) / 2.0f), 0.0f, 2, null) : j5), mutableInteractionSource, false, 2, null), sliderColors2.m2403thumbColorvNxB06k$material3(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j3 = j5;
                    }
                    SliderColors sliderColors3 = sliderColors2;
                    boolean z4 = z2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new u5(this, mutableInteractionSource, modifier2, sliderColors3, z4, j3, i, i2));
                        return;
                    }
                    return;
                }
                j2 = j;
                if ((i2 & 32) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                }
                SliderColors sliderColors32 = sliderColors2;
                boolean z42 = z2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i2 & 32) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
            }
            SliderColors sliderColors322 = sliderColors2;
            boolean z422 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i2 & 32) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
        }
        SliderColors sliderColors3222 = sliderColors2;
        boolean z4222 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009c  */
    /* renamed from: Thumb-HwbPF3A$material3, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2413ThumbHwbPF3A$material3(MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, int i, int i2) {
        int i3;
        SliderState sliderState2;
        int i4;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i5;
        boolean z2;
        int i6;
        long j2;
        ScopeUpdateScope endRestartGroup;
        long j3;
        long j4;
        Object rememberedValue;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        boolean z3;
        Object rememberedValue2;
        long j5;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-889714565);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            sliderState2 = sliderState;
            i3 |= startRestartGroup.changedInstance(sliderState2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i7 = Fields.CameraDistance;
                            i3 |= i7;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i7 = Fields.RotationZ;
                    i3 |= i7;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(j) ? Fields.RenderEffect : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(this) ? 1048576 : Fields.BlendMode;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        j2 = j;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i2 & 8) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -7169;
                                sliderColors2 = colors;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                j3 = SliderKt.ThumbSize;
                                j4 = j3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-889714565, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                companion = Composer.Companion;
                                if (rememberedValue == companion.getEmpty()) {
                                    rememberedValue = SnapshotStateKt.mutableStateListOf();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                snapshotStateList = (SnapshotStateList) rememberedValue;
                                int i8 = i3 & 14;
                                z3 = i8 == 4;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z3 || rememberedValue2 == companion.getEmpty()) {
                                    rememberedValue2 = new SliderDefaults$Thumb$3$1(mutableInteractionSource, snapshotStateList, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                EffectsKt.LaunchedEffect(mutableInteractionSource, (my) rememberedValue2, startRestartGroup, i8);
                                if (snapshotStateList.isEmpty()) {
                                    j5 = sliderState2.getOrientation$material3() == Orientation.Vertical ? DpSize.m7702copyDwJknco$default(j4, 0.0f, Dp.m7611constructorimpl(DpSize.m7707getHeightD9Ej5fM(j4) / 2.0f), 1, null) : DpSize.m7702copyDwJknco$default(j4, Dp.m7611constructorimpl(DpSize.m7709getWidthD9Ej5fM(j4) / 2.0f), 0.0f, 2, null);
                                } else {
                                    j5 = j4;
                                }
                                SpacerKt.Spacer(BackgroundKt.m226backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m808size6HolHcs(modifier2, j5), mutableInteractionSource, false, 2, null), sliderColors2.m2403thumbColorvNxB06k$material3(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j2 = j4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        j4 = j;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) rememberedValue;
                        int i82 = i3 & 14;
                        if (i82 == 4) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        rememberedValue2 = new SliderDefaults$Thumb$3$1(mutableInteractionSource, snapshotStateList, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        EffectsKt.LaunchedEffect(mutableInteractionSource, (my) rememberedValue2, startRestartGroup, i82);
                        if (snapshotStateList.isEmpty()) {
                        }
                        SpacerKt.Spacer(BackgroundKt.m226backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m808size6HolHcs(modifier2, j5), mutableInteractionSource, false, 2, null), sliderColors2.m2403thumbColorvNxB06k$material3(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j2 = j4;
                    }
                    Modifier modifier3 = modifier2;
                    SliderColors sliderColors3 = sliderColors2;
                    boolean z4 = z2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new v5(this, mutableInteractionSource, sliderState, modifier3, sliderColors3, z4, j2, i, i2));
                        return;
                    }
                    return;
                }
                z2 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                Modifier modifier32 = modifier2;
                SliderColors sliderColors32 = sliderColors2;
                boolean z42 = z2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            Modifier modifier322 = modifier2;
            SliderColors sliderColors322 = sliderColors2;
            boolean z422 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        sliderState2 = sliderState;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        Modifier modifier3222 = modifier2;
        SliderColors sliderColors3222 = sliderColors2;
        boolean z4222 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005c  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, int i, int i2) {
        final SliderPositions sliderPositions2;
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier modifier3;
        SliderColors sliderColors3;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i5;
        SliderColors sliderColors4;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        boolean z5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1546713545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            sliderPositions2 = sliderPositions;
        } else {
            sliderPositions2 = sliderPositions;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(sliderPositions2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i7 = Fields.RotationX;
                        i3 |= i7;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i7 = Fields.SpotShadowColor;
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? Fields.Clip : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i8 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = colors;
                        }
                        SliderColors sliderColors5 = sliderColors2;
                        i5 = i3;
                        sliderColors4 = sliderColors5;
                        if (i4 != 0) {
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1546713545, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1318)");
                            }
                            int i9 = i5;
                            final long m2405trackColorWaAFU9c$material3 = sliderColors4.m2405trackColorWaAFU9c$material3(z4, false);
                            final long m2405trackColorWaAFU9c$material32 = sliderColors4.m2405trackColorWaAFU9c$material3(z4, true);
                            final long m2404tickColorWaAFU9c$material3 = sliderColors4.m2404tickColorWaAFU9c$material3(z4, false);
                            final long m2404tickColorWaAFU9c$material32 = sliderColors4.m2404tickColorWaAFU9c$material3(z4, true);
                            SliderColors sliderColors6 = sliderColors4;
                            modifier3 = modifier4;
                            Modifier m793height3ABfNKs = SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                            changed = startRestartGroup.changed(m2405trackColorWaAFU9c$material3) | ((i9 & 14) != 4) | startRestartGroup.changed(m2405trackColorWaAFU9c$material32) | startRestartGroup.changed(m2404tickColorWaAFU9c$material3) | startRestartGroup.changed(m2404tickColorWaAFU9c$material32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                z5 = z4;
                                i6 = 0;
                                ky kyVar = new ky() { // from class: nq0
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 Track$lambda$11$lambda$10;
                                        Track$lambda$11$lambda$10 = SliderDefaults.Track$lambda$11$lambda$10(m2405trackColorWaAFU9c$material3, sliderPositions2, m2405trackColorWaAFU9c$material32, m2404tickColorWaAFU9c$material3, m2404tickColorWaAFU9c$material32, (DrawScope) obj);
                                        return Track$lambda$11$lambda$10;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(kyVar);
                                rememberedValue = kyVar;
                            } else {
                                z5 = z4;
                                i6 = 0;
                            }
                            CanvasKt.Canvas(m793height3ABfNKs, (ky) rememberedValue, startRestartGroup, i6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            sliderColors3 = sliderColors6;
                            z3 = z5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        SliderColors sliderColors7 = sliderColors2;
                        i5 = i3;
                        sliderColors4 = sliderColors7;
                        modifier4 = modifier2;
                    }
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i5;
                    final long m2405trackColorWaAFU9c$material33 = sliderColors4.m2405trackColorWaAFU9c$material3(z4, false);
                    final long m2405trackColorWaAFU9c$material322 = sliderColors4.m2405trackColorWaAFU9c$material3(z4, true);
                    final long m2404tickColorWaAFU9c$material33 = sliderColors4.m2404tickColorWaAFU9c$material3(z4, false);
                    final long m2404tickColorWaAFU9c$material322 = sliderColors4.m2404tickColorWaAFU9c$material3(z4, true);
                    SliderColors sliderColors62 = sliderColors4;
                    modifier3 = modifier4;
                    Modifier m793height3ABfNKs2 = SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    changed = startRestartGroup.changed(m2405trackColorWaAFU9c$material33) | ((i92 & 14) != 4) | startRestartGroup.changed(m2405trackColorWaAFU9c$material322) | startRestartGroup.changed(m2404tickColorWaAFU9c$material33) | startRestartGroup.changed(m2404tickColorWaAFU9c$material322);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    z5 = z4;
                    i6 = 0;
                    ky kyVar2 = new ky() { // from class: nq0
                        @Override // defpackage.ky
                        public final Object invoke(Object obj) {
                            w01 Track$lambda$11$lambda$10;
                            Track$lambda$11$lambda$10 = SliderDefaults.Track$lambda$11$lambda$10(m2405trackColorWaAFU9c$material33, sliderPositions2, m2405trackColorWaAFU9c$material322, m2404tickColorWaAFU9c$material33, m2404tickColorWaAFU9c$material322, (DrawScope) obj);
                            return Track$lambda$11$lambda$10;
                        }
                    };
                    startRestartGroup.updateRememberedValue(kyVar2);
                    rememberedValue = kyVar2;
                    CanvasKt.Canvas(m793height3ABfNKs2, (ky) rememberedValue, startRestartGroup, i6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    sliderColors3 = sliderColors62;
                    z3 = z5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new tp(this, sliderPositions, modifier3, sliderColors3, z3, i, i2, 4));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2414Track4EFweAY(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        SliderColors sliderColors2;
        my myVar2;
        int i5;
        int i6;
        float f3;
        int i7;
        Modifier modifier3;
        boolean z3;
        SliderColors sliderColors3;
        my myVar3;
        float f4;
        float f5;
        ny nyVar2;
        ScopeUpdateScope endRestartGroup;
        ny nyVar3;
        int i8;
        float f6;
        float f7;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-541824132);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i10 = Fields.CameraDistance;
                            i3 |= i10;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i10 = Fields.RotationZ;
                    i3 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        myVar2 = myVar;
                        if (startRestartGroup.changedInstance(myVar2)) {
                            i9 = Fields.Clip;
                            i3 |= i9;
                        }
                    } else {
                        myVar2 = myVar;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    myVar2 = myVar;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 1048576 : Fields.BlendMode;
                    }
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if ((i2 & Fields.RotationX) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                int i12 = 1;
                if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 24) & 14);
                            i3 &= -7169;
                            sliderColors2 = colors;
                        }
                        if ((i2 & 16) != 0) {
                            boolean z4 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new fq0(sliderColors2, z2, i12);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            myVar2 = (my) rememberedValue;
                            i3 = (-57345) & i3;
                        }
                        if (i5 != 0) {
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new ny() { // from class: androidx.compose.material3.SliderDefaults$Track$12$1
                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        m2423invokewPWG1Vc((DrawScope) obj, ((Offset) obj2).m4526unboximpl(), ((Color) obj3).m4771unboximpl());
                                        return w01.a;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m2423invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m2420getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            nyVar3 = (ny) rememberedValue2;
                        } else {
                            nyVar3 = nyVar;
                        }
                        if (i6 != 0) {
                            f7 = SliderKt.ThumbTrackGapSize;
                            f3 = f7;
                        }
                        if (i7 != 0) {
                            f6 = SliderKt.TrackInsideCornerSize;
                            z3 = z2;
                            myVar3 = myVar2;
                            f5 = f3;
                            nyVar2 = nyVar3;
                            i8 = i3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            f4 = f6;
                        } else {
                            z3 = z2;
                            myVar3 = myVar2;
                            f5 = f3;
                            nyVar2 = nyVar3;
                            i8 = i3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            f4 = f2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i8 = i3;
                        modifier3 = modifier2;
                        z3 = z2;
                        sliderColors3 = sliderColors2;
                        myVar3 = myVar2;
                        f4 = f2;
                        f5 = f3;
                        nyVar2 = nyVar;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-541824132, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1734)");
                    }
                    int i13 = (i8 & 14) | 48;
                    int i14 = i8 << 3;
                    m2407TrackImplxlyIBlM(rangeSliderState, Dp.Companion.m7631getUnspecifiedD9Ej5fM(), modifier3, z3, sliderColors3, myVar3, nyVar2, f5, f4, startRestartGroup, i13 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    myVar3 = myVar2;
                    f4 = f2;
                    f5 = f3;
                    nyVar2 = nyVar;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new lm0(this, rangeSliderState, modifier3, z3, sliderColors3, myVar3, nyVar2, f5, f4, i, i2, 1));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            if ((i2 & Fields.RotationX) != 0) {
            }
            int i122 = 1;
            if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        if ((i2 & Fields.RotationX) != 0) {
        }
        int i1222 = 1;
        if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-mnvyFg4$material3, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2417TrackmnvyFg4$material3(SliderState sliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SliderColors sliderColors2;
        my myVar2;
        int i6;
        int i7;
        float f4;
        int i8;
        int i9;
        ny nyVar2;
        Modifier modifier3;
        boolean z3;
        SliderColors sliderColors3;
        float f5;
        my myVar3;
        float f6;
        ScopeUpdateScope endRestartGroup;
        ny nyVar3;
        float f7;
        float f8;
        Modifier modifier4;
        SliderColors sliderColors4;
        my myVar4;
        ny nyVar4;
        int i10;
        boolean z4;
        float f9;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1691224881);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i12 = Fields.Clip;
                                i3 |= i12;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            myVar2 = myVar;
                            if (startRestartGroup.changedInstance(myVar2)) {
                                i11 = Fields.RenderEffect;
                                i3 |= i11;
                            }
                        } else {
                            myVar2 = myVar;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        myVar2 = myVar;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        f4 = f2;
                    } else {
                        f4 = f2;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        int i13 = 0;
                        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    SliderColors colors = colors(startRestartGroup, (i3 >> 27) & 14);
                                    i3 &= -57345;
                                    sliderColors2 = colors;
                                }
                                if ((i2 & 32) != 0) {
                                    boolean z5 = ((((i3 & 57344) ^ 24576) > 16384 && startRestartGroup.changed(sliderColors2)) || (i3 & 24576) == 16384) | ((i3 & 7168) == 2048);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new fq0(sliderColors2, z2, i13);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    myVar2 = (my) rememberedValue;
                                    i3 &= -458753;
                                }
                                if (i6 != 0) {
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new ny() { // from class: androidx.compose.material3.SliderDefaults$Track$8$1
                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                m2426invokewPWG1Vc((DrawScope) obj, ((Offset) obj2).m4526unboximpl(), ((Color) obj3).m4771unboximpl());
                                                return w01.a;
                                            }

                                            /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                            public final void m2426invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                                sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m2420getTickSizeD9Ej5fM(), j2);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    nyVar3 = (ny) rememberedValue2;
                                } else {
                                    nyVar3 = nyVar;
                                }
                                float f10 = i7 != 0 ? SliderKt.ThumbTrackGapSize : f4;
                                if (i9 != 0) {
                                    f9 = SliderKt.TrackInsideCornerSize;
                                    f8 = f10;
                                    f7 = f9;
                                } else {
                                    f7 = f3;
                                    f8 = f10;
                                }
                                modifier4 = modifier2;
                                sliderColors4 = sliderColors2;
                                myVar4 = myVar2;
                                nyVar4 = nyVar3;
                                i10 = i3;
                                z4 = z2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                f7 = f3;
                                i10 = i3;
                                modifier4 = modifier2;
                                z4 = z2;
                                sliderColors4 = sliderColors2;
                                f8 = f4;
                                myVar4 = myVar2;
                                nyVar4 = nyVar;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1691224881, i10, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                            }
                            m2406TrackImplVvwgllI(sliderState, f, modifier4, z4, sliderColors4, myVar4, nyVar4, f8, f7, true, false, startRestartGroup, (57344 & i10) | (i10 & 14) | 805306368 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10), ((i10 >> 24) & 112) | 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f6 = f7;
                            f5 = f8;
                            nyVar2 = nyVar4;
                            myVar3 = myVar4;
                            sliderColors3 = sliderColors4;
                            z3 = z4;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            nyVar2 = nyVar;
                            modifier3 = modifier2;
                            z3 = z2;
                            sliderColors3 = sliderColors2;
                            f5 = f4;
                            myVar3 = myVar2;
                            f6 = f3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new gq0(this, sliderState, f, modifier3, z3, sliderColors3, myVar3, nyVar2, f5, f6, i, i2, 0));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    int i132 = 0;
                    if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & Fields.RotationY) != 0) {
                }
                int i1322 = 0;
                if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & Fields.RotationY) != 0) {
            }
            int i13222 = 0;
            if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & Fields.RotationY) != 0) {
        }
        int i132222 = 0;
        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final SliderColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1107)");
        }
        SliderColors defaultSliderColors$material3 = getDefaultSliderColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSliderColors$material3;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2418colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        long j11;
        long j12;
        long m4797getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i3 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long j13 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU9 = (i3 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i3 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            j11 = m4797getUnspecified0d7_KjU9;
            j12 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1149)");
        } else {
            j11 = m4797getUnspecified0d7_KjU9;
            j12 = m4797getUnspecified0d7_KjU2;
        }
        SliderColors m2392copyK518z4 = getDefaultSliderColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2392copyK518z4(j13, j12, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, j11, m4797getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2392copyK518z4;
    }

    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2419drawStopIndicatorx3O1jOs(DrawScope drawScope, long j, float f, long j2) {
        DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, j2, drawScope.mo367toPx0680j_4(f) / 2.0f, j, 0.0f, null, null, 0, 120, null);
    }

    public final SliderColors getDefaultSliderColors$material3(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached$material3 = colorScheme.getDefaultSliderColorsCached$material3();
        if (defaultSliderColorsCached$material3 != null) {
            return defaultSliderColorsCached$material3;
        }
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledHandleColor()), sliderTokens.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3(sliderColors);
        return sliderColors;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2420getTickSizeD9Ej5fM() {
        return TickSize;
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2421getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0057  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier modifier3;
        SliderColors sliderColors3;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        SliderColors sliderColors4;
        int i5;
        boolean z4;
        float f;
        float f2;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(593554206);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = Fields.RotationX;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = Fields.SpotShadowColor;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? Fields.Clip : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier4 = modifier2;
                        sliderColors4 = sliderColors2;
                        i5 = i3;
                    } else {
                        modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors4 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors4 = sliderColors2;
                        }
                        i5 = i3;
                        if (i4 != 0) {
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(593554206, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1400)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            Modifier modifier5 = modifier4;
                            sliderColors3 = sliderColors4;
                            m2415Track4EFweAY(sliderState, modifier5, z4, sliderColors3, (my) null, (ny) null, f, f2, startRestartGroup, (i5 & 14) | 14155776 | (i5 & 112) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            modifier3 = modifier5;
                        }
                    }
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    Modifier modifier52 = modifier4;
                    sliderColors3 = sliderColors4;
                    m2415Track4EFweAY(sliderState, modifier52, z4, sliderColors3, (my) null, (ny) null, f, f2, startRestartGroup, (i5 & 14) | 14155776 | (i5 & 112) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    modifier3 = modifier52;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new tp(this, sliderState, modifier3, sliderColors3, z3, i, i2, 3));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0057  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier modifier3;
        SliderColors sliderColors3;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        SliderColors sliderColors4;
        int i5;
        boolean z4;
        float f;
        float f2;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1617869097);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = Fields.RotationX;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = Fields.SpotShadowColor;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? Fields.Clip : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier4 = modifier2;
                        sliderColors4 = sliderColors2;
                        i5 = i3;
                    } else {
                        modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors4 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors4 = sliderColors2;
                        }
                        i5 = i3;
                        if (i4 != 0) {
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1617869097, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1688)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            Modifier modifier5 = modifier4;
                            sliderColors3 = sliderColors4;
                            m2414Track4EFweAY(rangeSliderState, modifier5, z4, sliderColors3, (my) null, (ny) null, f, f2, startRestartGroup, (i5 & 14) | 14155776 | (i5 & 112) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            modifier3 = modifier5;
                        }
                    }
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    Modifier modifier52 = modifier4;
                    sliderColors3 = sliderColors4;
                    m2414Track4EFweAY(rangeSliderState, modifier52, z4, sliderColors3, (my) null, (ny) null, f, f2, startRestartGroup, (i5 & 14) | 14155776 | (i5 & 112) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    modifier3 = modifier52;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new tp(this, rangeSliderState, modifier3, sliderColors3, z3, i, i2, 5));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2415Track4EFweAY(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        SliderColors sliderColors2;
        my myVar2;
        int i5;
        int i6;
        float f3;
        int i7;
        ny nyVar2;
        Modifier modifier3;
        boolean z3;
        SliderColors sliderColors3;
        my myVar3;
        float f4;
        ScopeUpdateScope endRestartGroup;
        ny nyVar3;
        float f5;
        int i8;
        float f6;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(49984771);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i10 = Fields.CameraDistance;
                            i3 |= i10;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i10 = Fields.RotationZ;
                    i3 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        myVar2 = myVar;
                        if (startRestartGroup.changedInstance(myVar2)) {
                            i9 = Fields.Clip;
                            i3 |= i9;
                        }
                    } else {
                        myVar2 = myVar;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    myVar2 = myVar;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 1048576 : Fields.BlendMode;
                    }
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if ((i2 & Fields.RotationX) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 24) & 14);
                            i3 &= -7169;
                            sliderColors2 = colors;
                        }
                        if ((i2 & 16) != 0) {
                            boolean z4 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new fq0(sliderColors2, z2, 3);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            myVar2 = (my) rememberedValue;
                            i3 = (-57345) & i3;
                        }
                        if (i5 != 0) {
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new ny() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        m2425invokewPWG1Vc((DrawScope) obj, ((Offset) obj2).m4526unboximpl(), ((Color) obj3).m4771unboximpl());
                                        return w01.a;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m2425invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                        sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m2420getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            nyVar3 = (ny) rememberedValue2;
                        } else {
                            nyVar3 = nyVar;
                        }
                        if (i6 != 0) {
                            f6 = SliderKt.ThumbTrackGapSize;
                            f3 = f6;
                        }
                        if (i7 != 0) {
                            f5 = SliderKt.TrackInsideCornerSize;
                            nyVar2 = nyVar3;
                            i8 = i3;
                            z3 = z2;
                            sliderColors3 = sliderColors2;
                            f4 = f5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(49984771, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)");
                            }
                            int i12 = i8 << 3;
                            modifier3 = modifier2;
                            myVar3 = myVar2;
                            m2406TrackImplVvwgllI(sliderState, Dp.Companion.m7631getUnspecifiedD9Ej5fM(), modifier3, z3, sliderColors3, myVar3, nyVar2, f3, f4, false, false, startRestartGroup, (i8 & 14) | 805306416 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), ((i8 >> 21) & 112) | 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            nyVar2 = nyVar3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        nyVar2 = nyVar;
                    }
                    i8 = i3;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    f4 = f2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i8 << 3;
                    modifier3 = modifier2;
                    myVar3 = myVar2;
                    m2406TrackImplVvwgllI(sliderState, Dp.Companion.m7631getUnspecifiedD9Ej5fM(), modifier3, z3, sliderColors3, myVar3, nyVar2, f3, f4, false, false, startRestartGroup, (i8 & 14) | 805306416 | (i122 & 896) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024), ((i8 >> 21) & 112) | 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    nyVar2 = nyVar;
                    modifier3 = modifier2;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    myVar3 = myVar2;
                    f4 = f2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new lm0(this, sliderState, modifier3, z3, sliderColors3, myVar3, nyVar2, f3, f4, i, i2, 2));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            if ((i2 & Fields.RotationX) != 0) {
            }
            if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        if ((i2 & Fields.RotationX) != 0) {
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: Track-mnvyFg4$material3, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2416TrackmnvyFg4$material3(RangeSliderState rangeSliderState, float f, Modifier modifier, boolean z, SliderColors sliderColors, my myVar, ny nyVar, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SliderColors sliderColors2;
        int i6;
        ny nyVar2;
        int i7;
        float f4;
        int i8;
        int i9;
        ny nyVar3;
        Modifier modifier3;
        Composer composer2;
        boolean z3;
        SliderColors sliderColors3;
        float f5;
        my myVar2;
        float f6;
        ScopeUpdateScope endRestartGroup;
        my myVar3;
        ny nyVar4;
        Modifier modifier4;
        float f7;
        my myVar4;
        float f8;
        float f9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1952945688);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i10 = Fields.Clip;
                                i3 |= i10;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i10 = 8192;
                        i3 |= i10;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    if ((i & 196608) == 0) {
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changedInstance(myVar)) ? Fields.RenderEffect : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        nyVar2 = nyVar;
                    } else {
                        nyVar2 = nyVar;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        f4 = f2;
                    } else {
                        f4 = f2;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    SliderColors colors = colors(startRestartGroup, (i3 >> 27) & 14);
                                    i3 &= -57345;
                                    sliderColors2 = colors;
                                }
                                if ((i2 & 32) != 0) {
                                    boolean z4 = ((((57344 & i3) ^ 24576) > 16384 && startRestartGroup.changed(sliderColors2)) || (i3 & 24576) == 16384) | ((i3 & 7168) == 2048);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new fq0(sliderColors2, z2, 4);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    myVar3 = (my) rememberedValue;
                                    i3 = (-458753) & i3;
                                } else {
                                    myVar3 = myVar;
                                }
                                if (i6 != 0) {
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new ny() { // from class: androidx.compose.material3.SliderDefaults$Track$15$1
                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                m2424invokewPWG1Vc((DrawScope) obj, ((Offset) obj2).m4526unboximpl(), ((Color) obj3).m4771unboximpl());
                                                return w01.a;
                                            }

                                            /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                            public final void m2424invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                                sliderDefaults.m2419drawStopIndicatorx3O1jOs(drawScope, j, sliderDefaults.m2420getTickSizeD9Ej5fM(), j2);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    nyVar2 = (ny) rememberedValue2;
                                }
                                if (i7 != 0) {
                                    f9 = SliderKt.ThumbTrackGapSize;
                                    f4 = f9;
                                }
                                if (i9 != 0) {
                                    f8 = SliderKt.TrackInsideCornerSize;
                                    Modifier modifier5 = modifier2;
                                    nyVar4 = nyVar2;
                                    modifier4 = modifier5;
                                    myVar4 = myVar3;
                                    f7 = f8;
                                } else {
                                    Modifier modifier6 = modifier2;
                                    nyVar4 = nyVar2;
                                    modifier4 = modifier6;
                                    f7 = f3;
                                    myVar4 = myVar3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                Modifier modifier7 = modifier2;
                                nyVar4 = nyVar2;
                                modifier4 = modifier7;
                                myVar4 = myVar;
                                f7 = f3;
                            }
                            int i11 = i3;
                            boolean z5 = z2;
                            SliderColors sliderColors4 = sliderColors2;
                            float f10 = f4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1952945688, i11, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                            }
                            m2407TrackImplxlyIBlM(rangeSliderState, f, modifier4, z5, sliderColors4, myVar4, nyVar4, f10, f7, startRestartGroup, i11 & 2147483646);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            f6 = f7;
                            f5 = f10;
                            nyVar3 = nyVar4;
                            myVar2 = myVar4;
                            sliderColors3 = sliderColors4;
                            z3 = z5;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            nyVar3 = nyVar2;
                            modifier3 = modifier2;
                            composer2 = startRestartGroup;
                            z3 = z2;
                            sliderColors3 = sliderColors2;
                            f5 = f4;
                            myVar2 = myVar;
                            f6 = f3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new gq0(this, rangeSliderState, f, modifier3, z3, sliderColors3, myVar2, nyVar3, f5, f6, i, i2, 2));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((i & 24576) != 0) {
                }
                if ((i & 196608) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 24576) != 0) {
            }
            if ((i & 196608) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
