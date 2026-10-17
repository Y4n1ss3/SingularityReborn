package androidx.compose.ui.text;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EmojiSupportMatch {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m6908constructorimpl(0);
    private static final int None = m6908constructorimpl(1);
    private static final int All = m6908constructorimpl(2);

    private /* synthetic */ EmojiSupportMatch(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m6907boximpl(int i) {
        return new EmojiSupportMatch(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6909equalsimpl(int i, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i == ((EmojiSupportMatch) obj).m6913unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6910equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6911hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6912toStringimpl(int i) {
        return i == Default ? "EmojiSupportMatch.Default" : i == None ? "EmojiSupportMatch.None" : i == All ? "EmojiSupportMatch.All" : r6.b("Invalid(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6909equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6911hashCodeimpl(this.value);
    }

    public String toString() {
        return m6912toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6913unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m6914getAll_3YsG6Y() {
            return EmojiSupportMatch.All;
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m6915getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m6916getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6908constructorimpl(int i) {
        return i;
    }
}
