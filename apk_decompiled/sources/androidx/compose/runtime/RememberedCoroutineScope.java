package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import defpackage.b20;
import defpackage.dq;
import defpackage.kn;
import defpackage.nn;
import defpackage.st;
import defpackage.ts;
import defpackage.un;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements un, RememberObserver {
    private volatile kn _coroutineContext;
    private final Object lock = this;
    private final kn overlayContext;
    private final kn parentContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final kn CancelledCoroutineContext = new CancelledCoroutineContext();

    public RememberedCoroutineScope(kn knVar, kn knVar2) {
        this.parentContext = knVar;
        this.overlayContext = knVar2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            try {
                kn knVar = this._coroutineContext;
                if (knVar == null) {
                    this._coroutineContext = CancelledCoroutineContext;
                } else {
                    ForgottenCoroutineScopeException forgottenCoroutineScopeException = new ForgottenCoroutineScopeException();
                    z10 z10Var = (z10) knVar.get(ts.l);
                    if (z10Var != null) {
                        z10Var.cancel(forgottenCoroutineScopeException);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.un
    public kn getCoroutineContext() {
        kn knVar;
        kn knVar2 = this._coroutineContext;
        if (knVar2 == null || knVar2 == CancelledCoroutineContext) {
            CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.parentContext.get(CompositionErrorContextImpl.Key);
            kn rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = compositionErrorContextImpl != null ? new RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(nn.d, compositionErrorContextImpl, this) : st.d;
            synchronized (this.lock) {
                try {
                    knVar = this._coroutineContext;
                    if (knVar == null) {
                        kn knVar3 = this.parentContext;
                        knVar = knVar3.plus(new b20((z10) knVar3.get(ts.l))).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                    } else if (knVar == CancelledCoroutineContext) {
                        kn knVar4 = this.parentContext;
                        b20 b20Var = new b20((z10) knVar4.get(ts.l));
                        b20Var.s(new ForgottenCoroutineScopeException());
                        knVar = knVar4.plus(b20Var).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                        if (ComposeToolingFlags.isVerboseTracingEnabled) {
                            knVar = knVar.plus(RememberedCoroutineScopeTracingContext.INSTANCE);
                        }
                    }
                    this._coroutineContext = knVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            knVar2 = knVar;
        }
        knVar2.getClass();
        return knVar2;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        cancelIfCreated();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
