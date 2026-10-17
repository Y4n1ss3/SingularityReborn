package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class na implements iy {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ un f;
    public final /* synthetic */ b8 g;
    public final /* synthetic */ g80 h;
    public final /* synthetic */ SnapshotStateMap i;
    public final /* synthetic */ e8 j;
    public final /* synthetic */ PackageManager k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ ky n;

    public na(boolean z, boolean z2, un unVar, b8 b8Var, g80 g80Var, SnapshotStateMap snapshotStateMap, e8 e8Var, PackageManager packageManager, Context context, MutableState mutableState, ky kyVar) {
        this.d = z;
        this.e = z2;
        this.f = unVar;
        this.g = b8Var;
        this.h = g80Var;
        this.i = snapshotStateMap;
        this.j = e8Var;
        this.k = packageManager;
        this.l = context;
        this.m = mutableState;
        this.n = kyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean z = this.d;
        Context context = this.l;
        un unVar = this.f;
        b8 b8Var = this.g;
        if (z && !this.e) {
            p01.t(unVar, null, null, new o3(this.k, b8Var, context, (hm) null), 3);
        } else if (b8Var.e == d8.f) {
            ni0 ni0Var = kb.a;
            this.m.setValue(b8Var);
            this.h.J("*/*");
        } else {
            this.i.put(b8Var.c, e8.a(this.j, "Starting...", true, null, false, null, 28));
            p01.t(unVar, null, null, new x2(b8Var, context, this.n, this.i, null, 2), 3);
        }
        return w01.a;
    }
}
