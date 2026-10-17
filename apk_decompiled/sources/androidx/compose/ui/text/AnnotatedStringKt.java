package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.d1;
import defpackage.er;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.p6;
import defpackage.qb;
import defpackage.ut;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, y80.D(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? ut.d : y80.D(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(ky kyVar) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        kyVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new p6(1, localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String capitalize$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return i == 0 ? StringKt.capitalize(str.substring(i, i2), localeList) : str.substring(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new p6(0, localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String decapitalize$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return i == 0 ? StringKt.decapitalize(str.substring(i, i2), localeList) : str.substring(i, i2);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (!(i <= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends T> range = list.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i, range.getStart()) - i, Math.min(i2, range.getEnd()) - i, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2, ky kyVar) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text;
        if (i == i2 || (annotations$ui_text = annotatedString.getAnnotations$ui_text()) == null) {
            return null;
        }
        int i3 = 0;
        if (i != 0 || i2 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text.size());
            int size = annotations$ui_text.size();
            while (i3 < size) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i3);
                if ((kyVar != null ? ((Boolean) kyVar.invoke(range.getItem())).booleanValue() : true) && intersect(i, i2, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range(range.getItem(), y80.h(range.getStart(), i, i2) - i, y80.h(range.getEnd(), i, i2) - i, range.getTag()));
                }
                i3++;
            }
            return arrayList;
        }
        if (kyVar == null) {
            return annotations$ui_text;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text.size());
        int size2 = annotations$ui_text.size();
        while (i3 < size2) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text.get(i3);
            if (((Boolean) kyVar.invoke(range2.getItem())).booleanValue()) {
                arrayList2.add(range2);
            }
            i3++;
        }
        return arrayList2;
    }

    public static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i, int i2, ky kyVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            kyVar = null;
        }
        return getLocalAnnotations(annotatedString, i, i2, kyVar);
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text;
        if (i == i2 || (paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text.size());
        int size = paragraphStylesOrNull$ui_text.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i) {
                    start = i;
                }
                if (start > i2) {
                    start = i2;
                }
                int i4 = start - i;
                int end = range.getEnd();
                if (end < i) {
                    end = i;
                }
                if (end > i2) {
                    end = i2;
                }
                arrayList.add(new AnnotatedString.Range(item, i4, end - i));
            }
        }
        return arrayList;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, my myVar) {
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i);
            arrayList.add(myVar.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text();
        List F0 = paragraphStylesOrNull$ui_text != null ? yi.F0(paragraphStylesOrNull$ui_text, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return p01.i(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : ut.d;
        ArrayList arrayList = new ArrayList();
        qb qbVar = new qb();
        int size = F0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) F0.get(i2);
            AnnotatedString.Range copy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (i < copy$default.getStart() && !qbVar.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) qbVar.last();
                if (copy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), i, copy$default.getStart()));
                    i = copy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), i, range2.getEnd()));
                    i = range2.getEnd();
                    while (!qbVar.isEmpty() && i == ((AnnotatedString.Range) qbVar.last()).getEnd()) {
                        qbVar.removeLast();
                    }
                }
            }
            if (i < copy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i, copy$default.getStart()));
                i = copy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) qbVar.e();
            if (range3 == null) {
                qbVar.addLast(new AnnotatedString.Range(copy$default.getItem(), copy$default.getStart(), copy$default.getEnd()));
            } else if (range3.getStart() == copy$default.getStart() && range3.getEnd() == copy$default.getEnd()) {
                qbVar.removeLast();
                qbVar.addLast(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) copy$default.getItem()), copy$default.getStart(), copy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                qbVar.removeLast();
                qbVar.addLast(new AnnotatedString.Range(copy$default.getItem(), copy$default.getStart(), copy$default.getEnd()));
            } else {
                if (range3.getEnd() < copy$default.getEnd()) {
                    throw new IllegalArgumentException();
                }
                qbVar.addLast(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) copy$default.getItem()), copy$default.getStart(), copy$default.getEnd()));
            }
        }
        while (i <= annotatedString.getText().length() && !qbVar.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) qbVar.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), i, range4.getEnd()));
            i = range4.getEnd();
            while (!qbVar.isEmpty() && i == ((AnnotatedString.Range) qbVar.last()).getEnd()) {
                qbVar.removeLast();
            }
        }
        if (i < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String substring = i != i2 ? annotatedString.getText().substring(i, i2) : "";
        List localAnnotations = getLocalAnnotations(annotatedString, i, i2, new d1(21));
        if (localAnnotations == null) {
            localAnnotations = ut.d;
        }
        return new AnnotatedString(substring, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) localAnnotations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean substringWithoutParagraphStyles$lambda$0(AnnotatedString.Annotation annotation) {
        return !(annotation instanceof ParagraphStyle);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new p6(3, localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLowerCase$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return StringKt.toLowerCase(str.substring(i, i2), localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new p6(2, localeList));
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toUpperCase$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return StringKt.toUpperCase(str.substring(i, i2), localeList);
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, ky kyVar) {
        int pushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return (R) kyVar.invoke(builder);
        } finally {
            builder.pop(pushStringAnnotation);
        }
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, ky kyVar) {
        int pushLink = builder.pushLink(linkAnnotation);
        try {
            return (R) kyVar.invoke(builder);
        } finally {
            builder.pop(pushLink);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, ky kyVar) {
        int pushStyle = builder.pushStyle(spanStyle);
        try {
            return (R) kyVar.invoke(builder);
        } finally {
            builder.pop(pushStyle);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, ky kyVar) {
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) kyVar.invoke(builder);
        } finally {
            builder.pop(pushTtsAnnotation);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, ky kyVar) {
        int pushStyle = builder.pushStyle(paragraphStyle);
        try {
            return (R) kyVar.invoke(builder);
        } finally {
            builder.pop(pushStyle);
        }
    }

    @er
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, ky kyVar) {
        int pushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return (R) kyVar.invoke(builder);
        } finally {
            builder.pop(pushUrlAnnotation);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, ut.d, y80.D(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }
}
