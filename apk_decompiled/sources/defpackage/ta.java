package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ta extends us0 implements oy {
    public int d;
    public /* synthetic */ Context e;
    public /* synthetic */ ky f;

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ta taVar = new ta(4, (hm) obj4);
        taVar.e = (Context) obj;
        taVar.f = (ky) obj2;
        return taVar.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Context context = this.e;
        ky kyVar = this.f;
        int i = this.d;
        if (i == 0) {
            p10.Q(obj);
            this.e = null;
            this.f = null;
            this.d = 1;
            nq nqVar = nr.a;
            Object H = p01.H(hq.d, new x2(kyVar, context, null), this);
            vn vnVar = vn.d;
            if (H == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
