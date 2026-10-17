package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.c21;
import defpackage.dj;
import defpackage.dq;
import defpackage.er;
import defpackage.f10;
import defpackage.j50;
import defpackage.ky;
import defpackage.ma0;
import defpackage.p01;
import defpackage.q10;
import defpackage.ut;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Annotation {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = (Range) list.get(i);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List F0 = arrayList2 != null ? yi.F0(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return p01.i(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : null;
        if (F0 == null || F0.isEmpty()) {
            return;
        }
        int end = ((Range) yi.p0(F0)).getEnd();
        ma0 ma0Var = f10.a;
        ma0 ma0Var2 = new ma0(1);
        ma0Var2.e(end);
        int size2 = F0.size();
        for (int i2 = 1; i2 < size2; i2++) {
            Range range2 = (Range) F0.get(i2);
            while (true) {
                if (ma0Var2.b == 0) {
                    break;
                }
                int c = ma0Var2.c();
                if (range2.getStart() >= c) {
                    ma0Var2.g(ma0Var2.b - 1);
                } else if (range2.getEnd() > c) {
                    InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + c);
                }
            }
            ma0Var2.e(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return q10.b(this.text, annotatedString.text) && q10.b(this.annotations, annotatedString.annotations);
    }

    public final AnnotatedString flatMapAnnotations(ky kyVar) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text(kyVar);
        return builder.toAnnotatedString();
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? ut.d : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? ut.d : list;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> getStringAnnotations(String str, int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            if ((range.getItem() instanceof StringAnnotation) && q10.b(str, range.getTag()) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @er
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final boolean hasEqualAnnotations(AnnotatedString annotatedString) {
        return q10.b(this.annotations, annotatedString.annotations);
    }

    public final boolean hasLinkAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Annotation> range = list.get(i3);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(String str, int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Annotation> range = list.get(i3);
                if ((range.getItem() instanceof StringAnnotation) && q10.b(str, range.getTag()) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List<Range<? extends Annotation>> list = this.annotations;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final AnnotatedString mapAnnotations(ky kyVar) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text(kyVar);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i, int i2) {
        List filterRanges;
        if (!(i <= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.text.length()) {
            return this;
        }
        String substring = this.text.substring(i, i2);
        filterRanges = AnnotatedStringKt.filterRanges(this.annotations, i, i2);
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) filterRanges, substring);
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m6895subSequence5zctL8(long j) {
        return subSequence(TextRange.m7058getMinimpl(j), TextRange.m7057getMaximpl(j));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class BulletScope {
            public static final int $stable = 8;
            private final Builder builder;
            private final List<xe0> bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }

            public final Builder getBuilder$ui_text() {
                return this.builder;
            }

            public final List<xe0> getBulletListSettingStack$ui_text() {
                return this.bulletListSettingStack;
            }
        }

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        /* renamed from: withBulletList-o2QH7mI$default, reason: not valid java name */
        public static /* synthetic */ Object m6896withBulletListo2QH7mI$default(Builder builder, long j, Bullet bullet, ky kyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = Bullet.Companion.m6904getDefaultIndentationXSAIIZE();
            }
            if ((i & 2) != 0) {
                bullet = Bullet.Companion.getDefault();
            }
            return builder.m6898withBulletListo2QH7mI(j, bullet, kyVar);
        }

        public static /* synthetic */ Object withBulletListItem$default(Builder builder, BulletScope bulletScope, Bullet bullet, ky kyVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bullet = null;
            }
            return builder.withBulletListItem(bulletScope, bullet, kyVar);
        }

        public final void addBullet(Bullet bullet, int i, int i2) {
            this.annotations.add(new MutableRange<>(bullet, i, i2, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: addBullet-r9BaKPg, reason: not valid java name */
        public final void m6897addBulletr9BaKPg(Bullet bullet, long j, int i, int i2) {
            Object[] objArr = 0 == true ? 1 : 0;
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(j, j, null), (PlatformParagraphStyle) objArr, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (dq) null), i, i2, null, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(bullet, i, i2, 0 == true ? 1 : 0, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int i, int i2) {
            this.annotations.add(new MutableRange<>(url, i, i2, null, 8, null));
        }

        public final void addStringAnnotation(String str, String str2, int i, int i2) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m7008boximpl(StringAnnotation.m7009constructorimpl(str2)), i, i2, str));
        }

        public final void addStyle(SpanStyle spanStyle, int i, int i2) {
            this.annotations.add(new MutableRange<>(spanStyle, i, i2, null, 8, null));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i, int i2) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i, i2, null, 8, null));
        }

        @er
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i, int i2) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i, i2, null, 8, null));
        }

        public final void append(AnnotatedString annotatedString, int i, int i2) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i, i2);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(annotatedString, i, i2, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Range range = (Range) localAnnotations$default.get(i3);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void flatMapAnnotations$ui_text(ky kyVar) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = (List) kyVar.invoke(MutableRange.toRange$default(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(MutableRange.Companion.fromRange((Range) list2.get(i2)));
                }
                dj.d0(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text(ky kyVar) {
            int size = this.annotations.size();
            for (int i = 0; i < size; i++) {
                this.annotations.set(i, MutableRange.Companion.fromRange((Range) kyVar.invoke(MutableRange.toRange$default(this.annotations.get(i), 0, 1, null))));
            }
        }

        public final void pop(int i) {
            if (!(i < this.styleStack.size())) {
                InlineClassHelperKt.throwIllegalStateException(i + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= i) {
                pop();
            }
        }

        public final int pushBullet(Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation linkAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(linkAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String str, String str2) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m7008boximpl(StringAnnotation.m7009constructorimpl(str2)), this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @er
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String sb = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            return new AnnotatedString(sb, arrayList);
        }

        /* renamed from: withBulletList-o2QH7mI, reason: not valid java name */
        public final <R> R m6898withBulletListo2QH7mI(long j, Bullet bullet, ky kyVar) {
            long j2;
            long j3;
            xe0 xe0Var = (xe0) yi.w0(this.bulletScope.getBulletListSettingStack$ui_text());
            if (xe0Var != null) {
                long m7814unboximpl = ((TextUnit) xe0Var.d).m7814unboximpl();
                if (!TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(m7814unboximpl), TextUnit.m7804getTypeUIouoOA(j))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m7812toStringimpl(m7814unboximpl)) + " and previous is " + ((Object) TextUnit.m7812toStringimpl(j)));
                }
                long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
                TextUnitType.Companion companion = TextUnitType.Companion;
                if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
                    j3 = TextUnitKt.getSp(TextUnit.m7805getValueimpl(m7814unboximpl) + TextUnit.m7805getValueimpl(j));
                } else if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
                    j3 = TextUnitKt.getEm(TextUnit.m7805getValueimpl(m7814unboximpl) + TextUnit.m7805getValueimpl(j));
                } else {
                    j3 = j;
                }
                j2 = j3;
            } else {
                j2 = j;
            }
            int pushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(j2, j2, null), null, null, 0, 0, null, 503, (dq) null));
            this.bulletScope.getBulletListSettingStack$ui_text().add(new xe0(TextUnit.m7795boximpl(j2), bullet));
            try {
                return (R) kyVar.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text().remove(y80.v(this.bulletScope.getBulletListSettingStack$ui_text()));
                }
                pop(pushStyle);
            }
        }

        public final <R> R withBulletListItem(BulletScope bulletScope, Bullet bullet, ky kyVar) {
            Bullet bullet2;
            xe0 xe0Var = (xe0) yi.w0(bulletScope.getBulletListSettingStack$ui_text());
            long m7814unboximpl = xe0Var != null ? ((TextUnit) xe0Var.d).m7814unboximpl() : Bullet.Companion.m6904getDefaultIndentationXSAIIZE();
            if (bullet != null) {
                bullet2 = bullet;
            } else if (xe0Var == null || (bullet2 = (Bullet) xe0Var.e) == null) {
                bullet2 = Bullet.Companion.getDefault();
            }
            int pushStyle = bulletScope.getBuilder$ui_text().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(m7814unboximpl, m7814unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (dq) null));
            int pushBullet = bulletScope.getBuilder$ui_text().pushBullet(bullet2);
            try {
                return (R) kyVar.invoke(bulletScope.getBuilder$ui_text());
            } finally {
                bulletScope.getBuilder$ui_text().pop(pushBullet);
                bulletScope.getBuilder$ui_text().pop(pushStyle);
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class MutableRange<T> {
            public static final Companion Companion = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, dq dqVar) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i, int i2, String str, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i3 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i3 & 4) != 0) {
                    i2 = mutableRange.end;
                }
                if ((i3 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i, i2, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T t, int i, int i2, String str) {
                return new MutableRange<>(t, i, i2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return q10.b(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && q10.b(this.tag, mutableRange.tag);
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t = this.item;
                return this.tag.hashCode() + j50.b(this.end, j50.b(this.start, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public final <R> Range<R> toRange(ky kyVar, int i) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(kyVar.invoke(this.item), this.start, i, this.tag);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.item);
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                sb.append(", tag=");
                return c21.a(sb, this.tag, ')');
            }

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            public static final class Companion {
                public /* synthetic */ Companion(dq dqVar) {
                    this();
                }

                public final <T> MutableRange<T> fromRange(Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                private Companion() {
                }
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, ky kyVar, int i, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(kyVar, i);
            }

            public MutableRange(T t, int i, int i2, String str) {
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public final Range<T> toRange(int i) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, i, this.tag);
            }
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int i, int i2) {
            this.annotations.add(new MutableRange<>(clickable, i, i2, null, 8, null));
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i, int i2) {
            this.annotations.add(new MutableRange<>(paragraphStyle, i, i2, null, 8, null));
        }

        public Builder() {
            this(0, 1, null);
        }

        public /* synthetic */ Builder(int i, int i2, dq dqVar) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        public final void append(String str) {
            this.text.append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
                return this;
            }
            this.text.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i, i2);
                return this;
            }
            this.text.append(charSequence, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(char c) {
            this.text.append(c);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<? extends Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
            if (annotations$ui_text != null) {
                int size = annotations$ui_text.size();
                for (int i = 0; i < size; i++) {
                    Range<? extends Annotation> range = annotations$ui_text.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i2, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T t, int i, int i2, String str) {
            return new Range<>(t, i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return q10.b(this.item, range.item) && this.start == range.start && this.end == range.end && q10.b(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t = this.item;
            return this.tag.hashCode() + j50.b(this.end, j50.b(this.start, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.item);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", tag=");
            return c21.a(sb, this.tag, ')');
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public final List<Range<String>> getStringAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Annotation> range = list.get(i3);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return ut.d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, dq dqVar) {
        this(str, r6 != 0 ? r0 : list, (i & 4) != 0 ? r0 : list2);
        int i2 = i & 2;
        ut utVar = ut.d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) r2, str);
        List constructAnnotationsFromSpansAndParagraphs;
        constructAnnotationsFromSpansAndParagraphs = AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i, dq dqVar) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i & 2) != 0 ? ut.d : list));
    }

    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
