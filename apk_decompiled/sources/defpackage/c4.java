package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c4 implements NsdManager.ResolveListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ ConcurrentLinkedQueue b;
    public final /* synthetic */ un c;
    public final /* synthetic */ NsdManager d;
    public final /* synthetic */ gg e;
    public final /* synthetic */ ji0 f;

    public c4(gg ggVar, un unVar, ji0 ji0Var, NsdManager nsdManager, ConcurrentLinkedQueue concurrentLinkedQueue, AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
        this.b = concurrentLinkedQueue;
        this.c = unVar;
        this.d = nsdManager;
        this.e = ggVar;
        this.f = ji0Var;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        AtomicBoolean atomicBoolean = this.a;
        atomicBoolean.set(false);
        d4.e(this.e, this.c, this.f, this.d, this.b, atomicBoolean);
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        new Thread(new b4(this.e, nsdServiceInfo, this.a, this.f, this.d, this.b, this.c)).start();
    }
}
