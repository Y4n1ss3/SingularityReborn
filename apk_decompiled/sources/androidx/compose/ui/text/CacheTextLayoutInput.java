package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        return q10.b(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && q10.b(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m7537equalsimpl0(textLayoutInput.m7027getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m7027getOverflowgIe3tQ8()) && q10.b(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m7557equalsimpl0(textLayoutInput.m7026getConstraintsmsEJaDk(), cacheTextLayoutInput.textLayoutInput.m7026getConstraintsmsEJaDk());
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return Constraints.m7567hashCodeimpl(textLayoutInput.m7026getConstraintsmsEJaDk()) + ((textLayoutInput.getFontFamilyResolver().hashCode() + ((textLayoutInput.getLayoutDirection().hashCode() + ((textLayoutInput.getDensity().hashCode() + ((TextOverflow.m7538hashCodeimpl(textLayoutInput.m7027getOverflowgIe3tQ8()) + ((Boolean.hashCode(textLayoutInput.getSoftWrap()) + ((textLayoutInput.getMaxLines() + ((textLayoutInput.getPlaceholders().hashCode() + ((textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text() + (textLayoutInput.getText().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
