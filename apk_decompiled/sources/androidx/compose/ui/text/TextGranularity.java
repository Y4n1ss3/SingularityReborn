package androidx.compose.ui.text;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextGranularity {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Character = m7016constructorimpl(0);
    private static final int Word = m7016constructorimpl(1);

    private /* synthetic */ TextGranularity(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextGranularity m7015boximpl(int i) {
        return new TextGranularity(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7017equalsimpl(int i, Object obj) {
        return (obj instanceof TextGranularity) && i == ((TextGranularity) obj).m7021unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7018equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7019hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7020toStringimpl(int i) {
        return r6.b("TextGranularity(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m7017equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7019hashCodeimpl(this.value);
    }

    public String toString() {
        return m7020toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7021unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m7022getCharacterDRrd7Zo() {
            return TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m7023getWordDRrd7Zo() {
            return TextGranularity.Word;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7016constructorimpl(int i) {
        return i;
    }
}
