package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.compose.foundation.lazy.LazyItemScope;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ja implements iy {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ LazyItemScope e;
    public final /* synthetic */ sa f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ ky i;
    public final /* synthetic */ q90 j;
    public final /* synthetic */ Intent k;

    public ja(boolean z, LazyItemScope lazyItemScope, sa saVar, Context context, ky kyVar, ky kyVar2, q90 q90Var, Intent intent) {
        this.d = z;
        this.e = lazyItemScope;
        this.f = saVar;
        this.g = context;
        this.h = kyVar;
        this.i = kyVar2;
        this.j = q90Var;
        this.k = intent;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Object obj;
        Object jj0Var;
        boolean z = this.d;
        w01 w01Var = w01.a;
        q90 q90Var = this.j;
        ky kyVar = this.h;
        Context context = this.g;
        if (z) {
            try {
                context.startActivity(this.k);
                jj0Var = w01Var;
            } catch (Throwable th) {
                jj0Var = new jj0(th);
            }
            if (kj0.a(jj0Var) != null) {
                kyVar.invoke("Couldn't open ".concat(q90Var.b));
            }
            return w01Var;
        }
        sa saVar = this.f;
        if (!saVar.d || saVar.g) {
            this.i.invoke(q90Var);
            return w01Var;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("org.matrix.vector.manager");
        if (launchIntentForPackage == null) {
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
            installedApplications.getClass();
            Iterator<T> it = installedApplications.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                String str = applicationInfo.packageName;
                str.getClass();
                if (ds0.g0(str, "vector", true) || ds0.g0(packageManager.getApplicationLabel(applicationInfo).toString(), "vector", true)) {
                    break;
                }
            }
            ApplicationInfo applicationInfo2 = (ApplicationInfo) obj;
            launchIntentForPackage = applicationInfo2 == null ? null : packageManager.getLaunchIntentForPackage(applicationInfo2.packageName);
        }
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
            return w01Var;
        }
        kyVar.invoke("Couldn't find the Vector manager app");
        return w01Var;
    }
}
