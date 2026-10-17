package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.dq;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    private AutoSizeStepBased(long j, long j2, long j3) {
        this.minFontSize = j;
        this.maxFontSize = j2;
        this.stepSize = j3;
        TextUnit.Companion companion = TextUnit.Companion;
        if (TextUnit.m7802equalsimpl0(j, companion.m7816getUnspecifiedXSAIIZE())) {
            o.m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (TextUnit.m7802equalsimpl0(j2, companion.m7816getUnspecifiedXSAIIZE())) {
            o.m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (TextUnit.m7802equalsimpl0(j3, companion.m7816getUnspecifiedXSAIIZE())) {
            o.m("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(this.minFontSize), TextUnit.m7804getTypeUIouoOA(j2))) {
            long j4 = this.minFontSize;
            TextUnitKt.m7819checkArithmeticNB67dxo(j4, j2);
            if (Float.compare(TextUnit.m7805getValueimpl(j4), TextUnit.m7805getValueimpl(j2)) > 0) {
                this.minFontSize = j2;
            }
        }
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j3), TextUnitType.Companion.m7838getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m7819checkArithmeticNB67dxo(j3, sp);
            if (Float.compare(TextUnit.m7805getValueimpl(j3), TextUnit.m7805getValueimpl(sp)) < 0) {
                o.m("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (TextUnit.m7805getValueimpl(this.minFontSize) < 0.0f) {
            o.m("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (TextUnit.m7805getValueimpl(j2) >= 0.0f) {
            return;
        }
        o.m("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int m7027getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7546getClipgIe3tQ8()) || TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7550getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7549getStartEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7548getMiddleEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7547getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m7539toStringimpl(textLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8())) + " is not supported.");
    }

    private final boolean didOverflowBounds(TextLayoutResult textLayoutResult) {
        return textLayoutResult.getDidOverflowWidth() || textLayoutResult.getDidOverflowHeight();
    }

    private final boolean didOverflowByEllipsize(TextLayoutResult textLayoutResult) {
        int lineCount = textLayoutResult.getLineCount();
        if (lineCount == 0) {
            return false;
        }
        if (lineCount == 1) {
            return textLayoutResult.isLineEllipsized(0);
        }
        int m7027getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m7027getOverflowgIe3tQ8();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7549getStartEllipsisgIe3tQ8()) || TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7548getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m7537equalsimpl0(m7027getOverflowgIe3tQ8, companion.m7547getEllipsisgIe3tQ8())) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) obj;
        return TextUnit.m7802equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m7802equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m7802equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo1060getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j, AnnotatedString annotatedString) {
        float mo366toPxR2X_6o = textAutoSizeLayoutScope.mo366toPxR2X_6o(this.stepSize);
        float mo366toPxR2X_6o2 = textAutoSizeLayoutScope.mo366toPxR2X_6o(this.minFontSize);
        float mo366toPxR2X_6o3 = textAutoSizeLayoutScope.mo366toPxR2X_6o(this.maxFontSize);
        float f = (mo366toPxR2X_6o2 + mo366toPxR2X_6o3) / 2.0f;
        float f2 = mo366toPxR2X_6o2;
        float f3 = mo366toPxR2X_6o3;
        while (f3 - f2 >= mo366toPxR2X_6o) {
            if (didOverflow(textAutoSizeLayoutScope.mo1462performLayout5ZSfY2I(j, annotatedString, textAutoSizeLayoutScope.mo370toSpkPz2Gy4(f)))) {
                f3 = f;
            } else {
                f2 = f;
            }
            f = (f2 + f3) / 2.0f;
        }
        float floor = (((float) Math.floor((f2 - mo366toPxR2X_6o2) / mo366toPxR2X_6o)) * mo366toPxR2X_6o) + mo366toPxR2X_6o2;
        float f4 = mo366toPxR2X_6o + floor;
        if (f4 <= mo366toPxR2X_6o3 && !didOverflow(textAutoSizeLayoutScope.mo1462performLayout5ZSfY2I(j, annotatedString, textAutoSizeLayoutScope.mo370toSpkPz2Gy4(f4)))) {
            floor = f4;
        }
        return textAutoSizeLayoutScope.mo370toSpkPz2Gy4(floor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return TextUnit.m7806hashCodeimpl(this.stepSize) + ((TextUnit.m7806hashCodeimpl(this.maxFontSize) + (TextUnit.m7806hashCodeimpl(this.minFontSize) * 31)) * 31);
    }

    public /* synthetic */ AutoSizeStepBased(long j, long j2, long j3, dq dqVar) {
        this(j, j2, j3);
    }
}
