package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import defpackage.bq;
import defpackage.cm0;
import defpackage.dq;
import defpackage.eh0;
import defpackage.er;
import defpackage.fc;
import defpackage.hi;
import defpackage.hm;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.ms;
import defpackage.my;
import defpackage.ne0;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.st;
import defpackage.te0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.yl0;
import defpackage.z4;
import defpackage.zl0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        float m3254getLevel0D9Ej5fM = elevationTokens.m3254getLevel0D9Ej5fM();
        TonalElevation = m3254getLevel0D9Ej5fM;
        ShadowElevation = elevationTokens.m3254getLevel0D9Ej5fM();
        Elevation = m3254getLevel0D9Ej5fM;
        InputFieldHeight = SearchBarTokens.INSTANCE.m3600getContainerHeightD9Ej5fM();
    }

    private SearchBarDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$11$lambda$10(String str, SearchBarState searchBarState, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean isExpanded;
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        isExpanded = SearchBarKt.isExpanded(searchBarState);
        if (isExpanded) {
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputField$lambda$13$lambda$12(ky kyVar, TextFieldState textFieldState, iy iyVar) {
        kyVar.invoke(textFieldState.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$17$lambda$16(SearchBarState searchBarState, un unVar) {
        boolean isExpanded;
        isExpanded = SearchBarKt.isExpanded(searchBarState);
        if (!isExpanded) {
            p01.t(unVar, null, null, new SearchBarDefaults$InputField$8$1$1(searchBarState, null), 3);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$20(SearchBarDefaults searchBarDefaults, TextFieldState textFieldState, SearchBarState searchBarState, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        searchBarDefaults.InputField(textFieldState, searchBarState, kyVar, modifier, z, z2, textStyle, myVar, myVar2, myVar3, myVar4, myVar5, inputTransformation, outputTransformation, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$25$lambda$24(ky kyVar, FocusState focusState) {
        if (focusState.isFocused()) {
            kyVar.invoke(Boolean.TRUE);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$27$lambda$26(String str, boolean z, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (z) {
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputField$lambda$29$lambda$28(ky kyVar, TextFieldState textFieldState, iy iyVar) {
        kyVar.invoke(textFieldState.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$33(SearchBarDefaults searchBarDefaults, TextFieldState textFieldState, ky kyVar, boolean z, ky kyVar2, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        searchBarDefaults.InputField(textFieldState, kyVar, z, kyVar2, modifier, z2, z3, textStyle, myVar, myVar2, myVar3, myVar4, myVar5, inputTransformation, outputTransformation, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$38$lambda$37(ky kyVar, FocusState focusState) {
        if (focusState.isFocused()) {
            kyVar.invoke(Boolean.TRUE);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$40$lambda$39(String str, boolean z, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (z) {
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$42$lambda$41(ky kyVar, String str, KeyboardActionScope keyboardActionScope) {
        kyVar.invoke(str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$44(SearchBarDefaults searchBarDefaults, String str, ky kyVar, ky kyVar2, boolean z, ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        searchBarDefaults.InputField(str, kyVar, kyVar2, z, kyVar3, modifier, z2, myVar, myVar2, myVar3, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InputField$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputField$lambda$9$lambda$8(boolean z, un unVar, SearchBarState searchBarState, FocusState focusState) {
        if (focusState.isFocused() && z) {
            p01.t(unVar, null, null, new SearchBarDefaults$InputField$2$1$1(searchBarState, null), 3);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior$lambda$3$lambda$2(float f, float f2, iy iyVar, boolean z, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec) {
        return new EnterAlwaysSearchBarScrollBehavior(f, f2, iyVar, z, animationSpec, decayAnimationSpec);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x05a7, code lost:
    
        if (r1 == r25.getEmpty()) goto L315;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final TextFieldState textFieldState, SearchBarState searchBarState, final ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        TextStyle textStyle2;
        int i8;
        my myVar6;
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
        SearchBarState searchBarState2;
        final Modifier modifier2;
        final my myVar7;
        final my myVar8;
        final InputTransformation inputTransformation2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z5;
        final boolean z6;
        final TextStyle textStyle3;
        final my myVar9;
        Composer composer2;
        final my myVar10;
        final my myVar11;
        final OutputTransformation outputTransformation2;
        ScopeUpdateScope endRestartGroup;
        boolean z7;
        TextStyle textStyle4;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        ScrollState scrollState3;
        Shape shape3;
        int i22;
        TextFieldColors textFieldColors3;
        int i23;
        MutableInteractionSource mutableInteractionSource3;
        final TextFieldColors textFieldColors4;
        int i24;
        Modifier modifier3;
        boolean z8;
        TextStyle textStyle5;
        my myVar12;
        final my myVar13;
        final my myVar14;
        my myVar15;
        my myVar16;
        final Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        int i25;
        long m2574textColorXeAY9LY$material3;
        boolean z9;
        final SearchBarState searchBarState3;
        float f;
        boolean changed;
        FocusManager focusManager;
        boolean changed2;
        Object rememberedValue;
        boolean z10;
        Object rememberedValue2;
        TextFieldState textFieldState2;
        int i26;
        boolean z11;
        TextFieldLineLimits.SingleLine singleLine;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambda3;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changed3;
        Object rememberedValue4;
        TextFieldState textFieldState3;
        State<Boolean> state;
        boolean isExpanded;
        boolean z12;
        boolean isExpanded2;
        boolean changed4;
        Object rememberedValue5;
        Composer startRestartGroup = composer.startRestartGroup(759286022);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(searchBarState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i27 = i3 & 8;
        int i28 = Fields.RotationZ;
        if (i27 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            int i29 = 8192;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                }
                i7 = i & 1572864;
                int i30 = Fields.BlendMode;
                if (i7 == 0) {
                    textStyle2 = textStyle;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(textStyle2)) ? 1048576 : 524288;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 != 0) {
                    i4 |= 12582912;
                    myVar6 = myVar;
                } else {
                    myVar6 = myVar;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar6) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & Fields.RotationX;
                int i31 = GroupFlagsKt.HasAuxSlotFlag;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar2) ? 67108864 : 33554432;
                }
                i10 = i3 & Fields.RotationY;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i11 = i10;
                    i4 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i12 = i3 & Fields.RotationZ;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (startRestartGroup.changedInstance(myVar4) ? 4 : 2);
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
                        i14 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
                    } else {
                        i16 = i15;
                    }
                    int i32 = i14;
                    i17 = i3 & Fields.TransformOrigin;
                    if (i17 == 0) {
                        i18 = i32 | 384;
                    } else {
                        int i33 = i32;
                        if ((i2 & 384) == 0) {
                            i33 |= startRestartGroup.changed(inputTransformation) ? Fields.RotationX : Fields.SpotShadowColor;
                        }
                        i18 = i33;
                    }
                    i19 = i3 & 8192;
                    if (i19 == 0) {
                        i20 = i18 | 3072;
                    } else {
                        i20 = i18;
                        if ((i2 & 3072) == 0) {
                            if (startRestartGroup.changed(outputTransformation)) {
                                i28 = 2048;
                            }
                            i20 |= i28;
                            if ((i2 & 24576) == 0) {
                                if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(scrollState)) {
                                    i29 = 16384;
                                }
                                i20 |= i29;
                            }
                            if ((i2 & 196608) == 0) {
                                i20 |= ((i3 & Fields.CompositingStrategy) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                            }
                            if ((i2 & 1572864) == 0) {
                                if ((i3 & 65536) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i30 = 1048576;
                                }
                                i20 |= i30;
                            }
                            i21 = i3 & Fields.RenderEffect;
                            if (i21 != 0) {
                                i20 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i20 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                            }
                            if ((i3 & Fields.ColorFilter) != 0) {
                                i20 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                if (startRestartGroup.changed(this)) {
                                    i31 = 67108864;
                                }
                                i20 |= i31;
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i27 != 0 ? Modifier.Companion : modifier;
                                    boolean z13 = i5 != 0 ? true : z3;
                                    z7 = i6 != 0 ? false : z4;
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        textStyle4 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                    } else {
                                        textStyle4 = textStyle2;
                                    }
                                    int i34 = i4;
                                    my myVar17 = i8 != 0 ? null : myVar6;
                                    my myVar18 = i9 != 0 ? null : myVar2;
                                    my myVar19 = i11 != 0 ? null : myVar3;
                                    my myVar20 = i13 != 0 ? null : myVar4;
                                    my myVar21 = i16 != 0 ? null : myVar5;
                                    inputTransformation3 = i17 != 0 ? null : inputTransformation;
                                    outputTransformation3 = i19 != 0 ? null : outputTransformation;
                                    if ((i3 & Fields.Clip) != 0) {
                                        i20 &= -57345;
                                        scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    } else {
                                        scrollState3 = scrollState;
                                    }
                                    if ((i3 & Fields.CompositingStrategy) != 0) {
                                        Shape inputFieldShape = getInputFieldShape(startRestartGroup, (i20 >> 24) & 14);
                                        i20 &= -458753;
                                        shape3 = inputFieldShape;
                                    } else {
                                        shape3 = shape;
                                    }
                                    int i35 = i20;
                                    if ((i3 & 65536) != 0) {
                                        i22 = 759286022;
                                        textFieldColors3 = m2314inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i35 >> 15) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                                        startRestartGroup = startRestartGroup;
                                        i23 = i35 & (-3670017);
                                    } else {
                                        i22 = 759286022;
                                        textFieldColors3 = textFieldColors;
                                        i23 = i35;
                                    }
                                    if (i21 != 0) {
                                        textFieldColors4 = textFieldColors3;
                                        i24 = i23;
                                        modifier3 = modifier4;
                                        z8 = z13;
                                        textStyle5 = textStyle4;
                                        i4 = i34;
                                        myVar12 = myVar17;
                                        myVar13 = myVar18;
                                        myVar14 = myVar19;
                                        myVar15 = myVar20;
                                        myVar16 = myVar21;
                                        shape4 = shape3;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        textFieldColors4 = textFieldColors3;
                                        i24 = i23;
                                        modifier3 = modifier4;
                                        z8 = z13;
                                        textStyle5 = textStyle4;
                                        i4 = i34;
                                        myVar12 = myVar17;
                                        myVar13 = myVar18;
                                        myVar14 = myVar19;
                                        myVar15 = myVar20;
                                        myVar16 = myVar21;
                                        shape4 = shape3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Fields.Clip) != 0) {
                                        i20 &= -57345;
                                    }
                                    if ((i3 & Fields.CompositingStrategy) != 0) {
                                        i20 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i20 &= -3670017;
                                    }
                                    modifier3 = modifier;
                                    myVar13 = myVar2;
                                    myVar14 = myVar3;
                                    myVar15 = myVar4;
                                    inputTransformation3 = inputTransformation;
                                    outputTransformation3 = outputTransformation;
                                    scrollState3 = scrollState;
                                    shape4 = shape;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z8 = z3;
                                    z7 = z4;
                                    textStyle5 = textStyle2;
                                    myVar12 = myVar6;
                                    i24 = i20;
                                    i22 = 759286022;
                                    myVar16 = myVar5;
                                    textFieldColors4 = textFieldColors;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i22, i4, i24, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:1310)");
                                }
                                if (mutableInteractionSource3 == null) {
                                    startRestartGroup.startReplaceGroup(-1701839691);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == Composer.Companion.getEmpty()) {
                                        rememberedValue6 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    mutableInteractionSource4 = (MutableInteractionSource) rememberedValue6;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-470540702);
                                    startRestartGroup.endReplaceGroup();
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                final State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0);
                                final FocusManager focusManager2 = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                my myVar22 = myVar12;
                                final boolean m5569equalsimpl0 = InputMode.m5569equalsimpl0(((InputModeManager) startRestartGroup.consume(CompositionLocalsKt.getLocalInputModeManager())).mo5576getInputModeaOaMEAU(), InputMode.Companion.m5574getTouchaOaMEAU());
                                Strings.Companion companion = Strings.Companion;
                                my myVar23 = myVar15;
                                Object m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_search_bar_search), startRestartGroup, 0);
                                my myVar24 = myVar16;
                                Object m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_suggestions_available), startRestartGroup, 0);
                                long m7090getColor0d7_KjU = textStyle5.m7090getColor0d7_KjU();
                                if (m7090getColor0d7_KjU != 16) {
                                    m2574textColorXeAY9LY$material3 = m7090getColor0d7_KjU;
                                    i25 = i24;
                                } else {
                                    i25 = i24;
                                    m2574textColorXeAY9LY$material3 = textFieldColors4.m2574textColorXeAY9LY$material3(z8, false, InputField$lambda$5(collectIsFocusedAsState));
                                }
                                TextStyle merge = textStyle5.merge(new TextStyle(m2574textColorXeAY9LY$material3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null));
                                Object rememberedValue7 = startRestartGroup.rememberedValue();
                                Composer.Companion companion2 = Composer.Companion;
                                if (rememberedValue7 == companion2.getEmpty()) {
                                    rememberedValue7 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                final un unVar = (un) rememberedValue7;
                                TextStyle textStyle6 = textStyle5;
                                int i36 = i4 & 112;
                                boolean changed5 = startRestartGroup.changed(m5569equalsimpl0) | (i36 == 32) | startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(focusManager2);
                                Object rememberedValue8 = startRestartGroup.rememberedValue();
                                if (changed5) {
                                    z9 = z8;
                                } else {
                                    z9 = z8;
                                    if (rememberedValue8 != companion2.getEmpty()) {
                                        searchBarState3 = searchBarState;
                                        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifier3, (ky) rememberedValue8);
                                        float searchBarMinWidth = SearchBarKt.getSearchBarMinWidth();
                                        f = SearchBarKt.SearchBarMaxWidth;
                                        Modifier m811sizeInqDBjuR0$default = SizeKt.m811sizeInqDBjuR0$default(onPreviewKeyEvent, searchBarMinWidth, InputFieldHeight, f, 0.0f, 8, null);
                                        Modifier modifier5 = modifier3;
                                        changed = startRestartGroup.changed(m5569equalsimpl0) | startRestartGroup.changedInstance(unVar) | (i36 != 32);
                                        Object rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (changed) {
                                            focusManager = focusManager2;
                                        } else {
                                            focusManager = focusManager2;
                                        }
                                        rememberedValue9 = new ne0(m5569equalsimpl0, unVar, searchBarState3);
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                        Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(m811sizeInqDBjuR0$default, (ky) rememberedValue9);
                                        changed2 = startRestartGroup.changed(m2983getString2EP1pXo) | (i36 != 32) | startRestartGroup.changed(m2983getString2EP1pXo2);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed2 || rememberedValue == companion2.getEmpty()) {
                                            rememberedValue = new defpackage.f1(m2983getString2EP1pXo, searchBarState3, m2983getString2EP1pXo2, 17);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (ky) rememberedValue, 1, null);
                                        TextFieldLineLimits.SingleLine singleLine2 = TextFieldLineLimits.SingleLine.INSTANCE;
                                        SolidColor solidColor = new SolidColor(textFieldColors4.m2524cursorColorvNxB06k$material3(false), null);
                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m7247getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (dq) null);
                                        int i37 = i4 & 14;
                                        z10 = ((i4 & 896) != 256) | (i37 != 4);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!z10 || rememberedValue2 == companion2.getEmpty()) {
                                            textFieldState2 = textFieldState;
                                            i26 = i4;
                                            rememberedValue2 = new yl0(kyVar, textFieldState2, 0);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        } else {
                                            textFieldState2 = textFieldState;
                                            i26 = i4;
                                        }
                                        KeyboardActionHandler keyboardActionHandler = (KeyboardActionHandler) rememberedValue2;
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        if (myVar13 != null) {
                                            startRestartGroup.startReplaceGroup(-1698078028);
                                            startRestartGroup.endReplaceGroup();
                                            z11 = m5569equalsimpl0;
                                            singleLine = singleLine2;
                                            composableLambda = null;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-1698078027);
                                            z11 = m5569equalsimpl0;
                                            singleLine = singleLine2;
                                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(759038428, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$5$1
                                                public final void invoke(Composer composer3, int i38) {
                                                    float f2;
                                                    if (!composer3.shouldExecute((i38 & 3) != 2, i38 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(759038428, i38, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:1392)");
                                                    }
                                                    Modifier.Companion companion3 = Modifier.Companion;
                                                    f2 = SearchBarKt.SearchBarIconOffsetX;
                                                    Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion3, f2, 0.0f, 2, null);
                                                    my myVar25 = my.this;
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m722offsetVpY3zN4$default);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                    iy constructor = companion4.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                                    my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                    }
                                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    if (fc.l(myVar25, composer3, 0)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // defpackage.my
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                                    return w01.a;
                                                }
                                            }, startRestartGroup, 54);
                                            startRestartGroup.endReplaceGroup();
                                            composableLambda = rememberComposableLambda;
                                        }
                                        if (myVar14 != null) {
                                            startRestartGroup.startReplaceGroup(-1697869615);
                                            startRestartGroup.endReplaceGroup();
                                            composableLambda2 = composableLambda;
                                            composableLambda3 = null;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-1697869614);
                                            composableLambda2 = composableLambda;
                                            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(55642171, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$6$1
                                                public final void invoke(Composer composer3, int i38) {
                                                    float f2;
                                                    if (!composer3.shouldExecute((i38 & 3) != 2, i38 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(55642171, i38, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:1396)");
                                                    }
                                                    Modifier.Companion companion3 = Modifier.Companion;
                                                    f2 = SearchBarKt.SearchBarIconOffsetX;
                                                    Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion3, Dp.m7611constructorimpl(-f2), 0.0f, 2, null);
                                                    my myVar25 = my.this;
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m722offsetVpY3zN4$default);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                    iy constructor = companion4.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                                    my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                    }
                                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    if (fc.l(myVar25, composer3, 0)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // defpackage.my
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                                    return w01.a;
                                                }
                                            }, startRestartGroup, 54);
                                            startRestartGroup.endReplaceGroup();
                                            composableLambda3 = rememberComposableLambda2;
                                        }
                                        final boolean z14 = z9;
                                        int i38 = i25;
                                        Shape shape5 = shape4;
                                        TextFieldColors textFieldColors5 = textFieldColors4;
                                        Composer composer3 = startRestartGroup;
                                        FocusManager focusManager3 = focusManager;
                                        my myVar25 = myVar13;
                                        my myVar26 = myVar14;
                                        int i39 = i26;
                                        OutputTransformation outputTransformation4 = outputTransformation3;
                                        TextFieldLineLimits.SingleLine singleLine3 = singleLine;
                                        TextFieldDecorator decorator = textFieldDefaults.decorator(textFieldState2, z14, singleLine3, outputTransformation4, mutableInteractionSource5, null, null, myVar22, composableLambda2, composableLambda3, myVar23, myVar24, null, false, textFieldColors5, TextFieldDefaults.m2577contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(1500441906, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$7
                                            public final void invoke(Composer composer4, int i40) {
                                                boolean InputField$lambda$5;
                                                if (!composer4.shouldExecute((i40 & 3) != 2, i40 & 1)) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1500441906, i40, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:1403)");
                                                }
                                                TextFieldColors textFieldColors6 = TextFieldColors.this;
                                                boolean z15 = z14;
                                                InputField$lambda$5 = SearchBarDefaults.InputField$lambda$5(collectIsFocusedAsState);
                                                BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.Companion, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(SingleValueAnimationKt.m100animateColorAsStateeuL9pac(textFieldColors6.m2522containerColorXeAY9LY$material3(z15, false, InputField$lambda$5), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer4, 6), null, null, composer4, 0, 12)) { // from class: androidx.compose.material3.SearchBarDefaults$InputField$7.1
                                                    @Override // defpackage.w20
                                                    public Object get() {
                                                        return ((State) this.receiver).getValue();
                                                    }
                                                }), shape4), composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54), composer3, i37 | 384 | ((i26 >> 9) & 112) | (i38 & 7168) | (i26 & 29360128), (i38 & 14) | 14155776 | (i38 & 112) | ((i38 >> 6) & 57344), 12384);
                                        int i40 = i39 >> 6;
                                        boolean z15 = z11;
                                        boolean z16 = z7;
                                        InputTransformation inputTransformation4 = inputTransformation3;
                                        ScrollState scrollState4 = scrollState3;
                                        BasicTextFieldKt.BasicTextField(textFieldState, semantics$default, z14, z16, inputTransformation4, merge, keyboardOptions, keyboardActionHandler, singleLine3, (my) null, mutableInteractionSource5, solidColor, outputTransformation4, decorator, scrollState4, composer3, 102236160 | i37 | (i40 & 896) | (i40 & 7168) | ((i38 << 6) & 57344), ((i38 >> 3) & 896) | (i38 & 57344), Fields.RotationY);
                                        changedInstance = (i36 != 32) | composer3.changedInstance(unVar);
                                        rememberedValue3 = composer3.rememberedValue();
                                        if (!changedInstance || rememberedValue3 == companion2.getEmpty()) {
                                            searchBarState2 = searchBarState;
                                            rememberedValue3 = new zl0(unVar, searchBarState2);
                                            composer3.updateRememberedValue(rememberedValue3);
                                        } else {
                                            searchBarState2 = searchBarState;
                                        }
                                        SearchBarKt.DetectClickFromInteractionSource(mutableInteractionSource5, (iy) rememberedValue3, composer3, 0);
                                        changed3 = (i36 != 32) | (i37 != 4) | composer3.changed(collectIsFocusedAsState) | composer3.changedInstance(unVar);
                                        rememberedValue4 = composer3.rememberedValue();
                                        if (!changed3 || rememberedValue4 == companion2.getEmpty()) {
                                            rememberedValue4 = new SearchBarDefaults$InputField$9$1(searchBarState2, textFieldState, unVar, collectIsFocusedAsState, null);
                                            textFieldState3 = textFieldState;
                                            state = collectIsFocusedAsState;
                                            composer3.updateRememberedValue(rememberedValue4);
                                        } else {
                                            textFieldState3 = textFieldState;
                                            state = collectIsFocusedAsState;
                                        }
                                        EffectsKt.LaunchedEffect(searchBarState2, textFieldState3, (my) rememberedValue4, composer3, ((i39 >> 3) & 14) | ((i39 << 3) & 112));
                                        isExpanded = SearchBarKt.isExpanded(searchBarState2);
                                        z12 = isExpanded && InputField$lambda$5(state) && z15;
                                        isExpanded2 = SearchBarKt.isExpanded(searchBarState2);
                                        Boolean valueOf = Boolean.valueOf(isExpanded2);
                                        changed4 = composer3.changed(z12) | composer3.changedInstance(focusManager3);
                                        rememberedValue5 = composer3.rememberedValue();
                                        if (!changed4 || rememberedValue5 == companion2.getEmpty()) {
                                            rememberedValue5 = new SearchBarDefaults$InputField$10$1(z12, focusManager3, null);
                                            composer3.updateRememberedValue(rememberedValue5);
                                        }
                                        EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue5, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z5 = z14;
                                        z6 = z16;
                                        scrollState2 = scrollState4;
                                        composer2 = composer3;
                                        textFieldColors2 = textFieldColors5;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        modifier2 = modifier5;
                                        textStyle3 = textStyle6;
                                        myVar9 = myVar22;
                                        myVar10 = myVar25;
                                        myVar7 = myVar26;
                                        myVar11 = myVar24;
                                        shape2 = shape5;
                                        inputTransformation2 = inputTransformation4;
                                        outputTransformation2 = outputTransformation4;
                                        myVar8 = myVar23;
                                    }
                                }
                                searchBarState3 = searchBarState;
                                rememberedValue8 = new ky() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$1$1

                                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                                    @bq(c = "androidx.compose.material3.SearchBarDefaults$InputField$1$1$1", f = "SearchBar.kt", l = {1346}, m = "invokeSuspend")
                                    /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$1$1$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends us0 implements my {
                                        final /* synthetic */ SearchBarState $searchBarState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(SearchBarState searchBarState, hm hmVar) {
                                            super(2, hmVar);
                                            this.$searchBarState = searchBarState;
                                        }

                                        @Override // defpackage.mc
                                        public final hm create(Object obj, hm hmVar) {
                                            return new AnonymousClass1(this.$searchBarState, hmVar);
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
                                                SearchBarState searchBarState = this.$searchBarState;
                                                this.label = 1;
                                                Object animateToExpanded = searchBarState.animateToExpanded(this);
                                                vn vnVar = vn.d;
                                                if (animateToExpanded == vnVar) {
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

                                    @Override // defpackage.ky
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return m2315invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
                                    }

                                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                    public final Boolean m2315invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                        boolean isExpanded3;
                                        boolean isExpanded4;
                                        if (!m5569equalsimpl0) {
                                            isExpanded4 = SearchBarKt.isExpanded(searchBarState3);
                                            if (!isExpanded4 && Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), Key.Companion.m5686getDirectionDownEK5gGoQ())) {
                                                p01.t(unVar, null, null, new AnonymousClass1(searchBarState3, null), 3);
                                                return Boolean.TRUE;
                                            }
                                        }
                                        isExpanded3 = SearchBarKt.isExpanded(searchBarState3);
                                        if (!isExpanded3 || !Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), Key.Companion.m5686getDirectionDownEK5gGoQ())) {
                                            return Boolean.FALSE;
                                        }
                                        focusManager2.mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4392getDowndhqQ8s());
                                        return Boolean.TRUE;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                Modifier onPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifier3, (ky) rememberedValue8);
                                float searchBarMinWidth2 = SearchBarKt.getSearchBarMinWidth();
                                f = SearchBarKt.SearchBarMaxWidth;
                                Modifier m811sizeInqDBjuR0$default2 = SizeKt.m811sizeInqDBjuR0$default(onPreviewKeyEvent2, searchBarMinWidth2, InputFieldHeight, f, 0.0f, 8, null);
                                Modifier modifier52 = modifier3;
                                changed = startRestartGroup.changed(m5569equalsimpl0) | startRestartGroup.changedInstance(unVar) | (i36 != 32);
                                Object rememberedValue92 = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                rememberedValue92 = new ne0(m5569equalsimpl0, unVar, searchBarState3);
                                startRestartGroup.updateRememberedValue(rememberedValue92);
                                Modifier onFocusChanged2 = FocusChangedModifierKt.onFocusChanged(m811sizeInqDBjuR0$default2, (ky) rememberedValue92);
                                changed2 = startRestartGroup.changed(m2983getString2EP1pXo) | (i36 != 32) | startRestartGroup.changed(m2983getString2EP1pXo2);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue = new defpackage.f1(m2983getString2EP1pXo, searchBarState3, m2983getString2EP1pXo2, 17);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                Modifier semantics$default2 = SemanticsModifierKt.semantics$default(onFocusChanged2, false, (ky) rememberedValue, 1, null);
                                TextFieldLineLimits.SingleLine singleLine22 = TextFieldLineLimits.SingleLine.INSTANCE;
                                SolidColor solidColor2 = new SolidColor(textFieldColors4.m2524cursorColorvNxB06k$material3(false), null);
                                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m7247getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (dq) null);
                                int i372 = i4 & 14;
                                z10 = ((i4 & 896) != 256) | (i372 != 4);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z10) {
                                }
                                textFieldState2 = textFieldState;
                                i26 = i4;
                                rememberedValue2 = new yl0(kyVar, textFieldState2, 0);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                KeyboardActionHandler keyboardActionHandler2 = (KeyboardActionHandler) rememberedValue2;
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                if (myVar13 != null) {
                                }
                                if (myVar14 != null) {
                                }
                                final boolean z142 = z9;
                                int i382 = i25;
                                Shape shape52 = shape4;
                                TextFieldColors textFieldColors52 = textFieldColors4;
                                Composer composer32 = startRestartGroup;
                                FocusManager focusManager32 = focusManager;
                                my myVar252 = myVar13;
                                my myVar262 = myVar14;
                                int i392 = i26;
                                OutputTransformation outputTransformation42 = outputTransformation3;
                                TextFieldLineLimits.SingleLine singleLine32 = singleLine;
                                TextFieldDecorator decorator2 = textFieldDefaults2.decorator(textFieldState2, z142, singleLine32, outputTransformation42, mutableInteractionSource5, null, null, myVar22, composableLambda2, composableLambda3, myVar23, myVar24, null, false, textFieldColors52, TextFieldDefaults.m2577contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults2, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(1500441906, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$7
                                    public final void invoke(Composer composer4, int i402) {
                                        boolean InputField$lambda$5;
                                        if (!composer4.shouldExecute((i402 & 3) != 2, i402 & 1)) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1500441906, i402, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:1403)");
                                        }
                                        TextFieldColors textFieldColors6 = TextFieldColors.this;
                                        boolean z152 = z142;
                                        InputField$lambda$5 = SearchBarDefaults.InputField$lambda$5(collectIsFocusedAsState);
                                        BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.Companion, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(SingleValueAnimationKt.m100animateColorAsStateeuL9pac(textFieldColors6.m2522containerColorXeAY9LY$material3(z152, false, InputField$lambda$5), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer4, 6), null, null, composer4, 0, 12)) { // from class: androidx.compose.material3.SearchBarDefaults$InputField$7.1
                                            @Override // defpackage.w20
                                            public Object get() {
                                                return ((State) this.receiver).getValue();
                                            }
                                        }), shape4), composer4, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), composer32, i372 | 384 | ((i26 >> 9) & 112) | (i382 & 7168) | (i26 & 29360128), (i382 & 14) | 14155776 | (i382 & 112) | ((i382 >> 6) & 57344), 12384);
                                int i402 = i392 >> 6;
                                boolean z152 = z11;
                                boolean z162 = z7;
                                InputTransformation inputTransformation42 = inputTransformation3;
                                ScrollState scrollState42 = scrollState3;
                                BasicTextFieldKt.BasicTextField(textFieldState, semantics$default2, z142, z162, inputTransformation42, merge, keyboardOptions2, keyboardActionHandler2, singleLine32, (my) null, mutableInteractionSource5, solidColor2, outputTransformation42, decorator2, scrollState42, composer32, 102236160 | i372 | (i402 & 896) | (i402 & 7168) | ((i382 << 6) & 57344), ((i382 >> 3) & 896) | (i382 & 57344), Fields.RotationY);
                                changedInstance = (i36 != 32) | composer32.changedInstance(unVar);
                                rememberedValue3 = composer32.rememberedValue();
                                if (changedInstance) {
                                }
                                searchBarState2 = searchBarState;
                                rememberedValue3 = new zl0(unVar, searchBarState2);
                                composer32.updateRememberedValue(rememberedValue3);
                                SearchBarKt.DetectClickFromInteractionSource(mutableInteractionSource5, (iy) rememberedValue3, composer32, 0);
                                changed3 = (i36 != 32) | (i372 != 4) | composer32.changed(collectIsFocusedAsState) | composer32.changedInstance(unVar);
                                rememberedValue4 = composer32.rememberedValue();
                                if (changed3) {
                                }
                                rememberedValue4 = new SearchBarDefaults$InputField$9$1(searchBarState2, textFieldState, unVar, collectIsFocusedAsState, null);
                                textFieldState3 = textFieldState;
                                state = collectIsFocusedAsState;
                                composer32.updateRememberedValue(rememberedValue4);
                                EffectsKt.LaunchedEffect(searchBarState2, textFieldState3, (my) rememberedValue4, composer32, ((i392 >> 3) & 14) | ((i392 << 3) & 112));
                                isExpanded = SearchBarKt.isExpanded(searchBarState2);
                                if (isExpanded) {
                                }
                                isExpanded2 = SearchBarKt.isExpanded(searchBarState2);
                                Boolean valueOf2 = Boolean.valueOf(isExpanded2);
                                changed4 = composer32.changed(z12) | composer32.changedInstance(focusManager32);
                                rememberedValue5 = composer32.rememberedValue();
                                if (!changed4) {
                                }
                                rememberedValue5 = new SearchBarDefaults$InputField$10$1(z12, focusManager32, null);
                                composer32.updateRememberedValue(rememberedValue5);
                                EffectsKt.LaunchedEffect(valueOf2, (my) rememberedValue5, composer32, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z5 = z142;
                                z6 = z162;
                                scrollState2 = scrollState42;
                                composer2 = composer32;
                                textFieldColors2 = textFieldColors52;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                modifier2 = modifier52;
                                textStyle3 = textStyle6;
                                myVar9 = myVar22;
                                myVar10 = myVar252;
                                myVar7 = myVar262;
                                myVar11 = myVar24;
                                shape2 = shape52;
                                inputTransformation2 = inputTransformation42;
                                outputTransformation2 = outputTransformation42;
                                myVar8 = myVar23;
                            } else {
                                searchBarState2 = searchBarState;
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                myVar7 = myVar3;
                                myVar8 = myVar4;
                                inputTransformation2 = inputTransformation;
                                scrollState2 = scrollState;
                                shape2 = shape;
                                textFieldColors2 = textFieldColors;
                                mutableInteractionSource2 = mutableInteractionSource;
                                z5 = z3;
                                z6 = z4;
                                textStyle3 = textStyle2;
                                myVar9 = myVar6;
                                composer2 = startRestartGroup;
                                myVar10 = myVar2;
                                myVar11 = myVar5;
                                outputTransformation2 = outputTransformation;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                final SearchBarState searchBarState4 = searchBarState2;
                                endRestartGroup.updateScope(new my() { // from class: am0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 InputField$lambda$20;
                                        int intValue = ((Integer) obj2).intValue();
                                        InputField$lambda$20 = SearchBarDefaults.InputField$lambda$20(SearchBarDefaults.this, textFieldState, searchBarState4, kyVar, modifier2, z5, z6, textStyle3, myVar9, myVar10, myVar7, myVar8, myVar11, inputTransformation2, outputTransformation2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, i, i2, i3, (Composer) obj, intValue);
                                        return InputField$lambda$20;
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
                int i322 = i14;
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
            z3 = z;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i & 1572864;
            int i302 = Fields.BlendMode;
            if (i7 == 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 != 0) {
            }
            i9 = i3 & Fields.RotationX;
            int i312 = GroupFlagsKt.HasAuxSlotFlag;
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
            int i3222 = i14;
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
        i5 = i3 & 16;
        int i292 = 8192;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i & 1572864;
        int i3022 = Fields.BlendMode;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 != 0) {
        }
        i9 = i3 & Fields.RotationX;
        int i3122 = GroupFlagsKt.HasAuxSlotFlag;
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
        int i32222 = i14;
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

    /* renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m2306colorsKlgxPg(long j, long j2, TextFieldColors textFieldColors, Composer composer, int i, int i2) {
        int i3;
        TextFieldColors textFieldColors2;
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        if ((i2 & 4) != 0) {
            i3 = i;
            textFieldColors2 = m2314inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, value, value, value, composer, 0, 0, (i & 14) | ((i << 3) & 112) | ((i << 6) & 896) | (i & 7168), 1048575);
        } else {
            i3 = i;
            textFieldColors2 = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(701925149, i3, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:1137)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, textFieldColors2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors;
    }

    @er
    /* renamed from: colors-dgg9oW8, reason: not valid java name */
    public final /* synthetic */ SearchBarColors m2307colorsdgg9oW8(long j, long j2, Composer composer, int i, int i2) {
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(891254734, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:1753)");
        }
        int i3 = i << 3;
        long j3 = value;
        long j4 = value2;
        SearchBarColors searchBarColors = new SearchBarColors(j3, j4, m2314inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, value, value, value, composer, 0, 0, ((i << 6) & 896) | (i & 14) | (i3 & 112) | (i3 & 7168), 1048575), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors;
    }

    public final SearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior(float f, float f2, iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, boolean z, Composer composer, int i, int i2) {
        iy iyVar2;
        float f3 = (i2 & 1) != 0 ? 0.0f : f;
        float f4 = (i2 & 2) != 0 ? -3.4028235E38f : f2;
        if ((i2 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ms(28);
                composer.updateRememberedValue(rememberedValue);
            }
            iyVar2 = (iy) rememberedValue;
        } else {
            iyVar2 = iyVar;
        }
        AnimationSpec<Float> value = (i2 & 8) != 0 ? MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6) : animationSpec;
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 16) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        boolean z2 = (i2 & 32) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1222500790, i, -1, "androidx.compose.material3.SearchBarDefaults.enterAlwaysSearchBarScrollBehavior (SearchBar.kt:1094)");
        }
        Object[] objArr = {value, rememberSplineBasedDecay, iyVar2, Boolean.valueOf(z2)};
        Saver<EnterAlwaysSearchBarScrollBehavior, ?> Saver = EnterAlwaysSearchBarScrollBehavior.Companion.Saver(iyVar2, value, rememberSplineBasedDecay);
        boolean z3 = true;
        boolean z4 = (((6 ^ (i & 14)) > 4 && composer.changed(f3)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f4)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(iyVar2)) || (i & 384) == 256);
        if ((((458752 & i) ^ 196608) <= 131072 || !composer.changed(z2)) && (i & 196608) != 131072) {
            z3 = false;
        }
        boolean changedInstance = z4 | z3 | composer.changedInstance(value) | composer.changedInstance(rememberSplineBasedDecay);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            final float f5 = f3;
            final float f6 = f4;
            final iy iyVar3 = iyVar2;
            final AnimationSpec<Float> animationSpec2 = value;
            final DecayAnimationSpec<Float> decayAnimationSpec2 = rememberSplineBasedDecay;
            final boolean z5 = z2;
            rememberedValue2 = new iy() { // from class: bm0
                @Override // defpackage.iy
                public final Object invoke() {
                    EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior$lambda$3$lambda$2;
                    enterAlwaysSearchBarScrollBehavior$lambda$3$lambda$2 = SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$3$lambda$2(f5, f6, iyVar3, z5, animationSpec2, decayAnimationSpec2);
                    return enterAlwaysSearchBarScrollBehavior$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = (EnterAlwaysSearchBarScrollBehavior) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterAlwaysSearchBarScrollBehavior;
    }

    public final Shape getDockedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1447354121, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:1047)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2308getElevationD9Ej5fM() {
        return Elevation;
    }

    public final Shape getFullScreenShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009956471, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:1043)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WindowInsets getFullScreenWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1745169224, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenWindowInsets> (SearchBar.kt:1059)");
        }
        WindowInsets safeDrawing = WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return safeDrawing;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m2309getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    public final Shape getInputFieldShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1770571533, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:1039)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2310getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2311getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795925906, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:1053)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m845plusgK_yJZ4(companion.m855getHorizontalJoeWqyM(), companion.m859getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m833onlybOOhFvg;
    }

    @er
    /* renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2312inputFieldColorsuKgnY(long j, long j2, long j3, TextSelectionColors textSelectionColors, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i, int i2, int i3) {
        long j12;
        TextSelectionColors textSelectionColors2;
        long j13;
        long j14;
        long j15;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        if ((i3 & 2) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            j12 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j2;
        }
        long value2 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j3;
        TextSelectionColors textSelectionColors3 = (i3 & 8) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value3 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j4;
        long value4 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        if ((i3 & 64) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            textSelectionColors2 = textSelectionColors3;
            j13 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            textSelectionColors2 = textSelectionColors3;
            j13 = j6;
        }
        long value5 = (i3 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j7;
        long value6 = (i3 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        if ((i3 & Fields.RotationY) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            j14 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j9;
        }
        long value7 = (i3 & Fields.RotationZ) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j10;
        if ((i3 & Fields.CameraDistance) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            j15 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842555178, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:1854)");
        }
        int i4 = i << 3;
        int i5 = i2 << 3;
        int i6 = i2 << 6;
        long j16 = value;
        long j17 = value7;
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        TextFieldColors m2314inputFieldColorsJVEmHcM = m2314inputFieldColorsJVEmHcM(j16, value, j12, value2, textSelectionColors4, value3, value4, j13, value5, value6, j14, j17, j17, j15, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), ((i >> 27) & 14) | (i5 & 112) | (i6 & 896) | (i6 & 7168), i5 & 7168, 8372224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2314inputFieldColorsJVEmHcM;
    }

    @er
    /* renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2313inputFieldColorsITpI4ow(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i, int i2, int i3) {
        long j14;
        TextSelectionColors textSelectionColors2;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        if ((i3 & 4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            j14 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j3;
        }
        long value3 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        TextSelectionColors textSelectionColors3 = (i3 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        if ((i3 & 64) != 0) {
            textSelectionColors2 = textSelectionColors3;
            j15 = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            j15 = j6;
        }
        if ((i3 & Fields.SpotShadowColor) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            j16 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j7;
        }
        long value5 = (i3 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long value6 = (i3 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        if ((i3 & Fields.RotationZ) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            j17 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j10;
        }
        long value7 = (i3 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long value8 = (i3 & Fields.TransformOrigin) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        if ((i3 & 8192) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            j18 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            j19 = j18;
            ComposerKt.traceEventStart(-2048506052, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:1794)");
        } else {
            j19 = j18;
        }
        FilledTextFieldTokens filledTextFieldTokens5 = FilledTextFieldTokens.INSTANCE;
        long value9 = ColorSchemeKt.getValue(filledTextFieldTokens5.getInputPrefixColor(), composer, 6);
        long value10 = ColorSchemeKt.getValue(filledTextFieldTokens5.getInputPrefixColor(), composer, 6);
        long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens5.getInputPrefixColor(), composer, 6), filledTextFieldTokens5.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value11 = ColorSchemeKt.getValue(filledTextFieldTokens5.getInputSuffixColor(), composer, 6);
        long value12 = ColorSchemeKt.getValue(filledTextFieldTokens5.getInputSuffixColor(), composer, 6);
        long m4760copywmQWz5c$default2 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens5.getInputSuffixColor(), composer, 6), filledTextFieldTokens5.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        SearchBarTokens searchBarTokens = SearchBarTokens.INSTANCE;
        long j20 = value;
        long j21 = value2;
        long j22 = value3;
        long j23 = value4;
        long j24 = j15;
        long j25 = j16;
        long j26 = value5;
        long j27 = value6;
        long j28 = j17;
        TextFieldColors m2314inputFieldColorsJVEmHcM = m2314inputFieldColorsJVEmHcM(j20, j21, j14, j22, textSelectionColors2, j23, j24, j25, j26, j27, j28, value7, value8, j19, value9, value10, m4760copywmQWz5c$default, value11, value12, m4760copywmQWz5c$default2, ColorSchemeKt.getValue(searchBarTokens.getContainerColor(), composer, 6), ColorSchemeKt.getValue(searchBarTokens.getContainerColor(), composer, 6), ColorSchemeKt.getValue(searchBarTokens.getContainerColor(), composer, 6), composer, i & 2147483646, i2 & 8190, (i2 >> 3) & 7168, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2314inputFieldColorsJVEmHcM;
    }

    /* renamed from: inputFieldColors-JVEmHcM, reason: not valid java name */
    public final TextFieldColors m2314inputFieldColorsJVEmHcM(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long value2 = (i4 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        if ((i4 & 4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            j23 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j3;
        }
        long value3 = (i4 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        TextSelectionColors textSelectionColors2 = (i4 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i4 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long value5 = (i4 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        if ((i4 & Fields.SpotShadowColor) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            j24 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j7;
        }
        long value6 = (i4 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long value7 = (i4 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        if ((i4 & Fields.RotationZ) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            j25 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j25 = j10;
        }
        long value8 = (i4 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long value9 = (i4 & Fields.TransformOrigin) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        if ((i4 & 8192) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            j26 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j13;
        }
        long value10 = (i4 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j14;
        long value11 = (32768 & i4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j15;
        if ((65536 & i4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens5 = FilledTextFieldTokens.INSTANCE;
            j27 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens5.getInputPrefixColor(), composer, 6), filledTextFieldTokens5.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j27 = j16;
        }
        long value12 = (131072 & i4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j17;
        long value13 = (262144 & i4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j18;
        if ((524288 & i4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens6 = FilledTextFieldTokens.INSTANCE;
            j28 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens6.getInputSuffixColor(), composer, 6), filledTextFieldTokens6.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j28 = j19;
        }
        long value14 = (1048576 & i4) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j20;
        long value15 = (2097152 & i4) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j21;
        long value16 = (i4 & 4194304) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2000124979, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:1220)");
        }
        int i5 = i3 << 12;
        int i6 = i2 << 3;
        int i7 = i2 << 18;
        int i8 = i2 >> 24;
        long j29 = value2;
        TextFieldColors m2587colors0hiis_0 = TextFieldDefaults.INSTANCE.m2587colors0hiis_0(value, j29, j23, 0L, value14, value15, value16, 0L, value3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, value4, value5, j24, 0L, value6, value7, j25, 0L, 0L, 0L, 0L, 0L, value8, value9, j26, 0L, 0L, 0L, 0L, 0L, value10, value11, j27, 0L, value12, value13, j28, 0L, composer, (i & 1022) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | ((i << 15) & 234881024), ((i >> 12) & 14) | (i & 458752) | (i & 3670016) | (i & 29360128) | ((i << 3) & 1879048192), ((i >> 27) & 14) | (i6 & 112) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (33488896 & i6) | ((i2 << 6) & 1879048192), (i8 & 14) | 3072 | (i8 & 112), 1204058760, 2191);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2587colors0hiis_0;
    }

    @er
    /* renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2305getElevationD9Ej5fM$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final TextFieldState textFieldState, final ky kyVar, final boolean z, final ky kyVar2, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        TextStyle textStyle2;
        int i7;
        my myVar6;
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
        final Modifier modifier2;
        final my myVar7;
        final my myVar8;
        final OutputTransformation outputTransformation2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z6;
        final boolean z7;
        final TextStyle textStyle3;
        final my myVar9;
        Composer composer2;
        final my myVar10;
        final my myVar11;
        final InputTransformation inputTransformation2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        boolean z8;
        TextStyle textStyle4;
        InputTransformation inputTransformation3;
        ScrollState scrollState3;
        Shape shape3;
        int i22;
        TextFieldColors textFieldColors3;
        int i23;
        MutableInteractionSource mutableInteractionSource3;
        final TextFieldColors textFieldColors4;
        int i24;
        final boolean z9;
        TextStyle textStyle5;
        int i25;
        my myVar12;
        final my myVar13;
        final my myVar14;
        my myVar15;
        my myVar16;
        OutputTransformation outputTransformation3;
        final Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        float f;
        int i26;
        int i27;
        int i28;
        Composer composer3;
        my myVar17;
        ComposableLambda rememberComposableLambda;
        ComposableLambda composableLambda;
        ComposableLambda rememberComposableLambda2;
        int i29;
        Composer startRestartGroup = composer.startRestartGroup(1994562483);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i30 = i3 & 4;
        int i31 = Fields.SpotShadowColor;
        if (i30 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? Fields.RotationX : 128;
        }
        int i32 = i3 & 8;
        int i33 = Fields.RotationZ;
        if (i32 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : 1024;
        }
        int i34 = i3 & 16;
        if (i34 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                }
            }
            int i35 = 4194304;
            if ((i & 12582912) != 0) {
                if ((i3 & Fields.SpotShadowColor) == 0) {
                    textStyle2 = textStyle;
                    if (startRestartGroup.changed(textStyle2)) {
                        i29 = 8388608;
                        i4 |= i29;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i29 = 4194304;
                i4 |= i29;
            } else {
                textStyle2 = textStyle;
            }
            i7 = i3 & Fields.RotationX;
            int i36 = GroupFlagsKt.HasAuxSlotFlag;
            if (i7 == 0) {
                i4 |= 100663296;
                myVar6 = myVar;
            } else {
                myVar6 = myVar;
                if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar6) ? 67108864 : 33554432;
                }
            }
            i8 = i3 & Fields.RotationY;
            int i37 = GroupFlagsKt.IsMovableContentFlag;
            if (i8 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i9 = i8;
                i4 |= startRestartGroup.changedInstance(myVar2) ? 536870912 : 268435456;
                i10 = i3 & Fields.RotationZ;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (startRestartGroup.changedInstance(myVar3) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                i13 = i3 & Fields.CameraDistance;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else if ((i2 & 48) == 0) {
                    i14 = i13;
                    i12 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
                } else {
                    i14 = i13;
                }
                int i38 = i12;
                i15 = i3 & Fields.TransformOrigin;
                if (i15 != 0) {
                    i16 = i38 | 384;
                } else if ((i2 & 384) == 0) {
                    if (startRestartGroup.changedInstance(myVar5)) {
                        i31 = Fields.RotationX;
                    }
                    i16 = i38 | i31;
                } else {
                    i16 = i38;
                }
                i17 = i3 & 8192;
                if (i17 != 0) {
                    i18 = i16 | 3072;
                } else {
                    int i39 = i16;
                    if ((i2 & 3072) == 0) {
                        if (startRestartGroup.changed(inputTransformation)) {
                            i33 = Fields.CameraDistance;
                        }
                        i18 = i39 | i33;
                    } else {
                        i18 = i39;
                    }
                }
                i19 = i3 & Fields.Clip;
                if (i19 != 0) {
                    i20 = i18 | 24576;
                } else {
                    i20 = i18;
                    if ((i2 & 24576) == 0) {
                        i20 |= startRestartGroup.changed(outputTransformation) ? 16384 : 8192;
                        if ((i2 & 196608) == 0) {
                            i20 |= ((i3 & Fields.CompositingStrategy) == 0 && startRestartGroup.changed(scrollState)) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i20 |= ((i3 & 65536) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & Fields.RenderEffect) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i35 = 8388608;
                            }
                            i20 |= i35;
                        }
                        i21 = i3 & Fields.ColorFilter;
                        if (i21 == 0) {
                            i20 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (startRestartGroup.changed(mutableInteractionSource)) {
                                i36 = 67108864;
                            }
                            i20 |= i36;
                        }
                        if ((i3 & Fields.BlendMode) == 0) {
                            i20 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            if (startRestartGroup.changed(this)) {
                                i37 = 536870912;
                            }
                            i20 |= i37;
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.CompositingStrategy) != 0) {
                                    i20 &= -458753;
                                }
                                if ((i3 & 65536) != 0) {
                                    i20 &= -3670017;
                                }
                                if ((i3 & Fields.RenderEffect) != 0) {
                                    i20 &= -29360129;
                                }
                                modifier3 = modifier;
                                myVar13 = myVar2;
                                myVar14 = myVar3;
                                myVar15 = myVar4;
                                myVar16 = myVar5;
                                inputTransformation3 = inputTransformation;
                                outputTransformation3 = outputTransformation;
                                scrollState3 = scrollState;
                                shape4 = shape;
                                textFieldColors4 = textFieldColors;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z9 = z4;
                                i25 = i4;
                                z8 = z5;
                                textStyle5 = textStyle2;
                                myVar12 = myVar6;
                                i24 = i20;
                                i22 = 1994562483;
                            } else {
                                modifier3 = i34 != 0 ? Modifier.Companion : modifier;
                                boolean z10 = i5 != 0 ? true : z4;
                                z8 = i6 != 0 ? false : z5;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                    textStyle4 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                                } else {
                                    textStyle4 = textStyle2;
                                }
                                int i40 = i4;
                                my myVar18 = i7 != 0 ? null : myVar6;
                                my myVar19 = i9 != 0 ? null : myVar2;
                                my myVar20 = i11 != 0 ? null : myVar3;
                                my myVar21 = i14 != 0 ? null : myVar4;
                                my myVar22 = i15 != 0 ? null : myVar5;
                                inputTransformation3 = i17 != 0 ? null : inputTransformation;
                                OutputTransformation outputTransformation4 = i19 != 0 ? null : outputTransformation;
                                if ((i3 & Fields.CompositingStrategy) != 0) {
                                    i20 &= -458753;
                                    scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                } else {
                                    scrollState3 = scrollState;
                                }
                                if ((i3 & 65536) != 0) {
                                    Shape inputFieldShape = getInputFieldShape(startRestartGroup, (i20 >> 27) & 14);
                                    i20 &= -3670017;
                                    shape3 = inputFieldShape;
                                } else {
                                    shape3 = shape;
                                }
                                int i41 = i20;
                                if ((i3 & Fields.RenderEffect) != 0) {
                                    i22 = 1994562483;
                                    textFieldColors3 = m2314inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i41 >> 18) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                                    startRestartGroup = startRestartGroup;
                                    i23 = i41 & (-29360129);
                                } else {
                                    i22 = 1994562483;
                                    textFieldColors3 = textFieldColors;
                                    i23 = i41;
                                }
                                if (i21 != 0) {
                                    textFieldColors4 = textFieldColors3;
                                    i24 = i23;
                                    z9 = z10;
                                    textStyle5 = textStyle4;
                                    i25 = i40;
                                    myVar12 = myVar18;
                                    myVar13 = myVar19;
                                    myVar14 = myVar20;
                                    myVar15 = myVar21;
                                    myVar16 = myVar22;
                                    outputTransformation3 = outputTransformation4;
                                    shape4 = shape3;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    textFieldColors4 = textFieldColors3;
                                    i24 = i23;
                                    z9 = z10;
                                    textStyle5 = textStyle4;
                                    i25 = i40;
                                    myVar12 = myVar18;
                                    myVar13 = myVar19;
                                    myVar14 = myVar20;
                                    myVar15 = myVar21;
                                    myVar16 = myVar22;
                                    outputTransformation3 = outputTransformation4;
                                    shape4 = shape3;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i22, i25, i24, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:1520)");
                            }
                            if (mutableInteractionSource3 == null) {
                                startRestartGroup.startReplaceGroup(-860559352);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1219165359);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = new FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            Strings.Companion companion2 = Strings.Companion;
                            OutputTransformation outputTransformation5 = outputTransformation3;
                            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_search_bar_search), startRestartGroup, 0);
                            my myVar23 = myVar12;
                            String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_suggestions_available), startRestartGroup, 0);
                            long m7090getColor0d7_KjU = textStyle5.m7090getColor0d7_KjU();
                            if (m7090getColor0d7_KjU == 16) {
                                m7090getColor0d7_KjU = textFieldColors4.m2574textColorXeAY9LY$material3(z9, false, booleanValue);
                            }
                            TextStyle merge = textStyle5.merge(new TextStyle(m7090getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null));
                            float searchBarMinWidth = SearchBarKt.getSearchBarMinWidth();
                            f = SearchBarKt.SearchBarMaxWidth;
                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m811sizeInqDBjuR0$default(modifier3, searchBarMinWidth, InputFieldHeight, f, 0.0f, 8, null), focusRequester);
                            TextStyle textStyle6 = textStyle5;
                            boolean z11 = (i25 & 7168) == 2048;
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z11 || rememberedValue3 == companion.getEmpty()) {
                                i26 = i24;
                                rememberedValue3 = new z4(kyVar2, 6);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                i26 = i24;
                            }
                            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (ky) rememberedValue3);
                            boolean changed = ((i25 & 896) == 256) | startRestartGroup.changed(m2983getString2EP1pXo) | startRestartGroup.changed(m2983getString2EP1pXo2);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue4 == companion.getEmpty()) {
                                i27 = 1;
                                rememberedValue4 = new cm0(m2983getString2EP1pXo, z, m2983getString2EP1pXo2, i27);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else {
                                i27 = 1;
                            }
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (ky) rememberedValue4, i27, null);
                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                            Composer composer4 = startRestartGroup;
                            SolidColor solidColor = new SolidColor(textFieldColors4.m2524cursorColorvNxB06k$material3(false), null);
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m7247getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (dq) null);
                            int i42 = i25 & 14;
                            boolean z12 = (i42 == 4) | ((i25 & 112) == 32);
                            Object rememberedValue5 = composer4.rememberedValue();
                            if (z12 || rememberedValue5 == companion.getEmpty()) {
                                i28 = i25;
                                rememberedValue5 = new yl0(kyVar, textFieldState, 1);
                                composer3 = composer4;
                                composer3.updateRememberedValue(rememberedValue5);
                            } else {
                                i28 = i25;
                                composer3 = composer4;
                            }
                            KeyboardActionHandler keyboardActionHandler = (KeyboardActionHandler) rememberedValue5;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            if (myVar13 == null) {
                                composer3.startReplaceGroup(-858226169);
                                composer3.endReplaceGroup();
                                myVar17 = myVar13;
                                rememberComposableLambda = null;
                            } else {
                                composer3.startReplaceGroup(-858226168);
                                myVar17 = myVar13;
                                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(314348414, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$15$1
                                    public final void invoke(Composer composer5, int i43) {
                                        float f2;
                                        if (!composer5.shouldExecute((i43 & 3) != 2, i43 & 1)) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(314348414, i43, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:1575)");
                                        }
                                        Modifier.Companion companion3 = Modifier.Companion;
                                        f2 = SearchBarKt.SearchBarIconOffsetX;
                                        Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion3, f2, 0.0f, 2, null);
                                        my myVar24 = my.this;
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, m722offsetVpY3zN4$default);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                        iy constructor = companion4.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer5);
                                        my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        if (fc.l(myVar24, composer5, 0)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer3, 54);
                                composer3.endReplaceGroup();
                            }
                            if (myVar14 == null) {
                                composer3.startReplaceGroup(-858017756);
                                composer3.endReplaceGroup();
                                composableLambda = rememberComposableLambda;
                                rememberComposableLambda2 = null;
                            } else {
                                composer3.startReplaceGroup(-858017755);
                                composableLambda = rememberComposableLambda;
                                rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(581893311, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$16$1
                                    public final void invoke(Composer composer5, int i43) {
                                        float f2;
                                        if (!composer5.shouldExecute((i43 & 3) != 2, i43 & 1)) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(581893311, i43, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:1579)");
                                        }
                                        Modifier.Companion companion3 = Modifier.Companion;
                                        f2 = SearchBarKt.SearchBarIconOffsetX;
                                        Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion3, Dp.m7611constructorimpl(-f2), 0.0f, 2, null);
                                        my myVar24 = my.this;
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, m722offsetVpY3zN4$default);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                        iy constructor = companion4.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer5);
                                        my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        if (fc.l(myVar24, composer5, 0)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer3, 54);
                                composer3.endReplaceGroup();
                            }
                            int i43 = i26 >> 3;
                            int i44 = i42 | 384 | ((i28 >> 12) & 112) | (i43 & 7168) | ((i28 >> 3) & 29360128);
                            int i45 = (i43 & 14) | 14155776 | (i43 & 112) | ((i26 >> 9) & 57344);
                            Shape shape5 = shape4;
                            TextFieldColors textFieldColors5 = textFieldColors4;
                            my myVar24 = myVar17;
                            my myVar25 = myVar14;
                            int i46 = i26;
                            int i47 = i28;
                            boolean z13 = z9;
                            Composer composer5 = composer3;
                            TextFieldDecorator decorator = textFieldDefaults.decorator(textFieldState, z13, singleLine, outputTransformation5, mutableInteractionSource5, null, null, myVar23, composableLambda, rememberComposableLambda2, myVar15, myVar16, null, false, textFieldColors5, TextFieldDefaults.m2577contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(-1551441816, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$17
                                public final void invoke(Composer composer6, int i48) {
                                    if (!composer6.shouldExecute((i48 & 3) != 2, i48 & 1)) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1551441816, i48, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:1586)");
                                    }
                                    BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.Companion, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(SingleValueAnimationKt.m100animateColorAsStateeuL9pac(TextFieldColors.this.m2522containerColorXeAY9LY$material3(z9, false, booleanValue), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer6, 6), null, null, composer6, 0, 12)) { // from class: androidx.compose.material3.SearchBarDefaults$InputField$17.1
                                        @Override // defpackage.w20
                                        public Object get() {
                                            return ((State) this.receiver).getValue();
                                        }
                                    }), shape4), composer6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, composer3, 54), composer5, i44, i45, 12384);
                            my myVar26 = myVar15;
                            my myVar27 = myVar16;
                            textFieldColors2 = textFieldColors5;
                            int i48 = i47 >> 9;
                            int i49 = i42 | 102236160 | (i48 & 896) | (i48 & 7168) | ((i46 << 3) & 57344);
                            int i50 = ((i46 >> 6) & 896) | (i43 & 57344);
                            boolean z14 = z8;
                            InputTransformation inputTransformation4 = inputTransformation3;
                            ScrollState scrollState4 = scrollState3;
                            BasicTextFieldKt.BasicTextField(textFieldState, semantics$default, z13, z14, inputTransformation4, merge, keyboardOptions, keyboardActionHandler, singleLine, (my) null, mutableInteractionSource5, solidColor, outputTransformation5, decorator, scrollState4, composer5, i49, i50, Fields.RotationY);
                            boolean z15 = !z && booleanValue;
                            Boolean valueOf = Boolean.valueOf(z);
                            boolean changed2 = composer5.changed(z15) | composer5.changedInstance(focusManager);
                            Object rememberedValue6 = composer5.rememberedValue();
                            if (changed2 || rememberedValue6 == companion.getEmpty()) {
                                rememberedValue6 = new SearchBarDefaults$InputField$18$1(z15, focusManager, null);
                                composer5.updateRememberedValue(rememberedValue6);
                            }
                            EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue6, composer5, (i47 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z13;
                            z7 = z14;
                            outputTransformation2 = outputTransformation5;
                            scrollState2 = scrollState4;
                            composer2 = composer5;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            modifier2 = modifier3;
                            textStyle3 = textStyle6;
                            myVar9 = myVar23;
                            myVar10 = myVar24;
                            myVar7 = myVar25;
                            myVar8 = myVar26;
                            myVar11 = myVar27;
                            shape2 = shape5;
                            inputTransformation2 = inputTransformation4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            myVar7 = myVar3;
                            myVar8 = myVar4;
                            outputTransformation2 = outputTransformation;
                            scrollState2 = scrollState;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z6 = z4;
                            z7 = z5;
                            textStyle3 = textStyle2;
                            myVar9 = myVar6;
                            composer2 = startRestartGroup;
                            myVar10 = myVar2;
                            myVar11 = myVar5;
                            inputTransformation2 = inputTransformation;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new my() { // from class: dm0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 InputField$lambda$33;
                                    int intValue = ((Integer) obj2).intValue();
                                    InputField$lambda$33 = SearchBarDefaults.InputField$lambda$33(SearchBarDefaults.this, textFieldState, kyVar, z, kyVar2, modifier2, z6, z7, textStyle3, myVar9, myVar10, myVar7, myVar8, myVar11, inputTransformation2, outputTransformation2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, i, i2, i3, (Composer) obj, intValue);
                                    return InputField$lambda$33;
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                if ((i2 & 196608) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i21 = i3 & Fields.ColorFilter;
                if (i21 == 0) {
                }
                if ((i3 & Fields.BlendMode) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i8;
            i10 = i3 & Fields.RotationZ;
            if (i10 != 0) {
            }
            i13 = i3 & Fields.CameraDistance;
            if (i13 != 0) {
            }
            int i382 = i12;
            i15 = i3 & Fields.TransformOrigin;
            if (i15 != 0) {
            }
            i17 = i3 & 8192;
            if (i17 != 0) {
            }
            i19 = i3 & Fields.Clip;
            if (i19 != 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i21 = i3 & Fields.ColorFilter;
            if (i21 == 0) {
            }
            if ((i3 & Fields.BlendMode) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        int i352 = 4194304;
        if ((i & 12582912) != 0) {
        }
        i7 = i3 & Fields.RotationX;
        int i362 = GroupFlagsKt.HasAuxSlotFlag;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.RotationY;
        int i372 = GroupFlagsKt.IsMovableContentFlag;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationZ;
        if (i10 != 0) {
        }
        i13 = i3 & Fields.CameraDistance;
        if (i13 != 0) {
        }
        int i3822 = i12;
        i15 = i3 & Fields.TransformOrigin;
        if (i15 != 0) {
        }
        i17 = i3 & 8192;
        if (i17 != 0) {
        }
        i19 = i3 & Fields.Clip;
        if (i19 != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i21 = i3 & Fields.ColorFilter;
        if (i21 == 0) {
        }
        if ((i3 & Fields.BlendMode) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final String str, ky kyVar, ky kyVar2, boolean z, ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        my myVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composer2;
        Modifier modifier2;
        my myVar5;
        my myVar6;
        TextFieldColors textFieldColors2;
        MutableInteractionSource mutableInteractionSource2;
        my myVar7;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        my myVar8;
        Composer composer3;
        TextFieldColors textFieldColors3;
        MutableInteractionSource mutableInteractionSource3;
        int i17;
        TextFieldColors textFieldColors4;
        boolean z4;
        my myVar9;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        float f;
        boolean z5;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(748018311);
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
            i4 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
            i5 = i3 & 4;
            int i19 = Fields.SpotShadowColor;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(kyVar3) ? Fields.Clip : 8192;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= startRestartGroup.changed(modifier) ? Fields.RenderEffect : 65536;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : Fields.BlendMode;
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 == 0) {
                i4 |= 12582912;
                myVar4 = myVar;
            } else {
                myVar4 = myVar;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
            }
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i10 = i9;
                i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                i11 = i3 & Fields.RotationY;
                if (i11 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i12 = i11;
                    i4 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(textFieldColors)) {
                            i18 = 4;
                            i13 = i2 | i18;
                        }
                        i18 = 2;
                        i13 = i2 | i18;
                    } else {
                        i13 = i2;
                    }
                    i14 = i3 & Fields.CameraDistance;
                    if (i14 == 0) {
                        i13 |= 48;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if ((i2 & 48) == 0) {
                            i13 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                        }
                    }
                    i16 = i13;
                    if ((i3 & Fields.TransformOrigin) == 0) {
                        i16 |= 384;
                    } else if ((i2 & 384) == 0) {
                        if (startRestartGroup.changed(this)) {
                            i19 = Fields.RotationX;
                        }
                        i16 |= i19;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.RotationZ) != 0) {
                                    i16 &= -15;
                                }
                                modifier3 = modifier;
                                myVar8 = myVar2;
                                myVar9 = myVar3;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i17 = i16;
                                composer3 = startRestartGroup;
                                z4 = z2;
                                textFieldColors4 = textFieldColors;
                            } else {
                                modifier3 = i6 != 0 ? Modifier.Companion : modifier;
                                boolean z6 = i7 != 0 ? true : z2;
                                if (i8 != 0) {
                                    myVar4 = null;
                                }
                                myVar8 = i10 != 0 ? null : myVar2;
                                my myVar10 = i12 != 0 ? null : myVar3;
                                if ((i3 & Fields.RotationZ) != 0) {
                                    textFieldColors3 = m2314inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i16 << 3) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                                    composer3 = startRestartGroup;
                                    i16 &= -15;
                                } else {
                                    composer3 = startRestartGroup;
                                    textFieldColors3 = textFieldColors;
                                }
                                if (i15 != 0) {
                                    i17 = i16;
                                    textFieldColors4 = textFieldColors3;
                                    z4 = z6;
                                    myVar9 = myVar10;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    i17 = i16;
                                    textFieldColors4 = textFieldColors3;
                                    z4 = z6;
                                    myVar9 = myVar10;
                                }
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier4 = modifier3;
                                ComposerKt.traceEventStart(748018311, i4, i17, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:1655)");
                            } else {
                                modifier4 = modifier3;
                            }
                            if (mutableInteractionSource3 == null) {
                                composer3.startReplaceGroup(1923851092);
                                Object rememberedValue = composer3.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1586079715);
                                composer3.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer3, 0).getValue().booleanValue();
                            Object rememberedValue2 = composer3.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = new FocusRequester();
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            FocusManager focusManager = (FocusManager) composer3.consume(CompositionLocalsKt.getLocalFocusManager());
                            Strings.Companion companion2 = Strings.Companion;
                            final my myVar11 = myVar9;
                            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_search_bar_search), composer3, 0);
                            final my myVar12 = myVar8;
                            String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_suggestions_available), composer3, 0);
                            long m7090getColor0d7_KjU = ((TextStyle) composer3.consume(TextKt.getLocalTextStyle())).m7090getColor0d7_KjU();
                            if (m7090getColor0d7_KjU == 16) {
                                m7090getColor0d7_KjU = textFieldColors4.m2574textColorXeAY9LY$material3(z4, false, booleanValue);
                            }
                            long j = m7090getColor0d7_KjU;
                            float searchBarMinWidth = SearchBarKt.getSearchBarMinWidth();
                            f = SearchBarKt.SearchBarMaxWidth;
                            Modifier m811sizeInqDBjuR0$default = SizeKt.m811sizeInqDBjuR0$default(modifier4, searchBarMinWidth, InputFieldHeight, f, 0.0f, 8, null);
                            Modifier modifier5 = modifier4;
                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(m811sizeInqDBjuR0$default, focusRequester);
                            final boolean z7 = z4;
                            boolean z8 = (57344 & i4) == 16384;
                            Object rememberedValue3 = composer3.rememberedValue();
                            if (z8 || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new z4(kyVar3, 5);
                                composer3.updateRememberedValue(rememberedValue3);
                            }
                            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (ky) rememberedValue3);
                            boolean changed = ((i4 & 7168) == 2048) | composer3.changed(m2983getString2EP1pXo) | composer3.changed(m2983getString2EP1pXo2);
                            Object rememberedValue4 = composer3.rememberedValue();
                            if (changed || rememberedValue4 == companion.getEmpty()) {
                                z5 = false;
                                rememberedValue4 = new cm0(m2983getString2EP1pXo, z, m2983getString2EP1pXo2, 0 == true ? 1 : 0);
                                composer3.updateRememberedValue(rememberedValue4);
                            } else {
                                z5 = false;
                            }
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, z5, (ky) rememberedValue4, 1, null);
                            TextStyle merge = ((TextStyle) composer3.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (dq) null));
                            SolidColor solidColor = new SolidColor(textFieldColors4.m2524cursorColorvNxB06k$material3(false), null);
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m7247getSearcheUduSuo(), (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), 119, (dq) (0 == true ? 1 : 0));
                            int i20 = i4 & 14;
                            boolean z9 = ((i4 & 896) == 256) | (i20 == 4);
                            Object rememberedValue5 = composer3.rememberedValue();
                            if (z9 || rememberedValue5 == companion.getEmpty()) {
                                rememberedValue5 = new te0(4, kyVar2, str);
                                composer3.updateRememberedValue(rememberedValue5);
                            }
                            KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (ky) rememberedValue5, null, 47, null);
                            int i21 = i4;
                            final TextFieldColors textFieldColors5 = textFieldColors4;
                            final my myVar13 = myVar4;
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-813926844, true, new ny() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$23
                                public final void invoke(my myVar14, Composer composer4, int i22) {
                                    int i23;
                                    ComposableLambda composableLambda;
                                    if ((i22 & 6) == 0) {
                                        i23 = i22 | (composer4.changedInstance(myVar14) ? 4 : 2);
                                    } else {
                                        i23 = i22;
                                    }
                                    if (!composer4.shouldExecute((i23 & 19) != 18, i23 & 1)) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-813926844, i23, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:1698)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    String str2 = str;
                                    int i24 = i23;
                                    boolean z10 = z7;
                                    VisualTransformation none = VisualTransformation.Companion.getNone();
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                    my myVar15 = myVar13;
                                    final my myVar16 = myVar12;
                                    ComposableLambda composableLambda2 = null;
                                    if (myVar16 == null) {
                                        composer4.startReplaceGroup(1691265870);
                                        composer4.endReplaceGroup();
                                        composableLambda = null;
                                    } else {
                                        composer4.startReplaceGroup(1691265871);
                                        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1718822048, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$23$1$1
                                            public final void invoke(Composer composer5, int i25) {
                                                float f2;
                                                if (!composer5.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1718822048, i25, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:1708)");
                                                }
                                                Modifier.Companion companion3 = Modifier.Companion;
                                                f2 = SearchBarKt.SearchBarIconOffsetX;
                                                Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion3, f2, 0.0f, 2, null);
                                                my myVar17 = my.this;
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, m722offsetVpY3zN4$default);
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                iy constructor = companion4.getConstructor();
                                                if (composer5.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer5);
                                                my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                if (fc.l(myVar17, composer5, 0)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, composer4, 54);
                                        composer4.endReplaceGroup();
                                        composableLambda = rememberComposableLambda2;
                                    }
                                    final my myVar17 = myVar11;
                                    if (myVar17 == null) {
                                        composer4.startReplaceGroup(1691490155);
                                    } else {
                                        composer4.startReplaceGroup(1691490156);
                                        composableLambda2 = ComposableLambdaKt.rememberComposableLambda(-305306680, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$23$2$1
                                            public final void invoke(Composer composer5, int i25) {
                                                float f2;
                                                if (!composer5.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-305306680, i25, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:1712)");
                                                }
                                                Modifier.Companion companion3 = Modifier.Companion;
                                                f2 = SearchBarKt.SearchBarIconOffsetX;
                                                Modifier m722offsetVpY3zN4$default = OffsetKt.m722offsetVpY3zN4$default(companion3, Dp.m7611constructorimpl(-f2), 0.0f, 2, null);
                                                my myVar18 = my.this;
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, m722offsetVpY3zN4$default);
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                                iy constructor = companion4.getConstructor();
                                                if (composer5.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer5);
                                                my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                if (fc.l(myVar18, composer5, 0)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, composer4, 54);
                                    }
                                    composer4.endReplaceGroup();
                                    ComposableLambda composableLambda3 = composableLambda2;
                                    Shape inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composer4, 6);
                                    TextFieldColors textFieldColors6 = textFieldColors5;
                                    PaddingValues m2577contentPaddingWithoutLabela9UjIt4$default = TextFieldDefaults.m2577contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    final TextFieldColors textFieldColors7 = textFieldColors5;
                                    final boolean z11 = z7;
                                    final boolean z12 = booleanValue;
                                    textFieldDefaults.DecorationBox(str2, myVar14, z10, true, none, mutableInteractionSource6, false, null, myVar15, composableLambda, composableLambda3, null, null, null, inputFieldShape, textFieldColors6, m2577contentPaddingWithoutLabela9UjIt4$default, ComposableLambdaKt.rememberComposableLambda(-1197464330, true, new my() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$23.3
                                        public final void invoke(Composer composer5, int i25) {
                                            if (!composer5.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1197464330, i25, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:1718)");
                                            }
                                            BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.Companion, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new eh0(SingleValueAnimationKt.m100animateColorAsStateeuL9pac(TextFieldColors.this.m2522containerColorXeAY9LY$material3(z11, false, z12), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer5, 6), null, null, composer5, 0, 12)) { // from class: androidx.compose.material3.SearchBarDefaults.InputField.23.3.1
                                                @Override // defpackage.w20
                                                public Object get() {
                                                    return ((State) this.receiver).getValue();
                                                }
                                            }), SearchBarDefaults.INSTANCE.getInputFieldShape(composer5, 6)), composer5, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, composer4, 54), composer4, ((i24 << 3) & 112) | 27648, 113246208, 14528);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((my) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, composer3, 54);
                            int i22 = i20 | 102236160 | (i21 & 112);
                            int i23 = i21 >> 9;
                            Composer composer4 = composer3;
                            BasicTextFieldKt.BasicTextField(str, kyVar, semantics$default, z7, false, merge, keyboardOptions, keyboardActions, true, 0, 0, (VisualTransformation) null, (ky) null, mutableInteractionSource5, (Brush) solidColor, (ny) rememberComposableLambda, composer4, i22 | (i23 & 7168), 196608, 7696);
                            composer2 = composer4;
                            boolean z10 = !z && booleanValue;
                            Boolean valueOf = Boolean.valueOf(z);
                            boolean changed2 = composer2.changed(z10) | composer2.changedInstance(focusManager);
                            Object rememberedValue6 = composer2.rememberedValue();
                            if (changed2 || rememberedValue6 == companion.getEmpty()) {
                                rememberedValue6 = new SearchBarDefaults$InputField$24$1(z10, focusManager, null);
                                composer2.updateRememberedValue(rememberedValue6);
                            }
                            EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue6, composer2, i23 & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z7;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            modifier2 = modifier5;
                            textFieldColors2 = textFieldColors5;
                            myVar7 = myVar13;
                            myVar5 = myVar12;
                            myVar6 = myVar11;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            myVar5 = myVar2;
                            myVar6 = myVar3;
                            textFieldColors2 = textFieldColors;
                            mutableInteractionSource2 = mutableInteractionSource;
                            myVar7 = myVar4;
                            z3 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new hi(this, str, kyVar, kyVar2, z, kyVar3, modifier2, z3, myVar7, myVar5, myVar6, textFieldColors2, mutableInteractionSource2, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i11;
                if ((i2 & 6) != 0) {
                }
                i14 = i3 & Fields.CameraDistance;
                if (i14 == 0) {
                }
                i16 = i13;
                if ((i3 & Fields.TransformOrigin) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i10 = i9;
            i11 = i3 & Fields.RotationY;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 6) != 0) {
            }
            i14 = i3 & Fields.CameraDistance;
            if (i14 == 0) {
            }
            i16 = i13;
            if ((i3 & Fields.TransformOrigin) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        int i192 = Fields.SpotShadowColor;
        if (i5 == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & Fields.RotationY;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 6) != 0) {
        }
        i14 = i3 & Fields.CameraDistance;
        if (i14 == 0) {
        }
        i16 = i13;
        if ((i3 & Fields.TransformOrigin) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
