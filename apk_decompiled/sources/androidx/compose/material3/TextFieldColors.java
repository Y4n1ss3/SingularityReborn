package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.hm0;
import defpackage.iy;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    private TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.focusedTextColor = j;
        this.unfocusedTextColor = j2;
        this.disabledTextColor = j3;
        this.errorTextColor = j4;
        this.focusedContainerColor = j5;
        this.unfocusedContainerColor = j6;
        this.disabledContainerColor = j7;
        this.errorContainerColor = j8;
        this.cursorColor = j9;
        this.errorCursorColor = j10;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j11;
        this.unfocusedIndicatorColor = j12;
        this.disabledIndicatorColor = j13;
        this.errorIndicatorColor = j14;
        this.focusedLeadingIconColor = j15;
        this.unfocusedLeadingIconColor = j16;
        this.disabledLeadingIconColor = j17;
        this.errorLeadingIconColor = j18;
        this.focusedTrailingIconColor = j19;
        this.unfocusedTrailingIconColor = j20;
        this.disabledTrailingIconColor = j21;
        this.errorTrailingIconColor = j22;
        this.focusedLabelColor = j23;
        this.unfocusedLabelColor = j24;
        this.disabledLabelColor = j25;
        this.errorLabelColor = j26;
        this.focusedPlaceholderColor = j27;
        this.unfocusedPlaceholderColor = j28;
        this.disabledPlaceholderColor = j29;
        this.errorPlaceholderColor = j30;
        this.focusedSupportingTextColor = j31;
        this.unfocusedSupportingTextColor = j32;
        this.disabledSupportingTextColor = j33;
        this.errorSupportingTextColor = j34;
        this.focusedPrefixColor = j35;
        this.unfocusedPrefixColor = j36;
        this.disabledPrefixColor = j37;
        this.errorPrefixColor = j38;
        this.focusedSuffixColor = j39;
        this.unfocusedSuffixColor = j40;
        this.disabledSuffixColor = j41;
        this.errorSuffixColor = j42;
    }

    /* renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m2521copyejIjP34$default(TextFieldColors textFieldColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, int i, int i2, Object obj) {
        long j43;
        long j44;
        long j45 = (i & 1) != 0 ? textFieldColors.focusedTextColor : j;
        long j46 = (i & 2) != 0 ? textFieldColors.unfocusedTextColor : j2;
        long j47 = (i & 4) != 0 ? textFieldColors.disabledTextColor : j3;
        long j48 = (i & 8) != 0 ? textFieldColors.errorTextColor : j4;
        long j49 = (i & 16) != 0 ? textFieldColors.focusedContainerColor : j5;
        long j50 = (i & 32) != 0 ? textFieldColors.unfocusedContainerColor : j6;
        if ((i & 64) != 0) {
            j43 = j45;
            j44 = textFieldColors.disabledContainerColor;
        } else {
            j43 = j45;
            j44 = j7;
        }
        return textFieldColors.m2523copyejIjP34(j43, j46, j47, j48, j49, j50, j44, (i & Fields.SpotShadowColor) != 0 ? textFieldColors.errorContainerColor : j8, (i & Fields.RotationX) != 0 ? textFieldColors.cursorColor : j9, (i & Fields.RotationY) != 0 ? textFieldColors.errorCursorColor : j10, (i & Fields.RotationZ) != 0 ? textFieldColors.textSelectionColors : textSelectionColors, (i & Fields.CameraDistance) != 0 ? textFieldColors.focusedIndicatorColor : j11, (i & Fields.TransformOrigin) != 0 ? textFieldColors.unfocusedIndicatorColor : j12, (i & 8192) != 0 ? textFieldColors.disabledIndicatorColor : j13, (i & Fields.Clip) != 0 ? textFieldColors.errorIndicatorColor : j14, (i & Fields.CompositingStrategy) != 0 ? textFieldColors.focusedLeadingIconColor : j15, (i & 65536) != 0 ? textFieldColors.unfocusedLeadingIconColor : j16, (i & Fields.RenderEffect) != 0 ? textFieldColors.disabledLeadingIconColor : j17, (i & Fields.ColorFilter) != 0 ? textFieldColors.errorLeadingIconColor : j18, (i & Fields.BlendMode) != 0 ? textFieldColors.focusedTrailingIconColor : j19, (i & 1048576) != 0 ? textFieldColors.unfocusedTrailingIconColor : j20, (i & 2097152) != 0 ? textFieldColors.disabledTrailingIconColor : j21, (i & 4194304) != 0 ? textFieldColors.errorTrailingIconColor : j22, (i & GroupFlagsKt.IsNodeFlag) != 0 ? textFieldColors.focusedLabelColor : j23, (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? textFieldColors.unfocusedLabelColor : j24, (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? textFieldColors.disabledLabelColor : j25, (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? textFieldColors.errorLabelColor : j26, (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? textFieldColors.focusedPlaceholderColor : j27, (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? textFieldColors.unfocusedPlaceholderColor : j28, (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? textFieldColors.disabledPlaceholderColor : j29, (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? textFieldColors.errorPlaceholderColor : j30, (i & Integer.MIN_VALUE) != 0 ? textFieldColors.focusedSupportingTextColor : j31, (i2 & 1) != 0 ? textFieldColors.unfocusedSupportingTextColor : j32, (i2 & 2) != 0 ? textFieldColors.disabledSupportingTextColor : j33, (i2 & 4) != 0 ? textFieldColors.errorSupportingTextColor : j34, (i2 & 8) != 0 ? textFieldColors.focusedPrefixColor : j35, (i2 & 16) != 0 ? textFieldColors.unfocusedPrefixColor : j36, (i2 & 32) != 0 ? textFieldColors.disabledPrefixColor : j37, (i2 & 64) != 0 ? textFieldColors.errorPrefixColor : j38, (i2 & Fields.SpotShadowColor) != 0 ? textFieldColors.focusedSuffixColor : j39, (i2 & Fields.RotationX) != 0 ? textFieldColors.unfocusedSuffixColor : j40, (i2 & Fields.RotationY) != 0 ? textFieldColors.disabledSuffixColor : j41, (i2 & Fields.RotationZ) != 0 ? textFieldColors.errorSuffixColor : j42);
    }

    /* renamed from: containerColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2522containerColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledContainerColor : z2 ? this.errorContainerColor : z3 ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m2523copyejIjP34(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        return new TextFieldColors(j != 16 ? j : this.focusedTextColor, j2 != 16 ? j2 : this.unfocusedTextColor, j3 != 16 ? j3 : this.disabledTextColor, j4 != 16 ? j4 : this.errorTextColor, j5 != 16 ? j5 : this.focusedContainerColor, j6 != 16 ? j6 : this.unfocusedContainerColor, j7 != 16 ? j7 : this.disabledContainerColor, j8 != 16 ? j8 : this.errorContainerColor, j9 != 16 ? j9 : this.cursorColor, j10 != 16 ? j10 : this.errorCursorColor, takeOrElse$material3(textSelectionColors, new hm0(this, 12)), j11 != 16 ? j11 : this.focusedIndicatorColor, j12 != 16 ? j12 : this.unfocusedIndicatorColor, j13 != 16 ? j13 : this.disabledIndicatorColor, j14 != 16 ? j14 : this.errorIndicatorColor, j15 != 16 ? j15 : this.focusedLeadingIconColor, j16 != 16 ? j16 : this.unfocusedLeadingIconColor, j17 != 16 ? j17 : this.disabledLeadingIconColor, j18 != 16 ? j18 : this.errorLeadingIconColor, j19 != 16 ? j19 : this.focusedTrailingIconColor, j20 != 16 ? j20 : this.unfocusedTrailingIconColor, j21 != 16 ? j21 : this.disabledTrailingIconColor, j22 != 16 ? j22 : this.errorTrailingIconColor, j23 != 16 ? j23 : this.focusedLabelColor, j24 != 16 ? j24 : this.unfocusedLabelColor, j25 != 16 ? j25 : this.disabledLabelColor, j26 != 16 ? j26 : this.errorLabelColor, j27 != 16 ? j27 : this.focusedPlaceholderColor, j28 != 16 ? j28 : this.unfocusedPlaceholderColor, j29 != 16 ? j29 : this.disabledPlaceholderColor, j30 != 16 ? j30 : this.errorPlaceholderColor, j31 != 16 ? j31 : this.focusedSupportingTextColor, j32 != 16 ? j32 : this.unfocusedSupportingTextColor, j33 != 16 ? j33 : this.disabledSupportingTextColor, j34 != 16 ? j34 : this.errorSupportingTextColor, j35 != 16 ? j35 : this.focusedPrefixColor, j36 != 16 ? j36 : this.unfocusedPrefixColor, j37 != 16 ? j37 : this.disabledPrefixColor, j38 != 16 ? j38 : this.errorPrefixColor, j39 != 16 ? j39 : this.focusedSuffixColor, j40 != 16 ? j40 : this.unfocusedSuffixColor, j41 != 16 ? j41 : this.disabledSuffixColor, j42 != 16 ? j42 : this.errorSuffixColor, null);
    }

    /* renamed from: cursorColor-vNxB06k$material3, reason: not valid java name */
    public final long m2524cursorColorvNxB06k$material3(boolean z) {
        return z ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        return Color.m4762equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m4762equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m4762equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m4762equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m4762equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m4762equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m4762equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m4762equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m4762equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m4762equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && q10.b(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m4762equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m4762equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m4762equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m4762equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m4762equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m4762equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m4762equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m4762equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m4762equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m4762equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m4762equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m4762equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m4762equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m4762equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m4762equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m4762equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m4762equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m4762equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m4762equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m4762equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m4762equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m4762equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m4762equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m4762equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m4762equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m4762equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m4762equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m4762equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m4762equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m4762equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m4762equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m4762equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2525getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2526getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2527getDisabledIndicatorColor0d7_KjU() {
        return this.disabledIndicatorColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2528getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2529getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2530getDisabledPlaceholderColor0d7_KjU() {
        return this.disabledPlaceholderColor;
    }

    /* renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2531getDisabledPrefixColor0d7_KjU() {
        return this.disabledPrefixColor;
    }

    /* renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2532getDisabledSuffixColor0d7_KjU() {
        return this.disabledSuffixColor;
    }

    /* renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2533getDisabledSupportingTextColor0d7_KjU() {
        return this.disabledSupportingTextColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2534getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2535getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2536getErrorContainerColor0d7_KjU() {
        return this.errorContainerColor;
    }

    /* renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2537getErrorCursorColor0d7_KjU() {
        return this.errorCursorColor;
    }

    /* renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2538getErrorIndicatorColor0d7_KjU() {
        return this.errorIndicatorColor;
    }

    /* renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2539getErrorLabelColor0d7_KjU() {
        return this.errorLabelColor;
    }

    /* renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2540getErrorLeadingIconColor0d7_KjU() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2541getErrorPlaceholderColor0d7_KjU() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2542getErrorPrefixColor0d7_KjU() {
        return this.errorPrefixColor;
    }

    /* renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2543getErrorSuffixColor0d7_KjU() {
        return this.errorSuffixColor;
    }

    /* renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2544getErrorSupportingTextColor0d7_KjU() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m2545getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    /* renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2546getErrorTrailingIconColor0d7_KjU() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2547getFocusedContainerColor0d7_KjU() {
        return this.focusedContainerColor;
    }

    /* renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2548getFocusedIndicatorColor0d7_KjU() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2549getFocusedLabelColor0d7_KjU() {
        return this.focusedLabelColor;
    }

    /* renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2550getFocusedLeadingIconColor0d7_KjU() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2551getFocusedPlaceholderColor0d7_KjU() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2552getFocusedPrefixColor0d7_KjU() {
        return this.focusedPrefixColor;
    }

    /* renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2553getFocusedSuffixColor0d7_KjU() {
        return this.focusedSuffixColor;
    }

    /* renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2554getFocusedSupportingTextColor0d7_KjU() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2555getFocusedTextColor0d7_KjU() {
        return this.focusedTextColor;
    }

    /* renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2556getFocusedTrailingIconColor0d7_KjU() {
        return this.focusedTrailingIconColor;
    }

    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2557getUnfocusedContainerColor0d7_KjU() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2558getUnfocusedIndicatorColor0d7_KjU() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2559getUnfocusedLabelColor0d7_KjU() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2560getUnfocusedLeadingIconColor0d7_KjU() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2561getUnfocusedPlaceholderColor0d7_KjU() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2562getUnfocusedPrefixColor0d7_KjU() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2563getUnfocusedSuffixColor0d7_KjU() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2564getUnfocusedSupportingTextColor0d7_KjU() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2565getUnfocusedTextColor0d7_KjU() {
        return this.unfocusedTextColor;
    }

    /* renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2566getUnfocusedTrailingIconColor0d7_KjU() {
        return this.unfocusedTrailingIconColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.errorSuffixColor) + kp0.d(this.disabledSuffixColor, kp0.d(this.unfocusedSuffixColor, kp0.d(this.focusedSuffixColor, kp0.d(this.errorPrefixColor, kp0.d(this.disabledPrefixColor, kp0.d(this.unfocusedPrefixColor, kp0.d(this.focusedPrefixColor, kp0.d(this.errorSupportingTextColor, kp0.d(this.disabledSupportingTextColor, kp0.d(this.unfocusedSupportingTextColor, kp0.d(this.focusedSupportingTextColor, kp0.d(this.errorPlaceholderColor, kp0.d(this.disabledPlaceholderColor, kp0.d(this.unfocusedPlaceholderColor, kp0.d(this.focusedPlaceholderColor, kp0.d(this.errorLabelColor, kp0.d(this.disabledLabelColor, kp0.d(this.unfocusedLabelColor, kp0.d(this.focusedLabelColor, kp0.d(this.errorTrailingIconColor, kp0.d(this.disabledTrailingIconColor, kp0.d(this.unfocusedTrailingIconColor, kp0.d(this.focusedTrailingIconColor, kp0.d(this.errorLeadingIconColor, kp0.d(this.disabledLeadingIconColor, kp0.d(this.unfocusedLeadingIconColor, kp0.d(this.focusedLeadingIconColor, kp0.d(this.errorIndicatorColor, kp0.d(this.disabledIndicatorColor, kp0.d(this.unfocusedIndicatorColor, kp0.d(this.focusedIndicatorColor, (this.textSelectionColors.hashCode() + kp0.d(this.errorCursorColor, kp0.d(this.cursorColor, kp0.d(this.errorContainerColor, kp0.d(this.disabledContainerColor, kp0.d(this.unfocusedContainerColor, kp0.d(this.focusedContainerColor, kp0.d(this.errorTextColor, kp0.d(this.disabledTextColor, kp0.d(this.unfocusedTextColor, Color.m4768hashCodeimpl(this.focusedTextColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: indicatorColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2567indicatorColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledIndicatorColor : z2 ? this.errorIndicatorColor : z3 ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    /* renamed from: labelColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2568labelColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledLabelColor : z2 ? this.errorLabelColor : z3 ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    /* renamed from: leadingIconColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2569leadingIconColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledLeadingIconColor : z2 ? this.errorLeadingIconColor : z3 ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    /* renamed from: placeholderColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2570placeholderColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledPlaceholderColor : z2 ? this.errorPlaceholderColor : z3 ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    /* renamed from: prefixColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2571prefixColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledPrefixColor : z2 ? this.errorPrefixColor : z3 ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    /* renamed from: suffixColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2572suffixColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledSuffixColor : z2 ? this.errorSuffixColor : z3 ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    /* renamed from: supportingTextColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2573supportingTextColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledSupportingTextColor : z2 ? this.errorSupportingTextColor : z3 ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final TextSelectionColors takeOrElse$material3(TextSelectionColors textSelectionColors, iy iyVar) {
        return textSelectionColors == null ? (TextSelectionColors) iyVar.invoke() : textSelectionColors;
    }

    /* renamed from: textColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2574textColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledTextColor : z2 ? this.errorTextColor : z3 ? this.focusedTextColor : this.unfocusedTextColor;
    }

    /* renamed from: trailingIconColor-XeAY9LY$material3, reason: not valid java name */
    public final long m2575trailingIconColorXeAY9LY$material3(boolean z, boolean z2, boolean z3) {
        return !z ? this.disabledTrailingIconColor : z2 ? this.errorTrailingIconColor : z3 ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    public /* synthetic */ TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, textSelectionColors, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }
}
