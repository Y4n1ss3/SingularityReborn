package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cb extends us0 implements oy {
    public final /* synthetic */ int d = 0;
    public int e;
    public /* synthetic */ Context f;
    public /* synthetic */ ky g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(q90 q90Var, hm hmVar) {
        super(4, hmVar);
        this.h = q90Var;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.d;
        w01 w01Var = w01.a;
        Context context = (Context) obj;
        ky kyVar = (ky) obj2;
        Uri uri = (Uri) obj3;
        hm hmVar = (hm) obj4;
        switch (i) {
            case 0:
                cb cbVar = new cb(4, hmVar);
                cbVar.f = context;
                cbVar.g = kyVar;
                cbVar.h = uri;
                return cbVar.invokeSuspend(w01Var);
            default:
                cb cbVar2 = new cb((q90) this.h, hmVar);
                cbVar2.f = context;
                cbVar2.g = kyVar;
                return cbVar2.invokeSuspend(w01Var);
        }
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                Context context = this.f;
                ky kyVar = this.g;
                Uri uri = (Uri) this.h;
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    if (uri == null) {
                        kyVar.invoke("Error: File not found");
                        return w01Var;
                    }
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    this.e = 1;
                    nq nqVar = nr.a;
                    obj = p01.H(hq.d, new x2(kyVar, context, uri, (hm) null, 1), this);
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                ((Boolean) obj).getClass();
                return w01Var;
            default:
                Context context2 = this.f;
                ky kyVar2 = this.g;
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                q90 q90Var = (q90) this.h;
                String str = q90Var.e;
                String str2 = q90Var.f;
                String str3 = q90Var.j;
                this.f = null;
                this.g = null;
                this.e = 1;
                nq nqVar2 = nr.a;
                return p01.H(hq.d, new a3(kyVar2, str, str2, str3, context2, null), this) == vnVar ? vnVar : w01Var;
        }
    }

    public /* synthetic */ cb(int i, hm hmVar) {
        super(i, hmVar);
    }
}
