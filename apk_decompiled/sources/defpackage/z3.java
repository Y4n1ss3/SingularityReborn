package defpackage;

import android.graphics.Typeface;
import android.net.nsd.NsdManager;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z3 implements Runnable {
    public final /* synthetic */ int d;
    public Object e;
    public final /* synthetic */ Object f;

    public z3(c50 c50Var, Runnable runnable) {
        this.d = 3;
        this.f = c50Var;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                NsdManager nsdManager = (NsdManager) obj;
                try {
                    NsdManager.DiscoveryListener discoveryListener = (NsdManager.DiscoveryListener) ((ji0) this.e).d;
                    if (discoveryListener != null) {
                        nsdManager.stopServiceDiscovery(discoveryListener);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                Typeface typeface = (Typeface) obj;
                ej0 ej0Var = (ej0) ((p7) this.e).d;
                if (ej0Var != null) {
                    ej0Var.onFontRetrieved(typeface);
                    break;
                }
                break;
            case 2:
                ((gg) this.e).C((rz) obj);
                break;
            case 3:
                c50 c50Var = (c50) obj;
                mn mnVar = c50Var.e;
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.e).run();
                    } catch (Throwable th) {
                        cq.u(st.d, th);
                    }
                    Runnable g = c50Var.g();
                    if (g != null) {
                        this.e = g;
                        i2++;
                        if (i2 >= 16 && mnVar.isDispatchNeeded(c50Var)) {
                            mnVar.dispatch(c50Var, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            default:
                ((wx) this.e).accept(obj);
                break;
        }
    }

    public /* synthetic */ z3(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }
}
