package defpackage;

import android.os.Process;
import android.util.Log;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z9 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new z9(2, 0, hmVar);
            case 1:
                return new z9(2, 1, hmVar);
            case 2:
                return new z9(2, 2, hmVar);
            case 3:
                return new z9(2, 3, hmVar);
            case 4:
                return new z9(2, 4, hmVar);
            case 5:
                return new z9(2, 5, hmVar);
            case 6:
                return new z9(2, 6, hmVar);
            case 7:
                return new z9(2, 7, hmVar);
            case 8:
                return new z9(2, 8, hmVar);
            case 9:
                return new z9(2, 9, hmVar);
            case 10:
                return new z9(2, 10, hmVar);
            case 11:
                return new z9(2, 11, hmVar);
            case Matrix.TranslateX /* 12 */:
                return new z9(2, 12, hmVar);
            case Matrix.TranslateY /* 13 */:
                return new z9(2, 13, hmVar);
            case Matrix.TranslateZ /* 14 */:
                return new z9(2, 14, hmVar);
            case 15:
                return new z9(2, 15, hmVar);
            case 16:
                return new z9(2, 16, hmVar);
            case 17:
                return new z9(2, 17, hmVar);
            case 18:
                return new z9(2, 18, hmVar);
            case 19:
                return new z9(2, 19, hmVar);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new z9(2, 20, hmVar);
            case 21:
                return new z9(2, 21, hmVar);
            case 22:
                return new z9(2, 22, hmVar);
            case 23:
                return new z9(2, 23, hmVar);
            case 24:
                z9 z9Var = new z9(2, 24, hmVar);
                z9Var.e = ((Number) obj).intValue();
                return z9Var;
            case RectListKt.BitOffsetForParentId /* 25 */:
                return new z9(2, 25, hmVar);
            case 26:
                return new z9(2, 26, hmVar);
            case 27:
                return new z9(2, 27, hmVar);
            case 28:
                return new z9(2, 28, hmVar);
            default:
                return new z9(2, 29, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 24:
                break;
        }
        return ((z9) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x021c, code lost:
    
        if (defpackage.y80.p(500, r28) == r4) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x024b, code lost:
    
        if (defpackage.y80.p(500, r28) == r4) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r0 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06d3, code lost:
    
        if (defpackage.y80.p(3000, r28) == r4) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06c8, code lost:
    
        if (defpackage.zj0.c("svc wifi disable", false, r28) == r4) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0708, code lost:
    
        if (defpackage.zj0.c("setprop service.adb.tcp.port 5555", false, r28) == r4) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0763, code lost:
    
        if (defpackage.zj0.c("setprop ctl.restart mrsystemservice", false, r28) == r4) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x074e, code lost:
    
        if (r0 == r4) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0743, code lost:
    
        if (defpackage.y80.p(8000, r28) == r4) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x07a2, code lost:
    
        if (r0 == r4) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0797, code lost:
    
        if (defpackage.y80.p(5000, r28) == r4) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0810, code lost:
    
        if (r0 == r4) goto L437;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0684  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object c2;
        Object b;
        Object b2;
        Object b3;
        Object c3;
        Object h;
        Integer e0;
        Object e;
        Object e2;
        Object e3;
        Object c4;
        Object g;
        List list;
        Object c5;
        Object H;
        Object c6;
        Object e4;
        Object e5;
        int i = this.d;
        int i2 = 10;
        int i3 = 2;
        w01 w01Var = w01.a;
        int i4 = 0;
        vn vnVar = vn.d;
        int i5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (i) {
            case 0:
                int i6 = this.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var = zj0.a;
                    this.e = 1;
                    if (zj0.c("magisk resetprop --delete ro.build.type\nstop\nstart", false, this) == vnVar) {
                        break;
                    }
                }
                break;
            case 1:
                int i7 = this.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var2 = zj0.a;
                    String str = hr.c() ? "am broadcast -a com.oculus.vrshell.intent.action.LAUNCH -p com.oculus.vrshell --es intent_data \"com.oculus.vrshell/com.oculus.panelapp.dogfood.DogfoodPanelService\" --es uri \"/?tab=assignments\"" : "am start com.oculus.vrshell/com.oculus.panelapp.dogfood.DogfoodMainActivity";
                    this.e = 1;
                    if (zj0.c(str, false, this) == vnVar) {
                        break;
                    }
                }
                break;
            case 2:
                int i8 = this.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var3 = zj0.a;
                    String str2 = hr.c() ? "am broadcast -a com.oculus.vrshell.intent.action.LAUNCH -p com.oculus.vrshell --es intent_data \"com.oculus.vrshell/com.oculus.panelapp.debug.ShellDebugPanelService\"" : "am start -n com.oculus.vrshell/com.oculus.panelapp.debug.ShellDebugActivity";
                    this.e = 1;
                    if (zj0.c(str2, false, this) == vnVar) {
                        break;
                    }
                }
                break;
            case 3:
                int i9 = this.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var4 = zj0.a;
                    this.e = 1;
                    if (zj0.c("am start -n com.android.settings/.Settings", false, this) == vnVar) {
                        break;
                    }
                }
                break;
            case 4:
                int i10 = this.e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var5 = zj0.a;
                    this.e = 1;
                    if (zj0.c("am start -n com.android.documentsui/.files.FilesActivity", false, this) == vnVar) {
                        break;
                    }
                }
                break;
            case 5:
                int i11 = this.e;
                try {
                    if (i11 == 0) {
                        p10.Q(obj);
                        zj0 zj0Var6 = zj0.a;
                        this.e = 1;
                        c = zj0.c("echo 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null", false, this);
                        if (c == vnVar) {
                            c = vnVar;
                        }
                    } else if (i11 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        p10.Q(obj);
                        c = obj;
                    }
                    break;
                } catch (Exception e6) {
                    return new Integer(Log.w("BatteryUtils", "Failed to clear input_suspend", e6));
                }
            case 6:
                int i12 = this.e;
                try {
                    if (i12 == 0) {
                        p10.Q(obj);
                        zj0 zj0Var7 = zj0.a;
                        this.e = 1;
                        c2 = zj0.c("echo 100 > /sys/class/power_supply/battery/charge_capacity_limit 2>/dev/null", false, this);
                        if (c2 == vnVar) {
                            c2 = vnVar;
                        }
                    } else if (i12 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        p10.Q(obj);
                        c2 = obj;
                    }
                    break;
                } catch (Exception e7) {
                    return new Integer(Log.w("BatteryUtils", "Failed to reset driver charge_capacity_limit", e7));
                }
            case 7:
                int i13 = this.e;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            p10.Q(obj);
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                        b = obj;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var8 = zj0.a;
                    this.e = 1;
                    b = zj0.b(this);
                    break;
                }
                if (((Boolean) b).booleanValue()) {
                    zj0 zj0Var9 = zj0.a;
                    String str3 = hr.c() ? "su 1000 -c \"pm disable --user 0 com.oculus.companion.server/.remotewipe.RemoteWipeJobService\"" : "su 1000 -c \"pm disable --user 0 com.oculus.companion.server/.DisabledDeviceJobService\"\nsu 1000 -c \"pm disable --user 0 com.oculus.companion.server/.RemoteWipeJobService\"\nsu 1000 -c \"pm disable --user 0 com.oculus.companion.server/.WipeReceiver\"";
                    this.e = 2;
                    if (zj0.c(str3, false, this) != vnVar) {
                    }
                    break;
                }
                break;
            case 8:
                int i14 = this.e;
                if (i14 != 0) {
                    if (i14 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var10 = zj0.a;
                    this.e = 1;
                    if (zj0.c("CURRENT_STATE=$(oculuspreferences --get multimodal_hands_and_controllers_enabled)\n\nif [ \"$CURRENT_STATE\" == \"true\" ]; then\n    oculuspreferences --set multimodal_hands_and_controllers_enabled false\n    oculuspreferences --set multimodal_hands_and_controllers_enabled true\nelse\n    oculuspreferences --set multimodal_hands_and_controllers_enabled true\n    oculuspreferences --set multimodal_hands_and_controllers_enabled false\nfi", false, this) == vnVar) {
                        break;
                    }
                }
                break;
            case 9:
                int i15 = this.e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 == 3) {
                                p10.Q(obj);
                                break;
                            } else {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            p10.Q(obj);
                            b2 = obj;
                            if (((Boolean) b2).booleanValue()) {
                                Log.i("BootReceiver", "Checking for Meta killswitch token on unlocked bootloader...");
                                zj0 zj0Var11 = zj0.a;
                                this.e = 3;
                                if (zj0.c("if [ -f /persist/srt_push/token ]; then\n    rm /persist/srt_push/token\n    echo \"Killswitch token removed successfully.\"\nfi", false, this) != vnVar) {
                                }
                                break;
                            } else {
                                q10.c(Log.w("BootReceiver", "Killswitch Checker skipped: Device is not rooted or root access was denied."));
                                break;
                            }
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                }
                zj0 zj0Var12 = zj0.a;
                this.e = 2;
                b2 = zj0.b(this);
                break;
            case 10:
                int i16 = this.e;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                p10.Q(obj);
                                Log.i("BootReceiver", "Passthrough Fix: restarted mrsystemservice");
                                break;
                            } else {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            p10.Q(obj);
                            b3 = obj;
                            if (((Boolean) b3).booleanValue()) {
                                zj0 zj0Var13 = zj0.a;
                                this.e = 3;
                                break;
                            }
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                }
                zj0 zj0Var14 = zj0.a;
                this.e = 2;
                b3 = zj0.b(this);
                break;
            case 11:
                int i17 = this.e;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            p10.Q(obj);
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var15 = zj0.a;
                    this.e = 1;
                    break;
                }
                zj0 zj0Var16 = zj0.a;
                this.e = 2;
                if (zj0.c("stop adbd && start adbd", false, this) != vnVar) {
                }
                break;
            case Matrix.TranslateX /* 12 */:
                int i18 = this.e;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 == 3) {
                                p10.Q(obj);
                                break;
                            } else {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            p10.Q(obj);
                            zj0 zj0Var17 = zj0.a;
                            this.e = 3;
                            if (zj0.c("svc wifi enable", false, this) != vnVar) {
                            }
                            break;
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    zj0 zj0Var18 = zj0.a;
                    this.e = 1;
                    break;
                }
                this.e = 2;
                break;
            case Matrix.TranslateY /* 13 */:
                int i19 = this.e;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            p10.Q(obj);
                            h = obj;
                            e0 = ks0.e0((String) h);
                            if (e0 != null) {
                                int intValue = e0.intValue();
                                if (hr.c()) {
                                    intValue /= 10;
                                } else if (intValue > 1000) {
                                    intValue /= 1000;
                                }
                                i4 = intValue;
                            }
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                        c3 = obj;
                    }
                } else {
                    p10.Q(obj);
                    ro roVar = ro.a;
                    this.e = 1;
                    c3 = roVar.c(this);
                    if (c3 == vnVar) {
                    }
                }
                ro roVar2 = ro.a;
                this.e = 2;
                h = roVar2.h((String) c3, this);
                if (h == vnVar) {
                }
                e0 = ks0.e0((String) h);
                if (e0 != null) {
                }
                break;
            case Matrix.TranslateZ /* 14 */:
                int i20 = this.e;
                if (i20 != 0) {
                    if (i20 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    ro roVar3 = ro.a;
                    this.e = 1;
                    Object d = roVar3.d(this);
                    if (d == vnVar) {
                        break;
                    }
                }
                break;
            case 15:
                int i21 = this.e;
                if (i21 == 0) {
                    p10.Q(obj);
                    ro roVar4 = ro.a;
                    this.e = 1;
                    e = ro.e(this);
                    if (e == vnVar) {
                    }
                } else if (i21 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    e = obj;
                }
                List<zn> list2 = ((bo) e).a;
                ArrayList arrayList = new ArrayList(zi.a0(list2, 10));
                for (zn znVar : list2) {
                    List D = znVar.e.size() >= 2 ? znVar.e : y80.D(new Integer(znVar.d));
                    String str4 = znVar.a;
                    ArrayList arrayList2 = new ArrayList(zi.a0(D, 10));
                    Iterator it = D.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new Integer(((Number) it.next()).intValue() / 1000));
                    }
                    arrayList.add(new xe0(str4, yi.E0(yi.n0(arrayList2))));
                }
                break;
            case 16:
                int i22 = this.e;
                if (i22 == 0) {
                    p10.Q(obj);
                    ro roVar5 = ro.a;
                    this.e = 1;
                    e2 = ro.e(this);
                    if (e2 == vnVar) {
                    }
                } else if (i22 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    e2 = obj;
                }
                bo boVar = (bo) e2;
                if (boVar.c() != null) {
                    break;
                } else {
                    break;
                }
            case 17:
                int i23 = this.e;
                if (i23 == 0) {
                    p10.Q(obj);
                    ro roVar6 = ro.a;
                    this.e = 1;
                    e3 = ro.e(this);
                    if (e3 == vnVar) {
                    }
                } else if (i23 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    e3 = obj;
                }
                bo boVar2 = (bo) e3;
                String valueOf = String.valueOf(boVar2.b().c);
                String valueOf2 = String.valueOf(boVar2.a().c);
                String u0 = yi.u0(boVar2.b().c(), "\n    ", null, null, new wd(valueOf, 6), 30);
                String u02 = yi.u0(boVar2.a().c(), "\n    ", null, null, new wd(valueOf2, 7), 30);
                zn c7 = boVar2.c();
                String u03 = c7 != null ? yi.u0(c7.c(), "\n    ", null, null, new wd(String.valueOf(c7.c), 8), 30) : null;
                if (u03 == null) {
                    u03 = "";
                }
                StringBuilder k = j50.k("\n            #!/system/bin/sh\n            while true; do\n                ", u0, "\n                ", u03, "\n                ");
                k.append(u02);
                k.append("\n                sleep 2\n            done\n        ");
                break;
            case 18:
                int i24 = this.e;
                try {
                    try {
                    } catch (Exception e8) {
                        Log.w("CpuUtils", "Topology warmup failed: " + e8.getMessage());
                    }
                    if (i24 != 0) {
                        if (i24 != 1) {
                            if (i24 != 2) {
                                if (i24 == 3) {
                                    p10.Q(obj);
                                    c4 = obj;
                                    break;
                                } else {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                p10.Q(obj);
                                ro roVar7 = ro.a;
                                this.e = 3;
                                c4 = roVar7.c(this);
                                if (c4 == vnVar) {
                                }
                            }
                        } else {
                            p10.Q(obj);
                        }
                    } else {
                        p10.Q(obj);
                        ro roVar8 = ro.a;
                        this.e = 1;
                        nq nqVar = nr.a;
                        Object H2 = p01.H(hq.d, new z9(i3, 19, objArr == true ? 1 : 0), this);
                        if (H2 != vnVar) {
                            H2 = w01Var;
                        }
                        if (H2 == vnVar) {
                        }
                    }
                    ro roVar9 = ro.a;
                    this.e = 2;
                    if (ro.e(this) == vnVar) {
                    }
                    ro roVar72 = ro.a;
                    this.e = 3;
                    c4 = roVar72.c(this);
                    if (c4 == vnVar) {
                    }
                } catch (Exception e9) {
                    return new Integer(Log.w("CpuUtils", "Temp path warmup failed: " + e9.getMessage()));
                }
                break;
            case 19:
                int i25 = this.e;
                try {
                    if (i25 == 0) {
                        p10.Q(obj);
                        if (ro.e == null) {
                            ro roVar10 = ro.a;
                            this.e = 1;
                            g = roVar10.g(this);
                            if (g == vnVar) {
                                break;
                            }
                        }
                    } else if (i25 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        p10.Q(obj);
                        g = obj;
                    }
                    String str5 = (String) g;
                    if (!ds0.n0(str5) && !ks0.c0(str5, "Execution failed", false)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (String str6 : ds0.r0(str5)) {
                            if (ks0.c0(str6, "cpu", false)) {
                                Character valueOf3 = 3 < str6.length() ? Character.valueOf(str6.charAt(3)) : null;
                                if (valueOf3 != null && Character.isDigit(valueOf3.charValue())) {
                                    String obj2 = ds0.E0(str6).toString();
                                    Pattern compile = Pattern.compile("\\s+");
                                    compile.getClass();
                                    obj2.getClass();
                                    Matcher matcher = compile.matcher(obj2);
                                    if (matcher.find()) {
                                        ArrayList arrayList3 = new ArrayList(i2);
                                        int i26 = 0;
                                        do {
                                            arrayList3.add(obj2.subSequence(i26, matcher.start()).toString());
                                            i26 = matcher.end();
                                        } while (matcher.find());
                                        arrayList3.add(obj2.subSequence(i26, obj2.length()).toString());
                                        list = arrayList3;
                                    } else {
                                        list = y80.D(obj2.toString());
                                    }
                                    if (list.size() >= 8) {
                                        Long f0 = ks0.f0((String) list.get(1));
                                        long longValue = f0 != null ? f0.longValue() : 0L;
                                        Long f02 = ks0.f0((String) list.get(2));
                                        long longValue2 = f02 != null ? f02.longValue() : 0L;
                                        Long f03 = ks0.f0((String) list.get(3));
                                        long longValue3 = f03 != null ? f03.longValue() : 0L;
                                        Long f04 = ks0.f0((String) list.get(4));
                                        long longValue4 = f04 != null ? f04.longValue() : 0L;
                                        Long f05 = ks0.f0((String) list.get(5));
                                        long longValue5 = f05 != null ? f05.longValue() : 0L;
                                        Long f06 = ks0.f0((String) list.get(6));
                                        long longValue6 = f06 != null ? f06.longValue() : 0L;
                                        Long f07 = ks0.f0((String) list.get(7));
                                        linkedHashMap.put(list.get(0), new co(longValue4, longValue + longValue2 + longValue3 + longValue4 + longValue5 + longValue6 + (f07 != null ? f07.longValue() : 0L)));
                                    }
                                }
                                i2 = 10;
                            }
                        }
                        if (ro.e == null) {
                            ro.e = linkedHashMap;
                            Log.d("CpuUtils", "CPU stats pre-seeded (" + linkedHashMap.size() + " cores)");
                            break;
                        }
                    }
                } catch (Exception e10) {
                    Log.w("CpuUtils", "warmUpStats failed: " + e10.getMessage());
                    return w01Var;
                }
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                int i27 = this.e;
                if (i27 != 0) {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            p10.Q(obj);
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                }
                zj0 zj0Var19 = zj0.a;
                this.e = 2;
                if (zj0.c("svc power reboot", false, this) != vnVar) {
                }
                break;
            case 21:
                int i28 = this.e;
                if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            p10.Q(obj);
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                }
                zj0 zj0Var20 = zj0.a;
                this.e = 2;
                if (zj0.c("svc power reboot", false, this) != vnVar) {
                }
                break;
            case 22:
                int i29 = this.e;
                if (i29 != 0) {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            p10.Q(obj);
                            c5 = obj;
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    String W = es0.W("\n            umount -l /system/etc/hosts\n            settings put global airplane_mode_on 1\nam broadcast -a android.intent.action.AIRPLANE_MODE --ez state true\nsleep 4\nsettings put global airplane_mode_on 0\nam broadcast -a android.intent.action.AIRPLANE_MODE --ez state false\n        ");
                    zj0 zj0Var21 = zj0.a;
                    this.e = 1;
                    if (zj0.c(W, true, this) == vnVar) {
                    }
                }
                zj0 zj0Var22 = zj0.a;
                this.e = 2;
                c5 = zj0.c("mount | grep /system/etc/hosts", true, this);
                if (c5 == vnVar) {
                }
                break;
            case 23:
                int i30 = this.e;
                if (i30 != 0) {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            p10.Q(obj);
                            c6 = obj;
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                        H = obj;
                    }
                } else {
                    p10.Q(obj);
                    List list3 = iv.a;
                    this.e = 1;
                    nq nqVar2 = nr.a;
                    H = p01.H(hq.d, new gv(i3, i4, objArr2 == true ? 1 : 0), this);
                    if (H == vnVar) {
                    }
                }
                List list4 = (List) H;
                if (list4.isEmpty()) {
                    Log.w("FanUtils", "setSystemControlEnabled: no fan-driving thermal zones found on this device/build");
                    break;
                } else {
                    String u04 = yi.u0(list4, "\n", null, null, new wd("enabled", 14), 30);
                    zj0 zj0Var23 = zj0.a;
                    this.e = 2;
                    c6 = zj0.c(u04, false, this);
                    if (c6 == vnVar) {
                    }
                }
                break;
            case 24:
                p10.Q(obj);
                break;
            case RectListKt.BitOffsetForParentId /* 25 */:
                int i31 = this.e;
                if (i31 == 0) {
                    p10.Q(obj);
                    pz pzVar = pz.a;
                    this.e = 1;
                    e4 = pz.e(this);
                    if (e4 == vnVar) {
                    }
                } else if (i31 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    e4 = obj;
                }
                Integer num = (Integer) yi.x0((Iterable) e4);
                if (num == null || (r4 = num.toString()) == null) {
                    if (hr.d()) {
                    }
                }
                break;
            case 26:
                int i32 = this.e;
                if (i32 == 0) {
                    p10.Q(obj);
                    pz pzVar2 = pz.a;
                    this.e = 1;
                    e5 = pz.e(this);
                    if (e5 == vnVar) {
                    }
                } else if (i32 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    e5 = obj;
                }
                Integer num2 = (Integer) yi.y0((Iterable) e5);
                if (num2 == null || (r4 = num2.toString()) == null) {
                    if (hr.d()) {
                    }
                }
                break;
            case 27:
                int i33 = this.e;
                if (i33 != 0) {
                    if (i33 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    this.e = 1;
                    nq nqVar3 = nr.a;
                    if (p01.H(hq.d, new b80(i3, i3, objArr3 == true ? 1 : 0), this) == vnVar) {
                        break;
                    }
                }
                break;
            case 28:
                int i34 = this.e;
                if (i34 != 0) {
                    if (i34 == 1) {
                        p10.Q(obj);
                        break;
                    } else {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    p10.Q(obj);
                    Process.setThreadPriority(10);
                    zj0 zj0Var24 = zj0.a;
                    this.e = 1;
                    nq nqVar4 = nr.a;
                    Object H3 = p01.H(hq.d, new yj0(i3, i4, objArr4 == true ? 1 : 0), this);
                    if (H3 != vnVar) {
                        H3 = w01Var;
                    }
                    if (H3 == vnVar) {
                        break;
                    }
                }
                break;
            default:
                int i35 = this.e;
                if (i35 != 0) {
                    if (i35 != 1) {
                        if (i35 == 2) {
                            p10.Q(obj);
                            break;
                        } else {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        p10.Q(obj);
                    }
                } else {
                    p10.Q(obj);
                    Process.setThreadPriority(10);
                    zj0 zj0Var25 = zj0.a;
                    this.e = 1;
                    nq nqVar5 = nr.a;
                    Object H4 = p01.H(hq.d, new yj0(i3, i5, objArr5 == true ? 1 : 0), this);
                    if (H4 != vnVar) {
                        H4 = w01Var;
                        break;
                    }
                }
                ro roVar11 = ro.a;
                this.e = 2;
                nq nqVar6 = nr.a;
                if (p01.H(hq.d, new z9(i3, 18, objArr6 == true ? 1 : 0), this) != vnVar) {
                }
                break;
        }
        return vnVar;
    }
}
