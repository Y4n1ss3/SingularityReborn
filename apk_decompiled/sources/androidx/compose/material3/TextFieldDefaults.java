package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
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
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
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
import defpackage.oc;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m7611constructorimpl(56.0f);
    private static final float MinWidth = Dp.m7611constructorimpl(280.0f);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(1.0f);
        UnfocusedIndicatorThickness = m7611constructorimpl;
        float m7611constructorimpl2 = Dp.m7611constructorimpl(2.0f);
        FocusedIndicatorThickness = m7611constructorimpl2;
        UnfocusedBorderThickness = m7611constructorimpl;
        FocusedBorderThickness = m7611constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContainerBox$lambda$7(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2, Composer composer, int i3) {
        textFieldDefaults.ContainerBox(z, z2, interactionSource, textFieldColors, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Container_4EFweAY$lambda$0(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        textFieldDefaults.m2586Container4EFweAY(z, z2, interactionSource, modifier, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DecorationBox$lambda$3(TextFieldDefaults textFieldDefaults, String str, my myVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, my myVar8, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, my myVar9, int i, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.DecorationBox(str, myVar, z, z2, visualTransformation, interactionSource, z3, myVar2, myVar3, myVar4, myVar5, myVar6, myVar7, myVar8, shape, textFieldColors, paddingValues, myVar9, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2576contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2588contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2577contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m2589contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: indicatorLine-AWlRVLg$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2580indicatorLineAWlRVLg$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            textFieldColors = null;
        }
        if ((i & 16) != 0) {
            shape = null;
        }
        if ((i & 32) != 0) {
            f = FocusedIndicatorThickness;
        }
        if ((i & 64) != 0) {
            f2 = UnfocusedIndicatorThickness;
        }
        return textFieldDefaults.m2596indicatorLineAWlRVLg(modifier, z, z2, interactionSource, textFieldColors, shape, f, f2);
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2581indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        if ((i & 16) != 0) {
            f = FocusedIndicatorThickness;
        }
        return textFieldDefaults.m2597indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedIndicatorThickness : f2);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2582outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m2598outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2583supportingTextPaddinga9UjIt4$material3$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m7611constructorimpl(0.0f);
        }
        return textFieldDefaults.m2599supportingTextPaddinga9UjIt4$material3(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2584textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2600textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2585textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m2601textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2586Container4EFweAY(boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        float f3;
        float f4;
        TextFieldColors textFieldColors2;
        Modifier modifier3;
        Composer composer2;
        Shape shape3;
        float f5;
        float f6;
        ScopeUpdateScope endRestartGroup;
        TextFieldColors textFieldColors3;
        Shape shape4;
        float f7;
        TextFieldColors textFieldColors4;
        Modifier modifier4;
        float f8;
        int i4;
        float f9;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-818661242);
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
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0 && startRestartGroup.changed(textFieldColors)) {
                    i8 = Fields.Clip;
                    i3 |= i8;
                }
                i8 = 8192;
                i3 |= i8;
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
                startRestartGroup.skipToGroupEnd();
                textFieldColors2 = textFieldColors;
                modifier3 = modifier2;
                composer2 = startRestartGroup;
                shape3 = shape2;
                f5 = f3;
                f6 = f4;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if ((i2 & 16) != 0) {
                        textFieldColors3 = colors(startRestartGroup, (i3 >> 24) & 14);
                        i3 &= -57345;
                    } else {
                        textFieldColors3 = textFieldColors;
                    }
                    if ((i2 & 32) != 0) {
                        shape4 = INSTANCE.getShape(startRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        f7 = FocusedIndicatorThickness;
                        i3 &= -3670017;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        int i10 = i3 & (-29360129);
                        textFieldColors4 = textFieldColors3;
                        modifier4 = modifier2;
                        f8 = f7;
                        i4 = i10;
                        f9 = UnfocusedIndicatorThickness;
                    } else {
                        int i11 = i3;
                        textFieldColors4 = textFieldColors3;
                        modifier4 = modifier2;
                        f8 = f7;
                        i4 = i11;
                        f9 = f4;
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
                    modifier4 = modifier2;
                    shape4 = shape2;
                    f8 = f3;
                    f9 = f4;
                    i4 = i3;
                    textFieldColors4 = textFieldColors;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-818661242, i4, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:241)");
                }
                final State<Color> m100animateColorAsStateeuL9pac = SingleValueAnimationKt.m100animateColorAsStateeuL9pac(textFieldColors4.m2522containerColorXeAY9LY$material3(z, z2, FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i4 >> 6) & 14).getValue().booleanValue()), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
                Modifier textFieldBackground = TextFieldImplKt.textFieldBackground(modifier4, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(m100animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    @Override // defpackage.w20
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape4);
                Modifier modifier5 = modifier4;
                TextFieldColors textFieldColors5 = textFieldColors4;
                Shape shape5 = shape4;
                float f10 = f8;
                float f11 = f9;
                BoxKt.Box(m2596indicatorLineAWlRVLg(textFieldBackground, z, z2, interactionSource, textFieldColors5, shape5, f10, f11), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = startRestartGroup;
                f6 = f11;
                f5 = f10;
                shape3 = shape5;
                textFieldColors2 = textFieldColors5;
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new ae0(this, z, z2, interactionSource, modifier3, textFieldColors2, shape3, f5, f6, i, i2, 1));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        if ((r28 & 16) != 0) goto L77;
     */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ContainerBox(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        TextFieldDefaults textFieldDefaults;
        Composer composer2;
        Shape shape3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(918564008);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(z4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            interactionSource2 = interactionSource;
        } else {
            interactionSource2 = interactionSource;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(interactionSource2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            textFieldColors2 = textFieldColors;
        } else {
            textFieldColors2 = textFieldColors;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(textFieldColors2) ? Fields.CameraDistance : Fields.RotationZ;
            }
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i4 = Fields.Clip;
                    i3 |= i4;
                }
            } else {
                shape2 = shape;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            shape2 = shape;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            textFieldDefaults = this;
        } else {
            textFieldDefaults = this;
            if ((i & 196608) == 0) {
                i3 |= startRestartGroup.changed(textFieldDefaults) ? Fields.RenderEffect : 65536;
            }
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -57345;
                }
                Shape shape4 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(918564008, i3, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:761)");
                }
                int i5 = i3 << 3;
                composer2 = startRestartGroup;
                textFieldDefaults.m2586Container4EFweAY(z3, z4, interactionSource2, Modifier.Companion, textFieldColors2, shape4, FocusedIndicatorThickness, UnfocusedIndicatorThickness, composer2, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896) | (57344 & i5) | (i5 & 458752) | ((i3 << 9) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            shape3 = shape2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oc(this, z, z2, interactionSource, textFieldColors, shape3, i, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final my myVar, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, my myVar8, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, my myVar9, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        my myVar10;
        int i5;
        boolean z4;
        int i6;
        InteractionSource interactionSource2;
        int i7;
        boolean z5;
        int i8;
        my myVar11;
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
        Composer composer2;
        final my myVar12;
        final my myVar13;
        final my myVar14;
        final my myVar15;
        final my myVar16;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        final my myVar17;
        final boolean z6;
        final my myVar18;
        final my myVar19;
        ScopeUpdateScope endRestartGroup;
        my myVar20;
        my myVar21;
        Shape shape3;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        PaddingValues paddingValues4;
        my myVar22;
        my myVar23;
        TextFieldColors textFieldColors4;
        final my myVar24;
        int i22;
        my myVar25;
        my myVar26;
        my myVar27;
        PaddingValues paddingValues5;
        my myVar28;
        String str2;
        ComposableLambda composableLambda;
        Composer startRestartGroup = composer.startRestartGroup(1806980801);
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
            myVar10 = myVar;
            i4 |= startRestartGroup.changedInstance(myVar10) ? 32 : 16;
            i5 = i3 & 4;
            int i23 = Fields.RotationX;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i4 |= startRestartGroup.changed(z4) ? 256 : Fields.SpotShadowColor;
                i6 = i3 & 8;
                int i24 = Fields.RotationZ;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    int i25 = 8192;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(visualTransformation) ? Fields.Clip : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        interactionSource2 = interactionSource;
                        i4 |= startRestartGroup.changed(interactionSource2) ? 131072 : 65536;
                        i7 = i3 & 64;
                        int i26 = Fields.BlendMode;
                        if (i7 != 0) {
                            i4 |= 1572864;
                            z5 = z3;
                        } else {
                            z5 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                            }
                        }
                        i8 = i3 & Fields.SpotShadowColor;
                        if (i8 != 0) {
                            i4 |= 12582912;
                            myVar11 = myVar2;
                        } else {
                            myVar11 = myVar2;
                            if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changedInstance(myVar11) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i3 & Fields.RotationX;
                        int i27 = GroupFlagsKt.HasAuxSlotFlag;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar3) ? 67108864 : 33554432;
                        }
                        i10 = i3 & Fields.RotationY;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i12 = i3 & Fields.RotationZ;
                            if (i12 == 0) {
                                i14 = i2 | 6;
                                i13 = i12;
                            } else if ((i2 & 6) == 0) {
                                i13 = i12;
                                i14 = i2 | (startRestartGroup.changedInstance(myVar5) ? 4 : 2);
                            } else {
                                i13 = i12;
                                i14 = i2;
                            }
                            i15 = i3 & Fields.CameraDistance;
                            if (i15 == 0) {
                                i14 |= 48;
                                i16 = i15;
                            } else if ((i2 & 48) == 0) {
                                i16 = i15;
                                i14 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
                            } else {
                                i16 = i15;
                            }
                            int i28 = i14;
                            i17 = i3 & Fields.TransformOrigin;
                            if (i17 == 0) {
                                i18 = i28 | 384;
                            } else if ((i2 & 384) == 0) {
                                if (!startRestartGroup.changedInstance(myVar7)) {
                                    i23 = Fields.SpotShadowColor;
                                }
                                i18 = i28 | i23;
                            } else {
                                i18 = i28;
                            }
                            i19 = i3 & 8192;
                            if (i19 == 0) {
                                i20 = i18 | 3072;
                            } else {
                                i20 = i18;
                                if ((i2 & 3072) == 0) {
                                    if (startRestartGroup.changedInstance(myVar8)) {
                                        i24 = 2048;
                                    }
                                    i20 |= i24;
                                    if ((i2 & 24576) == 0) {
                                        if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(shape)) {
                                            i25 = Fields.Clip;
                                        }
                                        i20 |= i25;
                                    }
                                    if ((i2 & 196608) == 0) {
                                        i20 |= ((i3 & Fields.CompositingStrategy) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                                    }
                                    if ((i2 & 1572864) == 0) {
                                        if ((i3 & 65536) == 0 && startRestartGroup.changed(paddingValues)) {
                                            i26 = 1048576;
                                        }
                                        i20 |= i26;
                                    }
                                    i21 = i3 & Fields.RenderEffect;
                                    if (i21 != 0) {
                                        i20 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i20 |= startRestartGroup.changedInstance(myVar9) ? 8388608 : 4194304;
                                    }
                                    if ((i3 & Fields.ColorFilter) != 0) {
                                        i20 |= 100663296;
                                    } else if ((i2 & 100663296) == 0) {
                                        if (startRestartGroup.changed(this)) {
                                            i27 = 67108864;
                                        }
                                        i20 |= i27;
                                    }
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            if (i7 != 0) {
                                                z5 = false;
                                            }
                                            if (i8 != 0) {
                                                myVar11 = null;
                                            }
                                            my myVar29 = i9 != 0 ? null : myVar3;
                                            myVar20 = i11 != 0 ? null : myVar4;
                                            my myVar30 = i13 != 0 ? null : myVar5;
                                            my myVar31 = i16 != 0 ? null : myVar6;
                                            myVar21 = i17 != 0 ? null : myVar7;
                                            my myVar32 = i19 != 0 ? null : myVar8;
                                            if ((i3 & Fields.Clip) != 0) {
                                                shape3 = INSTANCE.getShape(startRestartGroup, 6);
                                                i20 &= -57345;
                                            } else {
                                                shape3 = shape;
                                            }
                                            if ((i3 & Fields.CompositingStrategy) != 0) {
                                                textFieldColors3 = colors(startRestartGroup, (i20 >> 24) & 14);
                                                i20 &= -458753;
                                            } else {
                                                textFieldColors3 = textFieldColors;
                                            }
                                            if ((i3 & 65536) != 0) {
                                                paddingValues3 = myVar11 == null ? m2577contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : m2576contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                                i20 &= -3670017;
                                            } else {
                                                paddingValues3 = paddingValues;
                                            }
                                            if (i21 != 0) {
                                                final TextFieldColors textFieldColors5 = textFieldColors3;
                                                final Shape shape4 = shape3;
                                                final boolean z7 = z5;
                                                final boolean z8 = z4;
                                                final InteractionSource interactionSource3 = interactionSource2;
                                                my myVar33 = new my() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$1
                                                    public final void invoke(Composer composer3, int i29) {
                                                        if (!composer3.shouldExecute((i29 & 3) != 2, i29 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(417908150, i29, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:390)");
                                                        }
                                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                        textFieldDefaults.m2586Container4EFweAY(z8, z7, interactionSource3, Modifier.Companion, textFieldColors5, shape4, textFieldDefaults.m2591getFocusedIndicatorThicknessD9Ej5fM(), textFieldDefaults.m2595getUnfocusedIndicatorThicknessD9Ej5fM(), composer3, 114822144, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                };
                                                paddingValues4 = paddingValues3;
                                                myVar22 = myVar29;
                                                textFieldColors4 = textFieldColors3;
                                                myVar24 = myVar11;
                                                myVar23 = ComposableLambdaKt.rememberComposableLambda(417908150, true, myVar33, startRestartGroup, 54);
                                            } else {
                                                paddingValues4 = paddingValues3;
                                                myVar22 = myVar29;
                                                myVar23 = myVar9;
                                                textFieldColors4 = textFieldColors3;
                                                myVar24 = myVar11;
                                            }
                                            i22 = i20;
                                            myVar25 = myVar30;
                                            myVar26 = myVar32;
                                            myVar27 = myVar31;
                                            paddingValues5 = paddingValues4;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & Fields.Clip) != 0) {
                                                i20 &= -57345;
                                            }
                                            if ((i3 & Fields.CompositingStrategy) != 0) {
                                                i20 &= -458753;
                                            }
                                            if ((i3 & 65536) != 0) {
                                                i20 &= -3670017;
                                            }
                                            myVar22 = myVar3;
                                            myVar20 = myVar4;
                                            myVar25 = myVar5;
                                            myVar27 = myVar6;
                                            myVar21 = myVar7;
                                            shape3 = shape;
                                            textFieldColors4 = textFieldColors;
                                            paddingValues5 = paddingValues;
                                            myVar23 = myVar9;
                                            myVar24 = myVar11;
                                            i22 = i20;
                                            myVar26 = myVar8;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1806980801, i4, i22, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)");
                                        }
                                        int i29 = i22;
                                        boolean z9 = ((i4 & 14) == 4) | ((i4 & 57344) == 16384);
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0));
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        String text = ((TransformedText) rememberedValue).getText().getText();
                                        TextFieldType textFieldType = TextFieldType.Filled;
                                        TextFieldLabelPosition.Attached attached = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                        if (myVar24 == null) {
                                            startRestartGroup.startReplaceGroup(-1353131191);
                                            startRestartGroup.endReplaceGroup();
                                            myVar28 = myVar24;
                                            str2 = text;
                                            composableLambda = null;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-1353131190);
                                            myVar28 = myVar24;
                                            str2 = text;
                                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1110058497, true, new ny() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$2$1
                                                public final void invoke(TextFieldLabelScope textFieldLabelScope, Composer composer3, int i30) {
                                                    if (!composer3.shouldExecute((i30 & 17) != 16, i30 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1110058497, i30, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:415)");
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
                                        int i30 = i4 >> 9;
                                        int i31 = i29 << 21;
                                        composer2 = startRestartGroup;
                                        boolean z10 = z5;
                                        TextFieldImplKt.CommonDecorationBox(textFieldType, str2, myVar10, attached, composableLambda, myVar22, myVar20, myVar25, myVar27, myVar21, myVar26, z2, z, z10, interactionSource, paddingValues5, textFieldColors4, myVar23, composer2, ((i4 << 3) & 896) | 6 | (i30 & 458752) | (i30 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | (i31 & 1879048192), ((i29 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i30 & 7168) | ((i4 >> 3) & 57344) | ((i29 >> 3) & 458752) | ((i29 << 3) & 3670016) | (i29 & 29360128));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        myVar18 = myVar28;
                                        myVar19 = myVar22;
                                        myVar12 = myVar20;
                                        myVar13 = myVar25;
                                        myVar14 = myVar27;
                                        myVar15 = myVar21;
                                        myVar16 = myVar26;
                                        z6 = z10;
                                        paddingValues2 = paddingValues5;
                                        textFieldColors2 = textFieldColors4;
                                        myVar17 = myVar23;
                                        shape2 = shape3;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        myVar12 = myVar4;
                                        myVar13 = myVar5;
                                        myVar14 = myVar6;
                                        myVar15 = myVar7;
                                        myVar16 = myVar8;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        myVar17 = myVar9;
                                        z6 = z5;
                                        myVar18 = myVar11;
                                        myVar19 = myVar3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new my() { // from class: au0
                                            @Override // defpackage.my
                                            public final Object invoke(Object obj, Object obj2) {
                                                w01 DecorationBox$lambda$3;
                                                int intValue = ((Integer) obj2).intValue();
                                                DecorationBox$lambda$3 = TextFieldDefaults.DecorationBox$lambda$3(TextFieldDefaults.this, str, myVar, z, z2, visualTransformation, interactionSource, z6, myVar18, myVar19, myVar12, myVar13, myVar14, myVar15, myVar16, shape2, textFieldColors2, paddingValues2, myVar17, i, i2, i3, (Composer) obj, intValue);
                                                return DecorationBox$lambda$3;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((i2 & 24576) == 0) {
                            }
                            if ((i2 & 196608) == 0) {
                            }
                            if ((i2 & 1572864) == 0) {
                            }
                            i21 = i3 & Fields.RenderEffect;
                            if (i21 != 0) {
                            }
                            if ((i3 & Fields.ColorFilter) != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & Fields.RotationZ;
                        if (i12 == 0) {
                        }
                        i15 = i3 & Fields.CameraDistance;
                        if (i15 == 0) {
                        }
                        int i282 = i14;
                        i17 = i3 & Fields.TransformOrigin;
                        if (i17 == 0) {
                        }
                        i19 = i3 & 8192;
                        if (i19 == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i2 & 196608) == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        i21 = i3 & Fields.RenderEffect;
                        if (i21 != 0) {
                        }
                        if ((i3 & Fields.ColorFilter) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    interactionSource2 = interactionSource;
                    i7 = i3 & 64;
                    int i262 = Fields.BlendMode;
                    if (i7 != 0) {
                    }
                    i8 = i3 & Fields.SpotShadowColor;
                    if (i8 != 0) {
                    }
                    i9 = i3 & Fields.RotationX;
                    int i272 = GroupFlagsKt.HasAuxSlotFlag;
                    if (i9 != 0) {
                    }
                    i10 = i3 & Fields.RotationY;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & Fields.RotationZ;
                    if (i12 == 0) {
                    }
                    i15 = i3 & Fields.CameraDistance;
                    if (i15 == 0) {
                    }
                    int i2822 = i14;
                    i17 = i3 & Fields.TransformOrigin;
                    if (i17 == 0) {
                    }
                    i19 = i3 & 8192;
                    if (i19 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i21 = i3 & Fields.RenderEffect;
                    if (i21 != 0) {
                    }
                    if ((i3 & Fields.ColorFilter) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                int i252 = 8192;
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                interactionSource2 = interactionSource;
                i7 = i3 & 64;
                int i2622 = Fields.BlendMode;
                if (i7 != 0) {
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 != 0) {
                }
                i9 = i3 & Fields.RotationX;
                int i2722 = GroupFlagsKt.HasAuxSlotFlag;
                if (i9 != 0) {
                }
                i10 = i3 & Fields.RotationY;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & Fields.RotationZ;
                if (i12 == 0) {
                }
                i15 = i3 & Fields.CameraDistance;
                if (i15 == 0) {
                }
                int i28222 = i14;
                i17 = i3 & Fields.TransformOrigin;
                if (i17 == 0) {
                }
                i19 = i3 & 8192;
                if (i19 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i21 = i3 & Fields.RenderEffect;
                if (i21 != 0) {
                }
                if ((i3 & Fields.ColorFilter) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i3 & 8;
            int i242 = Fields.RotationZ;
            if (i6 != 0) {
            }
            int i2522 = 8192;
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            interactionSource2 = interactionSource;
            i7 = i3 & 64;
            int i26222 = Fields.BlendMode;
            if (i7 != 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i3 & Fields.RotationX;
            int i27222 = GroupFlagsKt.HasAuxSlotFlag;
            if (i9 != 0) {
            }
            i10 = i3 & Fields.RotationY;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & Fields.RotationZ;
            if (i12 == 0) {
            }
            i15 = i3 & Fields.CameraDistance;
            if (i15 == 0) {
            }
            int i282222 = i14;
            i17 = i3 & Fields.TransformOrigin;
            if (i17 == 0) {
            }
            i19 = i3 & 8192;
            if (i19 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i21 = i3 & Fields.RenderEffect;
            if (i21 != 0) {
            }
            if ((i3 & Fields.ColorFilter) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar10 = myVar;
        i5 = i3 & 4;
        int i232 = Fields.RotationX;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i3 & 8;
        int i2422 = Fields.RotationZ;
        if (i6 != 0) {
        }
        int i25222 = 8192;
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        interactionSource2 = interactionSource;
        i7 = i3 & 64;
        int i262222 = Fields.BlendMode;
        if (i7 != 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i3 & Fields.RotationX;
        int i272222 = GroupFlagsKt.HasAuxSlotFlag;
        if (i9 != 0) {
        }
        i10 = i3 & Fields.RotationY;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & Fields.RotationZ;
        if (i12 == 0) {
        }
        i15 = i3 & Fields.CameraDistance;
        if (i15 == 0) {
        }
        int i2822222 = i14;
        i17 = i3 & Fields.TransformOrigin;
        if (i17 == 0) {
        }
        i19 = i3 & 8192;
        if (i19 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i21 = i3 & Fields.RenderEffect;
        if (i21 != 0) {
        }
        if ((i3 & Fields.ColorFilter) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final TextFieldColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:478)");
        }
        TextFieldColors defaultTextFieldColors$material3 = defaultTextFieldColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors$material3;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2587colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
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
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:580)");
        } else {
            j43 = m4797getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors m2523copyejIjP34 = defaultTextFieldColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m2523copyejIjP34(j44, m4797getUnspecified0d7_KjU2, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, textSelectionColors2, m4797getUnspecified0d7_KjU11, m4797getUnspecified0d7_KjU12, m4797getUnspecified0d7_KjU13, m4797getUnspecified0d7_KjU14, m4797getUnspecified0d7_KjU15, m4797getUnspecified0d7_KjU16, m4797getUnspecified0d7_KjU17, m4797getUnspecified0d7_KjU18, m4797getUnspecified0d7_KjU19, m4797getUnspecified0d7_KjU20, m4797getUnspecified0d7_KjU21, m4797getUnspecified0d7_KjU22, m4797getUnspecified0d7_KjU23, m4797getUnspecified0d7_KjU24, m4797getUnspecified0d7_KjU25, m4797getUnspecified0d7_KjU26, m4797getUnspecified0d7_KjU27, m4797getUnspecified0d7_KjU28, m4797getUnspecified0d7_KjU29, m4797getUnspecified0d7_KjU30, m4797getUnspecified0d7_KjU31, m4797getUnspecified0d7_KjU32, m4797getUnspecified0d7_KjU33, m4797getUnspecified0d7_KjU34, m4797getUnspecified0d7_KjU35, m4797getUnspecified0d7_KjU36, m4797getUnspecified0d7_KjU37, m4797getUnspecified0d7_KjU38, m4797getUnspecified0d7_KjU39, m4797getUnspecified0d7_KjU40, m4797getUnspecified0d7_KjU41, j43);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2523copyejIjP34;
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2588contentPaddingWithLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m758PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2589contentPaddingWithoutLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m758PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    public final TextFieldDecorator decorator(TextFieldState textFieldState, final boolean z, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, TextFieldColors textFieldColors, PaddingValues paddingValues, my myVar7, Composer composer, int i, int i2, int i3) {
        TextFieldDefaults textFieldDefaults;
        final TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
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
            textFieldDefaults = this;
            textFieldColors2 = textFieldDefaults.colors(composer, (i2 >> 21) & 14);
        } else {
            textFieldDefaults = this;
            textFieldColors2 = textFieldColors;
        }
        if ((32768 & i3) != 0) {
            paddingValues2 = (nyVar2 == null || (attached instanceof TextFieldLabelPosition.Above)) ? m2577contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : m2576contentPaddingWithLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i3 & 65536) != 0) {
            interactionSource2 = interactionSource;
            z3 = z4;
            myVar8 = ComposableLambdaKt.rememberComposableLambda(245572296, true, new my() { // from class: androidx.compose.material3.TextFieldDefaults$decorator$1
                public final void invoke(Composer composer2, int i4) {
                    if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(245572296, i4, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:168)");
                    }
                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                    textFieldDefaults2.m2586Container4EFweAY(z, z4, interactionSource2, null, textFieldColors2, textFieldDefaults2.getShape(composer2, 6), textFieldDefaults2.m2591getFocusedIndicatorThicknessD9Ej5fM(), textFieldDefaults2.m2595getUnfocusedIndicatorThicknessD9Ej5fM(), composer2, 114819072, 8);
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
            ComposerKt.traceEventStart(320881373, i, i2, "androidx.compose.material3.TextFieldDefaults.decorator (TextFieldDefaults.kt:178)");
        }
        TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2 = new TextFieldDefaults$decorator$2(outputTransformation, textFieldState, textFieldLineLimits, attached, nyVar2, myVar9, myVar10, myVar11, myVar12, myVar13, myVar14, z, z3, interactionSource2, paddingValues2, textFieldColors2, myVar8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldDefaults$decorator$2;
    }

    public final TextFieldColors defaultTextFieldColors$material3(ColorScheme colorScheme, TextSelectionColors textSelectionColors) {
        TextFieldColors defaultTextFieldColorsCached$material3 = colorScheme.getDefaultTextFieldColorsCached$material3();
        if (defaultTextFieldColorsCached$material3 != null) {
            if (!q10.b(defaultTextFieldColorsCached$material3.getTextSelectionColors(), textSelectionColors)) {
                defaultTextFieldColorsCached$material3 = TextFieldColors.m2521copyejIjP34$default(defaultTextFieldColorsCached$material3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, textSelectionColors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1025, 2047, null);
                colorScheme.setDefaultTextFieldColorsCached$material3(defaultTextFieldColorsCached$material3);
            }
            if (defaultTextFieldColorsCached$material3 != null) {
                return defaultTextFieldColorsCached$material3;
            }
        }
        FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
        TextFieldColors textFieldColors = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), textSelectionColors, ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), filledTextFieldTokens.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), filledTextFieldTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), filledTextFieldTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), filledTextFieldTokens.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), filledTextFieldTokens.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
        colorScheme.setDefaultTextFieldColorsCached$material3(textFieldColors);
        return textFieldColors;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:790)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2590getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2591getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2592getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2593getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:782)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:68)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2594getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2595getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: indicatorLine-AWlRVLg, reason: not valid java name */
    public final Modifier m2596indicatorLineAWlRVLg(Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        return modifier.then(new IndicatorLineElement(z, z2, interactionSource, textFieldColors, shape, f, f2, null));
    }

    @er
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final /* synthetic */ Modifier m2597indicatorLinegv0btCI(Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2) {
        return m2596indicatorLineAWlRVLg(modifier, z, z2, interactionSource, textFieldColors, null, f, f2);
    }

    @er
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2598outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return OutlinedTextFieldDefaults.INSTANCE.m2244contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3, reason: not valid java name */
    public final PaddingValues m2599supportingTextPaddinga9UjIt4$material3(float f, float f2, float f3, float f4) {
        return PaddingKt.m758PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @er
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2600textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m2588contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    @er
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2601textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m2589contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    @er
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @er
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2578getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @er
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @er
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2579getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }
}
