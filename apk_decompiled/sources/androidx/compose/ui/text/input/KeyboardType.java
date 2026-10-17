package androidx.compose.ui.text.input;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m7279constructorimpl(0);
    private static final int Text = m7279constructorimpl(1);
    private static final int Ascii = m7279constructorimpl(2);
    private static final int Number = m7279constructorimpl(3);
    private static final int Phone = m7279constructorimpl(4);
    private static final int Uri = m7279constructorimpl(5);
    private static final int Email = m7279constructorimpl(6);
    private static final int Password = m7279constructorimpl(7);
    private static final int NumberPassword = m7279constructorimpl(8);
    private static final int Decimal = m7279constructorimpl(9);

    private /* synthetic */ KeyboardType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m7278boximpl(int i) {
        return new KeyboardType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7280equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardType) && i == ((KeyboardType) obj).m7284unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7281equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7282hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7283toStringimpl(int i) {
        return m7281equalsimpl0(i, Unspecified) ? "Unspecified" : m7281equalsimpl0(i, Text) ? "Text" : m7281equalsimpl0(i, Ascii) ? "Ascii" : m7281equalsimpl0(i, Number) ? "Number" : m7281equalsimpl0(i, Phone) ? "Phone" : m7281equalsimpl0(i, Uri) ? "Uri" : m7281equalsimpl0(i, Email) ? "Email" : m7281equalsimpl0(i, Password) ? "Password" : m7281equalsimpl0(i, NumberPassword) ? "NumberPassword" : m7281equalsimpl0(i, Decimal) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7280equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7282hashCodeimpl(this.value);
    }

    public String toString() {
        return m7283toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7284unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m7295getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m7296getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m7297getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m7298getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m7299getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m7300getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m7301getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m7302getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m7303getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m7304getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        private Companion() {
        }

        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7285getAsciiPjHm6EE$annotations() {
        }

        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7286getDecimalPjHm6EE$annotations() {
        }

        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7287getEmailPjHm6EE$annotations() {
        }

        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7288getNumberPjHm6EE$annotations() {
        }

        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7289getNumberPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7290getPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7291getPhonePjHm6EE$annotations() {
        }

        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7292getTextPjHm6EE$annotations() {
        }

        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7293getUnspecifiedPjHm6EE$annotations() {
        }

        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7294getUriPjHm6EE$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7279constructorimpl(int i) {
        return i;
    }
}
