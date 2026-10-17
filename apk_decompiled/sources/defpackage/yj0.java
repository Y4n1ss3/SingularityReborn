package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yj0 extends us0 implements my {
    public final /* synthetic */ int d;
    public vj0 e;
    public ob0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj0(int i, int i2, hm hmVar) {
        super(i, hmVar);
        this.d = i2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new yj0(2, 0, hmVar);
            case 1:
                return new yj0(2, 1, hmVar);
            default:
                return new yj0(2, 2, hmVar);
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
        return ((yj0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        vj0 vj0Var;
        ob0 ob0Var;
        vj0 vj0Var2;
        ob0 ob0Var2;
        vj0 vj0Var3;
        ob0 ob0Var3;
        switch (this.d) {
            case 0:
                w01 w01Var = w01.a;
                vn vnVar = vn.d;
                int i = this.g;
                try {
                } catch (Exception e) {
                    Log.w("RootUtils", "warmUp failed: " + e.getMessage());
                }
                try {
                    if (i == 0) {
                        p10.Q(obj);
                        vj0 vj0Var4 = zj0.f;
                        if (vj0Var4 == null || !vj0Var4.a.isAlive()) {
                            Process start = new ProcessBuilder("su").redirectErrorStream(true).start();
                            start.getClass();
                            vj0 vj0Var5 = new vj0(start, new DataOutputStream(start.getOutputStream()), new BufferedReader(new InputStreamReader(start.getInputStream())));
                            ob0 ob0Var4 = zj0.b;
                            this.e = vj0Var5;
                            this.f = ob0Var4;
                            this.g = 1;
                            if (ob0Var4.d(this) == vnVar) {
                                return vnVar;
                            }
                            vj0Var = vj0Var5;
                            ob0Var = ob0Var4;
                        }
                        return w01Var;
                    }
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ob0Var = this.f;
                    vj0Var = this.e;
                    p10.Q(obj);
                    vj0 vj0Var6 = zj0.f;
                    if (vj0Var6 == null || !vj0Var6.a.isAlive()) {
                        zj0 zj0Var = zj0.a;
                        zj0.f = vj0Var;
                        Log.d("RootUtils", "Shell warmed up");
                    } else {
                        vj0Var.a.destroy();
                        Log.d("RootUtils", "warmUp: shell already live, discarding warmup process");
                    }
                    ob0Var.f(null);
                    return w01Var;
                } finally {
                    ob0Var.f(null);
                }
            case 1:
                w01 w01Var2 = w01.a;
                vn vnVar2 = vn.d;
                int i2 = this.g;
                try {
                } catch (Exception e2) {
                    Log.w("RootUtils", "warmUpMonitor failed: " + e2.getMessage());
                }
                try {
                    if (i2 == 0) {
                        p10.Q(obj);
                        vj0 vj0Var7 = zj0.g;
                        if (vj0Var7 == null || !vj0Var7.a.isAlive()) {
                            Process start2 = new ProcessBuilder("su").redirectErrorStream(true).start();
                            start2.getClass();
                            vj0 vj0Var8 = new vj0(start2, new DataOutputStream(start2.getOutputStream()), new BufferedReader(new InputStreamReader(start2.getInputStream())));
                            ob0 ob0Var5 = zj0.c;
                            this.e = vj0Var8;
                            this.f = ob0Var5;
                            this.g = 1;
                            if (ob0Var5.d(this) == vnVar2) {
                                return vnVar2;
                            }
                            vj0Var2 = vj0Var8;
                            ob0Var2 = ob0Var5;
                        }
                        return w01Var2;
                    }
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ob0Var2 = this.f;
                    vj0Var2 = this.e;
                    p10.Q(obj);
                    vj0 vj0Var9 = zj0.g;
                    if (vj0Var9 == null || !vj0Var9.a.isAlive()) {
                        zj0 zj0Var2 = zj0.a;
                        zj0.g = vj0Var2;
                        Log.d("RootUtils", "Monitor shell warmed up");
                    } else {
                        vj0Var2.a.destroy();
                        Log.d("RootUtils", "warmUpMonitor: monitor shell already live, discarding");
                    }
                    ob0Var2.f(null);
                    return w01Var2;
                } finally {
                }
            default:
                w01 w01Var3 = w01.a;
                vn vnVar3 = vn.d;
                int i3 = this.g;
                try {
                } catch (Exception e3) {
                    Log.w("RootUtils", "warmUpStatus failed: " + e3.getMessage());
                }
                try {
                    if (i3 == 0) {
                        p10.Q(obj);
                        vj0 vj0Var10 = zj0.i;
                        if (vj0Var10 == null || !vj0Var10.a.isAlive()) {
                            Process start3 = new ProcessBuilder("su").redirectErrorStream(true).start();
                            start3.getClass();
                            vj0 vj0Var11 = new vj0(start3, new DataOutputStream(start3.getOutputStream()), new BufferedReader(new InputStreamReader(start3.getInputStream())));
                            ob0 ob0Var6 = zj0.e;
                            this.e = vj0Var11;
                            this.f = ob0Var6;
                            this.g = 1;
                            if (ob0Var6.d(this) == vnVar3) {
                                return vnVar3;
                            }
                            vj0Var3 = vj0Var11;
                            ob0Var3 = ob0Var6;
                        }
                        return w01Var3;
                    }
                    if (i3 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ob0Var3 = this.f;
                    vj0Var3 = this.e;
                    p10.Q(obj);
                    vj0 vj0Var12 = zj0.i;
                    if (vj0Var12 == null || !vj0Var12.a.isAlive()) {
                        zj0 zj0Var3 = zj0.a;
                        zj0.i = vj0Var3;
                        Log.d("RootUtils", "Status shell warmed up");
                    } else {
                        vj0Var3.a.destroy();
                        Log.d("RootUtils", "warmUpStatus: status shell already live, discarding");
                    }
                    ob0Var2.f(null);
                    return w01Var3;
                } finally {
                }
        }
    }
}
