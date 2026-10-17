package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.dq;
import defpackage.iy;
import defpackage.kg;
import defpackage.ky;
import defpackage.ny;
import defpackage.oc;
import defpackage.sh;
import defpackage.th;
import defpackage.uh;
import defpackage.vh;
import defpackage.w01;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final float CheckboxDefaultPadding = Dp.m7611constructorimpl(2.0f);
    private static final float CheckboxSize = Dp.m7611constructorimpl(20.0f);
    private static final float RadiusSize = Dp.m7611constructorimpl(2.0f);
    private static final int SnapAnimationDelay = 100;

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
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(boolean z, ky kyVar, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Stroke stroke3;
        Stroke stroke4;
        Modifier modifier2;
        int i4;
        boolean z3;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        CheckboxColors checkboxColors3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        MutableInteractionSource mutableInteractionSource4;
        CheckboxColors checkboxColors4;
        boolean z5;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(534932591);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            stroke3 = stroke;
        } else {
            stroke3 = stroke;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(stroke3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            stroke4 = stroke2;
        } else {
            stroke4 = stroke2;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(stroke4) ? Fields.CameraDistance : Fields.RotationZ;
            }
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? Fields.RenderEffect : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i10 = 1048576;
                            i3 |= i10;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i10 = Fields.BlendMode;
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & Fields.SpotShadowColor;
                if (i5 != 0) {
                    i3 |= 12582912;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                i6 = i3;
                int i12 = 0;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    startRestartGroup.startDefaults();
                    iy iyVar = null;
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i7 = i6 & (-3670017);
                            checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                        } else {
                            i7 = i6;
                        }
                        if (i5 != 0) {
                            mutableInteractionSource4 = null;
                            z5 = z3;
                            checkboxColors4 = checkboxColors2;
                            i9 = 32;
                            i8 = 534932591;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i8, i7, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                            }
                            ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                            if (kyVar != null) {
                                startRestartGroup.startReplaceGroup(1848599606);
                                boolean z6 = ((i7 & 112) == i9) | ((i7 & 14) == 4);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new th(i12, z, kyVar);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                iyVar = (iy) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1848665295);
                                startRestartGroup.endReplaceGroup();
                            }
                            composer2 = startRestartGroup;
                            TriStateCheckbox(ToggleableState, iyVar, stroke3, stroke4, modifier4, z5, checkboxColors4, mutableInteractionSource4, composer2, i7 & 33554304, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            checkboxColors3 = checkboxColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i7 = i6 & (-3670017);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource2;
                            z5 = z3;
                            i7 = i6;
                            i9 = 32;
                            i8 = 534932591;
                            checkboxColors4 = checkboxColors2;
                            Modifier modifier42 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                            if (kyVar != null) {
                            }
                            composer2 = startRestartGroup;
                            TriStateCheckbox(ToggleableState2, iyVar, stroke3, stroke4, modifier42, z5, checkboxColors4, mutableInteractionSource4, composer2, i7 & 33554304, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z4 = z5;
                            checkboxColors3 = checkboxColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        }
                    }
                    mutableInteractionSource4 = mutableInteractionSource2;
                    z5 = z3;
                    checkboxColors4 = checkboxColors2;
                    i9 = 32;
                    i8 = 534932591;
                    Modifier modifier422 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ToggleableState ToggleableState22 = ToggleableStateKt.ToggleableState(z);
                    if (kyVar != null) {
                    }
                    composer2 = startRestartGroup;
                    TriStateCheckbox(ToggleableState22, iyVar, stroke3, stroke4, modifier422, z5, checkboxColors4, mutableInteractionSource4, composer2, i7 & 33554304, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier422;
                    z4 = z5;
                    checkboxColors3 = checkboxColors4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    checkboxColors3 = checkboxColors2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new uh(z, kyVar, stroke, stroke2, modifier3, z4, checkboxColors3, mutableInteractionSource3, i, i2));
                    return;
                }
                return;
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & Fields.SpotShadowColor;
            if (i5 != 0) {
            }
            i6 = i3;
            int i122 = 0;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & Fields.SpotShadowColor;
        if (i5 != 0) {
        }
        i6 = i3;
        int i1222 = 0;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Checkbox$lambda$2$lambda$1(ky kyVar, boolean z) {
        kyVar.invoke(Boolean.valueOf(!z));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Checkbox$lambda$3(boolean z, ky kyVar, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        Checkbox(z, kyVar, modifier, z2, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Checkbox$lambda$5$lambda$4(ky kyVar, boolean z) {
        kyVar.invoke(Boolean.valueOf(!z));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Checkbox$lambda$6(boolean z, ky kyVar, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        Checkbox(z, kyVar, stroke, stroke2, modifier, z2, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CheckboxImpl(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, final Stroke stroke, final Stroke stroke2, Composer composer, int i) {
        int i2;
        Composer composer2;
        float f;
        Float f2;
        ToggleableState toggleableState2;
        int i3;
        float f3;
        ToggleableState toggleableState3;
        int i4;
        float f4;
        int i5;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        Object rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(-891330208);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(checkboxColors) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(stroke) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(stroke2) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-891330208, i2, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:401)");
            }
            int i6 = i2 >> 3;
            int i7 = i6 & 14;
            Transition updateTransition = TransitionKt.updateTransition(toggleableState, (String) null, startRestartGroup, i7, 2);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            ny nyVar = new ny() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1
                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer3, int i8) {
                    composer3.startReplaceGroup(1780794470);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1780794470, i8, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:407)");
                    }
                    ToggleableState initialState = segment.getInitialState();
                    ToggleableState toggleableState4 = ToggleableState.Off;
                    FiniteAnimationSpec<Float> snap = initialState == toggleableState4 ? value : segment.getTargetState() == toggleableState4 ? AnimationSpecKt.snap(100) : value;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return snap;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
            zv zvVar = zv.a;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
            ToggleableState toggleableState4 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-768316570);
            int i8 = i2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i9 = iArr[toggleableState4.ordinal()];
            float f5 = 0.0f;
            if (i9 != 1) {
                if (i9 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf = Float.valueOf(f);
                    ToggleableState toggleableState5 = (ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-768316570);
                    if (ComposerKt.isTraceInProgress()) {
                        f2 = valueOf;
                        toggleableState2 = toggleableState5;
                    } else {
                        f2 = valueOf;
                        toggleableState2 = toggleableState5;
                        ComposerKt.traceEventStart(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
                    }
                    i3 = iArr[toggleableState2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, f2, Float.valueOf(f3), (FiniteAnimationSpec) nyVar.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            ny nyVar2 = new ny() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer3, int i10) {
                                    composer3.startReplaceGroup(630790831);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(630790831, i10, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
                                    }
                                    ToggleableState initialState = segment.getInitialState();
                                    ToggleableState toggleableState6 = ToggleableState.Off;
                                    FiniteAnimationSpec<Float> snap$default = initialState == toggleableState6 ? AnimationSpecKt.snap$default(0, 1, null) : segment.getTargetState() == toggleableState6 ? AnimationSpecKt.snap(100) : value;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return snap$default;
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<ToggleableState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }
                            };
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
                            ToggleableState toggleableState6 = (ToggleableState) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(1840054703);
                            if (ComposerKt.isTraceInProgress()) {
                                toggleableState3 = toggleableState6;
                                ComposerKt.traceEventStart(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
                            } else {
                                toggleableState3 = toggleableState6;
                            }
                            i4 = iArr[toggleableState3.ordinal()];
                            if (i4 != 1 || i4 == 2) {
                                f4 = 0.0f;
                            } else {
                                if (i4 != 3) {
                                    defpackage.o.n();
                                    return;
                                }
                                f4 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf2 = Float.valueOf(f4);
                            ToggleableState toggleableState7 = (ToggleableState) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(1840054703);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
                            }
                            i5 = iArr[toggleableState7.ordinal()];
                            if (i5 != 1 && i5 != 2) {
                                if (i5 == 3) {
                                    defpackage.o.n();
                                    return;
                                }
                                f5 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f5), (FiniteAnimationSpec) nyVar2.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            composer2 = startRestartGroup;
                            rememberedValue = composer2.rememberedValue();
                            companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                Object checkDrawingCache = new CheckDrawingCache(null, null, null, 7, null);
                                composer2.updateRememberedValue(checkDrawingCache);
                                rememberedValue = checkDrawingCache;
                            }
                            final CheckDrawingCache checkDrawingCache2 = (CheckDrawingCache) rememberedValue;
                            final State<Color> checkmarkColor$material3 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i7 | ((i8 >> 6) & 112));
                            int i10 = (i8 & 126) | (i6 & 896);
                            final State<Color> boxColor$material3 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i10);
                            final State<Color> borderColor$material3 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i10);
                            Modifier m799requiredSize3ABfNKs = SizeKt.m799requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, 2, null), CheckboxSize);
                            changed = composer2.changed(boxColor$material3) | composer2.changed(borderColor$material3) | composer2.changedInstance(stroke2) | composer2.changed(checkmarkColor$material3) | composer2.changed(createTransitionAnimation) | composer2.changed(createTransitionAnimation2) | composer2.changedInstance(stroke);
                            rememberedValue2 = composer2.rememberedValue();
                            if (!changed || rememberedValue2 == companion.getEmpty()) {
                                Object obj = new ky() { // from class: androidx.compose.material3.k
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj2) {
                                        w01 CheckboxImpl$lambda$14$lambda$13;
                                        CheckboxImpl$lambda$14$lambda$13 = CheckboxKt.CheckboxImpl$lambda$14$lambda$13(State.this, borderColor$material3, stroke2, checkmarkColor$material3, createTransitionAnimation, createTransitionAnimation2, stroke, checkDrawingCache2, (DrawScope) obj2);
                                        return CheckboxImpl$lambda$14$lambda$13;
                                    }
                                };
                                composer2.updateRememberedValue(obj);
                                rememberedValue2 = obj;
                            }
                            CanvasKt.Canvas(m799requiredSize3ABfNKs, (ky) rememberedValue2, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else if (i3 != 3) {
                            defpackage.o.n();
                            return;
                        }
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, f2, Float.valueOf(f3), (FiniteAnimationSpec) nyVar.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    ny nyVar22 = new ny() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer3, int i102) {
                            composer3.startReplaceGroup(630790831);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(630790831, i102, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
                            }
                            ToggleableState initialState = segment.getInitialState();
                            ToggleableState toggleableState62 = ToggleableState.Off;
                            FiniteAnimationSpec<Float> snap$default = initialState == toggleableState62 ? AnimationSpecKt.snap$default(0, 1, null) : segment.getTargetState() == toggleableState62 ? AnimationSpecKt.snap(100) : value;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return snap$default;
                        }

                        @Override // defpackage.ny
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj22, Object obj3) {
                            return invoke((Transition.Segment<ToggleableState>) obj2, (Composer) obj22, ((Number) obj3).intValue());
                        }
                    };
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(zvVar);
                    ToggleableState toggleableState62 = (ToggleableState) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(1840054703);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i4 = iArr[toggleableState3.ordinal()];
                    if (i4 != 1) {
                    }
                    f4 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf22 = Float.valueOf(f4);
                    ToggleableState toggleableState72 = (ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(1840054703);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = iArr[toggleableState72.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 3) {
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f5), (FiniteAnimationSpec) nyVar22.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    composer2 = startRestartGroup;
                    rememberedValue = composer2.rememberedValue();
                    companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                    }
                    final CheckDrawingCache checkDrawingCache22 = (CheckDrawingCache) rememberedValue;
                    final State checkmarkColor$material32 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i7 | ((i8 >> 6) & 112));
                    int i102 = (i8 & 126) | (i6 & 896);
                    final State boxColor$material32 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i102);
                    final State borderColor$material32 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i102);
                    Modifier m799requiredSize3ABfNKs2 = SizeKt.m799requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, 2, null), CheckboxSize);
                    changed = composer2.changed(boxColor$material32) | composer2.changed(borderColor$material32) | composer2.changedInstance(stroke2) | composer2.changed(checkmarkColor$material32) | composer2.changed(createTransitionAnimation3) | composer2.changed(createTransitionAnimation22) | composer2.changedInstance(stroke);
                    rememberedValue2 = composer2.rememberedValue();
                    if (!changed) {
                    }
                    Object obj2 = new ky() { // from class: androidx.compose.material3.k
                        @Override // defpackage.ky
                        public final Object invoke(Object obj22) {
                            w01 CheckboxImpl$lambda$14$lambda$13;
                            CheckboxImpl$lambda$14$lambda$13 = CheckboxKt.CheckboxImpl$lambda$14$lambda$13(State.this, borderColor$material32, stroke2, checkmarkColor$material32, createTransitionAnimation3, createTransitionAnimation22, stroke, checkDrawingCache22, (DrawScope) obj22);
                            return CheckboxImpl$lambda$14$lambda$13;
                        }
                    };
                    composer2.updateRememberedValue(obj2);
                    rememberedValue2 = obj2;
                    CanvasKt.Canvas(m799requiredSize3ABfNKs2, (ky) rememberedValue2, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i9 != 3) {
                    defpackage.o.n();
                    return;
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf3 = Float.valueOf(f);
            ToggleableState toggleableState52 = (ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-768316570);
            if (ComposerKt.isTraceInProgress()) {
            }
            i3 = iArr[toggleableState2.ordinal()];
            if (i3 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, f2, Float.valueOf(f3), (FiniteAnimationSpec) nyVar.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            ny nyVar222 = new ny() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1
                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer3, int i1022) {
                    composer3.startReplaceGroup(630790831);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(630790831, i1022, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
                    }
                    ToggleableState initialState = segment.getInitialState();
                    ToggleableState toggleableState622 = ToggleableState.Off;
                    FiniteAnimationSpec<Float> snap$default = initialState == toggleableState622 ? AnimationSpecKt.snap$default(0, 1, null) : segment.getTargetState() == toggleableState622 ? AnimationSpecKt.snap(100) : value;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return snap$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj22, Object obj222, Object obj3) {
                    return invoke((Transition.Segment<ToggleableState>) obj22, (Composer) obj222, ((Number) obj3).intValue());
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(zvVar);
            ToggleableState toggleableState622 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(1840054703);
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = iArr[toggleableState3.ordinal()];
            if (i4 != 1) {
            }
            f4 = 0.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf222 = Float.valueOf(f4);
            ToggleableState toggleableState722 = (ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(1840054703);
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = iArr[toggleableState722.ordinal()];
            if (i5 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f5), (FiniteAnimationSpec) nyVar222.invoke(updateTransition.getSegment(), startRestartGroup, 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            composer2 = startRestartGroup;
            rememberedValue = composer2.rememberedValue();
            companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
            }
            final CheckDrawingCache checkDrawingCache222 = (CheckDrawingCache) rememberedValue;
            final State checkmarkColor$material322 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i7 | ((i8 >> 6) & 112));
            int i1022 = (i8 & 126) | (i6 & 896);
            final State boxColor$material322 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i1022);
            final State borderColor$material322 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i1022);
            Modifier m799requiredSize3ABfNKs22 = SizeKt.m799requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, 2, null), CheckboxSize);
            changed = composer2.changed(boxColor$material322) | composer2.changed(borderColor$material322) | composer2.changedInstance(stroke2) | composer2.changed(checkmarkColor$material322) | composer2.changed(createTransitionAnimation32) | composer2.changed(createTransitionAnimation222) | composer2.changedInstance(stroke);
            rememberedValue2 = composer2.rememberedValue();
            if (!changed) {
            }
            Object obj22 = new ky() { // from class: androidx.compose.material3.k
                @Override // defpackage.ky
                public final Object invoke(Object obj222) {
                    w01 CheckboxImpl$lambda$14$lambda$13;
                    CheckboxImpl$lambda$14$lambda$13 = CheckboxKt.CheckboxImpl$lambda$14$lambda$13(State.this, borderColor$material322, stroke2, checkmarkColor$material322, createTransitionAnimation32, createTransitionAnimation222, stroke, checkDrawingCache222, (DrawScope) obj222);
                    return CheckboxImpl$lambda$14$lambda$13;
                }
            };
            composer2.updateRememberedValue(obj22);
            rememberedValue2 = obj22;
            CanvasKt.Canvas(m799requiredSize3ABfNKs22, (ky) rememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new sh(z, toggleableState, modifier, checkboxColors, stroke, stroke2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CheckboxImpl$lambda$14$lambda$13(State state, State state2, Stroke stroke, State state3, State state4, State state5, Stroke stroke2, CheckDrawingCache checkDrawingCache, DrawScope drawScope) {
        m1700drawBox1wkBAMs(drawScope, ((Color) state.getValue()).m4771unboximpl(), ((Color) state2.getValue()).m4771unboximpl(), drawScope.mo367toPx0680j_4(RadiusSize), stroke);
        m1701drawCheck3IgeMak(drawScope, ((Color) state3.getValue()).m4771unboximpl(), ((Number) state4.getValue()).floatValue(), ((Number) state5.getValue()).floatValue(), stroke2, checkDrawingCache);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CheckboxImpl$lambda$15(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Stroke stroke, Stroke stroke2, int i, Composer composer, int i2) {
        CheckboxImpl(z, toggleableState, modifier, checkboxColors, stroke, stroke2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(ToggleableState toggleableState, iy iyVar, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Stroke stroke3;
        Stroke stroke4;
        Modifier modifier2;
        int i4;
        boolean z2;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Composer composer2;
        CheckboxColors checkboxColors3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        CheckboxColors checkboxColors4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        int i6;
        boolean z4;
        MutableInteractionSource mutableInteractionSource5;
        Modifier modifier5;
        Modifier modifier6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-406243761);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            stroke3 = stroke;
        } else {
            stroke3 = stroke;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(stroke3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            stroke4 = stroke2;
        } else {
            stroke4 = stroke2;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(stroke4) ? Fields.CameraDistance : Fields.RotationZ;
            }
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i7 = 1048576;
                            i3 |= i7;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i7 = Fields.BlendMode;
                    i3 |= i7;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & Fields.SpotShadowColor;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        z3 = z2;
                        composer2 = startRestartGroup;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier7 = i8 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                i6 = i3;
                                z4 = z2;
                                checkboxColors4 = checkboxColors2;
                                modifier4 = modifier7;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-406243761, i6, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                                }
                                if (iyVar == null) {
                                    modifier5 = Modifier.Companion;
                                    boolean z5 = z4;
                                    modifier6 = ToggleableKt.m1031triStateToggleableO2vRcR0(modifier5, toggleableState, mutableInteractionSource4, RippleKt.m2297rippleH2RKhps$default(false, Dp.m7611constructorimpl(CheckboxTokens.INSTANCE.m3088getStateLayerSizeD9Ej5fM() / 2.0f), 0L, 4, null), z5, Role.m6821boximpl(Role.Companion.m6830getCheckboxo7Vup1c()), iyVar);
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    z4 = z5;
                                } else {
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    modifier5 = Modifier.Companion;
                                    modifier6 = modifier5;
                                }
                                if (iyVar != null) {
                                    modifier5 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier5);
                                }
                                int i9 = i6 << 6;
                                CheckboxColors checkboxColors5 = checkboxColors4;
                                CheckboxImpl(z4, toggleableState, PaddingKt.m762padding3ABfNKs(modifier4.then(modifier5).then(modifier6), CheckboxDefaultPadding), checkboxColors5, stroke3, stroke4, startRestartGroup, ((i6 >> 15) & 14) | ((i6 << 3) & 112) | ((i6 >> 9) & 7168) | (57344 & i9) | (i9 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z4;
                                composer2 = startRestartGroup;
                                modifier3 = modifier4;
                                mutableInteractionSource3 = mutableInteractionSource5;
                                checkboxColors3 = checkboxColors5;
                            } else {
                                checkboxColors4 = checkboxColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                modifier4 = modifier7;
                                i6 = i3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            checkboxColors4 = checkboxColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i6 = i3;
                            modifier4 = modifier2;
                        }
                        z4 = z2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (iyVar == null) {
                        }
                        if (iyVar != null) {
                        }
                        int i92 = i6 << 6;
                        CheckboxColors checkboxColors52 = checkboxColors4;
                        CheckboxImpl(z4, toggleableState, PaddingKt.m762padding3ABfNKs(modifier4.then(modifier5).then(modifier6), CheckboxDefaultPadding), checkboxColors52, stroke3, stroke4, startRestartGroup, ((i6 >> 15) & 14) | ((i6 << 3) & 112) | ((i6 >> 9) & 7168) | (57344 & i92) | (i92 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z4;
                        composer2 = startRestartGroup;
                        modifier3 = modifier4;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        checkboxColors3 = checkboxColors52;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kg(toggleableState, iyVar, stroke, stroke2, modifier3, z3, checkboxColors3, mutableInteractionSource3, i, i2));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & Fields.SpotShadowColor;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & Fields.SpotShadowColor;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TriStateCheckbox$lambda$8(ToggleableState toggleableState, iy iyVar, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        TriStateCheckbox(toggleableState, iyVar, modifier, z, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TriStateCheckbox$lambda$9(ToggleableState toggleableState, iy iyVar, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        TriStateCheckbox(toggleableState, iyVar, stroke, stroke2, modifier, z, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    private static final void m1700drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        if (Color.m4762equalsimpl0(j, j2)) {
            DrawScope.m5331drawRoundRectuAw5IA$default(drawScope, j, 0L, Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float width2 = stroke.getWidth();
        float width3 = stroke.getWidth();
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(width2) << 32) | (Float.floatToRawIntBits(width3) & 4294967295L));
        float width4 = intBitsToFloat - (stroke.getWidth() * 2.0f);
        float width5 = intBitsToFloat - (stroke.getWidth() * 2.0f);
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(width4) << 32) | (Float.floatToRawIntBits(width5) & 4294967295L));
        float max = Math.max(0.0f, f - stroke.getWidth());
        DrawScope.m5331drawRoundRectuAw5IA$default(drawScope, j, m4508constructorimpl, m4576constructorimpl, CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L)), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(width) & 4294967295L));
        float width6 = intBitsToFloat - stroke.getWidth();
        float width7 = intBitsToFloat - stroke.getWidth();
        float f2 = f - width;
        DrawScope.m5331drawRoundRectuAw5IA$default(drawScope, j2, m4508constructorimpl2, Size.m4576constructorimpl((Float.floatToRawIntBits(width7) & 4294967295L) | (Float.floatToRawIntBits(width6) << 32)), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), stroke, 0.0f, null, 0, 224, null);
    }

    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    private static final void m1701drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, Stroke stroke, CheckDrawingCache checkDrawingCache) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().rewind();
        checkDrawingCache.getCheckPath().moveTo(0.2f * intBitsToFloat, lerp3 * intBitsToFloat);
        checkDrawingCache.getCheckPath().lineTo(lerp * intBitsToFloat, lerp2 * intBitsToFloat);
        checkDrawingCache.getCheckPath().lineTo(0.8f * intBitsToFloat, intBitsToFloat * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().rewind();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m5325drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(boolean z, ky kyVar, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z4;
        CheckboxColors checkboxColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z5;
        CheckboxColors checkboxColors4;
        MutableInteractionSource mutableInteractionSource4;
        iy iyVar;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1406741137);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i6 = Fields.Clip;
                            i3 |= i6;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    int i8 = 1;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                z5 = z3;
                                checkboxColors4 = checkboxColors2;
                                mutableInteractionSource4 = null;
                                Modifier modifier4 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                                }
                                float floor = (float) Math.floor(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(CheckboxDefaults.INSTANCE.m1699getStrokeWidthD9Ej5fM()));
                                ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                                if (kyVar == null) {
                                    startRestartGroup.startReplaceGroup(2066152950);
                                    boolean z6 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new th(i8, z, kyVar);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    iyVar = (iy) rememberedValue;
                                } else {
                                    startRestartGroup.startReplaceGroup(2066218639);
                                    startRestartGroup.endReplaceGroup();
                                    iyVar = null;
                                }
                                dq dqVar = null;
                                float f = 0.0f;
                                int i9 = 0;
                                PathEffect pathEffect = null;
                                composer2 = startRestartGroup;
                                TriStateCheckbox(ToggleableState, iyVar, new Stroke(floor, f, StrokeCap.Companion.m5137getSquareKaPHkGw(), i9, pathEffect, 26, dqVar), new Stroke(floor, f, 0, i9, pathEffect, 30, dqVar), modifier4, z5, checkboxColors4, mutableInteractionSource4, composer2, (i3 << 6) & 33546240, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z4 = z5;
                                checkboxColors3 = checkboxColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        checkboxColors4 = checkboxColors2;
                        Modifier modifier42 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        float floor2 = (float) Math.floor(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(CheckboxDefaults.INSTANCE.m1699getStrokeWidthD9Ej5fM()));
                        ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                        if (kyVar == null) {
                        }
                        dq dqVar2 = null;
                        float f2 = 0.0f;
                        int i92 = 0;
                        PathEffect pathEffect2 = null;
                        composer2 = startRestartGroup;
                        TriStateCheckbox(ToggleableState2, iyVar, new Stroke(floor2, f2, StrokeCap.Companion.m5137getSquareKaPHkGw(), i92, pathEffect2, 26, dqVar2), new Stroke(floor2, f2, 0, i92, pathEffect2, 30, dqVar2), modifier42, z5, checkboxColors4, mutableInteractionSource4, composer2, (i3 << 6) & 33546240, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        z4 = z5;
                        checkboxColors3 = checkboxColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new oc(z, kyVar, modifier3, z4, checkboxColors3, mutableInteractionSource3, i, i2, 2));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                int i82 = 1;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            int i822 = 1;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        int i8222 = 1;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(ToggleableState toggleableState, iy iyVar, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        iy iyVar2;
        Modifier modifier2;
        int i4;
        boolean z2;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        CheckboxColors checkboxColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        boolean z4;
        int i6;
        CheckboxColors checkboxColors4;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1608358065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i7 = Fields.Clip;
                            i3 |= i7;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                            z4 = z2;
                            checkboxColors4 = checkboxColors2;
                            i6 = 6;
                        } else {
                            Modifier modifier5 = i8 != 0 ? Modifier.Companion : modifier2;
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                modifier4 = modifier5;
                                z4 = z5;
                                i6 = 6;
                                mutableInteractionSource4 = null;
                                checkboxColors4 = checkboxColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1608358065, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                                }
                                float floor = (float) Math.floor(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(CheckboxDefaults.INSTANCE.m1699getStrokeWidthD9Ej5fM()));
                                dq dqVar = null;
                                float f = 0.0f;
                                int i9 = 0;
                                PathEffect pathEffect = null;
                                Stroke stroke = new Stroke(floor, f, StrokeCap.Companion.m5137getSquareKaPHkGw(), i9, pathEffect, 26, dqVar);
                                Stroke stroke2 = new Stroke(floor, f, 0, i9, pathEffect, 30, dqVar);
                                int i10 = i3 & 126;
                                int i11 = i3 << i6;
                                composer2 = startRestartGroup;
                                TriStateCheckbox(toggleableState, iyVar2, stroke, stroke2, modifier4, z4, checkboxColors4, mutableInteractionSource4, composer2, i10 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                checkboxColors3 = checkboxColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                modifier4 = modifier5;
                                z4 = z5;
                                i6 = 6;
                                checkboxColors4 = checkboxColors2;
                            }
                        }
                        mutableInteractionSource4 = mutableInteractionSource2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        float floor2 = (float) Math.floor(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(CheckboxDefaults.INSTANCE.m1699getStrokeWidthD9Ej5fM()));
                        dq dqVar2 = null;
                        float f2 = 0.0f;
                        int i92 = 0;
                        PathEffect pathEffect2 = null;
                        Stroke stroke3 = new Stroke(floor2, f2, StrokeCap.Companion.m5137getSquareKaPHkGw(), i92, pathEffect2, 26, dqVar2);
                        Stroke stroke22 = new Stroke(floor2, f2, 0, i92, pathEffect2, 30, dqVar2);
                        int i102 = i3 & 126;
                        int i112 = i3 << i6;
                        composer2 = startRestartGroup;
                        TriStateCheckbox(toggleableState, iyVar2, stroke3, stroke22, modifier4, z4, checkboxColors4, mutableInteractionSource4, composer2, i102 | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        checkboxColors3 = checkboxColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new vh(toggleableState, iyVar, modifier3, z3, checkboxColors3, mutableInteractionSource3, i, i2));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
