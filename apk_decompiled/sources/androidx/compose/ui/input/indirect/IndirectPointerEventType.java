package androidx.compose.ui.input.indirect;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IndirectPointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m5594constructorimpl(0);
    private static final int Press = m5594constructorimpl(1);
    private static final int Release = m5594constructorimpl(2);
    private static final int Move = m5594constructorimpl(3);

    private /* synthetic */ IndirectPointerEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventType m5593boximpl(int i) {
        return new IndirectPointerEventType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5595equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventType) && i == ((IndirectPointerEventType) obj).m5599unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5596equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5597hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5598toStringimpl(int i) {
        return m5596equalsimpl0(i, Press) ? "Press" : m5596equalsimpl0(i, Release) ? "Release" : m5596equalsimpl0(i, Move) ? "Move" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5595equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5597hashCodeimpl(this.value);
    }

    public String toString() {
        return m5598toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5599unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getMove-4ZHQPSE, reason: not valid java name */
        public final int m5600getMove4ZHQPSE() {
            return IndirectPointerEventType.Move;
        }

        /* renamed from: getPress-4ZHQPSE, reason: not valid java name */
        public final int m5601getPress4ZHQPSE() {
            return IndirectPointerEventType.Press;
        }

        /* renamed from: getRelease-4ZHQPSE, reason: not valid java name */
        public final int m5602getRelease4ZHQPSE() {
            return IndirectPointerEventType.Release;
        }

        /* renamed from: getUnknown-4ZHQPSE, reason: not valid java name */
        public final int m5603getUnknown4ZHQPSE() {
            return IndirectPointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5594constructorimpl(int i) {
        return i;
    }
}
