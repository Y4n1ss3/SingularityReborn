package androidx.compose.runtime.internal;

import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AtomicBoolean {
    private final AtomicInt wrapped;

    private /* synthetic */ AtomicBoolean(AtomicInt atomicInt) {
        this.wrapped = atomicInt;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AtomicBoolean m4112boximpl(AtomicInt atomicInt) {
        return new AtomicBoolean(atomicInt);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m4114constructorimpl(boolean z) {
        return m4113constructorimpl(new AtomicInt(z ? 1 : 0));
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ AtomicInt m4115constructorimpl$default(AtomicInt atomicInt, int i, dq dqVar) {
        if ((i & 1) != 0) {
            atomicInt = new AtomicInt(0);
        }
        return m4113constructorimpl(atomicInt);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4116equalsimpl(AtomicInt atomicInt, Object obj) {
        return (obj instanceof AtomicBoolean) && q10.b(atomicInt, ((AtomicBoolean) obj).m4123unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4117equalsimpl0(AtomicInt atomicInt, AtomicInt atomicInt2) {
        return q10.b(atomicInt, atomicInt2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final boolean m4118getimpl(AtomicInt atomicInt) {
        return atomicInt.get() != 0;
    }

    /* renamed from: getAndSet-impl, reason: not valid java name */
    public static final boolean m4119getAndSetimpl(AtomicInt atomicInt, boolean z) {
        return atomicInt.compareAndSet(1, z ? 1 : 0);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4120hashCodeimpl(AtomicInt atomicInt) {
        return atomicInt.hashCode();
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4121setimpl(AtomicInt atomicInt, boolean z) {
        atomicInt.set(z ? 1 : 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4122toStringimpl(AtomicInt atomicInt) {
        return "AtomicBoolean(wrapped=" + atomicInt + ')';
    }

    public boolean equals(Object obj) {
        return m4116equalsimpl(this.wrapped, obj);
    }

    public int hashCode() {
        return m4120hashCodeimpl(this.wrapped);
    }

    public String toString() {
        return m4122toStringimpl(this.wrapped);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicInt m4123unboximpl() {
        return this.wrapped;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m4113constructorimpl(AtomicInt atomicInt) {
        return atomicInt;
    }
}
