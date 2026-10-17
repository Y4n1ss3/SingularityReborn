package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class i9 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ PackageManager j;
    public final /* synthetic */ MutableState k;

    public /* synthetic */ i9(un unVar, Context context, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState3, int i) {
        this.d = i;
        this.e = unVar;
        this.f = context;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = sharedPreferences;
        this.j = packageManager;
        this.k = mutableState3;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = this.e;
        switch (i) {
            case 0:
                p01.t(unVar, null, null, new ia(this.f, this.g, this.h, this.i, this.j, this.k, null, 0), 3);
                break;
            default:
                p01.t(unVar, null, null, new ia(this.f, this.g, this.h, this.i, this.j, this.k, null, 1), 3);
                break;
        }
        return w01Var;
    }
}
