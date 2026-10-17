package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m1198canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !q10.b(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !q10.b(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !TextOverflow.m7537equalsimpl0(layoutInput.m7027getOverflowgIe3tQ8(), i2) || !q10.b(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !q10.b(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m7566getMinWidthimpl(j) != Constraints.m7566getMinWidthimpl(layoutInput.m7026getConstraintsmsEJaDk())) {
            return false;
        }
        if (z || TextOverflow.m7537equalsimpl0(i2, TextOverflow.Companion.m7547getEllipsisgIe3tQ8())) {
            return Constraints.m7564getMaxWidthimpl(j) == Constraints.m7564getMaxWidthimpl(layoutInput.m7026getConstraintsmsEJaDk()) && Constraints.m7563getMaxHeightimpl(j) == Constraints.m7563getMaxHeightimpl(layoutInput.m7026getConstraintsmsEJaDk());
        }
        return true;
    }

    public static final float getLineHeight(TextLayoutResult textLayoutResult, int i) {
        if (i < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int min = Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(i), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i > MultiParagraph.getLineEnd$default(textLayoutResult.getMultiParagraph(), min, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().getLineHeight(min);
    }

    /* renamed from: isPositionInsideSelection-uaM50fQ, reason: not valid java name */
    public static final boolean m1199isPositionInsideSelectionuaM50fQ(TextLayoutResult textLayoutResult, long j, TextRange textRange) {
        if (textRange == null || TextRange.m7054getCollapsedimpl(textRange.m7064unboximpl())) {
            return false;
        }
        int m7030getOffsetForPositionk4lQ0M = textLayoutResult.m7030getOffsetForPositionk4lQ0M(j);
        return isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(textRange, textLayoutResult, j, m7030getOffsetForPositionk4lQ0M) || isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(textRange, textLayoutResult, j, m7030getOffsetForPositionk4lQ0M - 1);
    }

    private static final boolean isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(TextRange textRange, TextLayoutResult textLayoutResult, long j, int i) {
        return TextRange.m7051containsimpl(textRange.m7064unboximpl(), i) && textLayoutResult.getBoundingBox(i).m4542containsk4lQ0M(j);
    }
}
