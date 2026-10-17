package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z70 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z70(boolean z, Object obj, Object obj2, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                return new z70(this.f, (Context) obj3, (MutableState) obj2, hmVar, 0);
            default:
                return new z70(this.f, (rw0) obj3, (ky) obj2, hmVar, 1);
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
        return ((z70) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        vn vnVar = vn.d;
        boolean z = this.f;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                MutableState mutableState = (MutableState) obj2;
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    if (!z) {
                        return w01Var;
                    }
                    mutableState.setValue(((String) mutableState.getValue()) + "[*] Magisk is already installed — opening Magisk\n");
                    this.e = 1;
                    if (y80.p(500L, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.singularity.magisk");
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(GroupFlagsKt.IsMovableContentFlag);
                    context.startActivity(launchIntentForPackage);
                    return w01Var;
                }
                mutableState.setValue(((String) mutableState.getValue()) + "[!] Magisk app not found — unable to open\n");
                return w01Var;
            default:
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
                rw0 rw0Var = (rw0) obj3;
                if (z) {
                    rw0.a(rw0Var, "com.lumi.singularity.START_LINK_FIX");
                } else {
                    rw0.a(rw0Var, "com.lumi.singularity.STOP_LINK_FIX");
                }
                nq nqVar = nr.a;
                rz rzVar = f80.a;
                bz0 bz0Var = new bz0(2, null, (ky) obj2, z);
                this.e = 1;
                return p01.H(rzVar, bz0Var, this) == vnVar ? vnVar : w01Var;
        }
    }
}
