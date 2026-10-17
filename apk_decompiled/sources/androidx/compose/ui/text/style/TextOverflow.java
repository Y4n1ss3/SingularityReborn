package androidx.compose.ui.text.style;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m7535constructorimpl(1);
    private static final int Ellipsis = m7535constructorimpl(2);
    private static final int Visible = m7535constructorimpl(3);
    private static final int StartEllipsis = m7535constructorimpl(4);
    private static final int MiddleEllipsis = m7535constructorimpl(5);

    private /* synthetic */ TextOverflow(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m7534boximpl(int i) {
        return new TextOverflow(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7536equalsimpl(int i, Object obj) {
        return (obj instanceof TextOverflow) && i == ((TextOverflow) obj).m7540unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7537equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7538hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7539toStringimpl(int i) {
        return m7537equalsimpl0(i, Clip) ? "Clip" : m7537equalsimpl0(i, Ellipsis) ? "Ellipsis" : m7537equalsimpl0(i, MiddleEllipsis) ? "MiddleEllipsis" : m7537equalsimpl0(i, Visible) ? "Visible" : m7537equalsimpl0(i, StartEllipsis) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7536equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7538hashCodeimpl(this.value);
    }

    public String toString() {
        return m7539toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7540unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m7546getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m7547getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m7548getMiddleEllipsisgIe3tQ8() {
            return TextOverflow.MiddleEllipsis;
        }

        /* renamed from: getStartEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m7549getStartEllipsisgIe3tQ8() {
            return TextOverflow.StartEllipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m7550getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        private Companion() {
        }

        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m7541getClipgIe3tQ8$annotations() {
        }

        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m7542getEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m7543getMiddleEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getStartEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m7544getStartEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m7545getVisiblegIe3tQ8$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7535constructorimpl(int i) {
        return i;
    }
}
