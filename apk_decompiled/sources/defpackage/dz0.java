package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dz0 extends us0 implements my {
    public String d;
    public String e;
    public int f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ List i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(SharedPreferences sharedPreferences, Context context, List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.g = sharedPreferences;
        this.h = context;
        this.i = list;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new dz0(this.g, this.h, this.i, this.j, this.k, this.l, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((dz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0042, code lost:
    
        if (r14 == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object H;
        String str2;
        String str3;
        boolean b;
        Iterator it;
        Set L0;
        Integer e0;
        int i = this.f;
        String str4 = "";
        SharedPreferences sharedPreferences = this.g;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            if (sharedPreferences.getString("fps_available_rates", null) == null) {
                this.f = 1;
                obj = j4.i(this.h, "dumpsys display | grep -o 'refreshRate=[0-9]*' | sed 's/refreshRate=//' | sort -un", this);
            }
            this.d = str4;
            this.f = 2;
            nq nqVar = nr.a;
            obj = p01.H(hq.d, new z2("debug.oculus.refreshRate", null, 7), this);
            if (obj != vnVar) {
                str = str4;
                String str5 = (String) obj;
                this.d = str;
                this.e = str5;
                this.f = 3;
                nq nqVar2 = nr.a;
                H = p01.H(hq.d, new z2("debug.oculus.forceDisplayScaling", null, 7), this);
                if (H != vnVar) {
                }
            }
            return vnVar;
        }
        if (i != 1) {
            if (i == 2) {
                str = this.d;
                p10.Q(obj);
                String str52 = (String) obj;
                this.d = str;
                this.e = str52;
                this.f = 3;
                nq nqVar22 = nr.a;
                H = p01.H(hq.d, new z2("debug.oculus.forceDisplayScaling", null, 7), this);
                if (H != vnVar) {
                    String str6 = str;
                    str2 = str52;
                    obj = H;
                    str3 = str6;
                    String str7 = (String) obj;
                    b = q10.b(str7, "1");
                    MutableState mutableState = this.j;
                    if (!b) {
                    }
                    List r0 = ds0.r0(str3);
                    ArrayList arrayList = new ArrayList();
                    it = r0.iterator();
                    while (it.hasNext()) {
                    }
                    L0 = yi.L0(arrayList);
                    if (!L0.isEmpty()) {
                    }
                    e0 = ks0.e0(ds0.E0(str2).toString());
                    if (e0 != null) {
                    }
                    return w01.a;
                }
                return vnVar;
            }
            if (i != 3) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.e;
            str3 = this.d;
            p10.Q(obj);
            String str72 = (String) obj;
            b = q10.b(str72, "1");
            MutableState mutableState2 = this.j;
            if (!b) {
                mutableState2.setValue(Boolean.TRUE);
            } else if (q10.b(str72, "0")) {
                mutableState2.setValue(Boolean.FALSE);
            }
            List r02 = ds0.r0(str3);
            ArrayList arrayList2 = new ArrayList();
            it = r02.iterator();
            while (it.hasNext()) {
                Integer e02 = ks0.e0(ds0.E0((String) it.next()).toString());
                if (e02 != null) {
                    arrayList2.add(e02);
                }
            }
            L0 = yi.L0(arrayList2);
            if (!L0.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : this.i) {
                    if (L0.contains(new Integer(((Number) obj2).intValue()))) {
                        arrayList3.add(obj2);
                    }
                }
                this.k.setValue(arrayList3);
                sharedPreferences.edit().putString("fps_available_rates", yi.u0(arrayList3, ",", null, null, null, 62)).apply();
            }
            e0 = ks0.e0(ds0.E0(str2).toString());
            if (e0 != null) {
                this.l.setValue(e0);
            }
            return w01.a;
        }
        p10.Q(obj);
        String str8 = (String) obj;
        if (str8 != null) {
            str4 = str8;
        }
        this.d = str4;
        this.f = 2;
        nq nqVar3 = nr.a;
        obj = p01.H(hq.d, new z2("debug.oculus.refreshRate", null, 7), this);
        if (obj != vnVar) {
        }
        return vnVar;
    }
}
