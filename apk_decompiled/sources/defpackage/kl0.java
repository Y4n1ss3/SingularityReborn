package defpackage;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl0 implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ kl0(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        FontStyle FontStyleSaver$lambda$1;
        FontSynthesis FontSynthesisSaver$lambda$1;
        TextUnit TextUnitSaver$lambda$1;
        TextUnitType TextUnitTypeSaver$lambda$1;
        Offset OffsetSaver$lambda$1;
        LocaleList LocaleListSaver$lambda$1;
        Locale LocaleSaver$lambda$1;
        LinkAnnotation.Clickable ClickableSaver$lambda$1;
        LineHeightStyle LineHeightStyleSaver$lambda$1;
        LineHeightStyle.Alignment LineHeightStyleAlignmentSaver$lambda$1;
        LineHeightStyle.Trim LineHeightStyleTrimSaver$lambda$1;
        AnnotatedString.Range AnnotationRangeSaver$lambda$1;
        LineHeightStyle.Mode LineHeightStyleModeSaver$lambda$1;
        VerbatimTtsAnnotation VerbatimTtsAnnotationSaver$lambda$1;
        UrlAnnotation UrlAnnotationSaver$lambda$1;
        ParagraphStyle ParagraphStyleSaver$lambda$1;
        SpanStyle SpanStyleSaver$lambda$1;
        PlatformParagraphStyle PlatformParagraphStyleSaver$lambda$1;
        EmojiSupportMatch emojiSupportMatchSaver$lambda$1;
        LineBreak LineBreakSaver$lambda$1;
        TextMotion TextMotionSaver$lambda$1;
        TextMotion.Linearity TextMotionLinearitySaver$lambda$1;
        ScrollState Saver$lambda$1;
        boolean CanDragCalculation$lambda$0;
        w01 SegmentedButton$lambda$4$lambda$3;
        w01 selectableGroup$lambda$0;
        AnimationVector2D UnspecifiedSafeOffsetVectorConverter$lambda$0;
        Offset UnspecifiedSafeOffsetVectorConverter$lambda$1;
        SelectionRegistrarImpl Saver$lambda$12;
        switch (this.d) {
            case 0:
                FontStyleSaver$lambda$1 = SaversKt.FontStyleSaver$lambda$1(obj);
                return FontStyleSaver$lambda$1;
            case 1:
                FontSynthesisSaver$lambda$1 = SaversKt.FontSynthesisSaver$lambda$1(obj);
                return FontSynthesisSaver$lambda$1;
            case 2:
                TextUnitSaver$lambda$1 = SaversKt.TextUnitSaver$lambda$1(obj);
                return TextUnitSaver$lambda$1;
            case 3:
                TextUnitTypeSaver$lambda$1 = SaversKt.TextUnitTypeSaver$lambda$1(obj);
                return TextUnitTypeSaver$lambda$1;
            case 4:
                OffsetSaver$lambda$1 = SaversKt.OffsetSaver$lambda$1(obj);
                return OffsetSaver$lambda$1;
            case 5:
                LocaleListSaver$lambda$1 = SaversKt.LocaleListSaver$lambda$1(obj);
                return LocaleListSaver$lambda$1;
            case 6:
                LocaleSaver$lambda$1 = SaversKt.LocaleSaver$lambda$1(obj);
                return LocaleSaver$lambda$1;
            case 7:
                ClickableSaver$lambda$1 = SaversKt.ClickableSaver$lambda$1(obj);
                return ClickableSaver$lambda$1;
            case 8:
                LineHeightStyleSaver$lambda$1 = SaversKt.LineHeightStyleSaver$lambda$1(obj);
                return LineHeightStyleSaver$lambda$1;
            case 9:
                LineHeightStyleAlignmentSaver$lambda$1 = SaversKt.LineHeightStyleAlignmentSaver$lambda$1(obj);
                return LineHeightStyleAlignmentSaver$lambda$1;
            case 10:
                LineHeightStyleTrimSaver$lambda$1 = SaversKt.LineHeightStyleTrimSaver$lambda$1(obj);
                return LineHeightStyleTrimSaver$lambda$1;
            case 11:
                AnnotationRangeSaver$lambda$1 = SaversKt.AnnotationRangeSaver$lambda$1(obj);
                return AnnotationRangeSaver$lambda$1;
            case Matrix.TranslateX /* 12 */:
                LineHeightStyleModeSaver$lambda$1 = SaversKt.LineHeightStyleModeSaver$lambda$1(obj);
                return LineHeightStyleModeSaver$lambda$1;
            case Matrix.TranslateY /* 13 */:
                VerbatimTtsAnnotationSaver$lambda$1 = SaversKt.VerbatimTtsAnnotationSaver$lambda$1(obj);
                return VerbatimTtsAnnotationSaver$lambda$1;
            case Matrix.TranslateZ /* 14 */:
                UrlAnnotationSaver$lambda$1 = SaversKt.UrlAnnotationSaver$lambda$1(obj);
                return UrlAnnotationSaver$lambda$1;
            case 15:
                ParagraphStyleSaver$lambda$1 = SaversKt.ParagraphStyleSaver$lambda$1(obj);
                return ParagraphStyleSaver$lambda$1;
            case 16:
                SpanStyleSaver$lambda$1 = SaversKt.SpanStyleSaver$lambda$1(obj);
                return SpanStyleSaver$lambda$1;
            case 17:
                PlatformParagraphStyleSaver$lambda$1 = Savers_androidKt.PlatformParagraphStyleSaver$lambda$1(obj);
                return PlatformParagraphStyleSaver$lambda$1;
            case 18:
                emojiSupportMatchSaver$lambda$1 = Savers_androidKt.emojiSupportMatchSaver$lambda$1(obj);
                return emojiSupportMatchSaver$lambda$1;
            case 19:
                LineBreakSaver$lambda$1 = Savers_androidKt.LineBreakSaver$lambda$1(obj);
                return LineBreakSaver$lambda$1;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                TextMotionSaver$lambda$1 = Savers_androidKt.TextMotionSaver$lambda$1(obj);
                return TextMotionSaver$lambda$1;
            case 21:
                TextMotionLinearitySaver$lambda$1 = Savers_androidKt.TextMotionLinearitySaver$lambda$1(obj);
                return TextMotionLinearitySaver$lambda$1;
            case 22:
                Saver$lambda$1 = ScrollState.Saver$lambda$1(((Integer) obj).intValue());
                return Saver$lambda$1;
            case 23:
                CanDragCalculation$lambda$0 = ScrollableKt.CanDragCalculation$lambda$0((PointerType) obj);
                return Boolean.valueOf(CanDragCalculation$lambda$0);
            case 24:
                SegmentedButton$lambda$4$lambda$3 = SegmentedButtonKt.SegmentedButton$lambda$4$lambda$3((SemanticsPropertyReceiver) obj);
                return SegmentedButton$lambda$4$lambda$3;
            case RectListKt.BitOffsetForParentId /* 25 */:
                selectableGroup$lambda$0 = SelectableGroupKt.selectableGroup$lambda$0((SemanticsPropertyReceiver) obj);
                return selectableGroup$lambda$0;
            case 26:
                UnspecifiedSafeOffsetVectorConverter$lambda$0 = SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$0((Offset) obj);
                return UnspecifiedSafeOffsetVectorConverter$lambda$0;
            case 27:
                UnspecifiedSafeOffsetVectorConverter$lambda$1 = SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$1((AnimationVector2D) obj);
                return UnspecifiedSafeOffsetVectorConverter$lambda$1;
            case 28:
                Saver$lambda$12 = SelectionRegistrarImpl.Saver$lambda$1(((Long) obj).longValue());
                return Saver$lambda$12;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
