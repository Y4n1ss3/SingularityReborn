package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t3 extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public File e;
    public String f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ c3 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ SharedPreferences l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(c3 c3Var, String str, SharedPreferences sharedPreferences, iy iyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.j = c3Var;
        this.k = str;
        this.l = sharedPreferences;
        this.p = iyVar;
        this.m = mutableState;
        this.n = mutableState2;
        this.o = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                MutableState mutableState = this.n;
                MutableState mutableState2 = this.o;
                return new t3(this.j, this.k, this.l, (iy) obj2, this.m, mutableState, mutableState2, hmVar);
            default:
                return new t3(this.j, this.k, this.l, this.m, this.n, this.o, (MutableState) obj2, hmVar);
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
        return ((t3) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x058d -> B:90:0x0591). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x02ad -> B:11:0x02b2). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File h;
        Object h2;
        String str;
        File file;
        Object h3;
        String str2;
        Object obj2;
        Object h4;
        String str3;
        Object h5;
        String str4;
        Object h6;
        File file2;
        int i;
        int i2;
        Object obj3;
        Object obj4;
        String str5;
        File h7;
        Object h8;
        String str6;
        File file3;
        Object h9;
        String str7;
        String str8;
        Object h10;
        String str9;
        Object h11;
        String str10;
        Object h12;
        File file4;
        File file5;
        int i3;
        int i4;
        Object obj5;
        w01 w01Var;
        String str11;
        boolean b;
        File file6;
        String str12;
        String[] strArr;
        int i5 = this.d;
        c3 c3Var = this.j;
        vn vnVar = vn.d;
        MutableState mutableState = this.m;
        String str13 = this.k;
        MutableState mutableState2 = this.o;
        MutableState mutableState3 = this.n;
        w01 w01Var2 = w01.a;
        switch (i5) {
            case 0:
                switch (this.i) {
                    case 0:
                        p10.Q(obj);
                        h = ((AdbRootActivity) c3Var).h();
                        if (h == null) {
                            j4.e(mutableState, "Error: Could not locate binary.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        j4.e(mutableState, "Connecting to Wireless ADB...");
                        String[] strArr2 = {"connect", uo.c("127.0.0.1:", (String) mutableState2.getValue())};
                        this.e = h;
                        this.i = 1;
                        h2 = j4.h(h, str13, strArr2, this);
                        if (h2 == vnVar) {
                            return vnVar;
                        }
                        str = (String) h2;
                        if (!ds0.n0(str)) {
                            j4.e(mutableState, ds0.E0(str).toString());
                        }
                        this.e = h;
                        this.i = 2;
                        if (y80.p(2500L, this) != vnVar) {
                            return vnVar;
                        }
                        file = h;
                        this.e = file;
                        this.i = 3;
                        h3 = j4.h(file, str13, new String[]{"devices"}, this);
                        if (h3 == vnVar) {
                            return vnVar;
                        }
                        str2 = (String) h3;
                        obj2 = "root";
                        j4.e(mutableState, "Devices:\n" + ds0.E0(str2).toString());
                        if (!ds0.g0(str2, "127.0.0.1:" + ((String) mutableState2.getValue()) + "\tdevice", false)) {
                            j4.e(mutableState, "Error: Device not found or unauthorized. Check pairing.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        String[] strArr3 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "tcpip", "5555"};
                        this.e = file;
                        this.i = 4;
                        h4 = j4.h(file, str13, strArr3, this);
                        if (h4 == vnVar) {
                            return vnVar;
                        }
                        str3 = (String) h4;
                        if (!ds0.n0(str3)) {
                            j4.e(mutableState, ds0.E0(str3).toString());
                        }
                        this.e = file;
                        this.i = 5;
                        if (y80.p(1500L, this) == vnVar) {
                            return vnVar;
                        }
                        this.e = file;
                        this.i = 6;
                        h5 = j4.h(file, str13, new String[]{"connect", "127.0.0.1:5555"}, this);
                        if (h5 == vnVar) {
                            return vnVar;
                        }
                        str4 = (String) h5;
                        if (!ds0.n0(str4)) {
                            j4.e(mutableState, ds0.E0(str4).toString());
                        }
                        this.e = file;
                        this.i = 7;
                        h6 = j4.h(file, str13, new String[]{"devices"}, this);
                        if (h6 == vnVar) {
                            return vnVar;
                        }
                        if (!ds0.g0((String) h6, "127.0.0.1:5555\tdevice", false)) {
                            j4.e(mutableState, "Error: Could not reconnect on port 5555 after switching. Aborting.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        mutableState2.setValue("5555");
                        file2 = file;
                        int i6 = 3;
                        int i7 = 1;
                        this.e = file2;
                        this.f = null;
                        this.g = i6;
                        this.h = i7;
                        this.i = 8;
                        if (j4.h(file2, str13, new String[]{"connect", "127.0.0.1:5555"}, this) != vnVar) {
                            return vnVar;
                        }
                        int i8 = i7;
                        i2 = i6;
                        i = i8;
                        this.e = file2;
                        this.f = null;
                        this.g = i2;
                        this.h = i;
                        this.i = 9;
                        obj3 = j4.h(file2, str13, new String[]{"-s", "127.0.0.1:5555", "shell", "whoami"}, this);
                        if (obj3 == vnVar) {
                            return vnVar;
                        }
                        str5 = ds0.E0((String) obj3).toString();
                        if (q10.b(str5, "shell")) {
                            obj4 = obj2;
                        } else {
                            obj4 = obj2;
                            if (!q10.b(str5, obj4)) {
                                StringBuilder j = j50.j("Attempt ", i, "/", i2, ": got '");
                                j.append(str5);
                                j.append("', retrying...");
                                j4.e(mutableState, j.toString());
                                this.e = file2;
                                this.f = str5;
                                this.g = i2;
                                this.h = i;
                                this.i = 10;
                                if (y80.p(1500L, this) == vnVar) {
                                    return vnVar;
                                }
                                if (i != i2) {
                                    int i9 = i2;
                                    i7 = i + 1;
                                    i6 = i9;
                                    obj2 = obj4;
                                    this.e = file2;
                                    this.f = null;
                                    this.g = i6;
                                    this.h = i7;
                                    this.i = 8;
                                    if (j4.h(file2, str13, new String[]{"connect", "127.0.0.1:5555"}, this) != vnVar) {
                                    }
                                }
                            }
                        }
                        j4.e(mutableState, "Current user: " + str5);
                        if (q10.b(str5, "shell") && !q10.b(str5, obj4)) {
                            j4.e(mutableState, "Error: Did not verify shell access after " + i2 + " attempts.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        j4.e(mutableState, "Shell access verified! Completing setup");
                        this.e = null;
                        this.f = null;
                        this.g = i2;
                        this.i = 11;
                        if (j4.h(file2, str13, new String[]{"-s", "127.0.0.1:5555", "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"}, this) == vnVar) {
                            return vnVar;
                        }
                        this.l.edit().putBoolean("use_auto_adb", true).apply();
                        j4.c(mutableState3);
                        ((iy) this.p).invoke();
                        return w01Var2;
                    case 1:
                        File file7 = this.e;
                        p10.Q(obj);
                        h = file7;
                        h2 = obj;
                        str = (String) h2;
                        if (!ds0.n0(str)) {
                        }
                        this.e = h;
                        this.i = 2;
                        if (y80.p(2500L, this) != vnVar) {
                        }
                        break;
                    case 2:
                        file = this.e;
                        p10.Q(obj);
                        this.e = file;
                        this.i = 3;
                        h3 = j4.h(file, str13, new String[]{"devices"}, this);
                        if (h3 == vnVar) {
                        }
                        str2 = (String) h3;
                        obj2 = "root";
                        j4.e(mutableState, "Devices:\n" + ds0.E0(str2).toString());
                        if (!ds0.g0(str2, "127.0.0.1:" + ((String) mutableState2.getValue()) + "\tdevice", false)) {
                        }
                        break;
                    case 3:
                        file = this.e;
                        p10.Q(obj);
                        h3 = obj;
                        str2 = (String) h3;
                        obj2 = "root";
                        j4.e(mutableState, "Devices:\n" + ds0.E0(str2).toString());
                        if (!ds0.g0(str2, "127.0.0.1:" + ((String) mutableState2.getValue()) + "\tdevice", false)) {
                        }
                        break;
                    case 4:
                        file = this.e;
                        p10.Q(obj);
                        h4 = obj;
                        obj2 = "root";
                        str3 = (String) h4;
                        if (!ds0.n0(str3)) {
                        }
                        this.e = file;
                        this.i = 5;
                        if (y80.p(1500L, this) == vnVar) {
                        }
                        this.e = file;
                        this.i = 6;
                        h5 = j4.h(file, str13, new String[]{"connect", "127.0.0.1:5555"}, this);
                        if (h5 == vnVar) {
                        }
                        str4 = (String) h5;
                        if (!ds0.n0(str4)) {
                        }
                        this.e = file;
                        this.i = 7;
                        h6 = j4.h(file, str13, new String[]{"devices"}, this);
                        if (h6 == vnVar) {
                        }
                        if (!ds0.g0((String) h6, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 5:
                        file = this.e;
                        p10.Q(obj);
                        obj2 = "root";
                        this.e = file;
                        this.i = 6;
                        h5 = j4.h(file, str13, new String[]{"connect", "127.0.0.1:5555"}, this);
                        if (h5 == vnVar) {
                        }
                        str4 = (String) h5;
                        if (!ds0.n0(str4)) {
                        }
                        this.e = file;
                        this.i = 7;
                        h6 = j4.h(file, str13, new String[]{"devices"}, this);
                        if (h6 == vnVar) {
                        }
                        if (!ds0.g0((String) h6, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 6:
                        file = this.e;
                        p10.Q(obj);
                        h5 = obj;
                        obj2 = "root";
                        str4 = (String) h5;
                        if (!ds0.n0(str4)) {
                        }
                        this.e = file;
                        this.i = 7;
                        h6 = j4.h(file, str13, new String[]{"devices"}, this);
                        if (h6 == vnVar) {
                        }
                        if (!ds0.g0((String) h6, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 7:
                        file = this.e;
                        p10.Q(obj);
                        h6 = obj;
                        obj2 = "root";
                        if (!ds0.g0((String) h6, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 8:
                        i = this.h;
                        i2 = this.g;
                        file2 = this.e;
                        p10.Q(obj);
                        obj2 = "root";
                        this.e = file2;
                        this.f = null;
                        this.g = i2;
                        this.h = i;
                        this.i = 9;
                        obj3 = j4.h(file2, str13, new String[]{"-s", "127.0.0.1:5555", "shell", "whoami"}, this);
                        if (obj3 == vnVar) {
                        }
                        str5 = ds0.E0((String) obj3).toString();
                        if (q10.b(str5, "shell")) {
                        }
                        j4.e(mutableState, "Current user: " + str5);
                        if (q10.b(str5, "shell")) {
                            break;
                        }
                        j4.e(mutableState, "Shell access verified! Completing setup");
                        this.e = null;
                        this.f = null;
                        this.g = i2;
                        this.i = 11;
                        if (j4.h(file2, str13, new String[]{"-s", "127.0.0.1:5555", "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"}, this) == vnVar) {
                        }
                        this.l.edit().putBoolean("use_auto_adb", true).apply();
                        j4.c(mutableState3);
                        ((iy) this.p).invoke();
                        return w01Var2;
                    case 9:
                        i = this.h;
                        i2 = this.g;
                        file2 = this.e;
                        p10.Q(obj);
                        obj3 = obj;
                        obj2 = "root";
                        str5 = ds0.E0((String) obj3).toString();
                        if (q10.b(str5, "shell")) {
                        }
                        j4.e(mutableState, "Current user: " + str5);
                        if (q10.b(str5, "shell")) {
                        }
                        j4.e(mutableState, "Shell access verified! Completing setup");
                        this.e = null;
                        this.f = null;
                        this.g = i2;
                        this.i = 11;
                        if (j4.h(file2, str13, new String[]{"-s", "127.0.0.1:5555", "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"}, this) == vnVar) {
                        }
                        this.l.edit().putBoolean("use_auto_adb", true).apply();
                        j4.c(mutableState3);
                        ((iy) this.p).invoke();
                        return w01Var2;
                    case 10:
                        i = this.h;
                        i2 = this.g;
                        String str14 = this.f;
                        File file8 = this.e;
                        p10.Q(obj);
                        str5 = str14;
                        file2 = file8;
                        obj4 = "root";
                        if (i != i2) {
                        }
                        j4.e(mutableState, "Current user: " + str5);
                        if (q10.b(str5, "shell")) {
                        }
                        j4.e(mutableState, "Shell access verified! Completing setup");
                        this.e = null;
                        this.f = null;
                        this.g = i2;
                        this.i = 11;
                        if (j4.h(file2, str13, new String[]{"-s", "127.0.0.1:5555", "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"}, this) == vnVar) {
                        }
                        this.l.edit().putBoolean("use_auto_adb", true).apply();
                        j4.c(mutableState3);
                        ((iy) this.p).invoke();
                        return w01Var2;
                    case 11:
                        p10.Q(obj);
                        this.l.edit().putBoolean("use_auto_adb", true).apply();
                        j4.c(mutableState3);
                        ((iy) this.p).invoke();
                        return w01Var2;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            default:
                switch (this.i) {
                    case 0:
                        p10.Q(obj);
                        h7 = ((AdbRootActivity) c3Var).h();
                        if (h7 == null) {
                            j4.e(mutableState, "Error: Could not locate binary.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        j4.e(mutableState, "Connecting to Wireless ADB...");
                        String[] strArr4 = {"connect", uo.c("127.0.0.1:", (String) mutableState2.getValue())};
                        this.e = h7;
                        this.i = 1;
                        h8 = j4.h(h7, str13, strArr4, this);
                        if (h8 == vnVar) {
                            return vnVar;
                        }
                        str6 = (String) h8;
                        if (!ds0.n0(str6)) {
                            j4.e(mutableState, ds0.E0(str6).toString());
                        }
                        this.e = h7;
                        this.i = 2;
                        if (y80.p(2500L, this) != vnVar) {
                            return vnVar;
                        }
                        file3 = h7;
                        this.e = file3;
                        this.i = 3;
                        h9 = j4.h(file3, str13, new String[]{"devices"}, this);
                        if (h9 == vnVar) {
                            return vnVar;
                        }
                        str7 = (String) h9;
                        str8 = "devices";
                        j4.e(mutableState, "Devices:\n" + ds0.E0(str7).toString());
                        if (!ds0.g0(str7, "127.0.0.1:" + ((String) mutableState2.getValue()) + "\tdevice", false)) {
                            j4.e(mutableState, "Error: Device not found or unauthorized. Check that pairing completed successfully and Wireless ADB is still enabled.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        String[] strArr5 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "tcpip", "5555"};
                        this.e = file3;
                        this.i = 4;
                        h10 = j4.h(file3, str13, strArr5, this);
                        if (h10 == vnVar) {
                            return vnVar;
                        }
                        str9 = (String) h10;
                        if (!ds0.n0(str9)) {
                            j4.e(mutableState, ds0.E0(str9).toString());
                        }
                        this.e = file3;
                        this.i = 5;
                        if (y80.p(1500L, this) == vnVar) {
                            return vnVar;
                        }
                        this.e = file3;
                        this.i = 6;
                        h11 = j4.h(file3, str13, new String[]{"connect", "127.0.0.1:5555"}, this);
                        if (h11 == vnVar) {
                            return vnVar;
                        }
                        str10 = (String) h11;
                        if (!ds0.n0(str10)) {
                            j4.e(mutableState, ds0.E0(str10).toString());
                        }
                        this.e = file3;
                        this.i = 7;
                        h12 = j4.h(file3, str13, new String[]{str8}, this);
                        if (h12 == vnVar) {
                            return vnVar;
                        }
                        if (!ds0.g0((String) h12, "127.0.0.1:5555\tdevice", false)) {
                            j4.e(mutableState, "Error: Could not reconnect on port 5555 after switching. Aborting.");
                            j4.c(mutableState3);
                            return w01Var2;
                        }
                        mutableState2.setValue("5555");
                        String[] strArr6 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "root"};
                        this.e = file3;
                        this.i = 8;
                        if (j4.h(file3, str13, strArr6, this) == vnVar) {
                            return vnVar;
                        }
                        file4 = file3;
                        this.e = file4;
                        this.i = 9;
                        if (y80.p(1500L, this) == vnVar) {
                            return vnVar;
                        }
                        file5 = file4;
                        int i10 = 3;
                        int i11 = 1;
                        strArr = new String[]{"connect", uo.c("127.0.0.1:", (String) mutableState2.getValue())};
                        this.e = file5;
                        this.f = null;
                        this.g = i10;
                        this.h = i11;
                        this.i = 10;
                        if (j4.h(file5, str13, strArr, this) != vnVar) {
                            return vnVar;
                        }
                        int i12 = i11;
                        i4 = i10;
                        i3 = i12;
                        String[] strArr7 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "shell", "whoami"};
                        this.e = file5;
                        this.f = null;
                        this.g = i4;
                        this.h = i3;
                        this.i = 11;
                        obj5 = j4.h(file5, str13, strArr7, this);
                        if (obj5 == vnVar) {
                            return vnVar;
                        }
                        str11 = ds0.E0((String) obj5).toString();
                        if (q10.b(str11, "root")) {
                            w01Var = w01Var2;
                            j4.e(mutableState, "Current user: " + str11);
                            b = q10.b(str11, "root");
                            MutableState mutableState4 = (MutableState) this.p;
                            if (b) {
                            }
                            j4.c(mutableState3);
                            String[] strArr8 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"};
                            this.e = null;
                            this.f = null;
                            this.g = i4;
                            this.i = 13;
                            if (j4.h(file5, str13, strArr8, this) != vnVar) {
                            }
                        } else {
                            w01Var = w01Var2;
                            StringBuilder j2 = j50.j("Attempt ", i3, "/", i4, ": got '");
                            j2.append(str11);
                            j2.append("', retrying...");
                            j4.e(mutableState, j2.toString());
                            this.e = file5;
                            this.f = str11;
                            this.g = i4;
                            this.h = i3;
                            this.i = 12;
                            if (y80.p(1500L, this) == vnVar) {
                                return vnVar;
                            }
                            file6 = file5;
                            str12 = str11;
                            if (i3 != i4) {
                                File file9 = file6;
                                str11 = str12;
                                file5 = file9;
                                j4.e(mutableState, "Current user: " + str11);
                                b = q10.b(str11, "root");
                                MutableState mutableState42 = (MutableState) this.p;
                                if (b) {
                                    mutableState42.setValue(Boolean.FALSE);
                                    j4.e(mutableState, "Warning: Did not verify root access after " + i4 + " attempts.");
                                } else {
                                    mutableState42.setValue(Boolean.TRUE);
                                    j4.e(mutableState, "Root verified — ADB root path ready.");
                                    this.l.edit().putBoolean("use_auto_adb", true).apply();
                                }
                                j4.c(mutableState3);
                                String[] strArr82 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "shell", "pm", "grant", "com.lumi.singularity", "android.permission.WRITE_SECURE_SETTINGS"};
                                this.e = null;
                                this.f = null;
                                this.g = i4;
                                this.i = 13;
                                return j4.h(file5, str13, strArr82, this) != vnVar ? vnVar : w01Var;
                            }
                            int i13 = i4;
                            i11 = i3 + 1;
                            i10 = i13;
                            file5 = file6;
                            w01Var2 = w01Var;
                            strArr = new String[]{"connect", uo.c("127.0.0.1:", (String) mutableState2.getValue())};
                            this.e = file5;
                            this.f = null;
                            this.g = i10;
                            this.h = i11;
                            this.i = 10;
                            if (j4.h(file5, str13, strArr, this) != vnVar) {
                            }
                        }
                    case 1:
                        File file10 = this.e;
                        p10.Q(obj);
                        h7 = file10;
                        h8 = obj;
                        str6 = (String) h8;
                        if (!ds0.n0(str6)) {
                        }
                        this.e = h7;
                        this.i = 2;
                        if (y80.p(2500L, this) != vnVar) {
                        }
                        break;
                    case 2:
                        file3 = this.e;
                        p10.Q(obj);
                        this.e = file3;
                        this.i = 3;
                        h9 = j4.h(file3, str13, new String[]{"devices"}, this);
                        if (h9 == vnVar) {
                        }
                        str7 = (String) h9;
                        str8 = "devices";
                        j4.e(mutableState, "Devices:\n" + ds0.E0(str7).toString());
                        if (!ds0.g0(str7, "127.0.0.1:" + ((String) mutableState2.getValue()) + "\tdevice", false)) {
                        }
                        break;
                    case 3:
                        file3 = this.e;
                        p10.Q(obj);
                        h9 = obj;
                        str7 = (String) h9;
                        str8 = "devices";
                        j4.e(mutableState, "Devices:\n" + ds0.E0(str7).toString());
                        if (!ds0.g0(str7, "127.0.0.1:" + ((String) mutableState2.getValue()) + "\tdevice", false)) {
                        }
                        break;
                    case 4:
                        file3 = this.e;
                        p10.Q(obj);
                        h10 = obj;
                        str8 = "devices";
                        str9 = (String) h10;
                        if (!ds0.n0(str9)) {
                        }
                        this.e = file3;
                        this.i = 5;
                        if (y80.p(1500L, this) == vnVar) {
                        }
                        this.e = file3;
                        this.i = 6;
                        h11 = j4.h(file3, str13, new String[]{"connect", "127.0.0.1:5555"}, this);
                        if (h11 == vnVar) {
                        }
                        str10 = (String) h11;
                        if (!ds0.n0(str10)) {
                        }
                        this.e = file3;
                        this.i = 7;
                        h12 = j4.h(file3, str13, new String[]{str8}, this);
                        if (h12 == vnVar) {
                        }
                        if (!ds0.g0((String) h12, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 5:
                        file3 = this.e;
                        p10.Q(obj);
                        str8 = "devices";
                        this.e = file3;
                        this.i = 6;
                        h11 = j4.h(file3, str13, new String[]{"connect", "127.0.0.1:5555"}, this);
                        if (h11 == vnVar) {
                        }
                        str10 = (String) h11;
                        if (!ds0.n0(str10)) {
                        }
                        this.e = file3;
                        this.i = 7;
                        h12 = j4.h(file3, str13, new String[]{str8}, this);
                        if (h12 == vnVar) {
                        }
                        if (!ds0.g0((String) h12, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 6:
                        file3 = this.e;
                        p10.Q(obj);
                        h11 = obj;
                        str8 = "devices";
                        str10 = (String) h11;
                        if (!ds0.n0(str10)) {
                        }
                        this.e = file3;
                        this.i = 7;
                        h12 = j4.h(file3, str13, new String[]{str8}, this);
                        if (h12 == vnVar) {
                        }
                        if (!ds0.g0((String) h12, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 7:
                        file3 = this.e;
                        p10.Q(obj);
                        h12 = obj;
                        if (!ds0.g0((String) h12, "127.0.0.1:5555\tdevice", false)) {
                        }
                        break;
                    case 8:
                        file4 = this.e;
                        p10.Q(obj);
                        this.e = file4;
                        this.i = 9;
                        if (y80.p(1500L, this) == vnVar) {
                        }
                        file5 = file4;
                        int i102 = 3;
                        int i112 = 1;
                        strArr = new String[]{"connect", uo.c("127.0.0.1:", (String) mutableState2.getValue())};
                        this.e = file5;
                        this.f = null;
                        this.g = i102;
                        this.h = i112;
                        this.i = 10;
                        if (j4.h(file5, str13, strArr, this) != vnVar) {
                        }
                        break;
                    case 9:
                        file4 = this.e;
                        p10.Q(obj);
                        file5 = file4;
                        int i1022 = 3;
                        int i1122 = 1;
                        strArr = new String[]{"connect", uo.c("127.0.0.1:", (String) mutableState2.getValue())};
                        this.e = file5;
                        this.f = null;
                        this.g = i1022;
                        this.h = i1122;
                        this.i = 10;
                        if (j4.h(file5, str13, strArr, this) != vnVar) {
                        }
                        break;
                    case 10:
                        i3 = this.h;
                        i4 = this.g;
                        file5 = this.e;
                        p10.Q(obj);
                        String[] strArr72 = {"-s", uo.c("127.0.0.1:", (String) mutableState2.getValue()), "shell", "whoami"};
                        this.e = file5;
                        this.f = null;
                        this.g = i4;
                        this.h = i3;
                        this.i = 11;
                        obj5 = j4.h(file5, str13, strArr72, this);
                        if (obj5 == vnVar) {
                        }
                        str11 = ds0.E0((String) obj5).toString();
                        if (q10.b(str11, "root")) {
                        }
                        break;
                    case 11:
                        i3 = this.h;
                        i4 = this.g;
                        file5 = this.e;
                        p10.Q(obj);
                        obj5 = obj;
                        str11 = ds0.E0((String) obj5).toString();
                        if (q10.b(str11, "root")) {
                        }
                        break;
                    case Matrix.TranslateX /* 12 */:
                        i3 = this.h;
                        i4 = this.g;
                        str12 = this.f;
                        file6 = this.e;
                        p10.Q(obj);
                        w01Var = w01Var2;
                        if (i3 != i4) {
                        }
                        break;
                    case Matrix.TranslateY /* 13 */:
                        p10.Q(obj);
                        return w01Var2;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(c3 c3Var, String str, SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, hm hmVar) {
        super(2, hmVar);
        this.j = c3Var;
        this.k = str;
        this.l = sharedPreferences;
        this.m = mutableState;
        this.n = mutableState2;
        this.o = mutableState3;
        this.p = mutableState4;
    }
}
