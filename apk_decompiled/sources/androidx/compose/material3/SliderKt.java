package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.bq;
import defpackage.e00;
import defpackage.fi0;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.qb0;
import defpackage.qq0;
import defpackage.sh;
import defpackage.t5;
import defpackage.ti;
import defpackage.tl;
import defpackage.tq0;
import defpackage.uh;
import defpackage.ui;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.vq0;
import defpackage.w01;
import defpackage.w5;
import defpackage.wd;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yh0;
import defpackage.z4;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SliderKt {
    private static final VerticalAlignmentLine CornerSizeAlignmentLine;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight;
    private static final float TrackInsideCornerSize;
    private static final long VerticalThumbSize;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackHeight = sliderTokens.m3623getInactiveTrackHeightD9Ej5fM();
        float m3621getHandleWidthD9Ej5fM = sliderTokens.m3621getHandleWidthD9Ej5fM();
        ThumbWidth = m3621getHandleWidthD9Ej5fM;
        float m3620getHandleHeightD9Ej5fM = sliderTokens.m3620getHandleHeightD9Ej5fM();
        ThumbHeight = m3620getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m7633DpSizeYgX7TsA(m3621getHandleWidthD9Ej5fM, m3620getHandleHeightD9Ej5fM);
        VerticalThumbSize = DpKt.m7633DpSizeYgX7TsA(m3620getHandleHeightD9Ej5fM, m3621getHandleWidthD9Ej5fM);
        ThumbTrackGapSize = sliderTokens.m3613getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = Dp.m7611constructorimpl(2.0f);
        CornerSizeAlignmentLine = new VerticalAlignmentLine(SliderKt$CornerSizeAlignmentLine$1.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ui uiVar, final ky kyVar, Modifier modifier, boolean z, ui uiVar2, iy iyVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, int i, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z2;
        ui uiVar3;
        int i7;
        iy iyVar2;
        final SliderColors sliderColors2;
        int i8;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer composer2;
        final ny nyVar4;
        final boolean z3;
        final ui uiVar4;
        final SliderColors sliderColors3;
        final iy iyVar3;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource5;
        final ny nyVar5;
        final ny nyVar6;
        final int i20;
        ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        final MutableInteractionSource mutableInteractionSource6;
        Modifier modifier4;
        ny nyVar7;
        ny nyVar8;
        ny nyVar9;
        ny nyVar10;
        ny nyVar11;
        int i23;
        ny nyVar12;
        int i24;
        ny nyVar13;
        ny nyVar14;
        ny nyVar15;
        int i25;
        int i26;
        Composer startRestartGroup = composer.startRestartGroup(1924256162);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(uiVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i27 = i4 & 4;
        if (i27 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        uiVar3 = uiVar2;
                        if (startRestartGroup.changed(uiVar3)) {
                            i26 = Fields.Clip;
                            i5 |= i26;
                        }
                    } else {
                        uiVar3 = uiVar2;
                    }
                    i26 = 8192;
                    i5 |= i26;
                } else {
                    uiVar3 = uiVar2;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                    iyVar2 = iyVar;
                } else {
                    iyVar2 = iyVar;
                    if ((i2 & 196608) == 0) {
                        i5 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RenderEffect : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    sliderColors2 = sliderColors;
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(sliderColors2)) ? 1048576 : Fields.BlendMode;
                } else {
                    sliderColors2 = sliderColors;
                }
                i8 = i4 & Fields.SpotShadowColor;
                if (i8 != 0) {
                    i5 |= 12582912;
                    mutableInteractionSource3 = mutableInteractionSource;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(mutableInteractionSource3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                i9 = i4 & Fields.RotationX;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                i10 = i4 & Fields.RotationY;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i11 = i10;
                    i5 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i12 = i4 & Fields.RotationZ;
                    if (i12 == 0) {
                        i14 = i3 | 6;
                        i13 = i12;
                    } else if ((i3 & 6) == 0) {
                        i13 = i12;
                        i14 = i3 | (startRestartGroup.changedInstance(nyVar2) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i3;
                    }
                    i15 = i4 & Fields.CameraDistance;
                    if (i15 == 0) {
                        i14 |= 48;
                        i16 = i15;
                    } else if ((i3 & 48) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changedInstance(nyVar3) ? 32 : 16;
                    } else {
                        i16 = i15;
                    }
                    i17 = i14;
                    i18 = i4 & Fields.TransformOrigin;
                    if (i18 == 0) {
                        i17 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i17 |= startRestartGroup.changed(i) ? Fields.RotationX : Fields.SpotShadowColor;
                        i19 = i5;
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i17 & 147) != 146, i19 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i27 != 0 ? Modifier.Companion : modifier2;
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if ((i4 & 16) != 0) {
                                    uiVar3 = new ti(0.0f, 1.0f);
                                    i21 = i19 & (-57345);
                                } else {
                                    i21 = i19;
                                }
                                if (i7 != 0) {
                                    iyVar2 = null;
                                }
                                if ((i4 & 64) != 0) {
                                    sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i22 = (-3670017) & i21;
                                } else {
                                    i22 = i21;
                                }
                                if (i8 != 0) {
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                if (i9 != 0) {
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    mutableInteractionSource6 = (MutableInteractionSource) rememberedValue2;
                                } else {
                                    mutableInteractionSource6 = mutableInteractionSource2;
                                }
                                if (i11 != 0) {
                                    modifier4 = modifier5;
                                    nyVar7 = ComposableLambdaKt.rememberComposableLambda(-743960051, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$7
                                        public final void invoke(RangeSliderState rangeSliderState, Composer composer3, int i28) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-743960051, i28, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:603)");
                                            }
                                            SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer3, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54);
                                } else {
                                    modifier4 = modifier5;
                                    nyVar7 = nyVar;
                                }
                                if (i13 != 0) {
                                    nyVar8 = nyVar7;
                                    nyVar9 = ComposableLambdaKt.rememberComposableLambda(1306751174, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$8
                                        public final void invoke(RangeSliderState rangeSliderState, Composer composer3, int i28) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1306751174, i28, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:610)");
                                            }
                                            SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer3, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54);
                                } else {
                                    nyVar8 = nyVar7;
                                    nyVar9 = nyVar2;
                                }
                                if (i16 != 0) {
                                    nyVar10 = nyVar9;
                                    nyVar11 = ComposableLambdaKt.rememberComposableLambda(-1234185578, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$9
                                        public final void invoke(RangeSliderState rangeSliderState, Composer composer3, int i28) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1234185578, i28, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:617)");
                                            }
                                            SliderDefaults.INSTANCE.m2414Track4EFweAY(rangeSliderState, (Modifier) null, z2, sliderColors2, (my) null, (ny) null, 0.0f, 0.0f, composer3, (i28 & 14) | 100663296, 242);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54);
                                } else {
                                    nyVar10 = nyVar9;
                                    nyVar11 = nyVar3;
                                }
                                modifier2 = modifier4;
                                if (i18 != 0) {
                                    nyVar12 = nyVar11;
                                    i24 = i22;
                                    i23 = 0;
                                } else {
                                    i23 = i;
                                    nyVar12 = nyVar11;
                                    i24 = i22;
                                }
                                nyVar13 = nyVar8;
                                nyVar14 = nyVar10;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                int i28 = (i4 & 16) != 0 ? i19 & (-57345) : i19;
                                if ((i4 & 64) != 0) {
                                    i28 &= -3670017;
                                }
                                mutableInteractionSource6 = mutableInteractionSource2;
                                nyVar14 = nyVar2;
                                i23 = i;
                                i24 = i28;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                nyVar13 = nyVar;
                                nyVar12 = nyVar3;
                            }
                            startRestartGroup.endDefaults();
                            ny nyVar16 = nyVar13;
                            if (ComposerKt.isTraceInProgress()) {
                                nyVar15 = nyVar14;
                                ComposerKt.traceEventStart(1924256162, i24, i17, "androidx.compose.material3.RangeSlider (Slider.kt:624)");
                            } else {
                                nyVar15 = nyVar14;
                            }
                            boolean z4 = ((i17 & 896) == 256) | ((((i24 & 57344) ^ 24576) > 16384 && startRestartGroup.changed(uiVar3)) || (i24 & 24576) == 16384);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                int i29 = i23;
                                rememberedValue3 = new RangeSliderState(((ti) uiVar).a, ((ti) uiVar).b, i29, iyVar2, uiVar3);
                                i25 = i29;
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                i25 = i23;
                            }
                            RangeSliderState rangeSliderState = (RangeSliderState) rememberedValue3;
                            rangeSliderState.setOnValueChangeFinished(iyVar2);
                            int i30 = i25;
                            int i31 = i17;
                            boolean z5 = (i24 & 112) == 32;
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                rememberedValue4 = new z4(kyVar, 7);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            rangeSliderState.setOnValueChange$material3((ky) rememberedValue4);
                            rangeSliderState.setActiveRangeStart(((ti) uiVar).a);
                            rangeSliderState.setActiveRangeEnd(((ti) uiVar).b);
                            int i32 = i24 >> 9;
                            int i33 = ((i24 >> 3) & 1008) | (i32 & 57344) | (458752 & i32) | (i32 & 3670016);
                            int i34 = i31 << 21;
                            ny nyVar17 = nyVar12;
                            RangeSlider(rangeSliderState, modifier2, z2, null, mutableInteractionSource4, mutableInteractionSource6, nyVar16, nyVar15, nyVar17, startRestartGroup, i33 | (29360128 & i34) | (i34 & 234881024), 8);
                            ny nyVar18 = nyVar15;
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            nyVar6 = nyVar17;
                            z3 = z2;
                            uiVar4 = uiVar3;
                            sliderColors3 = sliderColors2;
                            mutableInteractionSource5 = mutableInteractionSource6;
                            iyVar3 = iyVar2;
                            nyVar4 = nyVar16;
                            nyVar5 = nyVar18;
                            modifier3 = modifier2;
                            i20 = i30;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            nyVar4 = nyVar;
                            z3 = z2;
                            uiVar4 = uiVar3;
                            sliderColors3 = sliderColors2;
                            iyVar3 = iyVar2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier3 = modifier2;
                            mutableInteractionSource5 = mutableInteractionSource2;
                            nyVar5 = nyVar2;
                            nyVar6 = nyVar3;
                            i20 = i;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: uq0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 RangeSlider$lambda$19;
                                    int intValue = ((Integer) obj2).intValue();
                                    RangeSlider$lambda$19 = SliderKt.RangeSlider$lambda$19(ui.this, kyVar, modifier3, z3, uiVar4, iyVar3, sliderColors3, mutableInteractionSource4, mutableInteractionSource5, nyVar4, nyVar5, nyVar6, i20, i2, i3, i4, (Composer) obj, intValue);
                                    return RangeSlider$lambda$19;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i19 = i5;
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i17 & 147) != 146, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i11 = i10;
                i12 = i4 & Fields.RotationZ;
                if (i12 == 0) {
                }
                i15 = i4 & Fields.CameraDistance;
                if (i15 == 0) {
                }
                i17 = i14;
                i18 = i4 & Fields.TransformOrigin;
                if (i18 == 0) {
                }
                i19 = i5;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i17 & 147) != 146, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i8 = i4 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i4 & Fields.RotationX;
            if (i9 != 0) {
            }
            i10 = i4 & Fields.RotationY;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & Fields.RotationZ;
            if (i12 == 0) {
            }
            i15 = i4 & Fields.CameraDistance;
            if (i15 == 0) {
            }
            i17 = i14;
            i18 = i4 & Fields.TransformOrigin;
            if (i18 == 0) {
            }
            i19 = i5;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i17 & 147) != 146, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i8 = i4 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i4 & Fields.RotationX;
        if (i9 != 0) {
        }
        i10 = i4 & Fields.RotationY;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & Fields.RotationZ;
        if (i12 == 0) {
        }
        i15 = i4 & Fields.CameraDistance;
        if (i15 == 0) {
        }
        i17 = i14;
        i18 = i4 & Fields.TransformOrigin;
        if (i18 == 0) {
        }
        i19 = i5;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i17 & 147) != 146, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSlider$lambda$13(ui uiVar, ky kyVar, Modifier modifier, boolean z, ui uiVar2, int i, iy iyVar, SliderColors sliderColors, int i2, int i3, Composer composer, int i4) {
        RangeSlider(uiVar, kyVar, modifier, z, uiVar2, i, iyVar, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSlider$lambda$18$lambda$17(ky kyVar, SliderRange sliderRange) {
        kyVar.invoke(new ti(SliderRange.m2440getStartimpl(sliderRange.m2443unboximpl()), SliderRange.m2439getEndInclusiveimpl(sliderRange.m2443unboximpl())));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSlider$lambda$19(ui uiVar, ky kyVar, Modifier modifier, boolean z, ui uiVar2, iy iyVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, int i, int i2, int i3, int i4, Composer composer, int i5) {
        RangeSlider(uiVar, kyVar, modifier, z, uiVar2, iyVar, sliderColors, mutableInteractionSource, mutableInteractionSource2, nyVar, nyVar2, nyVar3, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSlider$lambda$23(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, int i, int i2, Composer composer, int i3) {
        RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource2, nyVar, nyVar2, nyVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void RangeSliderImpl(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        ny nyVar4;
        ny nyVar5;
        ny nyVar6 = nyVar3;
        Composer startRestartGroup = composer.startRestartGroup(-287468326);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(rangeSliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar6) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287468326, i2, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:970)");
            }
            rangeSliderState.setRtl$material3(startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.Companion;
            Modifier rangeSliderPressDragModifier = rangeSliderPressDragModifier(companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z);
            Strings.Companion companion2 = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.range_start), startRestartGroup, 0);
            String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.range_end), startRestartGroup, 0);
            Modifier then = SizeKt.m803requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier);
            boolean changedInstance = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$RangeSliderImpl$2$1(rangeSliderState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            int i3 = i2;
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            my b = k4.b(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            boolean changedInstance2 = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new yh0(rangeSliderState, 1);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier rangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default, (ky) rememberedValue2), rangeSliderState, z);
            boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new wd(m2983getString2EP1pXo, 19);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier focusable = FocusableKt.focusable(SemanticsModifierKt.semantics(rangeSliderStartThumbSemantics, true, (ky) rememberedValue3), z, mutableInteractionSource);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, focusable);
            iy constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
            my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = (i3 >> 3) & 14;
            nyVar.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i3 >> 12) & 112) | i4));
            startRestartGroup.endNode();
            Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            boolean changedInstance3 = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new yh0(rangeSliderState, 2);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Modifier rangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default2, (ky) rememberedValue4), rangeSliderState, z);
            boolean changed2 = startRestartGroup.changed(m2983getString2EP1pXo2);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new wd(m2983getString2EP1pXo2, 20);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Modifier focusable2 = FocusableKt.focusable(SemanticsModifierKt.semantics(rangeSliderEndThumbSemantics, true, (ky) rememberedValue5), z, mutableInteractionSource2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, focusable2);
            iy constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
            my b3 = k4.b(companion3, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
            }
            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion3.getSetModifier());
            ny nyVar7 = nyVar2;
            nyVar7.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | i4));
            startRestartGroup.endNode();
            Modifier layoutId = LayoutIdKt.layoutId(companion, RangeSliderComponents.TRACK);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            iy constructor4 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl4 = Updater.m3878constructorimpl(startRestartGroup);
            my b4 = k4.b(companion3, m3878constructorimpl4, maybeCachedBoxMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
            if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
            }
            Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion3.getSetModifier());
            ny nyVar8 = nyVar3;
            nyVar8.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i3 >> 18) & 112) | i4));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            nyVar5 = nyVar8;
            nyVar4 = nyVar7;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                nyVar5 = nyVar8;
                nyVar4 = nyVar7;
            }
        } else {
            nyVar4 = nyVar2;
            startRestartGroup.skipToGroupEnd();
            nyVar5 = nyVar6;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e00(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, nyVar, nyVar4, nyVar5, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSliderImpl$lambda$44$lambda$34$lambda$33(RangeSliderState rangeSliderState, IntSize intSize) {
        rangeSliderState.setStartThumbWidth$material3((int) (intSize.m7786unboximpl() >> 32));
        rangeSliderState.setStartThumbHeight$material3((int) (intSize.m7786unboximpl() & 4294967295L));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSliderImpl$lambda$44$lambda$36$lambda$35(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSliderImpl$lambda$44$lambda$39$lambda$38(RangeSliderState rangeSliderState, IntSize intSize) {
        rangeSliderState.setEndThumbWidth$material3((int) (intSize.m7786unboximpl() >> 32));
        rangeSliderState.setEndThumbHeight$material3((int) (intSize.m7786unboximpl() & 4294967295L));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSliderImpl$lambda$44$lambda$41$lambda$40(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RangeSliderImpl$lambda$46(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, int i, Composer composer, int i2) {
        RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, nyVar, nyVar2, nyVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final ky kyVar, Modifier modifier, boolean z, iy iyVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i, ny nyVar, ny nyVar2, ui uiVar, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z2;
        int i7;
        iy iyVar2;
        final SliderColors sliderColors2;
        int i8;
        final MutableInteractionSource mutableInteractionSource2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final ny nyVar3;
        final ui uiVar2;
        final boolean z3;
        final ny nyVar4;
        final MutableInteractionSource mutableInteractionSource3;
        final iy iyVar3;
        final SliderColors sliderColors3;
        ScopeUpdateScope endRestartGroup;
        int i17;
        ny rememberComposableLambda;
        int i18;
        ny nyVar5;
        ui uiVar3;
        ny nyVar6;
        int i19;
        int i20;
        ny nyVar7;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(985901935);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    iyVar2 = iyVar;
                    i5 |= startRestartGroup.changedInstance(iyVar2) ? Fields.Clip : 8192;
                    if ((196608 & i2) != 0) {
                        if ((i4 & 32) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i22 = Fields.RenderEffect;
                                i5 |= i22;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i22 = 65536;
                        i5 |= i22;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i9 = i4 & Fields.SpotShadowColor;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i10 = i4 & Fields.RotationX;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i11 = i10;
                        i5 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i12 = i4 & Fields.RotationY;
                        if (i12 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i13 = i12;
                            i5 |= startRestartGroup.changedInstance(nyVar2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & 6) != 0) {
                                if ((i4 & Fields.RotationZ) == 0 && startRestartGroup.changed(uiVar)) {
                                    i21 = 4;
                                    i14 = i3 | i21;
                                }
                                i21 = 2;
                                i14 = i3 | i21;
                            } else {
                                i14 = i3;
                            }
                            i15 = i5;
                            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                i16 = i;
                                nyVar3 = nyVar;
                                uiVar2 = uiVar;
                                z3 = z2;
                                nyVar4 = nyVar2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                iyVar3 = iyVar2;
                                sliderColors3 = sliderColors2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i23 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        iyVar2 = null;
                                    }
                                    if ((i4 & 32) != 0) {
                                        i17 = i15 & (-458753);
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i8 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    int i24 = i9 != 0 ? 0 : i;
                                    rememberComposableLambda = i11 != 0 ? ComposableLambdaKt.rememberComposableLambda(-1689130945, true, new ny() { // from class: androidx.compose.material3.SliderKt$Slider$6
                                        public final void invoke(SliderState sliderState, Composer composer2, int i25) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1689130945, i25, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:282)");
                                            }
                                            SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer2, 196608, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54) : nyVar;
                                    if (i13 != 0) {
                                        i18 = i24;
                                        nyVar5 = ComposableLambdaKt.rememberComposableLambda(-294493388, true, new ny() { // from class: androidx.compose.material3.SliderKt$Slider$7
                                            public final void invoke(SliderState sliderState, Composer composer2, int i25) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-294493388, i25, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:289)");
                                                }
                                                SliderDefaults.INSTANCE.m2415Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors2, (my) null, (ny) null, 0.0f, 0.0f, composer2, (i25 & 14) | 100663296, 242);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54);
                                    } else {
                                        i18 = i24;
                                        nyVar5 = nyVar2;
                                    }
                                    if ((i4 & Fields.RotationZ) != 0) {
                                        uiVar3 = new ti(0.0f, 1.0f);
                                        i14 &= -15;
                                    } else {
                                        uiVar3 = uiVar;
                                    }
                                    nyVar6 = nyVar5;
                                    i19 = i17;
                                    i20 = i14;
                                    i16 = i18;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 32) != 0) {
                                        i15 &= -458753;
                                    }
                                    if ((i4 & Fields.RotationZ) != 0) {
                                        i14 &= -15;
                                    }
                                    i16 = i;
                                    nyVar6 = nyVar2;
                                    uiVar3 = uiVar;
                                    i20 = i14;
                                    i19 = i15;
                                    rememberComposableLambda = nyVar;
                                }
                                startRestartGroup.endDefaults();
                                ny nyVar8 = rememberComposableLambda;
                                if (ComposerKt.isTraceInProgress()) {
                                    nyVar7 = nyVar6;
                                    ComposerKt.traceEventStart(985901935, i19, i20, "androidx.compose.material3.Slider (Slider.kt:292)");
                                } else {
                                    nyVar7 = nyVar6;
                                }
                                boolean z4 = ((29360128 & i19) == 8388608) | ((((i20 & 14) ^ 6) > 4 && startRestartGroup.changed(uiVar3)) || (i20 & 6) == 4);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z4 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new SliderState(f, i16, iyVar2, uiVar3);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                SliderState sliderState = (SliderState) rememberedValue2;
                                sliderState.setOnValueChangeFinished(iyVar2);
                                sliderState.setOnValueChange(kyVar);
                                sliderState.setValue(f);
                                int i25 = i19 >> 9;
                                Slider(sliderState, modifier2, z2, null, mutableInteractionSource2, nyVar8, nyVar7, startRestartGroup, ((i19 >> 3) & 1008) | ((i19 >> 6) & 57344) | (458752 & i25) | (i25 & 3670016), 8);
                                ny nyVar9 = nyVar7;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                uiVar2 = uiVar3;
                                nyVar3 = nyVar8;
                                z3 = z2;
                                nyVar4 = nyVar9;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                sliderColors3 = sliderColors2;
                                iyVar3 = iyVar2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier3 = modifier2;
                                final int i26 = i16;
                                endRestartGroup.updateScope(new my() { // from class: sq0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 Slider$lambda$4;
                                        int intValue = ((Integer) obj2).intValue();
                                        Slider$lambda$4 = SliderKt.Slider$lambda$4(f, kyVar, modifier3, z3, iyVar3, sliderColors3, mutableInteractionSource3, i26, nyVar3, nyVar4, uiVar2, i2, i3, i4, (Composer) obj, intValue);
                                        return Slider$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i13 = i12;
                        if ((i3 & 6) != 0) {
                        }
                        i15 = i5;
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i4 & Fields.RotationY;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    if ((i3 & 6) != 0) {
                    }
                    i15 = i5;
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                iyVar2 = iyVar;
                if ((196608 & i2) != 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & Fields.SpotShadowColor;
                if (i9 == 0) {
                }
                i10 = i4 & Fields.RotationX;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i4 & Fields.RotationY;
                if (i12 != 0) {
                }
                i13 = i12;
                if ((i3 & 6) != 0) {
                }
                i15 = i5;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            iyVar2 = iyVar;
            if ((196608 & i2) != 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & Fields.SpotShadowColor;
            if (i9 == 0) {
            }
            i10 = i4 & Fields.RotationX;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i4 & Fields.RotationY;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i3 & 6) != 0) {
            }
            i15 = i5;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        iyVar2 = iyVar;
        if ((196608 & i2) != 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & Fields.SpotShadowColor;
        if (i9 == 0) {
        }
        i10 = i4 & Fields.RotationX;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i4 & Fields.RotationY;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i3 & 6) != 0) {
        }
        i15 = i5;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i14 & 3) != 2, i15 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Slider$lambda$1(float f, ky kyVar, Modifier modifier, boolean z, ui uiVar, int i, iy iyVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        Slider(f, kyVar, modifier, z, uiVar, i, iyVar, sliderColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Slider$lambda$4(float f, ky kyVar, Modifier modifier, boolean z, iy iyVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i, ny nyVar, ny nyVar2, ui uiVar, int i2, int i3, int i4, Composer composer, int i5) {
        Slider(f, kyVar, modifier, z, iyVar, sliderColors, mutableInteractionSource, i, nyVar, nyVar2, uiVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Slider$lambda$7(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, int i, int i2, Composer composer, int i3) {
        Slider(sliderState, modifier, z, sliderColors, mutableInteractionSource, nyVar, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void SliderImpl(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, Composer composer, int i) {
        int i2;
        SliderState sliderState2;
        MutableInteractionSource mutableInteractionSource2;
        ny nyVar3;
        ny nyVar4 = nyVar2;
        Composer startRestartGroup = composer.startRestartGroup(898172835);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar4) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898172835, i2, -1, "androidx.compose.material3.SliderImpl (Slider.kt:750)");
            }
            sliderState.setRtl$material3(startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            boolean z2 = (sliderState.getOrientation$material3() == Orientation.Horizontal && sliderState.isRtl$material3()) || (sliderState.getOrientation$material3() == Orientation.Vertical && sliderState.getReverseVerticalDirection$material3());
            Modifier.Companion companion = Modifier.Companion;
            Modifier sliderTapModifier = sliderTapModifier(companion, sliderState, mutableInteractionSource, z);
            int i3 = i2;
            Orientation orientation$material3 = sliderState.getOrientation$material3();
            boolean z3 = z2;
            boolean isDragging = sliderState.isDragging();
            boolean changedInstance = startRestartGroup.changedInstance(sliderState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i4 = 0;
            Modifier draggable$default = DraggableKt.draggable$default(companion, sliderState, orientation$material3, z, mutableInteractionSource, isDragging, null, (ny) rememberedValue, z3, 32, null);
            mutableInteractionSource2 = mutableInteractionSource;
            sliderState2 = sliderState;
            Orientation orientation$material32 = sliderState2.getOrientation$material3();
            Orientation orientation = Orientation.Vertical;
            Modifier wrapContentHeight$default = orientation$material32 == orientation ? SizeKt.wrapContentHeight$default(LayoutIdKt.layoutId(companion, SliderComponents.THUMB), null, false, 3, null) : SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, SliderComponents.THUMB), null, false, 3, null);
            Modifier then = slideOnKeyEvents(FocusableKt.focusable(sliderSemantics(SizeKt.m803requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), sliderState2.getOrientation$material3() == orientation ? TrackHeight : ThumbWidth, sliderState2.getOrientation$material3() == orientation ? ThumbWidth : TrackHeight, 0.0f, 0.0f, 12, null), sliderState2, z), z, mutableInteractionSource2), z, sliderState2.getSteps(), sliderState2.getValueRange(), sliderState2.getValue(), z3, sliderState2.getOnValueChange(), sliderState2.getOnValueChangeFinished()).then(sliderTapModifier).then(draggable$default);
            boolean changedInstance2 = startRestartGroup.changedInstance(sliderState2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderImpl$2$1(sliderState2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            boolean changedInstance3 = startRestartGroup.changedInstance(sliderState2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new tq0(sliderState2, i4);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(wrapContentHeight$default, (ky) rememberedValue3);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
            iy constructor2 = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
            my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = (i3 >> 3) & 14;
            nyVar.invoke(sliderState2, startRestartGroup, Integer.valueOf(((i3 >> 9) & 112) | i5));
            startRestartGroup.endNode();
            Modifier layoutId = LayoutIdKt.layoutId(companion, SliderComponents.TRACK);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            iy constructor3 = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
            my b3 = k4.b(companion2, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
            }
            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion2.getSetModifier());
            ny nyVar5 = nyVar2;
            nyVar5.invoke(sliderState2, startRestartGroup, Integer.valueOf(i5 | ((i3 >> 12) & 112)));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            nyVar3 = nyVar5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                nyVar3 = nyVar5;
            }
        } else {
            sliderState2 = sliderState;
            mutableInteractionSource2 = mutableInteractionSource;
            startRestartGroup.skipToGroupEnd();
            nyVar3 = nyVar4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new sh(modifier, sliderState2, z, mutableInteractionSource2, nyVar, nyVar3, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SliderImpl$lambda$29$lambda$26$lambda$25(SliderState sliderState, IntSize intSize) {
        sliderState.setThumbWidth$material3((int) (intSize.m7786unboximpl() >> 32));
        sliderState.setThumbHeight$material3((int) (intSize.m7786unboximpl() & 4294967295L));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SliderImpl$lambda$31(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, int i, Composer composer, int i2) {
        SliderImpl(modifier, sliderState, z, mutableInteractionSource, nyVar, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final long SliderRange(ui uiVar) {
        float floatValue = Float.valueOf(((ti) uiVar).a).floatValue();
        float floatValue2 = Float.valueOf(((ti) uiVar).b).floatValue();
        if ((Float.isNaN(floatValue) && Float.isNaN(floatValue2)) || floatValue <= floatValue2) {
            return SliderRange.m2436constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
        }
        throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + floatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + floatValue2 + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalSlider(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        boolean z4;
        final SliderColors sliderColors2;
        int i6;
        final MutableInteractionSource mutableInteractionSource2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        ny nyVar3;
        boolean z5;
        ny nyVar4;
        ScopeUpdateScope endRestartGroup;
        int i11;
        ny rememberComposableLambda;
        ny rememberComposableLambda2;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1841025790);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
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
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        }
                        i8 = i2 & Fields.SpotShadowColor;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changedInstance(nyVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i10 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                nyVar3 = nyVar2;
                                z5 = z3;
                                nyVar4 = nyVar;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i13 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i4 != 0) {
                                        z3 = true;
                                    }
                                    if (i5 != 0) {
                                        z4 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i11 = i10 & (-57345);
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    } else {
                                        i11 = i10;
                                    }
                                    if (i6 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    rememberComposableLambda = i7 != 0 ? ComposableLambdaKt.rememberComposableLambda(1896624690, true, new ny() { // from class: androidx.compose.material3.SliderKt$VerticalSlider$2
                                        public final void invoke(SliderState sliderState2, Composer composer3, int i14) {
                                            long j;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1896624690, i14, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:422)");
                                            }
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            MutableInteractionSource mutableInteractionSource3 = MutableInteractionSource.this;
                                            SliderColors sliderColors3 = sliderColors2;
                                            boolean z6 = z3;
                                            j = SliderKt.VerticalThumbSize;
                                            sliderDefaults.m2413ThumbHwbPF3A$material3(mutableInteractionSource3, sliderState2, null, sliderColors3, z6, j, composer3, ((i14 << 3) & 112) | 1769472, 4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54) : nyVar;
                                    if (i9 != 0) {
                                        rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1702448035, true, new ny() { // from class: androidx.compose.material3.SliderKt$VerticalSlider$3
                                            public final void invoke(SliderState sliderState2, Composer composer3, int i14) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1702448035, i14, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:431)");
                                                }
                                                SliderDefaults.INSTANCE.m2417TrackmnvyFg4$material3(sliderState2, Dp.Companion.m7631getUnspecifiedD9Ej5fM(), (Modifier) null, z3, sliderColors2, (my) null, (ny) null, 0.0f, 0.0f, composer3, (i14 & 14) | 805306416, 484);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54);
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1841025790, i11, -1, "androidx.compose.material3.VerticalSlider (Slider.kt:438)");
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                            defpackage.o.m("steps should be >= 0");
                                            return;
                                        }
                                        sliderState.setOrientation$material3(Orientation.Vertical);
                                        sliderState.setReverseVerticalDirection$material3(z4);
                                        int i14 = i11 >> 6;
                                        ny nyVar5 = rememberComposableLambda2;
                                        SliderImpl(modifier2, sliderState, z3, mutableInteractionSource2, rememberComposableLambda, nyVar5, startRestartGroup, (i14 & 458752) | ((i11 >> 3) & 14) | ((i11 << 3) & 112) | (i11 & 896) | (i14 & 7168) | (57344 & i14));
                                        composer2 = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z5 = z3;
                                        nyVar4 = rememberComposableLambda;
                                        nyVar3 = nyVar5;
                                    }
                                    rememberComposableLambda2 = nyVar2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (sliderState.getSteps() >= 0) {
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        rememberComposableLambda = nyVar;
                                        i11 = i10 & (-57345);
                                        rememberComposableLambda2 = nyVar2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                        }
                                    } else {
                                        rememberComposableLambda = nyVar;
                                        rememberComposableLambda2 = nyVar2;
                                        i11 = i10;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                        }
                                    }
                                }
                            }
                            Modifier modifier3 = modifier2;
                            boolean z6 = z4;
                            SliderColors sliderColors3 = sliderColors2;
                            MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new uh(sliderState, modifier3, z5, z6, sliderColors3, mutableInteractionSource3, nyVar4, nyVar3, i, i2));
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                        }
                        Modifier modifier32 = modifier2;
                        boolean z62 = z4;
                        SliderColors sliderColors32 = sliderColors2;
                        MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                    }
                    Modifier modifier322 = modifier2;
                    boolean z622 = z4;
                    SliderColors sliderColors322 = sliderColors2;
                    MutableInteractionSource mutableInteractionSource322 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
                }
                Modifier modifier3222 = modifier2;
                boolean z6222 = z4;
                SliderColors sliderColors3222 = sliderColors2;
                MutableInteractionSource mutableInteractionSource3222 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
            }
            Modifier modifier32222 = modifier2;
            boolean z62222 = z4;
            SliderColors sliderColors32222 = sliderColors2;
            MutableInteractionSource mutableInteractionSource32222 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i10 & 1)) {
        }
        Modifier modifier322222 = modifier2;
        boolean z622222 = z4;
        SliderColors sliderColors322222 = sliderColors2;
        MutableInteractionSource mutableInteractionSource322222 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalSlider$lambda$10(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, int i, int i2, Composer composer, int i3) {
        VerticalSlider(sliderState, modifier, z, z2, sliderColors, mutableInteractionSource, nyVar, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2429awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, hm hmVar) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        gi0 gi0Var;
        PointerInputChange pointerInputChange;
        if (hmVar instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) hmVar;
            int i3 = sliderKt$awaitSlop$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label = i3 - Integer.MIN_VALUE;
                SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                Object obj = sliderKt$awaitSlop$12.result;
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    p10.Q(obj);
                    gi0 gi0Var2 = new gi0();
                    w5 w5Var = new w5(gi0Var2, 14);
                    sliderKt$awaitSlop$12.L$0 = gi0Var2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m2890awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m2890awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, w5Var, sliderKt$awaitSlop$12);
                    vn vnVar = vn.d;
                    if (m2890awaitHorizontalPointerSlopOrCancellationgDDlDlE == vnVar) {
                        return vnVar;
                    }
                    obj = m2890awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    gi0Var = gi0Var2;
                } else {
                    if (i2 != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gi0Var = (gi0) sliderKt$awaitSlop$12.L$0;
                    p10.Q(obj);
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return new xe0(pointerInputChange, new Float(gi0Var.d));
                }
                return null;
            }
        }
        sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(hmVar);
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$122 = sliderKt$awaitSlop$1;
        Object obj2 = sliderKt$awaitSlop$122.result;
        i2 = sliderKt$awaitSlop$122.label;
        if (i2 != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 awaitSlop_8vUncbI$lambda$49(gi0 gi0Var, PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        gi0Var.d = f;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return y80.g(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    private static final String formatForSemantics(float f) {
        return String.valueOf(y80.P(f * 100.0f) / 100.0f);
    }

    public static final VerticalAlignmentLine getCornerSizeAlignmentLine() {
        return CornerSizeAlignmentLine;
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m2430isSpecifiedIf1S1O4(long j) {
        return j != SliderRange.Companion.m2445getUnspecifiedFYbKRX4();
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z) {
        ti tiVar = new ti(rangeSliderState.getActiveRangeStart(), ((ti) rangeSliderState.getValueRange()).b);
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new vq0(z, rangeSliderState, tiVar, 0), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeEnd(), tiVar, rangeSliderState.getEndSteps$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rangeSliderEndThumbSemantics$lambda$58(boolean z, RangeSliderState rangeSliderState, ui uiVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(rangeSliderState.getActiveRangeEnd()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new qq0(uiVar, rangeSliderState, 0), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rangeSliderEndThumbSemantics$lambda$58$lambda$57(ui uiVar, RangeSliderState rangeSliderState, float f) {
        int endSteps$material3;
        float floatValue = Float.valueOf(((ti) uiVar).a).floatValue();
        ti tiVar = (ti) uiVar;
        float f2 = tiVar.b;
        float g = y80.g(f, floatValue, Float.valueOf(f2).floatValue());
        if (rangeSliderState.getEndSteps$material3() > 0 && (endSteps$material3 = rangeSliderState.getEndSteps$material3() + 1) >= 0) {
            float f3 = g;
            float f4 = f3;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(Float.valueOf(tiVar.a).floatValue(), Float.valueOf(f2).floatValue(), i / (rangeSliderState.getEndSteps$material3() + 1));
                float f5 = lerp - g;
                if (Math.abs(f5) <= f3) {
                    f3 = Math.abs(f5);
                    f4 = lerp;
                }
                if (i == endSteps$material3) {
                    break;
                }
                i++;
            }
            g = f4;
        }
        if (g == rangeSliderState.getActiveRangeEnd()) {
            return false;
        }
        long SliderRange = SliderRange(rangeSliderState.getActiveRangeStart(), g);
        if (!SliderRange.m2438equalsimpl0(SliderRange, SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
            if (rangeSliderState.getOnValueChange$material3() != null) {
                ky onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
                if (onValueChange$material3 != null) {
                    onValueChange$material3.invoke(SliderRange.m2435boximpl(SliderRange));
                }
            } else {
                rangeSliderState.setActiveRangeStart(SliderRange.m2440getStartimpl(SliderRange));
                rangeSliderState.setActiveRangeEnd(SliderRange.m2439getEndInclusiveimpl(SliderRange));
            }
        }
        iy onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
        if (onValueChangeFinished != null) {
            onValueChangeFinished.invoke();
        }
        return true;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, final RangeSliderState rangeSliderState, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, new PointerInputEventHandler() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {2437}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ RangeSliderState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {2438, 2450, 2473}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00201 extends ij0 implements my {
                    final /* synthetic */ un $$this$coroutineScope;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ RangeSliderState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    @bq(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {2493}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends us0 implements my {
                        final /* synthetic */ fi0 $draggingStart;
                        final /* synthetic */ DragInteraction $finishInteraction;
                        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(RangeSliderLogic rangeSliderLogic, fi0 fi0Var, DragInteraction dragInteraction, hm hmVar) {
                            super(2, hmVar);
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$draggingStart = fi0Var;
                            this.$finishInteraction = dragInteraction;
                        }

                        @Override // defpackage.mc
                        public final hm create(Object obj, hm hmVar) {
                            return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, hmVar);
                        }

                        @Override // defpackage.my
                        public final Object invoke(un unVar, hm hmVar) {
                            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
                        }

                        @Override // defpackage.mc
                        public final Object invokeSuspend(Object obj) {
                            int i = this.label;
                            if (i == 0) {
                                p10.Q(obj);
                                MutableInteractionSource activeInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.d);
                                DragInteraction dragInteraction = this.$finishInteraction;
                                this.label = 1;
                                Object emit = activeInteraction.emit(dragInteraction, this);
                                vn vnVar = vn.d;
                                if (emit == vnVar) {
                                    return vnVar;
                                }
                            } else {
                                if (i != 1) {
                                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                            }
                            return w01.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00201(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, un unVar, hm hmVar) {
                        super(hmVar);
                        this.$state = rangeSliderState;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$$this$coroutineScope = unVar;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final w01 invokeSuspend$lambda$1(RangeSliderState rangeSliderState, fi0 fi0Var, PointerInputChange pointerInputChange) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32));
                        boolean z = fi0Var.d;
                        if (rangeSliderState.isRtl$material3()) {
                            intBitsToFloat = -intBitsToFloat;
                        }
                        rangeSliderState.onDrag$material3(z, intBitsToFloat);
                        return w01.a;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00201 c00201 = new C00201(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, hmVar);
                        c00201.L$0 = obj;
                        return c00201;
                    }

                    @Override // defpackage.my
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                        return ((C00201) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:44:0x0173, code lost:
                    
                        if (r1 != r12) goto L56;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:64:0x006a, code lost:
                    
                        if (r1 == r12) goto L55;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        AwaitPointerEventScope awaitPointerEventScope;
                        Object awaitFirstDown$default;
                        gi0 gi0Var;
                        Object m2429awaitSlop8vUncbI;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        PointerInputChange pointerInputChange;
                        DragInteraction.Start start;
                        fi0 fi0Var;
                        xe0 xe0Var;
                        DragInteraction.Start start2;
                        Object m435horizontalDragjO51t88;
                        DragInteraction dragInteraction;
                        int i = this.label;
                        int i2 = 1;
                        vn vnVar = vn.d;
                        try {
                            if (i == 0) {
                                p10.Q(obj);
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                this.L$0 = awaitPointerEventScope;
                                this.label = 1;
                                awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                            } else if (i == 1) {
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                p10.Q(obj);
                                awaitFirstDown$default = obj;
                            } else {
                                if (i != 2) {
                                    if (i != 3) {
                                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    fi0Var = (fi0) this.L$1;
                                    start2 = (DragInteraction.Start) this.L$0;
                                    try {
                                        p10.Q(obj);
                                        start = start2;
                                        m435horizontalDragjO51t88 = obj;
                                        dragInteraction = ((Boolean) m435horizontalDragjO51t88).booleanValue() ? new DragInteraction.Stop(start) : new DragInteraction.Cancel(start);
                                    } catch (CancellationException unused) {
                                        DragInteraction.Cancel cancel = new DragInteraction.Cancel(start2);
                                        this.$state.setDragging$material3(false);
                                        dragInteraction = cancel;
                                        this.$state.getGestureEndAction$material3().invoke(Boolean.valueOf(fi0Var.d));
                                        p01.t(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, fi0Var, dragInteraction, null), 3);
                                        return w01.a;
                                    }
                                    this.$state.getGestureEndAction$material3().invoke(Boolean.valueOf(fi0Var.d));
                                    p01.t(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, fi0Var, dragInteraction, null), 3);
                                    return w01.a;
                                }
                                fi0Var = (fi0) this.L$4;
                                gi0Var = (gi0) this.L$3;
                                DragInteraction.Start start3 = (DragInteraction.Start) this.L$2;
                                PointerInputChange pointerInputChange2 = (PointerInputChange) this.L$1;
                                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                                p10.Q(obj);
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                pointerInputChange = pointerInputChange2;
                                start = start3;
                                m2429awaitSlop8vUncbI = obj;
                                xe0Var = (xe0) m2429awaitSlop8vUncbI;
                                if (xe0Var != null) {
                                    RangeSliderState rangeSliderState = this.$state;
                                    float m2893pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m2893pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.m6104getTypeT8wyACA());
                                    if (Math.abs(rangeSliderState.getRawOffsetEnd$material3() - gi0Var.d) < m2893pointerSlopE8SPZFQ && Math.abs(rangeSliderState.getRawOffsetStart$material3() - gi0Var.d) < m2893pointerSlopE8SPZFQ) {
                                        float floatValue = ((Number) xe0Var.e).floatValue();
                                        fi0Var.d = !rangeSliderState.isRtl$material3() ? floatValue >= 0.0f : floatValue < 0.0f;
                                        gi0Var.d = Float.intBitsToFloat((int) (PointerEventKt.positionChange((PointerInputChange) xe0Var.d) >> 32)) + gi0Var.d;
                                    }
                                }
                                this.$rangeSliderLogic.captureThumb(fi0Var.d, gi0Var.d, start, this.$$this$coroutineScope);
                                try {
                                    this.$state.setDragging$material3(true);
                                    long m6098getIdJ3iCeTQ = pointerInputChange.m6098getIdJ3iCeTQ();
                                    j jVar = new j(i2, fi0Var, this.$state);
                                    this.L$0 = start;
                                    this.L$1 = fi0Var;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 3;
                                    m435horizontalDragjO51t88 = DragGestureDetectorKt.m435horizontalDragjO51t88(awaitPointerEventScope2, m6098getIdJ3iCeTQ, jVar, this);
                                } catch (CancellationException unused2) {
                                    start2 = start;
                                    DragInteraction.Cancel cancel2 = new DragInteraction.Cancel(start2);
                                    this.$state.setDragging$material3(false);
                                    dragInteraction = cancel2;
                                    this.$state.getGestureEndAction$material3().invoke(Boolean.valueOf(fi0Var.d));
                                    p01.t(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, fi0Var, dragInteraction, null), 3);
                                    return w01.a;
                                }
                            }
                            AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                            PointerInputChange pointerInputChange3 = (PointerInputChange) awaitFirstDown$default;
                            DragInteraction.Start start4 = new DragInteraction.Start();
                            gi0Var = new gi0();
                            float totalWidth$material3 = this.$state.isRtl$material3() ? this.$state.getTotalWidth$material3() - Float.intBitsToFloat((int) (pointerInputChange3.m6101getPositionF1C5BW0() >> 32)) : Float.intBitsToFloat((int) (pointerInputChange3.m6101getPositionF1C5BW0() >> 32));
                            gi0Var.d = totalWidth$material3;
                            int compareOffsets = this.$rangeSliderLogic.compareOffsets(totalWidth$material3);
                            fi0 fi0Var2 = new fi0();
                            fi0Var2.d = compareOffsets == 0 ? this.$state.getRawOffsetStart$material3() > gi0Var.d : compareOffsets < 0;
                            long m6098getIdJ3iCeTQ2 = pointerInputChange3.m6098getIdJ3iCeTQ();
                            int m6104getTypeT8wyACA = pointerInputChange3.m6104getTypeT8wyACA();
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = pointerInputChange3;
                            this.L$2 = start4;
                            this.L$3 = gi0Var;
                            this.L$4 = fi0Var2;
                            this.label = 2;
                            m2429awaitSlop8vUncbI = SliderKt.m2429awaitSlop8vUncbI(awaitPointerEventScope4, m6098getIdJ3iCeTQ2, m6104getTypeT8wyACA, this);
                            if (m2429awaitSlop8vUncbI != vnVar) {
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                pointerInputChange = pointerInputChange3;
                                start = start4;
                                fi0Var = fi0Var2;
                                xe0Var = (xe0) m2429awaitSlop8vUncbI;
                                if (xe0Var != null) {
                                }
                                this.$rangeSliderLogic.captureThumb(fi0Var.d, gi0Var.d, start, this.$$this$coroutineScope);
                                this.$state.setDragging$material3(true);
                                long m6098getIdJ3iCeTQ3 = pointerInputChange.m6098getIdJ3iCeTQ();
                                j jVar2 = new j(i2, fi0Var, this.$state);
                                this.L$0 = start;
                                this.L$1 = fi0Var;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                m435horizontalDragjO51t88 = DragGestureDetectorKt.m435horizontalDragjO51t88(awaitPointerEventScope2, m6098getIdJ3iCeTQ3, jVar2, this);
                            }
                            return vnVar;
                        } finally {
                            this.$state.setDragging$material3(false);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, hm hmVar) {
                    super(2, hmVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = rangeSliderState;
                    this.$rangeSliderLogic = rangeSliderLogic;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, this.$rangeSliderLogic, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(un unVar, hm hmVar) {
                    return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                }

                @Override // defpackage.mc
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        p10.Q(obj);
                        un unVar = (un) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00201 c00201 = new C00201(this.$state, this.$rangeSliderLogic, unVar, null);
                        this.label = 1;
                        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, c00201, this);
                        vn vnVar = vn.d;
                        if (awaitEachGesture == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    return w01.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object n = p10.n(new AnonymousClass1(pointerInputScope, RangeSliderState.this, new RangeSliderLogic(RangeSliderState.this, mutableInteractionSource, mutableInteractionSource2), null), hmVar);
                return n == vn.d ? n : w01.a;
            }
        }) : modifier;
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z) {
        ti tiVar = new ti(((ti) rangeSliderState.getValueRange()).a, rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new vq0(z, rangeSliderState, tiVar, 1), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeStart(), tiVar, rangeSliderState.getStartSteps$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rangeSliderStartThumbSemantics$lambda$55(boolean z, RangeSliderState rangeSliderState, ui uiVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(rangeSliderState.getActiveRangeStart()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new qq0(uiVar, rangeSliderState, 1), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rangeSliderStartThumbSemantics$lambda$55$lambda$54(ui uiVar, RangeSliderState rangeSliderState, float f) {
        int startSteps$material3;
        float floatValue = Float.valueOf(((ti) uiVar).a).floatValue();
        ti tiVar = (ti) uiVar;
        float f2 = tiVar.b;
        float g = y80.g(f, floatValue, Float.valueOf(f2).floatValue());
        if (rangeSliderState.getStartSteps$material3() > 0 && (startSteps$material3 = rangeSliderState.getStartSteps$material3() + 1) >= 0) {
            float f3 = g;
            float f4 = f3;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(Float.valueOf(tiVar.a).floatValue(), Float.valueOf(f2).floatValue(), i / (rangeSliderState.getStartSteps$material3() + 1));
                float f5 = lerp - g;
                if (Math.abs(f5) <= f3) {
                    f3 = Math.abs(f5);
                    f4 = lerp;
                }
                if (i == startSteps$material3) {
                    break;
                }
                i++;
            }
            g = f4;
        }
        if (g == rangeSliderState.getActiveRangeStart()) {
            return false;
        }
        long SliderRange = SliderRange(g, rangeSliderState.getActiveRangeEnd());
        if (!SliderRange.m2438equalsimpl0(SliderRange, SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
            if (rangeSliderState.getOnValueChange$material3() != null) {
                ky onValueChange$material3 = rangeSliderState.getOnValueChange$material3();
                if (onValueChange$material3 != null) {
                    onValueChange$material3.invoke(SliderRange.m2435boximpl(SliderRange));
                }
            } else {
                rangeSliderState.setActiveRangeStart(SliderRange.m2440getStartimpl(SliderRange));
                rangeSliderState.setActiveRangeEnd(SliderRange.m2439getEndInclusiveimpl(SliderRange));
            }
        }
        iy onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
        if (onValueChangeFinished != null) {
            onValueChangeFinished.invoke();
        }
        return true;
    }

    public static final RangeSliderState rememberRangeSliderState(float f, float f2, int i, iy iyVar, ui uiVar, Composer composer, int i2, int i3) {
        final float f3 = (i3 & 1) != 0 ? 0.0f : f;
        final float f4 = (i3 & 2) != 0 ? 1.0f : f2;
        final int i4 = (i3 & 4) != 0 ? 0 : i;
        if ((i3 & 8) != 0) {
            iyVar = null;
        }
        final iy iyVar2 = iyVar;
        if ((i3 & 16) != 0) {
            uiVar = new ti(0.0f, 1.0f);
        }
        final ui uiVar2 = uiVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(756708139, i2, -1, "androidx.compose.material3.rememberRangeSliderState (Slider.kt:3125)");
        }
        Object[] objArr = new Object[0];
        Saver<RangeSliderState, ?> Saver = RangeSliderState.Companion.Saver(iyVar2, uiVar2);
        boolean z = true;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(f3)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(f4)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i4)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(iyVar2)) || (i2 & 3072) == 2048);
        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.changed(uiVar2)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            iy iyVar3 = new iy() { // from class: wq0
                @Override // defpackage.iy
                public final Object invoke() {
                    RangeSliderState rememberRangeSliderState$lambda$62$lambda$61;
                    rememberRangeSliderState$lambda$62$lambda$61 = SliderKt.rememberRangeSliderState$lambda$62$lambda$61(f3, f4, i4, iyVar2, uiVar2);
                    return rememberRangeSliderState$lambda$62$lambda$61;
                }
            };
            composer.updateRememberedValue(iyVar3);
            rememberedValue = iyVar3;
        }
        RangeSliderState rangeSliderState = (RangeSliderState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rangeSliderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RangeSliderState rememberRangeSliderState$lambda$62$lambda$61(float f, float f2, int i, iy iyVar, ui uiVar) {
        return new RangeSliderState(f, f2, i, iyVar, uiVar);
    }

    public static final SliderState rememberSliderState(final float f, final int i, final iy iyVar, final ui uiVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f = 0.0f;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            iyVar = null;
        }
        if ((i3 & 8) != 0) {
            uiVar = new ti(0.0f, 1.0f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193499219, i2, -1, "androidx.compose.material3.rememberSliderState (Slider.kt:2911)");
        }
        Object[] objArr = new Object[0];
        Saver<SliderState, ?> Saver = SliderState.Companion.Saver(iyVar, uiVar);
        boolean z = true;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(f)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(iyVar)) || (i2 & 384) == 256);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !composer.changed(uiVar)) && (i2 & 3072) != 2048) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new iy() { // from class: rq0
                @Override // defpackage.iy
                public final Object invoke() {
                    SliderState rememberSliderState$lambda$60$lambda$59;
                    rememberSliderState$lambda$60$lambda$59 = SliderKt.rememberSliderState$lambda$60$lambda$59(f, i, iyVar, uiVar);
                    return rememberSliderState$lambda$60$lambda$59;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        SliderState sliderState = (SliderState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sliderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SliderState rememberSliderState$lambda$60$lambda$59(float f, int i, iy iyVar, ui uiVar) {
        return new SliderState(f, i, iyVar, uiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-2geJ7wY, reason: not valid java name */
    public static final long m2432scale2geJ7wY(boolean z, float f, float f2, long j, float f3, float f4) {
        float scale = scale(f, f2, SliderRange.m2440getStartimpl(j), f3, f4);
        float scale2 = scale(f, f2, SliderRange.m2439getEndInclusiveimpl(j), f3, f4);
        if (z) {
            if (scale > scale2) {
                scale = scale2;
            }
            return SliderRange(scale, scale2);
        }
        if (scale2 < scale) {
            scale2 = scale;
        }
        return SliderRange(scale, scale2);
    }

    private static final Modifier slideOnKeyEvents(Modifier modifier, final boolean z, final int i, final ui uiVar, final float f, final boolean z2, final ky kyVar, final iy iyVar) {
        if (i >= 0) {
            return KeyInputModifierKt.onKeyEvent(modifier, new ky() { // from class: androidx.compose.material3.SliderKt$slideOnKeyEvents$2
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m2433invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m2433invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (!z) {
                        return Boolean.FALSE;
                    }
                    if (kyVar == null) {
                        return Boolean.FALSE;
                    }
                    int m5933getTypeZmokQxo = KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent);
                    KeyEventType.Companion companion = KeyEventType.Companion;
                    boolean z3 = false;
                    if (!KeyEventType.m5925equalsimpl0(m5933getTypeZmokQxo, companion.m5929getKeyDownCS__XNY())) {
                        if (KeyEventType.m5925equalsimpl0(m5933getTypeZmokQxo, companion.m5930getKeyUpCS__XNY())) {
                            long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                            Key.Companion companion2 = Key.Companion;
                            if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5691getDirectionUpEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5686getDirectionDownEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5690getDirectionRightEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5689getDirectionLeftEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5765getMoveHomeEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5764getMoveEndEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5812getPageUpEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion2.m5811getPageDownEK5gGoQ())) {
                                iy iyVar2 = iyVar;
                                if (iyVar2 != null) {
                                    iyVar2.invoke();
                                }
                                z3 = true;
                            }
                        }
                        return Boolean.valueOf(z3);
                    }
                    float abs = Math.abs(((ti) uiVar).b - ((ti) uiVar).a);
                    int i2 = i;
                    float f2 = abs / (i2 > 0 ? i2 + 1 : 100);
                    int i3 = z2 ? -1 : 1;
                    long m5932getKeyZmokQxo2 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion3 = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5691getDirectionUpEK5gGoQ())) {
                        kyVar.invoke(y80.j(Float.valueOf((i3 * f2) + f), uiVar));
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5686getDirectionDownEK5gGoQ())) {
                        kyVar.invoke(y80.j(Float.valueOf(f - (i3 * f2)), uiVar));
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5690getDirectionRightEK5gGoQ())) {
                        kyVar.invoke(y80.j(Float.valueOf((i3 * f2) + f), uiVar));
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5689getDirectionLeftEK5gGoQ())) {
                        kyVar.invoke(y80.j(Float.valueOf(f - (i3 * f2)), uiVar));
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5765getMoveHomeEK5gGoQ())) {
                        kyVar.invoke(Float.valueOf(((ti) uiVar).a));
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5764getMoveEndEK5gGoQ())) {
                        kyVar.invoke(Float.valueOf(((ti) uiVar).b));
                    } else {
                        if (!Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5812getPageUpEK5gGoQ())) {
                            if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion3.m5811getPageDownEK5gGoQ())) {
                                kyVar.invoke(y80.j(Float.valueOf((y80.h(r1 / 10, 1, 10) * f2) + f), uiVar));
                            }
                            return Boolean.valueOf(z3);
                        }
                        kyVar.invoke(y80.j(Float.valueOf(f - (y80.h(r1 / 10, 1, 10) * f2)), uiVar));
                    }
                    z3 = true;
                    return Boolean.valueOf(z3);
                }
            });
        }
        defpackage.o.m("steps should be >= 0");
        return null;
    }

    private static final Modifier sliderSemantics(Modifier modifier, SliderState sliderState, boolean z) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new qb0(2, z, sliderState), 1, null).then(sliderState.getOrientation$material3() == Orientation.Vertical ? AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds() : AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState.getValue(), new ti(((ti) sliderState.getValueRange()).a, ((ti) sliderState.getValueRange()).b), sliderState.getSteps());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 sliderSemantics$lambda$52(boolean z, SliderState sliderState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, formatForSemantics(sliderState.getValue()));
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new tq0(sliderState, 1), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sliderSemantics$lambda$52$lambda$51(SliderState sliderState, float f) {
        int steps;
        float g = y80.g(f, Float.valueOf(((ti) sliderState.getValueRange()).a).floatValue(), Float.valueOf(((ti) sliderState.getValueRange()).b).floatValue());
        if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
            float f2 = g;
            float f3 = f2;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(Float.valueOf(((ti) sliderState.getValueRange()).a).floatValue(), Float.valueOf(((ti) sliderState.getValueRange()).b).floatValue(), i / (sliderState.getSteps() + 1));
                float f4 = lerp - g;
                if (Math.abs(f4) <= f2) {
                    f2 = Math.abs(f4);
                    f3 = lerp;
                }
                if (i == steps) {
                    break;
                }
                i++;
            }
            g = f3;
        }
        if (g == sliderState.getValue()) {
            return false;
        }
        if (g != sliderState.getValue()) {
            if (sliderState.getOnValueChange() != null) {
                ky onValueChange = sliderState.getOnValueChange();
                if (onValueChange != null) {
                    onValueChange.invoke(Float.valueOf(g));
                }
            } else {
                sliderState.setValue(g);
            }
        }
        iy onValueChangeFinished = sliderState.getOnValueChangeFinished();
        if (onValueChangeFinished != null) {
            onValueChangeFinished.invoke();
        }
        return true;
    }

    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new SliderKt$sliderTapModifier$1(sliderState)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            f4 = f5;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        return valueOf != null ? MathHelpersKt.lerp(f2, f3, valueOf.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2431isSpecifiedIf1S1O4$annotations(long j) {
    }

    public static final long SliderRange(float f, float f2) {
        if ((Float.isNaN(f) && Float.isNaN(f2)) || f <= f2) {
            return SliderRange.m2436constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
        throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f2 + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final ky kyVar, Modifier modifier, boolean z, ui uiVar, int i, iy iyVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        float f2;
        int i4;
        ky kyVar2;
        Modifier modifier2;
        int i5;
        boolean z2;
        ui uiVar2;
        int i6;
        int i7;
        int i8;
        iy iyVar2;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final SliderColors sliderColors2;
        final Modifier modifier3;
        final boolean z3;
        final ui uiVar3;
        final int i12;
        final iy iyVar3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        ui uiVar4;
        int i14;
        iy iyVar4;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-202044027);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changed(f2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i2 & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        uiVar2 = uiVar;
                        if (startRestartGroup.changed(uiVar2)) {
                            i17 = Fields.Clip;
                            i4 |= i17;
                        }
                    } else {
                        uiVar2 = uiVar;
                    }
                    i17 = 8192;
                    i4 |= i17;
                } else {
                    uiVar2 = uiVar;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? Fields.RenderEffect : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        iyVar2 = iyVar;
                        i4 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(sliderColors)) {
                                i16 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i16;
                            }
                            i16 = 4194304;
                            i4 |= i16;
                        }
                        i9 = i3 & Fields.RotationX;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i11 = i4;
                            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i18 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i5 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i13 = i11 & (-57345);
                                        uiVar2 = new ti(0.0f, 1.0f);
                                    } else {
                                        i13 = i11;
                                    }
                                    if (i6 != 0) {
                                        i7 = 0;
                                    }
                                    if (i8 != 0) {
                                        iyVar2 = null;
                                    }
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        sliderColors3 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i13 = (-29360129) & i13;
                                    } else {
                                        sliderColors3 = sliderColors;
                                    }
                                    if (i10 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    modifier4 = modifier2;
                                    uiVar4 = uiVar2;
                                    i14 = i7;
                                    iyVar4 = iyVar2;
                                    i15 = -202044027;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    int i19 = (i3 & 16) != 0 ? i11 & (-57345) : i11;
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        i19 &= -29360129;
                                    }
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    i13 = i19;
                                    modifier4 = modifier2;
                                    uiVar4 = uiVar2;
                                    i14 = i7;
                                    iyVar4 = iyVar2;
                                    i15 = -202044027;
                                    sliderColors3 = sliderColors;
                                }
                                final boolean z4 = z2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i15, i13, -1, "androidx.compose.material3.Slider (Slider.kt:191)");
                                }
                                int i20 = i13 >> 6;
                                SliderColors sliderColors4 = sliderColors3;
                                composer2 = startRestartGroup;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                Slider(f2, kyVar2, modifier4, z4, iyVar4, sliderColors4, mutableInteractionSource4, i14, ComposableLambdaKt.rememberComposableLambda(308249025, true, new ny() { // from class: androidx.compose.material3.SliderKt$Slider$2
                                    public final void invoke(SliderState sliderState, Composer composer3, int i21) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(308249025, i21, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:202)");
                                        }
                                        SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z4, 0L, composer3, 196608, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new ny() { // from class: androidx.compose.material3.SliderKt$Slider$3
                                    public final void invoke(SliderState sliderState, Composer composer3, int i21) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1843234110, i21, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:209)");
                                        }
                                        SliderDefaults.INSTANCE.m2415Track4EFweAY(sliderState, (Modifier) null, z4, sliderColors3, (my) null, (ny) null, 0.0f, 0.0f, composer3, (i21 & 14) | 100663296, 242);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), uiVar4, composer2, (i13 & 14) | 905969664 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i20) | (458752 & i20) | (i20 & 3670016) | ((i13 << 6) & 29360128), (i13 >> 12) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                iyVar3 = iyVar4;
                                sliderColors2 = sliderColors4;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                i12 = i14;
                                uiVar3 = uiVar4;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                sliderColors2 = sliderColors;
                                modifier3 = modifier2;
                                z3 = z2;
                                uiVar3 = uiVar2;
                                i12 = i7;
                                iyVar3 = iyVar2;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: pq0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 Slider$lambda$1;
                                        int intValue = ((Integer) obj2).intValue();
                                        Slider$lambda$1 = SliderKt.Slider$lambda$1(f, kyVar, modifier3, z3, uiVar3, i12, iyVar3, sliderColors2, mutableInteractionSource2, i2, i3, (Composer) obj, intValue);
                                        return Slider$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        i11 = i4;
                        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    iyVar2 = iyVar;
                    if ((i2 & 12582912) == 0) {
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                iyVar2 = iyVar;
                if ((i2 & 12582912) == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            iyVar2 = iyVar;
            if ((i2 & 12582912) == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        iyVar2 = iyVar;
        if ((i2 & 12582912) == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, Composer composer, int i, int i2) {
        SliderState sliderState2;
        int i3;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        int i5;
        final MutableInteractionSource mutableInteractionSource2;
        int i6;
        ny nyVar3;
        int i7;
        ny nyVar4;
        Modifier modifier2;
        boolean z3;
        SliderColors sliderColors3;
        MutableInteractionSource mutableInteractionSource3;
        ny nyVar5;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        ny nyVar6;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(409861960);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            sliderState2 = sliderState;
        } else {
            sliderState2 = sliderState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(sliderState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
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
                            i8 = Fields.CameraDistance;
                            i3 |= i8;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i8 = Fields.RotationZ;
                    i3 |= i8;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        nyVar3 = nyVar;
                        i3 |= startRestartGroup.changedInstance(nyVar3) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            nyVar4 = nyVar2;
                            i3 |= startRestartGroup.changedInstance(nyVar4) ? 1048576 : Fields.BlendMode;
                            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    z4 = z2;
                                    nyVar6 = nyVar3;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier3 = modifier;
                                } else {
                                    Modifier modifier4 = i9 != 0 ? Modifier.Companion : modifier;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    }
                                    if (i5 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    if (i6 != 0) {
                                        nyVar3 = ComposableLambdaKt.rememberComposableLambda(-2100927368, true, new ny() { // from class: androidx.compose.material3.SliderKt$Slider$10
                                            public final void invoke(SliderState sliderState3, Composer composer2, int i10) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2100927368, i10, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:362)");
                                                }
                                                SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer2, 196608, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54);
                                    }
                                    if (i7 != 0) {
                                        nyVar4 = ComposableLambdaKt.rememberComposableLambda(-81224541, true, new ny() { // from class: androidx.compose.material3.SliderKt$Slider$11
                                            public final void invoke(SliderState sliderState3, Composer composer2, int i10) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-81224541, i10, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:369)");
                                                }
                                                SliderDefaults.INSTANCE.m2415Track4EFweAY(sliderState3, (Modifier) null, z2, sliderColors2, (my) null, (ny) null, 0.0f, 0.0f, composer2, (i10 & 14) | 100663296, 242);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54);
                                    }
                                    z4 = z2;
                                    nyVar6 = nyVar3;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier3 = modifier4;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(409861960, i3, -1, "androidx.compose.material3.Slider (Slider.kt:371)");
                                }
                                if (sliderState2.getSteps() >= 0) {
                                    int i10 = i3 >> 3;
                                    SliderImpl(modifier3, sliderState2, z4, mutableInteractionSource4, nyVar6, nyVar4, startRestartGroup, (i3 & 896) | (i10 & 14) | ((i3 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    sliderColors3 = sliderColors2;
                                    modifier2 = modifier3;
                                    z3 = z4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    nyVar5 = nyVar6;
                                } else {
                                    defpackage.o.m("steps should be >= 0");
                                    return;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z3 = z2;
                                sliderColors3 = sliderColors2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                nyVar5 = nyVar3;
                            }
                            ny nyVar7 = nyVar4;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new tl(sliderState, modifier2, z3, sliderColors3, mutableInteractionSource3, nyVar5, nyVar7, i, i2));
                                return;
                            }
                            return;
                        }
                        nyVar4 = nyVar2;
                        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        ny nyVar72 = nyVar4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    nyVar3 = nyVar;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    nyVar4 = nyVar2;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    ny nyVar722 = nyVar4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                nyVar3 = nyVar;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                nyVar4 = nyVar2;
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                ny nyVar7222 = nyVar4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            nyVar3 = nyVar;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            nyVar4 = nyVar2;
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            ny nyVar72222 = nyVar4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        nyVar3 = nyVar;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        nyVar4 = nyVar2;
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        ny nyVar722222 = nyVar4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ui uiVar, final ky kyVar, Modifier modifier, boolean z, ui uiVar2, int i, iy iyVar, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        ui uiVar3;
        int i4;
        ky kyVar2;
        Modifier modifier2;
        int i5;
        boolean z2;
        ui uiVar4;
        int i6;
        int i7;
        int i8;
        iy iyVar2;
        int i9;
        Composer composer2;
        final SliderColors sliderColors2;
        final Modifier modifier3;
        final boolean z3;
        final ui uiVar5;
        final int i10;
        final iy iyVar3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        final SliderColors sliderColors3;
        final boolean z4;
        int i12;
        iy iyVar4;
        int i13;
        Modifier modifier4;
        int i14;
        ui uiVar6;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-743091416);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            uiVar3 = uiVar;
        } else {
            uiVar3 = uiVar;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changed(uiVar3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i2 & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        uiVar4 = uiVar2;
                        if (startRestartGroup.changed(uiVar4)) {
                            i16 = Fields.Clip;
                            i4 |= i16;
                        }
                    } else {
                        uiVar4 = uiVar2;
                    }
                    i16 = 8192;
                    i4 |= i16;
                } else {
                    uiVar4 = uiVar2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? Fields.RenderEffect : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        iyVar2 = iyVar;
                        i4 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(sliderColors)) {
                                i15 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i15;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        }
                        i9 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i14 = (i3 & 16) != 0 ? i9 & (-57345) : i9;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i14 &= -29360129;
                                }
                                z4 = z2;
                                i12 = i7;
                                iyVar4 = iyVar2;
                                i13 = -743091416;
                                modifier4 = modifier2;
                                uiVar6 = uiVar4;
                                sliderColors3 = sliderColors;
                            } else {
                                Modifier modifier5 = i17 != 0 ? Modifier.Companion : modifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    i11 = i9 & (-57345);
                                    uiVar4 = new ti(0.0f, 1.0f);
                                } else {
                                    i11 = i9;
                                }
                                if (i6 != 0) {
                                    i7 = 0;
                                }
                                if (i8 != 0) {
                                    iyVar2 = null;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    sliderColors3 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    z4 = z2;
                                    i12 = i7;
                                    iyVar4 = iyVar2;
                                    modifier4 = modifier5;
                                    i14 = (-29360129) & i11;
                                    uiVar6 = uiVar4;
                                    i13 = -743091416;
                                } else {
                                    sliderColors3 = sliderColors;
                                    z4 = z2;
                                    i12 = i7;
                                    iyVar4 = iyVar2;
                                    i13 = -743091416;
                                    modifier4 = modifier5;
                                    i14 = i11;
                                    uiVar6 = uiVar4;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i13, i14, -1, "androidx.compose.material3.RangeSlider (Slider.kt:498)");
                            }
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                            composer2 = startRestartGroup;
                            RangeSlider(uiVar3, kyVar2, modifier4, z4, uiVar6, iyVar4, null, mutableInteractionSource, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                                public final void invoke(RangeSliderState rangeSliderState, Composer composer3, int i18) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-811582901, i18, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:513)");
                                    }
                                    SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z4, 0L, composer3, 196614, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                                public final void invoke(RangeSliderState rangeSliderState, Composer composer3, int i18) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1832060001, i18, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:520)");
                                    }
                                    SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z4, 0L, composer3, 196614, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                                public final void invoke(RangeSliderState rangeSliderState, Composer composer3, int i18) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(377064480, i18, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:527)");
                                    }
                                    SliderDefaults.INSTANCE.m2414Track4EFweAY(rangeSliderState, (Modifier) null, z4, sliderColors3, (my) null, (ny) null, 0.0f, 0.0f, composer3, (i18 & 14) | 100663296, 242);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), i12, composer2, (i14 & 14) | 918552576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | ((i14 >> 3) & 458752), ((i14 >> 9) & 896) | 54, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            sliderColors2 = sliderColors3;
                            modifier3 = modifier4;
                            z3 = z4;
                            uiVar5 = uiVar6;
                            iyVar3 = iyVar4;
                            i10 = i12;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            sliderColors2 = sliderColors;
                            modifier3 = modifier2;
                            z3 = z2;
                            uiVar5 = uiVar4;
                            i10 = i7;
                            iyVar3 = iyVar2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: oq0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 RangeSlider$lambda$13;
                                    int intValue = ((Integer) obj2).intValue();
                                    RangeSlider$lambda$13 = SliderKt.RangeSlider$lambda$13(ui.this, kyVar, modifier3, z3, uiVar5, i10, iyVar3, sliderColors2, i2, i3, (Composer) obj, intValue);
                                    return RangeSlider$lambda$13;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    iyVar2 = iyVar;
                    if ((i2 & 12582912) == 0) {
                    }
                    i9 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                iyVar2 = iyVar;
                if ((i2 & 12582912) == 0) {
                }
                i9 = i4;
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            iyVar2 = iyVar;
            if ((i2 & 12582912) == 0) {
            }
            i9 = i4;
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        iyVar2 = iyVar;
        if ((i2 & 12582912) == 0) {
        }
        i9 = i4;
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, ny nyVar, ny nyVar2, ny nyVar3, Composer composer, int i, int i2) {
        RangeSliderState rangeSliderState2;
        int i3;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        int i5;
        final MutableInteractionSource mutableInteractionSource3;
        int i6;
        final MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        Modifier modifier2;
        ny nyVar4;
        boolean z3;
        SliderColors sliderColors3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource6;
        ny nyVar5;
        ny nyVar6;
        ScopeUpdateScope endRestartGroup;
        ny nyVar7;
        Modifier modifier3;
        ny nyVar8;
        ny nyVar9;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-781154979);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            rangeSliderState2 = rangeSliderState;
        } else {
            rangeSliderState2 = rangeSliderState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(rangeSliderState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
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
                            i12 = Fields.CameraDistance;
                            i3 |= i12;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i12 = Fields.RotationZ;
                    i3 |= i12;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource3 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource3) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i3 |= startRestartGroup.changed(mutableInteractionSource4) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        }
                        i8 = i2 & Fields.SpotShadowColor;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changedInstance(nyVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i10 = i2 & Fields.RotationX;
                            if (i10 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i11 = i10;
                                i3 |= startRestartGroup.changedInstance(nyVar3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 8) != 0) {
                                            i3 &= -7169;
                                        }
                                        modifier3 = modifier;
                                        nyVar8 = nyVar;
                                        nyVar9 = nyVar2;
                                        nyVar7 = nyVar3;
                                    } else {
                                        Modifier modifier4 = i13 != 0 ? Modifier.Companion : modifier;
                                        if (i4 != 0) {
                                            z2 = true;
                                        }
                                        if ((i2 & 8) != 0) {
                                            i3 &= -7169;
                                            sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        }
                                        if (i5 != 0) {
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                        }
                                        if (i6 != 0) {
                                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue2;
                                        }
                                        ny rememberComposableLambda = i7 != 0 ? ComposableLambdaKt.rememberComposableLambda(1597255314, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$14
                                            public final void invoke(RangeSliderState rangeSliderState3, Composer composer3, int i14) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1597255314, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:706)");
                                                }
                                                SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer3, 196608, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54) : nyVar;
                                        ny rememberComposableLambda2 = i9 != 0 ? ComposableLambdaKt.rememberComposableLambda(1348023737, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$15
                                            public final void invoke(RangeSliderState rangeSliderState3, Composer composer3, int i14) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1348023737, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:713)");
                                                }
                                                SliderDefaults.INSTANCE.m2412Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer3, 196608, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54) : nyVar2;
                                        if (i11 != 0) {
                                            modifier3 = modifier4;
                                            nyVar7 = ComposableLambdaKt.rememberComposableLambda(-453269015, true, new ny() { // from class: androidx.compose.material3.SliderKt$RangeSlider$16
                                                public final void invoke(RangeSliderState rangeSliderState3, Composer composer3, int i14) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-453269015, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:720)");
                                                    }
                                                    SliderDefaults.INSTANCE.m2414Track4EFweAY(rangeSliderState3, (Modifier) null, z2, sliderColors2, (my) null, (ny) null, 0.0f, 0.0f, composer3, (i14 & 14) | 100663296, 242);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // defpackage.ny
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                    invoke((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                    return w01.a;
                                                }
                                            }, startRestartGroup, 54);
                                        } else {
                                            nyVar7 = nyVar3;
                                            modifier3 = modifier4;
                                        }
                                        nyVar8 = rememberComposableLambda;
                                        nyVar9 = rememberComposableLambda2;
                                    }
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource4;
                                    boolean z4 = z2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781154979, i3, -1, "androidx.compose.material3.RangeSlider (Slider.kt:726)");
                                    }
                                    if (rangeSliderState2.getSteps() >= 0) {
                                        int i14 = i3 >> 3;
                                        composer2 = startRestartGroup;
                                        RangeSliderImpl(modifier3, rangeSliderState2, z4, mutableInteractionSource7, mutableInteractionSource8, nyVar8, nyVar9, nyVar7, composer2, (i3 & 896) | (i14 & 14) | ((i3 << 3) & 112) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        sliderColors3 = sliderColors2;
                                        modifier2 = modifier3;
                                        z3 = z4;
                                        mutableInteractionSource5 = mutableInteractionSource7;
                                        mutableInteractionSource6 = mutableInteractionSource8;
                                        nyVar5 = nyVar8;
                                        nyVar4 = nyVar9;
                                        nyVar6 = nyVar7;
                                    } else {
                                        defpackage.o.m("steps should be >= 0");
                                        return;
                                    }
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    nyVar4 = nyVar2;
                                    z3 = z2;
                                    sliderColors3 = sliderColors2;
                                    mutableInteractionSource5 = mutableInteractionSource3;
                                    mutableInteractionSource6 = mutableInteractionSource4;
                                    nyVar5 = nyVar;
                                    nyVar6 = nyVar3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new t5(rangeSliderState, modifier2, z3, sliderColors3, mutableInteractionSource5, mutableInteractionSource6, nyVar5, nyVar4, nyVar6, i, i2));
                                    return;
                                }
                                return;
                            }
                            i11 = i10;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & Fields.RotationX;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource4 = mutableInteractionSource2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & Fields.RotationX;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource3 = mutableInteractionSource;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mutableInteractionSource4 = mutableInteractionSource2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & Fields.RotationX;
                if (i10 == 0) {
                }
                i11 = i10;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mutableInteractionSource4 = mutableInteractionSource2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & Fields.RotationX;
            if (i10 == 0) {
            }
            i11 = i10;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mutableInteractionSource4 = mutableInteractionSource2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & Fields.RotationX;
        if (i10 == 0) {
        }
        i11 = i10;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
