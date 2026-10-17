package androidx.compose.ui.input.indirect;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {
    public static final Companion Companion = new Companion(null);
    private static final int None = m5584constructorimpl(0);
    private static final int X = m5584constructorimpl(1);
    private static final int Y = m5584constructorimpl(2);
    private final int value;

    private /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis m5583boximpl(int i) {
        return new IndirectPointerEventPrimaryDirectionalMotionAxis(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5585equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventPrimaryDirectionalMotionAxis) && i == ((IndirectPointerEventPrimaryDirectionalMotionAxis) obj).m5589unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5586equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5587hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5588toStringimpl(int i) {
        return r6.b("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m5585equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5587hashCodeimpl(this.value);
    }

    public String toString() {
        return m5588toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5589unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getNone-nZO2Niw, reason: not valid java name */
        public final int m5590getNonenZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.None;
        }

        /* renamed from: getX-nZO2Niw, reason: not valid java name */
        public final int m5591getXnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.X;
        }

        /* renamed from: getY-nZO2Niw, reason: not valid java name */
        public final int m5592getYnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.Y;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5584constructorimpl(int i) {
        return i;
    }
}
