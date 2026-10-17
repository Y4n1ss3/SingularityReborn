package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import defpackage.d41;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.in;
import defpackage.jj0;
import defpackage.jn;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.ts;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, jnVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
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
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            in inVar = hmVar.getContext().get(ts.i);
            androidUiDispatcher = inVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) inVar : null;
        }
        final gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object jj0Var;
                fg fgVar = fg.this;
                try {
                    jj0Var = kyVar.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    jj0Var = new jj0(th);
                }
                fgVar.resumeWith(jj0Var);
            }
        };
        if (androidUiDispatcher == null || !q10.b(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            ggVar.d(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        } else {
            androidUiDispatcher.postFrameCallback$ui(frameCallback);
            ggVar.d(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        }
        return ggVar.s();
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }
}
