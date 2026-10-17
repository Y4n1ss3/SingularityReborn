package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextMotion;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ll0 implements my {
    public final /* synthetic */ int d;

    public /* synthetic */ ll0(int i) {
        this.d = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        Object OffsetSaver$lambda$0;
        Object AnnotationRangeSaver$lambda$0;
        Object LocaleListSaver$lambda$0;
        Object LocaleSaver$lambda$0;
        Object LineHeightStyleSaver$lambda$0;
        Object LineHeightStyleAlignmentSaver$lambda$0;
        Object LineHeightStyleTrimSaver$lambda$0;
        Object LineHeightStyleModeSaver$lambda$0;
        Object VerbatimTtsAnnotationSaver$lambda$0;
        Object ParagraphStyleSaver$lambda$0;
        Object UrlAnnotationSaver$lambda$0;
        Object SpanStyleSaver$lambda$0;
        Object TextLinkStylesSaver$lambda$0;
        Object PlatformParagraphStyleSaver$lambda$0;
        Object emojiSupportMatchSaver$lambda$0;
        Object LineBreakSaver$lambda$0;
        Object TextMotionSaver$lambda$0;
        Object TextMotionLinearitySaver$lambda$0;
        Integer Saver$lambda$0;
        List Saver$lambda$02;
        Long Saver$lambda$03;
        SheetValue Saver$lambda$04;
        List Saver$lambda$05;
        SwipeToDismissBoxValue Saver$lambda$2;
        SwipeToDismissBoxValue Saver$lambda$06;
        List Saver$lambda$07;
        Object Saver$lambda$08;
        switch (this.d) {
            case 0:
                OffsetSaver$lambda$0 = SaversKt.OffsetSaver$lambda$0((SaverScope) obj, (Offset) obj2);
                return OffsetSaver$lambda$0;
            case 1:
                AnnotationRangeSaver$lambda$0 = SaversKt.AnnotationRangeSaver$lambda$0((SaverScope) obj, (AnnotatedString.Range) obj2);
                return AnnotationRangeSaver$lambda$0;
            case 2:
                LocaleListSaver$lambda$0 = SaversKt.LocaleListSaver$lambda$0((SaverScope) obj, (LocaleList) obj2);
                return LocaleListSaver$lambda$0;
            case 3:
                LocaleSaver$lambda$0 = SaversKt.LocaleSaver$lambda$0((SaverScope) obj, (Locale) obj2);
                return LocaleSaver$lambda$0;
            case 4:
                LineHeightStyleSaver$lambda$0 = SaversKt.LineHeightStyleSaver$lambda$0((SaverScope) obj, (LineHeightStyle) obj2);
                return LineHeightStyleSaver$lambda$0;
            case 5:
                LineHeightStyleAlignmentSaver$lambda$0 = SaversKt.LineHeightStyleAlignmentSaver$lambda$0((SaverScope) obj, (LineHeightStyle.Alignment) obj2);
                return LineHeightStyleAlignmentSaver$lambda$0;
            case 6:
                LineHeightStyleTrimSaver$lambda$0 = SaversKt.LineHeightStyleTrimSaver$lambda$0((SaverScope) obj, (LineHeightStyle.Trim) obj2);
                return LineHeightStyleTrimSaver$lambda$0;
            case 7:
                LineHeightStyleModeSaver$lambda$0 = SaversKt.LineHeightStyleModeSaver$lambda$0((SaverScope) obj, (LineHeightStyle.Mode) obj2);
                return LineHeightStyleModeSaver$lambda$0;
            case 8:
                VerbatimTtsAnnotationSaver$lambda$0 = SaversKt.VerbatimTtsAnnotationSaver$lambda$0((SaverScope) obj, (VerbatimTtsAnnotation) obj2);
                return VerbatimTtsAnnotationSaver$lambda$0;
            case 9:
                ParagraphStyleSaver$lambda$0 = SaversKt.ParagraphStyleSaver$lambda$0((SaverScope) obj, (ParagraphStyle) obj2);
                return ParagraphStyleSaver$lambda$0;
            case 10:
                UrlAnnotationSaver$lambda$0 = SaversKt.UrlAnnotationSaver$lambda$0((SaverScope) obj, (UrlAnnotation) obj2);
                return UrlAnnotationSaver$lambda$0;
            case 11:
                SpanStyleSaver$lambda$0 = SaversKt.SpanStyleSaver$lambda$0((SaverScope) obj, (SpanStyle) obj2);
                return SpanStyleSaver$lambda$0;
            case Matrix.TranslateX /* 12 */:
                TextLinkStylesSaver$lambda$0 = SaversKt.TextLinkStylesSaver$lambda$0((SaverScope) obj, (TextLinkStyles) obj2);
                return TextLinkStylesSaver$lambda$0;
            case Matrix.TranslateY /* 13 */:
                PlatformParagraphStyleSaver$lambda$0 = Savers_androidKt.PlatformParagraphStyleSaver$lambda$0((SaverScope) obj, (PlatformParagraphStyle) obj2);
                return PlatformParagraphStyleSaver$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                emojiSupportMatchSaver$lambda$0 = Savers_androidKt.emojiSupportMatchSaver$lambda$0((SaverScope) obj, (EmojiSupportMatch) obj2);
                return emojiSupportMatchSaver$lambda$0;
            case 15:
                LineBreakSaver$lambda$0 = Savers_androidKt.LineBreakSaver$lambda$0((SaverScope) obj, (LineBreak) obj2);
                return LineBreakSaver$lambda$0;
            case 16:
                TextMotionSaver$lambda$0 = Savers_androidKt.TextMotionSaver$lambda$0((SaverScope) obj, (TextMotion) obj2);
                return TextMotionSaver$lambda$0;
            case 17:
                TextMotionLinearitySaver$lambda$0 = Savers_androidKt.TextMotionLinearitySaver$lambda$0((SaverScope) obj, (TextMotion.Linearity) obj2);
                return TextMotionLinearitySaver$lambda$0;
            case 18:
                Saver$lambda$0 = ScrollState.Saver$lambda$0((SaverScope) obj, (ScrollState) obj2);
                return Saver$lambda$0;
            case 19:
                Saver$lambda$02 = SearchBarState.Companion.Saver$lambda$0((SaverScope) obj, (SearchBarState) obj2);
                return Saver$lambda$02;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Saver$lambda$03 = SelectionRegistrarImpl.Saver$lambda$0((SaverScope) obj, (SelectionRegistrarImpl) obj2);
                return Saver$lambda$03;
            case 21:
                Saver$lambda$04 = SheetState.Companion.Saver$lambda$0((SaverScope) obj, (SheetState) obj2);
                return Saver$lambda$04;
            case 22:
                Saver$lambda$05 = SliderState.Companion.Saver$lambda$0((SaverScope) obj, (SliderState) obj2);
                return Saver$lambda$05;
            case 23:
                Saver$lambda$2 = SwipeToDismissBoxState.Companion.Saver$lambda$2((SaverScope) obj, (SwipeToDismissBoxState) obj2);
                return Saver$lambda$2;
            case 24:
                Saver$lambda$06 = SwipeToDismissBoxState.Companion.Saver$lambda$0((SaverScope) obj, (SwipeToDismissBoxState) obj2);
                return Saver$lambda$06;
            case RectListKt.BitOffsetForParentId /* 25 */:
                Saver$lambda$07 = TextFieldScrollerPosition.Saver$lambda$0((SaverScope) obj, (TextFieldScrollerPosition) obj2);
                return Saver$lambda$07;
            case 26:
                Saver$lambda$08 = TextFieldValue.Saver$lambda$0((SaverScope) obj, (TextFieldValue) obj2);
                return Saver$lambda$08;
            case 27:
                in inVar = (in) obj2;
                if (!(inVar instanceof wu0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? inVar : Integer.valueOf(intValue + 1);
            case 28:
                wu0 wu0Var = (wu0) obj;
                in inVar2 = (in) obj2;
                if (wu0Var != null) {
                    return wu0Var;
                }
                if (inVar2 instanceof wu0) {
                    return (wu0) inVar2;
                }
                return null;
            default:
                zu0 zu0Var = (zu0) obj;
                in inVar3 = (in) obj2;
                if (inVar3 instanceof wu0) {
                    wu0 wu0Var2 = (wu0) inVar3;
                    Object updateThreadContext = wu0Var2.updateThreadContext(zu0Var.a);
                    Object[] objArr = zu0Var.b;
                    int i = zu0Var.d;
                    objArr[i] = updateThreadContext;
                    wu0[] wu0VarArr = zu0Var.c;
                    zu0Var.d = i + 1;
                    wu0VarArr[i] = wu0Var2;
                }
                return zu0Var;
        }
    }
}
