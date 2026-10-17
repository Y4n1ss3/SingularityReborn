package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x9 extends us0 implements my {
    public int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ my g;
    public final /* synthetic */ SharedPreferences h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(String str, boolean z, my myVar, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.e = str;
        this.f = z;
        this.g = myVar;
        this.h = sharedPreferences;
        this.i = kyVar;
        this.j = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new x9(this.e, this.f, this.g, this.h, this.i, this.j, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((x9) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (defpackage.p01.H(r15, r7, r14) == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r15 == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (defpackage.zj0.c(r15, false, r14) == r6) goto L23;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        boolean z = this.f;
        String str = this.e;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            zj0 zj0Var = zj0.a;
            String W = es0.W("\n                                                        oculuspreferences --setc " + str + " " + z + "\n                                                        am force-stop com.oculus.vrshell\n                                                        ");
            this.d = 1;
        } else if (i == 1) {
            p10.Q(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            Boolean o = kb.o((String) obj);
            if (o != null) {
                z = o.booleanValue();
            }
            nq nqVar = nr.a;
            rz rzVar = f80.a;
            w9 w9Var = new w9(z, this.h, this.i, this.j, null, 0);
            this.d = 3;
        }
        String concat = "oculuspreferences --getc ".concat(str);
        this.d = 2;
        obj = this.g.invoke(concat, this);
    }
}
