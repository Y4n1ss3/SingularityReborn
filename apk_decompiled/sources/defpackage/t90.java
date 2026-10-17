package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t90 extends us0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(String str, String str2, Context context, boolean z, hm hmVar) {
        super(2, hmVar);
        this.f = str;
        this.g = str2;
        this.h = context;
        this.e = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                return new t90((String) obj4, (String) obj3, (Context) obj2, this.e, hmVar);
            default:
                return new t90(this.e, (un) obj4, (MutableState) obj3, (MutableState) obj2, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                return ((t90) create(unVar, hmVar)).invokeSuspend(w01Var);
            default:
                ((t90) create(unVar, hmVar)).invokeSuspend(w01Var);
                return w01Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.g;
        hm hmVar = null;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                p10.Q(obj);
                try {
                    return ts.k(str2, str, (Context) obj2, this.e, false, 40).getString("tag_name");
                } catch (Exception e) {
                    String message = e.getMessage();
                    StringBuilder k = j50.k("fetchLatestVersionTag failed for ", str2, "/", str, ": ");
                    k.append(message);
                    Log.e("ModuleRepoManager", k.toString());
                    return null;
                }
            default:
                MutableState mutableState = (MutableState) obj4;
                p10.Q(obj);
                if (this.e && !((Boolean) mutableState.getValue()).booleanValue()) {
                    nq nqVar = nr.a;
                    p01.t((un) obj3, hq.d, null, new ea((MutableState) obj2, mutableState, hmVar, 1), 2);
                }
                return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(boolean z, un unVar, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.f = unVar;
        this.g = mutableState;
        this.h = mutableState2;
    }
}
