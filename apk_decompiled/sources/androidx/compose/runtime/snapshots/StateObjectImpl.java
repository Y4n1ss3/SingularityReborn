package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 8;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m4165isReadInh_f27i8$runtime(int i) {
        return (ReaderKind.m4154constructorimpl(this.readerKind.get()) & i) != 0;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m4166recordReadInh_f27i8$runtime(int i) {
        int m4154constructorimpl;
        do {
            m4154constructorimpl = ReaderKind.m4154constructorimpl(this.readerKind.get());
            if ((m4154constructorimpl & i) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(m4154constructorimpl, ReaderKind.m4154constructorimpl(m4154constructorimpl | i)));
    }
}
