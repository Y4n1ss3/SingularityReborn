package defpackage;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x3 extends us0 implements my {
    public Integer d;
    public String e;
    public String f;
    public int g;
    public int h;
    public final /* synthetic */ File i;
    public final /* synthetic */ ky j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ String l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ iy o;
    public final /* synthetic */ iy p;
    public final /* synthetic */ iy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(File file, ky kyVar, Context context, String str, boolean z, boolean z2, iy iyVar, iy iyVar2, iy iyVar3, hm hmVar) {
        super(2, hmVar);
        this.i = file;
        this.j = kyVar;
        this.k = context;
        this.l = str;
        this.m = z;
        this.n = z2;
        this.o = iyVar;
        this.p = iyVar2;
        this.q = iyVar3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new x3(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((x3) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:193|(1:194)|195|196|197|198|(2:200|(3:210|(3:212|213|(7:216|(1:218)|188|189|190|191|(2:225|(1:207)(4:209|180|(1:182)|183))(0))(3:215|205|(0)(0)))|16)(3:204|205|(0)(0)))|220|(1:202)|210|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0674, code lost:
    
        if (defpackage.j4.h(r10, r9, new java.lang.String[]{"-s", "127.0.0.1:5555", "shell", "pm", "uninstall", r7}, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x06b4, code lost:
    
        if (r1 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x06f8, code lost:
    
        if (r6 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x050e, code lost:
    
        if (r3 != r12) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04e8, code lost:
    
        if (r3 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04d6, code lost:
    
        if (defpackage.y80.p(1500, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04b2, code lost:
    
        if (r3 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0418, code lost:
    
        if (r5 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0406, code lost:
    
        if (defpackage.y80.p(2000, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03d6, code lost:
    
        if (r5 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0354, code lost:
    
        if (r5 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x08a6, code lost:
    
        if (r1 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x032c, code lost:
    
        if (defpackage.y80.p(2000, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0239, code lost:
    
        if (r8 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0224, code lost:
    
        if (defpackage.j4.g(r2, r9, r11, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x073f, code lost:
    
        if (r13 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x075a, code lost:
    
        if (r13 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0841, code lost:
    
        if (defpackage.j4.h(r10, r9, new java.lang.String[]{"-s", "127.0.0.1:5555", "shell", "pm", "uninstall", r8}, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0882, code lost:
    
        if (r1 == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0720, code lost:
    
        if (defpackage.y80.p(1500, r31) == r12) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0571, code lost:
    
        if (r6 != r12) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x08e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x08e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0544  */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v31, types: [hm, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v35, types: [hm, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v56, types: [hm, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x05ca -> B:82:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x0316 -> B:188:0x0333). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x032c -> B:189:0x0330). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x07a9 -> B:31:0x0092). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        Object h;
        Integer num;
        String str3;
        String str4;
        String str5;
        int i2;
        Object obj2;
        Integer num2;
        String str6;
        Object h2;
        Object h3;
        Object h4;
        Object h5;
        Integer num3;
        Object h6;
        Object h7;
        Context context;
        Object obj3;
        String str7;
        String str8;
        Object h8;
        int i3;
        String str9;
        ?? r8;
        Object obj4;
        Context context2;
        String str10;
        ?? r13;
        Object h9;
        ?? r4;
        Context context3;
        int i4;
        String str11;
        int i5;
        Object obj5;
        Object obj6;
        String str12;
        Object h10;
        ?? r42;
        String str13;
        String str14;
        String str15;
        String str16;
        Object h11;
        int i6 = this.h;
        iy iyVar = this.q;
        String str17 = "whoami";
        String str18 = "shell";
        String str19 = "root";
        String str20 = "connect";
        Context context4 = this.k;
        String str21 = "127.0.0.1:5555";
        String str22 = "";
        iy iyVar2 = this.o;
        w01 w01Var = w01.a;
        String str23 = this.l;
        File file = this.i;
        String str24 = "', retrying...";
        ky kyVar = this.j;
        vn vnVar = vn.d;
        switch (i6) {
            case 0:
                str = "Attempt ";
                p10.Q(obj);
                if (file != null) {
                    this.h = 2;
                    break;
                } else {
                    kyVar.invoke("Error: libadb.so not found in native library dir.");
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    v3 v3Var = new v3(iyVar2, null, 4);
                    this.h = 1;
                    if (p01.H(rzVar, v3Var, this) != vnVar) {
                        return w01Var;
                    }
                }
                return vnVar;
            case 1:
                p10.Q(obj);
                return w01Var;
            case 2:
                str = "Attempt ";
                p10.Q(obj);
                if (this.m) {
                    str2 = "root";
                    this.h = 3;
                    h = j4.h(file, str23, new String[]{"connect", "127.0.0.1:5555"}, this);
                    break;
                } else {
                    str2 = "root";
                    i = 1;
                    if (i < 6) {
                        str3 = str18;
                        kyVar.invoke("Discovering ADB port (attempt " + i + "/5)...");
                        try {
                        } catch (Exception unused) {
                            str4 = str17;
                        }
                        str4 = str17;
                        int i7 = Settings.Global.getInt(context4.getContentResolver(), "adb_wifi_port", 0);
                        if (i7 > 0) {
                            num2 = Integer.valueOf(i7);
                            if (num2 != null || num2.intValue() <= 0) {
                                this.d = null;
                                this.g = i;
                                this.h = 5;
                                nq nqVar2 = nr.a;
                                int i8 = i;
                                obj2 = p01.H(hq.d, new e4(context4, null, 0), this);
                                if (obj2 != vnVar) {
                                    i2 = i8;
                                    num2 = (Integer) obj2;
                                    if (num2 == null) {
                                        if (i2 < 5) {
                                            kyVar.invoke("Port not ready yet, retrying in 2s...");
                                            this.d = null;
                                            this.g = i2;
                                            this.h = 6;
                                            str6 = str20;
                                            break;
                                        }
                                        str6 = str20;
                                        i = i2 + 1;
                                        str20 = str6;
                                        str18 = str3;
                                        str17 = str4;
                                        if (i < 6) {
                                            str3 = str18;
                                            str4 = str17;
                                            str5 = str20;
                                            num2 = null;
                                            if (num2 != null) {
                                                num = num2;
                                                if (num.intValue() != 5555) {
                                                    kyVar.invoke("Wireless ADB port: " + num);
                                                }
                                                kyVar.invoke("Connecting to 127.0.0.1:" + num + " ...");
                                                StringBuilder sb = new StringBuilder("127.0.0.1:");
                                                sb.append(num);
                                                String[] strArr = {str5, sb.toString()};
                                                this.d = num;
                                                this.h = 9;
                                                h3 = j4.h(file, str23, strArr, this);
                                                break;
                                            } else {
                                                this.d = null;
                                                this.h = 7;
                                                h2 = j4.h(file, str23, new String[]{str5, "127.0.0.1:5555"}, this);
                                                break;
                                            }
                                        }
                                    } else {
                                        kyVar.invoke("Found port via NSD: " + num2);
                                        str5 = str20;
                                        if (num2 != null) {
                                        }
                                    }
                                }
                                return vnVar;
                            }
                            kyVar.invoke("Found port via settings: " + num2);
                            str5 = str20;
                            if (num2 != null) {
                            }
                        }
                        num2 = null;
                        if (num2 != null) {
                        }
                        this.d = null;
                        this.g = i;
                        this.h = 5;
                        nq nqVar22 = nr.a;
                        int i82 = i;
                        obj2 = p01.H(hq.d, new e4(context4, null, 0), this);
                        if (obj2 != vnVar) {
                        }
                        return vnVar;
                    }
                }
            case 3:
                str = "Attempt ";
                p10.Q(obj);
                str2 = "root";
                h = obj;
                String str25 = (String) h;
                if (ds0.g0(str25, "connected", true) || ds0.g0(str25, "already connected", true)) {
                    num = new Integer(5555);
                    str3 = "shell";
                    str4 = "whoami";
                    str5 = "connect";
                    if (num.intValue() != 5555) {
                    }
                    kyVar.invoke("Connecting to 127.0.0.1:" + num + " ...");
                    StringBuilder sb2 = new StringBuilder("127.0.0.1:");
                    sb2.append(num);
                    String[] strArr2 = {str5, sb2.toString()};
                    this.d = num;
                    this.h = 9;
                    h3 = j4.h(file, str23, strArr2, this);
                    break;
                } else {
                    kyVar.invoke("Error: Could not connect to 127.0.0.1:5555. Output: " + ds0.E0(str25).toString());
                    nq nqVar3 = nr.a;
                    rz rzVar2 = f80.a;
                    v3 v3Var2 = new v3(iyVar2, null, 5);
                    this.d = null;
                    this.h = 4;
                    if (p01.H(rzVar2, v3Var2, this) == vnVar) {
                        return vnVar;
                    }
                }
                break;
            case 4:
                p10.Q(obj);
                return w01Var;
            case 5:
                str = "Attempt ";
                i2 = this.g;
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str4 = "whoami";
                obj2 = obj;
                num2 = (Integer) obj2;
                if (num2 == null) {
                }
                break;
            case 6:
                str = "Attempt ";
                i2 = this.g;
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str4 = "whoami";
                str6 = str20;
                i = i2 + 1;
                str20 = str6;
                str18 = str3;
                str17 = str4;
                if (i < 6) {
                }
                break;
            case 7:
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                h2 = obj;
                str5 = "connect";
                if (ds0.g0((String) h2, "connected", true)) {
                    kyVar.invoke("Found existing connection on 5555.");
                    num = new Integer(5555);
                    if (num.intValue() != 5555) {
                    }
                    kyVar.invoke("Connecting to 127.0.0.1:" + num + " ...");
                    StringBuilder sb22 = new StringBuilder("127.0.0.1:");
                    sb22.append(num);
                    String[] strArr22 = {str5, sb22.toString()};
                    this.d = num;
                    this.h = 9;
                    h3 = j4.h(file, str23, strArr22, this);
                    break;
                } else {
                    kyVar.invoke("Error: Could not discover wireless ADB port after 5 attempts.");
                    nq nqVar4 = nr.a;
                    rz rzVar3 = f80.a;
                    v3 v3Var3 = new v3(iyVar2, null, 6);
                    this.d = null;
                    this.h = 8;
                    if (p01.H(rzVar3, v3Var3, this) == vnVar) {
                    }
                }
                break;
            case 8:
                p10.Q(obj);
                return w01Var;
            case 9:
                num = this.d;
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                h3 = obj;
                str5 = "connect";
                String str26 = (String) h3;
                if (num == null || num.intValue() != 5555) {
                    String obj7 = ds0.E0(str26).toString();
                    if (obj7.length() == 0) {
                        obj7 = "(no output)";
                    }
                    kyVar.invoke(obj7);
                }
                this.d = num;
                this.h = 10;
                break;
            case 10:
                num = this.d;
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                str5 = "connect";
                this.d = num;
                this.h = 11;
                h4 = j4.h(file, str23, new String[]{"devices"}, this);
                break;
            case 11:
                num = this.d;
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                h4 = obj;
                str5 = "connect";
                String str27 = (String) h4;
                if (ds0.g0(str27, "127.0.0.1:" + num + "\tdevice", false)) {
                    kyVar.invoke("Connected on port " + num + ".");
                    if (num == null || num.intValue() != 5555) {
                        kyVar.invoke("Switching to fixed port 5555...");
                        this.d = null;
                        this.h = 13;
                        h5 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:" + num, "tcpip", "5555"}, this);
                        break;
                    }
                    this.d = null;
                    this.h = 16;
                    h7 = j4.h(file, str23, new String[]{"devices"}, this);
                    break;
                } else {
                    kyVar.invoke("Device not authorised or not found. Output:\n" + ds0.E0(str27).toString());
                    kyVar.invoke("Hint: Make sure you installed with 'adb install -g' so the app's ADB key is already trusted.");
                    nq nqVar5 = nr.a;
                    rz rzVar4 = f80.a;
                    v3 v3Var4 = new v3(iyVar2, null, 7);
                    this.d = null;
                    this.h = 12;
                    if (p01.H(rzVar4, v3Var4, this) == vnVar) {
                    }
                }
                return vnVar;
            case Matrix.TranslateX /* 12 */:
                p10.Q(obj);
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                p10.Q(obj);
                h5 = obj;
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                str5 = "connect";
                String str28 = (String) h5;
                if (!ds0.n0(str28)) {
                    kyVar.invoke(ds0.E0(str28).toString());
                }
                num3 = null;
                this.d = null;
                this.h = 14;
                break;
            case Matrix.TranslateZ /* 14 */:
                p10.Q(obj);
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                num3 = null;
                str5 = "connect";
                this.d = num3;
                this.h = 15;
                h6 = j4.h(file, str23, new String[]{str5, "127.0.0.1:5555"}, this);
                break;
            case 15:
                p10.Q(obj);
                h6 = obj;
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                str5 = "connect";
                String str29 = (String) h6;
                if (!ds0.n0(str29)) {
                    kyVar.invoke(ds0.E0(str29).toString());
                }
                this.d = null;
                this.h = 16;
                h7 = j4.h(file, str23, new String[]{"devices"}, this);
                break;
            case 16:
                p10.Q(obj);
                h7 = obj;
                str3 = "shell";
                str2 = "root";
                str = "Attempt ";
                str4 = "whoami";
                str5 = "connect";
                if (!ds0.g0((String) h7, "127.0.0.1:5555\tdevice", false)) {
                    kyVar.invoke("Error: Could not reconnect on port 5555.");
                    nq nqVar6 = nr.a;
                    rz rzVar5 = f80.a;
                    v3 v3Var5 = new v3(iyVar2, null, 8);
                    this.d = null;
                    this.h = 17;
                    if (p01.H(rzVar5, v3Var5, this) == vnVar) {
                    }
                } else if (!this.n) {
                    context = context4;
                    obj3 = "com.lumi.singularity";
                    str7 = "').";
                    str19 = str2;
                    str18 = str3;
                    str8 = str4;
                    kyVar.invoke("Escalating to root...");
                    this.d = null;
                    this.h = 26;
                    h8 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:5555", str19}, this);
                    break;
                } else {
                    i3 = 1;
                    if (i3 < 4) {
                        r8 = 0;
                        this.d = null;
                        this.e = null;
                        this.g = i3;
                        this.h = 18;
                        if (j4.h(file, str23, new String[]{str5, "127.0.0.1:5555"}, this) != vnVar) {
                            str18 = str3;
                            str9 = str4;
                            this.d = r8;
                            this.e = r8;
                            this.g = i3;
                            this.h = 19;
                            obj4 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:5555", str18, str9}, this);
                            break;
                        }
                    } else {
                        context2 = context4;
                        str19 = str2;
                        str18 = str3;
                        str10 = str22;
                        if (q10.b(str10, str18) && !q10.b(str10, str19)) {
                            kyVar.invoke("Error: Could not verify shell access (got '" + str10 + "').");
                            nq nqVar7 = nr.a;
                            rz rzVar6 = f80.a;
                            v3 v3Var6 = new v3(iyVar2, null, 9);
                            this.d = null;
                            this.e = null;
                            this.h = 21;
                            if (p01.H(rzVar6, v3Var6, this) == vnVar) {
                            }
                        } else if (!q10.v(context2)) {
                            r13 = 0;
                            this.d = null;
                            this.e = null;
                            this.h = 25;
                            h9 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:5555", "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"}, this);
                            break;
                        } else {
                            String packageName = context2.getPackageName();
                            if (q10.b(packageName, "com.lumi.singularity")) {
                                r4 = 0;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.h = 23;
                                break;
                            } else {
                                nq nqVar8 = nr.a;
                                rz rzVar7 = f80.a;
                                v3 v3Var7 = new v3(iyVar2, null, 10);
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.h = 22;
                                if (p01.H(rzVar7, v3Var7, this) == vnVar) {
                                }
                            }
                        }
                    }
                }
                return vnVar;
            case 17:
                p10.Q(obj);
                return w01Var;
            case 18:
                i3 = this.g;
                p10.Q(obj);
                str2 = "root";
                str = "Attempt ";
                str9 = "whoami";
                r8 = 0;
                str5 = "connect";
                this.d = r8;
                this.e = r8;
                this.g = i3;
                this.h = 19;
                obj4 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:5555", str18, str9}, this);
                break;
            case 19:
                i3 = this.g;
                p10.Q(obj);
                str2 = "root";
                str = "Attempt ";
                str9 = "whoami";
                str5 = "connect";
                obj4 = obj;
                String obj8 = ds0.E0((String) obj4).toString();
                if (q10.b(obj8, str18)) {
                    str19 = str2;
                } else {
                    str19 = str2;
                    if (!q10.b(obj8, str19)) {
                        context3 = context4;
                        kyVar.invoke(str + i3 + "/3: got '" + obj8 + str24);
                        this.d = null;
                        this.e = obj8;
                        this.g = i3;
                        this.h = 20;
                        int i9 = i3;
                        if (y80.p(1500L, this) != vnVar) {
                            str22 = obj8;
                            i4 = i9;
                            i3 = i4 + 1;
                            str4 = str9;
                            str3 = str18;
                            str2 = str19;
                            context4 = context3;
                            if (i3 < 4) {
                            }
                        }
                        return vnVar;
                    }
                }
                context2 = context4;
                str10 = obj8;
                if (q10.b(str10, str18)) {
                    break;
                }
                if (!q10.v(context2)) {
                }
                return vnVar;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                i4 = this.g;
                String str30 = this.e;
                p10.Q(obj);
                context3 = context4;
                str22 = str30;
                str = "Attempt ";
                str9 = "whoami";
                str5 = "connect";
                i3 = i4 + 1;
                str4 = str9;
                str3 = str18;
                str2 = str19;
                context4 = context3;
                if (i3 < 4) {
                }
                break;
            case 21:
                p10.Q(obj);
                return w01Var;
            case 22:
                p10.Q(obj);
                return w01Var;
            case 23:
                p10.Q(obj);
                r4 = 0;
                nq nqVar9 = nr.a;
                rz rzVar8 = f80.a;
                v3 v3Var8 = new v3(iyVar2, r4, 11);
                this.d = r4;
                this.e = r4;
                this.f = r4;
                this.h = 24;
                if (p01.H(rzVar8, v3Var8, this) == vnVar) {
                }
                break;
            case 24:
                p10.Q(obj);
                return w01Var;
            case RectListKt.BitOffsetForParentId /* 25 */:
                p10.Q(obj);
                h9 = obj;
                r13 = 0;
                nq nqVar10 = nr.a;
                rz rzVar9 = f80.a;
                v3 v3Var9 = new v3(iyVar, r13, 3);
                this.d = r13;
                this.e = r13;
                this.h = 38;
                if (p01.H(rzVar9, v3Var9, this) == vnVar) {
                }
                break;
            case 26:
                p10.Q(obj);
                context = context4;
                str = "Attempt ";
                str8 = "whoami";
                obj3 = "com.lumi.singularity";
                str7 = "').";
                str5 = "connect";
                h8 = obj;
                String str31 = (String) h8;
                if (!ds0.n0(str31)) {
                    kyVar.invoke(ds0.E0(str31).toString());
                }
                this.d = null;
                this.e = null;
                this.h = 27;
                str11 = str5;
                break;
            case 27:
                p10.Q(obj);
                context = context4;
                str11 = "connect";
                str = "Attempt ";
                str8 = "whoami";
                obj3 = "com.lumi.singularity";
                str7 = "').";
                i5 = 1;
                if (i5 < 4) {
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.g = i5;
                    this.h = 28;
                    obj5 = j4.h(file, str23, new String[]{str11, str21}, this);
                    break;
                } else {
                    str12 = str22;
                    if (!q10.b(str12, str19)) {
                        kyVar.invoke("Root verified — ADB root path ready.");
                        if (!q10.v(context)) {
                            String packageName2 = context.getPackageName();
                            if (q10.b(packageName2, obj3)) {
                                r42 = 0;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.h = 33;
                                break;
                            } else {
                                nq nqVar11 = nr.a;
                                rz rzVar10 = f80.a;
                                v3 v3Var10 = new v3(iyVar2, null, 1);
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.h = 32;
                                if (p01.H(rzVar10, v3Var10, this) == vnVar) {
                                }
                            }
                        } else {
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.h = 35;
                            h10 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:5555", "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"}, this);
                            break;
                        }
                        return vnVar;
                    }
                    kyVar.invoke("Error: Could not verify root access (got '" + str12 + str7);
                    nq nqVar12 = nr.a;
                    rz rzVar11 = f80.a;
                    v3 v3Var11 = new v3(iyVar2, null, 0);
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.h = 31;
                    if (p01.H(rzVar11, v3Var11, this) == vnVar) {
                    }
                }
                break;
            case 28:
                int i10 = this.g;
                p10.Q(obj);
                context = context4;
                str = "Attempt ";
                str8 = "whoami";
                obj3 = "com.lumi.singularity";
                obj5 = obj;
                str11 = "connect";
                i5 = i10;
                str7 = "').";
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = i5;
                this.h = 29;
                obj6 = j4.h(file, str23, new String[]{"-s", str21, str18, str8}, this);
                break;
            case 29:
                int i11 = this.g;
                p10.Q(obj);
                context = context4;
                str = "Attempt ";
                str8 = "whoami";
                obj3 = "com.lumi.singularity";
                obj6 = obj;
                str11 = "connect";
                i5 = i11;
                str7 = "').";
                str12 = ds0.E0((String) obj6).toString();
                if (!q10.b(str12, str19)) {
                    str13 = str21;
                    StringBuilder sb3 = new StringBuilder(str);
                    sb3.append(i5);
                    sb3.append("/3: got '");
                    sb3.append(str12);
                    str14 = str24;
                    sb3.append(str14);
                    kyVar.invoke(sb3.toString());
                    this.d = null;
                    this.e = null;
                    this.f = str12;
                    this.g = i5;
                    this.h = 30;
                    str15 = str8;
                    str16 = str18;
                    if (y80.p(1500L, this) != vnVar) {
                        str22 = str12;
                        i5++;
                        str24 = str14;
                        str21 = str13;
                        str18 = str16;
                        str8 = str15;
                        if (i5 < 4) {
                        }
                    }
                    return vnVar;
                }
                if (!q10.b(str12, str19)) {
                }
                break;
            case 30:
                int i12 = this.g;
                String str32 = this.f;
                p10.Q(obj);
                str13 = "127.0.0.1:5555";
                context = context4;
                str22 = str32;
                str16 = "shell";
                str11 = "connect";
                str = "Attempt ";
                str15 = "whoami";
                obj3 = "com.lumi.singularity";
                str14 = str24;
                i5 = i12;
                str7 = "').";
                i5++;
                str24 = str14;
                str21 = str13;
                str18 = str16;
                str8 = str15;
                if (i5 < 4) {
                }
                break;
            case 31:
                p10.Q(obj);
                return w01Var;
            case 32:
                p10.Q(obj);
                return w01Var;
            case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                p10.Q(obj);
                r42 = 0;
                nq nqVar13 = nr.a;
                rz rzVar12 = f80.a;
                v3 v3Var12 = new v3(iyVar2, r42, 2);
                this.d = r42;
                this.e = r42;
                this.f = r42;
                this.h = 34;
                if (p01.H(rzVar12, v3Var12, this) == vnVar) {
                }
                break;
            case 34:
                p10.Q(obj);
                return w01Var;
            case 35:
                p10.Q(obj);
                h10 = obj;
                this.d = null;
                this.e = null;
                this.f = null;
                this.h = 36;
                h11 = j4.h(file, str23, new String[]{"-s", "127.0.0.1:5555", "shell", "setprop", "persist.adb.tcp.port", "5555"}, this);
                break;
            case 36:
                p10.Q(obj);
                h11 = obj;
                String str33 = (String) h11;
                if (!ds0.n0(str33)) {
                    kyVar.invoke(ds0.E0(str33).toString());
                }
                kyVar.invoke("Persistent port 5555 set.");
                nq nqVar14 = nr.a;
                rz rzVar13 = f80.a;
                w3 w3Var = new w3(this.p, iyVar, null, 0);
                this.d = null;
                this.e = null;
                this.f = null;
                this.h = 37;
                if (p01.H(rzVar13, w3Var, this) == vnVar) {
                }
                break;
            case 37:
                p10.Q(obj);
                return w01Var;
            case 38:
                p10.Q(obj);
                return w01Var;
            default:
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
