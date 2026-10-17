package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mz0 extends us0 implements my {
    public File d;
    public MutableState e;
    public boolean f;
    public int g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ rw0 i;
    public final /* synthetic */ SharedPreferences j;
    public final /* synthetic */ ky k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(Context context, rw0 rw0Var, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.h = context;
        this.i = rw0Var;
        this.j = sharedPreferences;
        this.k = kyVar;
        this.l = mutableState;
        this.m = mutableState2;
        this.n = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new mz0(this.h, this.i, this.j, this.k, this.l, this.m, this.n, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((mz0) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        if (r15 != r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r15 == r10) goto L28;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        boolean z;
        MutableState mutableState;
        int i = this.g;
        ky kyVar = this.k;
        MutableState mutableState2 = this.l;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            mutableState2.setValue(Boolean.TRUE);
            file = new File(this.h.getCacheDir(), "frida-server-temp");
            this.d = file;
            this.g = 1;
            nq nqVar = nr.a;
            obj = p01.H(hq.d, new z2(file, null, 6), this);
        } else if (i == 1) {
            file = this.d;
            p10.Q(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = this.e;
                    p10.Q(obj);
                    mutableState.setValue((String) obj);
                    kyVar.invoke("Frida Server downloaded successfully");
                    mutableState2.setValue(Boolean.FALSE);
                    return w01.a;
                }
                z = this.f;
                p10.Q(obj);
                String obj2 = ds0.E0((String) obj).toString();
                this.m.setValue(obj2);
                this.j.edit().putString("frida_server_version", obj2).apply();
                this.d = null;
                MutableState mutableState3 = this.n;
                this.e = mutableState3;
                this.f = z;
                this.g = 4;
                nq nqVar2 = nr.a;
                Object H = p01.H(hq.d, new w2(2, 6, null), this);
                if (H != vnVar) {
                    obj = H;
                    mutableState = mutableState3;
                    mutableState.setValue((String) obj);
                    kyVar.invoke("Frida Server downloaded successfully");
                    mutableState2.setValue(Boolean.FALSE);
                    return w01.a;
                }
                return vnVar;
            }
            z = this.f;
            p10.Q(obj);
            zj0 zj0Var = zj0.a;
            this.d = null;
            this.f = z;
            this.g = 3;
            obj = zj0.c("/data/local/tmp/frida-server --version", false, this);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!booleanValue) {
            kyVar.invoke("Download failed");
            mutableState2.setValue(Boolean.FALSE);
            return w01.a;
        }
        String W = es0.W("\n                                                                    cp " + file.getAbsolutePath() + " /data/local/tmp/frida-server\n                                                                    rm -f " + file.getAbsolutePath() + "\n                                                                    chmod 755 /data/local/tmp/frida-server\n                                                                    chown shell:shell /data/local/tmp/frida-server\n                                                                ");
        zj0 zj0Var2 = zj0.a;
        this.d = null;
        this.f = booleanValue;
        this.g = 2;
        if (zj0.c(W, false, this) != vnVar) {
            z = booleanValue;
            zj0 zj0Var3 = zj0.a;
            this.d = null;
            this.f = z;
            this.g = 3;
            obj = zj0.c("/data/local/tmp/frida-server --version", false, this);
        }
        return vnVar;
    }
}
