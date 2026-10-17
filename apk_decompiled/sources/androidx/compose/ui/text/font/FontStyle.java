package androidx.compose.ui.text.font;

import defpackage.dq;
import defpackage.er;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m7170constructorimpl(0);
    private static final int Italic = m7170constructorimpl(1);

    @er
    private /* synthetic */ FontStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m7169boximpl(int i) {
        return new FontStyle(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7171equalsimpl(int i, Object obj) {
        return (obj instanceof FontStyle) && i == ((FontStyle) obj).m7175unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7172equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7173hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7174toStringimpl(int i) {
        return m7172equalsimpl0(i, Normal) ? "Normal" : m7172equalsimpl0(i, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7171equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7173hashCodeimpl(this.value);
    }

    public String toString() {
        return m7174toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7175unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m7178getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m7179getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return y80.E(FontStyle.m7169boximpl(m7179getNormal_LCdwA()), FontStyle.m7169boximpl(m7178getItalic_LCdwA()));
        }

        private Companion() {
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m7176getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m7177getNormal_LCdwA$annotations() {
        }
    }

    @er
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7170constructorimpl(int i) {
        return i;
    }
}
