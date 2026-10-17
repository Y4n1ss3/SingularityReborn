package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jf0 extends us0 implements my {
    public int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(boolean z, hm hmVar) {
        super(2, hmVar);
        this.e = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new jf0(this.e, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((jf0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (defpackage.zj0.c(r7, false, r6) == r4) goto L20;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            String str = this.e ? "--setro" : "--setrw";
            zj0 zj0Var = zj0.a;
            String d = uo.d("blockdev ", str, " /dev/block/bootdevice/by-name/persist");
            this.d = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return obj;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        this.d = 2;
        nq nqVar = nr.a;
        Object H = p01.H(hq.d, new b80(2, 6, null), this);
        return H == vnVar ? vnVar : H;
    }
}
