package androidx.compose.animation.core;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m179constructorimpl(-1);
    private static final int FastForward = m179constructorimpl(1);
    private final int value;

    private /* synthetic */ StartOffsetType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m178boximpl(int i) {
        return new StartOffsetType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m180equalsimpl(int i, Object obj) {
        return (obj instanceof StartOffsetType) && i == ((StartOffsetType) obj).m184unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m181equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m182hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m183toStringimpl(int i) {
        return r6.b("StartOffsetType(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m180equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m182hashCodeimpl(this.value);
    }

    public String toString() {
        return m183toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m184unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m185getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m186getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m179constructorimpl(int i) {
        return i;
    }
}
