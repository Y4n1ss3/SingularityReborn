package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import defpackage.an;
import defpackage.er;
import defpackage.nc;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding;

    static {
        float f;
        f = ExposedDropdownMenuKt.ExposedDropdownMenuItemHorizontalPadding;
        ItemContentPadding = PaddingKt.m756PaddingValuesYgX7TsA(f, Dp.m7611constructorimpl(0.0f));
    }

    private ExposedDropdownMenuDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrailingIcon$lambda$0(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        exposedDropdownMenuDefaults.TrailingIcon(z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TrailingIcon$lambda$1(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z, int i, Composer composer, int i2) {
        exposedDropdownMenuDefaults.TrailingIcon(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public final void TrailingIcon(boolean z, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-1732824199);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1732824199, i3, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:511)");
            }
            IconKt.m2055Iconww6aTOc(Icons.Filled.INSTANCE.getArrowDropDown$material3(), (String) null, RotateKt.rotate(modifier3, z ? 180.0f : 0.0f), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new nc(this, z, modifier2, i, i2, 1));
        }
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    /* renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1964outlinedTextFieldColorsFD9MK7s(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        long j39;
        TextSelectionColors textSelectionColors2;
        int i7;
        long j40;
        long j41;
        int i8;
        long j42;
        long j43;
        long j44;
        int i9;
        long j45;
        long j46;
        int i10;
        long j47;
        long j48;
        int i11;
        long j49;
        long j50;
        int i12;
        long j51;
        long j52;
        int i13;
        long j53;
        long j54;
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j;
        long value2 = (i5 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j2;
        if ((i5 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            j39 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j39 = j3;
        }
        long value3 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j4;
        long m4796getTransparent0d7_KjU = (i5 & 16) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j5;
        long m4796getTransparent0d7_KjU2 = (i5 & 32) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j6;
        long m4796getTransparent0d7_KjU3 = (i5 & 64) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j7;
        long m4796getTransparent0d7_KjU4 = (i5 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j8;
        long value4 = (i5 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j9;
        long value5 = (i5 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j10;
        TextSelectionColors textSelectionColors3 = (i5 & Fields.RotationZ) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        if ((i5 & Fields.CameraDistance) != 0) {
            textSelectionColors2 = textSelectionColors3;
            i7 = 6;
            j40 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            i7 = 6;
            j40 = j11;
        }
        long value6 = (i5 & Fields.TransformOrigin) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, i7) : j12;
        if ((i5 & 8192) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            j41 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, i7), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j41 = j13;
        }
        long j55 = j41;
        if ((i5 & Fields.Clip) != 0) {
            i8 = 6;
            j42 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        } else {
            i8 = 6;
            j42 = j14;
        }
        long value7 = (32768 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i8) : j15;
        long value8 = (65536 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i8) : j16;
        if ((131072 & i5) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            j43 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i8), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j43 = j17;
        }
        if ((i5 & Fields.ColorFilter) != 0) {
            j44 = j43;
            i9 = 6;
            j45 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j44 = j43;
            i9 = 6;
            j45 = j18;
        }
        long value9 = (i5 & Fields.BlendMode) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i9) : j19;
        long value10 = (i5 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i9) : j20;
        if ((i5 & 2097152) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            j46 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i9), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j46 = j21;
        }
        if ((i5 & 4194304) != 0) {
            i10 = 6;
            j47 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            i10 = 6;
            j47 = j22;
        }
        long value11 = (i5 & GroupFlagsKt.IsNodeFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i10) : j23;
        long value12 = (i5 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i10) : j24;
        if ((i5 & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            j48 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, i10), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j48 = j25;
        }
        if ((i5 & GroupFlagsKt.IsRecompositionRequiredFlag) != 0) {
            i11 = 6;
            j49 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        } else {
            i11 = 6;
            j49 = j26;
        }
        long value13 = (i5 & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11) : j27;
        long value14 = (i5 & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11) : j28;
        if ((i5 & GroupFlagsKt.HasMovableContentFlag) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            j50 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i11), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j50 = j29;
        }
        if ((i5 & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
            i12 = 6;
            j51 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i12 = 6;
            j51 = j30;
        }
        long value15 = (i6 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j31;
        long value16 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j32;
        if ((i6 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            j52 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i12), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j52 = j33;
        }
        if ((i6 & 8) != 0) {
            i13 = 6;
            j53 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i13 = 6;
            j53 = j34;
        }
        long value17 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13) : j35;
        long value18 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13) : j36;
        if ((i6 & 64) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            j54 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, i13), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j54 = j37;
        }
        long value19 = (i6 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-325161132, i, i2, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:797)");
        }
        int i14 = i4 << 12;
        int i15 = i4 >> 18;
        int i16 = (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896);
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        TextFieldColors m2243colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2243colors0hiis_0(value, value2, j39, value3, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU2, m4796getTransparent0d7_KjU3, m4796getTransparent0d7_KjU4, value4, value5, textSelectionColors4, j40, value6, j55, j42, value7, value8, j44, j45, value9, value10, j46, j47, value11, value12, j48, j49, value13, value14, j50, j51, 0L, 0L, 0L, 0L, value15, value16, j52, j53, value17, value18, j54, value19, composer, i & 2147483646, i2 & 2147483646, i3 & 2147483646, (i4 & 14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), i16, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2243colors0hiis_0;
    }

    @er
    /* renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1965outlinedTextFieldColorsStqZLY(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i, int i2, int i3, int i4) {
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j;
        if ((i4 & 2) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            j24 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j2;
        }
        long m4796getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j3;
        long value2 = (i4 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j4;
        long value3 = (i4 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i4 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i4 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j6;
        long value5 = (i4 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j7;
        if ((i4 & Fields.RotationX) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            j25 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j25 = j8;
        }
        long value6 = (i4 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j9;
        long value7 = (i4 & Fields.RotationZ) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j10;
        long value8 = (i4 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j11;
        if ((i4 & Fields.TransformOrigin) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            j26 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j12;
        }
        long value9 = (i4 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j13;
        long value10 = (i4 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j14;
        long value11 = (32768 & i4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j15;
        if ((65536 & i4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            j27 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j27 = j16;
        }
        long value12 = (131072 & i4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j17;
        long value13 = (262144 & i4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j18;
        long value14 = (524288 & i4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j19;
        if ((1048576 & i4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            j28 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j28 = j20;
        }
        long value15 = (2097152 & i4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j21;
        long value16 = (4194304 & i4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j22;
        if ((i4 & GroupFlagsKt.IsNodeFlag) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            j29 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j29 = j23;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83147315, i, i2, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:1228)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
        long value17 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value18 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long m4760copywmQWz5c$default2 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        int i5 = i << 3;
        int i6 = (i & 14) | (i5 & 112) | (i5 & 896);
        int i7 = i << 9;
        int i8 = i6 | (i7 & 7168) | ((i << 6) & 57344) | (i7 & 458752) | ((i << 12) & 3670016);
        int i9 = i << 15;
        int i10 = i8 | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i2 << 15;
        int i12 = i3 << 15;
        int i13 = i3 << 18;
        int i14 = ((i2 >> 15) & 65534) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = ((i3 >> 6) & 14) | (i12 & 1879048192);
        long j30 = value;
        TextFieldColors m1964outlinedTextFieldColorsFD9MK7s = m1964outlinedTextFieldColorsFD9MK7s(j30, value, j24, j30, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU, value2, value3, textSelectionColors2, value4, value5, j25, value6, value7, value8, j26, value9, value10, value11, j27, value12, value13, value14, j28, value15, value16, value16, j29, value16, value17, value18, m4760copywmQWz5c$default, value19, value20, value21, m4760copywmQWz5c$default2, value22, composer, i10, ((i >> 15) & 65534) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i14, i15, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1964outlinedTextFieldColorsFD9MK7s;
    }

    @er
    /* renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1966outlinedTextFieldColorstN0laI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j;
        long value2 = (i5 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j2;
        if ((i5 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            j37 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j37 = j3;
        }
        long value3 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j4;
        long m4796getTransparent0d7_KjU = (i5 & 16) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j5;
        long m4796getTransparent0d7_KjU2 = (i5 & 32) != 0 ? Color.Companion.m4796getTransparent0d7_KjU() : j6;
        long value4 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j7;
        long value5 = (i5 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i5 & Fields.RotationX) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value6 = (i5 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j9;
        long value7 = (i5 & Fields.RotationZ) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j10;
        if ((i5 & Fields.CameraDistance) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            j38 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j38 = j11;
        }
        long value8 = (i5 & Fields.TransformOrigin) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j12;
        long value9 = (i5 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j13;
        long value10 = (i5 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j14;
        if ((32768 & i5) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            j39 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j39 = j15;
        }
        long value11 = (i5 & 65536) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j16;
        long value12 = (i5 & Fields.RenderEffect) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j17;
        long value13 = (i5 & Fields.ColorFilter) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j18;
        if ((i5 & Fields.BlendMode) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            j40 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j40 = j19;
        }
        long value14 = (i5 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j20;
        long value15 = (i5 & 2097152) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j21;
        long value16 = (i5 & 4194304) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j22;
        if ((i5 & GroupFlagsKt.IsNodeFlag) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            j41 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j41 = j23;
        }
        long value17 = (i5 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j24;
        long value18 = (i5 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j25;
        long value19 = (i5 & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j26;
        if ((i5 & GroupFlagsKt.HasRecompositionRequiredFlag) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            j42 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j42 = j27;
        }
        long value20 = (i5 & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j28;
        long value21 = (i5 & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long value22 = (i5 & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j30;
        if ((i6 & 1) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            j43 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j43 = j31;
        }
        long value23 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j32;
        long value24 = (i6 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j33;
        long value25 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        if ((i6 & 16) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            j44 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j44 = j35;
        }
        long value26 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907010558, i, i2, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:1035)");
        }
        int i7 = i << 6;
        int i8 = (65534 & i) | ((i << 3) & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
        int i9 = i2 << 6;
        int i10 = ((i >> 24) & 126) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i3 << 6;
        int i12 = i4 << 6;
        TextFieldColors m1964outlinedTextFieldColorsFD9MK7s = m1964outlinedTextFieldColorsFD9MK7s(value, value2, j37, value3, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU, m4796getTransparent0d7_KjU2, value4, value5, textSelectionColors2, value6, value7, j38, value8, value9, value10, j39, value11, value12, value13, j40, value14, value15, value16, j41, value17, value18, value19, j42, value20, value21, value22, j43, value23, value24, value25, j44, value26, composer, i8, i10, ((i2 >> 24) & 126) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 896) | ((i3 >> 24) & 126) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1964outlinedTextFieldColorsFD9MK7s;
    }

    /* renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1967textFieldColorsFD9MK7s(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        long j39;
        TextSelectionColors textSelectionColors2;
        int i7;
        long j40;
        long j41;
        int i8;
        long j42;
        long j43;
        long j44;
        int i9;
        long j45;
        long j46;
        int i10;
        long j47;
        long j48;
        int i11;
        long j49;
        long j50;
        int i12;
        long j51;
        long j52;
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j;
        long value2 = (i5 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j2;
        if ((i5 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            j39 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j39 = j3;
        }
        long value3 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j4;
        long value4 = (i5 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j5;
        long value5 = (i5 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j6;
        long value6 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j7;
        long value7 = (i5 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j8;
        long value8 = (i5 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j9;
        long value9 = (i5 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j10;
        TextSelectionColors textSelectionColors3 = (i5 & Fields.RotationZ) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        if ((i5 & Fields.CameraDistance) != 0) {
            textSelectionColors2 = textSelectionColors3;
            i7 = 6;
            j40 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            i7 = 6;
            j40 = j11;
        }
        long value10 = (i5 & Fields.TransformOrigin) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, i7) : j12;
        if ((i5 & 8192) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            j41 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, i7), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j41 = j13;
        }
        long j53 = j41;
        if ((i5 & Fields.Clip) != 0) {
            i8 = 6;
            j42 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        } else {
            i8 = 6;
            j42 = j14;
        }
        long value11 = (32768 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i8) : j15;
        long value12 = (65536 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i8) : j16;
        if ((131072 & i5) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            j43 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i8), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j43 = j17;
        }
        if ((i5 & Fields.ColorFilter) != 0) {
            j44 = j43;
            i9 = 6;
            j45 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j44 = j43;
            i9 = 6;
            j45 = j18;
        }
        long value13 = (i5 & Fields.BlendMode) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i9) : j19;
        long value14 = (i5 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i9) : j20;
        if ((i5 & 2097152) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            j46 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i9), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j46 = j21;
        }
        if ((i5 & 4194304) != 0) {
            i10 = 6;
            j47 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            i10 = 6;
            j47 = j22;
        }
        long value15 = (i5 & GroupFlagsKt.IsNodeFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i10) : j23;
        long value16 = (i5 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i10) : j24;
        long value17 = (i5 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, i10) : j25;
        long value18 = (i5 & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, i10) : j26;
        long value19 = (i5 & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i10) : j27;
        long value20 = (i5 & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i10) : j28;
        if ((i5 & GroupFlagsKt.HasMovableContentFlag) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            j48 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, i10), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j48 = j29;
        }
        if ((i5 & GroupFlagsKt.IsSubcompositionContextFlag) != 0) {
            i11 = 6;
            j49 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i11 = 6;
            j49 = j30;
        }
        long value21 = (i6 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11) : j31;
        long value22 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11) : j32;
        if ((i6 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            j50 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i11), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j50 = j33;
        }
        if ((i6 & 8) != 0) {
            i12 = 6;
            j51 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i12 = 6;
            j51 = j34;
        }
        long value23 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j35;
        long value24 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j36;
        if ((i6 & 64) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            j52 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i12), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j52 = j37;
        }
        long value25 = (i6 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-375683630, i, i2, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:634)");
        }
        int i13 = i4 << 12;
        int i14 = i4 >> 18;
        int i15 = (i14 & 14) | 3072 | (i14 & 112) | (i14 & 896);
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        TextFieldColors m2587colors0hiis_0 = TextFieldDefaults.INSTANCE.m2587colors0hiis_0(value, value2, j39, value3, value4, value5, value6, value7, value8, value9, textSelectionColors4, j40, value10, j53, j42, value11, value12, j44, j45, value13, value14, j46, j47, value15, value16, value17, value18, value19, value20, j48, j49, 0L, 0L, 0L, 0L, value21, value22, j50, j51, value23, value24, j52, value25, composer, i & 2147483646, i2 & 2147483646, i3 & 2147483646, (i4 & 14) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), i15, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2587colors0hiis_0;
    }

    @er
    /* renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1968textFieldColorsStqZLY(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i, int i2, int i3, int i4) {
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j;
        if ((i4 & 2) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            j24 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j2;
        }
        long value2 = (i4 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j3;
        long value3 = (i4 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j4;
        long value4 = (i4 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i4 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value5 = (i4 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j6;
        long value6 = (i4 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j7;
        if ((i4 & Fields.RotationX) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            j25 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j25 = j8;
        }
        long value7 = (i4 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j9;
        long value8 = (i4 & Fields.RotationZ) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j10;
        long value9 = (i4 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j11;
        if ((i4 & Fields.TransformOrigin) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            j26 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j12;
        }
        long value10 = (i4 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j13;
        long value11 = (i4 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j14;
        long value12 = (32768 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j15;
        if ((65536 & i4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            j27 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j27 = j16;
        }
        long value13 = (131072 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j17;
        long value14 = (262144 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j18;
        long value15 = (524288 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j19;
        long value16 = (1048576 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j20;
        long value17 = (2097152 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j21;
        long value18 = (4194304 & i4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j22;
        if ((i4 & GroupFlagsKt.IsNodeFlag) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            j28 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j28 = j23;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013303349, i, i2, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:1128)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value23 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long m4760copywmQWz5c$default2 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value24 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i5 = i << 3;
        int i6 = (i & 14) | (i5 & 112) | (i5 & 896);
        int i7 = i << 9;
        int i8 = i6 | (i7 & 7168) | ((i << 6) & 57344) | (i7 & 458752) | ((i << 12) & 3670016);
        int i9 = i << 15;
        int i10 = i8 | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i2 << 15;
        int i12 = i3 << 15;
        int i13 = i3 << 18;
        int i14 = ((i2 >> 15) & 65534) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i13 & 234881024) | (i13 & 1879048192);
        int i15 = ((i3 >> 6) & 14) | (i12 & 1879048192);
        long j29 = value;
        TextFieldColors m1967textFieldColorsFD9MK7s = m1967textFieldColorsFD9MK7s(j29, value, j24, j29, value2, value2, value2, value2, value3, value4, textSelectionColors2, value5, value6, j25, value7, value8, value9, j26, value10, value11, value12, j27, value13, value14, value15, value16, value17, value18, value18, j28, value18, value19, value20, m4760copywmQWz5c$default, value21, value22, value23, m4760copywmQWz5c$default2, value24, composer, i10, ((i >> 15) & 65534) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i14, i15, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1967textFieldColorsFD9MK7s;
    }

    @er
    /* renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1969textFieldColorstN0laI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j;
        long value2 = (i5 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j2;
        if ((i5 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            j37 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j37 = j3;
        }
        long value3 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j4;
        long value4 = (i5 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j5;
        long value5 = (i5 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j6;
        long value6 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j7;
        long value7 = (i5 & Fields.SpotShadowColor) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j8;
        TextSelectionColors textSelectionColors2 = (i5 & Fields.RotationX) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value8 = (i5 & Fields.RotationY) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j9;
        long value9 = (i5 & Fields.RotationZ) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j10;
        if ((i5 & Fields.CameraDistance) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            j38 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j38 = j11;
        }
        long value10 = (i5 & Fields.TransformOrigin) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j12;
        long value11 = (i5 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j13;
        long value12 = (i5 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j14;
        if ((32768 & i5) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            j39 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j39 = j15;
        }
        long value13 = (i5 & 65536) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j16;
        long value14 = (i5 & Fields.RenderEffect) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j17;
        long value15 = (i5 & Fields.ColorFilter) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j18;
        if ((i5 & Fields.BlendMode) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            j40 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j40 = j19;
        }
        long value16 = (i5 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j20;
        long value17 = (i5 & 2097152) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j21;
        long value18 = (i5 & 4194304) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j22;
        long value19 = (i5 & GroupFlagsKt.IsNodeFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j23;
        long value20 = (i5 & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j24;
        long value21 = (i5 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j25;
        long value22 = (i5 & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j26;
        if ((i5 & GroupFlagsKt.HasRecompositionRequiredFlag) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            j41 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j41 = j27;
        }
        long value23 = (i5 & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j28;
        long value24 = (i5 & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long value25 = (i5 & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j30;
        if ((i6 & 1) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            j42 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j42 = j31;
        }
        long value26 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j32;
        long value27 = (i6 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j33;
        long value28 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        if ((i6 & 16) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            j43 = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j43 = j35;
        }
        long value29 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j36;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1357676928, i, i2, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:921)");
        }
        int i7 = i << 6;
        int i8 = (65534 & i) | ((i << 3) & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
        int i9 = i2 << 6;
        int i10 = ((i >> 24) & 126) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
        int i11 = i3 << 6;
        int i12 = i4 << 6;
        TextFieldColors m1967textFieldColorsFD9MK7s = m1967textFieldColorsFD9MK7s(value, value2, j37, value3, value4, value4, value4, value5, value6, value7, textSelectionColors2, value8, value9, j38, value10, value11, value12, j39, value13, value14, value15, j40, value16, value17, value18, value19, value20, value21, value22, j41, value23, value24, value25, j42, value26, value27, value28, j43, value29, composer, i8, i10, ((i2 >> 24) & 126) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i12 & 896) | ((i3 >> 24) & 126) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1967textFieldColorsFD9MK7s;
    }

    @er
    public final /* synthetic */ void TrailingIcon(boolean z, Composer composer, int i) {
        int i2;
        ExposedDropdownMenuDefaults exposedDropdownMenuDefaults;
        boolean z2;
        Composer startRestartGroup = composer.startRestartGroup(-1803742020);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1803742020, i2, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:849)");
            }
            exposedDropdownMenuDefaults = this;
            z2 = z;
            exposedDropdownMenuDefaults.TrailingIcon(z2, Modifier.Companion, startRestartGroup, (i2 & 14) | 48 | ((i2 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            exposedDropdownMenuDefaults = this;
            z2 = z;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new an(i, z2, i3, exposedDropdownMenuDefaults));
        }
    }
}
