package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.TextObfuscationMode_androidKt;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import defpackage.d1;
import defpackage.dq;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.rc;
import defpackage.tc;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:110:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1063BasicSecureTextFieldJb9bMDk(final TextFieldState textFieldState, Modifier modifier, boolean z, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, Composer composer, final int i2, final int i3, final int i4) {
        TextFieldState textFieldState2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
        int i10;
        KeyboardActionHandler keyboardActionHandler2;
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
        Composer composer2;
        final my myVar2;
        final int i23;
        final boolean z3;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final Modifier modifier3;
        final KeyboardActionHandler keyboardActionHandler3;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        final char c2;
        ScopeUpdateScope endRestartGroup;
        int i24;
        Modifier modifier4;
        int i25;
        TextStyle textStyle4;
        Composer startRestartGroup = composer.startRestartGroup(1399310985);
        if ((i2 & 6) == 0) {
            textFieldState2 = textFieldState;
            i5 = (startRestartGroup.changed(textFieldState2) ? 4 : 2) | i2;
        } else {
            textFieldState2 = textFieldState;
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            int i27 = Fields.RotationX;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? 256 : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    inputTransformation2 = inputTransformation;
                    i5 |= startRestartGroup.changed(inputTransformation2) ? Fields.CameraDistance : Fields.RotationZ;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        textStyle2 = textStyle;
                        i5 |= startRestartGroup.changed(textStyle2) ? Fields.Clip : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & 196608) == 0) {
                                i5 |= startRestartGroup.changed(keyboardOptions2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardActionHandler2 = keyboardActionHandler;
                        } else {
                            keyboardActionHandler2 = keyboardActionHandler;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(keyboardActionHandler2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        i11 = i4 & Fields.SpotShadowColor;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i12 = i11;
                            i5 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i13 = i4 & Fields.RotationX;
                            if (i13 == 0) {
                                i5 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i15 = i4 & Fields.RotationY;
                                if (i15 != 0) {
                                    i5 |= 805306368;
                                } else if ((i2 & 805306368) == 0) {
                                    i16 = i15;
                                    i5 |= startRestartGroup.changed(brush) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    i17 = i4 & Fields.RotationZ;
                                    if (i17 == 0) {
                                        i18 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        i18 = i3 | ((i3 & 8) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 4 : 2);
                                    } else {
                                        i18 = i3;
                                    }
                                    i19 = i4 & Fields.CameraDistance;
                                    if (i19 == 0) {
                                        i18 |= 48;
                                        i20 = i19;
                                    } else if ((i3 & 48) == 0) {
                                        i20 = i19;
                                        i18 |= startRestartGroup.changed(i) ? 32 : 16;
                                    } else {
                                        i20 = i19;
                                    }
                                    int i28 = i18;
                                    i21 = i4 & Fields.TransformOrigin;
                                    if (i21 == 0) {
                                        i22 = i28 | 384;
                                    } else if ((i3 & 384) == 0) {
                                        if (!startRestartGroup.changed(c)) {
                                            i27 = Fields.SpotShadowColor;
                                        }
                                        i22 = i28 | i27;
                                    } else {
                                        i22 = i28;
                                    }
                                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        myVar2 = myVar;
                                        i23 = i;
                                        z3 = z2;
                                        inputTransformation3 = inputTransformation2;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        modifier3 = modifier2;
                                        keyboardActionHandler3 = keyboardActionHandler2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        textFieldDecorator2 = textFieldDecorator;
                                        c2 = c;
                                    } else {
                                        if (i26 != 0) {
                                            modifier4 = Modifier.Companion;
                                            i24 = i7;
                                        } else {
                                            i24 = i7;
                                            modifier4 = modifier2;
                                        }
                                        boolean z4 = i6 != 0 ? true : z2;
                                        dq dqVar = null;
                                        InputTransformation inputTransformation4 = i24 != 0 ? null : inputTransformation2;
                                        if (i8 != 0) {
                                            textStyle4 = TextStyle.Companion.getDefault();
                                            i25 = i9;
                                        } else {
                                            i25 = i9;
                                            textStyle4 = textStyle2;
                                        }
                                        KeyboardOptions secureTextField$foundation = i25 != 0 ? KeyboardOptions.Companion.getSecureTextField$foundation() : keyboardOptions2;
                                        KeyboardActionHandler keyboardActionHandler4 = i10 != 0 ? null : keyboardActionHandler2;
                                        my myVar3 = i12 != 0 ? null : myVar;
                                        MutableInteractionSource mutableInteractionSource3 = i14 != 0 ? null : mutableInteractionSource;
                                        Brush solidColor = i16 != 0 ? new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), dqVar) : brush;
                                        TextFieldDecorator textFieldDecorator3 = i17 != 0 ? null : textFieldDecorator;
                                        int m1262getRevealLastTypedvTwcZD0 = i20 != 0 ? TextObfuscationMode.Companion.m1262getRevealLastTypedvTwcZD0() : i;
                                        char c3 = i21 != 0 ? (char) 8226 : c;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1399310985, i5, i22, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:363)");
                                        }
                                        int i29 = i5 << 3;
                                        int i30 = i22 << 3;
                                        composer2 = startRestartGroup;
                                        m1065BasicSecureTextFieldltb6GB4(textFieldState2, modifier4, z4, false, inputTransformation4, textStyle4, secureTextField$foundation, keyboardActionHandler4, myVar3, mutableInteractionSource3, solidColor, textFieldDecorator3, m1262getRevealLastTypedvTwcZD0, c3, null, composer2, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192), ((i5 >> 27) & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168), Fields.Clip);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        z3 = z4;
                                        inputTransformation3 = inputTransformation4;
                                        textStyle3 = textStyle4;
                                        keyboardOptions3 = secureTextField$foundation;
                                        keyboardActionHandler3 = keyboardActionHandler4;
                                        myVar2 = myVar3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        brush2 = solidColor;
                                        textFieldDecorator2 = textFieldDecorator3;
                                        i23 = m1262getRevealLastTypedvTwcZD0;
                                        c2 = c3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new my() { // from class: sc
                                            @Override // defpackage.my
                                            public final Object invoke(Object obj, Object obj2) {
                                                w01 BasicSecureTextField_Jb9bMDk$lambda$0;
                                                int intValue = ((Integer) obj2).intValue();
                                                BasicSecureTextField_Jb9bMDk$lambda$0 = BasicSecureTextFieldKt.BasicSecureTextField_Jb9bMDk$lambda$0(TextFieldState.this, modifier3, z3, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler3, myVar2, mutableInteractionSource2, brush2, textFieldDecorator2, i23, c2, i2, i3, i4, (Composer) obj, intValue);
                                                return BasicSecureTextField_Jb9bMDk$lambda$0;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i16 = i15;
                                i17 = i4 & Fields.RotationZ;
                                if (i17 == 0) {
                                }
                                i19 = i4 & Fields.CameraDistance;
                                if (i19 == 0) {
                                }
                                int i282 = i18;
                                i21 = i4 & Fields.TransformOrigin;
                                if (i21 == 0) {
                                }
                                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & Fields.RotationY;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            i17 = i4 & Fields.RotationZ;
                            if (i17 == 0) {
                            }
                            i19 = i4 & Fields.CameraDistance;
                            if (i19 == 0) {
                            }
                            int i2822 = i18;
                            i21 = i4 & Fields.TransformOrigin;
                            if (i21 == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & Fields.RotationX;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & Fields.RotationY;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        i17 = i4 & Fields.RotationZ;
                        if (i17 == 0) {
                        }
                        i19 = i4 & Fields.CameraDistance;
                        if (i19 == 0) {
                        }
                        int i28222 = i18;
                        i21 = i4 & Fields.TransformOrigin;
                        if (i21 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    textStyle2 = textStyle;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & Fields.SpotShadowColor;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & Fields.RotationX;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & Fields.RotationY;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i4 & Fields.RotationZ;
                    if (i17 == 0) {
                    }
                    i19 = i4 & Fields.CameraDistance;
                    if (i19 == 0) {
                    }
                    int i282222 = i18;
                    i21 = i4 & Fields.TransformOrigin;
                    if (i21 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                textStyle2 = textStyle;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & Fields.SpotShadowColor;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & Fields.RotationX;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & Fields.RotationY;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i4 & Fields.RotationZ;
                if (i17 == 0) {
                }
                i19 = i4 & Fields.CameraDistance;
                if (i19 == 0) {
                }
                int i2822222 = i18;
                i21 = i4 & Fields.TransformOrigin;
                if (i21 == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            textStyle2 = textStyle;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & Fields.SpotShadowColor;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & Fields.RotationX;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & Fields.RotationY;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i4 & Fields.RotationZ;
            if (i17 == 0) {
            }
            i19 = i4 & Fields.CameraDistance;
            if (i19 == 0) {
            }
            int i28222222 = i18;
            i21 = i4 & Fields.TransformOrigin;
            if (i21 == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        int i272 = Fields.RotationX;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        textStyle2 = textStyle;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & Fields.SpotShadowColor;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & Fields.RotationX;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & Fields.RotationY;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i4 & Fields.RotationZ;
        if (i17 == 0) {
        }
        i19 = i4 & Fields.CameraDistance;
        if (i19 == 0) {
        }
        int i282222222 = i18;
        i21 = i4 & Fields.TransformOrigin;
        if (i21 == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 147) != 146, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: BasicSecureTextField-egD4TGM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1064BasicSecureTextFieldegD4TGM(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, Composer composer, final int i2, final int i3, final int i4) {
        TextFieldState textFieldState2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
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
        Composer composer2;
        final boolean z4;
        final KeyboardActionHandler keyboardActionHandler2;
        final my myVar2;
        final int i23;
        final char c2;
        final boolean z5;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        ScopeUpdateScope endRestartGroup;
        int i24;
        Modifier modifier4;
        int i25;
        InputTransformation inputTransformation4;
        int i26;
        TextStyle textStyle4;
        Composer startRestartGroup = composer.startRestartGroup(-817513499);
        if ((i2 & 6) == 0) {
            textFieldState2 = textFieldState;
            i5 = (startRestartGroup.changed(textFieldState2) ? 4 : 2) | i2;
        } else {
            textFieldState2 = textFieldState;
            i5 = i2;
        }
        int i27 = i4 & 2;
        if (i27 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            int i28 = Fields.RotationX;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i5 |= startRestartGroup.changed(z3) ? 256 : Fields.SpotShadowColor;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    inputTransformation2 = inputTransformation;
                    i5 |= startRestartGroup.changed(inputTransformation2) ? Fields.Clip : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i2 & 196608) == 0) {
                            i5 |= startRestartGroup.changed(textStyle2) ? Fields.RenderEffect : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i10 = i4 & Fields.SpotShadowColor;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(keyboardActionHandler) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i11 = i4 & Fields.RotationX;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i13 = i4 & Fields.RotationY;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i14 = i13;
                            i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i15 = i4 & Fields.RotationZ;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (startRestartGroup.changed(brush) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            i18 = i4 & Fields.CameraDistance;
                            if (i18 == 0) {
                                i17 |= 48;
                            } else if ((i3 & 48) == 0) {
                                i17 |= (i3 & 64) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 32 : 16;
                            }
                            int i29 = i17;
                            i19 = i4 & Fields.TransformOrigin;
                            if (i19 == 0) {
                                i20 = i29 | 384;
                            } else if ((i3 & 384) == 0) {
                                if (!startRestartGroup.changed(i)) {
                                    i28 = Fields.SpotShadowColor;
                                }
                                i20 = i29 | i28;
                            } else {
                                i20 = i29;
                            }
                            i21 = i4 & 8192;
                            if (i21 == 0) {
                                i22 = i20 | 3072;
                            } else {
                                int i30 = i20;
                                if ((i3 & 3072) == 0) {
                                    i30 |= startRestartGroup.changed(c) ? Fields.CameraDistance : Fields.RotationZ;
                                }
                                i22 = i30;
                            }
                            if (startRestartGroup.shouldExecute((i5 & 306782355) == 306782354 || (i22 & 1171) != 1170, i5 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                z4 = z2;
                                keyboardActionHandler2 = keyboardActionHandler;
                                myVar2 = myVar;
                                i23 = i;
                                c2 = c;
                                z5 = z3;
                                inputTransformation3 = inputTransformation2;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                modifier3 = modifier2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                textFieldDecorator2 = textFieldDecorator;
                            } else {
                                if (i27 != 0) {
                                    modifier4 = Modifier.Companion;
                                    i24 = i7;
                                } else {
                                    i24 = i7;
                                    modifier4 = modifier2;
                                }
                                boolean z6 = i6 != 0 ? true : z3;
                                boolean z7 = (i4 & 8) != 0 ? false : z2;
                                dq dqVar = null;
                                if (i24 != 0) {
                                    i25 = i21;
                                    inputTransformation4 = null;
                                } else {
                                    i25 = i21;
                                    inputTransformation4 = inputTransformation2;
                                }
                                if (i8 != 0) {
                                    textStyle4 = TextStyle.Companion.getDefault();
                                    i26 = i9;
                                } else {
                                    i26 = i9;
                                    textStyle4 = textStyle2;
                                }
                                KeyboardOptions secureTextField$foundation = i26 != 0 ? KeyboardOptions.Companion.getSecureTextField$foundation() : keyboardOptions2;
                                KeyboardActionHandler keyboardActionHandler3 = i10 != 0 ? null : keyboardActionHandler;
                                my myVar3 = i12 != 0 ? null : myVar;
                                MutableInteractionSource mutableInteractionSource3 = i14 != 0 ? null : mutableInteractionSource;
                                Brush solidColor = i16 != 0 ? new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), dqVar) : brush;
                                TextFieldDecorator textFieldDecorator3 = i18 != 0 ? null : textFieldDecorator;
                                int m1262getRevealLastTypedvTwcZD0 = i19 != 0 ? TextObfuscationMode.Companion.m1262getRevealLastTypedvTwcZD0() : i;
                                char c3 = i25 != 0 ? (char) 8226 : c;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-817513499, i5, i22, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:405)");
                                }
                                composer2 = startRestartGroup;
                                m1065BasicSecureTextFieldltb6GB4(textFieldState2, modifier4, z6, false, inputTransformation4, textStyle4, secureTextField$foundation, keyboardActionHandler3, myVar3, mutableInteractionSource3, solidColor, textFieldDecorator3, m1262getRevealLastTypedvTwcZD0, c3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), composer2, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (1879048192 & i5), i22 & 8190, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z7;
                                modifier3 = modifier4;
                                z5 = z6;
                                inputTransformation3 = inputTransformation4;
                                textStyle3 = textStyle4;
                                keyboardOptions3 = secureTextField$foundation;
                                keyboardActionHandler2 = keyboardActionHandler3;
                                myVar2 = myVar3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                brush2 = solidColor;
                                textFieldDecorator2 = textFieldDecorator3;
                                i23 = m1262getRevealLastTypedvTwcZD0;
                                c2 = c3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: qc
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 BasicSecureTextField_egD4TGM$lambda$0;
                                        int intValue = ((Integer) obj2).intValue();
                                        BasicSecureTextField_egD4TGM$lambda$0 = BasicSecureTextFieldKt.BasicSecureTextField_egD4TGM$lambda$0(TextFieldState.this, modifier3, z5, z4, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler2, myVar2, mutableInteractionSource2, brush2, textFieldDecorator2, i23, c2, i2, i3, i4, (Composer) obj, intValue);
                                        return BasicSecureTextField_egD4TGM$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        i15 = i4 & Fields.RotationZ;
                        if (i15 == 0) {
                        }
                        i18 = i4 & Fields.CameraDistance;
                        if (i18 == 0) {
                        }
                        int i292 = i17;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 == 0) {
                        }
                        i21 = i4 & 8192;
                        if (i21 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i5 & 306782355) == 306782354 || (i22 & 1171) != 1170, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & Fields.RotationY;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i4 & Fields.RotationZ;
                    if (i15 == 0) {
                    }
                    i18 = i4 & Fields.CameraDistance;
                    if (i18 == 0) {
                    }
                    int i2922 = i17;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 == 0) {
                    }
                    i21 = i4 & 8192;
                    if (i21 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 306782355) == 306782354 || (i22 & 1171) != 1170, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & Fields.SpotShadowColor;
                if (i10 == 0) {
                }
                i11 = i4 & Fields.RotationX;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & Fields.RotationY;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i4 & Fields.RotationZ;
                if (i15 == 0) {
                }
                i18 = i4 & Fields.CameraDistance;
                if (i18 == 0) {
                }
                int i29222 = i17;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 == 0) {
                }
                i21 = i4 & 8192;
                if (i21 == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 306782355) == 306782354 || (i22 & 1171) != 1170, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & Fields.SpotShadowColor;
            if (i10 == 0) {
            }
            i11 = i4 & Fields.RotationX;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & Fields.RotationY;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i4 & Fields.RotationZ;
            if (i15 == 0) {
            }
            i18 = i4 & Fields.CameraDistance;
            if (i18 == 0) {
            }
            int i292222 = i17;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 == 0) {
            }
            i21 = i4 & 8192;
            if (i21 == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 306782355) == 306782354 || (i22 & 1171) != 1170, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        int i282 = Fields.RotationX;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & Fields.SpotShadowColor;
        if (i10 == 0) {
        }
        i11 = i4 & Fields.RotationX;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & Fields.RotationY;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i4 & Fields.RotationZ;
        if (i15 == 0) {
        }
        i18 = i4 & Fields.CameraDistance;
        if (i18 == 0) {
        }
        int i2922222 = i17;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 == 0) {
        }
        i21 = i4 & 8192;
        if (i21 == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 306782355) == 306782354 || (i22 & 1171) != 1170, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0200  */
    /* renamed from: BasicSecureTextField-ltb6GB4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1065BasicSecureTextFieldltb6GB4(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, ScrollState scrollState, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        final InputTransformation inputTransformation2;
        int i9;
        TextStyle textStyle2;
        int i10;
        final KeyboardOptions keyboardOptions2;
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
        final my myVar2;
        final int i23;
        final char c2;
        Composer composer2;
        final boolean z5;
        final boolean z6;
        final InputTransformation inputTransformation3;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final KeyboardActionHandler keyboardActionHandler2;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        final ScrollState scrollState2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        KeyboardOptions keyboardOptions3;
        boolean z7;
        Brush brush3;
        int i24;
        final ScrollState scrollState3;
        final Brush brush4;
        final TextFieldDecorator textFieldDecorator3;
        final KeyboardActionHandler keyboardActionHandler3;
        final my myVar3;
        final MutableInteractionSource mutableInteractionSource3;
        TextStyle textStyle4;
        char c3;
        final boolean z8;
        int i25;
        final boolean z9;
        Composer.Companion companion;
        final boolean z10;
        int i26;
        Composer startRestartGroup = composer.startRestartGroup(1568790509);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i27 = i4 & 2;
        if (i27 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i5 |= startRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                int i28 = Fields.RotationZ;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z4 = z2;
                    i5 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    int i29 = 8192;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        inputTransformation2 = inputTransformation;
                        i5 |= startRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i2 & 196608) == 0) {
                                i5 |= startRestartGroup.changed(textStyle2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        i11 = i4 & Fields.SpotShadowColor;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(keyboardActionHandler) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i12 = i4 & Fields.RotationX;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i13 = i12;
                            i5 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i14 = i4 & Fields.RotationY;
                            if (i14 == 0) {
                                i5 |= 805306368;
                            } else if ((i2 & 805306368) == 0) {
                                i15 = i14;
                                i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i16 = i4 & Fields.RotationZ;
                                if (i16 != 0) {
                                    i18 = i3 | 6;
                                    i17 = i16;
                                } else if ((i3 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i3 | (startRestartGroup.changed(brush) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i3;
                                }
                                i19 = i4 & Fields.CameraDistance;
                                if (i19 != 0) {
                                    i18 |= 48;
                                } else if ((i3 & 48) == 0) {
                                    i18 |= (i3 & 64) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 32 : 16;
                                }
                                if ((i3 & 384) == 0) {
                                    if ((i4 & Fields.TransformOrigin) == 0 && startRestartGroup.changed(i)) {
                                        i26 = Fields.RotationX;
                                        i18 |= i26;
                                    }
                                    i26 = Fields.SpotShadowColor;
                                    i18 |= i26;
                                }
                                int i30 = i18;
                                i20 = i4 & 8192;
                                if (i20 != 0) {
                                    i21 = i30 | 3072;
                                } else if ((i3 & 3072) == 0) {
                                    if (startRestartGroup.changed(c)) {
                                        i28 = 2048;
                                    }
                                    i21 = i30 | i28;
                                } else {
                                    i21 = i30;
                                }
                                if ((i3 & 24576) == 0) {
                                    if ((i4 & Fields.Clip) == 0 && startRestartGroup.changed(scrollState)) {
                                        i29 = 16384;
                                    }
                                    i21 |= i29;
                                }
                                i22 = i21;
                                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
                                    startRestartGroup.startDefaults();
                                    dq dqVar = null;
                                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        modifier4 = i27 != 0 ? Modifier.Companion : modifier2;
                                        if (i6 != 0) {
                                            z3 = true;
                                        }
                                        if (i7 != 0) {
                                            z4 = false;
                                        }
                                        if (i8 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i9 != 0) {
                                            textStyle2 = TextStyle.Companion.getDefault();
                                        }
                                        if (i10 != 0) {
                                            keyboardOptions2 = KeyboardOptions.Companion.getSecureTextField$foundation();
                                        }
                                        KeyboardActionHandler keyboardActionHandler4 = i11 != 0 ? null : keyboardActionHandler;
                                        my myVar4 = i13 != 0 ? null : myVar;
                                        MutableInteractionSource mutableInteractionSource4 = i15 != 0 ? null : mutableInteractionSource;
                                        if (i17 != 0) {
                                            keyboardOptions3 = keyboardOptions2;
                                            z7 = z3;
                                            brush3 = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), dqVar);
                                        } else {
                                            keyboardOptions3 = keyboardOptions2;
                                            z7 = z3;
                                            brush3 = brush;
                                        }
                                        TextFieldDecorator textFieldDecorator4 = i19 != 0 ? null : textFieldDecorator;
                                        if ((i4 & Fields.TransformOrigin) != 0) {
                                            i24 = TextObfuscationMode_androidKt.getDefault(TextObfuscationMode.Companion);
                                            i22 &= -897;
                                        } else {
                                            i24 = i;
                                        }
                                        char c4 = i20 != 0 ? DefaultObfuscationCharacter : c;
                                        int i31 = i22;
                                        if ((i4 & Fields.Clip) != 0) {
                                            brush4 = brush3;
                                            textFieldDecorator3 = textFieldDecorator4;
                                            myVar3 = myVar4;
                                            mutableInteractionSource3 = mutableInteractionSource4;
                                            c3 = c4;
                                            scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                            keyboardOptions2 = keyboardOptions3;
                                            i25 = i31 & (-57345);
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            z9 = z4;
                                            textStyle4 = textStyle2;
                                            z8 = z7;
                                        } else {
                                            scrollState3 = scrollState;
                                            brush4 = brush3;
                                            textFieldDecorator3 = textFieldDecorator4;
                                            keyboardActionHandler3 = keyboardActionHandler4;
                                            myVar3 = myVar4;
                                            mutableInteractionSource3 = mutableInteractionSource4;
                                            textStyle4 = textStyle2;
                                            c3 = c4;
                                            z8 = z7;
                                            keyboardOptions2 = keyboardOptions3;
                                            i25 = i31;
                                            z9 = z4;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & Fields.TransformOrigin) != 0) {
                                            i22 &= -897;
                                        }
                                        if ((i4 & Fields.Clip) != 0) {
                                            i22 &= -57345;
                                        }
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        myVar3 = myVar;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush4 = brush;
                                        textFieldDecorator3 = textFieldDecorator;
                                        c3 = c;
                                        scrollState3 = scrollState;
                                        i25 = i22;
                                        z9 = z4;
                                        modifier4 = modifier2;
                                        textStyle4 = textStyle2;
                                        z8 = z3;
                                        i24 = i;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1568790509, i5, i25, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:139)");
                                    }
                                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i25 >> 9) & 14);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    Composer.Companion companion2 = Composer.Companion;
                                    if (rememberedValue == companion2.getEmpty()) {
                                        rememberedValue = new SecureTextFieldController(rememberUpdatedState);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) rememberedValue;
                                    boolean changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changedInstance || rememberedValue2 == companion2.getEmpty()) {
                                        rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    EffectsKt.LaunchedEffect(secureTextFieldController, (my) rememberedValue2, startRestartGroup, 0);
                                    TextObfuscationMode.Companion companion3 = TextObfuscationMode.Companion;
                                    if (TextObfuscationMode.m1257equalsimpl0(i24, companion3.m1262getRevealLastTypedvTwcZD0())) {
                                        startRestartGroup.startReplaceGroup(74207180);
                                        boolean platformAllowsRevealLastTyped = BasicSecureTextField_androidKt.platformAllowsRevealLastTyped(startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                        companion = companion2;
                                        z10 = platformAllowsRevealLastTyped;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-1994543479);
                                        startRestartGroup.endReplaceGroup();
                                        companion = companion2;
                                        z10 = false;
                                    }
                                    final TextStyle textStyle5 = textStyle4;
                                    Boolean valueOf = Boolean.valueOf(z10);
                                    boolean changed = startRestartGroup.changed(z10) | startRestartGroup.changedInstance(secureTextFieldController);
                                    char c5 = c3;
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue3 == companion.getEmpty()) {
                                        rememberedValue3 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(z10, secureTextFieldController, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue3, startRestartGroup, 0);
                                    boolean z11 = (((i25 & 896) ^ 384) > 256 && startRestartGroup.changed(i24)) || (i25 & 384) == 256;
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (z11 || rememberedValue4 == companion.getEmpty()) {
                                        CodepointTransformation codepointTransformation = TextObfuscationMode.m1257equalsimpl0(i24, companion3.m1262getRevealLastTypedvTwcZD0()) ? secureTextFieldController.getCodepointTransformation() : TextObfuscationMode.m1257equalsimpl0(i24, companion3.m1261getHiddenvTwcZD0()) ? new tc(rememberUpdatedState, 0) : null;
                                        startRestartGroup.updateRememberedValue(codepointTransformation);
                                        rememberedValue4 = codepointTransformation;
                                    }
                                    final CodepointTransformation codepointTransformation2 = (CodepointTransformation) rememberedValue4;
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == companion.getEmpty()) {
                                        rememberedValue5 = new d1(27);
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue5, 1, null);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == companion.getEmpty()) {
                                        rememberedValue6 = new ky() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2$1
                                            @Override // defpackage.ky
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return m1066invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
                                            }

                                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                            public final Boolean m1066invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                                KeyCommand mo1116mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo1116mapZmokQxo(keyEvent);
                                                return Boolean.valueOf(mo1116mapZmokQxo == KeyCommand.COPY || mo1116mapZmokQxo == KeyCommand.CUT);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    final Modifier then = KeyInputModifierKt.onPreviewKeyEvent(semantics$default, (ky) rememberedValue6).then(z10 ? secureTextFieldController.getFocusChangeModifier() : Modifier.Companion);
                                    final KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                    DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(135148049, true, new my() { // from class: uc
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 BasicSecureTextField_ltb6GB4$lambda$6;
                                            int intValue = ((Integer) obj2).intValue();
                                            BasicSecureTextField_ltb6GB4$lambda$6 = BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$6(z10, inputTransformation2, secureTextFieldController, textFieldState, then, z8, z9, textStyle5, keyboardOptions4, keyboardActionHandler3, myVar3, mutableInteractionSource3, brush4, codepointTransformation2, textFieldDecorator3, scrollState3, (Composer) obj, intValue);
                                            return BasicSecureTextField_ltb6GB4$lambda$6;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    c2 = c5;
                                    modifier3 = modifier4;
                                    composer2 = startRestartGroup;
                                    i23 = i24;
                                    inputTransformation3 = inputTransformation2;
                                    z5 = z8;
                                    z6 = z9;
                                    textStyle3 = textStyle5;
                                    keyboardOptions2 = keyboardOptions4;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    myVar2 = myVar3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    brush2 = brush4;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    scrollState2 = scrollState3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    myVar2 = myVar;
                                    i23 = i;
                                    c2 = c;
                                    composer2 = startRestartGroup;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    textFieldDecorator2 = textFieldDecorator;
                                    scrollState2 = scrollState;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: vc
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 BasicSecureTextField_ltb6GB4$lambda$7;
                                            int intValue = ((Integer) obj2).intValue();
                                            BasicSecureTextField_ltb6GB4$lambda$7 = BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$7(TextFieldState.this, modifier3, z5, z6, inputTransformation3, textStyle3, keyboardOptions2, keyboardActionHandler2, myVar2, mutableInteractionSource2, brush2, textFieldDecorator2, i23, c2, scrollState2, i2, i3, i4, (Composer) obj, intValue);
                                            return BasicSecureTextField_ltb6GB4$lambda$7;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i15 = i14;
                            i16 = i4 & Fields.RotationZ;
                            if (i16 != 0) {
                            }
                            i19 = i4 & Fields.CameraDistance;
                            if (i19 != 0) {
                            }
                            if ((i3 & 384) == 0) {
                            }
                            int i302 = i18;
                            i20 = i4 & 8192;
                            if (i20 != 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            i22 = i21;
                            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i4 & Fields.RotationY;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i4 & Fields.RotationZ;
                        if (i16 != 0) {
                        }
                        i19 = i4 & Fields.CameraDistance;
                        if (i19 != 0) {
                        }
                        if ((i3 & 384) == 0) {
                        }
                        int i3022 = i18;
                        i20 = i4 & 8192;
                        if (i20 != 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        i22 = i21;
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & Fields.SpotShadowColor;
                    if (i11 != 0) {
                    }
                    i12 = i4 & Fields.RotationX;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i4 & Fields.RotationY;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i4 & Fields.RotationZ;
                    if (i16 != 0) {
                    }
                    i19 = i4 & Fields.CameraDistance;
                    if (i19 != 0) {
                    }
                    if ((i3 & 384) == 0) {
                    }
                    int i30222 = i18;
                    i20 = i4 & 8192;
                    if (i20 != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i22 = i21;
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i8 = i4 & 16;
                int i292 = 8192;
                if (i8 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & Fields.SpotShadowColor;
                if (i11 != 0) {
                }
                i12 = i4 & Fields.RotationX;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i4 & Fields.RotationY;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i4 & Fields.RotationZ;
                if (i16 != 0) {
                }
                i19 = i4 & Fields.CameraDistance;
                if (i19 != 0) {
                }
                if ((i3 & 384) == 0) {
                }
                int i302222 = i18;
                i20 = i4 & 8192;
                if (i20 != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i22 = i21;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i7 = i4 & 8;
            int i282 = Fields.RotationZ;
            if (i7 != 0) {
            }
            z4 = z2;
            i8 = i4 & 16;
            int i2922 = 8192;
            if (i8 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & Fields.SpotShadowColor;
            if (i11 != 0) {
            }
            i12 = i4 & Fields.RotationX;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & Fields.RotationY;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i4 & Fields.RotationZ;
            if (i16 != 0) {
            }
            i19 = i4 & Fields.CameraDistance;
            if (i19 != 0) {
            }
            if ((i3 & 384) == 0) {
            }
            int i3022222 = i18;
            i20 = i4 & 8192;
            if (i20 != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i22 = i21;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i4 & 8;
        int i2822 = Fields.RotationZ;
        if (i7 != 0) {
        }
        z4 = z2;
        i8 = i4 & 16;
        int i29222 = 8192;
        if (i8 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & Fields.SpotShadowColor;
        if (i11 != 0) {
        }
        i12 = i4 & Fields.RotationX;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & Fields.RotationY;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i4 & Fields.RotationZ;
        if (i16 != 0) {
        }
        i19 = i4 & Fields.CameraDistance;
        if (i19 != 0) {
        }
        if ((i3 & 384) == 0) {
        }
        int i30222222 = i18;
        i20 = i4 & 8192;
        if (i20 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i22 = i21;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i22 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicSecureTextField_Jb9bMDk$lambda$0(TextFieldState textFieldState, Modifier modifier, boolean z, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, int i2, int i3, int i4, Composer composer, int i5) {
        m1063BasicSecureTextFieldJb9bMDk(textFieldState, modifier, z, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, myVar, mutableInteractionSource, brush, textFieldDecorator, i, c, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicSecureTextField_egD4TGM$lambda$0(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, int i2, int i3, int i4, Composer composer, int i5) {
        m1064BasicSecureTextFieldegD4TGM(textFieldState, modifier, z, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, myVar, mutableInteractionSource, brush, textFieldDecorator, i, c, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_ltb6GB4$lambda$3$0(State state, int i, int i2) {
        return ((Character) state.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicSecureTextField_ltb6GB4$lambda$4$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPassword());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicSecureTextField_ltb6GB4$lambda$6(boolean z, InputTransformation inputTransformation, SecureTextFieldController secureTextFieldController, TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(135148049, i, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:192)");
            }
            BasicTextFieldKt.BasicTextField(textFieldState, modifier, z2, z3, z ? then(inputTransformation, secureTextFieldController.getPasswordInputTransformation()) : inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, TextFieldLineLimits.SingleLine.INSTANCE, myVar, mutableInteractionSource, brush, codepointTransformation, null, textFieldDecorator, scrollState, true, composer, 100663296, 1572864, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicSecureTextField_ltb6GB4$lambda$7(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, ScrollState scrollState, int i2, int i3, int i4, Composer composer, int i5) {
        m1065BasicSecureTextFieldltb6GB4(textFieldState, modifier, z, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, myVar, mutableInteractionSource, brush, textFieldDecorator, i, c, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    private static final void DisableCutCopy(my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1141174275);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1141174275, i2, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:311)");
            }
            final TextToolbar textToolbar = (TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            boolean changed = startRestartGroup.changed(textToolbar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    {
                        this.$$delegate_0 = TextToolbar.this;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5) {
                        TextToolbar.this.showMenu(rect, null, iyVar2, null, iyVar4, iyVar5);
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4) {
                        this.$$delegate_0.showMenu(rect, iyVar, iyVar2, iyVar3, iyVar4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) rememberedValue), myVar, startRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new rc(i, i3, myVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DisableCutCopy$lambda$1(my myVar, int i, Composer composer, int i2) {
        DisableCutCopy(myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }
}
