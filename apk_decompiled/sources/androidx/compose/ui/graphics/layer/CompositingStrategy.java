package androidx.compose.ui.graphics.layer;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m5409constructorimpl(0);
    private static final int Offscreen = m5409constructorimpl(1);
    private static final int ModulateAlpha = m5409constructorimpl(2);

    private /* synthetic */ CompositingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m5408boximpl(int i) {
        return new CompositingStrategy(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5410equalsimpl(int i, Object obj) {
        return (obj instanceof CompositingStrategy) && i == ((CompositingStrategy) obj).m5414unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5411equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5412hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5413toStringimpl(int i) {
        return r6.b("CompositingStrategy(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m5410equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5412hashCodeimpl(this.value);
    }

    public String toString() {
        return m5413toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5414unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m5415getAutoke2Ky5w() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m5416getModulateAlphake2Ky5w() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m5417getOffscreenke2Ky5w() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5409constructorimpl(int i) {
        return i;
    }
}
