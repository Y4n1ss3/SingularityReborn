package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import defpackage.f80;
import defpackage.hm;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.nq;
import defpackage.nr;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final FallbackFrameClock INSTANCE = new FallbackFrameClock();

    private FallbackFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, jnVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, jnVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, knVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(ky kyVar, hm hmVar) {
        nq nqVar = nr.a;
        return p01.H(f80.a, new FallbackFrameClock$withFrameNanos$2(kyVar, null), hmVar);
    }
}
