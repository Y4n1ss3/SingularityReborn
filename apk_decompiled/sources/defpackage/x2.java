package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x2 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(ArrayList arrayList, SnapshotStateMap snapshotStateMap, Context context, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.f = arrayList;
        this.h = snapshotStateMap;
        this.i = context;
        this.g = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new x2((SharedPreferences) this.f, (MutableState) this.g, (MutableState) this.h, (MutableState) this.i, hmVar, 0);
            case 1:
                return new x2((ky) this.g, (Context) this.h, (Uri) this.i, hmVar, 1);
            case 2:
                return new x2((b8) this.f, (Context) this.g, (ky) this.h, (SnapshotStateMap) this.i, hmVar, 2);
            case 3:
                return new x2((ArrayList) this.f, (SnapshotStateMap) this.h, (Context) this.i, (MutableState) this.g, hmVar);
            case 4:
                x2 x2Var = new x2((iw) this.g, (wr0) this.h, (Float) this.i, hmVar, 4);
                x2Var.f = obj;
                return x2Var;
            case 5:
                return new x2((tr0) this.f, (iw) this.g, (wr0) this.h, (Float) this.i, hmVar, 5);
            case 6:
                return new x2(2, hmVar);
            default:
                return new x2((ky) this.h, (Context) this.i, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
        }
        return ((x2) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0342, code lost:
    
        if (r6 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0324, code lost:
    
        if (r2 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0309, code lost:
    
        if (r3 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f0, code lost:
    
        if (r4 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0411, code lost:
    
        if (r5.collect(r6, r26) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03ed, code lost:
    
        if (r5.collect(r6, r26) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0408, code lost:
    
        if (defpackage.cq.p(r1, r2, r26) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0467, code lost:
    
        if (defpackage.y80.k(r9, r20, r26) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d9, code lost:
    
        if (r0 == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036e A[Catch: Exception -> 0x03a1, TryCatch #11 {Exception -> 0x03a1, blocks: (B:106:0x0289, B:108:0x035f, B:112:0x0368, B:114:0x036e, B:116:0x0378, B:119:0x0387, B:125:0x0380, B:129:0x029d, B:131:0x0340, B:134:0x0345, B:136:0x0349, B:140:0x02ac, B:142:0x0322, B:145:0x0327, B:147:0x032b, B:151:0x02b9, B:152:0x0307, B:155:0x030c, B:157:0x0310, B:160:0x02c0, B:161:0x02ee, B:164:0x02f3, B:166:0x02f7, B:169:0x02c6, B:170:0x02da, B:172:0x02de, B:176:0x02cd), top: B:101:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0349 A[Catch: Exception -> 0x03a1, TryCatch #11 {Exception -> 0x03a1, blocks: (B:106:0x0289, B:108:0x035f, B:112:0x0368, B:114:0x036e, B:116:0x0378, B:119:0x0387, B:125:0x0380, B:129:0x029d, B:131:0x0340, B:134:0x0345, B:136:0x0349, B:140:0x02ac, B:142:0x0322, B:145:0x0327, B:147:0x032b, B:151:0x02b9, B:152:0x0307, B:155:0x030c, B:157:0x0310, B:160:0x02c0, B:161:0x02ee, B:164:0x02f3, B:166:0x02f7, B:169:0x02c6, B:170:0x02da, B:172:0x02de, B:176:0x02cd), top: B:101:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032b A[Catch: Exception -> 0x03a1, TryCatch #11 {Exception -> 0x03a1, blocks: (B:106:0x0289, B:108:0x035f, B:112:0x0368, B:114:0x036e, B:116:0x0378, B:119:0x0387, B:125:0x0380, B:129:0x029d, B:131:0x0340, B:134:0x0345, B:136:0x0349, B:140:0x02ac, B:142:0x0322, B:145:0x0327, B:147:0x032b, B:151:0x02b9, B:152:0x0307, B:155:0x030c, B:157:0x0310, B:160:0x02c0, B:161:0x02ee, B:164:0x02f3, B:166:0x02f7, B:169:0x02c6, B:170:0x02da, B:172:0x02de, B:176:0x02cd), top: B:101:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0310 A[Catch: Exception -> 0x03a1, TryCatch #11 {Exception -> 0x03a1, blocks: (B:106:0x0289, B:108:0x035f, B:112:0x0368, B:114:0x036e, B:116:0x0378, B:119:0x0387, B:125:0x0380, B:129:0x029d, B:131:0x0340, B:134:0x0345, B:136:0x0349, B:140:0x02ac, B:142:0x0322, B:145:0x0327, B:147:0x032b, B:151:0x02b9, B:152:0x0307, B:155:0x030c, B:157:0x0310, B:160:0x02c0, B:161:0x02ee, B:164:0x02f3, B:166:0x02f7, B:169:0x02c6, B:170:0x02da, B:172:0x02de, B:176:0x02cd), top: B:101:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f7 A[Catch: Exception -> 0x03a1, TryCatch #11 {Exception -> 0x03a1, blocks: (B:106:0x0289, B:108:0x035f, B:112:0x0368, B:114:0x036e, B:116:0x0378, B:119:0x0387, B:125:0x0380, B:129:0x029d, B:131:0x0340, B:134:0x0345, B:136:0x0349, B:140:0x02ac, B:142:0x0322, B:145:0x0327, B:147:0x032b, B:151:0x02b9, B:152:0x0307, B:155:0x030c, B:157:0x0310, B:160:0x02c0, B:161:0x02ee, B:164:0x02f3, B:166:0x02f7, B:169:0x02c6, B:170:0x02da, B:172:0x02de, B:176:0x02cd), top: B:101:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02de A[Catch: Exception -> 0x03a1, TryCatch #11 {Exception -> 0x03a1, blocks: (B:106:0x0289, B:108:0x035f, B:112:0x0368, B:114:0x036e, B:116:0x0378, B:119:0x0387, B:125:0x0380, B:129:0x029d, B:131:0x0340, B:134:0x0345, B:136:0x0349, B:140:0x02ac, B:142:0x0322, B:145:0x0327, B:147:0x032b, B:151:0x02b9, B:152:0x0307, B:155:0x030c, B:157:0x0310, B:160:0x02c0, B:161:0x02ee, B:164:0x02f3, B:166:0x02f7, B:169:0x02c6, B:170:0x02da, B:172:0x02de, B:176:0x02cd), top: B:101:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2 A[Catch: Exception -> 0x0036, TryCatch #5 {Exception -> 0x0036, blocks: (B:9:0x002d, B:11:0x01de, B:13:0x01e9, B:17:0x01f1, B:22:0x0047, B:23:0x019b, B:25:0x01a4, B:28:0x01af, B:32:0x020b, B:35:0x004f, B:39:0x0077, B:41:0x008d, B:44:0x0097, B:46:0x00ab, B:48:0x00b2, B:50:0x00c8, B:52:0x00d2, B:55:0x00da, B:57:0x00f2, B:59:0x0118, B:65:0x0153, B:83:0x0228, B:84:0x022b, B:86:0x00e1, B:93:0x009e, B:80:0x0226, B:61:0x0145, B:64:0x0150, B:75:0x0222, B:76:0x0225), top: B:4:0x0023, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #5 {Exception -> 0x0036, blocks: (B:9:0x002d, B:11:0x01de, B:13:0x01e9, B:17:0x01f1, B:22:0x0047, B:23:0x019b, B:25:0x01a4, B:28:0x01af, B:32:0x020b, B:35:0x004f, B:39:0x0077, B:41:0x008d, B:44:0x0097, B:46:0x00ab, B:48:0x00b2, B:50:0x00c8, B:52:0x00d2, B:55:0x00da, B:57:0x00f2, B:59:0x0118, B:65:0x0153, B:83:0x0228, B:84:0x022b, B:86:0x00e1, B:93:0x009e, B:80:0x0226, B:61:0x0145, B:64:0x0150, B:75:0x0222, B:76:0x0225), top: B:4:0x0023, inners: #3, #6 }] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object H;
        ji0 ji0Var;
        FileOutputStream fileOutputStream;
        Object c;
        File file;
        String str;
        Object i;
        String str2;
        String str3;
        Object i2;
        String str4;
        String str5;
        Object i3;
        String str6;
        String str7;
        Object i4;
        String str8;
        String str9;
        Object i5;
        String str10;
        Integer e0;
        int i6;
        String str11;
        boolean z;
        String str12;
        Context context;
        String str13;
        JSONArray jSONArray;
        String str14;
        File file2;
        File file3;
        int i7;
        boolean z2;
        Object c2;
        switch (this.d) {
            case 0:
                MutableState mutableState = (MutableState) this.g;
                vn vnVar = vn.d;
                int i8 = this.e;
                if (i8 == 0) {
                    p10.Q(obj);
                    b3.b(mutableState, "Connecting to root helper...");
                    nq nqVar = nr.a;
                    hq hqVar = hq.d;
                    w2 w2Var = new w2(2, 0, null);
                    this.e = 1;
                    H = p01.H(hqVar, w2Var, this);
                    if (H == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i8 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    H = obj;
                }
                uj0 uj0Var = (uj0) H;
                if (uj0Var == null) {
                    b3.b(mutableState, "Could not connect. Make sure you ran the command above and the helper is still running.");
                } else {
                    int i9 = uj0Var.b;
                    String str15 = uj0Var.a;
                    if (i9 == 0 && ds0.g0(str15, "uid=0", false)) {
                        ((MutableState) this.h).setValue(Boolean.TRUE);
                        ((SharedPreferences) this.f).edit().putBoolean("use_root_helper", true).apply();
                        b3.b(mutableState, "Root verified (" + ds0.E0(str15).toString() + ").\nYou can now patch boot.img.");
                    } else {
                        b3.b(mutableState, "Connected, but didn't get root: " + ds0.E0(str15).toString() + " (exit " + i9 + ")");
                    }
                }
                ((MutableState) this.i).setValue(Boolean.FALSE);
                return w01.a;
            case 1:
                Context context2 = (Context) this.h;
                ky kyVar = (ky) this.g;
                vn vnVar2 = vn.d;
                int i10 = this.e;
                if (i10 == 0) {
                    p10.Q(obj);
                    ji0 ji0Var2 = new ji0();
                    try {
                        kyVar.invoke("Preparing file for installation...");
                        ji0Var2.d = new File(context2.getCacheDir(), "Local APK_temp.apk");
                        InputStream openInputStream = context2.getContentResolver().openInputStream((Uri) this.i);
                        if (openInputStream != null) {
                            try {
                                fileOutputStream = new FileOutputStream((File) ji0Var2.d);
                                try {
                                    long k = q10.k(openInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    new Long(k);
                                    openInputStream.close();
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                            }
                        }
                        Object obj2 = ji0Var2.d;
                        if (obj2 != null && ((File) obj2).exists()) {
                            kyVar.invoke("Installing...");
                            zj0 zj0Var = zj0.a;
                            String str16 = "pm install -r \"" + ((File) ji0Var2.d).getAbsolutePath() + "\"";
                            this.f = ji0Var2;
                            this.e = 1;
                            c = zj0.c(str16, false, this);
                            if (c == vnVar2) {
                                return vnVar2;
                            }
                            ji0Var = ji0Var2;
                        }
                        kyVar.invoke("Error: Could not read selected file.");
                        return Boolean.FALSE;
                    } catch (Exception e) {
                        e = e;
                        ji0Var = ji0Var2;
                        kyVar.invoke("An error occurred: " + e.getMessage());
                        e.printStackTrace();
                        file = (File) ji0Var.d;
                        if (file != null) {
                        }
                        return Boolean.FALSE;
                    }
                }
                if (i10 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ji0Var = (ji0) this.f;
                try {
                    p10.Q(obj);
                    c = obj;
                } catch (Exception e2) {
                    e = e2;
                    kyVar.invoke("An error occurred: " + e.getMessage());
                    e.printStackTrace();
                    file = (File) ji0Var.d;
                    if (file != null) {
                        file.delete();
                    }
                    return Boolean.FALSE;
                }
                String str17 = (String) c;
                ((File) ji0Var.d).delete();
                if (ds0.g0(str17, "Success", false)) {
                    kyVar.invoke("Local APK installed successfully!");
                    return Boolean.TRUE;
                }
                kyVar.invoke("Installation failed. Output: " + ds0.C0(500, str17) + "...");
                return Boolean.FALSE;
            case 2:
                b8 b8Var = (b8) this.f;
                vn vnVar3 = vn.d;
                int i11 = this.e;
                if (i11 == 0) {
                    p10.Q(obj);
                    oy oyVar = b8Var.d;
                    Context context3 = (Context) this.g;
                    a4 a4Var = new a4(1, (SnapshotStateMap) this.i, b8Var);
                    this.e = 1;
                    if (oyVar.invoke(context3, a4Var, null, this) == vnVar3) {
                        return vnVar3;
                    }
                } else {
                    if (i11 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                ((ky) this.h).invoke(b8Var.c);
                return w01.a;
            case 3:
                vn vnVar4 = vn.d;
                int i12 = this.e;
                if (i12 == 0) {
                    p10.Q(obj);
                    nq nqVar2 = nr.a;
                    hq hqVar2 = hq.d;
                    pa paVar = new pa((ArrayList) this.f, (SnapshotStateMap) this.h, (Context) this.i, (MutableState) this.g, null);
                    this.e = 1;
                    if (p01.H(hqVar2, paVar, this) == vnVar4) {
                        return vnVar4;
                    }
                } else {
                    if (i12 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            case 4:
                wr0 wr0Var = (wr0) this.h;
                vn vnVar5 = vn.d;
                int i13 = this.e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p10.Q(obj);
                        return w01.a;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                int ordinal = ((dp0) this.f).ordinal();
                if (ordinal == 0) {
                    iw iwVar = (iw) this.g;
                    this.e = 1;
                    if (iwVar.collect(wr0Var, this) == vnVar5) {
                        return vnVar5;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        o.n();
                        return null;
                    }
                    Float f = (Float) this.i;
                    if (f == p01.e) {
                        wr0Var.a();
                        throw null;
                    }
                    wr0Var.i(f);
                }
                return w01.a;
            case 5:
                bl blVar = p01.c;
                fo0 fo0Var = p01.b;
                iw iwVar2 = (iw) this.g;
                wr0 wr0Var2 = (wr0) this.h;
                vn vnVar6 = vn.d;
                int i14 = this.e;
                if (i14 == 0) {
                    p10.Q(obj);
                    tr0 tr0Var = (tr0) this.f;
                    if (tr0Var != ep0.a) {
                        hm hmVar = null;
                        if (tr0Var != ep0.b) {
                            ms0 h = wr0Var2.h();
                            sr0 sr0Var = new sr0(tr0Var, null);
                            int i15 = bx.a;
                            iw swVar = new sw(new hh(sr0Var, h, st.d, -2, mf.d), new z2(2, hmVar), 0);
                            if (!(swVar instanceof ur0)) {
                                swVar = p01.j(swVar, fo0Var, blVar);
                            }
                            if (!(swVar instanceof ur0)) {
                                swVar = p01.j(swVar, fo0Var, blVar);
                            }
                            x2 x2Var = new x2(iwVar2, wr0Var2, (Float) this.i, hmVar, 4);
                            this.e = 4;
                            break;
                        } else {
                            ms0 h2 = wr0Var2.h();
                            z9 z9Var = new z9(2, 24, hmVar);
                            this.e = 2;
                            break;
                        }
                    } else {
                        this.e = 1;
                        break;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            p10.Q(obj);
                            this.e = 3;
                            break;
                        } else if (i14 != 3 && i14 != 4) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    p10.Q(obj);
                    return w01.a;
                }
                return vnVar6;
            case 6:
                Object obj3 = vn.d;
                String str18 = "";
                try {
                    switch (this.e) {
                        case 0:
                            p10.Q(obj);
                            pz pzVar = pz.a;
                            this.e = 1;
                            if (pzVar.j(this) == obj3) {
                                return obj3;
                            }
                            str = pz.l;
                            if (str != null) {
                                pz pzVar2 = pz.a;
                                this.f = null;
                                this.e = 2;
                                i = pzVar2.i(str, this);
                                if (i == obj3) {
                                    return obj3;
                                }
                                str2 = (String) i;
                                break;
                            }
                            str2 = "";
                            str3 = pz.m;
                            if (str3 != null) {
                                pz pzVar3 = pz.a;
                                this.f = str2;
                                this.g = null;
                                this.e = 3;
                                i2 = pzVar3.i(str3, this);
                                if (i2 == obj3) {
                                    return obj3;
                                }
                                str4 = (String) i2;
                                break;
                            }
                            str4 = "";
                            str5 = pz.n;
                            if (str5 != null) {
                                pz pzVar4 = pz.a;
                                this.f = str2;
                                this.g = str4;
                                this.h = null;
                                this.e = 4;
                                i3 = pzVar4.i(str5, this);
                                if (i3 == obj3) {
                                    return obj3;
                                }
                                str6 = (String) i3;
                                break;
                            }
                            str6 = "";
                            str7 = pz.o;
                            if (str7 != null) {
                                pz pzVar5 = pz.a;
                                this.f = str2;
                                this.g = str4;
                                this.h = str6;
                                this.i = null;
                                this.e = 5;
                                i4 = pzVar5.i(str7, this);
                                if (i4 == obj3) {
                                    return obj3;
                                }
                                str8 = (String) i4;
                                break;
                            }
                            str8 = "";
                            str9 = pz.p;
                            if (str9 != null) {
                                pz pzVar6 = pz.a;
                                this.f = str2;
                                this.g = str4;
                                this.h = str6;
                                this.i = str8;
                                this.e = 6;
                                i5 = pzVar6.i(str9, this);
                                if (i5 != obj3) {
                                    str10 = str8;
                                    str11 = (String) i5;
                                    if (str11 != null) {
                                        str8 = str10;
                                    } else {
                                        str18 = str11;
                                        e0 = ks0.e0(str18);
                                        if (e0 != null) {
                                            int intValue = e0.intValue();
                                            if (hr.c()) {
                                                intValue /= 10;
                                            } else if (intValue > 1000) {
                                                intValue /= 1000;
                                            }
                                            i6 = intValue;
                                        } else {
                                            i6 = 0;
                                        }
                                        String str19 = str10;
                                        pz pzVar7 = pz.a;
                                        obj3 = new gz(i6, pz.a(str2), pz.a(str4), pz.a(str6), pz.h(str19));
                                    }
                                }
                                return obj3;
                            }
                            str10 = str8;
                            e0 = ks0.e0(str18);
                            if (e0 != null) {
                            }
                            String str192 = str10;
                            pz pzVar72 = pz.a;
                            obj3 = new gz(i6, pz.a(str2), pz.a(str4), pz.a(str6), pz.h(str192));
                            return obj3;
                        case 1:
                            p10.Q(obj);
                            str = pz.l;
                            if (str != null) {
                            }
                            str2 = "";
                            str3 = pz.m;
                            if (str3 != null) {
                            }
                            str4 = "";
                            str5 = pz.n;
                            if (str5 != null) {
                            }
                            str6 = "";
                            str7 = pz.o;
                            if (str7 != null) {
                            }
                            str8 = "";
                            str9 = pz.p;
                            if (str9 != null) {
                            }
                            str10 = str8;
                            e0 = ks0.e0(str18);
                            if (e0 != null) {
                            }
                            String str1922 = str10;
                            pz pzVar722 = pz.a;
                            obj3 = new gz(i6, pz.a(str2), pz.a(str4), pz.a(str6), pz.h(str1922));
                            return obj3;
                        case 2:
                            p10.Q(obj);
                            i = obj;
                            str2 = (String) i;
                            break;
                        case 3:
                            String str20 = (String) this.f;
                            p10.Q(obj);
                            str2 = str20;
                            i2 = obj;
                            str4 = (String) i2;
                            break;
                        case 4:
                            String str21 = (String) this.g;
                            String str22 = (String) this.f;
                            p10.Q(obj);
                            str2 = str22;
                            str4 = str21;
                            i3 = obj;
                            str6 = (String) i3;
                            break;
                        case 5:
                            str6 = (String) this.h;
                            str4 = (String) this.g;
                            str2 = (String) this.f;
                            p10.Q(obj);
                            i4 = obj;
                            str8 = (String) i4;
                            break;
                        case 6:
                            str10 = (String) this.i;
                            str6 = (String) this.h;
                            str4 = (String) this.g;
                            String str23 = (String) this.f;
                            p10.Q(obj);
                            str2 = str23;
                            i5 = obj;
                            str11 = (String) i5;
                            if (str11 != null) {
                            }
                            break;
                        default:
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Exception e3) {
                    Log.e("GpuUtils", "Failed to read GPU info", e3);
                    return new gz();
                }
            default:
                Context context4 = (Context) this.i;
                ky kyVar2 = (ky) this.h;
                vn vnVar7 = vn.d;
                int i16 = this.e;
                try {
                } catch (Exception e4) {
                    Log.e("ModuleRepoManager", "downloadAndInstallVectorManagerApk failed: " + e4.getClass().getSimpleName() + ": " + e4.getMessage());
                    String message = e4.getMessage();
                    StringBuilder sb = new StringBuilder("An error occurred: ");
                    sb.append(message);
                    kyVar2.invoke(sb.toString());
                }
                if (i16 == 0) {
                    p10.Q(obj);
                    kyVar2.invoke("Finding latest Vector release...");
                    JSONArray jSONArray2 = ts.k("JingMatrix", "Vector", null, false, false, 60).getJSONArray("assets");
                    int length = jSONArray2.length();
                    int i17 = 0;
                    while (true) {
                        str12 = "name";
                        if (i17 < length) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i17);
                            context = context4;
                            String string = jSONObject.getString("name");
                            string.getClass();
                            int i18 = length;
                            if (ks0.Z(string, ".zip", true)) {
                                i7 = i17;
                                if (ds0.g0(string, "release", true)) {
                                    str13 = jSONObject.getString("browser_download_url");
                                }
                            } else {
                                i7 = i17;
                            }
                            i17 = i7 + 1;
                            length = i18;
                            context4 = context;
                        } else {
                            context = context4;
                            str13 = null;
                        }
                    }
                    if (str13 == null) {
                        int length2 = jSONArray2.length();
                        int i19 = 0;
                        while (i19 < length2) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i19);
                            String str24 = str13;
                            String string2 = jSONObject2.getString(str12);
                            string2.getClass();
                            String str25 = str12;
                            if (ks0.Z(string2, ".zip", true)) {
                                jSONArray = jSONArray2;
                                if (!ks0.c0(string2, "Source code", true) && !ds0.g0(string2, "debug", true)) {
                                    str14 = jSONObject2.getString("browser_download_url");
                                    if (str14 != null) {
                                        kyVar2.invoke("Error: no Release module zip found in Vector's latest release.");
                                        Log.e("ModuleRepoManager", "downloadAndInstallVectorManagerApk: no Release zip among " + jSONArray.length() + " assets");
                                        return Boolean.FALSE;
                                    }
                                    Log.d("ModuleRepoManager", "downloadAndInstallVectorManagerApk: using zip " + str14);
                                    kyVar2.invoke("Downloading Vector...");
                                    file2 = new File(context.getCacheDir(), "vector_module_tmp.zip");
                                    InputStream openStream = new URL(str14).openStream();
                                    try {
                                        fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            openStream.getClass();
                                            q10.k(openStream, fileOutputStream);
                                            fileOutputStream.close();
                                            openStream.close();
                                            kyVar2.invoke("Extracting manager.apk...");
                                            file3 = new File(context.getCacheDir(), "vector_manager_tmp.apk");
                                            zj0 zj0Var2 = zj0.a;
                                            String str26 = "unzip -p \"" + file2.getAbsolutePath() + "\" manager.apk > \"" + file3.getAbsolutePath() + "\"";
                                            this.f = file2;
                                            this.g = file3;
                                            this.e = 1;
                                            if (zj0.c(str26, false, this) == vnVar7) {
                                                return vnVar7;
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                jSONArray = jSONArray2;
                            }
                            i19++;
                            str13 = str24;
                            str12 = str25;
                            jSONArray2 = jSONArray;
                        }
                    }
                    jSONArray = jSONArray2;
                    str14 = str13;
                    if (str14 != null) {
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        File file4 = (File) this.g;
                        p10.Q(obj);
                        file3 = file4;
                        z2 = false;
                        c2 = obj;
                        String str27 = (String) c2;
                        file3.delete();
                        if (ds0.g0(str27, "Success", z2)) {
                            kyVar2.invoke("Vector manager installed successfully!");
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        kyVar2.invoke("Installation failed.");
                        Log.e("ModuleRepoManager", "downloadAndInstallVectorManagerApk: pm install failed: " + str27);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    file3 = (File) this.g;
                    file2 = (File) this.f;
                    p10.Q(obj);
                }
                file2.delete();
                if (file3.exists() && file3.length() != 0) {
                    kyVar2.invoke("Installing Vector manager...");
                    zj0 zj0Var3 = zj0.a;
                    String str28 = "pm install -r \"" + file3.getAbsolutePath() + "\"";
                    this.f = null;
                    this.g = file3;
                    this.e = 2;
                    z2 = false;
                    c2 = zj0.c(str28, false, this);
                    break;
                }
                kyVar2.invoke("Error: couldn't extract manager.apk from the release zip.");
                Log.e("ModuleRepoManager", "downloadAndInstallVectorManagerApk: extracted apk missing or empty");
                file3.delete();
                return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(ky kyVar, Context context, hm hmVar) {
        super(2, hmVar);
        this.d = 7;
        this.h = kyVar;
        this.i = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Object obj2, Comparable comparable, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = obj;
        this.h = obj2;
        this.i = comparable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Object obj2, Object obj3, Object obj4, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(int i, hm hmVar) {
        super(i, hmVar);
        this.d = 6;
    }
}
