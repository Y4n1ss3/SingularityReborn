package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeToolingFlags;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.nn;
import defpackage.on;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.y80;
import defpackage.z10;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver, on {
    public static final int $stable = 8;
    private z10 job;
    private final kn parentCoroutineContext;
    private final un scope;
    private final my task;

    public LaunchedEffectImpl(kn knVar, my myVar) {
        this.parentCoroutineContext = knVar;
        this.task = myVar;
        kn plus = knVar.plus(this);
        this.scope = p10.a(ComposeToolingFlags.isVerboseTracingEnabled ? plus.plus(LaunchedEffectTracingContext.INSTANCE) : plus);
    }

    @Override // defpackage.kn
    public <R> R fold(R r, my myVar) {
        return (R) y80.q(this, r, myVar);
    }

    @Override // defpackage.kn
    public <E extends in> E get(jn jnVar) {
        return (E) y80.s(this, jnVar);
    }

    @Override // defpackage.in
    public jn getKey() {
        return nn.d;
    }

    @Override // defpackage.on
    public void handleException(kn knVar, Throwable th) {
        CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) knVar.get(CompositionErrorContextImpl.Key);
        if (compositionErrorContextImpl != null) {
            compositionErrorContextImpl.attachComposeStackTrace(th, this);
        }
        on onVar = (on) this.parentCoroutineContext.get(nn.d);
        if (onVar == null) {
            throw th;
        }
        onVar.handleException(knVar, th);
    }

    @Override // defpackage.kn
    public kn minusKey(jn jnVar) {
        return y80.F(this, jnVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            z10Var.cancel(cancellationException);
        }
        this.job = p01.t(this.scope, null, null, this.task, 3);
    }

    @Override // defpackage.kn
    public kn plus(kn knVar) {
        return y80.I(this, knVar);
    }
}
