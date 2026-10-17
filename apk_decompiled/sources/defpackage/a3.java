package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.LocalSocket;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a3 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ky kyVar, String str, jm jmVar, MutableState mutableState, un unVar, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 6;
        this.f = kyVar;
        this.g = str;
        this.h = jmVar;
        this.i = mutableState;
        this.k = unVar;
        this.j = mutableState2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a9, code lost:
    
        if (r0 == r10) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:10:0x0035, B:12:0x01ac, B:17:0x01c4, B:21:0x01ca, B:26:0x0050, B:28:0x017f, B:30:0x0187, B:34:0x0062, B:36:0x015f, B:40:0x006e, B:41:0x00ff, B:43:0x0103, B:44:0x0105, B:46:0x010d, B:47:0x0135, B:50:0x0076, B:51:0x0094, B:53:0x009a, B:59:0x00dc, B:77:0x01ef, B:78:0x01f2, B:79:0x01f3, B:82:0x0083, B:55:0x00ce, B:58:0x00d9, B:69:0x01e9, B:70:0x01ec, B:74:0x01ed), top: B:2:0x0021, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ca A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:10:0x0035, B:12:0x01ac, B:17:0x01c4, B:21:0x01ca, B:26:0x0050, B:28:0x017f, B:30:0x0187, B:34:0x0062, B:36:0x015f, B:40:0x006e, B:41:0x00ff, B:43:0x0103, B:44:0x0105, B:46:0x010d, B:47:0x0135, B:50:0x0076, B:51:0x0094, B:53:0x009a, B:59:0x00dc, B:77:0x01ef, B:78:0x01f2, B:79:0x01f3, B:82:0x0083, B:55:0x00ce, B:58:0x00d9, B:69:0x01e9, B:70:0x01ec, B:74:0x01ed), top: B:2:0x0021, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0187 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:10:0x0035, B:12:0x01ac, B:17:0x01c4, B:21:0x01ca, B:26:0x0050, B:28:0x017f, B:30:0x0187, B:34:0x0062, B:36:0x015f, B:40:0x006e, B:41:0x00ff, B:43:0x0103, B:44:0x0105, B:46:0x010d, B:47:0x0135, B:50:0x0076, B:51:0x0094, B:53:0x009a, B:59:0x00dc, B:77:0x01ef, B:78:0x01f2, B:79:0x01f3, B:82:0x0083, B:55:0x00ce, B:58:0x00d9, B:69:0x01e9, B:70:0x01ec, B:74:0x01ed), top: B:2:0x0021, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:10:0x0035, B:12:0x01ac, B:17:0x01c4, B:21:0x01ca, B:26:0x0050, B:28:0x017f, B:30:0x0187, B:34:0x0062, B:36:0x015f, B:40:0x006e, B:41:0x00ff, B:43:0x0103, B:44:0x0105, B:46:0x010d, B:47:0x0135, B:50:0x0076, B:51:0x0094, B:53:0x009a, B:59:0x00dc, B:77:0x01ef, B:78:0x01f2, B:79:0x01f3, B:82:0x0083, B:55:0x00ce, B:58:0x00d9, B:69:0x01e9, B:70:0x01ec, B:74:0x01ed), top: B:2:0x0021, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:10:0x0035, B:12:0x01ac, B:17:0x01c4, B:21:0x01ca, B:26:0x0050, B:28:0x017f, B:30:0x0187, B:34:0x0062, B:36:0x015f, B:40:0x006e, B:41:0x00ff, B:43:0x0103, B:44:0x0105, B:46:0x010d, B:47:0x0135, B:50:0x0076, B:51:0x0094, B:53:0x009a, B:59:0x00dc, B:77:0x01ef, B:78:0x01f2, B:79:0x01f3, B:82:0x0083, B:55:0x00ce, B:58:0x00d9, B:69:0x01e9, B:70:0x01ec, B:74:0x01ed), top: B:2:0x0021, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Object obj2;
        Object v;
        File file;
        Object H;
        String str;
        String str2;
        Object c;
        String str3;
        String str4;
        Object H2;
        String str5;
        boolean z;
        Object c2;
        boolean z2;
        String str6;
        String str7;
        String str8;
        ky kyVar = (ky) this.f;
        q90 q90Var = (q90) this.j;
        int i = this.e;
        hm hmVar = null;
        vn vnVar = vn.d;
        try {
        } catch (Exception e) {
            String str9 = q90Var.b;
            String simpleName = e.getClass().getSimpleName();
            String message = e.getMessage();
            StringBuilder k = j50.k("installMagiskModule failed for ", str9, ": ", simpleName, ": ");
            k.append(message);
            Log.e("ModuleRepoManager", k.toString());
            kyVar.invoke("Error: " + e.getMessage());
            obj2 = new jj0(e);
        }
        if (i == 0) {
            p10.Q(obj);
            kyVar.invoke("Finding latest release...");
            ts tsVar = ts.m;
            this.e = 1;
            v = tsVar.v(q90Var, this);
            if (v == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    File file2 = (File) this.g;
                    p10.Q(obj);
                    file = file2;
                    H = obj;
                    str = (String) H;
                    str2 = str;
                    if (str == null) {
                        str2 = q90Var.a;
                    }
                    if (!str2.equals(q90Var.a)) {
                        Log.w("ModuleRepoManager", q90Var.b + ": db entry id '" + q90Var.a + "' differs from real module id '" + str2 + "'");
                    }
                    kyVar.invoke("Installing via Magisk...");
                    zj0 zj0Var = zj0.a;
                    String str10 = "magisk --install-module \"" + file.getAbsolutePath() + "\"";
                    this.g = file;
                    this.h = str2;
                    this.e = 3;
                    c = zj0.c(str10, false, this);
                    str3 = str2;
                    if (c == vnVar) {
                        return vnVar;
                    }
                    str4 = (String) c;
                    file.delete();
                    this.g = null;
                    this.h = str3;
                    this.i = str4;
                    this.e = 4;
                    nq nqVar = nr.a;
                    H2 = p01.H(hq.d, new qe(str3, (hm) null, 7), this);
                    str5 = str3;
                    if (H2 == vnVar) {
                    }
                    str7 = str5;
                    if (!((Boolean) H2).booleanValue()) {
                    }
                    z2 = true;
                    str6 = str7;
                    if (z2) {
                    }
                    return new kj0(obj2);
                }
                if (i == 3) {
                    String str11 = (String) this.h;
                    File file3 = (File) this.g;
                    p10.Q(obj);
                    file = file3;
                    c = obj;
                    str3 = str11;
                    str4 = (String) c;
                    file.delete();
                    this.g = null;
                    this.h = str3;
                    this.i = str4;
                    this.e = 4;
                    nq nqVar2 = nr.a;
                    H2 = p01.H(hq.d, new qe(str3, (hm) null, 7), this);
                    str5 = str3;
                    if (H2 == vnVar) {
                        return vnVar;
                    }
                    str7 = str5;
                    if (!((Boolean) H2).booleanValue()) {
                    }
                    z2 = true;
                    str6 = str7;
                    if (z2) {
                    }
                    return new kj0(obj2);
                }
                if (i != 4) {
                    if (i != 5) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str12 = (String) this.i;
                    String str13 = (String) this.h;
                    p10.Q(obj);
                    str4 = str12;
                    z = false;
                    str8 = str13;
                    c2 = obj;
                    if (!q10.b(ds0.E0((String) c2).toString(), "yes")) {
                        z2 = z;
                        str6 = str8;
                        if (z2) {
                        }
                        return new kj0(obj2);
                    }
                    str7 = str8;
                    z2 = true;
                    str6 = str7;
                    if (z2) {
                        kyVar.invoke("Install may have failed: ".concat(ds0.C0(300, str4)));
                        obj2 = new jj0(new Exception(str4));
                    } else {
                        kyVar.invoke("Installed -- reboot to apply.");
                        obj2 = str6;
                    }
                    return new kj0(obj2);
                }
                String str14 = (String) this.i;
                String str15 = (String) this.h;
                p10.Q(obj);
                str4 = str14;
                str5 = str15;
                H2 = obj;
                str7 = str5;
                if (!((Boolean) H2).booleanValue()) {
                    zj0 zj0Var2 = zj0.a;
                    this.g = null;
                    this.h = str5;
                    this.i = str4;
                    this.e = 5;
                    z = false;
                    c2 = zj0.c("test -d /data/adb/modules_update/" + str5 + " && echo yes", false, this);
                    str8 = str5;
                }
                z2 = true;
                str6 = str7;
                if (z2) {
                }
                return new kj0(obj2);
            }
            p10.Q(obj);
            v = ((kj0) obj).d;
        }
        Throwable a = kj0.a(v);
        if (a != null) {
            return new kj0(new jj0(a));
        }
        kyVar.invoke("Downloading " + q90Var.b + "...");
        file = new File(((Context) this.k).getCacheDir(), q90Var.a.concat(".zip"));
        InputStream openStream = new URL((String) v).openStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                openStream.getClass();
                q10.k(openStream, fileOutputStream);
                fileOutputStream.close();
                openStream.close();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                this.g = file;
                this.e = 2;
                nq nqVar3 = nr.a;
                H = p01.H(hq.d, new qe(absolutePath, hmVar, 9), this);
                if (H == vnVar) {
                    return vnVar;
                }
                str = (String) H;
                str2 = str;
                if (str == null) {
                }
                if (!str2.equals(q90Var.a)) {
                }
                kyVar.invoke("Installing via Magisk...");
                zj0 zj0Var3 = zj0.a;
                String str102 = "magisk --install-module \"" + file.getAbsolutePath() + "\"";
                this.g = file;
                this.h = str2;
                this.e = 3;
                c = zj0.c(str102, false, this);
                str3 = str2;
                if (c == vnVar) {
                }
                str4 = (String) c;
                file.delete();
                this.g = null;
                this.h = str3;
                this.i = str4;
                this.e = 4;
                nq nqVar22 = nr.a;
                H2 = p01.H(hq.d, new qe(str3, (hm) null, 7), this);
                str5 = str3;
                if (H2 == vnVar) {
                }
                str7 = str5;
                if (!((Boolean) H2).booleanValue()) {
                }
                z2 = true;
                str6 = str7;
                if (z2) {
                }
                return new kj0(obj2);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (defpackage.p01.H(r0, r8, r1) != r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, List list, im imVar) {
        h01 h01Var;
        int i;
        vn vnVar;
        MutableState mutableState4;
        MutableState mutableState5;
        List list2;
        Object obj;
        MutableState mutableState6;
        Object f;
        MutableState mutableState7;
        MutableState mutableState8;
        String str;
        if (imVar instanceof h01) {
            h01Var = (h01) imVar;
            int i2 = h01Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h01Var.j = i2 - Integer.MIN_VALUE;
                Object obj2 = h01Var.i;
                i = h01Var.j;
                int i3 = 2;
                hm hmVar = null;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj2);
                    pz pzVar = pz.a;
                    mutableState4 = mutableState;
                    h01Var.d = mutableState4;
                    mutableState5 = mutableState2;
                    h01Var.e = mutableState5;
                    h01Var.f = mutableState3;
                    list2 = list;
                    h01Var.g = list2;
                    h01Var.j = 1;
                    nq nqVar = nr.a;
                    Object H = p01.H(hq.d, new z9(i3, 26, hmVar), h01Var);
                    if (H != vnVar) {
                        obj = H;
                        mutableState6 = mutableState3;
                    }
                    return vnVar;
                }
                if (i == 1) {
                    List list3 = h01Var.g;
                    mutableState6 = h01Var.f;
                    MutableState mutableState9 = h01Var.e;
                    MutableState mutableState10 = h01Var.d;
                    p10.Q(obj2);
                    obj = obj2;
                    mutableState4 = mutableState10;
                    list2 = list3;
                    mutableState5 = mutableState9;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            p10.Q(obj2);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = h01Var.h;
                    List list4 = h01Var.g;
                    mutableState6 = h01Var.f;
                    MutableState mutableState11 = h01Var.e;
                    MutableState mutableState12 = h01Var.d;
                    p10.Q(obj2);
                    str = str2;
                    mutableState8 = mutableState11;
                    mutableState7 = mutableState12;
                    list2 = list4;
                    MutableState mutableState13 = mutableState6;
                    String str3 = (String) obj2;
                    nq nqVar2 = nr.a;
                    rz rzVar = f80.a;
                    f01 f01Var = new f01(list2, str, str3, mutableState7, mutableState8, mutableState13, (hm) null);
                    h01Var.d = null;
                    h01Var.e = null;
                    h01Var.f = null;
                    h01Var.g = null;
                    h01Var.h = null;
                    h01Var.j = 3;
                }
                String str4 = (String) obj;
                pz pzVar2 = pz.a;
                h01Var.d = mutableState4;
                h01Var.e = mutableState5;
                h01Var.f = mutableState6;
                h01Var.g = list2;
                h01Var.h = str4;
                h01Var.j = 2;
                f = pz.f(h01Var);
                if (f != vnVar) {
                    mutableState7 = mutableState4;
                    mutableState8 = mutableState5;
                    obj2 = f;
                    str = str4;
                    MutableState mutableState132 = mutableState6;
                    String str32 = (String) obj2;
                    nq nqVar22 = nr.a;
                    rz rzVar2 = f80.a;
                    f01 f01Var2 = new f01(list2, str, str32, mutableState7, mutableState8, mutableState132, (hm) null);
                    h01Var.d = null;
                    h01Var.e = null;
                    h01Var.f = null;
                    h01Var.g = null;
                    h01Var.h = null;
                    h01Var.j = 3;
                }
                return vnVar;
            }
        }
        h01Var = new h01(imVar);
        Object obj22 = h01Var.i;
        i = h01Var.j;
        int i32 = 2;
        hm hmVar2 = null;
        vnVar = vn.d;
        if (i != 0) {
        }
        String str42 = (String) obj;
        pz pzVar22 = pz.a;
        h01Var.d = mutableState4;
        h01Var.e = mutableState5;
        h01Var.f = mutableState6;
        h01Var.g = list2;
        h01Var.h = str42;
        h01Var.j = 2;
        f = pz.f(h01Var);
        if (f != vnVar) {
        }
        return vnVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new a3((ky) obj2, (MutableState) this.i, (MutableState) this.j, (MutableState) this.k, hmVar);
            case 1:
                return new a3((y2) this.k, (ky) obj2, (LocalSocket) this.g, hmVar);
            case 2:
                return new a3((ky) obj2, (String) this.h, (String) this.i, (String) this.j, (Context) this.k, hmVar);
            case 3:
                return new a3((my) this.h, (SharedPreferences) obj2, (MutableState) this.j, (MutableState) this.k, hmVar);
            case 4:
                return new a3((b8) this.g, (Context) this.h, (Uri) this.i, (ky) obj2, (String) this.j, (SnapshotStateMap) this.k, hmVar, 4);
            case 5:
                return new a3((Context) this.g, (q90) this.h, (MutableState) this.i, (SharedPreferences) obj2, (MutableState) this.j, (MutableState) this.k, hmVar, 5);
            case 6:
                return new a3((ky) obj2, (String) this.g, (jm) this.h, (MutableState) this.i, (un) this.k, (MutableState) this.j, hmVar);
            case 7:
                return new a3(hmVar, (ky) obj2, (q90) this.j, (Context) this.k);
            default:
                return new a3((MutableState) this.g, (MutableState) this.h, (MutableState) obj2, hmVar);
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
        return ((a3) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x021c, code lost:
    
        if (r5 == r10) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020c, code lost:
    
        if (r9 == r10) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r2 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x07ca, code lost:
    
        if (defpackage.p01.H(r1, r4, r21) != r10) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (f(r12, r9, r8, (java.util.List) r2, r21) == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x077c, code lost:
    
        if (r2 == r10) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
    
        if (r2 == r10) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035b A[Catch: Exception -> 0x02de, TryCatch #1 {Exception -> 0x02de, blocks: (B:127:0x02d6, B:129:0x041a, B:131:0x0425, B:133:0x043c, B:138:0x02ea, B:141:0x030e, B:144:0x0315, B:146:0x031c, B:148:0x032d, B:151:0x0334, B:152:0x0340, B:155:0x0349, B:157:0x035b, B:160:0x0365, B:201:0x036c, B:162:0x0373, B:164:0x037a, B:168:0x038c, B:166:0x0391, B:171:0x0396, B:173:0x039f, B:179:0x03e9, B:198:0x0451, B:199:0x0454, B:207:0x0339, B:195:0x044f, B:175:0x03db, B:178:0x03e6, B:190:0x044b, B:191:0x044e), top: B:123:0x02ce, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0373 A[Catch: Exception -> 0x02de, TryCatch #1 {Exception -> 0x02de, blocks: (B:127:0x02d6, B:129:0x041a, B:131:0x0425, B:133:0x043c, B:138:0x02ea, B:141:0x030e, B:144:0x0315, B:146:0x031c, B:148:0x032d, B:151:0x0334, B:152:0x0340, B:155:0x0349, B:157:0x035b, B:160:0x0365, B:201:0x036c, B:162:0x0373, B:164:0x037a, B:168:0x038c, B:166:0x0391, B:171:0x0396, B:173:0x039f, B:179:0x03e9, B:198:0x0451, B:199:0x0454, B:207:0x0339, B:195:0x044f, B:175:0x03db, B:178:0x03e6, B:190:0x044b, B:191:0x044e), top: B:123:0x02ce, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0396 A[Catch: Exception -> 0x02de, TryCatch #1 {Exception -> 0x02de, blocks: (B:127:0x02d6, B:129:0x041a, B:131:0x0425, B:133:0x043c, B:138:0x02ea, B:141:0x030e, B:144:0x0315, B:146:0x031c, B:148:0x032d, B:151:0x0334, B:152:0x0340, B:155:0x0349, B:157:0x035b, B:160:0x0365, B:201:0x036c, B:162:0x0373, B:164:0x037a, B:168:0x038c, B:166:0x0391, B:171:0x0396, B:173:0x039f, B:179:0x03e9, B:198:0x0451, B:199:0x0454, B:207:0x0339, B:195:0x044f, B:175:0x03db, B:178:0x03e6, B:190:0x044b, B:191:0x044e), top: B:123:0x02ce, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039f A[Catch: Exception -> 0x02de, TRY_LEAVE, TryCatch #1 {Exception -> 0x02de, blocks: (B:127:0x02d6, B:129:0x041a, B:131:0x0425, B:133:0x043c, B:138:0x02ea, B:141:0x030e, B:144:0x0315, B:146:0x031c, B:148:0x032d, B:151:0x0334, B:152:0x0340, B:155:0x0349, B:157:0x035b, B:160:0x0365, B:201:0x036c, B:162:0x0373, B:164:0x037a, B:168:0x038c, B:166:0x0391, B:171:0x0396, B:173:0x039f, B:179:0x03e9, B:198:0x0451, B:199:0x0454, B:207:0x0339, B:195:0x044f, B:175:0x03db, B:178:0x03e6, B:190:0x044b, B:191:0x044e), top: B:123:0x02ce, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object H;
        LocalSocket localSocket;
        Object H2;
        LocalSocket localSocket2;
        Throwable th;
        hq hqVar;
        z2 z2Var;
        Object invoke;
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        int i;
        File file;
        boolean z;
        Object c;
        String string;
        int i2;
        Object invoke2;
        String str5;
        Object invoke3;
        Object invoke4;
        MutableState mutableState;
        boolean booleanValue;
        Object o;
        Object e;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Object H3;
        int i3 = this.d;
        int i4 = 2;
        w01 w01Var = w01.a;
        boolean z2 = false;
        Object[] objArr = 0;
        vn vnVar = vn.d;
        Object obj2 = this.f;
        hm hmVar = null;
        switch (i3) {
            case 0:
                MutableState mutableState5 = (MutableState) this.k;
                MutableState mutableState6 = (MutableState) this.i;
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    nq nqVar = nr.a;
                    hq hqVar2 = hq.d;
                    w2 w2Var = new w2(i4, 1, null);
                    this.e = 1;
                    H = p01.H(hqVar2, w2Var, this);
                    break;
                } else if (i5 == 1) {
                    p10.Q(obj);
                    H = obj;
                } else {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            p10.Q(obj);
                            mutableState5.setValue(Boolean.FALSE);
                            return w01Var;
                        }
                        if (i5 != 4) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th2 = (Throwable) this.h;
                        p10.Q(obj);
                        throw th2;
                    }
                    localSocket2 = (LocalSocket) this.g;
                    try {
                        p10.Q(obj);
                        localSocket = localSocket2;
                        H2 = obj;
                        ((Boolean) H2).getClass();
                        nq nqVar2 = nr.a;
                        hq hqVar3 = hq.d;
                        z2 z2Var2 = new z2(localSocket, null, 0);
                        this.g = null;
                        this.e = 3;
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                        nq nqVar3 = nr.a;
                        hqVar = hq.d;
                        z2Var = new z2(localSocket2, null, 0);
                        this.g = null;
                        this.h = th;
                        this.e = 4;
                        if (p01.H(hqVar, z2Var, this) != vnVar) {
                        }
                        return vnVar;
                    }
                }
                localSocket = (LocalSocket) H;
                if (localSocket == null) {
                    b3.b(mutableState6, "Error: Lost connection to the root helper. Run Check again.");
                    MutableState mutableState7 = (MutableState) this.j;
                    Boolean bool = Boolean.FALSE;
                    mutableState7.setValue(bool);
                    mutableState5.setValue(bool);
                    return w01Var;
                }
                try {
                    y2 y2Var = new y2(mutableState6, 0);
                    this.g = localSocket;
                    this.e = 2;
                    nq nqVar4 = nr.a;
                    H2 = p01.H(hq.d, new a3(y2Var, (ky) obj2, localSocket, (hm) null), this);
                } catch (Throwable th4) {
                    th = th4;
                    localSocket2 = localSocket;
                    nq nqVar32 = nr.a;
                    hqVar = hq.d;
                    z2Var = new z2(localSocket2, null, 0);
                    this.g = null;
                    this.h = th;
                    this.e = 4;
                    if (p01.H(hqVar, z2Var, this) != vnVar) {
                        throw th;
                    }
                    return vnVar;
                }
                if (H2 == vnVar) {
                    return vnVar;
                }
                ((Boolean) H2).getClass();
                nq nqVar22 = nr.a;
                hq hqVar32 = hq.d;
                z2 z2Var22 = new z2(localSocket, null, 0);
                this.g = null;
                this.e = 3;
            case 1:
                LocalSocket localSocket3 = (LocalSocket) this.g;
                y2 y2Var2 = (y2) this.k;
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    String obj3 = ds0.E0(ts.w(localSocket3, "getprop ro.boot.slot_suffix").a).toString();
                    if (!q10.b(obj3, "_a") && !q10.b(obj3, "_b")) {
                        y2Var2.invoke("Error: Could not determine valid boot slot. Got: '" + obj3 + "'");
                        return Boolean.FALSE;
                    }
                    y2Var2.invoke("Current boot slot is: " + obj3);
                    String str6 = "/dev/block/bootdevice/by-name/boot" + obj3;
                    ts.w(localSocket3, "mkdir -p /data/adb/singularity");
                    uj0 w = ts.w(localSocket3, "dd if=" + str6 + " of=/data/adb/singularity/boot.img");
                    if (w.b != 0) {
                        y2Var2.invoke("Error copying boot partition: " + ds0.E0(w.a).toString());
                        return Boolean.FALSE;
                    }
                    this.h = str6;
                    this.i = "/data/adb/singularity";
                    this.j = "/data/adb/singularity/boot.img";
                    this.e = 1;
                    invoke = ((ky) obj2).invoke(this);
                    if (invoke == vnVar) {
                        return vnVar;
                    }
                    str = str6;
                    str2 = "/data/adb/singularity/boot.img";
                    str3 = "/data/adb/singularity";
                } else {
                    if (i6 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.j;
                    String str7 = (String) this.i;
                    String str8 = (String) this.h;
                    p10.Q(obj);
                    str3 = str7;
                    str = str8;
                    invoke = obj;
                }
                File file2 = (File) invoke;
                if (file2 == null) {
                    y2Var2.invoke("Error: Failed to prepare Magisk patch files.");
                    return Boolean.FALSE;
                }
                ts.w(localSocket3, "mkdir -p /data/adb/singularity/magisk_patcher");
                uj0 w2 = ts.w(localSocket3, "cp -r " + file2.getAbsolutePath() + "/. /data/adb/singularity/magisk_patcher/");
                if (w2.b != 0) {
                    y2Var2.invoke("Error copying patch files into place: " + ds0.E0(w2.a).toString());
                    return Boolean.FALSE;
                }
                y2Var2.invoke("Patching boot image with Magisk 30.7...");
                boolean b = q10.b(ds0.E0(ts.w(localSocket3, "LEGACYSAR=false; grep ' / ' /proc/mounts | grep -q '/dev/root' && LEGACYSAR=true; echo $LEGACYSAR").a).toString(), "true");
                if (b) {
                    y2Var2.invoke("Detected legacy system-as-root device -- will force kernel to honor the ramdisk (LEGACYSAR=true).");
                }
                String str9 = ts.w(localSocket3, "cd /data/adb/singularity/magisk_patcher && chmod 755 boot_patch.sh util_functions.sh init-ld magisk magiskboot magiskinit  && export KEEPVERITY=true && export KEEPFORCEENCRYPT=true && export MAGISKDIR=/data/adb/singularity/magisk_patcher && export LEGACYSAR=" + b + " && ./boot_patch.sh " + str2).a;
                if (!ds0.g0(str9, "- Repacking boot image", false)) {
                    y2Var2.invoke("Error: Magisk patch process failed.");
                    y2Var2.invoke("Output: \n".concat(str9));
                    return Boolean.FALSE;
                }
                String str10 = str3 + "/patched_boot.img";
                y2Var2.invoke("Moving patched image to ".concat(str10));
                ts.w(localSocket3, "mv /data/adb/singularity/magisk_patcher/new-boot.img ".concat(str10));
                String obj4 = ds0.E0(ts.w(localSocket3, "ls -lh ".concat(str10)).a).toString();
                if (ds0.g0(obj4, "No such file", false)) {
                    y2Var2.invoke("Error: Patched image not found at destination.");
                    return Boolean.FALSE;
                }
                y2Var2.invoke("Success! Patched boot image saved.");
                y2Var2.invoke(obj4);
                y2Var2.invoke("Flashing patched image back to " + str + "...");
                uj0 w3 = ts.w(localSocket3, "dd if=" + str10 + " of=" + str + " bs=4096 conv=fsync");
                if (w3.b != 0) {
                    y2Var2.invoke("Warning/Error during flash: \n" + ds0.E0(w3.a).toString());
                    return Boolean.FALSE;
                }
                y2Var2.invoke("Successfully flashed Magisk to the active slot!");
                y2Var2.invoke("Installing Magisk manager app...");
                uj0 w4 = ts.w(localSocket3, "cp " + new File(file2, "magisk.apk").getAbsolutePath() + " /data/local/tmp/magisk.apk");
                if (w4.b != 0) {
                    y2Var2.invoke("Warning: Failed to copy Magisk apk into place: " + ds0.E0(w4.a).toString());
                } else {
                    String str11 = ts.w(localSocket3, "pm install -r /data/local/tmp/magisk.apk").a;
                    if (ds0.g0(str11, "Success", true)) {
                        y2Var2.invoke("Magisk manager app installed.");
                    } else {
                        y2Var2.invoke("Warning: Magisk manager app install may have failed: " + ds0.E0(str11).toString());
                    }
                    ts.w(localSocket3, "rm -f /data/local/tmp/magisk.apk");
                }
                y2Var2.invoke("Rebooting...");
                ts.w(localSocket3, "svc power reboot");
                return Boolean.TRUE;
            case 2:
                String str12 = (String) this.j;
                String str13 = (String) this.i;
                ky kyVar = (ky) obj2;
                int i7 = this.e;
                try {
                    if (i7 == 0) {
                        p10.Q(obj);
                        kyVar.invoke("Finding latest release...");
                        JSONArray jSONArray = ts.k((String) this.h, str13, null, false, true, 28).getJSONArray("assets");
                        if (str12 != null && !ds0.n0(str12)) {
                            int length2 = jSONArray.length();
                            int i8 = 0;
                            while (i8 < length2) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                                String string2 = jSONObject.getString("name");
                                string2.getClass();
                                if (ks0.Z(string2, ".apk", z2) && ds0.g0(string2, str12, true)) {
                                    str4 = jSONObject.getString("browser_download_url");
                                    length = jSONArray.length();
                                    i = 0;
                                    while (true) {
                                        if (i < length && str4 == null) {
                                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                            string = jSONObject2.getString("name");
                                            string.getClass();
                                            if (ks0.Z(string, ".apk", false)) {
                                                i2 = length;
                                            } else {
                                                i2 = length;
                                                if (ds0.g0(string, "-signed", false)) {
                                                    str4 = jSONObject2.getString("browser_download_url");
                                                }
                                            }
                                            i++;
                                            length = i2;
                                        }
                                    }
                                    if (str4 == null) {
                                        int length3 = jSONArray.length();
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < length3) {
                                                JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                                                String string3 = jSONObject3.getString("name");
                                                string3.getClass();
                                                if (ks0.Z(string3, ".apk", false)) {
                                                    str4 = jSONObject3.getString("browser_download_url");
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    if (str4 != null) {
                                        kyVar.invoke("Error: No APK found in the latest release.");
                                        return Boolean.FALSE;
                                    }
                                    kyVar.invoke("Downloading " + str13 + "...");
                                    file = new File(((Context) this.k).getCacheDir(), str13 + ".apk");
                                    InputStream openStream = new URL(str4).openStream();
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            openStream.getClass();
                                            q10.k(openStream, fileOutputStream);
                                            fileOutputStream.close();
                                            openStream.close();
                                            kyVar.invoke("Installing...");
                                            zj0 zj0Var = zj0.a;
                                            String str14 = "pm install -r \"" + file.getAbsolutePath() + "\"";
                                            this.g = file;
                                            this.e = 1;
                                            z = false;
                                            c = zj0.c(str14, false, this);
                                            if (c == vnVar) {
                                                return vnVar;
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else {
                                    i8++;
                                    z2 = false;
                                }
                            }
                        }
                        str4 = null;
                        length = jSONArray.length();
                        i = 0;
                        while (true) {
                            if (i < length) {
                                JSONObject jSONObject22 = jSONArray.getJSONObject(i);
                                string = jSONObject22.getString("name");
                                string.getClass();
                                if (ks0.Z(string, ".apk", false)) {
                                }
                                i++;
                                length = i2;
                            }
                        }
                        if (str4 == null) {
                        }
                        if (str4 != null) {
                        }
                    } else {
                        if (i7 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file = (File) this.g;
                        p10.Q(obj);
                        c = obj;
                        z = false;
                    }
                    file.delete();
                    if (!ds0.g0((String) c, "Success", z)) {
                        kyVar.invoke("Installation failed.");
                        return Boolean.FALSE;
                    }
                    kyVar.invoke(str13 + " installed successfully!");
                    return Boolean.TRUE;
                } catch (Exception e2) {
                    kyVar.invoke("An error occurred: " + e2.getMessage());
                    e2.printStackTrace();
                    return Boolean.FALSE;
                }
            case 3:
                MutableState mutableState8 = (MutableState) this.k;
                MutableState mutableState9 = (MutableState) this.j;
                SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                my myVar = (my) this.h;
                int i10 = this.e;
                if (i10 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    invoke2 = myVar.invoke("oculuspreferences --getc automation_enabled_v2", this);
                    break;
                } else if (i10 == 1) {
                    p10.Q(obj);
                    invoke2 = obj;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                p10.Q(obj);
                                return w01Var;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutableState mutableState10 = (MutableState) this.i;
                        p10.Q(obj);
                        mutableState = mutableState10;
                        invoke4 = obj;
                        booleanValue = q10.b(ds0.E0((String) invoke4).toString(), "userdebug");
                        ni0 ni0Var = kb.a;
                        mutableState.setValue(Boolean.valueOf(booleanValue));
                        sharedPreferences.edit().putBoolean("automation_unlock_toggle_enabled", ((Boolean) mutableState8.getValue()).booleanValue()).apply();
                        if (sharedPreferences.getBoolean("dogfood_pending_step2", false)) {
                            return w01Var;
                        }
                        sharedPreferences.edit().remove("dogfood_pending_step2").apply();
                        this.g = null;
                        this.i = null;
                        this.e = 4;
                        if (myVar.invoke("am broadcast -a oculus.intent.action.DC_OVERRIDE --esa config_param_value oculus_systemshell:oculus_is_trusted_user:true\nstop\nstart", this) != vnVar) {
                            return w01Var;
                        }
                        return vnVar;
                    }
                    String str15 = (String) this.g;
                    p10.Q(obj);
                    str5 = str15;
                    invoke3 = obj;
                    Boolean o2 = kb.o(str5);
                    Boolean o3 = kb.o((String) invoke3);
                    mutableState9.setValue(o2 != null ? "automation_enabled_v2" : o3 != null ? "automation_enabled" : null);
                    String str16 = (String) mutableState9.getValue();
                    if (q10.b(str16, "automation_enabled_v2")) {
                        if (o2 != null) {
                            booleanValue = o2.booleanValue();
                            mutableState = mutableState8;
                        }
                        mutableState = mutableState8;
                        booleanValue = false;
                    } else {
                        if (!q10.b(str16, "automation_enabled")) {
                            this.g = null;
                            this.i = mutableState8;
                            this.e = 3;
                            invoke4 = myVar.invoke("getprop ro.build.type", this);
                            if (invoke4 != vnVar) {
                                mutableState = mutableState8;
                                booleanValue = q10.b(ds0.E0((String) invoke4).toString(), "userdebug");
                            }
                            return vnVar;
                        }
                        if (o3 != null) {
                            booleanValue = o3.booleanValue();
                            mutableState = mutableState8;
                        }
                        mutableState = mutableState8;
                        booleanValue = false;
                    }
                    ni0 ni0Var2 = kb.a;
                    mutableState.setValue(Boolean.valueOf(booleanValue));
                    sharedPreferences.edit().putBoolean("automation_unlock_toggle_enabled", ((Boolean) mutableState8.getValue()).booleanValue()).apply();
                    if (sharedPreferences.getBoolean("dogfood_pending_step2", false)) {
                    }
                }
                str5 = (String) invoke2;
                this.g = str5;
                this.e = 2;
                invoke3 = myVar.invoke("oculuspreferences --getc automation_enabled", this);
                break;
            case 4:
                String str17 = (String) this.j;
                int i11 = this.e;
                if (i11 == 0) {
                    p10.Q(obj);
                    oy oyVar = ((b8) this.g).d;
                    Context context = (Context) this.h;
                    g gVar = new g(i4, (SnapshotStateMap) this.k, str17);
                    Uri uri = (Uri) this.i;
                    this.e = 1;
                    if (oyVar.invoke(context, gVar, uri, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i11 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                ((ky) obj2).invoke(str17);
                return w01Var;
            case 5:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj2;
                Context context2 = (Context) this.g;
                q90 q90Var = (q90) this.h;
                int i12 = this.e;
                if (i12 == 0) {
                    p10.Q(obj);
                    ts tsVar = ts.m;
                    wa waVar = new wa((MutableState) this.i, q90Var, objArr == true ? 1 : 0);
                    this.e = 1;
                    o = tsVar.o(context2, q90Var, waVar, this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            p10.Q(obj);
                            return w01Var;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    o = ((kj0) obj).d;
                }
                if (!(o instanceof jj0)) {
                    sharedPreferences2.edit().putString("magisk_module_id_".concat(q90Var.a), (String) o).apply();
                }
                MutableState mutableState11 = (MutableState) this.j;
                MutableState mutableState12 = (MutableState) this.k;
                MutableState mutableState13 = (MutableState) this.i;
                this.e = 2;
                if (kb.f(context2, mutableState11, mutableState12, sharedPreferences2, mutableState13, false, this) != vnVar) {
                    return w01Var;
                }
                return vnVar;
            case 6:
                jm jmVar = (jm) this.h;
                String str18 = (String) this.g;
                MutableState mutableState14 = (MutableState) this.i;
                int i13 = this.e;
                if (i13 == 0) {
                    p10.Q(obj);
                    mutableState14.setValue(Boolean.TRUE);
                    ((ky) obj2).invoke("Scanning and pairing " + str18 + " (15s timeout)...");
                    String str19 = "rstest scanAndPair " + str18 + " 15000";
                    this.e = 1;
                    if (zj0.c(str19, false, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i13 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                um.c((un) this.k, jmVar, mutableState14, (MutableState) this.j);
                return w01Var;
            case 7:
                return e(obj);
            default:
                MutableState mutableState15 = (MutableState) obj2;
                MutableState mutableState16 = (MutableState) this.h;
                MutableState mutableState17 = (MutableState) this.g;
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    pz pzVar = pz.a;
                    this.i = mutableState17;
                    this.j = mutableState16;
                    this.k = mutableState15;
                    this.e = 1;
                    e = pz.e(this);
                    if (e != vnVar) {
                        mutableState2 = mutableState16;
                        mutableState3 = mutableState17;
                        mutableState4 = mutableState15;
                    }
                    return vnVar;
                }
                if (i14 == 1) {
                    MutableState mutableState18 = (MutableState) this.k;
                    MutableState mutableState19 = (MutableState) this.j;
                    MutableState mutableState20 = (MutableState) this.i;
                    p10.Q(obj);
                    mutableState3 = mutableState20;
                    mutableState2 = mutableState19;
                    mutableState4 = mutableState18;
                    e = obj;
                } else if (i14 == 2) {
                    p10.Q(obj);
                    pz pzVar2 = pz.a;
                    this.e = 3;
                    nq nqVar5 = nr.a;
                    H3 = p01.H(hq.d, new o3(i4, 7, hmVar), this);
                    break;
                } else {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        return w01Var;
                    }
                    p10.Q(obj);
                    H3 = obj;
                    List list = (List) H3;
                    if (list == null) {
                        return w01Var;
                    }
                    this.i = null;
                    this.e = 4;
                    if (f(mutableState17, mutableState16, mutableState15, list, this) != vnVar) {
                        return w01Var;
                    }
                    return vnVar;
                }
                this.i = null;
                this.j = null;
                this.k = null;
                this.e = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(hm hmVar, ky kyVar, q90 q90Var, Context context) {
        super(2, hmVar);
        this.d = 7;
        this.f = kyVar;
        this.j = q90Var;
        this.k = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ky kyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.d = 0;
        this.f = kyVar;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(y2 y2Var, ky kyVar, LocalSocket localSocket, hm hmVar) {
        super(2, hmVar);
        this.d = 1;
        this.k = y2Var;
        this.f = kyVar;
        this.g = localSocket;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ky kyVar, String str, String str2, String str3, Context context, hm hmVar) {
        super(2, hmVar);
        this.d = 2;
        this.f = kyVar;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(my myVar, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.h = myVar;
        this.f = sharedPreferences;
        this.j = mutableState;
        this.k = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.d = 8;
        this.g = mutableState;
        this.h = mutableState2;
        this.f = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = obj4;
        this.j = obj5;
        this.k = obj6;
    }
}
