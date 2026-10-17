package androidx.compose.runtime.internal;

import defpackage.dq;
import defpackage.fc;
import defpackage.iy;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AtomicAwaitersCount {
    private static final int COUNT_BITS = 27;
    public static final Companion Companion = new Companion(null);
    private static final int VERSION_BITS = 4;
    private final AtomicInt value;

    private /* synthetic */ AtomicAwaitersCount(AtomicInt atomicInt) {
        this.value = atomicInt;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AtomicAwaitersCount m4096boximpl(AtomicInt atomicInt) {
        return new AtomicAwaitersCount(atomicInt);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m4097constructorimpl() {
        return m4098constructorimpl(new AtomicInt(0));
    }

    /* renamed from: decrementCount-impl, reason: not valid java name */
    public static final void m4099decrementCountimpl(AtomicInt atomicInt, int i) {
        int i2;
        do {
            i2 = atomicInt.get();
        } while (!atomicInt.compareAndSet(i2, ((i2 >>> COUNT_BITS) & 15) == i ? i2 - 1 : i2));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4100equalsimpl(AtomicInt atomicInt, Object obj) {
        return (obj instanceof AtomicAwaitersCount) && q10.b(atomicInt, ((AtomicAwaitersCount) obj).m4111unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4101equalsimpl0(AtomicInt atomicInt, AtomicInt atomicInt2) {
        return q10.b(atomicInt, atomicInt2);
    }

    /* renamed from: getCount-impl, reason: not valid java name */
    private static final int m4102getCountimpl(AtomicInt atomicInt, int i) {
        return 134217727 & i;
    }

    /* renamed from: getVersion-impl, reason: not valid java name */
    private static final int m4103getVersionimpl(AtomicInt atomicInt, int i) {
        return (i >>> COUNT_BITS) & 15;
    }

    /* renamed from: hasAwaiters-impl, reason: not valid java name */
    public static final boolean m4104hasAwaitersimpl(AtomicInt atomicInt) {
        return (atomicInt.get() & 134217727) > 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4105hashCodeimpl(AtomicInt atomicInt) {
        return atomicInt.hashCode();
    }

    /* renamed from: incrementCountAndGetVersion-impl, reason: not valid java name */
    public static final int m4106incrementCountAndGetVersionimpl(AtomicInt atomicInt, iy iyVar) {
        int i;
        int i2;
        do {
            i = atomicInt.get();
            i2 = i + 1;
        } while (!atomicInt.compareAndSet(i, i2));
        if ((134217727 & i2) == 1) {
            iyVar.invoke();
        }
        return (i2 >>> COUNT_BITS) & 15;
    }

    /* renamed from: incrementVersionAndResetCount-impl, reason: not valid java name */
    public static final void m4107incrementVersionAndResetCountimpl(AtomicInt atomicInt) {
        int i;
        do {
            i = atomicInt.get();
        } while (!atomicInt.compareAndSet(i, m4108packimpl(atomicInt, ((i >>> COUNT_BITS) & 15) + 1, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pack-impl, reason: not valid java name */
    public static final int m4108packimpl(AtomicInt atomicInt, int i, int i2) {
        return ((i & 15) << COUNT_BITS) | (134217727 & i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4109toStringimpl(AtomicInt atomicInt) {
        int i = atomicInt.get();
        StringBuilder sb = new StringBuilder("AtomicAwaitersCount(version = ");
        sb.append((i >>> COUNT_BITS) & 15);
        sb.append(", count = ");
        return fc.e(sb, i & 134217727, ')');
    }

    /* renamed from: update-impl, reason: not valid java name */
    private static final int m4110updateimpl(AtomicInt atomicInt, ky kyVar) {
        int i;
        int intValue;
        do {
            i = atomicInt.get();
            intValue = ((Number) kyVar.invoke(Integer.valueOf(i))).intValue();
        } while (!atomicInt.compareAndSet(i, intValue));
        return intValue;
    }

    public boolean equals(Object obj) {
        return m4100equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4105hashCodeimpl(this.value);
    }

    public String toString() {
        return m4109toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicInt m4111unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static AtomicInt m4098constructorimpl(AtomicInt atomicInt) {
        return atomicInt;
    }
}
