package defpackage;

import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c2 implements DisposableEffectResult {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        w01 w01Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                y1 y1Var = ((w1) obj).a;
                if (y1Var != null) {
                    y1Var.i.d(y1Var.h);
                    w01Var = w01.a;
                } else {
                    w01Var = null;
                }
                if (w01Var == null) {
                    o.f("Launcher has not been initialized");
                    break;
                }
                break;
            case 1:
                ((kc) obj).remove();
                break;
            default:
                ((vf0) obj).remove();
                break;
        }
    }
}
