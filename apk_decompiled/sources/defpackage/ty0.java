package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class ty0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ rw0 f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ ky i;

    public /* synthetic */ ty0(un unVar, rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, ky kyVar, int i) {
        this.d = i;
        this.e = unVar;
        this.f = rw0Var;
        this.g = sharedPreferences;
        this.h = mutableState;
        this.i = kyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = this.e;
        switch (i) {
            case 0:
                nq nqVar = nr.a;
                p01.t(unVar, hq.d, null, new b01(this.f, this.g, this.h, this.i, null, 2), 2);
                break;
            case 1:
                nq nqVar2 = nr.a;
                p01.t(unVar, hq.d, null, new b01(this.f, this.g, this.h, this.i, null, 0), 2);
                break;
            default:
                nq nqVar3 = nr.a;
                p01.t(unVar, hq.d, null, new b01(this.f, this.g, this.h, this.i, null, 1), 2);
                break;
        }
        return w01Var;
    }
}
