package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class nz0 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ rw0 f;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz0(rw0 rw0Var, Context context, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = rw0Var;
        this.g = context;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Context context = this.g;
        rw0 rw0Var = this.f;
        switch (i) {
            case 0:
                return new nz0(rw0Var, context, hmVar, 0);
            default:
                return new nz0(rw0Var, context, hmVar, 1);
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
        return ((nz0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        Context context = this.g;
        vn vnVar = vn.d;
        String str = null;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                context.getClass();
                File file = new File(context.getCacheDir(), "Zygisk.ko");
                try {
                    InputStream open = context.getAssets().open("exploit/Zygisk.ko");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            open.getClass();
                            q10.k(open, fileOutputStream);
                            fileOutputStream.close();
                            open.close();
                            str = file.getAbsolutePath();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e("TweaksActivity", "Failed to extract asset: " + e.getMessage());
                }
                if (str == null) {
                    return w01Var;
                }
                String W = es0.W("\n                                                            mkdir -p /data/adb/singularity\n                                                            cp " + str + " /data/adb/singularity/Zygisk.ko\n                                                            chmod +x /data/adb/singularity/Zygisk.ko\n                                                            insmod /data/adb/singularity/Zygisk.ko\n                                                        ");
                zj0 zj0Var = zj0.a;
                this.e = 1;
                return zj0.c(W, true, this) == vnVar ? vnVar : w01Var;
            default:
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        p10.Q(obj);
                        return w01Var;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                nq nqVar = nr.a;
                hq hqVar = hq.d;
                nz0 nz0Var = new nz0(this.f, context, objArr == true ? 1 : 0, 0);
                this.e = 1;
                return p01.H(hqVar, nz0Var, this) == vnVar ? vnVar : w01Var;
        }
    }
}
