package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import defpackage.hm;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final MonotonicFrameClock frameClock;
    private final Latch latch = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, jnVar);
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, jnVar);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, knVar);
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8.await(r0) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object withFrameNanos(ky kyVar, hm hmVar) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        int i;
        if (hmVar instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) hmVar;
            int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
                i = pausableMonotonicFrameClock$withFrameNanos$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    Latch latch = this.latch;
                    pausableMonotonicFrameClock$withFrameNanos$1.L$0 = kyVar;
                    pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            p10.Q(obj);
                            return obj;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kyVar = (ky) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                    p10.Q(obj);
                }
                MonotonicFrameClock monotonicFrameClock = this.frameClock;
                pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
                pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
                Object withFrameNanos = monotonicFrameClock.withFrameNanos(kyVar, pausableMonotonicFrameClock$withFrameNanos$1);
                return withFrameNanos != vnVar ? vnVar : withFrameNanos;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, hmVar);
        Object obj2 = pausableMonotonicFrameClock$withFrameNanos$1.result;
        i = pausableMonotonicFrameClock$withFrameNanos$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        MonotonicFrameClock monotonicFrameClock2 = this.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        Object withFrameNanos2 = monotonicFrameClock2.withFrameNanos(kyVar, pausableMonotonicFrameClock$withFrameNanos$1);
        if (withFrameNanos2 != vnVar2) {
        }
    }
}
