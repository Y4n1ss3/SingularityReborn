package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f) {
        return new TextIndent(SpanStyleKt.m7007lerpTextUnitInheritableC3pnCVY(textIndent.m7519getFirstLineXSAIIZE(), textIndent2.m7519getFirstLineXSAIIZE(), f), SpanStyleKt.m7007lerpTextUnitInheritableC3pnCVY(textIndent.m7520getRestLineXSAIIZE(), textIndent2.m7520getRestLineXSAIIZE(), f), null);
    }
}
