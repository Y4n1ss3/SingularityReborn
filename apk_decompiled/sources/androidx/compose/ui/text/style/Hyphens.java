package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m7375constructorimpl(1);
    private static final int Auto = m7375constructorimpl(2);
    private static final int Unspecified = m7375constructorimpl(0);

    private /* synthetic */ Hyphens(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m7374boximpl(int i) {
        return new Hyphens(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7376equalsimpl(int i, Object obj) {
        return (obj instanceof Hyphens) && i == ((Hyphens) obj).m7380unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7377equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7378hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7379toStringimpl(int i) {
        return m7377equalsimpl0(i, None) ? "Hyphens.None" : m7377equalsimpl0(i, Auto) ? "Hyphens.Auto" : m7377equalsimpl0(i, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7376equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7378hashCodeimpl(this.value);
    }

    public String toString() {
        return m7379toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7380unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m7381getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m7382getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m7383getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        /* renamed from: valueOf-kPa1_AA, reason: not valid java name */
        public final int m7384valueOfkPa1_AA(int i) {
            boolean z = false;
            if (i >= 0 && i < 3) {
                z = true;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by Hyphens.");
            }
            return Hyphens.m7375constructorimpl(i);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7375constructorimpl(int i) {
        return i;
    }
}
