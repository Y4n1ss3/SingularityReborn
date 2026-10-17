package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import com.lumi.singularity.ui.activities.MainActivity;
import java.io.File;
import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w70 extends us0 implements my {
    public Context d;
    public MutableState e;
    public Object f;
    public Object g;
    public Object h;
    public MutableState i;
    public MutableState j;
    public File k;
    public Serializable l;
    public int m;
    public boolean n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ g80 x;
    public final /* synthetic */ cq0 y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Context context, MutableState mutableState6, g80 g80Var, cq0 cq0Var, MutableState mutableState7, hm hmVar) {
        super(2, hmVar);
        this.q = mutableState;
        this.r = mutableState2;
        this.s = mutableState3;
        this.t = mutableState4;
        this.u = mutableState5;
        this.v = context;
        this.w = mutableState6;
        this.x = g80Var;
        this.y = cq0Var;
        this.z = mutableState7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:25|26|(2:28|23))|19|20|21))|31|6|7|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (defpackage.y80.p(2000, r0) != r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        android.util.Log.e("MainActivity", "Failed to set adb_wifi_enabled", r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Context context, g80 g80Var, MutableState mutableState, cq0 cq0Var, MutableState mutableState2, MutableState mutableState3, im imVar) {
        v70 v70Var;
        int i;
        cq0 cq0Var2;
        g80 g80Var2;
        MutableState mutableState4;
        Context context2;
        MutableState mutableState5;
        if (imVar instanceof v70) {
            v70Var = (v70) imVar;
            int i2 = v70Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v70Var.j = i2 - Integer.MIN_VALUE;
                Object obj = v70Var.i;
                i = v70Var.j;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    mutableState.setValue(((String) mutableState.getValue()) + "Starting Wireless ADB\n");
                    v70Var.d = context;
                    v70Var.e = g80Var;
                    v70Var.f = cq0Var;
                    v70Var.g = mutableState2;
                    v70Var.h = mutableState3;
                    v70Var.j = 1;
                    if (y80.p(2000L, v70Var) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState5 = v70Var.h;
                        mutableState4 = v70Var.g;
                        cq0Var2 = v70Var.f;
                        g80Var2 = v70Var.e;
                        context2 = v70Var.d;
                        p10.Q(obj);
                        Intent intent = new Intent(context2, (Class<?>) AdbRootActivity.class);
                        intent.putExtra("is_fugu_setup", true);
                        intent.putExtra("use_port_5555", false);
                        intent.putExtra("binary_name", ((ku) mutableState4.getValue()).name());
                        intent.putExtra("is_unlocked_bootloader", e80.d(mutableState5));
                        intent.putExtra("is_adb_rootable", ((MainActivity) cq0Var2).h());
                        g80Var2.J(intent);
                        return w01.a;
                    }
                    mutableState3 = v70Var.h;
                    mutableState2 = v70Var.g;
                    cq0Var = v70Var.f;
                    g80Var = v70Var.e;
                    context = v70Var.d;
                    p10.Q(obj);
                }
                Settings.Global.putInt(context.getContentResolver(), "adb_wifi_enabled", 1);
                cq0Var2 = cq0Var;
                g80Var2 = g80Var;
                mutableState4 = mutableState2;
                context2 = context;
                mutableState5 = mutableState3;
                v70Var.d = context2;
                v70Var.e = g80Var2;
                v70Var.f = cq0Var2;
                v70Var.g = mutableState4;
                v70Var.h = mutableState5;
                v70Var.j = 2;
            }
        }
        v70Var = new v70(imVar);
        Object obj2 = v70Var.i;
        i = v70Var.j;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        Settings.Global.putInt(context.getContentResolver(), "adb_wifi_enabled", 1);
        cq0Var2 = cq0Var;
        g80Var2 = g80Var;
        mutableState4 = mutableState2;
        context2 = context;
        mutableState5 = mutableState3;
        v70Var.d = context2;
        v70Var.e = g80Var2;
        v70Var.f = cq0Var2;
        v70Var.g = mutableState4;
        v70Var.h = mutableState5;
        v70Var.j = 2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        w70 w70Var = new w70(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, hmVar);
        w70Var.p = obj;
        return w70Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((w70) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        Object H;
        File file;
        g80 g80Var;
        cq0 cq0Var;
        MutableState mutableState;
        MutableState mutableState2;
        Context context;
        int i;
        MutableState mutableState3;
        MutableState mutableState4;
        w01 w01Var;
        Context context2;
        boolean z;
        int i2;
        MutableState mutableState5;
        MutableState mutableState6;
        cq0 cq0Var2;
        fi0 fi0Var;
        g80 g80Var2;
        MutableState mutableState7;
        w70 w70Var = this;
        int i3 = w70Var.o;
        w01 w01Var2 = w01.a;
        int i4 = 4;
        int i5 = 2;
        hm hmVar = null;
        vn vnVar = vn.d;
        if (i3 == 0) {
            p10.Q(obj);
            if (((Boolean) w70Var.q.getValue()).booleanValue() && !((Boolean) w70Var.r.getValue()).booleanValue()) {
                MutableState mutableState8 = w70Var.s;
                if (!((Boolean) mutableState8.getValue()).booleanValue()) {
                    MutableState mutableState9 = w70Var.t;
                    if (!((Boolean) mutableState9.getValue()).booleanValue()) {
                        MutableState mutableState10 = w70Var.u;
                        if (!((Boolean) mutableState10.getValue()).booleanValue() && !hr.c()) {
                            mutableState9.setValue(Boolean.TRUE);
                            Context context3 = w70Var.v;
                            File file2 = new File(context3.getApplicationInfo().nativeLibraryDir, "libadb.so");
                            absolutePath = context3.getDir("adb_keys", 0).getAbsolutePath();
                            nq nqVar = nr.a;
                            hq hqVar = hq.d;
                            w2 w2Var = new w2(i5, i4, hmVar);
                            w70Var.p = null;
                            w70Var.d = context3;
                            MutableState mutableState11 = w70Var.w;
                            w70Var.e = mutableState11;
                            w70Var.f = mutableState8;
                            g80 g80Var3 = w70Var.x;
                            w70Var.g = g80Var3;
                            cq0 cq0Var3 = w70Var.y;
                            w70Var.h = cq0Var3;
                            MutableState mutableState12 = w70Var.z;
                            w70Var.i = mutableState12;
                            w70Var.j = mutableState10;
                            w70Var.k = file2;
                            w70Var.l = absolutePath;
                            w70Var.m = 0;
                            w70Var.o = 1;
                            H = p01.H(hqVar, w2Var, w70Var);
                            if (H != vnVar) {
                                file = file2;
                                g80Var = g80Var3;
                                cq0Var = cq0Var3;
                                mutableState = mutableState11;
                                mutableState2 = mutableState10;
                                context = context3;
                                i = 0;
                                mutableState3 = mutableState8;
                                mutableState4 = mutableState12;
                            }
                        }
                    }
                }
            }
            return w01Var2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                } else if (i3 != 4) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                return w01Var2;
            }
            z = w70Var.n;
            i2 = w70Var.m;
            fi0Var = (fi0) w70Var.l;
            MutableState mutableState13 = w70Var.i;
            mutableState6 = (MutableState) w70Var.h;
            cq0 cq0Var4 = (cq0) w70Var.g;
            g80Var2 = (g80) w70Var.f;
            mutableState7 = w70Var.e;
            context2 = w70Var.d;
            p10.Q(obj);
            mutableState5 = mutableState13;
            cq0Var2 = cq0Var4;
            w01Var = w01Var2;
            if (fi0Var.d) {
                return w01Var;
            }
            w70Var.p = null;
            w70Var.d = null;
            w70Var.e = null;
            w70Var.f = null;
            w70Var.g = null;
            w70Var.h = null;
            w70Var.i = null;
            w70Var.j = null;
            w70Var.k = null;
            w70Var.l = null;
            w70Var.m = i2;
            w70Var.n = z;
            w70Var.o = 3;
            return e(context2, g80Var2, mutableState7, cq0Var2, mutableState6, mutableState5, w70Var) == vnVar ? vnVar : w01Var;
        }
        int i6 = w70Var.m;
        String str = (String) w70Var.l;
        File file3 = w70Var.k;
        MutableState mutableState14 = w70Var.j;
        MutableState mutableState15 = w70Var.i;
        cq0 cq0Var5 = (cq0) w70Var.h;
        g80 g80Var4 = (g80) w70Var.g;
        MutableState mutableState16 = (MutableState) w70Var.f;
        MutableState mutableState17 = w70Var.e;
        Context context4 = w70Var.d;
        p10.Q(obj);
        mutableState4 = mutableState15;
        mutableState3 = mutableState16;
        file = file3;
        mutableState2 = mutableState14;
        context = context4;
        mutableState = mutableState17;
        i = i6;
        absolutePath = str;
        cq0Var = cq0Var5;
        g80Var = g80Var4;
        H = obj;
        boolean booleanValue = ((Boolean) H).booleanValue();
        if (booleanValue) {
            mutableState.setValue("Detected ADB port 5555, connecting...\n");
            fi0 fi0Var2 = new fi0();
            absolutePath.getClass();
            String str2 = absolutePath;
            File file4 = file;
            i3 i3Var = new i3(mutableState, 14);
            j3 j3Var = new j3(mutableState3, 16);
            i2 i2Var = new i2(fi0Var2, 22);
            w70Var.p = null;
            w70Var.d = context;
            w70Var.e = mutableState;
            w70Var.f = g80Var;
            w70Var.g = cq0Var;
            w70Var.h = mutableState4;
            w70Var.i = mutableState2;
            w70Var.j = null;
            w70Var.k = null;
            w70Var.l = fi0Var2;
            w70Var.m = i;
            w70Var.n = booleanValue;
            w70Var.o = 2;
            g80 g80Var5 = g80Var;
            Context context5 = context;
            MutableState mutableState18 = mutableState;
            w01Var = w01Var2;
            Object f = j4.f(context5, file4, str2, true, true, i3Var, j3Var, i2Var, null, w70Var);
            w70Var = w70Var;
            if (f != vnVar) {
                context2 = context5;
                z = booleanValue;
                i2 = i;
                mutableState5 = mutableState2;
                mutableState6 = mutableState4;
                cq0Var2 = cq0Var;
                fi0Var = fi0Var2;
                g80Var2 = g80Var5;
                mutableState7 = mutableState18;
                if (fi0Var.d) {
                }
            }
        } else {
            Context context6 = context;
            w70Var.p = null;
            w70Var.d = null;
            w70Var.e = null;
            w70Var.f = null;
            w70Var.g = null;
            w70Var.h = null;
            w70Var.i = null;
            w70Var.j = null;
            w70Var.k = null;
            w70Var.l = null;
            w70Var.m = i;
            w70Var.n = booleanValue;
            w70Var.o = 4;
            if (e(context6, g80Var, mutableState, cq0Var, mutableState4, mutableState2, w70Var) != vnVar) {
                return w01Var2;
            }
        }
    }
}
