package androidx.compose.foundation.text.input;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextHighlightType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int HandwritingSelectPreview = m1246constructorimpl(0);
    private static final int HandwritingDeletePreview = m1246constructorimpl(1);

    private /* synthetic */ TextHighlightType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextHighlightType m1245boximpl(int i) {
        return new TextHighlightType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1247equalsimpl(int i, Object obj) {
        return (obj instanceof TextHighlightType) && i == ((TextHighlightType) obj).m1251unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1248equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1249hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1250toStringimpl(int i) {
        return r6.b("TextHighlightType(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m1247equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1249hashCodeimpl(this.value);
    }

    public String toString() {
        return m1250toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1251unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m1252getHandwritingDeletePreviewsxJuwY() {
            return TextHighlightType.HandwritingDeletePreview;
        }

        /* renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m1253getHandwritingSelectPreviewsxJuwY() {
            return TextHighlightType.HandwritingSelectPreview;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1246constructorimpl(int i) {
        return i;
    }
}
