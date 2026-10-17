package defpackage;

import androidx.compose.runtime.State;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g80 extends p01 {
    public final w1 g;
    public final State h;

    public g80(w1 w1Var, State state) {
        this.g = w1Var;
        this.h = state;
    }

    public final void J(Object obj) {
        w01 w01Var;
        y1 y1Var = this.g.a;
        if (y1Var != null) {
            y1Var.J(obj);
            w01Var = w01.a;
        } else {
            w01Var = null;
        }
        if (w01Var != null) {
            return;
        }
        o.f("Launcher has not been initialized");
    }
}
