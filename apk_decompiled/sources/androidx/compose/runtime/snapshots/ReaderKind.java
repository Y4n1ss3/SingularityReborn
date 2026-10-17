package androidx.compose.runtime.snapshots;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    private /* synthetic */ ReaderKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m4153boximpl(int i) {
        return new ReaderKind(i);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m4155constructorimpl$default(int i, int i2, dq dqVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m4154constructorimpl(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4156equalsimpl(int i, Object obj) {
        return (obj instanceof ReaderKind) && i == ((ReaderKind) obj).m4162unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4157equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4158hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m4159isReadInh_f27i8(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4160toStringimpl(int i) {
        return r6.b("ReaderKind(mask=", i, ')');
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m4161withReadIn3QSx2Dw(int i, int i2) {
        return m4154constructorimpl(i | i2);
    }

    public boolean equals(Object obj) {
        return m4156equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m4158hashCodeimpl(this.mask);
    }

    public String toString() {
        return m4160toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4162unboximpl() {
        return this.mask;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m4163getComposition6f8NoZ8() {
            return ReaderKind.m4154constructorimpl(1);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m4164getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m4154constructorimpl(2);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4154constructorimpl(int i) {
        return i;
    }
}
