package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tz0 extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(boolean z, Context context, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = context;
        this.i = kyVar;
        this.h = sharedPreferences;
        this.j = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new tz0(this.f, this.g, this.i, this.h, this.j, hmVar);
            default:
                return new tz0(this.f, this.g, this.h, this.i, this.j, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((tz0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r1 == r8) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
    
        if (r1 == r8) goto L44;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        Object i2;
        int i3 = this.d;
        w01 w01Var = w01.a;
        Context context = this.g;
        boolean z = this.f;
        vn vnVar = vn.d;
        switch (i3) {
            case 0:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    String concat = "setprop debug.oculus.guardian_pause ".concat(z ? "1" : "0");
                    this.e = 1;
                    i = j4.i(context, concat, this);
                    break;
                } else if (i4 == 1) {
                    p10.Q(obj);
                    i = obj;
                } else if (i4 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                boolean z2 = i != null;
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                sz0 sz0Var = new sz0(z2, this.i, this.f, this.h, this.j, null, 0);
                this.e = 2;
                if (p01.H(rzVar, sz0Var, this) != vnVar) {
                }
                break;
            default:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    String str = z ? "settings put global ota_update_server_url \"http://127.0.0.1/\"\nsettings put global ota_download_url \"http://127.0.0.1/\"" : "settings delete global ota_update_server_url\nsettings delete global ota_download_url";
                    this.e = 1;
                    i2 = j4.i(context, str, this);
                    break;
                } else if (i5 == 1) {
                    p10.Q(obj);
                    i2 = obj;
                } else if (i5 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                boolean z3 = i2 != null;
                nq nqVar2 = nr.a;
                rz rzVar2 = f80.a;
                sz0 sz0Var2 = new sz0(z3, this.f, this.h, this.i, this.j, null);
                this.e = 2;
                if (p01.H(rzVar2, sz0Var2, this) != vnVar) {
                }
                break;
        }
        return vnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(boolean z, Context context, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = context;
        this.h = sharedPreferences;
        this.i = kyVar;
        this.j = mutableState;
    }
}
