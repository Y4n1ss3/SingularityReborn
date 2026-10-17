package androidx.compose.ui;

import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.q10;
import defpackage.z10;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Session<T> {
        private final z10 job;
        private final T value;

        public Session(z10 z10Var, T t) {
            this.job = z10Var;
            this.value = t;
        }

        public final z10 getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m4191boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m4192constructorimpl() {
        return m4193constructorimpl(new AtomicReference(null));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4194equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && q10.b(atomicReference, ((SessionMutex) obj).m4200unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4195equalsimpl0(AtomicReference<Session<Object>> atomicReference, AtomicReference<Session<Object>> atomicReference2) {
        return q10.b(atomicReference, atomicReference2);
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m4196getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4197hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4198toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m4199withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, ky kyVar, my myVar, hm hmVar) {
        return p10.n(new SessionMutex$withSessionCancellingPrevious$2(kyVar, atomicReference, myVar, null), hmVar);
    }

    public boolean equals(Object obj) {
        return m4194equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m4197hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m4198toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m4200unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m4193constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }
}
