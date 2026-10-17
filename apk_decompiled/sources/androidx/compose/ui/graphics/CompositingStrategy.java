package androidx.compose.ui.graphics;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m4844constructorimpl(0);
    private static final int Offscreen = m4844constructorimpl(1);
    private static final int ModulateAlpha = m4844constructorimpl(2);

    private /* synthetic */ CompositingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m4843boximpl(int i) {
        return new CompositingStrategy(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4845equalsimpl(int i, Object obj) {
        return (obj instanceof CompositingStrategy) && i == ((CompositingStrategy) obj).m4849unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4846equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4847hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4848toStringimpl(int i) {
        return r6.b("CompositingStrategy(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m4845equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4847hashCodeimpl(this.value);
    }

    public String toString() {
        return m4848toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4849unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAuto--NrFUSI, reason: not valid java name */
        public final int m4850getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha--NrFUSI, reason: not valid java name */
        public final int m4851getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen--NrFUSI, reason: not valid java name */
        public final int m4852getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4844constructorimpl(int i) {
        return i;
    }
}
