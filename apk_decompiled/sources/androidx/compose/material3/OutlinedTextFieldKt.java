package androidx.compose.material3;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.de0;
import defpackage.dq;
import defpackage.ee0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.iy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m7611constructorimpl(4.0f);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02dd, code lost:
    
        if (r5.changed(r92) == false) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar7, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3, int i4) {
        TextFieldState textFieldState2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        TextStyle textStyle2;
        TextFieldLabelPosition textFieldLabelPosition2;
        int i8;
        ny nyVar2;
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
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        my myVar8;
        my myVar9;
        InputTransformation inputTransformation2;
        OutputTransformation outputTransformation2;
        KeyboardOptions keyboardOptions2;
        KeyboardActionHandler keyboardActionHandler2;
        TextFieldLineLimits textFieldLineLimits2;
        my myVar10;
        ScrollState scrollState2;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        boolean z6;
        boolean z7;
        TextStyle textStyle3;
        TextFieldLabelPosition textFieldLabelPosition3;
        Modifier modifier3;
        ny nyVar3;
        my myVar11;
        my myVar12;
        my myVar13;
        my myVar14;
        boolean z8;
        ScopeUpdateScope endRestartGroup;
        TextFieldLineLimits textFieldLineLimits3;
        TextFieldColors colors;
        TextStyle textStyle4;
        Modifier modifier4;
        TextFieldLabelPosition textFieldLabelPosition4;
        ny nyVar4;
        Shape shape3;
        my myVar15;
        PaddingValues m2240contentPaddinga9UjIt4$default;
        InputTransformation inputTransformation3;
        boolean z9;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler keyboardActionHandler3;
        ScrollState scrollState3;
        int i32;
        MutableInteractionSource mutableInteractionSource3;
        my myVar16;
        my myVar17;
        my myVar18;
        boolean z10;
        TextFieldLineLimits textFieldLineLimits4;
        my myVar19;
        my myVar20;
        OutputTransformation outputTransformation3;
        int i33;
        my myVar21;
        MutableInteractionSource mutableInteractionSource4;
        int i34;
        Composer startRestartGroup = composer.startRestartGroup(-2007078942);
        if ((i4 & 1) != 0) {
            i5 = i | 6;
            textFieldState2 = textFieldState;
        } else {
            textFieldState2 = textFieldState;
            if ((i & 6) == 0) {
                i5 = (startRestartGroup.changed(textFieldState2) ? 4 : 2) | i;
            } else {
                i5 = i;
            }
        }
        int i35 = i4 & 2;
        if (i35 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            int i36 = Fields.RotationX;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i5 |= startRestartGroup.changed(z4) ? 256 : Fields.SpotShadowColor;
                i7 = i4 & 8;
                int i37 = Fields.RotationZ;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    z5 = z2;
                    i5 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i4 & 16) == 0) {
                            textStyle2 = textStyle;
                            if (startRestartGroup.changed(textStyle2)) {
                                i34 = 16384;
                                i5 |= i34;
                            }
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = 8192;
                        i5 |= i34;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i & 196608) != 0) {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                        i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textFieldLabelPosition2)) ? 131072 : 65536;
                    } else {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                        nyVar2 = nyVar;
                    } else {
                        nyVar2 = nyVar;
                        if ((i & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(nyVar2) ? 1048576 : 524288;
                        }
                    }
                    i9 = i4 & Fields.SpotShadowColor;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changedInstance(myVar) ? 8388608 : 4194304;
                    }
                    i10 = i4 & Fields.RotationX;
                    int i38 = GroupFlagsKt.HasAuxSlotFlag;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i11 = i10;
                        i5 |= startRestartGroup.changedInstance(myVar2) ? 67108864 : 33554432;
                        i12 = i4 & Fields.RotationY;
                        int i39 = GroupFlagsKt.IsMovableContentFlag;
                        if (i12 != 0) {
                            i5 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i13 = i12;
                            i5 |= startRestartGroup.changedInstance(myVar3) ? 536870912 : 268435456;
                            i14 = i4 & Fields.RotationZ;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (startRestartGroup.changedInstance(myVar4) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            i17 = i4 & Fields.CameraDistance;
                            if (i17 == 0) {
                                i16 |= 48;
                                i18 = i17;
                            } else if ((i2 & 48) == 0) {
                                i18 = i17;
                                i16 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            int i40 = i16;
                            i19 = i4 & Fields.TransformOrigin;
                            if (i19 == 0) {
                                i20 = i40 | 384;
                            } else {
                                int i41 = i40;
                                if ((i2 & 384) == 0) {
                                    i41 |= startRestartGroup.changedInstance(myVar6) ? 256 : Fields.SpotShadowColor;
                                }
                                i20 = i41;
                            }
                            i21 = i4 & 8192;
                            if (i21 == 0) {
                                i22 = i20 | 3072;
                            } else {
                                int i42 = i20;
                                if ((i2 & 3072) == 0) {
                                    i42 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                }
                                i22 = i42;
                            }
                            i23 = i4 & Fields.Clip;
                            if (i23 == 0) {
                                i24 = i22 | 24576;
                            } else {
                                i24 = i22;
                                if ((i2 & 24576) == 0) {
                                    i24 |= startRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                                    i25 = i4 & Fields.CompositingStrategy;
                                    if (i25 != 0) {
                                        i24 |= 196608;
                                    } else if ((i2 & 196608) == 0) {
                                        i24 |= startRestartGroup.changed(outputTransformation) ? 131072 : 65536;
                                    }
                                    i26 = i4 & 65536;
                                    if (i26 != 0) {
                                        i24 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i24 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                                    }
                                    i27 = i4 & Fields.RenderEffect;
                                    if (i27 != 0) {
                                        i24 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i24 |= startRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                                    }
                                    if ((i2 & 100663296) == 0) {
                                        if ((i4 & Fields.ColorFilter) == 0 && startRestartGroup.changed(textFieldLineLimits)) {
                                            i38 = 67108864;
                                        }
                                        i24 |= i38;
                                    }
                                    i28 = i4 & Fields.BlendMode;
                                    if (i28 != 0) {
                                        i24 |= 805306368;
                                    } else if ((i2 & 805306368) == 0) {
                                        if (startRestartGroup.changedInstance(myVar7)) {
                                            i39 = 536870912;
                                        }
                                        i24 |= i39;
                                    }
                                    if ((i3 & 6) == 0) {
                                        i29 = i3 | (((i4 & 1048576) == 0 && startRestartGroup.changed(scrollState)) ? 4 : 2);
                                    } else {
                                        i29 = i3;
                                    }
                                    if ((i3 & 48) == 0) {
                                        i29 |= ((i4 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i3 & 384) == 0) {
                                        if ((i4 & 4194304) != 0) {
                                        }
                                        i36 = Fields.SpotShadowColor;
                                        i29 |= i36;
                                    }
                                    if ((i3 & 3072) == 0) {
                                        if ((i4 & GroupFlagsKt.IsNodeFlag) == 0 && startRestartGroup.changed(paddingValues)) {
                                            i37 = 2048;
                                        }
                                        i29 |= i37;
                                    }
                                    int i43 = i29;
                                    i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
                                    if (i30 != 0) {
                                        i31 = i43 | 24576;
                                    } else {
                                        int i44 = i43;
                                        if ((i3 & 24576) == 0) {
                                            i44 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                                        }
                                        i31 = i44;
                                    }
                                    if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            if (i35 != 0) {
                                                modifier2 = Modifier.Companion;
                                            }
                                            if (i6 != 0) {
                                                z4 = true;
                                            }
                                            if (i7 != 0) {
                                                z5 = false;
                                            }
                                            if ((i4 & 16) != 0) {
                                                i5 &= -57345;
                                                textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                            }
                                            if ((i4 & 32) != 0) {
                                                i5 &= -458753;
                                                textFieldLabelPosition2 = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                            }
                                            if (i8 != 0) {
                                                nyVar2 = null;
                                            }
                                            my myVar22 = i9 != 0 ? null : myVar;
                                            my myVar23 = i11 != 0 ? null : myVar2;
                                            my myVar24 = i13 != 0 ? null : myVar3;
                                            my myVar25 = i15 != 0 ? null : myVar4;
                                            my myVar26 = i18 != 0 ? null : myVar5;
                                            my myVar27 = i19 != 0 ? null : myVar6;
                                            boolean z11 = i21 != 0 ? false : z3;
                                            InputTransformation inputTransformation4 = i23 != 0 ? null : inputTransformation;
                                            OutputTransformation outputTransformation4 = i25 != 0 ? null : outputTransformation;
                                            KeyboardOptions keyboardOptions4 = i26 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                            KeyboardActionHandler keyboardActionHandler4 = i27 != 0 ? null : keyboardActionHandler;
                                            if ((i4 & Fields.ColorFilter) != 0) {
                                                textFieldLineLimits3 = TextFieldLineLimits.Companion.getDefault();
                                                i24 &= -234881025;
                                            } else {
                                                textFieldLineLimits3 = textFieldLineLimits;
                                            }
                                            my myVar28 = i28 != 0 ? null : myVar7;
                                            ScrollState rememberScrollState = (i4 & 1048576) != 0 ? ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1) : scrollState;
                                            Shape shape4 = (i4 & 2097152) != 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            ny nyVar5 = nyVar2;
                                            colors = (i4 & 4194304) != 0 ? OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6) : textFieldColors;
                                            textStyle4 = textStyle2;
                                            modifier4 = modifier2;
                                            textFieldLabelPosition4 = textFieldLabelPosition2;
                                            nyVar4 = nyVar5;
                                            shape3 = shape4;
                                            myVar15 = myVar28;
                                            m2240contentPaddinga9UjIt4$default = (i4 & GroupFlagsKt.IsNodeFlag) != 0 ? OutlinedTextFieldDefaults.m2240contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
                                            inputTransformation3 = inputTransformation4;
                                            z9 = z5;
                                            keyboardOptions3 = keyboardOptions4;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            scrollState3 = rememberScrollState;
                                            if (i30 != 0) {
                                                mutableInteractionSource3 = null;
                                                i32 = -2007078942;
                                            } else {
                                                i32 = -2007078942;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                            }
                                            myVar16 = myVar24;
                                            myVar17 = myVar25;
                                            myVar18 = myVar27;
                                            z10 = z11;
                                            textFieldLineLimits4 = textFieldLineLimits3;
                                            myVar19 = myVar22;
                                            myVar20 = myVar26;
                                            outputTransformation3 = outputTransformation4;
                                            i33 = i24;
                                            myVar21 = myVar23;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i4 & 16) != 0) {
                                                i5 &= -57345;
                                            }
                                            if ((i4 & 32) != 0) {
                                                i5 &= -458753;
                                            }
                                            if ((i4 & Fields.ColorFilter) != 0) {
                                                i24 &= -234881025;
                                            }
                                            myVar19 = myVar;
                                            myVar21 = myVar2;
                                            myVar16 = myVar3;
                                            myVar17 = myVar4;
                                            myVar20 = myVar5;
                                            myVar18 = myVar6;
                                            z10 = z3;
                                            inputTransformation3 = inputTransformation;
                                            outputTransformation3 = outputTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActionHandler3 = keyboardActionHandler;
                                            textFieldLineLimits4 = textFieldLineLimits;
                                            myVar15 = myVar7;
                                            scrollState3 = scrollState;
                                            shape3 = shape;
                                            m2240contentPaddinga9UjIt4$default = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            z9 = z5;
                                            textStyle4 = textStyle2;
                                            modifier4 = modifier2;
                                            i33 = i24;
                                            i32 = -2007078942;
                                            textFieldLabelPosition4 = textFieldLabelPosition2;
                                            nyVar4 = nyVar2;
                                            colors = textFieldColors;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(i32, i5, i33, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:228)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(1647415065);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                        } else {
                                            startRestartGroup.startReplaceGroup(-362500226);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(-362494116);
                                        long m7090getColor0d7_KjU = textStyle4.m7090getColor0d7_KjU();
                                        if (m7090getColor0d7_KjU == 16) {
                                            m7090getColor0d7_KjU = colors.m2574textColorXeAY9LY$material3(z4, z10, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        long j = m7090getColor0d7_KjU;
                                        startRestartGroup.endReplaceGroup();
                                        boolean z12 = z4;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(colors.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-416142558, true, new OutlinedTextFieldKt$OutlinedTextField$1(modifier4, nyVar4, textFieldLabelPosition4, z10, colors, textFieldState2, z12, textFieldLineLimits4, outputTransformation3, mutableInteractionSource4, myVar19, myVar21, myVar16, myVar17, myVar20, myVar18, m2240contentPaddinga9UjIt4$default, z9, inputTransformation3, textStyle4.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null)), keyboardOptions3, keyboardActionHandler3, myVar15, scrollState3, shape3), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        nyVar3 = nyVar4;
                                        textFieldLabelPosition3 = textFieldLabelPosition4;
                                        z6 = z12;
                                        textFieldLineLimits2 = textFieldLineLimits4;
                                        outputTransformation2 = outputTransformation3;
                                        myVar11 = myVar19;
                                        myVar8 = myVar21;
                                        myVar12 = myVar16;
                                        myVar13 = myVar17;
                                        myVar14 = myVar20;
                                        paddingValues2 = m2240contentPaddinga9UjIt4$default;
                                        z7 = z9;
                                        inputTransformation2 = inputTransformation3;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActionHandler2 = keyboardActionHandler3;
                                        myVar10 = myVar15;
                                        scrollState2 = scrollState3;
                                        shape2 = shape3;
                                        textFieldColors2 = colors;
                                        z8 = z10;
                                        myVar9 = myVar18;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        myVar8 = myVar2;
                                        myVar9 = myVar6;
                                        inputTransformation2 = inputTransformation;
                                        outputTransformation2 = outputTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        textFieldLineLimits2 = textFieldLineLimits;
                                        myVar10 = myVar7;
                                        scrollState2 = scrollState;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        composer2 = startRestartGroup;
                                        z6 = z4;
                                        z7 = z5;
                                        textStyle3 = textStyle2;
                                        textFieldLabelPosition3 = textFieldLabelPosition2;
                                        modifier3 = modifier2;
                                        nyVar3 = nyVar2;
                                        myVar11 = myVar;
                                        myVar12 = myVar3;
                                        myVar13 = myVar4;
                                        myVar14 = myVar5;
                                        z8 = z3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new fe0(textFieldState, modifier3, z6, z7, textStyle3, textFieldLabelPosition3, nyVar3, myVar11, myVar8, myVar12, myVar13, myVar14, myVar9, z8, inputTransformation2, outputTransformation2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, myVar10, scrollState2, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i, i2, i3, i4, 0));
                                        return;
                                    }
                                    return;
                                }
                            }
                            i25 = i4 & Fields.CompositingStrategy;
                            if (i25 != 0) {
                            }
                            i26 = i4 & 65536;
                            if (i26 != 0) {
                            }
                            i27 = i4 & Fields.RenderEffect;
                            if (i27 != 0) {
                            }
                            if ((i2 & 100663296) == 0) {
                            }
                            i28 = i4 & Fields.BlendMode;
                            if (i28 != 0) {
                            }
                            if ((i3 & 6) == 0) {
                            }
                            if ((i3 & 48) == 0) {
                            }
                            if ((i3 & 384) == 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i432 = i29;
                            i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
                            if (i30 != 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i4 & Fields.RotationZ;
                        if (i14 == 0) {
                        }
                        i17 = i4 & Fields.CameraDistance;
                        if (i17 == 0) {
                        }
                        int i402 = i16;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 == 0) {
                        }
                        i21 = i4 & 8192;
                        if (i21 == 0) {
                        }
                        i23 = i4 & Fields.Clip;
                        if (i23 == 0) {
                        }
                        i25 = i4 & Fields.CompositingStrategy;
                        if (i25 != 0) {
                        }
                        i26 = i4 & 65536;
                        if (i26 != 0) {
                        }
                        i27 = i4 & Fields.RenderEffect;
                        if (i27 != 0) {
                        }
                        if ((i2 & 100663296) == 0) {
                        }
                        i28 = i4 & Fields.BlendMode;
                        if (i28 != 0) {
                        }
                        if ((i3 & 6) == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        if ((i3 & 384) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i4322 = i29;
                        i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
                        if (i30 != 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    i12 = i4 & Fields.RotationY;
                    int i392 = GroupFlagsKt.IsMovableContentFlag;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i4 & Fields.RotationZ;
                    if (i14 == 0) {
                    }
                    i17 = i4 & Fields.CameraDistance;
                    if (i17 == 0) {
                    }
                    int i4022 = i16;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 == 0) {
                    }
                    i21 = i4 & 8192;
                    if (i21 == 0) {
                    }
                    i23 = i4 & Fields.Clip;
                    if (i23 == 0) {
                    }
                    i25 = i4 & Fields.CompositingStrategy;
                    if (i25 != 0) {
                    }
                    i26 = i4 & 65536;
                    if (i26 != 0) {
                    }
                    i27 = i4 & Fields.RenderEffect;
                    if (i27 != 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    i28 = i4 & Fields.BlendMode;
                    if (i28 != 0) {
                    }
                    if ((i3 & 6) == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    if ((i3 & 384) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i43222 = i29;
                    i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
                    if (i30 != 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
                if ((i & 24576) != 0) {
                }
                if ((i & 196608) != 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & Fields.SpotShadowColor;
                if (i9 == 0) {
                }
                i10 = i4 & Fields.RotationX;
                int i382 = GroupFlagsKt.HasAuxSlotFlag;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i4 & Fields.RotationY;
                int i3922 = GroupFlagsKt.IsMovableContentFlag;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i4 & Fields.RotationZ;
                if (i14 == 0) {
                }
                i17 = i4 & Fields.CameraDistance;
                if (i17 == 0) {
                }
                int i40222 = i16;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 == 0) {
                }
                i21 = i4 & 8192;
                if (i21 == 0) {
                }
                i23 = i4 & Fields.Clip;
                if (i23 == 0) {
                }
                i25 = i4 & Fields.CompositingStrategy;
                if (i25 != 0) {
                }
                i26 = i4 & 65536;
                if (i26 != 0) {
                }
                i27 = i4 & Fields.RenderEffect;
                if (i27 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i28 = i4 & Fields.BlendMode;
                if (i28 != 0) {
                }
                if ((i3 & 6) == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & 384) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i432222 = i29;
                i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
                if (i30 != 0) {
                }
                if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i7 = i4 & 8;
            int i372 = Fields.RotationZ;
            if (i7 != 0) {
            }
            z5 = z2;
            if ((i & 24576) != 0) {
            }
            if ((i & 196608) != 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & Fields.SpotShadowColor;
            if (i9 == 0) {
            }
            i10 = i4 & Fields.RotationX;
            int i3822 = GroupFlagsKt.HasAuxSlotFlag;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i4 & Fields.RotationY;
            int i39222 = GroupFlagsKt.IsMovableContentFlag;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & Fields.RotationZ;
            if (i14 == 0) {
            }
            i17 = i4 & Fields.CameraDistance;
            if (i17 == 0) {
            }
            int i402222 = i16;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 == 0) {
            }
            i21 = i4 & 8192;
            if (i21 == 0) {
            }
            i23 = i4 & Fields.Clip;
            if (i23 == 0) {
            }
            i25 = i4 & Fields.CompositingStrategy;
            if (i25 != 0) {
            }
            i26 = i4 & 65536;
            if (i26 != 0) {
            }
            i27 = i4 & Fields.RenderEffect;
            if (i27 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i28 = i4 & Fields.BlendMode;
            if (i28 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & 384) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i4322222 = i29;
            i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
            if (i30 != 0) {
            }
            if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        int i362 = Fields.RotationX;
        if (i6 == 0) {
        }
        z4 = z;
        i7 = i4 & 8;
        int i3722 = Fields.RotationZ;
        if (i7 != 0) {
        }
        z5 = z2;
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) != 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & Fields.SpotShadowColor;
        if (i9 == 0) {
        }
        i10 = i4 & Fields.RotationX;
        int i38222 = GroupFlagsKt.HasAuxSlotFlag;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i4 & Fields.RotationY;
        int i392222 = GroupFlagsKt.IsMovableContentFlag;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & Fields.RotationZ;
        if (i14 == 0) {
        }
        i17 = i4 & Fields.CameraDistance;
        if (i17 == 0) {
        }
        int i4022222 = i16;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 == 0) {
        }
        i21 = i4 & 8192;
        if (i21 == 0) {
        }
        i23 = i4 & Fields.Clip;
        if (i23 == 0) {
        }
        i25 = i4 & Fields.CompositingStrategy;
        if (i25 != 0) {
        }
        i26 = i4 & 65536;
        if (i26 != 0) {
        }
        i27 = i4 & Fields.RenderEffect;
        if (i27 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i28 = i4 & Fields.BlendMode;
        if (i28 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i43222222 = i29;
        i30 = i4 & GroupFlagsKt.HasObjectKeyFlag;
        if (i30 != 0) {
        }
        if (startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 9363) == 9362) ? false : true, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedTextField$lambda$2(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar7, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4, Composer composer, int i5) {
        OutlinedTextField(textFieldState, modifier, z, z2, textStyle, textFieldLabelPosition, nyVar, myVar, myVar2, myVar3, myVar4, myVar5, myVar6, z3, inputTransformation, outputTransformation, keyboardOptions, keyboardActionHandler, textFieldLineLimits, myVar7, scrollState, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedTextField$lambda$5(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        OutlinedTextField(str, kyVar, modifier, z, z2, textStyle, myVar, myVar2, myVar3, myVar4, myVar5, myVar6, myVar7, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedTextField$lambda$8(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        OutlinedTextField(textFieldValue, kyVar, modifier, z, z2, textStyle, myVar, myVar2, myVar3, myVar4, myVar5, myVar6, myVar7, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x065d  */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextFieldLayout(final Modifier modifier, my myVar, final ny nyVar, my myVar2, final my myVar3, final my myVar4, final my myVar5, final my myVar6, final boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, final ky kyVar, final my myVar7, my myVar8, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        my myVar9;
        my myVar10;
        final TextFieldLabelPosition textFieldLabelPosition2;
        my myVar11;
        FloatProducer floatProducer2;
        Composer composer2;
        PaddingValues paddingValues2;
        Object outlinedTextFieldMeasurePolicy;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        boolean z2;
        Object rememberedValue;
        ?? r15;
        int currentCompositeKeyHash;
        Composer m3878constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(753699262);
        if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i8 = i & 384;
        int i9 = Fields.SpotShadowColor;
        if (i8 == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 256 : 128;
        }
        int i10 = i & 3072;
        int i11 = Fields.RotationZ;
        if (i10 == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar5) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar6) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(textFieldLabelPosition) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i12 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (startRestartGroup.changedInstance(myVar7)) {
                i9 = 256;
            }
            i4 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (startRestartGroup.changedInstance(myVar8)) {
                i11 = 2048;
            }
            i4 |= i11;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? Fields.Clip : 8192;
        }
        int i13 = i4;
        if (startRestartGroup.shouldExecute(((i12 & 306783379) == 306783378 && (i13 & 9363) == 9362) ? false : true, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(753699262, i12, i13, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:659)");
            }
            float textFieldHorizontalIconPadding = TextFieldImplKt.textFieldHorizontalIconPadding(startRestartGroup, 0);
            int i14 = i13 & 14;
            boolean changed = ((234881024 & i12) == 67108864) | ((i13 & 112) == 32) | ((1879048192 & i12) == 536870912) | (i14 == 4 || ((i13 & 8) != 0 && startRestartGroup.changed(floatProducer))) | ((i13 & 57344) == 16384) | startRestartGroup.changed(textFieldHorizontalIconPadding);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                i5 = i14;
                i6 = i13;
                i7 = i12;
                composer2 = startRestartGroup;
                paddingValues2 = paddingValues;
                outlinedTextFieldMeasurePolicy = new OutlinedTextFieldMeasurePolicy(kyVar, z, textFieldLabelPosition, floatProducer, paddingValues2, textFieldHorizontalIconPadding, null);
                composer2.updateRememberedValue(outlinedTextFieldMeasurePolicy);
            } else {
                i6 = i13;
                i5 = i14;
                outlinedTextFieldMeasurePolicy = rememberedValue2;
                i7 = i12;
                composer2 = startRestartGroup;
                paddingValues2 = paddingValues;
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = (OutlinedTextFieldMeasurePolicy) outlinedTextFieldMeasurePolicy;
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
            Updater.m3886setimpl(m3878constructorimpl2, outlinedTextFieldMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m3886setimpl(m3878constructorimpl2, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            my setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(setCompositeKeyHash, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier, companion.getSetModifier());
            myVar7.invoke(composer2, Integer.valueOf((i6 >> 6) & 14));
            if (myVar3 != null) {
                composer2.startReplaceGroup(2145628269);
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LeadingId));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, minimumInteractiveComponentSize);
                iy constructor2 = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer2);
                my b = k4.b(companion, m3878constructorimpl3, maybeCachedBoxMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap2);
                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    k4.j(b, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                }
                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                kf0.f(myVar3, composer2, (i7 >> 12) & 14);
            } else {
                composer2.startReplaceGroup(2145874285);
                composer2.endReplaceGroup();
            }
            if (myVar4 != null) {
                composer2.startReplaceGroup(2145917003);
                Modifier minimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TrailingId));
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, minimumInteractiveComponentSize2);
                iy constructor3 = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer2);
                my b2 = k4.b(companion, m3878constructorimpl4, maybeCachedBoxMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap3);
                if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    k4.j(b2, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                }
                Updater.m3886setimpl(m3878constructorimpl4, materializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                kf0.f(myVar4, composer2, (i7 >> 15) & 14);
            } else {
                composer2.startReplaceGroup(2146164941);
                composer2.endReplaceGroup();
            }
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (myVar3 != null) {
                float m7611constructorimpl = Dp.m7611constructorimpl(calculateStartPadding - textFieldHorizontalIconPadding);
                float m7611constructorimpl2 = Dp.m7611constructorimpl(0.0f);
                if (m7611constructorimpl < m7611constructorimpl2) {
                    m7611constructorimpl = m7611constructorimpl2;
                }
                calculateStartPadding = Dp.m7611constructorimpl(m7611constructorimpl);
            }
            float f = calculateStartPadding;
            if (myVar4 != null) {
                float m7611constructorimpl3 = Dp.m7611constructorimpl(calculateEndPadding - textFieldHorizontalIconPadding);
                float m7611constructorimpl4 = Dp.m7611constructorimpl(0.0f);
                if (m7611constructorimpl3 < m7611constructorimpl4) {
                    m7611constructorimpl3 = m7611constructorimpl4;
                }
                calculateEndPadding = Dp.m7611constructorimpl(m7611constructorimpl3);
            }
            float f2 = calculateEndPadding;
            if (myVar5 != null) {
                composer2.startReplaceGroup(2146868920);
                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m795heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), f, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m766paddingqDBjuR0$default);
                iy constructor4 = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer2);
                my b3 = k4.b(companion, m3878constructorimpl5, maybeCachedBoxMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap4);
                if (m3878constructorimpl5.getInserting() || !q10.b(m3878constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    k4.j(b3, currentCompositeKeyHash5, m3878constructorimpl5, currentCompositeKeyHash5);
                }
                Updater.m3886setimpl(m3878constructorimpl5, materializeModifier4, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                kf0.f(myVar5, composer2, (i7 >> 18) & 14);
            } else {
                composer2.startReplaceGroup(2147196621);
                composer2.endReplaceGroup();
            }
            if (myVar6 != null) {
                composer2.startReplaceGroup(2147239866);
                Modifier m766paddingqDBjuR0$default2 = PaddingKt.m766paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m795heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f2, 0.0f, 10, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m766paddingqDBjuR0$default2);
                iy constructor5 = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer2);
                my b4 = k4.b(companion, m3878constructorimpl6, maybeCachedBoxMeasurePolicy4, m3878constructorimpl6, currentCompositionLocalMap5);
                if (m3878constructorimpl6.getInserting() || !q10.b(m3878constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    k4.j(b4, currentCompositeKeyHash6, m3878constructorimpl6, currentCompositeKeyHash6);
                }
                Updater.m3886setimpl(m3878constructorimpl6, materializeModifier5, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                kf0.f(myVar6, composer2, (i7 >> 21) & 14);
            } else {
                composer2.startReplaceGroup(-2147401651);
                composer2.endReplaceGroup();
            }
            Modifier modifier3 = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m795heightInVpY3zN4$default(modifier3, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (myVar5 != null) {
                f = Dp.m7611constructorimpl(0.0f);
            }
            float f3 = f;
            if (myVar6 != null) {
                f2 = Dp.m7611constructorimpl(0.0f);
            }
            Modifier m766paddingqDBjuR0$default3 = PaddingKt.m766paddingqDBjuR0$default(wrapContentHeight$default, f3, 0.0f, f2, 0.0f, 10, null);
            if (nyVar != null) {
                composer2.startReplaceGroup(-2147031666);
                nyVar.invoke(LayoutIdKt.layoutId(modifier3, TextFieldImplKt.PlaceholderId).then(m766paddingqDBjuR0$default3), composer2, Integer.valueOf((i7 >> 3) & 112));
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-2146940371);
                composer2.endReplaceGroup();
            }
            Modifier then = LayoutIdKt.layoutId(modifier3, TextFieldImplKt.TextFieldId).then(m766paddingqDBjuR0$default3);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), true);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, then);
            iy constructor6 = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer2);
            my b5 = k4.b(companion, m3878constructorimpl7, maybeCachedBoxMeasurePolicy5, m3878constructorimpl7, currentCompositionLocalMap6);
            if (m3878constructorimpl7.getInserting() || !q10.b(m3878constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                k4.j(b5, currentCompositeKeyHash7, m3878constructorimpl7, currentCompositeKeyHash7);
            }
            Updater.m3886setimpl(m3878constructorimpl7, materializeModifier6, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            myVar9 = myVar;
            myVar9.invoke(composer2, Integer.valueOf((i7 >> 3) & 14));
            composer2.endNode();
            textFieldLabelPosition2 = textFieldLabelPosition;
            if (textFieldLabelPosition2 instanceof TextFieldLabelPosition.Above) {
                modifier3 = PaddingKt.m766paddingqDBjuR0$default(modifier3, TextFieldImplKt.getAboveLabelHorizontalPadding(), 0.0f, TextFieldImplKt.getAboveLabelHorizontalPadding(), TextFieldImplKt.getAboveLabelBottomPadding(), 2, null);
                modifier2 = modifier3;
            } else {
                modifier2 = modifier3;
            }
            if (myVar2 != null) {
                composer2.startReplaceGroup(-2146287790);
                if (i5 != 4) {
                    floatProducer2 = floatProducer;
                    if ((i6 & 8) == 0 || !composer2.changedInstance(floatProducer2)) {
                        z2 = false;
                        rememberedValue = composer2.rememberedValue();
                        if (!z2 || rememberedValue == Composer.Companion.getEmpty()) {
                            r15 = 0;
                            rememberedValue = new ge0(floatProducer2, 0 == true ? 1 : 0);
                            composer2.updateRememberedValue(rememberedValue);
                        } else {
                            r15 = 0;
                        }
                        Modifier then2 = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(TextFieldImplKt.textFieldLabelMinHeight(modifier2, (iy) rememberedValue), null, r15, 3, null), TextFieldImplKt.LabelId).then(modifier3);
                        MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r15);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, r15);
                        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, then2);
                        iy constructor7 = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor7);
                        }
                        m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                        my b6 = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy6, m3878constructorimpl, currentCompositionLocalMap7);
                        if (!m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b6, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier7, companion.getSetModifier());
                        myVar10 = myVar2;
                        kf0.f(myVar10, composer2, (i7 >> 9) & 14);
                    }
                } else {
                    floatProducer2 = floatProducer;
                }
                z2 = true;
                rememberedValue = composer2.rememberedValue();
                if (z2) {
                }
                r15 = 0;
                rememberedValue = new ge0(floatProducer2, 0 == true ? 1 : 0);
                composer2.updateRememberedValue(rememberedValue);
                Modifier then22 = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(TextFieldImplKt.textFieldLabelMinHeight(modifier2, (iy) rememberedValue), null, r15, 3, null), TextFieldImplKt.LabelId).then(modifier3);
                MeasurePolicy maybeCachedBoxMeasurePolicy62 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r15);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, r15);
                CompositionLocalMap currentCompositionLocalMap72 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(composer2, then22);
                iy constructor72 = companion.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                my b62 = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy62, m3878constructorimpl, currentCompositionLocalMap72);
                if (!m3878constructorimpl.getInserting()) {
                }
                k4.j(b62, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier72, companion.getSetModifier());
                myVar10 = myVar2;
                kf0.f(myVar10, composer2, (i7 >> 9) & 14);
            } else {
                myVar10 = myVar2;
                floatProducer2 = floatProducer;
                composer2.startReplaceGroup(-2145892819);
                composer2.endReplaceGroup();
            }
            if (myVar8 != null) {
                composer2.startReplaceGroup(-2145844304);
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m795heightInVpY3zN4$default(LayoutIdKt.layoutId(modifier2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2583supportingTextPaddinga9UjIt4$material3$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, padding);
                iy constructor8 = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer2);
                my b7 = k4.b(companion, m3878constructorimpl8, maybeCachedBoxMeasurePolicy7, m3878constructorimpl8, currentCompositionLocalMap8);
                if (m3878constructorimpl8.getInserting() || !q10.b(m3878constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    k4.j(b7, currentCompositeKeyHash8, m3878constructorimpl8, currentCompositeKeyHash8);
                }
                Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, companion.getSetModifier());
                myVar11 = myVar8;
                kf0.f(myVar11, composer2, (i6 >> 9) & 14);
            } else {
                myVar11 = myVar8;
                composer2.startReplaceGroup(-2145508915);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            myVar9 = myVar;
            myVar10 = myVar2;
            textFieldLabelPosition2 = textFieldLabelPosition;
            myVar11 = myVar8;
            floatProducer2 = floatProducer;
            composer2 = startRestartGroup;
            paddingValues2 = paddingValues;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final my myVar12 = myVar10;
            final my myVar13 = myVar9;
            final FloatProducer floatProducer3 = floatProducer2;
            final PaddingValues paddingValues3 = paddingValues2;
            final my myVar14 = myVar11;
            endRestartGroup.updateScope(new my() { // from class: he0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 OutlinedTextFieldLayout$lambda$20;
                    int intValue = ((Integer) obj2).intValue();
                    OutlinedTextFieldLayout$lambda$20 = OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$20(Modifier.this, myVar13, nyVar, myVar12, myVar3, myVar4, myVar5, myVar6, z, textFieldLabelPosition2, floatProducer3, kyVar, myVar7, myVar14, paddingValues3, i, i2, (Composer) obj, intValue);
                    return OutlinedTextFieldLayout$lambda$20;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15(FloatProducer floatProducer) {
        return Dp.m7609boximpl(DpKt.m7654lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), floatProducer.invoke()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedTextFieldLayout$lambda$20(Modifier modifier, my myVar, ny nyVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, ky kyVar, my myVar7, my myVar8, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        OutlinedTextFieldLayout(modifier, myVar, nyVar, myVar2, myVar3, myVar4, myVar5, myVar6, z, textFieldLabelPosition, floatProducer, kyVar, myVar7, myVar8, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    public static final Modifier outlineCutout(Modifier modifier, iy iyVar, Alignment.Horizontal horizontal, PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new defpackage.f1(iyVar, (Object) paddingValues, (Object) horizontal, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 outlineCutout$lambda$22(iy iyVar, PaddingValues paddingValues, Alignment.Horizontal horizontal, ContentDrawScope contentDrawScope) {
        long m4590unboximpl = ((Size) iyVar.invoke()).m4590unboximpl();
        float intBitsToFloat = Float.intBitsToFloat((int) (m4590unboximpl >> 32));
        if (intBitsToFloat > 0.0f) {
            float mo367toPx0680j_4 = contentDrawScope.mo367toPx0680j_4(OutlinedTextFieldInnerPadding);
            float align = horizontal.align(y80.P(intBitsToFloat), y80.P((Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32)) - r8) - contentDrawScope.mo367toPx0680j_4(paddingValues.mo713calculateRightPaddingu2uoSUM(contentDrawScope.getLayoutDirection()))), contentDrawScope.getLayoutDirection()) + contentDrawScope.mo367toPx0680j_4(paddingValues.mo712calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection()));
            float f = intBitsToFloat / 2.0f;
            float f2 = align + f;
            float f3 = (f2 - f) - mo367toPx0680j_4;
            float f4 = f3 < 0.0f ? 0.0f : f3;
            float f5 = f2 + f + mo367toPx0680j_4;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() >> 32));
            float f6 = f5 > intBitsToFloat2 ? intBitsToFloat2 : f5;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (m4590unboximpl & 4294967295L));
            float f7 = (-intBitsToFloat3) / 2.0f;
            float f8 = intBitsToFloat3 / 2.0f;
            int m4749getDifferencertfAjoo = ClipOp.Companion.m4749getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5259clipRectN_I0leg(f4, f7, f6, f8, m4749getDifferencertfAjoo);
                contentDrawScope.drawContent();
            } finally {
                kf0.g(drawContext, mo5256getSizeNHjbRc);
            }
        } else {
            contentDrawScope.drawContent();
        }
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
        String str2;
        int i7;
        ky kyVar2;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        my myVar8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        my myVar9;
        my myVar10;
        boolean z7;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i33;
        int i34;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        TextFieldColors textFieldColors2;
        Composer composer2;
        Modifier modifier3;
        boolean z9;
        boolean z10;
        TextStyle textStyle3;
        my myVar11;
        my myVar12;
        my myVar13;
        my myVar14;
        my myVar15;
        ScopeUpdateScope endRestartGroup;
        int i35;
        Shape shape3;
        my myVar16;
        my myVar17;
        TextStyle textStyle4;
        my myVar18;
        my myVar19;
        my myVar20;
        boolean z11;
        int i36;
        my myVar21;
        my myVar22;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z12;
        int i37;
        TextFieldColors textFieldColors3;
        int i38;
        VisualTransformation visualTransformation3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        int i39;
        Composer startRestartGroup = composer.startRestartGroup(1901501544);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i3 & 6) == 0) {
                i7 = (startRestartGroup.changed(str2) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i3 & 48) == 0) {
                i7 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i40 = i6 & 4;
        if (i40 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i8 = i6 & 8;
            int i41 = Fields.RotationZ;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z5 = z;
                i7 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z6 = z2;
                    i7 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    if ((i3 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        myVar8 = myVar;
                    } else {
                        myVar8 = myVar;
                        if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & Fields.SpotShadowColor;
                    int i42 = GroupFlagsKt.IsNodeFlag;
                    if (i11 == 0) {
                        i7 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i7 |= startRestartGroup.changedInstance(myVar2) ? 8388608 : 4194304;
                    }
                    i12 = i6 & Fields.RotationX;
                    int i43 = GroupFlagsKt.HasAuxSlotFlag;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i7 |= startRestartGroup.changedInstance(myVar3) ? 67108864 : 33554432;
                        i14 = i6 & Fields.RotationY;
                        int i44 = GroupFlagsKt.IsMovableContentFlag;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i15 = i14;
                            i7 |= startRestartGroup.changedInstance(myVar4) ? 536870912 : 268435456;
                            i16 = i6 & Fields.RotationZ;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (startRestartGroup.changedInstance(myVar5) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            i19 = i6 & Fields.CameraDistance;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i4 & 48) == 0) {
                                i20 = i19;
                                i18 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i45 = i18;
                            i21 = i6 & Fields.TransformOrigin;
                            if (i21 == 0) {
                                i22 = i45 | 384;
                            } else {
                                int i46 = i45;
                                if ((i4 & 384) == 0) {
                                    i46 |= startRestartGroup.changedInstance(myVar7) ? Fields.RotationX : Fields.SpotShadowColor;
                                }
                                i22 = i46;
                            }
                            i23 = i6 & 8192;
                            if (i23 == 0) {
                                i24 = i22 | 3072;
                            } else {
                                int i47 = i22;
                                if ((i4 & 3072) == 0) {
                                    if (startRestartGroup.changed(z3)) {
                                        i41 = 2048;
                                    }
                                    i24 = i47 | i41;
                                } else {
                                    i24 = i47;
                                }
                            }
                            i25 = i6 & Fields.Clip;
                            if (i25 == 0) {
                                i26 = i24 | 24576;
                            } else {
                                i26 = i24;
                                if ((i4 & 24576) == 0) {
                                    i26 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                    i27 = i6 & Fields.CompositingStrategy;
                                    if (i27 != 0) {
                                        i26 |= 196608;
                                    } else if ((i4 & 196608) == 0) {
                                        i26 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                    }
                                    i28 = i6 & 65536;
                                    if (i28 != 0) {
                                        i26 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i26 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                    }
                                    i29 = i6 & Fields.RenderEffect;
                                    if (i29 != 0) {
                                        i26 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        if (!startRestartGroup.changed(z4)) {
                                            i42 = 4194304;
                                        }
                                        i26 |= i42;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        if ((i6 & Fields.ColorFilter) == 0 && startRestartGroup.changed(i)) {
                                            i43 = 67108864;
                                        }
                                        i26 |= i43;
                                    }
                                    i30 = i6 & Fields.BlendMode;
                                    if (i30 != 0) {
                                        i26 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        if (startRestartGroup.changed(i2)) {
                                            i44 = 536870912;
                                        }
                                        i26 |= i44;
                                    }
                                    i31 = i6 & 1048576;
                                    if (i31 != 0) {
                                        i32 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i32 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                    } else {
                                        i32 = i5;
                                    }
                                    if ((i5 & 48) == 0) {
                                        i32 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i5 & 384) == 0) {
                                        if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                            i39 = Fields.RotationX;
                                            i32 |= i39;
                                        }
                                        i39 = Fields.SpotShadowColor;
                                        i32 |= i39;
                                    }
                                    if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            if ((i6 & Fields.ColorFilter) != 0) {
                                                i26 &= -234881025;
                                            }
                                            myVar16 = myVar2;
                                            myVar17 = myVar3;
                                            myVar19 = myVar4;
                                            myVar20 = myVar5;
                                            myVar21 = myVar6;
                                            myVar22 = myVar7;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions3 = keyboardActions;
                                            z12 = z4;
                                            i37 = i;
                                            i38 = i2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors3 = textFieldColors;
                                            z13 = z6;
                                            textStyle4 = textStyle2;
                                            myVar18 = myVar8;
                                            i36 = i26;
                                            z11 = z3;
                                        } else {
                                            if (i40 != 0) {
                                                modifier2 = Modifier.Companion;
                                            }
                                            if (i8 != 0) {
                                                z5 = true;
                                            }
                                            if (i9 != 0) {
                                                z6 = false;
                                            }
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                                textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                            }
                                            if (i10 != 0) {
                                                myVar8 = null;
                                            }
                                            my myVar23 = i11 != 0 ? null : myVar2;
                                            my myVar24 = i13 != 0 ? null : myVar3;
                                            my myVar25 = i15 != 0 ? null : myVar4;
                                            my myVar26 = i17 != 0 ? null : myVar5;
                                            my myVar27 = i20 != 0 ? null : myVar6;
                                            my myVar28 = i21 != 0 ? null : myVar7;
                                            boolean z14 = i23 != 0 ? false : z3;
                                            VisualTransformation none = i25 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i27 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i28 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                            boolean z15 = i29 != 0 ? false : z4;
                                            if ((i6 & Fields.ColorFilter) != 0) {
                                                i35 = z15 ? 1 : Integer.MAX_VALUE;
                                                i26 &= -234881025;
                                            } else {
                                                i35 = i;
                                            }
                                            int i48 = i30 != 0 ? 1 : i2;
                                            MutableInteractionSource mutableInteractionSource5 = i31 == 0 ? mutableInteractionSource : null;
                                            Shape shape4 = (i6 & 2097152) != 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            if ((i6 & 4194304) != 0) {
                                                shape3 = shape4;
                                                myVar16 = myVar23;
                                                myVar17 = myVar24;
                                                myVar19 = myVar25;
                                                myVar20 = myVar26;
                                                i36 = i26;
                                                myVar21 = myVar27;
                                                myVar22 = myVar28;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z15;
                                                i37 = i35;
                                                textFieldColors3 = OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                i38 = i48;
                                                visualTransformation3 = none;
                                                textStyle4 = textStyle2;
                                                myVar18 = myVar8;
                                                z11 = z14;
                                                mutableInteractionSource3 = mutableInteractionSource5;
                                                z13 = z6;
                                            } else {
                                                shape3 = shape4;
                                                myVar16 = myVar23;
                                                myVar17 = myVar24;
                                                textStyle4 = textStyle2;
                                                myVar18 = myVar8;
                                                myVar19 = myVar25;
                                                myVar20 = myVar26;
                                                z11 = z14;
                                                i36 = i26;
                                                myVar21 = myVar27;
                                                myVar22 = myVar28;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z15;
                                                i37 = i35;
                                                textFieldColors3 = textFieldColors;
                                                i38 = i48;
                                                visualTransformation3 = none;
                                                z13 = z6;
                                                mutableInteractionSource3 = mutableInteractionSource5;
                                            }
                                        }
                                        Modifier modifier4 = modifier2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1901501544, i7, i36, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:393)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(1310051731);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                        } else {
                                            startRestartGroup.startReplaceGroup(1981921732);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(1981927842);
                                        long m7090getColor0d7_KjU = textStyle4.m7090getColor0d7_KjU();
                                        if (m7090getColor0d7_KjU == 16) {
                                            m7090getColor0d7_KjU = textFieldColors3.m2574textColorXeAY9LY$material3(z5, z11, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        long j = m7090getColor0d7_KjU;
                                        startRestartGroup.endReplaceGroup();
                                        boolean z16 = z5;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1874034984, true, new OutlinedTextFieldKt$OutlinedTextField$3(modifier4, myVar18, z11, textFieldColors3, str2, kyVar2, z16, z13, textStyle4.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null)), keyboardOptions3, keyboardActions3, z12, i37, i38, visualTransformation3, mutableInteractionSource4, myVar16, myVar17, myVar19, myVar20, myVar21, myVar22, shape3), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        myVar11 = myVar18;
                                        z7 = z11;
                                        z9 = z16;
                                        z10 = z13;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        z8 = z12;
                                        i33 = i37;
                                        i34 = i38;
                                        visualTransformation2 = visualTransformation3;
                                        myVar12 = myVar16;
                                        myVar9 = myVar17;
                                        myVar13 = myVar19;
                                        myVar14 = myVar20;
                                        myVar15 = myVar21;
                                        shape2 = shape3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors3;
                                        myVar10 = myVar22;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        myVar9 = myVar3;
                                        myVar10 = myVar7;
                                        z7 = z3;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z8 = z4;
                                        i33 = i;
                                        i34 = i2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier2;
                                        z9 = z5;
                                        z10 = z6;
                                        textStyle3 = textStyle2;
                                        myVar11 = myVar8;
                                        myVar12 = myVar2;
                                        myVar13 = myVar4;
                                        myVar14 = myVar5;
                                        myVar15 = myVar6;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new ee0(str, kyVar, modifier3, z9, z10, textStyle3, myVar11, myVar12, myVar9, myVar13, myVar14, myVar15, myVar10, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i33, i34, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, i6, 0));
                                        return;
                                    }
                                    return;
                                }
                            }
                            i27 = i6 & Fields.CompositingStrategy;
                            if (i27 != 0) {
                            }
                            i28 = i6 & 65536;
                            if (i28 != 0) {
                            }
                            i29 = i6 & Fields.RenderEffect;
                            if (i29 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i30 = i6 & Fields.BlendMode;
                            if (i30 != 0) {
                            }
                            i31 = i6 & 1048576;
                            if (i31 != 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & Fields.RotationZ;
                        if (i16 == 0) {
                        }
                        i19 = i6 & Fields.CameraDistance;
                        if (i19 == 0) {
                        }
                        int i452 = i18;
                        i21 = i6 & Fields.TransformOrigin;
                        if (i21 == 0) {
                        }
                        i23 = i6 & 8192;
                        if (i23 == 0) {
                        }
                        i25 = i6 & Fields.Clip;
                        if (i25 == 0) {
                        }
                        i27 = i6 & Fields.CompositingStrategy;
                        if (i27 != 0) {
                        }
                        i28 = i6 & 65536;
                        if (i28 != 0) {
                        }
                        i29 = i6 & Fields.RenderEffect;
                        if (i29 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i30 = i6 & Fields.BlendMode;
                        if (i30 != 0) {
                        }
                        i31 = i6 & 1048576;
                        if (i31 != 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & Fields.RotationY;
                    int i442 = GroupFlagsKt.IsMovableContentFlag;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & Fields.RotationZ;
                    if (i16 == 0) {
                    }
                    i19 = i6 & Fields.CameraDistance;
                    if (i19 == 0) {
                    }
                    int i4522 = i18;
                    i21 = i6 & Fields.TransformOrigin;
                    if (i21 == 0) {
                    }
                    i23 = i6 & 8192;
                    if (i23 == 0) {
                    }
                    i25 = i6 & Fields.Clip;
                    if (i25 == 0) {
                    }
                    i27 = i6 & Fields.CompositingStrategy;
                    if (i27 != 0) {
                    }
                    i28 = i6 & 65536;
                    if (i28 != 0) {
                    }
                    i29 = i6 & Fields.RenderEffect;
                    if (i29 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i30 = i6 & Fields.BlendMode;
                    if (i30 != 0) {
                    }
                    i31 = i6 & 1048576;
                    if (i31 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & 196608) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & Fields.SpotShadowColor;
                int i422 = GroupFlagsKt.IsNodeFlag;
                if (i11 == 0) {
                }
                i12 = i6 & Fields.RotationX;
                int i432 = GroupFlagsKt.HasAuxSlotFlag;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & Fields.RotationY;
                int i4422 = GroupFlagsKt.IsMovableContentFlag;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & Fields.RotationZ;
                if (i16 == 0) {
                }
                i19 = i6 & Fields.CameraDistance;
                if (i19 == 0) {
                }
                int i45222 = i18;
                i21 = i6 & Fields.TransformOrigin;
                if (i21 == 0) {
                }
                i23 = i6 & 8192;
                if (i23 == 0) {
                }
                i25 = i6 & Fields.Clip;
                if (i25 == 0) {
                }
                i27 = i6 & Fields.CompositingStrategy;
                if (i27 != 0) {
                }
                i28 = i6 & 65536;
                if (i28 != 0) {
                }
                i29 = i6 & Fields.RenderEffect;
                if (i29 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i30 = i6 & Fields.BlendMode;
                if (i30 != 0) {
                }
                i31 = i6 & 1048576;
                if (i31 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & 196608) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & Fields.SpotShadowColor;
            int i4222 = GroupFlagsKt.IsNodeFlag;
            if (i11 == 0) {
            }
            i12 = i6 & Fields.RotationX;
            int i4322 = GroupFlagsKt.HasAuxSlotFlag;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & Fields.RotationY;
            int i44222 = GroupFlagsKt.IsMovableContentFlag;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & Fields.RotationZ;
            if (i16 == 0) {
            }
            i19 = i6 & Fields.CameraDistance;
            if (i19 == 0) {
            }
            int i452222 = i18;
            i21 = i6 & Fields.TransformOrigin;
            if (i21 == 0) {
            }
            i23 = i6 & 8192;
            if (i23 == 0) {
            }
            i25 = i6 & Fields.Clip;
            if (i25 == 0) {
            }
            i27 = i6 & Fields.CompositingStrategy;
            if (i27 != 0) {
            }
            i28 = i6 & 65536;
            if (i28 != 0) {
            }
            i29 = i6 & Fields.RenderEffect;
            if (i29 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i30 = i6 & Fields.BlendMode;
            if (i30 != 0) {
            }
            i31 = i6 & 1048576;
            if (i31 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        int i412 = Fields.RotationZ;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & 196608) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & Fields.SpotShadowColor;
        int i42222 = GroupFlagsKt.IsNodeFlag;
        if (i11 == 0) {
        }
        i12 = i6 & Fields.RotationX;
        int i43222 = GroupFlagsKt.HasAuxSlotFlag;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & Fields.RotationY;
        int i442222 = GroupFlagsKt.IsMovableContentFlag;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & Fields.RotationZ;
        if (i16 == 0) {
        }
        i19 = i6 & Fields.CameraDistance;
        if (i19 == 0) {
        }
        int i4522222 = i18;
        i21 = i6 & Fields.TransformOrigin;
        if (i21 == 0) {
        }
        i23 = i6 & 8192;
        if (i23 == 0) {
        }
        i25 = i6 & Fields.Clip;
        if (i25 == 0) {
        }
        i27 = i6 & Fields.CompositingStrategy;
        if (i27 != 0) {
        }
        i28 = i6 & 65536;
        if (i28 != 0) {
        }
        i29 = i6 & Fields.RenderEffect;
        if (i29 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i30 = i6 & Fields.BlendMode;
        if (i30 != 0) {
        }
        i31 = i6 & 1048576;
        if (i31 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
        TextFieldValue textFieldValue2;
        int i7;
        ky kyVar2;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        my myVar8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        my myVar9;
        my myVar10;
        boolean z7;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i33;
        int i34;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        TextFieldColors textFieldColors2;
        Composer composer2;
        Modifier modifier3;
        boolean z9;
        boolean z10;
        TextStyle textStyle3;
        my myVar11;
        my myVar12;
        my myVar13;
        my myVar14;
        my myVar15;
        ScopeUpdateScope endRestartGroup;
        int i35;
        Shape shape3;
        my myVar16;
        my myVar17;
        TextStyle textStyle4;
        my myVar18;
        my myVar19;
        my myVar20;
        boolean z11;
        int i36;
        my myVar21;
        my myVar22;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z12;
        int i37;
        TextFieldColors textFieldColors3;
        int i38;
        VisualTransformation visualTransformation3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        int i39;
        Composer startRestartGroup = composer.startRestartGroup(2057288437);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
            textFieldValue2 = textFieldValue;
        } else {
            textFieldValue2 = textFieldValue;
            if ((i3 & 6) == 0) {
                i7 = (startRestartGroup.changed(textFieldValue2) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i3 & 48) == 0) {
                i7 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i40 = i6 & 4;
        if (i40 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i8 = i6 & 8;
            int i41 = Fields.RotationZ;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z5 = z;
                i7 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z6 = z2;
                    i7 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    if ((i3 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        myVar8 = myVar;
                    } else {
                        myVar8 = myVar;
                        if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & Fields.SpotShadowColor;
                    int i42 = GroupFlagsKt.IsNodeFlag;
                    if (i11 == 0) {
                        i7 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i7 |= startRestartGroup.changedInstance(myVar2) ? 8388608 : 4194304;
                    }
                    i12 = i6 & Fields.RotationX;
                    int i43 = GroupFlagsKt.HasAuxSlotFlag;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i7 |= startRestartGroup.changedInstance(myVar3) ? 67108864 : 33554432;
                        i14 = i6 & Fields.RotationY;
                        int i44 = GroupFlagsKt.IsMovableContentFlag;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i15 = i14;
                            i7 |= startRestartGroup.changedInstance(myVar4) ? 536870912 : 268435456;
                            i16 = i6 & Fields.RotationZ;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (startRestartGroup.changedInstance(myVar5) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            i19 = i6 & Fields.CameraDistance;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i4 & 48) == 0) {
                                i20 = i19;
                                i18 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i45 = i18;
                            i21 = i6 & Fields.TransformOrigin;
                            if (i21 == 0) {
                                i22 = i45 | 384;
                            } else {
                                int i46 = i45;
                                if ((i4 & 384) == 0) {
                                    i46 |= startRestartGroup.changedInstance(myVar7) ? Fields.RotationX : Fields.SpotShadowColor;
                                }
                                i22 = i46;
                            }
                            i23 = i6 & 8192;
                            if (i23 == 0) {
                                i24 = i22 | 3072;
                            } else {
                                int i47 = i22;
                                if ((i4 & 3072) == 0) {
                                    if (startRestartGroup.changed(z3)) {
                                        i41 = 2048;
                                    }
                                    i24 = i47 | i41;
                                } else {
                                    i24 = i47;
                                }
                            }
                            i25 = i6 & Fields.Clip;
                            if (i25 == 0) {
                                i26 = i24 | 24576;
                            } else {
                                i26 = i24;
                                if ((i4 & 24576) == 0) {
                                    i26 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                    i27 = i6 & Fields.CompositingStrategy;
                                    if (i27 != 0) {
                                        i26 |= 196608;
                                    } else if ((i4 & 196608) == 0) {
                                        i26 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                    }
                                    i28 = i6 & 65536;
                                    if (i28 != 0) {
                                        i26 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i26 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                    }
                                    i29 = i6 & Fields.RenderEffect;
                                    if (i29 != 0) {
                                        i26 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        if (!startRestartGroup.changed(z4)) {
                                            i42 = 4194304;
                                        }
                                        i26 |= i42;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        if ((i6 & Fields.ColorFilter) == 0 && startRestartGroup.changed(i)) {
                                            i43 = 67108864;
                                        }
                                        i26 |= i43;
                                    }
                                    i30 = i6 & Fields.BlendMode;
                                    if (i30 != 0) {
                                        i26 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        if (startRestartGroup.changed(i2)) {
                                            i44 = 536870912;
                                        }
                                        i26 |= i44;
                                    }
                                    i31 = i6 & 1048576;
                                    if (i31 != 0) {
                                        i32 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i32 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                    } else {
                                        i32 = i5;
                                    }
                                    if ((i5 & 48) == 0) {
                                        i32 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i5 & 384) == 0) {
                                        if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                            i39 = Fields.RotationX;
                                            i32 |= i39;
                                        }
                                        i39 = Fields.SpotShadowColor;
                                        i32 |= i39;
                                    }
                                    if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            if ((i6 & Fields.ColorFilter) != 0) {
                                                i26 &= -234881025;
                                            }
                                            myVar16 = myVar2;
                                            myVar17 = myVar3;
                                            myVar19 = myVar4;
                                            myVar20 = myVar5;
                                            myVar21 = myVar6;
                                            myVar22 = myVar7;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions3 = keyboardActions;
                                            z12 = z4;
                                            i37 = i;
                                            i38 = i2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors3 = textFieldColors;
                                            z13 = z6;
                                            textStyle4 = textStyle2;
                                            myVar18 = myVar8;
                                            i36 = i26;
                                            z11 = z3;
                                        } else {
                                            if (i40 != 0) {
                                                modifier2 = Modifier.Companion;
                                            }
                                            if (i8 != 0) {
                                                z5 = true;
                                            }
                                            if (i9 != 0) {
                                                z6 = false;
                                            }
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                                textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                            }
                                            if (i10 != 0) {
                                                myVar8 = null;
                                            }
                                            my myVar23 = i11 != 0 ? null : myVar2;
                                            my myVar24 = i13 != 0 ? null : myVar3;
                                            my myVar25 = i15 != 0 ? null : myVar4;
                                            my myVar26 = i17 != 0 ? null : myVar5;
                                            my myVar27 = i20 != 0 ? null : myVar6;
                                            my myVar28 = i21 != 0 ? null : myVar7;
                                            boolean z14 = i23 != 0 ? false : z3;
                                            VisualTransformation none = i25 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i27 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i28 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                            boolean z15 = i29 != 0 ? false : z4;
                                            if ((i6 & Fields.ColorFilter) != 0) {
                                                i35 = z15 ? 1 : Integer.MAX_VALUE;
                                                i26 &= -234881025;
                                            } else {
                                                i35 = i;
                                            }
                                            int i48 = i30 != 0 ? 1 : i2;
                                            MutableInteractionSource mutableInteractionSource5 = i31 == 0 ? mutableInteractionSource : null;
                                            Shape shape4 = (i6 & 2097152) != 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            if ((i6 & 4194304) != 0) {
                                                shape3 = shape4;
                                                myVar16 = myVar23;
                                                myVar17 = myVar24;
                                                myVar19 = myVar25;
                                                myVar20 = myVar26;
                                                i36 = i26;
                                                myVar21 = myVar27;
                                                myVar22 = myVar28;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z15;
                                                i37 = i35;
                                                textFieldColors3 = OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                i38 = i48;
                                                visualTransformation3 = none;
                                                textStyle4 = textStyle2;
                                                myVar18 = myVar8;
                                                z11 = z14;
                                                mutableInteractionSource3 = mutableInteractionSource5;
                                                z13 = z6;
                                            } else {
                                                shape3 = shape4;
                                                myVar16 = myVar23;
                                                myVar17 = myVar24;
                                                textStyle4 = textStyle2;
                                                myVar18 = myVar8;
                                                myVar19 = myVar25;
                                                myVar20 = myVar26;
                                                z11 = z14;
                                                i36 = i26;
                                                myVar21 = myVar27;
                                                myVar22 = myVar28;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z15;
                                                i37 = i35;
                                                textFieldColors3 = textFieldColors;
                                                i38 = i48;
                                                visualTransformation3 = none;
                                                z13 = z6;
                                                mutableInteractionSource3 = mutableInteractionSource5;
                                            }
                                        }
                                        Modifier modifier4 = modifier2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2057288437, i7, i36, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:560)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(-502250010);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                        } else {
                                            startRestartGroup.startReplaceGroup(1369271057);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(1369277167);
                                        long m7090getColor0d7_KjU = textStyle4.m7090getColor0d7_KjU();
                                        if (m7090getColor0d7_KjU == 16) {
                                            m7090getColor0d7_KjU = textFieldColors3.m2574textColorXeAY9LY$material3(z5, z11, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        long j = m7090getColor0d7_KjU;
                                        startRestartGroup.endReplaceGroup();
                                        boolean z16 = z5;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-2094276683, true, new OutlinedTextFieldKt$OutlinedTextField$5(modifier4, myVar18, z11, textFieldColors3, textFieldValue2, kyVar2, z16, z13, textStyle4.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null)), keyboardOptions3, keyboardActions3, z12, i37, i38, visualTransformation3, mutableInteractionSource4, myVar16, myVar17, myVar19, myVar20, myVar21, myVar22, shape3), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        myVar11 = myVar18;
                                        z7 = z11;
                                        z9 = z16;
                                        z10 = z13;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        z8 = z12;
                                        i33 = i37;
                                        i34 = i38;
                                        visualTransformation2 = visualTransformation3;
                                        myVar12 = myVar16;
                                        myVar9 = myVar17;
                                        myVar13 = myVar19;
                                        myVar14 = myVar20;
                                        myVar15 = myVar21;
                                        shape2 = shape3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors3;
                                        myVar10 = myVar22;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        myVar9 = myVar3;
                                        myVar10 = myVar7;
                                        z7 = z3;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z8 = z4;
                                        i33 = i;
                                        i34 = i2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier2;
                                        z9 = z5;
                                        z10 = z6;
                                        textStyle3 = textStyle2;
                                        myVar11 = myVar8;
                                        myVar12 = myVar2;
                                        myVar13 = myVar4;
                                        myVar14 = myVar5;
                                        myVar15 = myVar6;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new de0(textFieldValue, kyVar, modifier3, z9, z10, textStyle3, myVar11, myVar12, myVar9, myVar13, myVar14, myVar15, myVar10, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i33, i34, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, i6, 0));
                                        return;
                                    }
                                    return;
                                }
                            }
                            i27 = i6 & Fields.CompositingStrategy;
                            if (i27 != 0) {
                            }
                            i28 = i6 & 65536;
                            if (i28 != 0) {
                            }
                            i29 = i6 & Fields.RenderEffect;
                            if (i29 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i30 = i6 & Fields.BlendMode;
                            if (i30 != 0) {
                            }
                            i31 = i6 & 1048576;
                            if (i31 != 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & Fields.RotationZ;
                        if (i16 == 0) {
                        }
                        i19 = i6 & Fields.CameraDistance;
                        if (i19 == 0) {
                        }
                        int i452 = i18;
                        i21 = i6 & Fields.TransformOrigin;
                        if (i21 == 0) {
                        }
                        i23 = i6 & 8192;
                        if (i23 == 0) {
                        }
                        i25 = i6 & Fields.Clip;
                        if (i25 == 0) {
                        }
                        i27 = i6 & Fields.CompositingStrategy;
                        if (i27 != 0) {
                        }
                        i28 = i6 & 65536;
                        if (i28 != 0) {
                        }
                        i29 = i6 & Fields.RenderEffect;
                        if (i29 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i30 = i6 & Fields.BlendMode;
                        if (i30 != 0) {
                        }
                        i31 = i6 & 1048576;
                        if (i31 != 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & Fields.RotationY;
                    int i442 = GroupFlagsKt.IsMovableContentFlag;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & Fields.RotationZ;
                    if (i16 == 0) {
                    }
                    i19 = i6 & Fields.CameraDistance;
                    if (i19 == 0) {
                    }
                    int i4522 = i18;
                    i21 = i6 & Fields.TransformOrigin;
                    if (i21 == 0) {
                    }
                    i23 = i6 & 8192;
                    if (i23 == 0) {
                    }
                    i25 = i6 & Fields.Clip;
                    if (i25 == 0) {
                    }
                    i27 = i6 & Fields.CompositingStrategy;
                    if (i27 != 0) {
                    }
                    i28 = i6 & 65536;
                    if (i28 != 0) {
                    }
                    i29 = i6 & Fields.RenderEffect;
                    if (i29 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i30 = i6 & Fields.BlendMode;
                    if (i30 != 0) {
                    }
                    i31 = i6 & 1048576;
                    if (i31 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & 196608) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & Fields.SpotShadowColor;
                int i422 = GroupFlagsKt.IsNodeFlag;
                if (i11 == 0) {
                }
                i12 = i6 & Fields.RotationX;
                int i432 = GroupFlagsKt.HasAuxSlotFlag;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & Fields.RotationY;
                int i4422 = GroupFlagsKt.IsMovableContentFlag;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & Fields.RotationZ;
                if (i16 == 0) {
                }
                i19 = i6 & Fields.CameraDistance;
                if (i19 == 0) {
                }
                int i45222 = i18;
                i21 = i6 & Fields.TransformOrigin;
                if (i21 == 0) {
                }
                i23 = i6 & 8192;
                if (i23 == 0) {
                }
                i25 = i6 & Fields.Clip;
                if (i25 == 0) {
                }
                i27 = i6 & Fields.CompositingStrategy;
                if (i27 != 0) {
                }
                i28 = i6 & 65536;
                if (i28 != 0) {
                }
                i29 = i6 & Fields.RenderEffect;
                if (i29 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i30 = i6 & Fields.BlendMode;
                if (i30 != 0) {
                }
                i31 = i6 & 1048576;
                if (i31 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & 196608) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & Fields.SpotShadowColor;
            int i4222 = GroupFlagsKt.IsNodeFlag;
            if (i11 == 0) {
            }
            i12 = i6 & Fields.RotationX;
            int i4322 = GroupFlagsKt.HasAuxSlotFlag;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & Fields.RotationY;
            int i44222 = GroupFlagsKt.IsMovableContentFlag;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & Fields.RotationZ;
            if (i16 == 0) {
            }
            i19 = i6 & Fields.CameraDistance;
            if (i19 == 0) {
            }
            int i452222 = i18;
            i21 = i6 & Fields.TransformOrigin;
            if (i21 == 0) {
            }
            i23 = i6 & 8192;
            if (i23 == 0) {
            }
            i25 = i6 & Fields.Clip;
            if (i25 == 0) {
            }
            i27 = i6 & Fields.CompositingStrategy;
            if (i27 != 0) {
            }
            i28 = i6 & 65536;
            if (i28 != 0) {
            }
            i29 = i6 & Fields.RenderEffect;
            if (i29 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i30 = i6 & Fields.BlendMode;
            if (i30 != 0) {
            }
            i31 = i6 & 1048576;
            if (i31 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        int i412 = Fields.RotationZ;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & 196608) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & Fields.SpotShadowColor;
        int i42222 = GroupFlagsKt.IsNodeFlag;
        if (i11 == 0) {
        }
        i12 = i6 & Fields.RotationX;
        int i43222 = GroupFlagsKt.HasAuxSlotFlag;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & Fields.RotationY;
        int i442222 = GroupFlagsKt.IsMovableContentFlag;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & Fields.RotationZ;
        if (i16 == 0) {
        }
        i19 = i6 & Fields.CameraDistance;
        if (i19 == 0) {
        }
        int i4522222 = i18;
        i21 = i6 & Fields.TransformOrigin;
        if (i21 == 0) {
        }
        i23 = i6 & 8192;
        if (i23 == 0) {
        }
        i25 = i6 & Fields.Clip;
        if (i25 == 0) {
        }
        i27 = i6 & Fields.CompositingStrategy;
        if (i27 != 0) {
        }
        i28 = i6 & 65536;
        if (i28 != 0) {
        }
        i29 = i6 & Fields.RenderEffect;
        if (i29 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i30 = i6 & Fields.BlendMode;
        if (i30 != 0) {
        }
        i31 = i6 & 1048576;
        if (i31 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute(((i7 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i32 & 147) == 146) ? false : true, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
