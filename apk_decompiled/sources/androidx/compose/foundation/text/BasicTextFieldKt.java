package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ad;
import defpackage.cd;
import defpackage.d1;
import defpackage.dq;
import defpackage.ed;
import defpackage.er;
import defpackage.f1;
import defpackage.gd;
import defpackage.hd;
import defpackage.hm;
import defpackage.iy;
import defpackage.jb0;
import defpackage.k4;
import defpackage.ky;
import defpackage.mf;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.q10;
import defpackage.st;
import defpackage.un;
import defpackage.uo;
import defpackage.v4;
import defpackage.vn;
import defpackage.w01;
import defpackage.yc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles = DpKt.m7633DpSizeYgX7TsA(Dp.m7611constructorimpl(40.0f), Dp.m7611constructorimpl(40.0f));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
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
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        final my myVar2;
        final OutputTransformation outputTransformation2;
        final ScrollState scrollState2;
        final boolean z6;
        Composer composer2;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final InputTransformation inputTransformation3;
        final boolean z7;
        final Modifier modifier3;
        final boolean z8;
        final KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits textFieldLineLimits2;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final CodepointTransformation codepointTransformation2;
        final TextFieldDecorator textFieldDecorator2;
        ScopeUpdateScope endRestartGroup;
        KeyboardOptions keyboardOptions4;
        KeyboardActionHandler keyboardActionHandler3;
        TextFieldLineLimits textFieldLineLimits3;
        MutableInteractionSource mutableInteractionSource3;
        CodepointTransformation codepointTransformation3;
        ScrollState scrollState3;
        int i28;
        final TextStyle textStyle4;
        final TextFieldDecorator textFieldDecorator3;
        boolean z9;
        final my myVar3;
        final boolean z10;
        final Brush brush3;
        OutputTransformation outputTransformation3;
        final ScrollState scrollState4;
        int i29;
        boolean z11;
        MutableInteractionSource mutableInteractionSource4;
        final boolean z12;
        CodepointTransformation codepointTransformation4;
        final PlatformSelectionBehaviors platformSelectionBehaviors;
        un unVar;
        final TransformedTextFieldState transformedTextFieldState;
        InputTransformation inputTransformation4;
        TextFieldSelectionState textFieldSelectionState;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean changed;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(965149429);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i30 = i3 & 2;
        if (i30 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i4 |= startRestartGroup.changed(z4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 8;
                int i31 = Fields.RotationZ;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z5 = z2;
                    i4 |= startRestartGroup.changed(z5) ? Fields.CameraDistance : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        inputTransformation2 = inputTransformation;
                        i4 |= startRestartGroup.changed(inputTransformation2) ? Fields.Clip : 8192;
                        i8 = i3 & 32;
                        int i32 = Fields.RenderEffect;
                        if (i8 != 0) {
                            i4 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i & 196608) == 0) {
                                i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        int i33 = Fields.BlendMode;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & Fields.SpotShadowColor;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(keyboardActionHandler) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i11 = i3 & Fields.RotationX;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(textFieldLineLimits) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i13 = i3 & Fields.RotationY;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i14 = i13;
                                i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i15 = i3 & Fields.RotationZ;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & Fields.CameraDistance;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= startRestartGroup.changed(brush) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i34 = i17;
                                i20 = i3 & Fields.TransformOrigin;
                                if (i20 != 0) {
                                    i21 = i34 | 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 = i34 | (startRestartGroup.changed(codepointTransformation) ? Fields.RotationX : Fields.SpotShadowColor);
                                } else {
                                    i21 = i34;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i35 = i21;
                                    if ((i2 & 3072) == 0) {
                                        if (startRestartGroup.changed(outputTransformation)) {
                                            i31 = Fields.CameraDistance;
                                        }
                                        i23 = i35 | i31;
                                    } else {
                                        i23 = i35;
                                    }
                                }
                                i24 = i3 & Fields.Clip;
                                if (i24 != 0) {
                                    i25 = i23 | 24576;
                                } else {
                                    int i36 = i23;
                                    if ((i2 & 24576) == 0) {
                                        i25 = i36 | ((i2 & Fields.CompositingStrategy) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? Fields.Clip : 8192);
                                    } else {
                                        i25 = i36;
                                    }
                                }
                                if ((i2 & 196608) == 0) {
                                    if ((i3 & Fields.CompositingStrategy) != 0 || !startRestartGroup.changed(scrollState)) {
                                        i32 = 65536;
                                    }
                                    i25 |= i32;
                                }
                                i26 = i3 & 65536;
                                if (i26 != 0) {
                                    i25 |= 1572864;
                                } else if ((i2 & 1572864) == 0) {
                                    if (startRestartGroup.changed(z3)) {
                                        i33 = 1048576;
                                    }
                                    i25 |= i33;
                                }
                                i27 = i25;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i30 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        if (i6 != 0) {
                                            z5 = false;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        TextStyle textStyle5 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                                        keyboardOptions4 = i9 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions2;
                                        keyboardActionHandler3 = i10 != 0 ? null : keyboardActionHandler;
                                        textFieldLineLimits3 = i12 != 0 ? TextFieldLineLimits.Companion.getDefault() : textFieldLineLimits;
                                        my myVar4 = i14 != 0 ? null : myVar;
                                        mutableInteractionSource3 = i16 != 0 ? null : mutableInteractionSource;
                                        Brush cursorBrush = i19 != 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                        codepointTransformation3 = i20 != 0 ? null : codepointTransformation;
                                        OutputTransformation outputTransformation4 = i22 != 0 ? null : outputTransformation;
                                        TextFieldDecorator textFieldDecorator4 = i24 != 0 ? null : textFieldDecorator;
                                        if ((i3 & Fields.CompositingStrategy) != 0) {
                                            scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                            i28 = i27 & (-458753);
                                        } else {
                                            scrollState3 = scrollState;
                                            i28 = i27;
                                        }
                                        textStyle4 = textStyle5;
                                        textFieldDecorator3 = textFieldDecorator4;
                                        z9 = z4;
                                        myVar3 = myVar4;
                                        z10 = z5;
                                        brush3 = cursorBrush;
                                        outputTransformation3 = outputTransformation4;
                                        scrollState4 = scrollState3;
                                        i29 = i28;
                                        z11 = i26 != 0 ? false : z3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & Fields.CompositingStrategy) != 0) {
                                            textFieldLineLimits3 = textFieldLineLimits;
                                            myVar3 = myVar;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            brush3 = brush;
                                            codepointTransformation3 = codepointTransformation;
                                            textFieldDecorator3 = textFieldDecorator;
                                            scrollState4 = scrollState;
                                            z11 = z3;
                                            i29 = i27 & (-458753);
                                            textStyle4 = textStyle2;
                                            keyboardOptions4 = keyboardOptions2;
                                            z9 = z4;
                                            z10 = z5;
                                            keyboardActionHandler3 = keyboardActionHandler;
                                            outputTransformation3 = outputTransformation;
                                        } else {
                                            textFieldLineLimits3 = textFieldLineLimits;
                                            myVar3 = myVar;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            brush3 = brush;
                                            codepointTransformation3 = codepointTransformation;
                                            outputTransformation3 = outputTransformation;
                                            textFieldDecorator3 = textFieldDecorator;
                                            scrollState4 = scrollState;
                                            z11 = z3;
                                            i29 = i27;
                                            textStyle4 = textStyle2;
                                            keyboardOptions4 = keyboardOptions2;
                                            z9 = z4;
                                            z10 = z5;
                                            keyboardActionHandler3 = keyboardActionHandler;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(965149429, i4, i29, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:251)");
                                    }
                                    final Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    final boolean b = q10.b(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                                    if (mutableInteractionSource3 == null) {
                                        startRestartGroup.startReplaceGroup(-2038132442);
                                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-204294191);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    Orientation orientation = b ? Orientation.Horizontal : Orientation.Vertical;
                                    final boolean z16 = z11;
                                    boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                                    final boolean booleanValue2 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                                    if (booleanValue) {
                                        startRestartGroup.startReplaceGroup(-204276540);
                                        boolean isWindowFocused = ((WindowInfo) startRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused();
                                        startRestartGroup.endReplaceGroup();
                                        z12 = isWindowFocused;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-2037604207);
                                        startRestartGroup.endReplaceGroup();
                                        z12 = false;
                                    }
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    Composer.Companion companion = Composer.Companion;
                                    if (rememberedValue3 == companion.getEmpty()) {
                                        rememberedValue3 = p01.a(2, mf.f);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    jb0 jb0Var = (jb0) rememberedValue3;
                                    KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler3;
                                    boolean z17 = ((i4 & 14) == 4) | ((i29 & 896) == 256) | ((i29 & 7168) == 2048);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (z17 || rememberedValue4 == companion.getEmpty()) {
                                        if (codepointTransformation3 == null) {
                                            codepointTransformation4 = SingleLineCodepointTransformation.INSTANCE;
                                            if (!b) {
                                                codepointTransformation4 = null;
                                            }
                                        } else {
                                            codepointTransformation4 = codepointTransformation3;
                                        }
                                        rememberedValue4 = new TransformedTextFieldState(textFieldState, inputTransformation2, codepointTransformation4, outputTransformation3);
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    final TransformedTextFieldState transformedTextFieldState2 = (TransformedTextFieldState) rememberedValue4;
                                    boolean changed2 = startRestartGroup.changed(transformedTextFieldState2);
                                    OutputTransformation outputTransformation5 = outputTransformation3;
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (changed2 || rememberedValue5 == companion.getEmpty()) {
                                        rememberedValue5 = new TextLayoutState();
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    final TextLayoutState textLayoutState = (TextLayoutState) rememberedValue5;
                                    final KeyboardOptions fillUnspecifiedValuesWith$foundation = keyboardOptions4.fillUnspecifiedValuesWith$foundation(inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == companion.getEmpty()) {
                                        rememberedValue6 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    un unVar2 = (un) rememberedValue6;
                                    if (ComposeFoundationFlags.isSmartSelectionEnabled) {
                                        startRestartGroup.startReplaceGroup(-2035832304);
                                        LocaleList localeList = textStyle4.getLocaleList();
                                        if (localeList == null) {
                                            localeList = LocaleList.Companion.getCurrent();
                                        }
                                        PlatformSelectionBehaviors rememberPlatformSelectionBehaviors = PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.EditableText, localeList, startRestartGroup, 6);
                                        startRestartGroup.endReplaceGroup();
                                        platformSelectionBehaviors = rememberPlatformSelectionBehaviors;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-2035643855);
                                        startRestartGroup.endReplaceGroup();
                                        platformSelectionBehaviors = null;
                                    }
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == companion.getEmpty()) {
                                        rememberedValue7 = new ToolbarRequesterImpl();
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    final ToolbarRequesterImpl toolbarRequesterImpl = (ToolbarRequesterImpl) rememberedValue7;
                                    final Clipboard clipboard = (Clipboard) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboard());
                                    boolean changed3 = startRestartGroup.changed(transformedTextFieldState2);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (changed3 || rememberedValue8 == companion.getEmpty()) {
                                        rememberedValue8 = new TextFieldSelectionState(transformedTextFieldState2, textLayoutState, density, z9, z10, z12, z16, toolbarRequesterImpl, unVar2, platformSelectionBehaviors, clipboard);
                                        unVar = unVar2;
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    } else {
                                        unVar = unVar2;
                                    }
                                    final TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) rememberedValue8;
                                    int i37 = i29;
                                    final HapticFeedback hapticFeedback = (HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                    KeyboardOptions keyboardOptions5 = keyboardOptions4;
                                    TextToolbar textToolbar = (TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                                    boolean changed4 = startRestartGroup.changed(unVar) | startRestartGroup.changed(textToolbar);
                                    final TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits3;
                                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                                    final InputTransformation inputTransformation5 = inputTransformation2;
                                    if (changed4 || rememberedValue9 == companion.getEmpty()) {
                                        rememberedValue9 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(textToolbar, unVar);
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                    }
                                    final BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1) rememberedValue9;
                                    boolean changed5 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState2) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState2) | startRestartGroup.changedInstance(hapticFeedback) | startRestartGroup.changedInstance(clipboard) | startRestartGroup.changed(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1) | startRestartGroup.changed(density) | ((i4 & 7168) == 2048) | ((i37 & 3670016) == 1048576);
                                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (changed5 || rememberedValue10 == companion.getEmpty()) {
                                        final boolean z18 = z9;
                                        final boolean z19 = z10;
                                        rememberedValue10 = new iy() { // from class: bd
                                            @Override // defpackage.iy
                                            public final Object invoke() {
                                                w01 BasicTextField$lambda$11$0;
                                                BasicTextField$lambda$11$0 = BasicTextFieldKt.BasicTextField$lambda$11$0(TransformedTextFieldState.this, inputTransformation5, textFieldSelectionState2, hapticFeedback, clipboard, basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, density, z18, z19, z16);
                                                return BasicTextField$lambda$11$0;
                                            }
                                        };
                                        transformedTextFieldState = transformedTextFieldState2;
                                        inputTransformation4 = inputTransformation5;
                                        textFieldSelectionState = textFieldSelectionState2;
                                        z13 = z18;
                                        z14 = z16;
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                    } else {
                                        inputTransformation4 = inputTransformation5;
                                        textFieldSelectionState = textFieldSelectionState2;
                                        z14 = z16;
                                        transformedTextFieldState = transformedTextFieldState2;
                                        z13 = z9;
                                    }
                                    EffectsKt.SideEffect((iy) rememberedValue10, startRestartGroup, 0);
                                    boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                                    if (changedInstance || rememberedValue11 == companion.getEmpty()) {
                                        rememberedValue11 = new defpackage.h(textFieldSelectionState, 6);
                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                    }
                                    EffectsKt.DisposableEffect(textFieldSelectionState, (ky) rememberedValue11, startRestartGroup, 0);
                                    OverscrollEffect rememberTextFieldOverscrollEffect = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(startRestartGroup, 0);
                                    if (!z14) {
                                        int m1133getKeyboardTypePjHm6EE = keyboardOptions5.m1133getKeyboardTypePjHm6EE();
                                        KeyboardType.Companion companion2 = KeyboardType.Companion;
                                        if (!KeyboardType.m7281equalsimpl0(m1133getKeyboardTypePjHm6EE, companion2.m7300getPasswordPjHm6EE()) && !KeyboardType.m7281equalsimpl0(keyboardOptions5.m1133getKeyboardTypePjHm6EE(), companion2.m7299getNumberPasswordPjHm6EE())) {
                                            z15 = true;
                                            changed = startRestartGroup.changed(z15) | startRestartGroup.changedInstance(jb0Var);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue == companion.getEmpty()) {
                                                rememberedValue = new cd(0, z15, jb0Var);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            final boolean z20 = z13;
                                            final Orientation orientation2 = orientation;
                                            Modifier addContextMenuComponents = addContextMenuComponents(PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(StylusHandwritingKt.stylusHandwriting(modifier2, z13, z15, (iy) rememberedValue).then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation4, z20, z10, fillUnspecifiedValuesWith$foundation, keyboardActionHandler4, b, mutableInteractionSource4, z14, jb0Var)), scrollState4, orientation2, rememberTextFieldOverscrollEffect, !z20 && textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation, false), null, mutableInteractionSource4, null, 160, null), PointerIcon.Companion.getText(), false, 2, null), textFieldSelectionState, unVar);
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, addContextMenuComponents);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                            iy constructor = companion3.getConstructor();
                                            if (startRestartGroup.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.useNode();
                                            } else {
                                                startRestartGroup.createNode(constructor);
                                            }
                                            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                            uo.h(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                                            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z20, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new my() { // from class: dd
                                                @Override // defpackage.my
                                                public final Object invoke(Object obj, Object obj2) {
                                                    w01 BasicTextField$lambda$14$0;
                                                    int intValue = ((Integer) obj2).intValue();
                                                    BasicTextField$lambda$14$0 = BasicTextFieldKt.BasicTextField$lambda$14$0(TextFieldDecorator.this, textFieldLineLimits4, textLayoutState, textStyle4, z12, booleanValue2, transformedTextFieldState, textFieldSelectionState3, brush3, z20, z10, scrollState4, orientation2, toolbarRequesterImpl, platformSelectionBehaviors, b, myVar3, fillUnspecifiedValuesWith$foundation, (Composer) obj, intValue);
                                                    return BasicTextField$lambda$14$0;
                                                }
                                            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                                            startRestartGroup.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            z6 = z14;
                                            composer2 = startRestartGroup;
                                            keyboardActionHandler2 = keyboardActionHandler4;
                                            inputTransformation3 = inputTransformation4;
                                            z7 = z20;
                                            modifier3 = modifier2;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            outputTransformation2 = outputTransformation5;
                                            codepointTransformation2 = codepointTransformation3;
                                            keyboardOptions3 = keyboardOptions5;
                                            textFieldDecorator2 = textFieldDecorator3;
                                            textFieldLineLimits2 = textFieldLineLimits4;
                                            textStyle3 = textStyle4;
                                            brush2 = brush3;
                                            z8 = z10;
                                            scrollState2 = scrollState4;
                                            myVar2 = myVar3;
                                        }
                                    }
                                    z15 = false;
                                    changed = startRestartGroup.changed(z15) | startRestartGroup.changedInstance(jb0Var);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = new cd(0, z15, jb0Var);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    final boolean z202 = z13;
                                    final Orientation orientation22 = orientation;
                                    Modifier addContextMenuComponents2 = addContextMenuComponents(PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(StylusHandwritingKt.stylusHandwriting(modifier2, z13, z15, (iy) rememberedValue).then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation4, z202, z10, fillUnspecifiedValuesWith$foundation, keyboardActionHandler4, b, mutableInteractionSource4, z14, jb0Var)), scrollState4, orientation22, rememberTextFieldOverscrollEffect, !z202 && textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation, false), null, mutableInteractionSource4, null, 160, null), PointerIcon.Companion.getText(), false, 2, null), textFieldSelectionState, unVar);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, addContextMenuComponents2);
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.Companion;
                                    iy constructor2 = companion32.getConstructor();
                                    if (startRestartGroup.getApplier() == null) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                                    uo.h(companion32, m3878constructorimpl2, maybeCachedBoxMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion32, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    final TextFieldSelectionState textFieldSelectionState32 = textFieldSelectionState;
                                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z202, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new my() { // from class: dd
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 BasicTextField$lambda$14$0;
                                            int intValue = ((Integer) obj2).intValue();
                                            BasicTextField$lambda$14$0 = BasicTextFieldKt.BasicTextField$lambda$14$0(TextFieldDecorator.this, textFieldLineLimits4, textLayoutState, textStyle4, z12, booleanValue2, transformedTextFieldState, textFieldSelectionState32, brush3, z202, z10, scrollState4, orientation22, toolbarRequesterImpl, platformSelectionBehaviors, b, myVar3, fillUnspecifiedValuesWith$foundation, (Composer) obj, intValue);
                                            return BasicTextField$lambda$14$0;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                                    startRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z6 = z14;
                                    composer2 = startRestartGroup;
                                    keyboardActionHandler2 = keyboardActionHandler4;
                                    inputTransformation3 = inputTransformation4;
                                    z7 = z202;
                                    modifier3 = modifier2;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    outputTransformation2 = outputTransformation5;
                                    codepointTransformation2 = codepointTransformation3;
                                    keyboardOptions3 = keyboardOptions5;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    textStyle3 = textStyle4;
                                    brush2 = brush3;
                                    z8 = z10;
                                    scrollState2 = scrollState4;
                                    myVar2 = myVar3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    myVar2 = myVar;
                                    outputTransformation2 = outputTransformation;
                                    scrollState2 = scrollState;
                                    z6 = z3;
                                    composer2 = startRestartGroup;
                                    textStyle3 = textStyle2;
                                    keyboardOptions3 = keyboardOptions2;
                                    inputTransformation3 = inputTransformation2;
                                    z7 = z4;
                                    modifier3 = modifier2;
                                    z8 = z5;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    textFieldLineLimits2 = textFieldLineLimits;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    codepointTransformation2 = codepointTransformation;
                                    textFieldDecorator2 = textFieldDecorator;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: fd
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 BasicTextField$lambda$15;
                                            int intValue = ((Integer) obj2).intValue();
                                            BasicTextField$lambda$15 = BasicTextFieldKt.BasicTextField$lambda$15(TextFieldState.this, modifier3, z7, z8, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler2, textFieldLineLimits2, myVar2, mutableInteractionSource2, brush2, codepointTransformation2, outputTransformation2, textFieldDecorator2, scrollState2, z6, i, i2, i3, (Composer) obj, intValue);
                                            return BasicTextField$lambda$15;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i13;
                            i15 = i3 & Fields.RotationZ;
                            if (i15 != 0) {
                            }
                            i18 = i3 & Fields.CameraDistance;
                            if (i18 != 0) {
                            }
                            int i342 = i17;
                            i20 = i3 & Fields.TransformOrigin;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i3 & Fields.Clip;
                            if (i24 != 0) {
                            }
                            if ((i2 & 196608) == 0) {
                            }
                            i26 = i3 & 65536;
                            if (i26 != 0) {
                            }
                            i27 = i25;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & Fields.RotationY;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i3 & Fields.RotationZ;
                        if (i15 != 0) {
                        }
                        i18 = i3 & Fields.CameraDistance;
                        if (i18 != 0) {
                        }
                        int i3422 = i17;
                        i20 = i3 & Fields.TransformOrigin;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i3 & Fields.Clip;
                        if (i24 != 0) {
                        }
                        if ((i2 & 196608) == 0) {
                        }
                        i26 = i3 & 65536;
                        if (i26 != 0) {
                        }
                        i27 = i25;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i8 = i3 & 32;
                    int i322 = Fields.RenderEffect;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    int i332 = Fields.BlendMode;
                    if (i9 != 0) {
                    }
                    i10 = i3 & Fields.SpotShadowColor;
                    if (i10 != 0) {
                    }
                    i11 = i3 & Fields.RotationX;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & Fields.RotationY;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & Fields.RotationZ;
                    if (i15 != 0) {
                    }
                    i18 = i3 & Fields.CameraDistance;
                    if (i18 != 0) {
                    }
                    int i34222 = i17;
                    i20 = i3 & Fields.TransformOrigin;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i3 & Fields.Clip;
                    if (i24 != 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    i26 = i3 & 65536;
                    if (i26 != 0) {
                    }
                    i27 = i25;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i8 = i3 & 32;
                int i3222 = Fields.RenderEffect;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                int i3322 = Fields.BlendMode;
                if (i9 != 0) {
                }
                i10 = i3 & Fields.SpotShadowColor;
                if (i10 != 0) {
                }
                i11 = i3 & Fields.RotationX;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & Fields.RotationY;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i3 & Fields.RotationZ;
                if (i15 != 0) {
                }
                i18 = i3 & Fields.CameraDistance;
                if (i18 != 0) {
                }
                int i342222 = i17;
                i20 = i3 & Fields.TransformOrigin;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                i24 = i3 & Fields.Clip;
                if (i24 != 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                i26 = i3 & 65536;
                if (i26 != 0) {
                }
                i27 = i25;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i3 & 8;
            int i312 = Fields.RotationZ;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i3 & 32;
            int i32222 = Fields.RenderEffect;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            int i33222 = Fields.BlendMode;
            if (i9 != 0) {
            }
            i10 = i3 & Fields.SpotShadowColor;
            if (i10 != 0) {
            }
            i11 = i3 & Fields.RotationX;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & Fields.RotationY;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & Fields.RotationZ;
            if (i15 != 0) {
            }
            i18 = i3 & Fields.CameraDistance;
            if (i18 != 0) {
            }
            int i3422222 = i17;
            i20 = i3 & Fields.TransformOrigin;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            i24 = i3 & Fields.Clip;
            if (i24 != 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i26 = i3 & 65536;
            if (i26 != 0) {
            }
            i27 = i25;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i3 & 8;
        int i3122 = Fields.RotationZ;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i3 & 32;
        int i322222 = Fields.RenderEffect;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        int i332222 = Fields.BlendMode;
        if (i9 != 0) {
        }
        i10 = i3 & Fields.SpotShadowColor;
        if (i10 != 0) {
        }
        i11 = i3 & Fields.RotationX;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & Fields.RotationY;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & Fields.RotationZ;
        if (i15 != 0) {
        }
        i18 = i3 & Fields.CameraDistance;
        if (i18 != 0) {
        }
        int i34222222 = i17;
        i20 = i3 & Fields.TransformOrigin;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        i24 = i3 & Fields.Clip;
        if (i24 != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i26 = i3 & 65536;
        if (i26 != 0) {
        }
        i27 = i25;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i27 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$0(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, int i, int i2, int i3, Composer composer, int i4) {
        BasicTextField(textFieldState, modifier, z, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, myVar, mutableInteractionSource, brush, outputTransformation, textFieldDecorator, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$11$0(TransformedTextFieldState transformedTextFieldState, InputTransformation inputTransformation, TextFieldSelectionState textFieldSelectionState, HapticFeedback hapticFeedback, Clipboard clipboard, BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, Density density, boolean z, boolean z2, boolean z3) {
        transformedTextFieldState.update(inputTransformation);
        textFieldSelectionState.update(hapticFeedback, clipboard, basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, density, z, z2, z3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicTextField$lambda$12$0(final TextFieldSelectionState textFieldSelectionState, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$lambda$12$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                TextFieldSelectionState.this.dispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$13$0(boolean z, jb0 jb0Var) {
        w01 w01Var = w01.a;
        if (z) {
            jb0Var.b(w01Var);
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$14$0(TextFieldDecorator textFieldDecorator, final TextFieldLineLimits textFieldLineLimits, final TextLayoutState textLayoutState, final TextStyle textStyle, final boolean z, final boolean z2, final TransformedTextFieldState transformedTextFieldState, final TextFieldSelectionState textFieldSelectionState, final Brush brush, final boolean z3, final boolean z4, final ScrollState scrollState, final Orientation orientation, final ToolbarRequesterImpl toolbarRequesterImpl, final PlatformSelectionBehaviors platformSelectionBehaviors, final boolean z5, final my myVar, final KeyboardOptions keyboardOptions, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-673241599, i, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:464)");
            }
            (textFieldDecorator == null ? DefaultTextFieldDecorator : textFieldDecorator).Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new my() { // from class: zc
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 BasicTextField$lambda$14$0$0;
                    int intValue = ((Integer) obj2).intValue();
                    BasicTextField$lambda$14$0$0 = BasicTextFieldKt.BasicTextField$lambda$14$0$0(TextFieldLineLimits.this, textLayoutState, textStyle, z, z2, transformedTextFieldState, textFieldSelectionState, brush, z3, z4, scrollState, orientation, toolbarRequesterImpl, platformSelectionBehaviors, z5, myVar, keyboardOptions, (Composer) obj, intValue);
                    return BasicTextField$lambda$14$0$0;
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$14$0$0(TextFieldLineLimits textFieldLineLimits, TextLayoutState textLayoutState, TextStyle textStyle, boolean z, boolean z2, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, boolean z4, ScrollState scrollState, Orientation orientation, ToolbarRequesterImpl toolbarRequesterImpl, PlatformSelectionBehaviors platformSelectionBehaviors, boolean z5, my myVar, KeyboardOptions keyboardOptions, Composer composer, int i) {
        int i2;
        int i3;
        boolean z6;
        boolean z7;
        TextLayoutState textLayoutState2;
        TransformedTextFieldState transformedTextFieldState2;
        TextFieldSelectionState textFieldSelectionState2;
        Brush brush2;
        ScrollState scrollState2;
        Orientation orientation2;
        ToolbarRequesterImpl toolbarRequesterImpl2;
        PlatformSelectionBehaviors platformSelectionBehaviors2;
        boolean z8;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969169726, i, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:466)");
            }
            if (textFieldLineLimits instanceof TextFieldLineLimits.MultiLine) {
                TextFieldLineLimits.MultiLine multiLine = (TextFieldLineLimits.MultiLine) textFieldLineLimits;
                i3 = multiLine.getMinHeightInLines();
                i2 = multiLine.getMaxHeightInLines();
            } else {
                i2 = 1;
                i3 = 1;
            }
            Modifier clipToBounds = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m795heightInVpY3zN4$default(Modifier.Companion, textLayoutState.m1348getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle, i3, i2), textStyle));
            if (!z3 || z4) {
                z6 = false;
                z7 = true;
                textLayoutState2 = textLayoutState;
                transformedTextFieldState2 = transformedTextFieldState;
                textFieldSelectionState2 = textFieldSelectionState;
                brush2 = brush;
                scrollState2 = scrollState;
                orientation2 = orientation;
                toolbarRequesterImpl2 = toolbarRequesterImpl;
                platformSelectionBehaviors2 = platformSelectionBehaviors;
                z8 = z;
            } else {
                z7 = true;
                z6 = true;
                textLayoutState2 = textLayoutState;
                z8 = z;
                transformedTextFieldState2 = transformedTextFieldState;
                textFieldSelectionState2 = textFieldSelectionState;
                brush2 = brush;
                scrollState2 = scrollState;
                orientation2 = orientation;
                toolbarRequesterImpl2 = toolbarRequesterImpl;
                platformSelectionBehaviors2 = platformSelectionBehaviors;
            }
            Modifier then = clipToBounds.then(new TextFieldCoreModifier(z8, z2, textLayoutState2, transformedTextFieldState2, textFieldSelectionState2, brush2, z6, scrollState2, orientation2, toolbarRequesterImpl2, platformSelectionBehaviors2));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), z7);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
            uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z5, myVar, keyboardOptions), composer, 0);
            if (z3 && z && textFieldSelectionState2.isInTouchMode()) {
                composer.startReplaceGroup(-810654004);
                TextFieldSelectionHandles(textFieldSelectionState2, composer, 0);
                if (z4) {
                    composer.startReplaceGroup(-837871074);
                } else {
                    composer.startReplaceGroup(-810526873);
                    TextFieldCursorHandle(textFieldSelectionState2, composer, 0);
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-837871074);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$15(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z3, int i, int i2, int i3, Composer composer, int i4) {
        BasicTextField(textFieldState, modifier, z, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, myVar, mutableInteractionSource, brush, codepointTransformation, outputTransformation, textFieldDecorator, scrollState, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$16$0(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    private static final TextFieldValue BasicTextField$lambda$18(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$20$0(TextFieldValue textFieldValue, MutableState mutableState) {
        if (!TextRange.m7053equalsimpl0(textFieldValue.m7310getSelectiond9O1mEE(), BasicTextField$lambda$18(mutableState).m7310getSelectiond9O1mEE()) || !q10.b(textFieldValue.m7309getCompositionMzsxiRA(), BasicTextField$lambda$18(mutableState).m7309getCompositionMzsxiRA())) {
            mutableState.setValue(textFieldValue);
        }
        return w01.a;
    }

    private static final String BasicTextField$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$24$0(ky kyVar, MutableState mutableState, MutableState mutableState2, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        boolean b = q10.b(BasicTextField$lambda$22(mutableState2), textFieldValue.getText());
        mutableState2.setValue(textFieldValue.getText());
        if (!b) {
            kyVar.invoke(textFieldValue.getText());
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$25(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, int i3, int i4, int i5, Composer composer, int i6) {
        BasicTextField(str, kyVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i, i2, visualTransformation, kyVar2, mutableInteractionSource, brush, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$26$0(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$27$0(TextFieldValue textFieldValue, ky kyVar, TextFieldValue textFieldValue2) {
        if (!q10.b(textFieldValue, textFieldValue2)) {
            kyVar.invoke(textFieldValue2);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$28(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, int i3, int i4, int i5, Composer composer, int i6) {
        BasicTextField(textFieldValue, kyVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i, i2, visualTransformation, kyVar2, mutableInteractionSource, brush, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$29$0(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$31(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, int i2, int i3, int i4, Composer composer, int i5) {
        BasicTextField(str, kyVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i, visualTransformation, kyVar2, mutableInteractionSource, brush, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$32$0(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTextField$lambda$34(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, int i2, int i3, int i4, Composer composer, int i5) {
        BasicTextField(textFieldValue, kyVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i, visualTransformation, kyVar2, mutableInteractionSource, brush, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    private static final w01 BasicTextField$lambda$8(TextFieldSelectionState textFieldSelectionState, AnnotatedString annotatedString) {
        textFieldSelectionState.onPasteEvent$foundation(annotatedString);
        return w01.a;
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1991581797);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:541)");
            }
            boolean changed = startRestartGroup.changed(textFieldSelectionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new gd(textFieldSelectionState, i3));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            if (TextFieldCursorHandle$lambda$1((State) rememberedValue).getVisible()) {
                startRestartGroup.startReplaceGroup(535433166);
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo1072provideF1C5BW0() {
                            return TextFieldSelectionState.this.getCursorHandleState$foundation(true).m1392getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                Modifier.Companion companion = Modifier.Companion;
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                            Object cursorHandleGestures = TextFieldSelectionState.this.cursorHandleGestures(pointerInputScope, hmVar);
                            return cursorHandleGestures == vn.d ? cursorHandleGestures : w01.a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                AndroidCursorHandle_androidKt.m1059CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) rememberedValue3), MinTouchTargetSizeForHandles, startRestartGroup, 384, 0);
            } else {
                startRestartGroup.startReplaceGroup(507182525);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new hd(textFieldSelectionState, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldHandleState TextFieldCursorHandle$lambda$0$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.getCursorHandleState$foundation(false);
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$1(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TextFieldCursorHandle$lambda$4(TextFieldSelectionState textFieldSelectionState, int i, Composer composer, int i2) {
        TextFieldCursorHandle(textFieldSelectionState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2025287684);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:562)");
            }
            boolean changed = startRestartGroup.changed(textFieldSelectionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new gd(textFieldSelectionState, i5));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            if (TextFieldSelectionHandles$lambda$1(state).getVisible()) {
                startRestartGroup.startReplaceGroup(-354703320);
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1072provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation(true, true).m1392getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$1(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$1(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.Companion;
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                            Object selectionHandleGestures = TextFieldSelectionState.this.selectionHandleGestures(pointerInputScope, true, hmVar);
                            return selectionHandleGestures == vn.d ? selectionHandleGestures : w01.a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                i3 = -383839042;
                AndroidSelectionHandles_androidKt.m1478SelectionHandlewLIcFTc(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$1(state).getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) rememberedValue3), startRestartGroup, 24624, 0);
            } else {
                i3 = -383839042;
                startRestartGroup.startReplaceGroup(-383839042);
            }
            startRestartGroup.endReplaceGroup();
            boolean changed2 = startRestartGroup.changed(textFieldSelectionState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new gd(textFieldSelectionState, i4));
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            State state2 = (State) rememberedValue4;
            if (TextFieldSelectionHandles$lambda$5(state2).getVisible()) {
                startRestartGroup.startReplaceGroup(-353657845);
                boolean changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1072provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation(false, true).m1392getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) rememberedValue5;
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$5(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$5(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.Companion;
                boolean changedInstance4 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue6 == Composer.Companion.getEmpty()) {
                    rememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                            Object selectionHandleGestures = TextFieldSelectionState.this.selectionHandleGestures(pointerInputScope, false, hmVar);
                            return selectionHandleGestures == vn.d ? selectionHandleGestures : w01.a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                AndroidSelectionHandles_androidKt.m1478SelectionHandlewLIcFTc(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$5(state2).getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (PointerInputEventHandler) rememberedValue6), startRestartGroup, 24624, 0);
            } else {
                startRestartGroup.startReplaceGroup(i3);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new hd(textFieldSelectionState, i, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldHandleState TextFieldSelectionHandles$lambda$0$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.getSelectionHandleState$foundation(true, false);
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$1(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldHandleState TextFieldSelectionHandles$lambda$4$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.getSelectionHandleState$foundation(false, false);
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$5(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TextFieldSelectionHandles$lambda$8(TextFieldSelectionState textFieldSelectionState, int i, Composer composer, int i2) {
        TextFieldSelectionHandles(textFieldSelectionState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final Modifier addContextMenuComponents(Modifier modifier, TextFieldSelectionState textFieldSelectionState, un unVar) {
        return ComposeFoundationFlags.isNewContextMenuEnabled ? TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents(modifier, textFieldSelectionState, unVar) : modifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
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
        int i23;
        Composer composer2;
        final TextFieldLineLimits textFieldLineLimits2;
        final my myVar2;
        final TextFieldDecorator textFieldDecorator2;
        final boolean z5;
        final boolean z6;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final Modifier modifier3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler2;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final OutputTransformation outputTransformation2;
        final ScrollState scrollState2;
        ScopeUpdateScope endRestartGroup;
        TextStyle textStyle4;
        KeyboardActionHandler keyboardActionHandler3;
        TextFieldLineLimits textFieldLineLimits3;
        my myVar3;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldDecorator textFieldDecorator3;
        OutputTransformation outputTransformation3;
        Brush brush3;
        ScrollState scrollState3;
        Composer startRestartGroup = composer.startRestartGroup(469439921);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            int i25 = Fields.RotationX;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 256 : Fields.SpotShadowColor;
                i6 = i3 & 8;
                int i26 = Fields.RotationZ;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i7 = i3 & 16;
                    int i27 = 8192;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        inputTransformation2 = inputTransformation;
                        i4 |= startRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i & 196608) == 0) {
                                i4 |= startRestartGroup.changed(textStyle2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        i10 = i3 & Fields.SpotShadowColor;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(keyboardActionHandler) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i11 = i3 & Fields.RotationX;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(textFieldLineLimits) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            i13 = i3 & Fields.RotationY;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i14 = i13;
                                i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i15 = i3 & Fields.RotationZ;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & Fields.CameraDistance;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= startRestartGroup.changed(brush) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i28 = i17;
                                i20 = i3 & Fields.TransformOrigin;
                                if (i20 != 0) {
                                    i21 = i28 | 384;
                                } else if ((i2 & 384) == 0) {
                                    if (!startRestartGroup.changed(outputTransformation)) {
                                        i25 = Fields.SpotShadowColor;
                                    }
                                    i21 = i28 | i25;
                                } else {
                                    i21 = i28;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i29 = i21;
                                    if ((i2 & 3072) == 0) {
                                        if ((i2 & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator)) {
                                            i26 = 2048;
                                        }
                                        i23 = i29 | i26;
                                    } else {
                                        i23 = i29;
                                    }
                                }
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(scrollState)) {
                                        i27 = 16384;
                                    }
                                    i23 |= i27;
                                }
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & Fields.Clip) != 0) {
                                            i23 &= -57345;
                                        }
                                        textFieldLineLimits3 = textFieldLineLimits;
                                        myVar3 = myVar;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush3 = brush;
                                        outputTransformation3 = outputTransformation;
                                        textFieldDecorator3 = textFieldDecorator;
                                        scrollState3 = scrollState;
                                        textStyle4 = textStyle2;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                    } else {
                                        if (i24 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i5 != 0) {
                                            z3 = true;
                                        }
                                        if (i6 != 0) {
                                            z4 = false;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        textStyle4 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                                        if (i9 != 0) {
                                            keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                                        }
                                        keyboardActionHandler3 = i10 != 0 ? null : keyboardActionHandler;
                                        textFieldLineLimits3 = i12 != 0 ? TextFieldLineLimits.Companion.getDefault() : textFieldLineLimits;
                                        myVar3 = i14 != 0 ? null : myVar;
                                        mutableInteractionSource3 = i16 != 0 ? null : mutableInteractionSource;
                                        Brush cursorBrush = i19 != 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                        OutputTransformation outputTransformation4 = i20 != 0 ? null : outputTransformation;
                                        textFieldDecorator3 = i22 == 0 ? textFieldDecorator : null;
                                        if ((i3 & Fields.Clip) != 0) {
                                            i23 &= -57345;
                                            outputTransformation3 = outputTransformation4;
                                            brush3 = cursorBrush;
                                            scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        } else {
                                            outputTransformation3 = outputTransformation4;
                                            brush3 = cursorBrush;
                                            scrollState3 = scrollState;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(469439921, i4, i23, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:201)");
                                    }
                                    int i30 = (i23 & 14) | 384 | (i23 & 112);
                                    int i31 = i23 << 3;
                                    Modifier modifier4 = modifier2;
                                    TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits3;
                                    my myVar4 = myVar3;
                                    composer2 = startRestartGroup;
                                    InputTransformation inputTransformation4 = inputTransformation2;
                                    KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    TextFieldDecorator textFieldDecorator4 = textFieldDecorator3;
                                    BasicTextField(textFieldState, modifier4, z3, z4, inputTransformation4, textStyle4, keyboardOptions4, keyboardActionHandler3, textFieldLineLimits4, myVar4, mutableInteractionSource4, brush3, null, outputTransformation3, textFieldDecorator4, scrollState3, false, composer2, i4 & 2147483646, i30 | (i31 & 7168) | (57344 & i31) | (i31 & 458752), 65536);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation4;
                                    textStyle3 = textStyle4;
                                    keyboardOptions3 = keyboardOptions4;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    myVar2 = myVar4;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    brush2 = brush3;
                                    outputTransformation2 = outputTransformation3;
                                    textFieldDecorator2 = textFieldDecorator4;
                                    scrollState2 = scrollState3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    textFieldLineLimits2 = textFieldLineLimits;
                                    myVar2 = myVar;
                                    textFieldDecorator2 = textFieldDecorator;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    outputTransformation2 = outputTransformation;
                                    scrollState2 = scrollState;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: xc
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 BasicTextField$lambda$0;
                                            int intValue = ((Integer) obj2).intValue();
                                            BasicTextField$lambda$0 = BasicTextFieldKt.BasicTextField$lambda$0(TextFieldState.this, modifier3, z5, z6, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler2, textFieldLineLimits2, myVar2, mutableInteractionSource2, brush2, outputTransformation2, textFieldDecorator2, scrollState2, i, i2, i3, (Composer) obj, intValue);
                                            return BasicTextField$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i13;
                            i15 = i3 & Fields.RotationZ;
                            if (i15 != 0) {
                            }
                            i18 = i3 & Fields.CameraDistance;
                            if (i18 != 0) {
                            }
                            int i282 = i17;
                            i20 = i3 & Fields.TransformOrigin;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            if ((i2 & 24576) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & Fields.RotationY;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i3 & Fields.RotationZ;
                        if (i15 != 0) {
                        }
                        i18 = i3 & Fields.CameraDistance;
                        if (i18 != 0) {
                        }
                        int i2822 = i17;
                        i20 = i3 & Fields.TransformOrigin;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & Fields.SpotShadowColor;
                    if (i10 != 0) {
                    }
                    i11 = i3 & Fields.RotationX;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & Fields.RotationY;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & Fields.RotationZ;
                    if (i15 != 0) {
                    }
                    i18 = i3 & Fields.CameraDistance;
                    if (i18 != 0) {
                    }
                    int i28222 = i17;
                    i20 = i3 & Fields.TransformOrigin;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i7 = i3 & 16;
                int i272 = 8192;
                if (i7 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & Fields.SpotShadowColor;
                if (i10 != 0) {
                }
                i11 = i3 & Fields.RotationX;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & Fields.RotationY;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i3 & Fields.RotationZ;
                if (i15 != 0) {
                }
                i18 = i3 & Fields.CameraDistance;
                if (i18 != 0) {
                }
                int i282222 = i17;
                i20 = i3 & Fields.TransformOrigin;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i6 = i3 & 8;
            int i262 = Fields.RotationZ;
            if (i6 != 0) {
            }
            z4 = z2;
            i7 = i3 & 16;
            int i2722 = 8192;
            if (i7 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & Fields.SpotShadowColor;
            if (i10 != 0) {
            }
            i11 = i3 & Fields.RotationX;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & Fields.RotationY;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & Fields.RotationZ;
            if (i15 != 0) {
            }
            i18 = i3 & Fields.CameraDistance;
            if (i18 != 0) {
            }
            int i2822222 = i17;
            i20 = i3 & Fields.TransformOrigin;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        int i252 = Fields.RotationX;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 8;
        int i2622 = Fields.RotationZ;
        if (i6 != 0) {
        }
        z4 = z2;
        i7 = i3 & 16;
        int i27222 = 8192;
        if (i7 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & Fields.SpotShadowColor;
        if (i10 != 0) {
        }
        i11 = i3 & Fields.RotationX;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & Fields.RotationY;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & Fields.RotationZ;
        if (i15 != 0) {
        }
        i18 = i3 & Fields.CameraDistance;
        if (i18 != 0) {
        }
        int i28222222 = i17;
        i20 = i3 & Fields.TransformOrigin;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, Composer composer, int i3, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        Composer composer2;
        boolean z6;
        ny nyVar2;
        boolean z7;
        KeyboardOptions keyboardOptions3;
        boolean z8;
        TextStyle textStyle3;
        Modifier modifier3;
        VisualTransformation visualTransformation2;
        ky kyVar3;
        MutableInteractionSource mutableInteractionSource2;
        Brush brush2;
        ScopeUpdateScope endRestartGroup;
        int i26;
        ky kyVar4;
        ky kyVar5;
        MutableInteractionSource mutableInteractionSource3;
        Brush brush3;
        KeyboardActions keyboardActions3;
        ny nyVar3;
        boolean z9;
        int i27;
        int i28;
        boolean z10;
        TextStyle textStyle4;
        Modifier modifier4;
        VisualTransformation visualTransformation3;
        Brush brush4;
        int i29;
        KeyboardOptions keyboardOptions4;
        ky kyVar6;
        MutableInteractionSource mutableInteractionSource4;
        int i30;
        Composer startRestartGroup = composer.startRestartGroup(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i31 = i5 & 4;
        if (i31 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i7 = i5 & 8;
            int i32 = Fields.RotationZ;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z5 = z2;
                    i6 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & 196608) == 0) {
                            i6 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i11 = i5 & Fields.SpotShadowColor;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(keyboardActions2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i12 = i5 & Fields.RotationX;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & Fields.RotationY) == 0 && startRestartGroup.changed(i)) {
                            i30 = GroupFlagsKt.HasMovableContentFlag;
                            i6 |= i30;
                        }
                        i30 = GroupFlagsKt.IsMovableContentFlag;
                        i6 |= i30;
                    }
                    i13 = i5 & Fields.RotationZ;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & Fields.CameraDistance;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i33 = i15;
                    i18 = i5 & Fields.TransformOrigin;
                    if (i18 == 0) {
                        i19 = i33 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i33 | (startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor);
                    } else {
                        i19 = i33;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i34 = i19;
                        if ((i4 & 3072) == 0) {
                            if (startRestartGroup.changed(mutableInteractionSource)) {
                                i32 = 2048;
                            }
                            i21 = i34 | i32;
                        } else {
                            i21 = i34;
                        }
                    }
                    i22 = i5 & Fields.Clip;
                    if (i22 == 0) {
                        i23 = i21 | 24576;
                    } else {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                            i24 = i5 & Fields.CompositingStrategy;
                            if (i24 != 0) {
                                i23 |= 196608;
                            } else if ((i4 & 196608) == 0) {
                                i23 |= startRestartGroup.changedInstance(nyVar) ? 131072 : 65536;
                            }
                            i25 = i23;
                            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i6 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & Fields.RotationY) != 0) {
                                        i6 &= -1879048193;
                                    }
                                    z9 = z3;
                                    i27 = i;
                                    i28 = i2;
                                    visualTransformation3 = visualTransformation;
                                    nyVar3 = nyVar;
                                    keyboardActions3 = keyboardActions2;
                                    keyboardOptions4 = keyboardOptions2;
                                    z10 = z5;
                                    textStyle4 = textStyle2;
                                    modifier4 = modifier2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    brush4 = brush;
                                    i29 = i6;
                                    kyVar6 = kyVar2;
                                } else {
                                    if (i31 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i7 != 0) {
                                        z4 = true;
                                    }
                                    if (i8 != 0) {
                                        z5 = false;
                                    }
                                    if (i9 != 0) {
                                        textStyle2 = TextStyle.Companion.getDefault();
                                    }
                                    if (i10 != 0) {
                                        keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                                    }
                                    KeyboardActions keyboardActions4 = i11 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions2;
                                    boolean z11 = i12 != 0 ? false : z3;
                                    if ((i5 & Fields.RotationY) != 0) {
                                        i26 = z11 ? 1 : Integer.MAX_VALUE;
                                        i6 &= -1879048193;
                                    } else {
                                        i26 = i;
                                    }
                                    int i35 = i14 != 0 ? 1 : i2;
                                    VisualTransformation none = i17 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    if (i18 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new d1(29);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        kyVar4 = (ky) rememberedValue;
                                    } else {
                                        kyVar4 = kyVar2;
                                    }
                                    MutableInteractionSource mutableInteractionSource5 = i20 != 0 ? null : mutableInteractionSource;
                                    KeyboardActions keyboardActions5 = keyboardActions4;
                                    if (i22 != 0) {
                                        kyVar5 = kyVar4;
                                        mutableInteractionSource3 = mutableInteractionSource5;
                                        brush3 = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
                                    } else {
                                        kyVar5 = kyVar4;
                                        mutableInteractionSource3 = mutableInteractionSource5;
                                        brush3 = brush;
                                    }
                                    if (i24 != 0) {
                                        keyboardActions3 = keyboardActions5;
                                        nyVar3 = ComposableSingletons$BasicTextFieldKt.INSTANCE.getLambda$759698998$foundation();
                                    } else {
                                        keyboardActions3 = keyboardActions5;
                                        nyVar3 = nyVar;
                                    }
                                    z9 = z11;
                                    i27 = i26;
                                    i28 = i35;
                                    z10 = z5;
                                    textStyle4 = textStyle2;
                                    modifier4 = modifier2;
                                    visualTransformation3 = none;
                                    brush4 = brush3;
                                    i29 = i6;
                                    keyboardOptions4 = keyboardOptions2;
                                    kyVar6 = kyVar5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i = i27;
                                    ComposerKt.traceEventStart(2026950908, i29, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:749)");
                                } else {
                                    i = i27;
                                }
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                Composer.Companion companion = Composer.Companion;
                                if (rememberedValue2 == companion.getEmpty()) {
                                    i2 = i28;
                                    Object mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (dq) null), null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                    rememberedValue2 = mutableStateOf$default;
                                } else {
                                    i2 = i28;
                                }
                                MutableState mutableState = (MutableState) rememberedValue2;
                                TextFieldValue m7306copy3r_uNRQ$default = TextFieldValue.m7306copy3r_uNRQ$default(BasicTextField$lambda$18(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                                boolean changed = startRestartGroup.changed(m7306copy3r_uNRQ$default);
                                ky kyVar7 = kyVar6;
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                Modifier modifier5 = modifier4;
                                if (changed || rememberedValue3 == companion.getEmpty()) {
                                    rememberedValue3 = new v4(6, m7306copy3r_uNRQ$default, mutableState);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                EffectsKt.SideEffect((iy) rememberedValue3, startRestartGroup, 0);
                                boolean z12 = (i29 & 14) == 4;
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z12 || rememberedValue4 == companion.getEmpty()) {
                                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                MutableState mutableState2 = (MutableState) rememberedValue4;
                                ImeOptions imeOptions$foundation = keyboardOptions4.toImeOptions$foundation(z9);
                                boolean z13 = !z9;
                                int i36 = z9 ? 1 : i2;
                                int i37 = z9 ? 1 : i;
                                KeyboardOptions keyboardOptions5 = keyboardOptions4;
                                boolean changed2 = startRestartGroup.changed(mutableState2) | ((i29 & 112) == 32);
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue5 == companion.getEmpty()) {
                                    rememberedValue5 = new f1(kyVar, mutableState, mutableState2);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                int i38 = i25 << 9;
                                composer2 = startRestartGroup;
                                boolean z14 = z4;
                                CoreTextFieldKt.CoreTextField(m7306copy3r_uNRQ$default, (ky) rememberedValue5, modifier5, textStyle4, visualTransformation3, kyVar7, mutableInteractionSource4, brush4, z13, i37, i36, imeOptions$foundation, keyboardActions3, z14, z10, nyVar3, null, composer2, (i29 & 896) | ((i29 >> 6) & 7168) | (i38 & 57344) | (i38 & 458752) | (i38 & 3670016) | (i38 & 29360128), ((i29 >> 15) & 896) | (i29 & 7168) | (i29 & 57344) | (i25 & 458752), 65536);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textStyle3 = textStyle4;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                brush2 = brush4;
                                z7 = z14;
                                z8 = z10;
                                nyVar2 = nyVar3;
                                keyboardOptions3 = keyboardOptions5;
                                z6 = z9;
                                modifier3 = modifier5;
                                visualTransformation2 = visualTransformation3;
                                kyVar3 = kyVar7;
                                keyboardActions2 = keyboardActions3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                z6 = z3;
                                nyVar2 = nyVar;
                                z7 = z4;
                                keyboardOptions3 = keyboardOptions2;
                                z8 = z5;
                                textStyle3 = textStyle2;
                                modifier3 = modifier2;
                                visualTransformation2 = visualTransformation;
                                kyVar3 = kyVar2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                            }
                            int i39 = i;
                            int i40 = i2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new ad(str, kyVar, modifier3, z7, z8, textStyle3, keyboardOptions3, keyboardActions2, z6, i39, i40, visualTransformation2, kyVar3, mutableInteractionSource2, brush2, nyVar2, i3, i4, i5, 0));
                                return;
                            }
                            return;
                        }
                    }
                    i24 = i5 & Fields.CompositingStrategy;
                    if (i24 != 0) {
                    }
                    i25 = i23;
                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i6 & 1)) {
                    }
                    int i392 = i;
                    int i402 = i2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & Fields.SpotShadowColor;
                if (i11 == 0) {
                }
                i12 = i5 & Fields.RotationX;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & Fields.RotationZ;
                if (i13 == 0) {
                }
                i16 = i5 & Fields.CameraDistance;
                if (i16 == 0) {
                }
                int i332 = i15;
                i18 = i5 & Fields.TransformOrigin;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & Fields.Clip;
                if (i22 == 0) {
                }
                i24 = i5 & Fields.CompositingStrategy;
                if (i24 != 0) {
                }
                i25 = i23;
                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i6 & 1)) {
                }
                int i3922 = i;
                int i4022 = i2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & Fields.SpotShadowColor;
            if (i11 == 0) {
            }
            i12 = i5 & Fields.RotationX;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & Fields.RotationZ;
            if (i13 == 0) {
            }
            i16 = i5 & Fields.CameraDistance;
            if (i16 == 0) {
            }
            int i3322 = i15;
            i18 = i5 & Fields.TransformOrigin;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & Fields.Clip;
            if (i22 == 0) {
            }
            i24 = i5 & Fields.CompositingStrategy;
            if (i24 != 0) {
            }
            i25 = i23;
            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i6 & 1)) {
            }
            int i39222 = i;
            int i40222 = i2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        int i322 = Fields.RotationZ;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & Fields.SpotShadowColor;
        if (i11 == 0) {
        }
        i12 = i5 & Fields.RotationX;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & Fields.RotationZ;
        if (i13 == 0) {
        }
        i16 = i5 & Fields.CameraDistance;
        if (i16 == 0) {
        }
        int i33222 = i15;
        i18 = i5 & Fields.TransformOrigin;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & Fields.Clip;
        if (i22 == 0) {
        }
        i24 = i5 & Fields.CompositingStrategy;
        if (i24 != 0) {
        }
        i25 = i23;
        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i6 & 1)) {
        }
        int i392222 = i;
        int i402222 = i2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, Composer composer, int i3, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        Composer composer2;
        int i27;
        VisualTransformation visualTransformation2;
        ny nyVar2;
        boolean z6;
        KeyboardActions keyboardActions3;
        boolean z7;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        Modifier modifier3;
        boolean z8;
        int i28;
        ky kyVar3;
        MutableInteractionSource mutableInteractionSource2;
        Brush brush2;
        ScopeUpdateScope endRestartGroup;
        int i29;
        int i30;
        VisualTransformation none;
        KeyboardActions keyboardActions4;
        ky kyVar4;
        MutableInteractionSource mutableInteractionSource3;
        int i31;
        ky kyVar5;
        Brush brush3;
        Brush brush4;
        TextStyle textStyle4;
        boolean z9;
        ky kyVar6;
        boolean z10;
        int i32;
        int i33;
        KeyboardOptions keyboardOptions4;
        KeyboardActions keyboardActions5;
        int i34;
        ny nyVar3;
        boolean z11;
        TextStyle textStyle5;
        int i35;
        Composer startRestartGroup = composer.startRestartGroup(-971111025);
        if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i36 = i5 & 4;
        if (i36 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i7 = i5 & 8;
            int i37 = Fields.RotationZ;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z5 = z2;
                    i6 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & 196608) == 0) {
                            i6 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i11 = i5 & Fields.SpotShadowColor;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(keyboardActions2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i12 = i5 & Fields.RotationX;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & Fields.RotationY) == 0 && startRestartGroup.changed(i)) {
                            i35 = GroupFlagsKt.HasMovableContentFlag;
                            i6 |= i35;
                        }
                        i35 = GroupFlagsKt.IsMovableContentFlag;
                        i6 |= i35;
                    }
                    i13 = i5 & Fields.RotationZ;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & Fields.CameraDistance;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i38 = i15;
                    i18 = i5 & Fields.TransformOrigin;
                    if (i18 == 0) {
                        i19 = i38 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i38 | (startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor);
                    } else {
                        i19 = i38;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i39 = i19;
                        if ((i4 & 3072) == 0) {
                            if (startRestartGroup.changed(mutableInteractionSource)) {
                                i37 = 2048;
                            }
                            i21 = i39 | i37;
                        } else {
                            i21 = i39;
                        }
                    }
                    i22 = i5 & Fields.Clip;
                    if (i22 == 0) {
                        i23 = i21 | 24576;
                    } else {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                            i24 = i5 & Fields.CompositingStrategy;
                            if (i24 != 0) {
                                i23 |= 196608;
                            } else if ((i4 & 196608) == 0) {
                                i23 |= startRestartGroup.changedInstance(nyVar) ? 131072 : 65536;
                            }
                            i25 = i23;
                            i26 = i6;
                            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i26 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & Fields.RotationY) != 0) {
                                        z10 = z3;
                                        i32 = i;
                                        i33 = i2;
                                        none = visualTransformation;
                                        kyVar6 = kyVar2;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        i34 = i26 & (-1879048193);
                                    } else {
                                        z10 = z3;
                                        i32 = i;
                                        i33 = i2;
                                        none = visualTransformation;
                                        kyVar6 = kyVar2;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        i34 = i26;
                                    }
                                    keyboardActions5 = keyboardActions2;
                                    textStyle4 = textStyle2;
                                    keyboardOptions4 = keyboardOptions2;
                                    nyVar3 = nyVar;
                                    z9 = z4;
                                    z11 = z5;
                                    brush4 = brush;
                                } else {
                                    if (i36 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i7 != 0) {
                                        z4 = true;
                                    }
                                    if (i8 != 0) {
                                        z5 = false;
                                    }
                                    if (i9 != 0) {
                                        textStyle2 = TextStyle.Companion.getDefault();
                                    }
                                    if (i10 != 0) {
                                        keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                                    }
                                    KeyboardActions keyboardActions6 = i11 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions2;
                                    boolean z12 = i12 != 0 ? false : z3;
                                    if ((i5 & Fields.RotationY) != 0) {
                                        i29 = z12 ? 1 : Integer.MAX_VALUE;
                                        i30 = i26 & (-1879048193);
                                    } else {
                                        i29 = i;
                                        i30 = i26;
                                    }
                                    int i40 = i14 != 0 ? 1 : i2;
                                    none = i17 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    if (i18 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        keyboardActions4 = keyboardActions6;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new ed(0);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        kyVar4 = (ky) rememberedValue;
                                    } else {
                                        keyboardActions4 = keyboardActions6;
                                        kyVar4 = kyVar2;
                                    }
                                    mutableInteractionSource3 = i20 != 0 ? null : mutableInteractionSource;
                                    if (i22 != 0) {
                                        i31 = i30;
                                        kyVar5 = kyVar4;
                                        brush3 = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
                                    } else {
                                        i31 = i30;
                                        kyVar5 = kyVar4;
                                        brush3 = brush;
                                    }
                                    if (i24 != 0) {
                                        boolean z13 = z4;
                                        brush4 = brush3;
                                        textStyle4 = textStyle2;
                                        z9 = z13;
                                        kyVar6 = kyVar5;
                                        z10 = z12;
                                        i32 = i29;
                                        i33 = i40;
                                        keyboardActions5 = keyboardActions4;
                                        i34 = i31;
                                        nyVar3 = ComposableSingletons$BasicTextFieldKt.INSTANCE.getLambda$486633673$foundation();
                                        keyboardOptions4 = keyboardOptions2;
                                    } else {
                                        boolean z14 = z4;
                                        brush4 = brush3;
                                        textStyle4 = textStyle2;
                                        z9 = z14;
                                        kyVar6 = kyVar5;
                                        z10 = z12;
                                        i32 = i29;
                                        i33 = i40;
                                        keyboardOptions4 = keyboardOptions2;
                                        keyboardActions5 = keyboardActions4;
                                        i34 = i31;
                                        nyVar3 = nyVar;
                                    }
                                    z11 = z5;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    textStyle5 = textStyle4;
                                    ComposerKt.traceEventStart(-971111025, i34, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:906)");
                                } else {
                                    textStyle5 = textStyle4;
                                }
                                ImeOptions imeOptions$foundation = keyboardOptions4.toImeOptions$foundation(z10);
                                boolean z15 = z10;
                                ky kyVar7 = kyVar6;
                                Brush brush5 = brush4;
                                boolean z16 = !z15;
                                int i41 = z15 ? 1 : i33;
                                Modifier modifier4 = modifier2;
                                ny nyVar4 = nyVar3;
                                int i42 = z15 ? 1 : i32;
                                boolean z17 = ((i34 & 14) == 4) | ((i34 & 112) == 32);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z17 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new defpackage.g(5, textFieldValue, kyVar);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                int i43 = i25 << 9;
                                KeyboardOptions keyboardOptions5 = keyboardOptions4;
                                VisualTransformation visualTransformation3 = none;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                composer2 = startRestartGroup;
                                TextStyle textStyle6 = textStyle5;
                                CoreTextFieldKt.CoreTextField(textFieldValue, (ky) rememberedValue2, modifier4, textStyle6, visualTransformation3, kyVar7, mutableInteractionSource4, brush5, z16, i42, i41, imeOptions$foundation, keyboardActions5, z9, z11, nyVar4, null, composer2, ((i34 >> 6) & 7168) | (i34 & 910) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128), (i34 & 7168) | ((i34 >> 15) & 896) | (i34 & 57344) | (i25 & 458752), 65536);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                keyboardActions3 = keyboardActions5;
                                nyVar2 = nyVar4;
                                i27 = i32;
                                i28 = i33;
                                z8 = z15;
                                visualTransformation2 = visualTransformation3;
                                brush2 = brush5;
                                z6 = z9;
                                keyboardOptions3 = keyboardOptions5;
                                kyVar3 = kyVar7;
                                z7 = z11;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                textStyle3 = textStyle6;
                                modifier3 = modifier4;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                i27 = i;
                                visualTransformation2 = visualTransformation;
                                nyVar2 = nyVar;
                                z6 = z4;
                                keyboardActions3 = keyboardActions2;
                                z7 = z5;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                modifier3 = modifier2;
                                z8 = z3;
                                i28 = i2;
                                kyVar3 = kyVar2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new ad(textFieldValue, kyVar, modifier3, z6, z7, textStyle3, keyboardOptions3, keyboardActions3, z8, i27, i28, visualTransformation2, kyVar3, mutableInteractionSource2, brush2, nyVar2, i3, i4, i5, 1));
                                return;
                            }
                            return;
                        }
                    }
                    i24 = i5 & Fields.CompositingStrategy;
                    if (i24 != 0) {
                    }
                    i25 = i23;
                    i26 = i6;
                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i26 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & Fields.SpotShadowColor;
                if (i11 == 0) {
                }
                i12 = i5 & Fields.RotationX;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & Fields.RotationZ;
                if (i13 == 0) {
                }
                i16 = i5 & Fields.CameraDistance;
                if (i16 == 0) {
                }
                int i382 = i15;
                i18 = i5 & Fields.TransformOrigin;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & Fields.Clip;
                if (i22 == 0) {
                }
                i24 = i5 & Fields.CompositingStrategy;
                if (i24 != 0) {
                }
                i25 = i23;
                i26 = i6;
                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i26 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & Fields.SpotShadowColor;
            if (i11 == 0) {
            }
            i12 = i5 & Fields.RotationX;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & Fields.RotationZ;
            if (i13 == 0) {
            }
            i16 = i5 & Fields.CameraDistance;
            if (i16 == 0) {
            }
            int i3822 = i15;
            i18 = i5 & Fields.TransformOrigin;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & Fields.Clip;
            if (i22 == 0) {
            }
            i24 = i5 & Fields.CompositingStrategy;
            if (i24 != 0) {
            }
            i25 = i23;
            i26 = i6;
            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i26 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        int i372 = Fields.RotationZ;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & Fields.SpotShadowColor;
        if (i11 == 0) {
        }
        i12 = i5 & Fields.RotationX;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & Fields.RotationZ;
        if (i13 == 0) {
        }
        i16 = i5 & Fields.CameraDistance;
        if (i16 == 0) {
        }
        int i38222 = i15;
        i18 = i5 & Fields.TransformOrigin;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & Fields.Clip;
        if (i22 == 0) {
        }
        i24 = i5 & Fields.CompositingStrategy;
        if (i24 != 0) {
        }
        i25 = i23;
        i26 = i6;
        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (74899 & i25) != 74898, i26 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, Composer composer, int i2, int i3, int i4) {
        String str2;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
        int i10;
        KeyboardActions keyboardActions2;
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
        Composer composer2;
        boolean z4;
        boolean z5;
        boolean z6;
        ky kyVar3;
        MutableInteractionSource mutableInteractionSource2;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        Modifier modifier3;
        int i25;
        VisualTransformation visualTransformation2;
        Brush brush2;
        ny nyVar2;
        ScopeUpdateScope endRestartGroup;
        ky kyVar4;
        int i26;
        MutableInteractionSource mutableInteractionSource3;
        int i27;
        Brush brush3;
        Composer startRestartGroup = composer.startRestartGroup(74291967);
        if ((i2 & 6) == 0) {
            str2 = str;
            i5 = (startRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i28 = i4 & 4;
        if (i28 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i6 = i4 & 8;
            int i29 = Fields.RotationZ;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
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
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(keyboardActions2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i11 = i4 & Fields.RotationX;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i12 = i4 & Fields.RotationY;
                    if (i12 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changed(i) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i14 = i4 & Fields.RotationZ;
                        if (i14 != 0) {
                            i16 = i3 | 6;
                            i15 = i14;
                        } else if ((i3 & 6) == 0) {
                            i15 = i14;
                            i16 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i3;
                        }
                        i17 = i4 & Fields.CameraDistance;
                        if (i17 != 0) {
                            i16 |= 48;
                            i18 = i17;
                        } else if ((i3 & 48) == 0) {
                            i18 = i17;
                            i16 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
                        } else {
                            i18 = i17;
                        }
                        int i30 = i16;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 != 0) {
                            i20 = i30 | 384;
                        } else {
                            int i31 = i30;
                            if ((i3 & 384) == 0) {
                                i31 |= startRestartGroup.changed(mutableInteractionSource) ? Fields.RotationX : Fields.SpotShadowColor;
                            }
                            i20 = i31;
                        }
                        i21 = i4 & 8192;
                        if (i21 != 0) {
                            i22 = i20 | 3072;
                        } else {
                            int i32 = i20;
                            if ((i3 & 3072) == 0) {
                                if (startRestartGroup.changed(brush)) {
                                    i29 = 2048;
                                }
                                i22 = i32 | i29;
                            } else {
                                i22 = i32;
                            }
                        }
                        i23 = i4 & Fields.Clip;
                        if (i23 != 0) {
                            i24 = i22 | 24576;
                        } else {
                            int i33 = i22;
                            if ((i3 & 24576) == 0) {
                                i33 |= startRestartGroup.changedInstance(nyVar) ? 16384 : 8192;
                            }
                            i24 = i33;
                        }
                        int i34 = 1;
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
                            Modifier modifier4 = i28 != 0 ? Modifier.Companion : modifier2;
                            boolean z7 = i6 != 0 ? true : z;
                            boolean z8 = i7 != 0 ? false : z2;
                            TextStyle textStyle4 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                            KeyboardOptions keyboardOptions4 = i9 != 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions2;
                            KeyboardActions keyboardActions4 = i10 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions2;
                            boolean z9 = i11 != 0 ? false : z3;
                            int i35 = i13 != 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i15 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                            if (i18 != 0) {
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new ed(i34);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                kyVar4 = (ky) rememberedValue;
                            } else {
                                kyVar4 = kyVar2;
                            }
                            if (i19 != 0) {
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue2;
                                i26 = i21;
                            } else {
                                i26 = i21;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            if (i26 != 0) {
                                composer2 = startRestartGroup;
                                brush3 = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
                                i27 = i23;
                            } else {
                                composer2 = startRestartGroup;
                                i27 = i23;
                                brush3 = brush;
                            }
                            ny lambda$444370233$foundation = i27 != 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.getLambda$444370233$foundation() : nyVar;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(74291967, i5, i24, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:950)");
                            }
                            int i36 = i24 << 3;
                            boolean z10 = z8;
                            BasicTextField(str2, kyVar, modifier4, z7, z10, textStyle4, keyboardOptions4, keyboardActions4, z9, i35, 1, none, kyVar4, mutableInteractionSource3, brush3, lambda$444370233$foundation, composer2, i5 & 2147483646, (i36 & 112) | 6 | (i36 & 896) | (i36 & 7168) | (57344 & i36) | (i36 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z7;
                            z5 = z10;
                            textStyle3 = textStyle4;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions3 = keyboardActions4;
                            z6 = z9;
                            i25 = i35;
                            visualTransformation2 = none;
                            kyVar3 = kyVar4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            brush2 = brush3;
                            nyVar2 = lambda$444370233$foundation;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z4 = z;
                            z5 = z2;
                            z6 = z3;
                            kyVar3 = kyVar2;
                            mutableInteractionSource2 = mutableInteractionSource;
                            textStyle3 = textStyle2;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions3 = keyboardActions2;
                            modifier3 = modifier2;
                            i25 = i;
                            visualTransformation2 = visualTransformation;
                            brush2 = brush;
                            nyVar2 = nyVar;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new yc(str, kyVar, modifier3, z4, z5, textStyle3, keyboardOptions3, keyboardActions3, z6, i25, visualTransformation2, kyVar3, mutableInteractionSource2, brush2, nyVar2, i2, i3, i4, 1));
                            return;
                        }
                        return;
                    }
                    i13 = i12;
                    i14 = i4 & Fields.RotationZ;
                    if (i14 != 0) {
                    }
                    i17 = i4 & Fields.CameraDistance;
                    if (i17 != 0) {
                    }
                    int i302 = i16;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 != 0) {
                    }
                    i21 = i4 & 8192;
                    if (i21 != 0) {
                    }
                    i23 = i4 & Fields.Clip;
                    if (i23 != 0) {
                    }
                    int i342 = 1;
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
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
                i12 = i4 & Fields.RotationY;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & Fields.RotationZ;
                if (i14 != 0) {
                }
                i17 = i4 & Fields.CameraDistance;
                if (i17 != 0) {
                }
                int i3022 = i16;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 != 0) {
                }
                i21 = i4 & 8192;
                if (i21 != 0) {
                }
                i23 = i4 & Fields.Clip;
                if (i23 != 0) {
                }
                int i3422 = 1;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
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
            i12 = i4 & Fields.RotationY;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & Fields.RotationZ;
            if (i14 != 0) {
            }
            i17 = i4 & Fields.CameraDistance;
            if (i17 != 0) {
            }
            int i30222 = i16;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 != 0) {
            }
            i21 = i4 & 8192;
            if (i21 != 0) {
            }
            i23 = i4 & Fields.Clip;
            if (i23 != 0) {
            }
            int i34222 = 1;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        int i292 = Fields.RotationZ;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
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
        i12 = i4 & Fields.RotationY;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & Fields.RotationZ;
        if (i14 != 0) {
        }
        i17 = i4 & Fields.CameraDistance;
        if (i17 != 0) {
        }
        int i302222 = i16;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 != 0) {
        }
        i21 = i4 & 8192;
        if (i21 != 0) {
        }
        i23 = i4 & Fields.Clip;
        if (i23 != 0) {
        }
        int i342222 = 1;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(TextFieldValue textFieldValue, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, Composer composer, int i2, int i3, int i4) {
        TextFieldValue textFieldValue2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
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
        int i23;
        int i24;
        Composer composer2;
        KeyboardActions keyboardActions2;
        boolean z6;
        ky kyVar3;
        Brush brush2;
        boolean z7;
        boolean z8;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        Modifier modifier3;
        int i25;
        VisualTransformation visualTransformation2;
        MutableInteractionSource mutableInteractionSource2;
        ny nyVar2;
        ScopeUpdateScope endRestartGroup;
        int i26;
        Modifier modifier4;
        boolean z9;
        KeyboardOptions keyboardOptions4;
        ky kyVar4;
        int i27;
        MutableInteractionSource mutableInteractionSource3;
        boolean z10;
        Brush brush3;
        int i28;
        Composer startRestartGroup = composer.startRestartGroup(1742344466);
        if ((i2 & 6) == 0) {
            textFieldValue2 = textFieldValue;
            i5 = (startRestartGroup.changed(textFieldValue2) ? 4 : 2) | i2;
        } else {
            textFieldValue2 = textFieldValue;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i29 = i4 & 4;
        if (i29 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i6 = i4 & 8;
            int i30 = Fields.RotationZ;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z4 = z;
                i5 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    z5 = z2;
                    i5 |= startRestartGroup.changed(z5) ? 16384 : 8192;
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
                        i5 |= startRestartGroup.changed(keyboardActions) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i11 = i4 & Fields.RotationX;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i12 = i4 & Fields.RotationY;
                    if (i12 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changed(i) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i14 = i4 & Fields.RotationZ;
                        if (i14 != 0) {
                            i16 = i3 | 6;
                            i15 = i14;
                        } else if ((i3 & 6) == 0) {
                            i15 = i14;
                            i16 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i3;
                        }
                        i17 = i4 & Fields.CameraDistance;
                        if (i17 != 0) {
                            i16 |= 48;
                            i18 = i17;
                        } else if ((i3 & 48) == 0) {
                            i18 = i17;
                            i16 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
                        } else {
                            i18 = i17;
                        }
                        int i31 = i16;
                        i19 = i4 & Fields.TransformOrigin;
                        if (i19 != 0) {
                            i20 = i31 | 384;
                        } else {
                            int i32 = i31;
                            if ((i3 & 384) == 0) {
                                i32 |= startRestartGroup.changed(mutableInteractionSource) ? Fields.RotationX : Fields.SpotShadowColor;
                            }
                            i20 = i32;
                        }
                        i21 = i4 & 8192;
                        if (i21 != 0) {
                            i22 = i20 | 3072;
                        } else {
                            int i33 = i20;
                            if ((i3 & 3072) == 0) {
                                if (startRestartGroup.changed(brush)) {
                                    i30 = 2048;
                                }
                                i22 = i33 | i30;
                            } else {
                                i22 = i33;
                            }
                        }
                        i23 = i4 & Fields.Clip;
                        if (i23 != 0) {
                            i24 = i22 | 24576;
                        } else {
                            int i34 = i22;
                            if ((i3 & 24576) == 0) {
                                i34 |= startRestartGroup.changedInstance(nyVar) ? 16384 : 8192;
                            }
                            i24 = i34;
                        }
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
                            if (i29 != 0) {
                                modifier4 = Modifier.Companion;
                                i26 = i11;
                            } else {
                                i26 = i11;
                                modifier4 = modifier2;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if (i7 != 0) {
                                z5 = false;
                            }
                            TextStyle textStyle4 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                            if (i9 != 0) {
                                boolean z11 = z5;
                                keyboardOptions4 = KeyboardOptions.Companion.getDefault();
                                z9 = z11;
                            } else {
                                z9 = z5;
                                keyboardOptions4 = keyboardOptions2;
                            }
                            KeyboardActions keyboardActions3 = i10 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                            boolean z12 = i26 != 0 ? false : z3;
                            int i35 = i13 != 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i15 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                            if (i18 != 0) {
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new ed(2);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                kyVar4 = (ky) rememberedValue;
                            } else {
                                kyVar4 = kyVar2;
                            }
                            if (i19 != 0) {
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue2;
                                i27 = i21;
                            } else {
                                i27 = i21;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            if (i27 != 0) {
                                z10 = z9;
                                brush3 = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
                                i28 = i23;
                            } else {
                                z10 = z9;
                                brush3 = brush;
                                i28 = i23;
                            }
                            ny m1086getLambda$665310900$foundation = i28 != 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m1086getLambda$665310900$foundation() : nyVar;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1742344466, i5, i24, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:990)");
                            }
                            int i36 = i24 << 3;
                            boolean z13 = z10;
                            composer2 = startRestartGroup;
                            BasicTextField(textFieldValue2, kyVar, modifier4, z4, z13, textStyle4, keyboardOptions4, keyboardActions3, z12, i35, 1, none, kyVar4, mutableInteractionSource3, brush3, m1086getLambda$665310900$foundation, composer2, i5 & 2147483646, (i36 & 112) | 6 | (i36 & 896) | (i36 & 7168) | (57344 & i36) | (i36 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z8 = z13;
                            modifier3 = modifier4;
                            z7 = z4;
                            textStyle3 = textStyle4;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions2 = keyboardActions3;
                            z6 = z12;
                            i25 = i35;
                            visualTransformation2 = none;
                            kyVar3 = kyVar4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            brush2 = brush3;
                            nyVar2 = m1086getLambda$665310900$foundation;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            keyboardActions2 = keyboardActions;
                            z6 = z3;
                            kyVar3 = kyVar2;
                            brush2 = brush;
                            z7 = z4;
                            z8 = z5;
                            textStyle3 = textStyle2;
                            keyboardOptions3 = keyboardOptions2;
                            modifier3 = modifier2;
                            i25 = i;
                            visualTransformation2 = visualTransformation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            nyVar2 = nyVar;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new yc(textFieldValue, kyVar, modifier3, z7, z8, textStyle3, keyboardOptions3, keyboardActions2, z6, i25, visualTransformation2, kyVar3, mutableInteractionSource2, brush2, nyVar2, i2, i3, i4, 0));
                            return;
                        }
                        return;
                    }
                    i13 = i12;
                    i14 = i4 & Fields.RotationZ;
                    if (i14 != 0) {
                    }
                    i17 = i4 & Fields.CameraDistance;
                    if (i17 != 0) {
                    }
                    int i312 = i16;
                    i19 = i4 & Fields.TransformOrigin;
                    if (i19 != 0) {
                    }
                    i21 = i4 & 8192;
                    if (i21 != 0) {
                    }
                    i23 = i4 & Fields.Clip;
                    if (i23 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
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
                i12 = i4 & Fields.RotationY;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & Fields.RotationZ;
                if (i14 != 0) {
                }
                i17 = i4 & Fields.CameraDistance;
                if (i17 != 0) {
                }
                int i3122 = i16;
                i19 = i4 & Fields.TransformOrigin;
                if (i19 != 0) {
                }
                i21 = i4 & 8192;
                if (i21 != 0) {
                }
                i23 = i4 & Fields.Clip;
                if (i23 != 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            z5 = z2;
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
            i12 = i4 & Fields.RotationY;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & Fields.RotationZ;
            if (i14 != 0) {
            }
            i17 = i4 & Fields.CameraDistance;
            if (i17 != 0) {
            }
            int i31222 = i16;
            i19 = i4 & Fields.TransformOrigin;
            if (i19 != 0) {
            }
            i21 = i4 & 8192;
            if (i21 != 0) {
            }
            i23 = i4 & Fields.Clip;
            if (i23 != 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        int i302 = Fields.RotationZ;
        if (i6 == 0) {
        }
        z4 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        z5 = z2;
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
        i12 = i4 & Fields.RotationY;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & Fields.RotationZ;
        if (i14 != 0) {
        }
        i17 = i4 & Fields.CameraDistance;
        if (i17 != 0) {
        }
        int i312222 = i16;
        i19 = i4 & Fields.TransformOrigin;
        if (i19 != 0) {
        }
        i21 = i4 & 8192;
        if (i21 != 0) {
        }
        i23 = i4 & Fields.Clip;
        if (i23 != 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i24 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
