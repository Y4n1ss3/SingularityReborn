package defpackage;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class c9 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ SnackbarHostState g;

    public /* synthetic */ c9(un unVar, MutableState mutableState, SnackbarHostState snackbarHostState, int i) {
        this.d = i;
        this.e = unVar;
        this.f = mutableState;
        this.g = snackbarHostState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        hm hmVar = null;
        SnackbarHostState snackbarHostState = this.g;
        MutableState mutableState = this.f;
        un unVar = this.e;
        int i2 = 3;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                z10 z10Var = (z10) mutableState.getValue();
                if (z10Var != null) {
                    z10Var.cancel(null);
                }
                mutableState.setValue(p01.t(unVar, null, null, new ib(snackbarHostState, str, hmVar, 1), 3));
                break;
            case 1:
                str.getClass();
                z10 z10Var2 = (z10) mutableState.getValue();
                if (z10Var2 != null) {
                    z10Var2.cancel(null);
                }
                mutableState.setValue(p01.t(unVar, null, null, new ib(snackbarHostState, str, hmVar, i2), 3));
                break;
            case 2:
                str.getClass();
                z10 z10Var3 = (z10) mutableState.getValue();
                if (z10Var3 != null) {
                    z10Var3.cancel(null);
                }
                mutableState.setValue(p01.t(unVar, null, null, new ib(snackbarHostState, str, hmVar, 5), 3));
                break;
            default:
                str.getClass();
                z10 z10Var4 = (z10) mutableState.getValue();
                if (z10Var4 != null) {
                    z10Var4.cancel(null);
                }
                mutableState.setValue(p01.t(unVar, null, null, new ib(snackbarHostState, str, hmVar, 7), 3));
                break;
        }
        return w01Var;
    }
}
