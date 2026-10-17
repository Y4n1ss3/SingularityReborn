package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuSpec {
    public static final int $stable = 0;
    public static final ContextMenuSpec INSTANCE = new ContextMenuSpec();
    private static final float ContainerWidthMin = Dp.m7611constructorimpl(112.0f);
    private static final float ContainerWidthMax = Dp.m7611constructorimpl(280.0f);
    private static final float ListItemHeight = Dp.m7611constructorimpl(48.0f);
    private static final float MenuContainerElevation = Dp.m7611constructorimpl(3.0f);
    private static final float CornerRadius = Dp.m7611constructorimpl(4.0f);
    private static final Alignment.Vertical LabelVerticalTextAlignment = Alignment.Companion.getCenterVertically();
    private static final int LabelHorizontalTextAlignment = TextAlign.Companion.m7494getStarte0LSkKk();
    private static final float HorizontalPadding = Dp.m7611constructorimpl(12.0f);
    private static final float VerticalPadding = Dp.m7611constructorimpl(8.0f);
    private static final float IconSize = Dp.m7611constructorimpl(24.0f);
    private static final float DividerHeight = Dp.m7611constructorimpl(1.0f);
    private static final float DividerVerticalPadding = Dp.m7611constructorimpl(8.0f);
    private static final long FontSize = TextUnitKt.getSp(14);
    private static final FontWeight FontWeight = FontWeight.Companion.getMedium();
    private static final long LineHeight = TextUnitKt.getSp(20);
    private static final long LetterSpacing = TextUnitKt.getSp(0.1f);

    private ContextMenuSpec() {
    }

    /* renamed from: getContainerWidthMax-D9Ej5fM, reason: not valid java name */
    public final float m337getContainerWidthMaxD9Ej5fM() {
        return ContainerWidthMax;
    }

    /* renamed from: getContainerWidthMin-D9Ej5fM, reason: not valid java name */
    public final float m338getContainerWidthMinD9Ej5fM() {
        return ContainerWidthMin;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m339getCornerRadiusD9Ej5fM() {
        return CornerRadius;
    }

    /* renamed from: getDividerHeight-D9Ej5fM, reason: not valid java name */
    public final float m340getDividerHeightD9Ej5fM() {
        return DividerHeight;
    }

    /* renamed from: getDividerVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m341getDividerVerticalPaddingD9Ej5fM() {
        return DividerVerticalPadding;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m342getFontSizeXSAIIZE() {
        return FontSize;
    }

    public final FontWeight getFontWeight() {
        return FontWeight;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m343getHorizontalPaddingD9Ej5fM() {
        return HorizontalPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m344getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getLabelHorizontalTextAlignment-e0LSkKk, reason: not valid java name */
    public final int m345getLabelHorizontalTextAlignmente0LSkKk() {
        return LabelHorizontalTextAlignment;
    }

    public final Alignment.Vertical getLabelVerticalTextAlignment() {
        return LabelVerticalTextAlignment;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m346getLetterSpacingXSAIIZE() {
        return LetterSpacing;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m347getLineHeightXSAIIZE() {
        return LineHeight;
    }

    /* renamed from: getListItemHeight-D9Ej5fM, reason: not valid java name */
    public final float m348getListItemHeightD9Ej5fM() {
        return ListItemHeight;
    }

    /* renamed from: getMenuContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m349getMenuContainerElevationD9Ej5fM() {
        return MenuContainerElevation;
    }

    /* renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m350getVerticalPaddingD9Ej5fM() {
        return VerticalPadding;
    }

    /* renamed from: textStyle-8_81llA, reason: not valid java name */
    public final TextStyle m351textStyle8_81llA(long j) {
        int i = LabelHorizontalTextAlignment;
        return new TextStyle(j, FontSize, FontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, LetterSpacing, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, i, 0, LineHeight, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613240, (dq) null);
    }
}
