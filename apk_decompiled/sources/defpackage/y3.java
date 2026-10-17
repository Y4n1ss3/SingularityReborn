package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y3 implements NsdManager.DiscoveryListener {
    public final /* synthetic */ gg a;
    public final /* synthetic */ ConcurrentLinkedQueue b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ un d;
    public final /* synthetic */ NsdManager e;
    public final /* synthetic */ ji0 f;

    public y3(gg ggVar, un unVar, ji0 ji0Var, NsdManager nsdManager, ConcurrentLinkedQueue concurrentLinkedQueue, AtomicBoolean atomicBoolean) {
        this.a = ggVar;
        this.b = concurrentLinkedQueue;
        this.c = atomicBoolean;
        this.d = unVar;
        this.e = nsdManager;
        this.f = ji0Var;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        str.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        str.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        String serviceType = nsdServiceInfo.getServiceType();
        serviceType.getClass();
        if (ds0.g0(serviceType, "_adb-tls-connect", false)) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
            concurrentLinkedQueue.add(nsdServiceInfo);
            d4.e(this.a, this.d, this.f, this.e, concurrentLinkedQueue, this.c);
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        str.getClass();
        gg ggVar = this.a;
        if (ggVar.t() instanceof vc0) {
            ggVar.resumeWith(null);
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        str.getClass();
    }
}
