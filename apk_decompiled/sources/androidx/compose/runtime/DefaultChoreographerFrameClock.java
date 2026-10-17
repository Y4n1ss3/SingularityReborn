package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import defpackage.d41;
import defpackage.f80;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.in;
import defpackage.jj0;
import defpackage.jn;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.nq;
import defpackage.nr;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer;

    static {
        nq nqVar = nr.a;
        choreographer = (Choreographer) y80.R(f80.a.g, new DefaultChoreographerFrameClock$choreographer$1(null));
    }

    private DefaultChoreographerFrameClock() {
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
    public <R> Object withFrameNanos(final ky kyVar, hm hmVar) {
        final gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object jj0Var;
                fg fgVar = fg.this;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                try {
                    jj0Var = kyVar.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    jj0Var = new jj0(th);
                }
                fgVar.resumeWith(jj0Var);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        ggVar.d(new ky() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
            public final void invoke(Throwable th) {
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(frameCallback);
            }

            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w01.a;
            }
        });
        return ggVar.s();
    }
}
