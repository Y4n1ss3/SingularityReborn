package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArcMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ArcAbove = m143constructorimpl(5);
    private static final int ArcBelow = m143constructorimpl(4);
    private static final int ArcLinear = m143constructorimpl(0);

    private /* synthetic */ ArcMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArcMode m142boximpl(int i) {
        return new ArcMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m144equalsimpl(int i, Object obj) {
        return (obj instanceof ArcMode) && i == ((ArcMode) obj).m148unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m145equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m146hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m147toStringimpl(int i) {
        return r6.b("ArcMode(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m144equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m146hashCodeimpl(this.value);
    }

    public String toString() {
        return m147toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m148unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m149getArcAbove9TMq4() {
            return ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m150getArcBelow9TMq4() {
            return ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m151getArcLinear9TMq4() {
            return ArcMode.ArcLinear;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m143constructorimpl(int i) {
        return i;
    }
}
