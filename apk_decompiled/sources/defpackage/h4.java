package defpackage;

import androidx.compose.ui.graphics.Matrix;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class h4 extends us0 implements my {
    public String d;
    public String e;
    public String f;
    public File g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public int l;
    public final /* synthetic */ File m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ y2 p;
    public final /* synthetic */ k2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(File file, String str, String str2, y2 y2Var, k2 k2Var, hm hmVar) {
        super(2, hmVar);
        this.m = file;
        this.n = str;
        this.o = str2;
        this.p = y2Var;
        this.q = k2Var;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new h4(this.m, this.n, this.o, this.p, this.q, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((h4) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02df, code lost:
    
        if (r1 != r11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fe, code lost:
    
        if (r1 == r11) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Object h;
        String str;
        String str2;
        String str3;
        String str4;
        Object h2;
        String str5;
        String str6;
        String str7;
        String str8;
        Object invoke;
        CharSequence charSequence3;
        String str9;
        File file;
        String str10;
        String str11;
        Object h3;
        File file2;
        String str12;
        String str13;
        CharSequence charSequence4;
        String str14;
        String str15;
        Object h4;
        String str16;
        File file3;
        String str17;
        String str18;
        boolean b;
        y2 y2Var;
        Object h5;
        vn vnVar;
        String str19;
        ky kyVar;
        String str20;
        String str21;
        String str22;
        Object h6;
        String obj2;
        Object h7;
        String str23;
        Object h8;
        String str24;
        String str25;
        String str26;
        Object h9;
        boolean z;
        String str27;
        String[] strArr;
        String[] strArr2;
        int i = this.l;
        String str28 = this.o;
        String str29 = this.n;
        File file4 = this.m;
        y2 y2Var2 = this.p;
        vn vnVar2 = vn.d;
        switch (i) {
            case 0:
                p10.Q(obj);
                charSequence = "failed";
                charSequence2 = "error";
                this.l = 1;
                h = j4.h(file4, str29, new String[]{"-s", "127.0.0.1:" + str28, "shell", "getprop", "ro.boot.slot_suffix"}, this);
                break;
            case 1:
                p10.Q(obj);
                h = obj;
                charSequence = "failed";
                charSequence2 = "error";
                String obj3 = ds0.E0((String) h).toString();
                if (!q10.b(obj3, "_a") && !q10.b(obj3, "_b")) {
                    y2Var2.invoke("Error: Could not determine valid boot slot. Got: '" + obj3 + "'");
                    return Boolean.FALSE;
                }
                y2Var2.invoke("Current boot slot is: " + obj3);
                String str30 = "/dev/block/bootdevice/by-name/boot" + obj3;
                String[] strArr3 = {"-s", uo.c("127.0.0.1:", str28), "shell", "mkdir", "-p", "/data/adb/singularity"};
                str = "/data/adb/singularity";
                this.d = str30;
                this.e = str;
                this.f = "/data/adb/singularity/boot.img";
                this.l = 2;
                if (j4.h(file4, str29, strArr3, this) != vnVar2) {
                    str2 = str30;
                    str3 = "/data/adb/singularity/boot.img";
                    str4 = "of=";
                    String[] strArr4 = {"-s", uo.c("127.0.0.1:", str28), "shell", "dd", uo.c("if=", str2), uo.c("of=", str3)};
                    this.d = str2;
                    this.e = str;
                    this.f = str3;
                    String str31 = str2;
                    this.l = 3;
                    h2 = j4.h(file4, str29, strArr4, this);
                    if (h2 != vnVar2) {
                        str5 = str3;
                        str6 = str31;
                        str7 = (String) h2;
                        if (ds0.n0(str7)) {
                            str8 = "if=";
                            if (!ds0.g0(str7, "records in", false)) {
                                y2Var2.invoke(ds0.E0(str7).toString());
                            }
                        } else {
                            str8 = "if=";
                        }
                        this.d = str6;
                        this.e = str;
                        this.f = str5;
                        this.l = 4;
                        invoke = this.q.invoke(this);
                        break;
                    }
                }
                return vnVar2;
            case 2:
                String str32 = this.f;
                String str33 = this.e;
                str2 = this.d;
                p10.Q(obj);
                charSequence = "failed";
                str3 = str32;
                charSequence2 = "error";
                str = str33;
                str4 = "of=";
                String[] strArr42 = {"-s", uo.c("127.0.0.1:", str28), "shell", "dd", uo.c("if=", str2), uo.c("of=", str3)};
                this.d = str2;
                this.e = str;
                this.f = str3;
                String str312 = str2;
                this.l = 3;
                h2 = j4.h(file4, str29, strArr42, this);
                if (h2 != vnVar2) {
                }
                return vnVar2;
            case 3:
                String str34 = this.f;
                String str35 = this.e;
                String str36 = this.d;
                p10.Q(obj);
                charSequence2 = "error";
                str = str35;
                str4 = "of=";
                str5 = str34;
                charSequence = "failed";
                str6 = str36;
                h2 = obj;
                str7 = (String) h2;
                if (ds0.n0(str7)) {
                }
                this.d = str6;
                this.e = str;
                this.f = str5;
                this.l = 4;
                invoke = this.q.invoke(this);
                break;
            case 4:
                String str37 = this.f;
                String str38 = this.e;
                String str39 = this.d;
                p10.Q(obj);
                charSequence2 = "error";
                str = str38;
                str4 = "of=";
                str8 = "if=";
                str5 = str37;
                charSequence = "failed";
                str6 = str39;
                invoke = obj;
                File file5 = (File) invoke;
                if (file5 == null) {
                    y2Var2.invoke("Error: Failed to prepare Magisk patch files.");
                    return Boolean.FALSE;
                }
                String[] strArr5 = {"-s", uo.c("127.0.0.1:", str28), "shell", "mkdir", "-p", "/data/adb/singularity/magisk_patcher"};
                charSequence3 = "records in";
                str9 = "/data/adb/singularity/magisk_patcher";
                this.d = str6;
                this.e = str;
                this.f = str5;
                this.g = file5;
                this.h = str9;
                this.l = 5;
                if (j4.h(file4, str29, strArr5, this) != vnVar2) {
                    file = file5;
                    String c = uo.c("127.0.0.1:", str28);
                    str10 = "shell";
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    str11 = str28;
                    this.d = str6;
                    this.e = str;
                    this.f = str5;
                    this.g = file;
                    this.h = str9;
                    this.l = 6;
                    h3 = j4.h(file4, str29, new String[]{"-s", c, "push", absolutePath, "/data/adb/singularity/"}, this);
                    if (h3 != vnVar2) {
                        String str40 = str6;
                        file2 = file;
                        str12 = str40;
                        str13 = (String) h3;
                        CharSequence charSequence5 = charSequence;
                        if (!ds0.g0(str13, charSequence2, true) || ds0.g0(str13, charSequence5, true)) {
                            y2Var2.invoke("Error pushing files to root directory: ".concat(str13));
                        }
                        y2Var2.invoke("Patching boot image with Magisk 30.7...");
                        StringBuilder sb = new StringBuilder("127.0.0.1:");
                        str28 = str11;
                        sb.append(str28);
                        charSequence4 = charSequence5;
                        str14 = "push";
                        str15 = str10;
                        String[] strArr6 = {"-s", sb.toString(), str15, "LEGACYSAR=false; grep ' / ' /proc/mounts | grep -q '/dev/root' && LEGACYSAR=true; echo $LEGACYSAR"};
                        this.d = str12;
                        this.e = str;
                        this.f = str5;
                        this.g = file2;
                        this.h = str9;
                        this.l = 7;
                        h4 = j4.h(file4, str29, strArr6, this);
                        if (h4 != vnVar2) {
                            str16 = str9;
                            file3 = file2;
                            str17 = str12;
                            str18 = str5;
                            b = q10.b(ds0.E0((String) h4).toString(), "true");
                            if (b) {
                                y2Var2.invoke("Detected legacy system-as-root device -- will force kernel to honor the ramdisk (LEGACYSAR=true).");
                            }
                            y2Var = y2Var2;
                            StringBuilder k = j50.k("cd ", str16, " && chmod 755 boot_patch.sh util_functions.sh init-ld magisk magiskboot magiskinit  && export KEEPVERITY=true && export KEEPFORCEENCRYPT=true && export MAGISKDIR=", str16, " && export LEGACYSAR=");
                            k.append(b);
                            k.append(" && ./boot_patch.sh ");
                            k.append(str18);
                            String[] strArr7 = {"-s", uo.c("127.0.0.1:", str28), str15, k.toString()};
                            this.d = str17;
                            this.e = str;
                            this.f = null;
                            this.g = file3;
                            this.h = str16;
                            this.k = b;
                            this.l = 8;
                            h5 = j4.h(file4, str29, strArr7, this);
                            vnVar = vnVar2;
                            if (h5 == vnVar) {
                                return vnVar;
                            }
                            str19 = (String) h5;
                            if (!ds0.g0(str19, "- Repacking boot image", false)) {
                                y2 y2Var3 = y2Var;
                                y2Var3.invoke("Error: Magisk patch process failed.");
                                y2Var3.invoke("Output: \n".concat(str19));
                                return Boolean.FALSE;
                            }
                            String str41 = str + "/patched_boot.img";
                            kyVar = y2Var;
                            kyVar.invoke("Moving patched image to ".concat(str41));
                            String[] strArr8 = {"-s", "127.0.0.1:" + str28, "shell", "mv", str16 + "/new-boot.img", str41};
                            str20 = str41;
                            this.d = str17;
                            this.e = null;
                            this.f = null;
                            this.g = file3;
                            this.h = null;
                            this.i = str20;
                            this.k = b;
                            this.l = 9;
                            if (j4.h(file4, str29, strArr8, this) == vnVar) {
                                return vnVar;
                            }
                            str21 = str17;
                            String str42 = str20;
                            String[] strArr9 = {"-s", uo.c("127.0.0.1:", str28), "shell", "ls", "-lh", str42};
                            str22 = str42;
                            this.d = str21;
                            this.e = null;
                            this.f = null;
                            this.g = file3;
                            this.h = null;
                            this.i = str22;
                            this.k = b;
                            this.l = 10;
                            h6 = j4.h(file4, str29, strArr9, this);
                            if (h6 == vnVar) {
                                return vnVar;
                            }
                            obj2 = ds0.E0((String) h6).toString();
                            if (ds0.g0(obj2, "No such file", false)) {
                                kyVar.invoke("Error: Patched image not found at destination.");
                                return Boolean.FALSE;
                            }
                            kyVar.invoke("Success! Patched boot image saved.");
                            kyVar.invoke(obj2);
                            kyVar.invoke("Flashing patched image back to " + str21 + "...");
                            StringBuilder sb2 = new StringBuilder("127.0.0.1:");
                            sb2.append(str28);
                            String[] strArr10 = {"-s", sb2.toString(), "shell", "dd", uo.c(str8, str22), uo.c(str4, str21), "bs=4096", "conv=fsync"};
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = file3;
                            this.h = null;
                            this.i = null;
                            this.k = b;
                            this.l = 11;
                            h7 = j4.h(file4, str29, strArr10, this);
                            if (h7 == vnVar) {
                                return vnVar;
                            }
                            str23 = (String) h7;
                            if (ds0.n0(str23) && !ds0.g0(str23, charSequence3, false)) {
                                kyVar.invoke("Warning/Error during flash: \n" + ds0.E0(str23).toString());
                                return Boolean.FALSE;
                            }
                            kyVar.invoke("Successfully flashed Magisk to the active slot!");
                            kyVar.invoke("Installing Magisk manager app...");
                            String absolutePath2 = new File(file3, "magisk.apk").getAbsolutePath();
                            absolutePath2.getClass();
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = "/data/local/tmp/magisk.apk";
                            this.k = b;
                            this.l = 12;
                            h8 = j4.h(file4, str29, new String[]{"-s", "127.0.0.1:" + str28, str14, absolutePath2, "/data/local/tmp/magisk.apk"}, this);
                            if (h8 != vnVar) {
                                return vnVar;
                            }
                            str24 = "/data/local/tmp/magisk.apk";
                            str25 = (String) h8;
                            if (!ds0.g0(str25, charSequence2, true) || ds0.g0(str25, charSequence4, true)) {
                                kyVar.invoke("Warning: Failed to push Magisk apk: ".concat(str25));
                                z = b;
                                kyVar.invoke("Rebooting...");
                                strArr2 = new String[]{"-s", "127.0.0.1:" + str28, "shell", "svc", "power", "reboot"};
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.h = null;
                                this.i = null;
                                this.j = null;
                                this.k = z;
                                this.l = 15;
                                if (j4.h(file4, str29, strArr2, this) == vnVar) {
                                    return vnVar;
                                }
                                return Boolean.TRUE;
                            }
                            String[] strArr11 = {"-s", uo.c("127.0.0.1:", str28), "shell", "pm", "install", "-r", str24};
                            str26 = str24;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = str26;
                            this.k = b;
                            this.l = 13;
                            h9 = j4.h(file4, str29, strArr11, this);
                            if (h9 == vnVar) {
                                return vnVar;
                            }
                            String str43 = str26;
                            str27 = (String) h9;
                            if (ds0.g0(str27, "Success", true)) {
                                kyVar.invoke("Warning: Magisk manager app install may have failed: " + ds0.E0(str27).toString());
                            } else {
                                kyVar.invoke("Magisk manager app installed.");
                            }
                            strArr = new String[]{"-s", uo.c("127.0.0.1:", str28), "shell", "rm", "-f", str43};
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = b;
                            this.l = 14;
                            if (j4.h(file4, str29, strArr, this) == vnVar) {
                                return vnVar;
                            }
                            z = b;
                            kyVar.invoke("Rebooting...");
                            strArr2 = new String[]{"-s", "127.0.0.1:" + str28, "shell", "svc", "power", "reboot"};
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = z;
                            this.l = 15;
                            if (j4.h(file4, str29, strArr2, this) == vnVar) {
                            }
                            return Boolean.TRUE;
                        }
                    }
                }
                return vnVar2;
            case 5:
                String str44 = this.h;
                File file6 = this.g;
                String str45 = this.f;
                String str46 = this.e;
                String str47 = this.d;
                p10.Q(obj);
                str6 = str47;
                file = file6;
                charSequence2 = "error";
                str = str46;
                charSequence3 = "records in";
                str9 = str44;
                charSequence = "failed";
                str4 = "of=";
                str5 = str45;
                str8 = "if=";
                String c2 = uo.c("127.0.0.1:", str28);
                str10 = "shell";
                String absolutePath3 = file.getAbsolutePath();
                absolutePath3.getClass();
                str11 = str28;
                this.d = str6;
                this.e = str;
                this.f = str5;
                this.g = file;
                this.h = str9;
                this.l = 6;
                h3 = j4.h(file4, str29, new String[]{"-s", c2, "push", absolutePath3, "/data/adb/singularity/"}, this);
                if (h3 != vnVar2) {
                }
                return vnVar2;
            case 6:
                String str48 = this.h;
                File file7 = this.g;
                String str49 = this.f;
                String str50 = this.e;
                str12 = this.d;
                p10.Q(obj);
                charSequence = "failed";
                file2 = file7;
                charSequence2 = "error";
                str = str50;
                charSequence3 = "records in";
                str9 = str48;
                str4 = "of=";
                str10 = "shell";
                str11 = str28;
                str5 = str49;
                str8 = "if=";
                h3 = obj;
                str13 = (String) h3;
                CharSequence charSequence52 = charSequence;
                if (!ds0.g0(str13, charSequence2, true)) {
                    break;
                }
                y2Var2.invoke("Error pushing files to root directory: ".concat(str13));
                y2Var2.invoke("Patching boot image with Magisk 30.7...");
                StringBuilder sb3 = new StringBuilder("127.0.0.1:");
                str28 = str11;
                sb3.append(str28);
                charSequence4 = charSequence52;
                str14 = "push";
                str15 = str10;
                String[] strArr62 = {"-s", sb3.toString(), str15, "LEGACYSAR=false; grep ' / ' /proc/mounts | grep -q '/dev/root' && LEGACYSAR=true; echo $LEGACYSAR"};
                this.d = str12;
                this.e = str;
                this.f = str5;
                this.g = file2;
                this.h = str9;
                this.l = 7;
                h4 = j4.h(file4, str29, strArr62, this);
                if (h4 != vnVar2) {
                }
                return vnVar2;
            case 7:
                String str51 = this.h;
                File file8 = this.g;
                String str52 = this.f;
                String str53 = this.e;
                String str54 = this.d;
                p10.Q(obj);
                charSequence2 = "error";
                str = str53;
                charSequence3 = "records in";
                file3 = file8;
                str14 = "push";
                str4 = "of=";
                str15 = "shell";
                str16 = str51;
                charSequence4 = "failed";
                str17 = str54;
                str18 = str52;
                str8 = "if=";
                h4 = obj;
                b = q10.b(ds0.E0((String) h4).toString(), "true");
                if (b) {
                }
                y2Var = y2Var2;
                StringBuilder k2 = j50.k("cd ", str16, " && chmod 755 boot_patch.sh util_functions.sh init-ld magisk magiskboot magiskinit  && export KEEPVERITY=true && export KEEPFORCEENCRYPT=true && export MAGISKDIR=", str16, " && export LEGACYSAR=");
                k2.append(b);
                k2.append(" && ./boot_patch.sh ");
                k2.append(str18);
                String[] strArr72 = {"-s", uo.c("127.0.0.1:", str28), str15, k2.toString()};
                this.d = str17;
                this.e = str;
                this.f = null;
                this.g = file3;
                this.h = str16;
                this.k = b;
                this.l = 8;
                h5 = j4.h(file4, str29, strArr72, this);
                vnVar = vnVar2;
                if (h5 == vnVar) {
                }
                str19 = (String) h5;
                if (!ds0.g0(str19, "- Repacking boot image", false)) {
                }
                break;
            case 8:
                boolean z2 = this.k;
                str16 = this.h;
                File file9 = this.g;
                String str55 = this.e;
                String str56 = this.d;
                p10.Q(obj);
                y2Var = y2Var2;
                str14 = "push";
                charSequence3 = "records in";
                str4 = "of=";
                vnVar = vnVar2;
                b = z2;
                file3 = file9;
                charSequence4 = "failed";
                charSequence2 = "error";
                str = str55;
                str17 = str56;
                str8 = "if=";
                h5 = obj;
                str19 = (String) h5;
                if (!ds0.g0(str19, "- Repacking boot image", false)) {
                }
                break;
            case 9:
                boolean z3 = this.k;
                str20 = this.i;
                File file10 = this.g;
                str21 = this.d;
                p10.Q(obj);
                str14 = "push";
                charSequence3 = "records in";
                str4 = "of=";
                str8 = "if=";
                b = z3;
                file3 = file10;
                kyVar = y2Var2;
                charSequence4 = "failed";
                charSequence2 = "error";
                vnVar = vnVar2;
                String str422 = str20;
                String[] strArr92 = {"-s", uo.c("127.0.0.1:", str28), "shell", "ls", "-lh", str422};
                str22 = str422;
                this.d = str21;
                this.e = null;
                this.f = null;
                this.g = file3;
                this.h = null;
                this.i = str22;
                this.k = b;
                this.l = 10;
                h6 = j4.h(file4, str29, strArr92, this);
                if (h6 == vnVar) {
                }
                obj2 = ds0.E0((String) h6).toString();
                if (ds0.g0(obj2, "No such file", false)) {
                }
                break;
            case 10:
                boolean z4 = this.k;
                str22 = this.i;
                File file11 = this.g;
                str21 = this.d;
                p10.Q(obj);
                str14 = "push";
                charSequence3 = "records in";
                str4 = "of=";
                str8 = "if=";
                b = z4;
                file3 = file11;
                kyVar = y2Var2;
                charSequence4 = "failed";
                charSequence2 = "error";
                vnVar = vnVar2;
                h6 = obj;
                obj2 = ds0.E0((String) h6).toString();
                if (ds0.g0(obj2, "No such file", false)) {
                }
                break;
            case 11:
                boolean z5 = this.k;
                File file12 = this.g;
                p10.Q(obj);
                charSequence4 = "failed";
                charSequence2 = "error";
                str14 = "push";
                charSequence3 = "records in";
                file3 = file12;
                b = z5;
                kyVar = y2Var2;
                vnVar = vnVar2;
                h7 = obj;
                str23 = (String) h7;
                if (ds0.n0(str23)) {
                    break;
                }
                kyVar.invoke("Successfully flashed Magisk to the active slot!");
                kyVar.invoke("Installing Magisk manager app...");
                String absolutePath22 = new File(file3, "magisk.apk").getAbsolutePath();
                absolutePath22.getClass();
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = "/data/local/tmp/magisk.apk";
                this.k = b;
                this.l = 12;
                h8 = j4.h(file4, str29, new String[]{"-s", "127.0.0.1:" + str28, str14, absolutePath22, "/data/local/tmp/magisk.apk"}, this);
                if (h8 != vnVar) {
                }
                break;
            case Matrix.TranslateX /* 12 */:
                boolean z6 = this.k;
                String str57 = this.j;
                p10.Q(obj);
                b = z6;
                charSequence4 = "failed";
                charSequence2 = "error";
                str24 = str57;
                h8 = obj;
                kyVar = y2Var2;
                vnVar = vnVar2;
                str25 = (String) h8;
                if (ds0.g0(str25, charSequence2, true)) {
                    break;
                }
                kyVar.invoke("Warning: Failed to push Magisk apk: ".concat(str25));
                z = b;
                kyVar.invoke("Rebooting...");
                strArr2 = new String[]{"-s", "127.0.0.1:" + str28, "shell", "svc", "power", "reboot"};
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = z;
                this.l = 15;
                if (j4.h(file4, str29, strArr2, this) == vnVar) {
                }
                return Boolean.TRUE;
            case Matrix.TranslateY /* 13 */:
                boolean z7 = this.k;
                str26 = this.j;
                p10.Q(obj);
                b = z7;
                kyVar = y2Var2;
                vnVar = vnVar2;
                h9 = obj;
                String str432 = str26;
                str27 = (String) h9;
                if (ds0.g0(str27, "Success", true)) {
                }
                strArr = new String[]{"-s", uo.c("127.0.0.1:", str28), "shell", "rm", "-f", str432};
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = b;
                this.l = 14;
                if (j4.h(file4, str29, strArr, this) == vnVar) {
                }
                z = b;
                kyVar.invoke("Rebooting...");
                strArr2 = new String[]{"-s", "127.0.0.1:" + str28, "shell", "svc", "power", "reboot"};
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = z;
                this.l = 15;
                if (j4.h(file4, str29, strArr2, this) == vnVar) {
                }
                return Boolean.TRUE;
            case Matrix.TranslateZ /* 14 */:
                z = this.k;
                p10.Q(obj);
                kyVar = y2Var2;
                vnVar = vnVar2;
                kyVar.invoke("Rebooting...");
                strArr2 = new String[]{"-s", "127.0.0.1:" + str28, "shell", "svc", "power", "reboot"};
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = z;
                this.l = 15;
                if (j4.h(file4, str29, strArr2, this) == vnVar) {
                }
                return Boolean.TRUE;
            case 15:
                p10.Q(obj);
                return Boolean.TRUE;
            default:
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
