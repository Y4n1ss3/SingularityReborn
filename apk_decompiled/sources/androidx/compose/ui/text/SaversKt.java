package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.dq;
import defpackage.je0;
import defpackage.kl0;
import defpackage.ky;
import defpackage.ll0;
import defpackage.my;
import defpackage.n30;
import defpackage.o;
import defpackage.q10;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SaversKt {
    private static final Saver<SpanStyle, Object> SpanStyleSaver;
    private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver;
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new n30(12), new je0(17));
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new n30(19), new je0(29));
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new ll0(1), new kl0(11));
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new ll0(8), new kl0(13));
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new ll0(10), new kl0(14));
    private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(new n30(17), new je0(26));
    private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(new n30(28), new kl0(7));
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new ll0(9), new kl0(15));
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new n30(13), new je0(18));
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new n30(14), new je0(19));
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new n30(15), new je0(20));
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new n30(16), new je0(21));
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new n30(18), new je0(22));
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new n30(20), new je0(23));
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new n30(21), new je0(24));
    private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(new my() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m6989invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m4771unboximpl());
        }

        /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m6989invoke4WTKRHQ(SaverScope saverScope, long j) {
            return j == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.m4815toArgb8_81llA(j));
        }
    }, new ky() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // defpackage.ky
        /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(Object obj) {
            if (q10.b(obj, Boolean.FALSE)) {
                return Color.m4751boximpl(Color.Companion.m4797getUnspecified0d7_KjU());
            }
            obj.getClass();
            return Color.m4751boximpl(ColorKt.Color(((Integer) obj).intValue()));
        }
    });
    private static final NonNullValueClassSaver<TextAlign, Object> TextAlignSaver = NonNullValueClassSaver(new n30(22), new je0(25));
    private static final NonNullValueClassSaver<TextDirection, Object> TextDirectionSaver = NonNullValueClassSaver(new n30(23), new je0(27));
    private static final NonNullValueClassSaver<Hyphens, Object> HyphensSaver = NonNullValueClassSaver(new n30(24), new je0(28));
    private static final Saver<FontStyle, Object> FontStyleSaver = SaverKt.Saver(new n30(25), new kl0(0));
    private static final Saver<FontSynthesis, Object> FontSynthesisSaver = SaverKt.Saver(new n30(26), new kl0(1));
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(new n30(27), new kl0(2));
    private static final NonNullValueClassSaver<TextUnitType, Object> TextUnitTypeSaver = NonNullValueClassSaver(new n30(29), new kl0(3));
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(new ll0(0), new kl0(4));
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new ll0(2), new kl0(5));
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new ll0(3), new kl0(6));
    private static final Saver<LineHeightStyle, Object> LineHeightStyleSaver = SaverKt.Saver(new ll0(4), new kl0(8));
    private static final NonNullValueClassSaver<LineHeightStyle.Alignment, Object> LineHeightStyleAlignmentSaver = NonNullValueClassSaver(new ll0(5), new kl0(9));
    private static final NonNullValueClassSaver<LineHeightStyle.Trim, Object> LineHeightStyleTrimSaver = NonNullValueClassSaver(new ll0(6), new kl0(10));
    private static final NonNullValueClassSaver<LineHeightStyle.Mode, Object> LineHeightStyleModeSaver = NonNullValueClassSaver(new ll0(7), new kl0(12));

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnnotationType.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = 16;
        SpanStyleSaver = SaverKt.Saver(new ll0(11), new kl0(i));
        TextLinkStylesSaver = SaverKt.Saver(new ll0(12), new je0(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotatedStringSaver$lambda$0(SaverScope saverScope, AnnotatedString annotatedString) {
        return y80.a(save(annotatedString.getText()), save(annotatedString.getAnnotations$ui_text(), AnnotationRangeListSaver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString AnnotatedStringSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(1);
        Saver<List<AnnotatedString.Range<? extends Object>>, Object> saver = AnnotationRangeListSaver;
        List<AnnotatedString.Range<? extends Object>> restore = ((!q10.b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        str.getClass();
        return new AnnotatedString(restore, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotationRangeListSaver$lambda$0(SaverScope saverScope, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(save((AnnotatedString.Range) list.get(i), AnnotationRangeSaver, saverScope));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AnnotationRangeListSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            Saver<AnnotatedString.Range<? extends Object>, Object> saver = AnnotationRangeSaver;
            AnnotatedString.Range<? extends Object> range = null;
            if ((!q10.b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                range = saver.restore(obj2);
            }
            range.getClass();
            arrayList.add(range);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotationRangeSaver$lambda$0(SaverScope saverScope, AnnotatedString.Range range) {
        AnnotationType annotationType;
        Object save;
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (item instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else if (item instanceof LinkAnnotation.Url) {
            annotationType = AnnotationType.Link;
        } else if (item instanceof LinkAnnotation.Clickable) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(item instanceof StringAnnotation)) {
                throw new UnsupportedOperationException();
            }
            annotationType = AnnotationType.String;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object item2 = range.getItem();
                item2.getClass();
                save = save((ParagraphStyle) item2, ParagraphStyleSaver, saverScope);
                break;
            case 2:
                Object item3 = range.getItem();
                item3.getClass();
                save = save((SpanStyle) item3, SpanStyleSaver, saverScope);
                break;
            case 3:
                Object item4 = range.getItem();
                item4.getClass();
                save = save((VerbatimTtsAnnotation) item4, VerbatimTtsAnnotationSaver, saverScope);
                break;
            case 4:
                Object item5 = range.getItem();
                item5.getClass();
                save = save((UrlAnnotation) item5, UrlAnnotationSaver, saverScope);
                break;
            case 5:
                Object item6 = range.getItem();
                item6.getClass();
                save = save((LinkAnnotation.Url) item6, LinkSaver, saverScope);
                break;
            case 6:
                Object item7 = range.getItem();
                item7.getClass();
                save = save((LinkAnnotation.Clickable) item7, ClickableSaver, saverScope);
                break;
            case 7:
                Object item8 = range.getItem();
                item8.getClass();
                save = save(((StringAnnotation) item8).m7014unboximpl());
                break;
            default:
                o.n();
                return null;
        }
        return y80.a(save(annotationType), save, save(Integer.valueOf(range.getStart())), save(Integer.valueOf(range.getEnd())), save(range.getTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range AnnotationRangeSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle paragraphStyle = null;
        r1 = null;
        LinkAnnotation.Clickable restore = null;
        r1 = null;
        LinkAnnotation.Url restore2 = null;
        r1 = null;
        UrlAnnotation restore3 = null;
        r1 = null;
        VerbatimTtsAnnotation restore4 = null;
        r1 = null;
        SpanStyle restore5 = null;
        paragraphStyle = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        annotationType.getClass();
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        num.getClass();
        int intValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        num2.getClass();
        int intValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        str.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                Saver<ParagraphStyle, Object> saver = ParagraphStyleSaver;
                if ((!q10.b(obj6, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj6 != null) {
                    paragraphStyle = saver.restore(obj6);
                }
                paragraphStyle.getClass();
                return new AnnotatedString.Range(paragraphStyle, intValue, intValue2, str);
            case 2:
                Object obj7 = list.get(1);
                Saver<SpanStyle, Object> saver2 = SpanStyleSaver;
                if ((!q10.b(obj7, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj7 != null) {
                    restore5 = saver2.restore(obj7);
                }
                restore5.getClass();
                return new AnnotatedString.Range(restore5, intValue, intValue2, str);
            case 3:
                Object obj8 = list.get(1);
                Saver<VerbatimTtsAnnotation, Object> saver3 = VerbatimTtsAnnotationSaver;
                if ((!q10.b(obj8, Boolean.FALSE) || (saver3 instanceof NonNullValueClassSaver)) && obj8 != null) {
                    restore4 = saver3.restore(obj8);
                }
                restore4.getClass();
                return new AnnotatedString.Range(restore4, intValue, intValue2, str);
            case 4:
                Object obj9 = list.get(1);
                Saver<UrlAnnotation, Object> saver4 = UrlAnnotationSaver;
                if ((!q10.b(obj9, Boolean.FALSE) || (saver4 instanceof NonNullValueClassSaver)) && obj9 != null) {
                    restore3 = saver4.restore(obj9);
                }
                restore3.getClass();
                return new AnnotatedString.Range(restore3, intValue, intValue2, str);
            case 5:
                Object obj10 = list.get(1);
                Saver<LinkAnnotation.Url, Object> saver5 = LinkSaver;
                if ((!q10.b(obj10, Boolean.FALSE) || (saver5 instanceof NonNullValueClassSaver)) && obj10 != null) {
                    restore2 = saver5.restore(obj10);
                }
                restore2.getClass();
                return new AnnotatedString.Range(restore2, intValue, intValue2, str);
            case 6:
                Object obj11 = list.get(1);
                Saver<LinkAnnotation.Clickable, Object> saver6 = ClickableSaver;
                if ((!q10.b(obj11, Boolean.FALSE) || (saver6 instanceof NonNullValueClassSaver)) && obj11 != null) {
                    restore = saver6.restore(obj11);
                }
                restore.getClass();
                return new AnnotatedString.Range(restore, intValue, intValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                str2.getClass();
                return new AnnotatedString.Range(StringAnnotation.m7008boximpl(StringAnnotation.m7009constructorimpl(str2)), intValue, intValue2, str);
            default:
                o.n();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object BaselineShiftSaver$lambda$0(SaverScope saverScope, BaselineShift baselineShift) {
        return Float.valueOf(baselineShift.m7357unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaselineShift BaselineShiftSaver$lambda$1(Object obj) {
        obj.getClass();
        return BaselineShift.m7351boximpl(BaselineShift.m7352constructorimpl(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ClickableSaver$lambda$0(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
        return y80.a(save(clickable.getTag()), save(clickable.getStyles(), TextLinkStylesSaver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAnnotation.Clickable ClickableSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        str.getClass();
        Object obj3 = list.get(1);
        Saver<TextLinkStyles, Object> saver = TextLinkStylesSaver;
        return new LinkAnnotation.Clickable(str, ((!q10.b(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontStyleSaver$lambda$0(SaverScope saverScope, FontStyle fontStyle) {
        return save(Integer.valueOf(fontStyle.m7175unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontStyle FontStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        return FontStyle.m7169boximpl(FontStyle.m7170constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontSynthesisSaver$lambda$0(SaverScope saverScope, FontSynthesis fontSynthesis) {
        return Integer.valueOf(fontSynthesis.m7188unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontSynthesis FontSynthesisSaver$lambda$1(Object obj) {
        obj.getClass();
        return FontSynthesis.m7180boximpl(FontSynthesis.m7181constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontWeightSaver$lambda$0(SaverScope saverScope, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontWeight FontWeightSaver$lambda$1(Object obj) {
        obj.getClass();
        return new FontWeight(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HyphensSaver$lambda$0(SaverScope saverScope, Hyphens hyphens) {
        return Integer.valueOf(hyphens.m7380unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hyphens HyphensSaver$lambda$1(Object obj) {
        obj.getClass();
        return Hyphens.m7374boximpl(Hyphens.m7375constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleAlignmentSaver$lambda$0(SaverScope saverScope, LineHeightStyle.Alignment alignment) {
        return Float.valueOf(alignment.m7454unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Alignment LineHeightStyleAlignmentSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineHeightStyle.Alignment.m7448boximpl(LineHeightStyle.Alignment.m7449constructorimpl(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleModeSaver$lambda$0(SaverScope saverScope, LineHeightStyle.Mode mode) {
        return Integer.valueOf(mode.m7465unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Mode LineHeightStyleModeSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineHeightStyle.Mode.m7459boximpl(LineHeightStyle.Mode.m7460constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleSaver$lambda$0(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
        return y80.a(save(LineHeightStyle.Alignment.m7448boximpl(lineHeightStyle.m7445getAlignmentPIaL0Z0()), getSaver(LineHeightStyle.Alignment.Companion), saverScope), save(LineHeightStyle.Trim.m7469boximpl(lineHeightStyle.m7447getTrimEVpEnUU()), getSaver(LineHeightStyle.Trim.Companion), saverScope), save(LineHeightStyle.Mode.m7459boximpl(lineHeightStyle.m7446getModelzQqcRY()), getSaver(LineHeightStyle.Mode.Companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle LineHeightStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<LineHeightStyle.Alignment, Object> saver = getSaver(LineHeightStyle.Alignment.Companion);
        Boolean bool = Boolean.FALSE;
        LineHeightStyle.Alignment restore = ((!q10.b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        restore.getClass();
        float m7454unboximpl = restore.m7454unboximpl();
        Object obj3 = list.get(1);
        Saver<LineHeightStyle.Trim, Object> saver2 = getSaver(LineHeightStyle.Trim.Companion);
        LineHeightStyle.Trim restore2 = ((!q10.b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        restore2.getClass();
        int m7477unboximpl = restore2.m7477unboximpl();
        Object obj4 = list.get(2);
        Saver<LineHeightStyle.Mode, Object> saver3 = getSaver(LineHeightStyle.Mode.Companion);
        LineHeightStyle.Mode restore3 = ((!q10.b(obj4, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver3.restore(obj4) : null;
        restore3.getClass();
        return new LineHeightStyle(m7454unboximpl, m7477unboximpl, restore3.m7465unboximpl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleTrimSaver$lambda$0(SaverScope saverScope, LineHeightStyle.Trim trim) {
        return Integer.valueOf(trim.m7477unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Trim LineHeightStyleTrimSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineHeightStyle.Trim.m7469boximpl(LineHeightStyle.Trim.m7470constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LinkSaver$lambda$0(SaverScope saverScope, LinkAnnotation.Url url) {
        return y80.a(save(url.getUrl()), save(url.getStyles(), TextLinkStylesSaver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAnnotation.Url LinkSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextLinkStyles textLinkStyles = null;
        String str = obj2 != null ? (String) obj2 : null;
        str.getClass();
        Object obj3 = list.get(1);
        Saver<TextLinkStyles, Object> saver = TextLinkStylesSaver;
        if ((!q10.b(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textLinkStyles = saver.restore(obj3);
        }
        return new LinkAnnotation.Url(str, textLinkStyles, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocaleListSaver$lambda$0(SaverScope saverScope, LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(save(localeList2.get(i), getSaver(Locale.Companion), saverScope));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocaleList LocaleListSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            Saver<Locale, Object> saver = getSaver(Locale.Companion);
            Locale locale = null;
            if ((!q10.b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                locale = saver.restore(obj2);
            }
            locale.getClass();
            arrayList.add(locale);
        }
        return new LocaleList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocaleSaver$lambda$0(SaverScope saverScope, Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale LocaleSaver$lambda$1(Object obj) {
        obj.getClass();
        return new Locale((String) obj);
    }

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final my myVar, final ky kyVar) {
        return new NonNullValueClassSaver<Original, Saveable>() { // from class: androidx.compose.ui.text.SaversKt$NonNullValueClassSaver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return (Original) kyVar.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) my.this.invoke(saverScope, original);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object OffsetSaver$lambda$0(SaverScope saverScope, Offset offset) {
        return offset == null ? false : Offset.m4513equalsimpl0(offset.m4526unboximpl(), Offset.Companion.m4531getUnspecifiedF1C5BW0()) ? Boolean.FALSE : y80.a(save(Float.valueOf(Float.intBitsToFloat((int) (offset.m4526unboximpl() >> 32)))), save(Float.valueOf(Float.intBitsToFloat((int) (offset.m4526unboximpl() & 4294967295L)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset OffsetSaver$lambda$1(Object obj) {
        if (q10.b(obj, Boolean.FALSE)) {
            return Offset.m4505boximpl(Offset.Companion.m4531getUnspecifiedF1C5BW0());
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        (obj3 != null ? (Float) obj3 : null).getClass();
        return Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ParagraphStyleSaver$lambda$0(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        return y80.a(save(TextAlign.m7482boximpl(paragraphStyle.m6965getTextAligne0LSkKk()), getSaver(TextAlign.Companion), saverScope), save(TextDirection.m7499boximpl(paragraphStyle.m6967getTextDirections_7Xco()), getSaver(TextDirection.Companion), saverScope), save(TextUnit.m7795boximpl(paragraphStyle.m6963getLineHeightXSAIIZE()), getSaver(TextUnit.Companion), saverScope), save(paragraphStyle.getTextIndent(), getSaver(TextIndent.Companion), saverScope), save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.Companion), saverScope), save(paragraphStyle.getLineHeightStyle(), getSaver(LineHeightStyle.Companion), saverScope), save(LineBreak.m7387boximpl(paragraphStyle.m6962getLineBreakrAG3T2k()), Savers_androidKt.getSaver(LineBreak.Companion), saverScope), save(Hyphens.m7374boximpl(paragraphStyle.m6960getHyphensvmbZdU8()), getSaver(Hyphens.Companion), saverScope), save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.Companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParagraphStyle ParagraphStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<TextAlign, Object> saver = getSaver(TextAlign.Companion);
        Boolean bool = Boolean.FALSE;
        TextMotion textMotion = null;
        TextAlign restore = ((!q10.b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        restore.getClass();
        int m7488unboximpl = restore.m7488unboximpl();
        Object obj3 = list.get(1);
        Saver<TextDirection, Object> saver2 = getSaver(TextDirection.Companion);
        TextDirection restore2 = ((!q10.b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        restore2.getClass();
        int m7505unboximpl = restore2.m7505unboximpl();
        Object obj4 = list.get(2);
        Saver<TextUnit, Object> saver3 = getSaver(TextUnit.Companion);
        TextUnit restore3 = ((!q10.b(obj4, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver3.restore(obj4) : null;
        restore3.getClass();
        long m7814unboximpl = restore3.m7814unboximpl();
        Object obj5 = list.get(3);
        Saver<TextIndent, Object> saver4 = getSaver(TextIndent.Companion);
        TextIndent restore4 = ((!q10.b(obj5, bool) || (saver4 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver4.restore(obj5) : null;
        Object obj6 = list.get(4);
        Saver<PlatformParagraphStyle, Object> saver5 = Savers_androidKt.getSaver(PlatformParagraphStyle.Companion);
        PlatformParagraphStyle restore5 = ((!q10.b(obj6, bool) || (saver5 instanceof NonNullValueClassSaver)) && obj6 != null) ? saver5.restore(obj6) : null;
        Object obj7 = list.get(5);
        Saver<LineHeightStyle, Object> saver6 = getSaver(LineHeightStyle.Companion);
        LineHeightStyle restore6 = ((!q10.b(obj7, bool) || (saver6 instanceof NonNullValueClassSaver)) && obj7 != null) ? saver6.restore(obj7) : null;
        Object obj8 = list.get(6);
        Saver<LineBreak, Object> saver7 = Savers_androidKt.getSaver(LineBreak.Companion);
        LineBreak restore7 = ((!q10.b(obj8, bool) || (saver7 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver7.restore(obj8) : null;
        restore7.getClass();
        int m7399unboximpl = restore7.m7399unboximpl();
        Object obj9 = list.get(7);
        Saver<Hyphens, Object> saver8 = getSaver(Hyphens.Companion);
        Hyphens restore8 = ((!q10.b(obj9, bool) || (saver8 instanceof NonNullValueClassSaver)) && obj9 != null) ? saver8.restore(obj9) : null;
        restore8.getClass();
        int m7380unboximpl = restore8.m7380unboximpl();
        Object obj10 = list.get(8);
        Saver<TextMotion, Object> saver9 = Savers_androidKt.getSaver(TextMotion.Companion);
        if ((!q10.b(obj10, bool) || (saver9 instanceof NonNullValueClassSaver)) && obj10 != null) {
            textMotion = saver9.restore(obj10);
        }
        return new ParagraphStyle(m7488unboximpl, m7505unboximpl, m7814unboximpl, restore4, restore5, restore6, m7399unboximpl, m7380unboximpl, textMotion, (dq) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ShadowSaver$lambda$0(SaverScope saverScope, Shadow shadow) {
        return y80.a(save(Color.m4751boximpl(shadow.m5105getColor0d7_KjU()), getSaver(Color.Companion), saverScope), save(Offset.m4505boximpl(shadow.m5106getOffsetF1C5BW0()), getSaver(Offset.Companion), saverScope), save(Float.valueOf(shadow.getBlurRadius())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow ShadowSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<Color, Object> saver = getSaver(Color.Companion);
        Boolean bool = Boolean.FALSE;
        Color restore = ((!q10.b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        restore.getClass();
        long m4771unboximpl = restore.m4771unboximpl();
        Object obj3 = list.get(1);
        Saver<Offset, Object> saver2 = getSaver(Offset.Companion);
        Offset restore2 = ((!q10.b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        restore2.getClass();
        long m4526unboximpl = restore2.m4526unboximpl();
        Object obj4 = list.get(2);
        Float f = obj4 != null ? (Float) obj4 : null;
        f.getClass();
        return new Shadow(m4771unboximpl, m4526unboximpl, f.floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SpanStyleSaver$lambda$0(SaverScope saverScope, SpanStyle spanStyle) {
        Color m4751boximpl = Color.m4751boximpl(spanStyle.m7001getColor0d7_KjU());
        Color.Companion companion = Color.Companion;
        Object save = save(m4751boximpl, getSaver(companion), saverScope);
        TextUnit m7795boximpl = TextUnit.m7795boximpl(spanStyle.m7002getFontSizeXSAIIZE());
        TextUnit.Companion companion2 = TextUnit.Companion;
        return y80.a(save, save(m7795boximpl, getSaver(companion2), saverScope), save(spanStyle.getFontWeight(), getSaver(FontWeight.Companion), saverScope), save(spanStyle.m7003getFontStyle4Lr2A7w(), getSaver(FontStyle.Companion), saverScope), save(spanStyle.m7004getFontSynthesisZQGJjVo(), getSaver(FontSynthesis.Companion), saverScope), save(-1), save(spanStyle.getFontFeatureSettings()), save(TextUnit.m7795boximpl(spanStyle.m7005getLetterSpacingXSAIIZE()), getSaver(companion2), saverScope), save(spanStyle.m7000getBaselineShift5SSeXJ0(), getSaver(BaselineShift.Companion), saverScope), save(spanStyle.getTextGeometricTransform(), getSaver(TextGeometricTransform.Companion), saverScope), save(spanStyle.getLocaleList(), getSaver(LocaleList.Companion), saverScope), save(Color.m4751boximpl(spanStyle.m6999getBackground0d7_KjU()), getSaver(companion), saverScope), save(spanStyle.getTextDecoration(), getSaver(TextDecoration.Companion), saverScope), save(spanStyle.getShadow(), getSaver(Shadow.Companion), saverScope));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
          (r1v0 androidx.compose.ui.text.SpanStyle) from 0x00fe: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v0 androidx.compose.ui.text.SpanStyle) (LINE:255)
          (r1v0 androidx.compose.ui.text.SpanStyle) from 0x00f6: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v0 androidx.compose.ui.text.SpanStyle) (LINE:247)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.SpanStyle SpanStyleSaver$lambda$1(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt.SpanStyleSaver$lambda$1(java.lang.Object):androidx.compose.ui.text.SpanStyle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextAlignSaver$lambda$0(SaverScope saverScope, TextAlign textAlign) {
        return Integer.valueOf(textAlign.m7488unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextAlign TextAlignSaver$lambda$1(Object obj) {
        obj.getClass();
        return TextAlign.m7482boximpl(TextAlign.m7483constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextDecorationSaver$lambda$0(SaverScope saverScope, TextDecoration textDecoration) {
        return Integer.valueOf(textDecoration.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDecoration TextDecorationSaver$lambda$1(Object obj) {
        obj.getClass();
        return new TextDecoration(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextDirectionSaver$lambda$0(SaverScope saverScope, TextDirection textDirection) {
        return Integer.valueOf(textDirection.m7505unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDirection TextDirectionSaver$lambda$1(Object obj) {
        obj.getClass();
        return TextDirection.m7499boximpl(TextDirection.m7500constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextGeometricTransformSaver$lambda$0(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
        return y80.a(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextGeometricTransform TextGeometricTransformSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextIndentSaver$lambda$0(SaverScope saverScope, TextIndent textIndent) {
        TextUnit m7795boximpl = TextUnit.m7795boximpl(textIndent.m7519getFirstLineXSAIIZE());
        TextUnit.Companion companion = TextUnit.Companion;
        return y80.a(save(m7795boximpl, getSaver(companion), saverScope), save(TextUnit.m7795boximpl(textIndent.m7520getRestLineXSAIIZE()), getSaver(companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextIndent TextIndentSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnit.Companion companion = TextUnit.Companion;
        Saver<TextUnit, Object> saver = getSaver(companion);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = null;
        TextUnit restore = ((!q10.b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        restore.getClass();
        long m7814unboximpl = restore.m7814unboximpl();
        Object obj3 = list.get(1);
        Saver<TextUnit, Object> saver2 = getSaver(companion);
        if ((!q10.b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnit = saver2.restore(obj3);
        }
        textUnit.getClass();
        return new TextIndent(m7814unboximpl, textUnit.m7814unboximpl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextLinkStylesSaver$lambda$0(SaverScope saverScope, TextLinkStyles textLinkStyles) {
        SpanStyle style = textLinkStyles.getStyle();
        Saver<SpanStyle, Object> saver = SpanStyleSaver;
        return y80.a(save(style, saver, saverScope), save(textLinkStyles.getFocusedStyle(), saver, saverScope), save(textLinkStyles.getHoveredStyle(), saver, saverScope), save(textLinkStyles.getPressedStyle(), saver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLinkStyles TextLinkStylesSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<SpanStyle, Object> saver = SpanStyleSaver;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyle = null;
        SpanStyle restore = ((!q10.b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle restore2 = ((!q10.b(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle restore3 = ((!q10.b(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
        Object obj5 = list.get(3);
        if ((!q10.b(obj5, bool) || (saver instanceof NonNullValueClassSaver)) && obj5 != null) {
            spanStyle = saver.restore(obj5);
        }
        return new TextLinkStyles(restore, restore2, restore3, spanStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object TextRangeSaver$lambda$0(SaverScope saverScope, TextRange textRange) {
        return y80.a(save(Integer.valueOf(TextRange.m7060getStartimpl(textRange.m7064unboximpl()))), save(Integer.valueOf(TextRange.m7055getEndimpl(textRange.m7064unboximpl()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRange TextRangeSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        num.getClass();
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        num2.getClass();
        return TextRange.m7048boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextUnitSaver$lambda$0(SaverScope saverScope, TextUnit textUnit) {
        return textUnit == null ? false : TextUnit.m7802equalsimpl0(textUnit.m7814unboximpl(), TextUnit.Companion.m7816getUnspecifiedXSAIIZE()) ? Boolean.FALSE : y80.a(save(Float.valueOf(TextUnit.m7805getValueimpl(textUnit.m7814unboximpl()))), save(TextUnitType.m7830boximpl(TextUnit.m7804getTypeUIouoOA(textUnit.m7814unboximpl())), getSaver(TextUnitType.Companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextUnit TextUnitSaver$lambda$1(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (q10.b(obj, bool)) {
            return TextUnit.m7795boximpl(TextUnit.Companion.m7816getUnspecifiedXSAIIZE());
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType textUnitType = null;
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        Saver<TextUnitType, Object> saver = getSaver(TextUnitType.Companion);
        if ((!q10.b(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnitType = saver.restore(obj3);
        }
        textUnitType.getClass();
        return TextUnit.m7795boximpl(TextUnitKt.m7817TextUnitanM5pPY(floatValue, textUnitType.m7836unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextUnitTypeSaver$lambda$0(SaverScope saverScope, TextUnitType textUnitType) {
        long m7836unboximpl = textUnitType.m7836unboximpl();
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7836unboximpl, companion.m7837getEmUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m7833equalsimpl0(m7836unboximpl, companion.m7838getSpUIouoOA())) {
            return 1;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextUnitType TextUnitTypeSaver$lambda$1(Object obj) {
        return q10.b(obj, 0) ? TextUnitType.m7830boximpl(TextUnitType.Companion.m7837getEmUIouoOA()) : q10.b(obj, 1) ? TextUnitType.m7830boximpl(TextUnitType.Companion.m7838getSpUIouoOA()) : TextUnitType.m7830boximpl(TextUnitType.Companion.m7839getUnspecifiedUIouoOA());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object UrlAnnotationSaver$lambda$0(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        return save(urlAnnotation.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlAnnotation UrlAnnotationSaver$lambda$1(Object obj) {
        String str = obj != null ? (String) obj : null;
        str.getClass();
        return new UrlAnnotation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object VerbatimTtsAnnotationSaver$lambda$0(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return save(verbatimTtsAnnotation.getVerbatim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerbatimTtsAnnotation VerbatimTtsAnnotationSaver$lambda$1(Object obj) {
        String str = obj != null ? (String) obj : null;
        str.getClass();
        return new VerbatimTtsAnnotation(str);
    }

    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    public static final Saver<FontStyle, Object> getFontStyleSaver() {
        return FontStyleSaver;
    }

    public static final Saver<FontSynthesis, Object> getFontSynthesisSaver() {
        return FontSynthesisSaver;
    }

    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final Saver<TextDecoration, Object> getSaver(TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final Saver<TextLinkStyles, Object> getTextLinkStylesSaver() {
        return TextLinkStylesSaver;
    }

    public static final NonNullValueClassSaver<TextUnitType, Object> getTextUnitTypeSaver() {
        return TextUnitTypeSaver;
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t) {
        if ((q10.b(saveable, Boolean.FALSE) && !(t instanceof NonNullValueClassSaver)) || saveable == null) {
            return null;
        }
        t.restore(saveable);
        q10.G();
        throw null;
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(Original original, T t, SaverScope saverScope) {
        Object save;
        return (original == null || (save = t.save(saverScope, original)) == null) ? Boolean.FALSE : save;
    }

    public static final Saver<TextGeometricTransform, Object> getSaver(TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    public static final Saver<TextIndent, Object> getSaver(TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    public static final Saver<FontWeight, Object> getSaver(FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    public static final Saver<BaselineShift, Object> getSaver(BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    public static final Saver<TextRange, Object> getSaver(TextRange.Companion companion) {
        return TextRangeSaver;
    }

    public static final Saver<Shadow, Object> getSaver(Shadow.Companion companion) {
        return ShadowSaver;
    }

    public static final Saver<Color, Object> getSaver(Color.Companion companion) {
        return ColorSaver;
    }

    public static final Saver<TextAlign, Object> getSaver(TextAlign.Companion companion) {
        return TextAlignSaver;
    }

    public static final Saver<TextDirection, Object> getSaver(TextDirection.Companion companion) {
        return TextDirectionSaver;
    }

    public static final Saver<Hyphens, Object> getSaver(Hyphens.Companion companion) {
        return HyphensSaver;
    }

    public static final Saver<FontStyle, Object> getSaver(FontStyle.Companion companion) {
        return FontStyleSaver;
    }

    public static final <T> T save(T t) {
        return t;
    }

    public static final Saver<FontSynthesis, Object> getSaver(FontSynthesis.Companion companion) {
        return FontSynthesisSaver;
    }

    public static final Saver<TextUnit, Object> getSaver(TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    public static final Saver<TextUnitType, Object> getSaver(TextUnitType.Companion companion) {
        return TextUnitTypeSaver;
    }

    public static final Saver<Offset, Object> getSaver(Offset.Companion companion) {
        return OffsetSaver;
    }

    public static final Saver<LocaleList, Object> getSaver(LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    public static final Saver<Locale, Object> getSaver(Locale.Companion companion) {
        return LocaleSaver;
    }

    public static final Saver<LineHeightStyle, Object> getSaver(LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }

    private static final Saver<LineHeightStyle.Alignment, Object> getSaver(LineHeightStyle.Alignment.Companion companion) {
        return LineHeightStyleAlignmentSaver;
    }

    private static final Saver<LineHeightStyle.Trim, Object> getSaver(LineHeightStyle.Trim.Companion companion) {
        return LineHeightStyleTrimSaver;
    }

    private static final Saver<LineHeightStyle.Mode, Object> getSaver(LineHeightStyle.Mode.Companion companion) {
        return LineHeightStyleModeSaver;
    }

    public static final <Result> Result restore(Object obj) {
        if (obj == null) {
            return null;
        }
        q10.G();
        throw null;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }
}
