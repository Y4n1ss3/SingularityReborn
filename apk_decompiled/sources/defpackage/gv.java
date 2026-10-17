package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gv extends us0 implements my {
    public final /* synthetic */ int d;
    public lb0 e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new gv(2, 0, hmVar);
            case 1:
                return new gv(2, 1, hmVar);
            default:
                return new gv(2, 2, hmVar);
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
        return ((gv) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0113, code lost:
    
        if (r13 == r12) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004b, code lost:
    
        if (r3 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0025, TryCatch #4 {all -> 0x0025, blocks: (B:9:0x001f, B:11:0x0065, B:13:0x0069, B:15:0x006f, B:19:0x007f, B:21:0x00a0, B:23:0x00a4, B:25:0x00aa, B:27:0x00bd, B:34:0x0072), top: B:8:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ed A[Catch: all -> 0x0223, LOOP:2: B:140:0x02e7->B:142:0x02ed, LOOP_END, TryCatch #2 {all -> 0x0223, blocks: (B:135:0x021c, B:137:0x0298, B:139:0x02b8, B:140:0x02e7, B:142:0x02ed, B:144:0x02f5, B:146:0x02fb, B:147:0x02fe, B:149:0x0308, B:151:0x0332, B:156:0x030c, B:158:0x0316, B:159:0x031b, B:160:0x0323, B:162:0x0329, B:167:0x02a5), top: B:129:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fb A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:135:0x021c, B:137:0x0298, B:139:0x02b8, B:140:0x02e7, B:142:0x02ed, B:144:0x02f5, B:146:0x02fb, B:147:0x02fe, B:149:0x0308, B:151:0x0332, B:156:0x030c, B:158:0x0316, B:159:0x031b, B:160:0x0323, B:162:0x0329, B:167:0x02a5), top: B:129:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308 A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:135:0x021c, B:137:0x0298, B:139:0x02b8, B:140:0x02e7, B:142:0x02ed, B:144:0x02f5, B:146:0x02fb, B:147:0x02fe, B:149:0x0308, B:151:0x0332, B:156:0x030c, B:158:0x0316, B:159:0x031b, B:160:0x0323, B:162:0x0329, B:167:0x02a5), top: B:129:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030c A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:135:0x021c, B:137:0x0298, B:139:0x02b8, B:140:0x02e7, B:142:0x02ed, B:144:0x02f5, B:146:0x02fb, B:147:0x02fe, B:149:0x0308, B:151:0x0332, B:156:0x030c, B:158:0x0316, B:159:0x031b, B:160:0x0323, B:162:0x0329, B:167:0x02a5), top: B:129:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa A[Catch: all -> 0x00ea, LOOP:0: B:71:0x01a4->B:73:0x01aa, LOOP_END, TryCatch #7 {all -> 0x00ea, blocks: (B:66:0x00e3, B:68:0x0159, B:70:0x0179, B:71:0x01a4, B:73:0x01aa, B:75:0x01b2, B:77:0x01bf, B:79:0x01e9, B:84:0x01c3, B:86:0x01cd, B:87:0x01d2, B:88:0x01da, B:90:0x01e0, B:95:0x0166), top: B:65:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf A[Catch: all -> 0x00ea, TryCatch #7 {all -> 0x00ea, blocks: (B:66:0x00e3, B:68:0x0159, B:70:0x0179, B:71:0x01a4, B:73:0x01aa, B:75:0x01b2, B:77:0x01bf, B:79:0x01e9, B:84:0x01c3, B:86:0x01cd, B:87:0x01d2, B:88:0x01da, B:90:0x01e0, B:95:0x0166), top: B:65:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3 A[Catch: all -> 0x00ea, TryCatch #7 {all -> 0x00ea, blocks: (B:66:0x00e3, B:68:0x0159, B:70:0x0179, B:71:0x01a4, B:73:0x01aa, B:75:0x01b2, B:77:0x01bf, B:79:0x01e9, B:84:0x01c3, B:86:0x01cd, B:87:0x01d2, B:88:0x01da, B:90:0x01e0, B:95:0x0166), top: B:65:0x00e3 }] */
    /* JADX WARN: Type inference failed for: r13v5, types: [lb0] */
    /* JADX WARN: Type inference failed for: r2v31, types: [lb0] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v28, types: [lb0] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ob0 ob0Var;
        int i;
        List list;
        lb0 lb0Var;
        Object H;
        ArrayList arrayList;
        vr vrVar;
        Iterator it;
        List D;
        ob0 ob0Var2;
        Object obj2;
        List list2;
        Object H2;
        Object obj3;
        vv vvVar;
        Iterator it2;
        List D2;
        ob0 ob0Var3;
        Object obj4;
        List list3;
        Object b;
        Object obj5;
        List list4;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        String str = "";
        ?? r3 = 12;
        char c = '\f';
        char c2 = '\f';
        int i2 = 0;
        hm hmVar = null;
        switch (this.d) {
            case 0:
                vn vnVar = vn.d;
                int i3 = this.g;
                try {
                    try {
                        if (i3 == 0) {
                            p10.Q(obj);
                            List list5 = iv.g;
                            if (list5 != null) {
                                return list5;
                            }
                            ob0Var = iv.h;
                            this.e = ob0Var;
                            this.f = 0;
                            this.g = 1;
                            if (ob0Var.d(this) != vnVar) {
                                i = 0;
                            }
                            return vnVar;
                        }
                        if (i3 != 1) {
                            if (i3 != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lb0Var = this.e;
                            try {
                                p10.Q(obj);
                                H = obj;
                                lb0Var = lb0Var;
                                str = (String) H;
                                r3 = lb0Var;
                            } catch (Exception e) {
                                e = e;
                                Log.w("FanUtils", "discoverFanZones failed: " + e.getMessage());
                                r3 = lb0Var;
                                wv W = do0.W(new wv(ds0.q0(str), true, new qo(19)), new qo(20));
                                fo0 fo0Var = new fo0(i2);
                                arrayList = new ArrayList();
                                vrVar = new vr(new vv(W), fo0Var);
                                while (vrVar.hasNext()) {
                                }
                                if (arrayList.size() > 1) {
                                }
                                it = arrayList.iterator();
                                if (it.hasNext()) {
                                }
                                list = D;
                                List list6 = iv.a;
                                iv.g = list;
                                Log.d("FanUtils", "Discovered fan-driving thermal zones: " + list);
                                ob0Var = r3;
                                ob0Var.f(null);
                                return list;
                            }
                            wv W2 = do0.W(new wv(ds0.q0(str), true, new qo(19)), new qo(20));
                            fo0 fo0Var2 = new fo0(i2);
                            arrayList = new ArrayList();
                            vrVar = new vr(new vv(W2), fo0Var2);
                            while (vrVar.hasNext()) {
                                arrayList.add(vrVar.next());
                            }
                            if (arrayList.size() > 1) {
                                Collections.sort(arrayList);
                            }
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                                D = ut.d;
                            } else {
                                Object next = it.next();
                                if (it.hasNext()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(next);
                                    while (it.hasNext()) {
                                        arrayList2.add(it.next());
                                    }
                                    list = arrayList2;
                                    List list62 = iv.a;
                                    iv.g = list;
                                    Log.d("FanUtils", "Discovered fan-driving thermal zones: " + list);
                                    ob0Var = r3;
                                    ob0Var.f(null);
                                    return list;
                                }
                                D = y80.D(next);
                            }
                            list = D;
                            List list622 = iv.a;
                            iv.g = list;
                            Log.d("FanUtils", "Discovered fan-driving thermal zones: " + list);
                            ob0Var = r3;
                            ob0Var.f(null);
                            return list;
                        }
                        int i4 = this.f;
                        ?? r13 = this.e;
                        p10.Q(obj);
                        i = i4;
                        ob0Var = r13;
                        list = iv.g;
                        if (list != null) {
                            ob0Var.f(null);
                            return list;
                        }
                        List list7 = iv.a;
                        String W3 = es0.W("\n                for z in /sys/class/thermal/thermal_zone*; do\n                    for c in \"$z\"/cdev*; do\n                        [ -f \"$c/type\" ] || continue\n                        cdev=$(cat \"$c/type\" 2>/dev/null)\n                        case \"$cdev\" in\n                            " + (hr.c() ? "oculus,fan" : "pwm-tach-fan") + "*) echo \"ZONE:${z##*thermal_zone}\"; break ;;\n                        esac\n                    done\n                done\n            ");
                        try {
                            zj0 zj0Var = zj0.a;
                            this.e = ob0Var;
                            this.f = i;
                            this.g = 2;
                            nq nqVar = nr.a;
                            H = p01.H(hq.d, new qe(W3, hmVar, c), this);
                        } catch (Exception e2) {
                            e = e2;
                            lb0Var = ob0Var;
                            Log.w("FanUtils", "discoverFanZones failed: " + e.getMessage());
                            r3 = lb0Var;
                            wv W22 = do0.W(new wv(ds0.q0(str), true, new qo(19)), new qo(20));
                            fo0 fo0Var22 = new fo0(i2);
                            arrayList = new ArrayList();
                            vrVar = new vr(new vv(W22), fo0Var22);
                            while (vrVar.hasNext()) {
                            }
                            if (arrayList.size() > 1) {
                            }
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                            }
                            list = D;
                            List list6222 = iv.a;
                            iv.g = list;
                            Log.d("FanUtils", "Discovered fan-driving thermal zones: " + list);
                            ob0Var = r3;
                            ob0Var.f(null);
                            return list;
                        }
                        if (H != vnVar) {
                            lb0Var = ob0Var;
                            str = (String) H;
                            r3 = lb0Var;
                            wv W222 = do0.W(new wv(ds0.q0(str), true, new qo(19)), new qo(20));
                            fo0 fo0Var222 = new fo0(i2);
                            arrayList = new ArrayList();
                            vrVar = new vr(new vv(W222), fo0Var222);
                            while (vrVar.hasNext()) {
                            }
                            if (arrayList.size() > 1) {
                            }
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                            }
                            list = D;
                            List list62222 = iv.a;
                            iv.g = list;
                            Log.d("FanUtils", "Discovered fan-driving thermal zones: " + list);
                            ob0Var = r3;
                            ob0Var.f(null);
                            return list;
                        }
                        return vnVar;
                    } catch (Throwable th) {
                        th = th;
                        r3 = ob0Var;
                        ((ob0) r3).f(null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            case 1:
                vn vnVar2 = vn.d;
                int i5 = this.g;
                try {
                    if (i5 == 0) {
                        p10.Q(obj);
                        List list8 = iv.f;
                        if (list8 == null) {
                            ob0 ob0Var4 = iv.h;
                            this.e = ob0Var4;
                            this.f = 0;
                            this.g = 1;
                            Object d = ob0Var4.d(this);
                            ob0Var2 = ob0Var4;
                            break;
                        } else {
                            return list8;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj2 = this.e;
                            try {
                                try {
                                    p10.Q(obj);
                                    H2 = obj;
                                    str = (String) H2;
                                } catch (Exception e3) {
                                    e = e3;
                                    Log.w("FanUtils", "discoverFans failed: " + e.getMessage());
                                    wv W4 = do0.W(new wv(ds0.q0(str), true, new qo(21)), new qo(22));
                                    jb jbVar = new jb(3);
                                    ArrayList arrayList3 = new ArrayList();
                                    vvVar = new vv(W4);
                                    while (vvVar.hasNext()) {
                                    }
                                    cj.b0(arrayList3, jbVar);
                                    it2 = arrayList3.iterator();
                                    if (it2.hasNext()) {
                                    }
                                    list2 = D2;
                                    List list9 = iv.a;
                                    iv.f = list2;
                                    Log.d("FanUtils", "Discovered fans: " + list2);
                                    obj3 = obj2;
                                    ((ob0) obj3).f(null);
                                    return list2;
                                }
                                wv W42 = do0.W(new wv(ds0.q0(str), true, new qo(21)), new qo(22));
                                jb jbVar2 = new jb(3);
                                ArrayList arrayList32 = new ArrayList();
                                vvVar = new vv(W42);
                                while (vvVar.hasNext()) {
                                    arrayList32.add(vvVar.next());
                                }
                                cj.b0(arrayList32, jbVar2);
                                it2 = arrayList32.iterator();
                                if (it2.hasNext()) {
                                    D2 = ut.d;
                                } else {
                                    Object next2 = it2.next();
                                    if (it2.hasNext()) {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(next2);
                                        while (it2.hasNext()) {
                                            arrayList4.add(it2.next());
                                        }
                                        list2 = arrayList4;
                                        List list92 = iv.a;
                                        iv.f = list2;
                                        Log.d("FanUtils", "Discovered fans: " + list2);
                                        obj3 = obj2;
                                        ((ob0) obj3).f(null);
                                        return list2;
                                    }
                                    D2 = y80.D(next2);
                                }
                                list2 = D2;
                                List list922 = iv.a;
                                iv.f = list2;
                                Log.d("FanUtils", "Discovered fans: " + list2);
                                obj3 = obj2;
                                ((ob0) obj3).f(null);
                                return list2;
                            } catch (Throwable th3) {
                                th = th3;
                                ((ob0) obj2).f(null);
                                throw th;
                            }
                        }
                        i2 = this.f;
                        ?? r5 = this.e;
                        p10.Q(obj);
                        ob0Var2 = r5;
                    }
                    list2 = iv.f;
                    if (list2 != null) {
                        obj3 = ob0Var2;
                        ((ob0) obj3).f(null);
                        return list2;
                    }
                    List list10 = iv.a;
                    String W5 = es0.W("\n                for h in /sys/class/hwmon/hwmon*; do\n                    n=$(cat \"$h/name\" 2>/dev/null)\n                    if [ \"$n\" = \"" + (hr.c() ? "oculus" : "pwmfan") + "\" ]; then\n                        d=$(readlink -f \"$h/device\" 2>/dev/null)\n                        echo \"HWMON:$h:$d\"\n                    fi\n                done\n            ");
                    try {
                        zj0 zj0Var2 = zj0.a;
                        this.e = ob0Var2;
                        this.f = i2;
                        this.g = 2;
                        nq nqVar2 = nr.a;
                        H2 = p01.H(hq.d, new qe(W5, hmVar, c2), this);
                    } catch (Exception e4) {
                        e = e4;
                        obj2 = ob0Var2;
                        Log.w("FanUtils", "discoverFans failed: " + e.getMessage());
                        wv W422 = do0.W(new wv(ds0.q0(str), true, new qo(21)), new qo(22));
                        jb jbVar22 = new jb(3);
                        ArrayList arrayList322 = new ArrayList();
                        vvVar = new vv(W422);
                        while (vvVar.hasNext()) {
                        }
                        cj.b0(arrayList322, jbVar22);
                        it2 = arrayList322.iterator();
                        if (it2.hasNext()) {
                        }
                        list2 = D2;
                        List list9222 = iv.a;
                        iv.f = list2;
                        Log.d("FanUtils", "Discovered fans: " + list2);
                        obj3 = obj2;
                        ((ob0) obj3).f(null);
                        return list2;
                    }
                    if (H2 != vnVar2) {
                        obj2 = ob0Var2;
                        str = (String) H2;
                        wv W4222 = do0.W(new wv(ds0.q0(str), true, new qo(21)), new qo(22));
                        jb jbVar222 = new jb(3);
                        ArrayList arrayList3222 = new ArrayList();
                        vvVar = new vv(W4222);
                        while (vvVar.hasNext()) {
                        }
                        cj.b0(arrayList3222, jbVar222);
                        it2 = arrayList3222.iterator();
                        if (it2.hasNext()) {
                        }
                        list2 = D2;
                        List list92222 = iv.a;
                        iv.f = list2;
                        Log.d("FanUtils", "Discovered fans: " + list2);
                        obj3 = obj2;
                        ((ob0) obj3).f(null);
                        return list2;
                    }
                    return vnVar2;
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = ob0Var2;
                    ((ob0) obj2).f(null);
                    throw th;
                }
            default:
                vn vnVar3 = vn.d;
                int i6 = this.g;
                try {
                    if (i6 == 0) {
                        p10.Q(obj);
                        List list11 = pz.q;
                        if (list11 == null) {
                            ob0 ob0Var5 = pz.r;
                            this.e = ob0Var5;
                            this.f = 0;
                            this.g = 1;
                            Object d2 = ob0Var5.d(this);
                            ob0Var3 = ob0Var5;
                            break;
                        } else {
                            return list11;
                        }
                    } else {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj4 = this.e;
                            try {
                                p10.Q(obj);
                                b = obj;
                                List list12 = (List) b;
                                list4 = list12 != null ? hr.d() ? pz.b : ut.d : list12;
                                Log.d("GpuUtils", (list12 == null ? "Detected" : "Falling back to static") + " GPU available frequencies (MHz): " + list4);
                                pz pzVar = pz.a;
                                pz.q = list4;
                                if (list4.size() >= 2 && (sharedPreferences = pz.s) != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString("gpu_available_freqs_cache", yi.u0(list4, ",", null, null, null, 62))) != null) {
                                    putString.apply();
                                }
                                list3 = list4;
                                obj5 = obj4;
                                ((ob0) obj5).f(null);
                                return list3;
                            } catch (Throwable th5) {
                                th = th5;
                                ((ob0) obj4).f(null);
                                throw th;
                            }
                        }
                        i2 = this.f;
                        ?? r2 = this.e;
                        p10.Q(obj);
                        ob0Var3 = r2;
                    }
                    list3 = pz.q;
                    if (list3 != null) {
                        obj5 = ob0Var3;
                        ((ob0) obj5).f(null);
                        return list3;
                    }
                    pz pzVar2 = pz.a;
                    this.e = ob0Var3;
                    this.f = i2;
                    this.g = 2;
                    b = pzVar2.b(this);
                    if (b != vnVar3) {
                        obj4 = ob0Var3;
                        List list122 = (List) b;
                        if (list122 != null) {
                        }
                        if (list122 == null) {
                        }
                        Log.d("GpuUtils", (list122 == null ? "Detected" : "Falling back to static") + " GPU available frequencies (MHz): " + list4);
                        pz pzVar3 = pz.a;
                        pz.q = list4;
                        if (list4.size() >= 2) {
                            putString.apply();
                        }
                        list3 = list4;
                        obj5 = obj4;
                        ((ob0) obj5).f(null);
                        return list3;
                    }
                    return vnVar3;
                } catch (Throwable th6) {
                    th = th6;
                    obj4 = ob0Var3;
                    ((ob0) obj4).f(null);
                    throw th;
                }
        }
    }
}
