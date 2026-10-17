package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import defpackage.bn0;
import defpackage.dq;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final KeyboardOptions SecureTextFieldKeyboardOptions = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m7300getPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (dq) null);

    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ae  */
    /* renamed from: OutlinedSecureTextField-XvU6IwQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2333OutlinedSecureTextFieldXvU6IwQ(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar7, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4, int i5) {
        TextFieldState textFieldState2;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        TextStyle textStyle2;
        TextFieldLabelPosition textFieldLabelPosition2;
        int i9;
        ny nyVar2;
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
        my myVar9;
        boolean z4;
        int i32;
        char c2;
        KeyboardOptions keyboardOptions2;
        KeyboardActionHandler keyboardActionHandler2;
        my myVar10;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        boolean z5;
        TextStyle textStyle3;
        TextFieldLabelPosition textFieldLabelPosition3;
        ny nyVar3;
        Modifier modifier3;
        my myVar11;
        my myVar12;
        my myVar13;
        my myVar14;
        my myVar15;
        InputTransformation inputTransformation2;
        ScopeUpdateScope endRestartGroup;
        int i33;
        Shape shape3;
        TextFieldLabelPosition textFieldLabelPosition4;
        Modifier modifier4;
        int i34;
        char c3;
        Shape shape4;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler keyboardActionHandler3;
        InputTransformation inputTransformation3;
        my myVar16;
        my myVar17;
        my myVar18;
        PaddingValues m2240contentPaddinga9UjIt4$default;
        my myVar19;
        my myVar20;
        my myVar21;
        my myVar22;
        int i35;
        TextFieldColors textFieldColors3;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        int i36;
        int i37;
        Composer startRestartGroup = composer.startRestartGroup(-273370384);
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
            textFieldState2 = textFieldState;
        } else {
            textFieldState2 = textFieldState;
            if ((i2 & 6) == 0) {
                i6 = (startRestartGroup.changed(textFieldState2) ? 4 : 2) | i2;
            } else {
                i6 = i2;
            }
        }
        int i38 = i5 & 2;
        if (i38 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            int i39 = Fields.RotationX;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i6 |= startRestartGroup.changed(z3) ? 256 : Fields.SpotShadowColor;
                i8 = i2 & 3072;
                int i40 = Fields.RotationZ;
                if (i8 == 0) {
                    if ((i5 & 8) == 0) {
                        textStyle2 = textStyle;
                        if (startRestartGroup.changed(textStyle2)) {
                            i37 = 2048;
                            i6 |= i37;
                        }
                    } else {
                        textStyle2 = textStyle;
                    }
                    i37 = 1024;
                    i6 |= i37;
                } else {
                    textStyle2 = textStyle;
                }
                int i41 = 8192;
                if ((i2 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                        if (startRestartGroup.changed(textFieldLabelPosition2)) {
                            i36 = 16384;
                            i6 |= i36;
                        }
                    } else {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                    }
                    i36 = 8192;
                    i6 |= i36;
                } else {
                    textFieldLabelPosition2 = textFieldLabelPosition;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                    nyVar2 = nyVar;
                } else {
                    nyVar2 = nyVar;
                    if ((i2 & 196608) == 0) {
                        i6 |= startRestartGroup.changedInstance(nyVar2) ? 131072 : 65536;
                    }
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                    myVar8 = myVar;
                } else {
                    myVar8 = myVar;
                    if ((i2 & 1572864) == 0) {
                        i6 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : 524288;
                    }
                }
                i11 = i5 & Fields.SpotShadowColor;
                int i42 = GroupFlagsKt.IsNodeFlag;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i6 |= startRestartGroup.changedInstance(myVar2) ? 8388608 : 4194304;
                }
                i12 = i5 & Fields.RotationX;
                int i43 = GroupFlagsKt.HasAuxSlotFlag;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i13 = i12;
                    i6 |= startRestartGroup.changedInstance(myVar3) ? 67108864 : 33554432;
                    i14 = i5 & Fields.RotationY;
                    int i44 = GroupFlagsKt.IsMovableContentFlag;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i15 = i14;
                        i6 |= startRestartGroup.changedInstance(myVar4) ? 536870912 : 268435456;
                        i16 = i5 & Fields.RotationZ;
                        if (i16 != 0) {
                            i18 = i3 | 6;
                            i17 = i16;
                        } else if ((i3 & 6) == 0) {
                            i17 = i16;
                            i18 = i3 | (startRestartGroup.changedInstance(myVar5) ? 4 : 2);
                        } else {
                            i17 = i16;
                            i18 = i3;
                        }
                        i19 = i5 & Fields.CameraDistance;
                        if (i19 != 0) {
                            i18 |= 48;
                            i20 = i19;
                        } else if ((i3 & 48) == 0) {
                            i20 = i19;
                            i18 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
                        } else {
                            i20 = i19;
                        }
                        int i45 = i18;
                        i21 = i5 & Fields.TransformOrigin;
                        if (i21 != 0) {
                            i22 = i45 | 384;
                        } else {
                            int i46 = i45;
                            if ((i3 & 384) == 0) {
                                i46 |= startRestartGroup.changed(z2) ? 256 : Fields.SpotShadowColor;
                            }
                            i22 = i46;
                        }
                        i23 = i5 & 8192;
                        if (i23 != 0) {
                            i24 = i22 | 3072;
                        } else {
                            i24 = i22;
                            if ((i3 & 3072) == 0) {
                                if (startRestartGroup.changed(inputTransformation)) {
                                    i40 = 2048;
                                }
                                i24 |= i40;
                                if ((i3 & 24576) == 0) {
                                    if ((i5 & Fields.Clip) == 0 && startRestartGroup.changed(i)) {
                                        i41 = 16384;
                                    }
                                    i24 |= i41;
                                }
                                i25 = i5 & Fields.CompositingStrategy;
                                if (i25 == 0) {
                                    i24 |= 196608;
                                } else if ((i3 & 196608) == 0) {
                                    i24 |= startRestartGroup.changed(c) ? 131072 : 65536;
                                }
                                i26 = i5 & 65536;
                                if (i26 == 0) {
                                    i24 |= 1572864;
                                } else if ((i3 & 1572864) == 0) {
                                    i24 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                                }
                                i27 = i5 & Fields.RenderEffect;
                                if (i27 == 0) {
                                    i24 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    if (!startRestartGroup.changed(keyboardActionHandler)) {
                                        i42 = 4194304;
                                    }
                                    i24 |= i42;
                                }
                                i28 = i5 & Fields.ColorFilter;
                                if (i28 == 0) {
                                    i24 |= 100663296;
                                } else if ((i3 & 100663296) == 0) {
                                    if (startRestartGroup.changedInstance(myVar7)) {
                                        i43 = 67108864;
                                    }
                                    i24 |= i43;
                                }
                                if ((i3 & 805306368) == 0) {
                                    if ((i5 & Fields.BlendMode) == 0 && startRestartGroup.changed(shape)) {
                                        i44 = 536870912;
                                    }
                                    i24 |= i44;
                                }
                                if ((i4 & 6) != 0) {
                                    i29 = i4 | (((i5 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                } else {
                                    i29 = i4;
                                }
                                if ((i4 & 48) == 0) {
                                    i29 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(paddingValues)) ? 32 : 16;
                                }
                                int i47 = i29;
                                i30 = i5 & 4194304;
                                if (i30 == 0) {
                                    i31 = i47 | 384;
                                } else if ((i4 & 384) == 0) {
                                    if (!startRestartGroup.changed(mutableInteractionSource)) {
                                        i39 = Fields.SpotShadowColor;
                                    }
                                    i31 = i47 | i39;
                                } else {
                                    i31 = i47;
                                }
                                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    myVar9 = myVar3;
                                    z4 = z2;
                                    i32 = i;
                                    c2 = c;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    myVar10 = myVar7;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    composer2 = startRestartGroup;
                                    z5 = z3;
                                    textStyle3 = textStyle2;
                                    textFieldLabelPosition3 = textFieldLabelPosition2;
                                    nyVar3 = nyVar2;
                                    modifier3 = modifier2;
                                    myVar11 = myVar8;
                                    myVar12 = myVar2;
                                    myVar13 = myVar4;
                                    myVar14 = myVar5;
                                    myVar15 = myVar6;
                                    inputTransformation2 = inputTransformation;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i38 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i7 != 0) {
                                            z3 = true;
                                        }
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                            textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                            textFieldLabelPosition2 = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                        }
                                        if (i9 != 0) {
                                            nyVar2 = null;
                                        }
                                        if (i10 != 0) {
                                            myVar8 = null;
                                        }
                                        my myVar23 = i11 != 0 ? null : myVar2;
                                        my myVar24 = i13 != 0 ? null : myVar3;
                                        my myVar25 = i15 != 0 ? null : myVar4;
                                        my myVar26 = i17 != 0 ? null : myVar5;
                                        my myVar27 = i20 != 0 ? null : myVar6;
                                        boolean z6 = i21 != 0 ? false : z2;
                                        InputTransformation inputTransformation4 = i23 != 0 ? null : inputTransformation;
                                        if ((i5 & Fields.Clip) != 0) {
                                            i33 = TextObfuscationMode.Companion.m1262getRevealLastTypedvTwcZD0();
                                            i24 &= -57345;
                                        } else {
                                            i33 = i;
                                        }
                                        char c4 = i25 != 0 ? DefaultObfuscationCharacter : c;
                                        KeyboardOptions keyboardOptions4 = i26 != 0 ? SecureTextFieldKeyboardOptions : keyboardOptions;
                                        KeyboardActionHandler keyboardActionHandler4 = i27 != 0 ? null : keyboardActionHandler;
                                        my myVar28 = i28 != 0 ? null : myVar7;
                                        if ((i5 & Fields.BlendMode) != 0) {
                                            shape3 = OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                            i24 &= -1879048193;
                                        } else {
                                            shape3 = shape;
                                        }
                                        int i48 = i33;
                                        TextFieldColors colors = (i5 & 1048576) != 0 ? OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6) : textFieldColors;
                                        Modifier modifier5 = modifier2;
                                        textFieldLabelPosition4 = textFieldLabelPosition2;
                                        modifier4 = modifier5;
                                        i34 = i48;
                                        c3 = c4;
                                        shape4 = shape3;
                                        keyboardOptions3 = keyboardOptions4;
                                        keyboardActionHandler3 = keyboardActionHandler4;
                                        inputTransformation3 = inputTransformation4;
                                        myVar16 = myVar28;
                                        myVar17 = myVar26;
                                        myVar18 = myVar27;
                                        m2240contentPaddinga9UjIt4$default = (i5 & 2097152) != 0 ? OutlinedTextFieldDefaults.m2240contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
                                        myVar19 = myVar23;
                                        myVar20 = myVar24;
                                        myVar21 = myVar8;
                                        myVar22 = myVar25;
                                        z4 = z6;
                                        i35 = i24;
                                        textFieldColors3 = colors;
                                        mutableInteractionSource3 = i30 != 0 ? null : mutableInteractionSource;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        if ((i5 & Fields.Clip) != 0) {
                                            i24 &= -57345;
                                        }
                                        if ((i5 & Fields.BlendMode) != 0) {
                                            i24 &= -1879048193;
                                        }
                                        Modifier modifier6 = modifier2;
                                        textFieldLabelPosition4 = textFieldLabelPosition2;
                                        modifier4 = modifier6;
                                        myVar19 = myVar2;
                                        myVar20 = myVar3;
                                        myVar22 = myVar4;
                                        myVar17 = myVar5;
                                        myVar18 = myVar6;
                                        z4 = z2;
                                        inputTransformation3 = inputTransformation;
                                        i34 = i;
                                        c3 = c;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        myVar16 = myVar7;
                                        shape4 = shape;
                                        m2240contentPaddinga9UjIt4$default = paddingValues;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        myVar21 = myVar8;
                                        i35 = i24;
                                        textFieldColors3 = textFieldColors;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-273370384, i6, i35, "androidx.compose.material3.OutlinedSecureTextField (SecureTextField.kt:315)");
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        startRestartGroup.startReplaceGroup(-717679893);
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-715888276);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    startRestartGroup.startReplaceGroup(-715882166);
                                    long m7090getColor0d7_KjU = textStyle2.m7090getColor0d7_KjU();
                                    if (m7090getColor0d7_KjU == 16) {
                                        m7090getColor0d7_KjU = textFieldColors3.m2574textColorXeAY9LY$material3(z3, z4, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                    }
                                    long j = m7090getColor0d7_KjU;
                                    startRestartGroup.endReplaceGroup();
                                    boolean z7 = z3;
                                    CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1147500080, true, new SecureTextFieldKt$OutlinedSecureTextField$1(modifier4, nyVar2, textFieldLabelPosition4, z4, textFieldColors3, textFieldState2, z7, mutableInteractionSource4, myVar21, myVar19, myVar20, myVar22, myVar17, myVar18, m2240contentPaddinga9UjIt4$default, inputTransformation3, textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null)), keyboardOptions3, keyboardActionHandler3, myVar16, i34, c3, shape4), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    my myVar29 = myVar18;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    composer2 = startRestartGroup;
                                    textFieldLabelPosition3 = textFieldLabelPosition4;
                                    myVar15 = myVar29;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier4;
                                    nyVar3 = nyVar2;
                                    z5 = z7;
                                    myVar11 = myVar21;
                                    myVar12 = myVar19;
                                    myVar9 = myVar20;
                                    myVar13 = myVar22;
                                    myVar14 = myVar17;
                                    paddingValues2 = m2240contentPaddinga9UjIt4$default;
                                    keyboardOptions2 = keyboardOptions3;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    myVar10 = myVar16;
                                    i32 = i34;
                                    c2 = c3;
                                    shape2 = shape4;
                                    textFieldColors2 = textFieldColors3;
                                    inputTransformation2 = inputTransformation3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new bn0(textFieldState, modifier3, z5, textStyle3, textFieldLabelPosition3, nyVar3, myVar11, myVar12, myVar9, myVar13, myVar14, myVar15, z4, inputTransformation2, i32, c2, keyboardOptions2, keyboardActionHandler2, myVar10, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i2, i3, i4, i5, 0));
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        i25 = i5 & Fields.CompositingStrategy;
                        if (i25 == 0) {
                        }
                        i26 = i5 & 65536;
                        if (i26 == 0) {
                        }
                        i27 = i5 & Fields.RenderEffect;
                        if (i27 == 0) {
                        }
                        i28 = i5 & Fields.ColorFilter;
                        if (i28 == 0) {
                        }
                        if ((i3 & 805306368) == 0) {
                        }
                        if ((i4 & 6) != 0) {
                        }
                        if ((i4 & 48) == 0) {
                        }
                        int i472 = i29;
                        i30 = i5 & 4194304;
                        if (i30 == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i5 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    i19 = i5 & Fields.CameraDistance;
                    if (i19 != 0) {
                    }
                    int i452 = i18;
                    i21 = i5 & Fields.TransformOrigin;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 8192;
                    if (i23 != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i25 = i5 & Fields.CompositingStrategy;
                    if (i25 == 0) {
                    }
                    i26 = i5 & 65536;
                    if (i26 == 0) {
                    }
                    i27 = i5 & Fields.RenderEffect;
                    if (i27 == 0) {
                    }
                    i28 = i5 & Fields.ColorFilter;
                    if (i28 == 0) {
                    }
                    if ((i3 & 805306368) == 0) {
                    }
                    if ((i4 & 6) != 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    int i4722 = i29;
                    i30 = i5 & 4194304;
                    if (i30 == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i13 = i12;
                i14 = i5 & Fields.RotationY;
                int i442 = GroupFlagsKt.IsMovableContentFlag;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & Fields.RotationZ;
                if (i16 != 0) {
                }
                i19 = i5 & Fields.CameraDistance;
                if (i19 != 0) {
                }
                int i4522 = i18;
                i21 = i5 & Fields.TransformOrigin;
                if (i21 != 0) {
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i25 = i5 & Fields.CompositingStrategy;
                if (i25 == 0) {
                }
                i26 = i5 & 65536;
                if (i26 == 0) {
                }
                i27 = i5 & Fields.RenderEffect;
                if (i27 == 0) {
                }
                i28 = i5 & Fields.ColorFilter;
                if (i28 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                if ((i4 & 6) != 0) {
                }
                if ((i4 & 48) == 0) {
                }
                int i47222 = i29;
                i30 = i5 & 4194304;
                if (i30 == 0) {
                }
                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i8 = i2 & 3072;
            int i402 = Fields.RotationZ;
            if (i8 == 0) {
            }
            int i412 = 8192;
            if ((i2 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & Fields.SpotShadowColor;
            int i422 = GroupFlagsKt.IsNodeFlag;
            if (i11 != 0) {
            }
            i12 = i5 & Fields.RotationX;
            int i432 = GroupFlagsKt.HasAuxSlotFlag;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & Fields.RotationY;
            int i4422 = GroupFlagsKt.IsMovableContentFlag;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & Fields.RotationZ;
            if (i16 != 0) {
            }
            i19 = i5 & Fields.CameraDistance;
            if (i19 != 0) {
            }
            int i45222 = i18;
            i21 = i5 & Fields.TransformOrigin;
            if (i21 != 0) {
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i25 = i5 & Fields.CompositingStrategy;
            if (i25 == 0) {
            }
            i26 = i5 & 65536;
            if (i26 == 0) {
            }
            i27 = i5 & Fields.RenderEffect;
            if (i27 == 0) {
            }
            i28 = i5 & Fields.ColorFilter;
            if (i28 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            if ((i4 & 6) != 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i472222 = i29;
            i30 = i5 & 4194304;
            if (i30 == 0) {
            }
            if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        int i392 = Fields.RotationX;
        if (i7 == 0) {
        }
        z3 = z;
        i8 = i2 & 3072;
        int i4022 = Fields.RotationZ;
        if (i8 == 0) {
        }
        int i4122 = 8192;
        if ((i2 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & Fields.SpotShadowColor;
        int i4222 = GroupFlagsKt.IsNodeFlag;
        if (i11 != 0) {
        }
        i12 = i5 & Fields.RotationX;
        int i4322 = GroupFlagsKt.HasAuxSlotFlag;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & Fields.RotationY;
        int i44222 = GroupFlagsKt.IsMovableContentFlag;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & Fields.RotationZ;
        if (i16 != 0) {
        }
        i19 = i5 & Fields.CameraDistance;
        if (i19 != 0) {
        }
        int i452222 = i18;
        i21 = i5 & Fields.TransformOrigin;
        if (i21 != 0) {
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i25 = i5 & Fields.CompositingStrategy;
        if (i25 == 0) {
        }
        i26 = i5 & 65536;
        if (i26 == 0) {
        }
        i27 = i5 & Fields.RenderEffect;
        if (i27 == 0) {
        }
        i28 = i5 & Fields.ColorFilter;
        if (i28 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        if ((i4 & 6) != 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i4722222 = i29;
        i30 = i5 & 4194304;
        if (i30 == 0) {
        }
        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedSecureTextField_XvU6IwQ$lambda$5(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar7, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        m2333OutlinedSecureTextFieldXvU6IwQ(textFieldState, modifier, z, textStyle, textFieldLabelPosition, nyVar, myVar, myVar2, myVar3, myVar4, myVar5, myVar6, z2, inputTransformation, i, c, keyboardOptions, keyboardActionHandler, myVar7, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ae  */
    /* renamed from: SecureTextField-XvU6IwQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2334SecureTextFieldXvU6IwQ(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar7, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4, int i5) {
        final TextFieldState textFieldState2;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        TextStyle textStyle2;
        TextFieldLabelPosition textFieldLabelPosition2;
        int i9;
        ny nyVar2;
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
        my myVar9;
        boolean z4;
        InputTransformation inputTransformation2;
        char c2;
        KeyboardOptions keyboardOptions2;
        KeyboardActionHandler keyboardActionHandler2;
        my myVar10;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        boolean z5;
        TextStyle textStyle3;
        TextFieldLabelPosition textFieldLabelPosition3;
        ny nyVar3;
        Modifier modifier3;
        my myVar11;
        my myVar12;
        my myVar13;
        my myVar14;
        my myVar15;
        int i32;
        ScopeUpdateScope endRestartGroup;
        int i33;
        Shape shape3;
        final int i34;
        final char c3;
        final Shape shape4;
        final ny nyVar4;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler3;
        final InputTransformation inputTransformation3;
        final my myVar16;
        final my myVar17;
        final my myVar18;
        final boolean z6;
        final PaddingValues paddingValues3;
        final my myVar19;
        final my myVar20;
        final my myVar21;
        final my myVar22;
        int i35;
        final boolean z7;
        final TextFieldLabelPosition textFieldLabelPosition4;
        final Modifier modifier4;
        final TextFieldColors textFieldColors3;
        MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        int i36;
        int i37;
        Composer startRestartGroup = composer.startRestartGroup(1177133806);
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
            textFieldState2 = textFieldState;
        } else {
            textFieldState2 = textFieldState;
            if ((i2 & 6) == 0) {
                i6 = (startRestartGroup.changed(textFieldState2) ? 4 : 2) | i2;
            } else {
                i6 = i2;
            }
        }
        int i38 = i5 & 2;
        if (i38 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            int i39 = Fields.RotationX;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i6 |= startRestartGroup.changed(z3) ? 256 : Fields.SpotShadowColor;
                i8 = i2 & 3072;
                int i40 = Fields.RotationZ;
                if (i8 == 0) {
                    if ((i5 & 8) == 0) {
                        textStyle2 = textStyle;
                        if (startRestartGroup.changed(textStyle2)) {
                            i37 = 2048;
                            i6 |= i37;
                        }
                    } else {
                        textStyle2 = textStyle;
                    }
                    i37 = 1024;
                    i6 |= i37;
                } else {
                    textStyle2 = textStyle;
                }
                int i41 = 8192;
                if ((i2 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                        if (startRestartGroup.changed(textFieldLabelPosition2)) {
                            i36 = 16384;
                            i6 |= i36;
                        }
                    } else {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                    }
                    i36 = 8192;
                    i6 |= i36;
                } else {
                    textFieldLabelPosition2 = textFieldLabelPosition;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                    nyVar2 = nyVar;
                } else {
                    nyVar2 = nyVar;
                    if ((i2 & 196608) == 0) {
                        i6 |= startRestartGroup.changedInstance(nyVar2) ? 131072 : 65536;
                    }
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                    myVar8 = myVar;
                } else {
                    myVar8 = myVar;
                    if ((i2 & 1572864) == 0) {
                        i6 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : 524288;
                    }
                }
                i11 = i5 & Fields.SpotShadowColor;
                int i42 = GroupFlagsKt.IsNodeFlag;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i6 |= startRestartGroup.changedInstance(myVar2) ? 8388608 : 4194304;
                }
                i12 = i5 & Fields.RotationX;
                int i43 = GroupFlagsKt.HasAuxSlotFlag;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i13 = i12;
                    i6 |= startRestartGroup.changedInstance(myVar3) ? 67108864 : 33554432;
                    i14 = i5 & Fields.RotationY;
                    int i44 = GroupFlagsKt.IsMovableContentFlag;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i15 = i14;
                        i6 |= startRestartGroup.changedInstance(myVar4) ? 536870912 : 268435456;
                        i16 = i5 & Fields.RotationZ;
                        if (i16 != 0) {
                            i18 = i3 | 6;
                            i17 = i16;
                        } else if ((i3 & 6) == 0) {
                            i17 = i16;
                            i18 = i3 | (startRestartGroup.changedInstance(myVar5) ? 4 : 2);
                        } else {
                            i17 = i16;
                            i18 = i3;
                        }
                        i19 = i5 & Fields.CameraDistance;
                        if (i19 != 0) {
                            i18 |= 48;
                            i20 = i19;
                        } else if ((i3 & 48) == 0) {
                            i20 = i19;
                            i18 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
                        } else {
                            i20 = i19;
                        }
                        int i45 = i18;
                        i21 = i5 & Fields.TransformOrigin;
                        if (i21 != 0) {
                            i22 = i45 | 384;
                        } else {
                            int i46 = i45;
                            if ((i3 & 384) == 0) {
                                i46 |= startRestartGroup.changed(z2) ? 256 : Fields.SpotShadowColor;
                            }
                            i22 = i46;
                        }
                        i23 = i5 & 8192;
                        if (i23 != 0) {
                            i24 = i22 | 3072;
                        } else {
                            i24 = i22;
                            if ((i3 & 3072) == 0) {
                                if (startRestartGroup.changed(inputTransformation)) {
                                    i40 = 2048;
                                }
                                i24 |= i40;
                                if ((i3 & 24576) == 0) {
                                    if ((i5 & Fields.Clip) == 0 && startRestartGroup.changed(i)) {
                                        i41 = 16384;
                                    }
                                    i24 |= i41;
                                }
                                i25 = i5 & Fields.CompositingStrategy;
                                if (i25 == 0) {
                                    i24 |= 196608;
                                } else if ((i3 & 196608) == 0) {
                                    i24 |= startRestartGroup.changed(c) ? 131072 : 65536;
                                }
                                i26 = i5 & 65536;
                                if (i26 == 0) {
                                    i24 |= 1572864;
                                } else if ((i3 & 1572864) == 0) {
                                    i24 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                                }
                                i27 = i5 & Fields.RenderEffect;
                                if (i27 == 0) {
                                    i24 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    if (!startRestartGroup.changed(keyboardActionHandler)) {
                                        i42 = 4194304;
                                    }
                                    i24 |= i42;
                                }
                                i28 = i5 & Fields.ColorFilter;
                                if (i28 == 0) {
                                    i24 |= 100663296;
                                } else if ((i3 & 100663296) == 0) {
                                    if (startRestartGroup.changedInstance(myVar7)) {
                                        i43 = 67108864;
                                    }
                                    i24 |= i43;
                                }
                                if ((i3 & 805306368) == 0) {
                                    if ((i5 & Fields.BlendMode) == 0 && startRestartGroup.changed(shape)) {
                                        i44 = 536870912;
                                    }
                                    i24 |= i44;
                                }
                                if ((i4 & 6) != 0) {
                                    i29 = i4 | (((i5 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                } else {
                                    i29 = i4;
                                }
                                if ((i4 & 48) == 0) {
                                    i29 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(paddingValues)) ? 32 : 16;
                                }
                                int i47 = i29;
                                i30 = i5 & 4194304;
                                if (i30 == 0) {
                                    i31 = i47 | 384;
                                } else if ((i4 & 384) == 0) {
                                    if (!startRestartGroup.changed(mutableInteractionSource)) {
                                        i39 = Fields.SpotShadowColor;
                                    }
                                    i31 = i47 | i39;
                                } else {
                                    i31 = i47;
                                }
                                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    myVar9 = myVar3;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    c2 = c;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    myVar10 = myVar7;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    composer2 = startRestartGroup;
                                    z5 = z3;
                                    textStyle3 = textStyle2;
                                    textFieldLabelPosition3 = textFieldLabelPosition2;
                                    nyVar3 = nyVar2;
                                    modifier3 = modifier2;
                                    myVar11 = myVar8;
                                    myVar12 = myVar2;
                                    myVar13 = myVar4;
                                    myVar14 = myVar5;
                                    myVar15 = myVar6;
                                    i32 = i;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i38 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i7 != 0) {
                                            z3 = true;
                                        }
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                            textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                            textFieldLabelPosition2 = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                        }
                                        if (i9 != 0) {
                                            nyVar2 = null;
                                        }
                                        if (i10 != 0) {
                                            myVar8 = null;
                                        }
                                        my myVar23 = i11 != 0 ? null : myVar2;
                                        my myVar24 = i13 != 0 ? null : myVar3;
                                        my myVar25 = i15 != 0 ? null : myVar4;
                                        my myVar26 = i17 != 0 ? null : myVar5;
                                        my myVar27 = i20 != 0 ? null : myVar6;
                                        boolean z8 = i21 != 0 ? false : z2;
                                        InputTransformation inputTransformation4 = i23 != 0 ? null : inputTransformation;
                                        if ((i5 & Fields.Clip) != 0) {
                                            i33 = TextObfuscationMode.Companion.m1262getRevealLastTypedvTwcZD0();
                                            i24 &= -57345;
                                        } else {
                                            i33 = i;
                                        }
                                        char c4 = i25 != 0 ? DefaultObfuscationCharacter : c;
                                        KeyboardOptions keyboardOptions4 = i26 != 0 ? SecureTextFieldKeyboardOptions : keyboardOptions;
                                        KeyboardActionHandler keyboardActionHandler4 = i27 != 0 ? null : keyboardActionHandler;
                                        my myVar28 = i28 != 0 ? null : myVar7;
                                        if ((i5 & Fields.BlendMode) != 0) {
                                            shape3 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                            i24 &= -1879048193;
                                        } else {
                                            shape3 = shape;
                                        }
                                        int i48 = i33;
                                        TextFieldColors colors = (i5 & 1048576) != 0 ? TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6) : textFieldColors;
                                        PaddingValues m2577contentPaddingWithoutLabela9UjIt4$default = (i5 & 2097152) != 0 ? (nyVar2 == null || (textFieldLabelPosition2 instanceof TextFieldLabelPosition.Above)) ? TextFieldDefaults.m2577contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : TextFieldDefaults.m2576contentPaddingWithLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
                                        i34 = i48;
                                        c3 = c4;
                                        shape4 = shape3;
                                        if (i30 != 0) {
                                            nyVar4 = nyVar2;
                                            keyboardOptions3 = keyboardOptions4;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            inputTransformation3 = inputTransformation4;
                                            myVar16 = myVar28;
                                            myVar17 = myVar26;
                                            myVar18 = myVar27;
                                            z6 = z8;
                                            paddingValues3 = m2577contentPaddingWithoutLabela9UjIt4$default;
                                            myVar19 = myVar23;
                                            myVar20 = myVar24;
                                            myVar21 = myVar8;
                                            myVar22 = myVar25;
                                            i35 = i24;
                                            z7 = z3;
                                            textFieldLabelPosition4 = textFieldLabelPosition2;
                                            modifier4 = modifier2;
                                            textFieldColors3 = colors;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            nyVar4 = nyVar2;
                                            keyboardOptions3 = keyboardOptions4;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            inputTransformation3 = inputTransformation4;
                                            myVar16 = myVar28;
                                            myVar17 = myVar26;
                                            myVar18 = myVar27;
                                            z6 = z8;
                                            paddingValues3 = m2577contentPaddingWithoutLabela9UjIt4$default;
                                            myVar19 = myVar23;
                                            myVar20 = myVar24;
                                            myVar21 = myVar8;
                                            myVar22 = myVar25;
                                            i35 = i24;
                                            z7 = z3;
                                            textFieldLabelPosition4 = textFieldLabelPosition2;
                                            modifier4 = modifier2;
                                            textFieldColors3 = colors;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        if ((i5 & Fields.Clip) != 0) {
                                            i24 &= -57345;
                                        }
                                        if ((i5 & Fields.BlendMode) != 0) {
                                            i24 &= -1879048193;
                                        }
                                        myVar19 = myVar2;
                                        myVar20 = myVar3;
                                        myVar22 = myVar4;
                                        myVar17 = myVar5;
                                        myVar18 = myVar6;
                                        inputTransformation3 = inputTransformation;
                                        i34 = i;
                                        c3 = c;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        myVar16 = myVar7;
                                        shape4 = shape;
                                        paddingValues3 = paddingValues;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        z7 = z3;
                                        textFieldLabelPosition4 = textFieldLabelPosition2;
                                        nyVar4 = nyVar2;
                                        modifier4 = modifier2;
                                        myVar21 = myVar8;
                                        i35 = i24;
                                        z6 = z2;
                                        textFieldColors3 = textFieldColors;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1177133806, i6, i35, "androidx.compose.material3.SecureTextField (SecureTextField.kt:155)");
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        startRestartGroup.startReplaceGroup(-413168883);
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(1649239306);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    startRestartGroup.startReplaceGroup(1649245416);
                                    long m7090getColor0d7_KjU = textStyle2.m7090getColor0d7_KjU();
                                    if (m7090getColor0d7_KjU == 16) {
                                        m7090getColor0d7_KjU = textFieldColors3.m2574textColorXeAY9LY$material3(z7, z6, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                    }
                                    long j = m7090getColor0d7_KjU;
                                    startRestartGroup.endReplaceGroup();
                                    final TextStyle merge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null));
                                    CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-2072926674, true, new my() { // from class: androidx.compose.material3.SecureTextFieldKt$SecureTextField$1
                                        public final void invoke(Composer composer3, int i49) {
                                            if (!composer3.shouldExecute((i49 & 3) != 2, i49 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2072926674, i49, -1, "androidx.compose.material3.SecureTextField.<anonymous> (SecureTextField.kt:167)");
                                            }
                                            Modifier modifier5 = Modifier.this;
                                            boolean z9 = z6;
                                            Strings.Companion companion = Strings.Companion;
                                            Modifier defaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier5, z9, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.default_error_message), composer3, 0));
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                            Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(defaultErrorSemantics, textFieldDefaults.m2593getMinWidthD9Ej5fM(), textFieldDefaults.m2592getMinHeightD9Ej5fM());
                                            SolidColor solidColor = new SolidColor(textFieldColors3.m2524cursorColorvNxB06k$material3(z6), null);
                                            TextFieldState textFieldState3 = textFieldState2;
                                            final boolean z10 = z7;
                                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            TextFieldLabelPosition textFieldLabelPosition5 = textFieldLabelPosition4;
                                            ny nyVar5 = nyVar4;
                                            my myVar29 = myVar21;
                                            my myVar30 = myVar19;
                                            my myVar31 = myVar20;
                                            my myVar32 = myVar22;
                                            my myVar33 = myVar17;
                                            my myVar34 = myVar18;
                                            final boolean z11 = z6;
                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                            PaddingValues paddingValues4 = paddingValues3;
                                            final Shape shape5 = shape4;
                                            BasicSecureTextFieldKt.m1064BasicSecureTextFieldegD4TGM(textFieldState2, m791defaultMinSizeVpY3zN4, z7, false, inputTransformation3, merge, keyboardOptions3, keyboardActionHandler3, myVar16, mutableInteractionSource4, solidColor, textFieldDefaults.decorator(textFieldState3, z10, singleLine, null, mutableInteractionSource5, textFieldLabelPosition5, nyVar5, myVar29, myVar30, myVar31, myVar32, myVar33, myVar34, z11, textFieldColors4, paddingValues4, ComposableLambdaKt.rememberComposableLambda(-43781811, true, new my() { // from class: androidx.compose.material3.SecureTextFieldKt$SecureTextField$1.1
                                                public final void invoke(Composer composer4, int i50) {
                                                    if (!composer4.shouldExecute((i50 & 3) != 2, i50 & 1)) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-43781811, i50, -1, "androidx.compose.material3.SecureTextField.<anonymous>.<anonymous> (SecureTextField.kt:205)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.m2586Container4EFweAY(z10, z11, mutableInteractionSource5, null, textFieldColors4, shape5, 0.0f, 0.0f, composer4, 100663296, ComposerKt.invocationKey);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // defpackage.my
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                                    return w01.a;
                                                }
                                            }, composer3, 54), composer3, 3456, 14155776, 0), i34, c3, composer3, 0, 0, 8);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier4;
                                    z4 = z6;
                                    z5 = z7;
                                    nyVar3 = nyVar4;
                                    myVar11 = myVar21;
                                    myVar12 = myVar19;
                                    myVar9 = myVar20;
                                    myVar13 = myVar22;
                                    myVar14 = myVar17;
                                    paddingValues2 = paddingValues3;
                                    inputTransformation2 = inputTransformation3;
                                    keyboardOptions2 = keyboardOptions3;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    myVar10 = myVar16;
                                    i32 = i34;
                                    shape2 = shape4;
                                    textFieldColors2 = textFieldColors3;
                                    myVar15 = myVar18;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    composer2 = startRestartGroup;
                                    textFieldLabelPosition3 = textFieldLabelPosition4;
                                    c2 = c3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new bn0(textFieldState, modifier3, z5, textStyle3, textFieldLabelPosition3, nyVar3, myVar11, myVar12, myVar9, myVar13, myVar14, myVar15, z4, inputTransformation2, i32, c2, keyboardOptions2, keyboardActionHandler2, myVar10, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i2, i3, i4, i5, 1));
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        i25 = i5 & Fields.CompositingStrategy;
                        if (i25 == 0) {
                        }
                        i26 = i5 & 65536;
                        if (i26 == 0) {
                        }
                        i27 = i5 & Fields.RenderEffect;
                        if (i27 == 0) {
                        }
                        i28 = i5 & Fields.ColorFilter;
                        if (i28 == 0) {
                        }
                        if ((i3 & 805306368) == 0) {
                        }
                        if ((i4 & 6) != 0) {
                        }
                        if ((i4 & 48) == 0) {
                        }
                        int i472 = i29;
                        i30 = i5 & 4194304;
                        if (i30 == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i5 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    i19 = i5 & Fields.CameraDistance;
                    if (i19 != 0) {
                    }
                    int i452 = i18;
                    i21 = i5 & Fields.TransformOrigin;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 8192;
                    if (i23 != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i25 = i5 & Fields.CompositingStrategy;
                    if (i25 == 0) {
                    }
                    i26 = i5 & 65536;
                    if (i26 == 0) {
                    }
                    i27 = i5 & Fields.RenderEffect;
                    if (i27 == 0) {
                    }
                    i28 = i5 & Fields.ColorFilter;
                    if (i28 == 0) {
                    }
                    if ((i3 & 805306368) == 0) {
                    }
                    if ((i4 & 6) != 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    int i4722 = i29;
                    i30 = i5 & 4194304;
                    if (i30 == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i13 = i12;
                i14 = i5 & Fields.RotationY;
                int i442 = GroupFlagsKt.IsMovableContentFlag;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & Fields.RotationZ;
                if (i16 != 0) {
                }
                i19 = i5 & Fields.CameraDistance;
                if (i19 != 0) {
                }
                int i4522 = i18;
                i21 = i5 & Fields.TransformOrigin;
                if (i21 != 0) {
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i25 = i5 & Fields.CompositingStrategy;
                if (i25 == 0) {
                }
                i26 = i5 & 65536;
                if (i26 == 0) {
                }
                i27 = i5 & Fields.RenderEffect;
                if (i27 == 0) {
                }
                i28 = i5 & Fields.ColorFilter;
                if (i28 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                if ((i4 & 6) != 0) {
                }
                if ((i4 & 48) == 0) {
                }
                int i47222 = i29;
                i30 = i5 & 4194304;
                if (i30 == 0) {
                }
                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i8 = i2 & 3072;
            int i402 = Fields.RotationZ;
            if (i8 == 0) {
            }
            int i412 = 8192;
            if ((i2 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & Fields.SpotShadowColor;
            int i422 = GroupFlagsKt.IsNodeFlag;
            if (i11 != 0) {
            }
            i12 = i5 & Fields.RotationX;
            int i432 = GroupFlagsKt.HasAuxSlotFlag;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & Fields.RotationY;
            int i4422 = GroupFlagsKt.IsMovableContentFlag;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & Fields.RotationZ;
            if (i16 != 0) {
            }
            i19 = i5 & Fields.CameraDistance;
            if (i19 != 0) {
            }
            int i45222 = i18;
            i21 = i5 & Fields.TransformOrigin;
            if (i21 != 0) {
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i25 = i5 & Fields.CompositingStrategy;
            if (i25 == 0) {
            }
            i26 = i5 & 65536;
            if (i26 == 0) {
            }
            i27 = i5 & Fields.RenderEffect;
            if (i27 == 0) {
            }
            i28 = i5 & Fields.ColorFilter;
            if (i28 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            if ((i4 & 6) != 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i472222 = i29;
            i30 = i5 & 4194304;
            if (i30 == 0) {
            }
            if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        int i392 = Fields.RotationX;
        if (i7 == 0) {
        }
        z3 = z;
        i8 = i2 & 3072;
        int i4022 = Fields.RotationZ;
        if (i8 == 0) {
        }
        int i4122 = 8192;
        if ((i2 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & Fields.SpotShadowColor;
        int i4222 = GroupFlagsKt.IsNodeFlag;
        if (i11 != 0) {
        }
        i12 = i5 & Fields.RotationX;
        int i4322 = GroupFlagsKt.HasAuxSlotFlag;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & Fields.RotationY;
        int i44222 = GroupFlagsKt.IsMovableContentFlag;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & Fields.RotationZ;
        if (i16 != 0) {
        }
        i19 = i5 & Fields.CameraDistance;
        if (i19 != 0) {
        }
        int i452222 = i18;
        i21 = i5 & Fields.TransformOrigin;
        if (i21 != 0) {
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i25 = i5 & Fields.CompositingStrategy;
        if (i25 == 0) {
        }
        i26 = i5 & 65536;
        if (i26 == 0) {
        }
        i27 = i5 & Fields.RenderEffect;
        if (i27 == 0) {
        }
        i28 = i5 & Fields.ColorFilter;
        if (i28 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        if ((i4 & 6) != 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i4722222 = i29;
        i30 = i5 & 4194304;
        if (i30 == 0) {
        }
        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i31 & 147) == 146) ? false : true, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SecureTextField_XvU6IwQ$lambda$2(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar7, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        m2334SecureTextFieldXvU6IwQ(textFieldState, modifier, z, textStyle, textFieldLabelPosition, nyVar, myVar, myVar2, myVar3, myVar4, myVar5, myVar6, z2, inputTransformation, i, c, keyboardOptions, keyboardActionHandler, myVar7, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }
}
