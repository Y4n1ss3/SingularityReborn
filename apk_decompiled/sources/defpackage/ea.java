package defpackage;

import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ea extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(MutableState mutableState, MutableState mutableState2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = mutableState;
        this.g = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.f;
        switch (i) {
            case 0:
                return new ea(mutableState2, mutableState, hmVar, 0);
            case 1:
                return new ea(mutableState2, mutableState, hmVar, 1);
            default:
                return new ea(mutableState2, mutableState, hmVar, 2);
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
        return ((ea) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r14 == r6) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        int i2 = 0;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.f;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    if (kb.j(mutableState2, mutableState, this) == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 1:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    obj = zj0.c("[ -d /data/adb/singularity/services ] && echo 1 || echo 0", false, this);
                    break;
                } else if (i4 == 1) {
                    p10.Q(obj);
                } else if (i4 != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                String obj2 = ds0.E0((String) obj).toString();
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                f4 f4Var = new f4(obj2, this.f, this.g, (hm) null, 5);
                this.e = 2;
                if (p01.H(rzVar, f4Var, this) != vnVar) {
                }
                break;
            default:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        nq nqVar2 = nr.a;
                        hq hqVar = hq.d;
                        wz0 wz0Var = new wz0(mutableState, hmVar, i2);
                        this.e = 1;
                        if (p01.H(hqVar, wz0Var, this) == vnVar) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
