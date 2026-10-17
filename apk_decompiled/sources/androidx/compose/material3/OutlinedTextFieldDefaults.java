package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import defpackage.ae0;
import defpackage.eh0;
import defpackage.er;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m7611constructorimpl(56.0f);
    private static final float MinWidth = Dp.m7611constructorimpl(280.0f);
    private static final float UnfocusedBorderThickness = Dp.m7611constructorimpl(1.0f);
    private static final float FocusedBorderThickness = Dp.m7611constructorimpl(2.0f);

    private OutlinedTextFieldDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContainerBox_nbWgWpA$lambda$7(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        outlinedTextFieldDefaults.m2242ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Container_4EFweAY$lambda$0(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        outlinedTextFieldDefaults.m2241Container4EFweAY(z, z2, interactionSource, modifier, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DecorationBox$lambda$3(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, my myVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, my myVar8, TextFieldColors textFieldColors, PaddingValues paddingValues, my myVar9, int i, int i2, int i3, Composer composer, int i4) {
        outlinedTextFieldDefaults.DecorationBox(str, myVar, z, z2, visualTransformation, interactionSource, z3, myVar2, myVar3, myVar4, myVar5, myVar6, myVar7, myVar8, textFieldColors, paddingValues, myVar9, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2240contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m2244contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2241Container4EFweAY(boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        Composer composer2;
        Modifier modifier3;
        TextFieldColors textFieldColors3;
        Shape shape3;
        float f5;
        float f6;
        ScopeUpdateScope endRestartGroup;
        TextFieldColors textFieldColors4;
        Shape shape4;
        float f7;
        Modifier modifier4;
        int i4;
        TextFieldColors textFieldColors5;
        Shape shape5;
        float f8;
        float f9;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1035477640);
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
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    if (startRestartGroup.changed(textFieldColors2)) {
                        i8 = Fields.Clip;
                        i3 |= i8;
                    }
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i8 = 8192;
                i3 |= i8;
            } else {
                textFieldColors2 = textFieldColors;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i7 = Fields.RenderEffect;
                        i3 |= i7;
                    }
                } else {
                    shape2 = shape;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i6 = 1048576;
                        i3 |= i6;
                    }
                } else {
                    f3 = f;
                }
                i6 = Fields.BlendMode;
                i3 |= i6;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & Fields.SpotShadowColor) == 0) {
                    f4 = f2;
                    if (startRestartGroup.changed(f4)) {
                        i5 = GroupFlagsKt.IsNodeFlag;
                        i3 |= i5;
                    }
                } else {
                    f4 = f2;
                }
                i5 = 4194304;
                i3 |= i5;
            } else {
                f4 = f2;
            }
            if ((i2 & Fields.RotationX) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
            }
            if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                textFieldColors3 = textFieldColors2;
                shape3 = shape2;
                f5 = f3;
                f6 = f4;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i9 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 16) != 0) {
                        textFieldColors4 = colors(startRestartGroup, (i3 >> 24) & 14);
                        i3 &= -57345;
                    } else {
                        textFieldColors4 = textFieldColors2;
                    }
                    if ((i2 & 32) != 0) {
                        shape4 = INSTANCE.getShape(startRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        f7 = FocusedBorderThickness;
                        i3 &= -3670017;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        shape5 = shape4;
                        f9 = UnfocusedBorderThickness;
                        modifier4 = modifier5;
                        i4 = i3 & (-29360129);
                        textFieldColors5 = textFieldColors4;
                        f8 = f7;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035477640, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
                        }
                        int i10 = i4 >> 6;
                        boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i10 & 14).getValue().booleanValue();
                        State<BorderStroke> m2990animateBorderStrokeAsStateNuRrP5Q = TextFieldImplKt.m2990animateBorderStrokeAsStateNuRrP5Q(z, z2, booleanValue, textFieldColors5, f8, f9, startRestartGroup, (i10 & 458752) | ((i4 >> 3) & 7168) | (i4 & 126) | (57344 & i10));
                        Modifier modifier6 = modifier4;
                        Shape shape6 = shape5;
                        final State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(textFieldColors5.m2522containerColorXeAY9LY$material3(z, z2, booleanValue), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                        composer2 = startRestartGroup;
                        BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier6, m2990animateBorderStrokeAsStateNuRrP5Q.getValue(), shape6), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(m100animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                            @Override // defpackage.w20
                            public Object get() {
                                return ((State) this.receiver).getValue();
                            }
                        }), shape6), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f8;
                        f6 = f9;
                        shape3 = shape6;
                        textFieldColors3 = textFieldColors5;
                        modifier3 = modifier6;
                    } else {
                        modifier4 = modifier5;
                        i4 = i3;
                        textFieldColors5 = textFieldColors4;
                        shape5 = shape4;
                        f8 = f7;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        i3 &= -29360129;
                    }
                    i4 = i3;
                    textFieldColors5 = textFieldColors2;
                    f8 = f3;
                    shape5 = shape2;
                    modifier4 = modifier2;
                }
                f9 = f4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i4 >> 6;
                boolean booleanValue2 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i102 & 14).getValue().booleanValue();
                State<BorderStroke> m2990animateBorderStrokeAsStateNuRrP5Q2 = TextFieldImplKt.m2990animateBorderStrokeAsStateNuRrP5Q(z, z2, booleanValue2, textFieldColors5, f8, f9, startRestartGroup, (i102 & 458752) | ((i4 >> 3) & 7168) | (i4 & 126) | (57344 & i102));
                Modifier modifier62 = modifier4;
                Shape shape62 = shape5;
                final Object m100animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(textFieldColors5.m2522containerColorXeAY9LY$material3(z, z2, booleanValue2), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                composer2 = startRestartGroup;
                BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier62, m2990animateBorderStrokeAsStateNuRrP5Q2.getValue(), shape62), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(m100animateColorAsStateeuL9pac2) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                    @Override // defpackage.w20
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape62), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = f8;
                f6 = f9;
                shape3 = shape62;
                textFieldColors3 = textFieldColors5;
                modifier3 = modifier62;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new ae0(this, z, z2, interactionSource, modifier3, textFieldColors3, shape3, f5, f6, i, i2, 0));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((i2 & Fields.RotationX) == 0) {
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        if ((r27 & 64) != 0) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d9  */
    @er
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2242ContainerBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        final TextFieldColors textFieldColors3;
        final Shape shape3;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1461761386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                interactionSource2 = interactionSource;
                i3 |= startRestartGroup.changed(interactionSource2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        textFieldColors2 = textFieldColors;
                        if (startRestartGroup.changed(textFieldColors2)) {
                            i7 = Fields.CameraDistance;
                            i3 |= i7;
                        }
                    } else {
                        textFieldColors2 = textFieldColors;
                    }
                    i7 = Fields.RotationZ;
                    i3 |= i7;
                } else {
                    textFieldColors2 = textFieldColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i6 = Fields.Clip;
                            i3 |= i6;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        f3 = f;
                        if (startRestartGroup.changed(f3)) {
                            i5 = Fields.RenderEffect;
                            i3 |= i5;
                        }
                    } else {
                        f3 = f;
                    }
                    i5 = 65536;
                    i3 |= i5;
                } else {
                    f3 = f;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        f4 = f2;
                        if (startRestartGroup.changed(f4)) {
                            i4 = 1048576;
                            i3 |= i4;
                        }
                    } else {
                        f4 = f2;
                    }
                    i4 = Fields.BlendMode;
                    i3 |= i4;
                } else {
                    f4 = f2;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 8) != 0) {
                            textFieldColors2 = colors(startRestartGroup, (i3 >> 21) & 14);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = INSTANCE.getShape(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            f3 = FocusedBorderThickness;
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            f4 = UnfocusedBorderThickness;
                            i3 &= -3670017;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1461761386, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1482)");
                        }
                        int i8 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                        int i9 = i3 << 3;
                        int i10 = i8 | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024);
                        InteractionSource interactionSource3 = interactionSource2;
                        textFieldColors3 = textFieldColors2;
                        shape3 = shape2;
                        f5 = f3;
                        f6 = f4;
                        m2241Container4EFweAY(z3, z2, interactionSource3, Modifier.Companion, textFieldColors3, shape3, f5, f6, startRestartGroup, i10, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    textFieldColors3 = textFieldColors2;
                    shape3 = shape2;
                    f5 = f3;
                    f6 = f4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: ce0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 ContainerBox_nbWgWpA$lambda$7;
                            int intValue = ((Integer) obj2).intValue();
                            ContainerBox_nbWgWpA$lambda$7 = OutlinedTextFieldDefaults.ContainerBox_nbWgWpA$lambda$7(OutlinedTextFieldDefaults.this, z, z2, interactionSource, textFieldColors3, shape3, f5, f6, i, i2, (Composer) obj, intValue);
                            return ContainerBox_nbWgWpA$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            interactionSource2 = interactionSource;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        interactionSource2 = interactionSource;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final my myVar, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, my myVar8, TextFieldColors textFieldColors, PaddingValues paddingValues, my myVar9, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        final boolean z4;
        int i8;
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
        Composer composer2;
        final my myVar10;
        final my myVar11;
        final my myVar12;
        final my myVar13;
        final my myVar14;
        final my myVar15;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        final my myVar16;
        final boolean z5;
        final my myVar17;
        ScopeUpdateScope endRestartGroup;
        my myVar18;
        my myVar19;
        my myVar20;
        my myVar21;
        final TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        final my myVar22;
        my myVar23;
        int i23;
        my myVar24;
        my myVar25;
        boolean z6;
        boolean z7;
        Object rememberedValue;
        my myVar26;
        ComposableLambda composableLambda;
        Composer startRestartGroup = composer.startRestartGroup(-1732281618);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
            i5 = i3 & 4;
            int i24 = Fields.SpotShadowColor;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
            }
            i6 = i3 & 8;
            int i25 = Fields.RotationZ;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                int i26 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? Fields.Clip : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                int i27 = Fields.BlendMode;
                if (i7 != 0) {
                    i4 |= 1572864;
                    z4 = z3;
                } else {
                    z4 = z3;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar2) ? 8388608 : 4194304;
                }
                i9 = i3 & Fields.RotationX;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i10 = i9;
                    i4 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    i11 = i3 & Fields.RotationY;
                    if (i11 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i12 = i11;
                        i4 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i13 = i3 & Fields.RotationZ;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (startRestartGroup.changedInstance(myVar5) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & Fields.CameraDistance;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i28 = i15;
                        i18 = i3 & Fields.TransformOrigin;
                        if (i18 != 0) {
                            i19 = i28 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (startRestartGroup.changedInstance(myVar7)) {
                                i24 = 256;
                            }
                            i19 = i28 | i24;
                        } else {
                            i19 = i28;
                        }
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                            i21 = i19 | 3072;
                        } else {
                            int i29 = i19;
                            if ((i2 & 3072) == 0) {
                                if (startRestartGroup.changedInstance(myVar8)) {
                                    i25 = 2048;
                                }
                                i21 = i29 | i25;
                            } else {
                                i21 = i29;
                            }
                        }
                        if ((i2 & 24576) == 0) {
                            if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i26 = Fields.Clip;
                            }
                            i21 |= i26;
                        }
                        if ((i2 & 196608) == 0) {
                            i21 |= ((i3 & Fields.CompositingStrategy) == 0 && startRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                        }
                        i22 = i3 & 65536;
                        if (i22 != 0) {
                            i21 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (startRestartGroup.changedInstance(myVar9)) {
                                i27 = 1048576;
                            }
                            i21 |= i27;
                        }
                        if ((i3 & Fields.RenderEffect) != 0) {
                            i21 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i21 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i21 & 4793491) != 4793490, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i7 != 0) {
                                    z4 = false;
                                }
                                my myVar27 = i8 != 0 ? null : myVar2;
                                myVar18 = i10 != 0 ? null : myVar3;
                                myVar19 = i12 != 0 ? null : myVar4;
                                myVar20 = i14 != 0 ? null : myVar5;
                                myVar21 = i17 != 0 ? null : myVar6;
                                my myVar28 = i18 != 0 ? null : myVar7;
                                my myVar29 = i20 != 0 ? null : myVar8;
                                if ((i3 & Fields.Clip) != 0) {
                                    textFieldColors3 = colors(startRestartGroup, (i21 >> 21) & 14);
                                    i21 &= -57345;
                                } else {
                                    textFieldColors3 = textFieldColors;
                                }
                                if ((i3 & Fields.CompositingStrategy) != 0) {
                                    paddingValues3 = m2240contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i21 &= -458753;
                                } else {
                                    paddingValues3 = paddingValues;
                                }
                                if (i22 != 0) {
                                    my myVar30 = myVar27;
                                    textFieldColors4 = textFieldColors3;
                                    paddingValues4 = paddingValues3;
                                    myVar23 = ComposableLambdaKt.rememberComposableLambda(-896270173, true, new my() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                        public final void invoke(Composer composer3, int i30) {
                                            if (!composer3.shouldExecute((i30 & 3) != 2, i30 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-896270173, i30, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1157)");
                                            }
                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                            outlinedTextFieldDefaults.m2241Container4EFweAY(z, z4, interactionSource, Modifier.Companion, textFieldColors3, outlinedTextFieldDefaults.getShape(composer3, 6), outlinedTextFieldDefaults.m2245getFocusedBorderThicknessD9Ej5fM(), outlinedTextFieldDefaults.m2248getUnfocusedBorderThicknessD9Ej5fM(), composer3, 114822144, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54);
                                    z6 = true;
                                    i23 = i21;
                                    myVar24 = myVar28;
                                    myVar25 = myVar29;
                                    myVar22 = myVar30;
                                    boolean z8 = z4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1732281618, i4, i23, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
                                    }
                                    z7 = ((i4 & 14) != 4 ? z6 : false) | ((i4 & 57344) == 16384);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z7 || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0));
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    String text = ((TransformedText) rememberedValue).getText().getText();
                                    int i30 = i23;
                                    TextFieldType textFieldType = TextFieldType.Outlined;
                                    TextFieldLabelPosition.Attached attached = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                    if (myVar22 != null) {
                                        startRestartGroup.startReplaceGroup(1927058812);
                                        startRestartGroup.endReplaceGroup();
                                        myVar26 = myVar22;
                                        composableLambda = null;
                                    } else {
                                        startRestartGroup.startReplaceGroup(1927058813);
                                        myVar26 = myVar22;
                                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1459717586, true, new ny() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2$1
                                            public final void invoke(TextFieldLabelScope textFieldLabelScope, Composer composer3, int i31) {
                                                if (!composer3.shouldExecute((i31 & 17) != 16, i31 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1459717586, i31, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1182)");
                                                }
                                                my.this.invoke(composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.ny
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                invoke((TextFieldLabelScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54);
                                        startRestartGroup.endReplaceGroup();
                                        composableLambda = rememberComposableLambda;
                                    }
                                    int i31 = i4 >> 9;
                                    int i32 = i30 << 21;
                                    int i33 = ((i4 << 3) & 896) | 6 | (i31 & 458752) | (i31 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | (i32 & 1879048192);
                                    int i34 = (i31 & 7168) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | ((i4 >> 3) & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                                    composer2 = startRestartGroup;
                                    my myVar31 = myVar18;
                                    my myVar32 = myVar19;
                                    my myVar33 = myVar20;
                                    my myVar34 = myVar21;
                                    TextFieldImplKt.CommonDecorationBox(textFieldType, text, myVar, attached, composableLambda, myVar31, myVar32, myVar33, myVar34, myVar24, myVar25, z2, z, z8, interactionSource, paddingValues4, textFieldColors4, myVar23, composer2, i33, i34);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    myVar17 = myVar24;
                                    myVar15 = myVar25;
                                    paddingValues2 = paddingValues4;
                                    myVar16 = myVar23;
                                    myVar13 = myVar33;
                                    myVar14 = myVar34;
                                    myVar11 = myVar31;
                                    myVar12 = myVar32;
                                    z5 = z8;
                                    textFieldColors2 = textFieldColors4;
                                    myVar10 = myVar26;
                                } else {
                                    textFieldColors4 = textFieldColors3;
                                    paddingValues4 = paddingValues3;
                                    myVar22 = myVar27;
                                    myVar23 = myVar9;
                                    i23 = i21;
                                    myVar24 = myVar28;
                                    myVar25 = myVar29;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.Clip) != 0) {
                                    i21 &= -57345;
                                }
                                if ((i3 & Fields.CompositingStrategy) != 0) {
                                    i21 &= -458753;
                                }
                                myVar22 = myVar2;
                                myVar18 = myVar3;
                                myVar19 = myVar4;
                                myVar20 = myVar5;
                                myVar21 = myVar6;
                                myVar24 = myVar7;
                                myVar25 = myVar8;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                myVar23 = myVar9;
                                i23 = i21;
                            }
                            z6 = true;
                            boolean z82 = z4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z7 = ((i4 & 14) != 4 ? z6 : false) | ((i4 & 57344) == 16384);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z7) {
                            }
                            rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0));
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            String text2 = ((TransformedText) rememberedValue).getText().getText();
                            int i302 = i23;
                            TextFieldType textFieldType2 = TextFieldType.Outlined;
                            TextFieldLabelPosition.Attached attached2 = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                            if (myVar22 != null) {
                            }
                            int i312 = i4 >> 9;
                            int i322 = i302 << 21;
                            int i332 = ((i4 << 3) & 896) | 6 | (i312 & 458752) | (i312 & 3670016) | (i322 & 29360128) | (i322 & 234881024) | (i322 & 1879048192);
                            int i342 = (i312 & 7168) | ((i302 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | ((i4 >> 3) & 57344) | (i302 & 458752) | ((i302 << 6) & 3670016) | ((i302 << 3) & 29360128);
                            composer2 = startRestartGroup;
                            my myVar312 = myVar18;
                            my myVar322 = myVar19;
                            my myVar332 = myVar20;
                            my myVar342 = myVar21;
                            TextFieldImplKt.CommonDecorationBox(textFieldType2, text2, myVar, attached2, composableLambda, myVar312, myVar322, myVar332, myVar342, myVar24, myVar25, z2, z, z82, interactionSource, paddingValues4, textFieldColors4, myVar23, composer2, i332, i342);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            myVar17 = myVar24;
                            myVar15 = myVar25;
                            paddingValues2 = paddingValues4;
                            myVar16 = myVar23;
                            myVar13 = myVar332;
                            myVar14 = myVar342;
                            myVar11 = myVar312;
                            myVar12 = myVar322;
                            z5 = z82;
                            textFieldColors2 = textFieldColors4;
                            myVar10 = myVar26;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            myVar10 = myVar2;
                            myVar11 = myVar3;
                            myVar12 = myVar4;
                            myVar13 = myVar5;
                            myVar14 = myVar6;
                            myVar15 = myVar8;
                            textFieldColors2 = textFieldColors;
                            paddingValues2 = paddingValues;
                            myVar16 = myVar9;
                            z5 = z4;
                            myVar17 = myVar7;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: be0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 DecorationBox$lambda$3;
                                    int intValue = ((Integer) obj2).intValue();
                                    DecorationBox$lambda$3 = OutlinedTextFieldDefaults.DecorationBox$lambda$3(OutlinedTextFieldDefaults.this, str, myVar, z, z2, visualTransformation, interactionSource, z5, myVar10, myVar11, myVar12, myVar13, myVar14, myVar17, myVar15, textFieldColors2, paddingValues2, myVar16, i, i2, i3, (Composer) obj, intValue);
                                    return DecorationBox$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i12 = i11;
                    i13 = i3 & Fields.RotationZ;
                    if (i13 != 0) {
                    }
                    i16 = i3 & Fields.CameraDistance;
                    if (i16 != 0) {
                    }
                    int i282 = i15;
                    i18 = i3 & Fields.TransformOrigin;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    i22 = i3 & 65536;
                    if (i22 != 0) {
                    }
                    if ((i3 & Fields.RenderEffect) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i21 & 4793491) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & Fields.RotationY;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i3 & Fields.RotationZ;
                if (i13 != 0) {
                }
                i16 = i3 & Fields.CameraDistance;
                if (i16 != 0) {
                }
                int i2822 = i15;
                i18 = i3 & Fields.TransformOrigin;
                if (i18 != 0) {
                }
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                i22 = i3 & 65536;
                if (i22 != 0) {
                }
                if ((i3 & Fields.RenderEffect) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i21 & 4793491) != 4793490, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i262 = 8192;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i7 = i3 & 64;
            int i272 = Fields.BlendMode;
            if (i7 != 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & Fields.RotationY;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & Fields.RotationZ;
            if (i13 != 0) {
            }
            i16 = i3 & Fields.CameraDistance;
            if (i16 != 0) {
            }
            int i28222 = i15;
            i18 = i3 & Fields.TransformOrigin;
            if (i18 != 0) {
            }
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i22 = i3 & 65536;
            if (i22 != 0) {
            }
            if ((i3 & Fields.RenderEffect) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i21 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        int i242 = Fields.SpotShadowColor;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        int i252 = Fields.RotationZ;
        if (i6 == 0) {
        }
        int i2622 = 8192;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i7 = i3 & 64;
        int i2722 = Fields.BlendMode;
        if (i7 != 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & Fields.RotationY;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & Fields.RotationZ;
        if (i13 != 0) {
        }
        i16 = i3 & Fields.CameraDistance;
        if (i16 != 0) {
        }
        int i282222 = i15;
        i18 = i3 & Fields.TransformOrigin;
        if (i18 != 0) {
        }
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i22 = i3 & 65536;
        if (i22 != 0) {
        }
        if ((i3 & Fields.RenderEffect) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i21 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final TextFieldColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1215)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2243colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j43;
        TextSelectionColors textSelectionColors2;
        long m4797getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long j44 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU8 = (i6 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long m4797getUnspecified0d7_KjU9 = (i6 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i6 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        TextSelectionColors textSelectionColors3 = (i6 & Fields.RotationZ) != 0 ? null : textSelectionColors;
        long m4797getUnspecified0d7_KjU11 = (i6 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i6 & Fields.TransformOrigin) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        long m4797getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j13;
        long m4797getUnspecified0d7_KjU14 = (i6 & Fields.Clip) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j14;
        long m4797getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j15;
        long m4797getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j16;
        long m4797getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j17;
        long m4797getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j18;
        long m4797getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j19;
        long m4797getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j20;
        long m4797getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j21;
        long m4797getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j22;
        long m4797getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j23;
        long m4797getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j24;
        long m4797getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j25;
        long m4797getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j26;
        long m4797getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j27;
        long m4797getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j28;
        long m4797getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j29;
        long m4797getUnspecified0d7_KjU30 = (i6 & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j30;
        long m4797getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j31;
        long m4797getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j32;
        long m4797getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j33;
        long m4797getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j34;
        long m4797getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j35;
        long m4797getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j36;
        long m4797getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j37;
        long m4797getUnspecified0d7_KjU38 = (i7 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j38;
        long m4797getUnspecified0d7_KjU39 = (i7 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j39;
        long m4797getUnspecified0d7_KjU40 = (i7 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j40;
        long m4797getUnspecified0d7_KjU41 = (i7 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j41;
        long m4797getUnspecified0d7_KjU42 = (i7 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            j43 = m4797getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1317)");
        } else {
            j43 = m4797getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors m2523copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & 112).m2523copyejIjP34(j44, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, textSelectionColors2, m4797getUnspecified0d7_KjU11, m4797getUnspecified0d7_KjU12, m4797getUnspecified0d7_KjU13, m4797getUnspecified0d7_KjU14, m4797getUnspecified0d7_KjU15, m4797getUnspecified0d7_KjU16, m4797getUnspecified0d7_KjU17, m4797getUnspecified0d7_KjU18, m4797getUnspecified0d7_KjU19, m4797getUnspecified0d7_KjU20, m4797getUnspecified0d7_KjU21, m4797getUnspecified0d7_KjU22, m4797getUnspecified0d7_KjU23, m4797getUnspecified0d7_KjU24, m4797getUnspecified0d7_KjU25, m4797getUnspecified0d7_KjU26, m4797getUnspecified0d7_KjU27, m4797getUnspecified0d7_KjU28, m4797getUnspecified0d7_KjU29, m4797getUnspecified0d7_KjU30, m4797getUnspecified0d7_KjU31, m4797getUnspecified0d7_KjU32, m4797getUnspecified0d7_KjU33, m4797getUnspecified0d7_KjU34, m4797getUnspecified0d7_KjU35, m4797getUnspecified0d7_KjU36, m4797getUnspecified0d7_KjU37, m4797getUnspecified0d7_KjU38, m4797getUnspecified0d7_KjU39, m4797getUnspecified0d7_KjU40, m4797getUnspecified0d7_KjU41, j43);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2523copyejIjP34;
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2244contentPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m758PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    public final TextFieldDecorator decorator(TextFieldState textFieldState, final boolean z, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, TextFieldColors textFieldColors, PaddingValues paddingValues, my myVar7, Composer composer, int i, int i2, int i3) {
        OutlinedTextFieldDefaults outlinedTextFieldDefaults;
        final TextFieldColors textFieldColors2;
        final InteractionSource interactionSource2;
        boolean z3;
        my myVar8;
        TextFieldLabelPosition attached = (i3 & 32) != 0 ? new TextFieldLabelPosition.Attached(false, null, null, 7, null) : textFieldLabelPosition;
        ny nyVar2 = (i3 & 64) != 0 ? null : nyVar;
        my myVar9 = (i3 & Fields.SpotShadowColor) != 0 ? null : myVar;
        my myVar10 = (i3 & Fields.RotationX) != 0 ? null : myVar2;
        my myVar11 = (i3 & Fields.RotationY) != 0 ? null : myVar3;
        my myVar12 = (i3 & Fields.RotationZ) != 0 ? null : myVar4;
        my myVar13 = (i3 & Fields.CameraDistance) != 0 ? null : myVar5;
        my myVar14 = (i3 & Fields.TransformOrigin) != 0 ? null : myVar6;
        final boolean z4 = (i3 & 8192) != 0 ? false : z2;
        if ((i3 & Fields.Clip) != 0) {
            outlinedTextFieldDefaults = this;
            textFieldColors2 = outlinedTextFieldDefaults.colors(composer, (i2 >> 21) & 14);
        } else {
            outlinedTextFieldDefaults = this;
            textFieldColors2 = textFieldColors;
        }
        PaddingValues m2240contentPaddinga9UjIt4$default = (32768 & i3) != 0 ? m2240contentPaddinga9UjIt4$default(outlinedTextFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
        if ((i3 & 65536) != 0) {
            interactionSource2 = interactionSource;
            z3 = z4;
            myVar8 = ComposableLambdaKt.rememberComposableLambda(-163468598, true, new my() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$decorator$1
                public final void invoke(Composer composer2, int i4) {
                    if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-163468598, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:983)");
                    }
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                    outlinedTextFieldDefaults2.m2241Container4EFweAY(z, z4, interactionSource2, null, textFieldColors2, outlinedTextFieldDefaults2.getShape(composer2, 6), outlinedTextFieldDefaults2.m2245getFocusedBorderThicknessD9Ej5fM(), outlinedTextFieldDefaults2.m2248getUnfocusedBorderThicknessD9Ej5fM(), composer2, 114819072, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, composer, 54);
        } else {
            interactionSource2 = interactionSource;
            z3 = z4;
            myVar8 = myVar7;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-449059361, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator (TextFieldDefaults.kt:993)");
        }
        OutlinedTextFieldDefaults$decorator$2 outlinedTextFieldDefaults$decorator$2 = new OutlinedTextFieldDefaults$decorator$2(outputTransformation, textFieldState, textFieldLineLimits, attached, nyVar2, myVar9, myVar10, myVar11, myVar12, myVar13, myVar14, z, z3, interactionSource2, m2240contentPaddinga9UjIt4$default, textFieldColors2, myVar8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return outlinedTextFieldDefaults$decorator$2;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        TextFieldColors textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1365)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached$material3 = colorScheme.getDefaultOutlinedTextFieldColorsCached$material3();
        if (defaultOutlinedTextFieldColorsCached$material3 == null) {
            composer.startReplaceGroup(390452338);
            composer.endReplaceGroup();
            textFieldColors = null;
        } else {
            composer.startReplaceGroup(390452339);
            TextSelectionColors textSelectionColors = (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            if (!q10.b(defaultOutlinedTextFieldColorsCached$material3.getTextSelectionColors(), textSelectionColors)) {
                defaultOutlinedTextFieldColorsCached$material3 = TextFieldColors.m2521copyejIjP34$default(defaultOutlinedTextFieldColorsCached$material3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, textSelectionColors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1025, 2047, null);
                colorScheme.setDefaultOutlinedTextFieldColorsCached$material3(defaultOutlinedTextFieldColorsCached$material3);
            }
            composer.endReplaceGroup();
            textFieldColors = defaultOutlinedTextFieldColorsCached$material3;
        }
        if (textFieldColors == null) {
            composer.startReplaceGroup(-1788321191);
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.INSTANCE;
            long fromToken = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputColor());
            long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorInputColor());
            Color.Companion companion = Color.Companion;
            TextFieldColors textFieldColors2 = new TextFieldColors(fromToken, fromToken2, m4760copywmQWz5c$default, fromToken3, companion.m4796getTransparent0d7_KjU(), companion.m4796getTransparent0d7_KjU(), companion.m4796getTransparent0d7_KjU(), companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getOutlineColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLeadingIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getTrailingIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLabelColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getSupportingColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3(textFieldColors2);
            composer.endReplaceGroup();
            textFieldColors = textFieldColors2;
        } else {
            composer.startReplaceGroup(-1788515437);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2245getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2246getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2247getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:887)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2248getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }
}
