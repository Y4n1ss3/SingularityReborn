package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m7500constructorimpl(1);
    private static final int Rtl = m7500constructorimpl(2);
    private static final int Content = m7500constructorimpl(3);
    private static final int ContentOrLtr = m7500constructorimpl(4);
    private static final int ContentOrRtl = m7500constructorimpl(5);
    private static final int Unspecified = m7500constructorimpl(0);

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m7499boximpl(int i) {
        return new TextDirection(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7501equalsimpl(int i, Object obj) {
        return (obj instanceof TextDirection) && i == ((TextDirection) obj).m7505unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7502equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7503hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7504toStringimpl(int i) {
        return m7502equalsimpl0(i, Ltr) ? "Ltr" : m7502equalsimpl0(i, Rtl) ? "Rtl" : m7502equalsimpl0(i, Content) ? "Content" : m7502equalsimpl0(i, ContentOrLtr) ? "ContentOrLtr" : m7502equalsimpl0(i, ContentOrRtl) ? "ContentOrRtl" : m7502equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7501equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7503hashCodeimpl(this.value);
    }

    public String toString() {
        return m7504toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7505unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m7506getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m7507getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m7508getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m7509getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m7510getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m7511getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        /* renamed from: valueOf-E8nx0Ws, reason: not valid java name */
        public final int m7512valueOfE8nx0Ws(int i) {
            boolean z = false;
            if (i >= 0 && i < 6) {
                z = true;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by TextDirection.");
            }
            return TextDirection.m7500constructorimpl(i);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7500constructorimpl(int i) {
        return i;
    }
}
