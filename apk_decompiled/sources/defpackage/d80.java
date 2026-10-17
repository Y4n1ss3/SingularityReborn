package defpackage;

import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class d80 implements DisposableEffectResult {
    public final /* synthetic */ y40 a;
    public final /* synthetic */ p70 b;

    public d80(y40 y40Var, p70 p70Var) {
        this.a = y40Var;
        this.b = p70Var;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.a.getLifecycle().b(this.b);
    }
}
