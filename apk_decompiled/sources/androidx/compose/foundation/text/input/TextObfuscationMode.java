package androidx.compose.foundation.text.input;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Visible = m1255constructorimpl(0);
    private static final int RevealLastTyped = m1255constructorimpl(1);
    private static final int Hidden = m1255constructorimpl(2);

    private /* synthetic */ TextObfuscationMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m1254boximpl(int i) {
        return new TextObfuscationMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1256equalsimpl(int i, Object obj) {
        return (obj instanceof TextObfuscationMode) && i == ((TextObfuscationMode) obj).m1260unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1257equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1258hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1259toStringimpl(int i) {
        return r6.b("TextObfuscationMode(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m1256equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1258hashCodeimpl(this.value);
    }

    public String toString() {
        return m1259toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1260unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m1261getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m1262getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m1263getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1255constructorimpl(int i) {
        return i;
    }
}
