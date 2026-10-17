package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class uz0 extends us0 implements my {
    public int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(boolean z, Context context, ky kyVar, SharedPreferences sharedPreferences, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = context;
        this.h = kyVar;
        this.i = sharedPreferences;
        this.j = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new uz0(this.f, this.g, this.h, this.i, this.j, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((uz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (defpackage.p01.H(r4, r10, r18) != r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (defpackage.j4.i(r7, "svc wifi enable", r18) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (defpackage.y80.p(2000, r18) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (defpackage.j4.i(r7, "svc wifi disable", r18) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (r1 == r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        int i2;
        int i3 = this.e;
        Context context = this.g;
        vn vnVar = vn.d;
        if (i3 == 0) {
            p10.Q(obj);
            String concat = "settings put global captive_portal_mode ".concat(this.f ? "0" : "1");
            this.e = 1;
            i = j4.i(context, concat, this);
        } else if (i3 == 1) {
            p10.Q(obj);
            i = obj;
        } else if (i3 == 2) {
            i2 = this.d;
            p10.Q(obj);
            this.d = i2;
            this.e = 3;
        } else if (i3 == 3) {
            i2 = this.d;
            p10.Q(obj);
            this.d = i2;
            this.e = 4;
        } else {
            if (i3 != 4) {
                if (i3 == 5) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.d;
            p10.Q(obj);
            nq nqVar = nr.a;
            rz rzVar = f80.a;
            sz0 sz0Var = new sz0(i2 == 0, this.h, this.f, this.i, this.j, null, 1);
            this.d = i2;
            this.e = 5;
        }
        i2 = i != null ? 1 : 0;
        if (i2 != 0) {
            this.d = i2;
            this.e = 2;
        }
        nq nqVar2 = nr.a;
        rz rzVar2 = f80.a;
        sz0 sz0Var2 = new sz0(i2 == 0, this.h, this.f, this.i, this.j, null, 1);
        this.d = i2;
        this.e = 5;
    }
}
