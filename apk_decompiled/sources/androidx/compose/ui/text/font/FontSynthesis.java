package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m7181constructorimpl(0);
    private static final int Weight = m7181constructorimpl(1);
    private static final int Style = m7181constructorimpl(2);
    private static final int All = m7181constructorimpl(65535);

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m7180boximpl(int i) {
        return new FontSynthesis(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7182equalsimpl(int i, Object obj) {
        return (obj instanceof FontSynthesis) && i == ((FontSynthesis) obj).m7188unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7183equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7184hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isStyleOn-impl$ui_text, reason: not valid java name */
    public static final boolean m7185isStyleOnimpl$ui_text(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text, reason: not valid java name */
    public static final boolean m7186isWeightOnimpl$ui_text(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7187toStringimpl(int i) {
        return m7183equalsimpl0(i, None) ? "None" : m7183equalsimpl0(i, Weight) ? "Weight" : m7183equalsimpl0(i, Style) ? "Style" : m7183equalsimpl0(i, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7182equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7184hashCodeimpl(this.value);
    }

    public String toString() {
        return m7187toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7188unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m7189getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m7190getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m7191getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m7192getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        /* renamed from: valueOf-9CiegCU, reason: not valid java name */
        public final int m7193valueOf9CiegCU(int i) {
            boolean z = true;
            if (i != 0 && i != 1 && i != 2 && i != 65535) {
                z = false;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by FontSynthesis.");
            }
            return FontSynthesis.m7181constructorimpl(i);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7181constructorimpl(int i) {
        return i;
    }
}
