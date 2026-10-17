package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.ky;
import defpackage.oc;
import defpackage.te0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final float RadioButtonPadding = Dp.m7611constructorimpl(2.0f);
    private static final float RadioButtonDotSize = Dp.m7611constructorimpl(12.0f);
    private static final float RadioStrokeWidth = Dp.m7611constructorimpl(2.0f);

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(boolean z, iy iyVar, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        RadioButtonColors radioButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z4;
        RadioButtonColors radioButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i6;
        boolean z5;
        RadioButtonColors radioButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier5;
        RadioButtonColors radioButtonColors5;
        Modifier modifier6;
        Modifier modifier7;
        boolean changed;
        Object rememberedValue;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(408580840);
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
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
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
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (startRestartGroup.changed(radioButtonColors2)) {
                            i7 = Fields.Clip;
                            i3 |= i7;
                        }
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        radioButtonColors3 = radioButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier4 = i8 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                radioButtonColors2 = RadioButtonDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            i6 = i3;
                            z5 = z3;
                            radioButtonColors4 = radioButtonColors2;
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(408580840, i6, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:80)");
                                }
                                State<Dp> m127animateDpAsStateAjpBEmI = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(!z ? Dp.m7611constructorimpl(RadioButtonDotSize / 2.0f) : Dp.m7611constructorimpl(0.0f), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                                State<Color> radioColor$material3 = radioButtonColors4.radioColor$material3(z5, z, startRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & 112));
                                if (iyVar == null) {
                                    modifier6 = Modifier.Companion;
                                    int m6833getRadioButtono7Vup1c = Role.Companion.m6833getRadioButtono7Vup1c();
                                    IndicationNodeFactory m2297rippleH2RKhps$default = RippleKt.m2297rippleH2RKhps$default(false, Dp.m7611constructorimpl(RadioButtonTokens.INSTANCE.m3596getStateLayerSizeD9Ej5fM() / 2.0f), 0L, 4, null);
                                    Role m6821boximpl = Role.m6821boximpl(m6833getRadioButtono7Vup1c);
                                    radioButtonColors5 = radioButtonColors4;
                                    modifier5 = modifier4;
                                    z4 = z5;
                                    modifier7 = SelectableKt.m1018selectableO2vRcR0(modifier6, z, mutableInteractionSource4, m2297rippleH2RKhps$default, z4, m6821boximpl, iyVar);
                                } else {
                                    modifier5 = modifier4;
                                    radioButtonColors5 = radioButtonColors4;
                                    z4 = z5;
                                    modifier6 = Modifier.Companion;
                                    modifier7 = modifier6;
                                }
                                if (iyVar != null) {
                                    modifier6 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier6);
                                }
                                Modifier m799requiredSize3ABfNKs = SizeKt.m799requiredSize3ABfNKs(PaddingKt.m762padding3ABfNKs(SizeKt.wrapContentSize$default(modifier5.then(modifier6).then(modifier7), Alignment.Companion.getCenter(), false, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3595getIconSizeD9Ej5fM());
                                changed = startRestartGroup.changed(radioColor$material3) | startRestartGroup.changed(m127animateDpAsStateAjpBEmI);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new te0(1, radioColor$material3, m127animateDpAsStateAjpBEmI);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                CanvasKt.Canvas(m799requiredSize3ABfNKs, (ky) rememberedValue, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource4;
                                radioButtonColors3 = radioButtonColors5;
                                modifier3 = modifier5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                            modifier4 = modifier2;
                            z5 = z3;
                            radioButtonColors4 = radioButtonColors2;
                        }
                        mutableInteractionSource4 = mutableInteractionSource2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        State<Dp> m127animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(!z ? Dp.m7611constructorimpl(RadioButtonDotSize / 2.0f) : Dp.m7611constructorimpl(0.0f), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                        State<Color> radioColor$material32 = radioButtonColors4.radioColor$material3(z5, z, startRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & 112));
                        if (iyVar == null) {
                        }
                        if (iyVar != null) {
                        }
                        Modifier m799requiredSize3ABfNKs2 = SizeKt.m799requiredSize3ABfNKs(PaddingKt.m762padding3ABfNKs(SizeKt.wrapContentSize$default(modifier5.then(modifier6).then(modifier7), Alignment.Companion.getCenter(), false, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3595getIconSizeD9Ej5fM());
                        changed = startRestartGroup.changed(radioColor$material32) | startRestartGroup.changed(m127animateDpAsStateAjpBEmI2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new te0(1, radioColor$material32, m127animateDpAsStateAjpBEmI2);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        CanvasKt.Canvas(m799requiredSize3ABfNKs2, (ky) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        radioButtonColors3 = radioButtonColors5;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new oc(z, iyVar, modifier3, z4, radioButtonColors3, mutableInteractionSource3, i, i2, 3));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
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
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
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
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RadioButton$lambda$1$lambda$0(State state, State state2, DrawScope drawScope) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(RadioStrokeWidth);
        float f = mo367toPx0680j_4 / 2.0f;
        DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m4771unboximpl(), drawScope.mo367toPx0680j_4(Dp.m7611constructorimpl(RadioButtonTokens.INSTANCE.m3595getIconSizeD9Ej5fM() / 2.0f)) - f, 0L, 0.0f, new Stroke(mo367toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m7610compareTo0680j_4(((Dp) state2.getValue()).m7625unboximpl(), Dp.m7611constructorimpl(0.0f)) > 0) {
            DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m4771unboximpl(), drawScope.mo367toPx0680j_4(((Dp) state2.getValue()).m7625unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 RadioButton$lambda$2(boolean z, iy iyVar, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        RadioButton(z, iyVar, modifier, z2, radioButtonColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
