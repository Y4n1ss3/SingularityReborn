package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class b4 implements Runnable {
    public final /* synthetic */ gg d;
    public final /* synthetic */ NsdServiceInfo e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ ji0 g;
    public final /* synthetic */ NsdManager h;
    public final /* synthetic */ ConcurrentLinkedQueue i;
    public final /* synthetic */ un j;

    public b4(gg ggVar, NsdServiceInfo nsdServiceInfo, AtomicBoolean atomicBoolean, ji0 ji0Var, NsdManager nsdManager, ConcurrentLinkedQueue concurrentLinkedQueue, un unVar) {
        this.d = ggVar;
        this.e = nsdServiceInfo;
        this.f = atomicBoolean;
        this.g = ji0Var;
        this.h = nsdManager;
        this.i = concurrentLinkedQueue;
        this.j = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NsdManager nsdManager = this.h;
        ji0 ji0Var = this.g;
        gg ggVar = this.d;
        NsdServiceInfo nsdServiceInfo = this.e;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(nsdServiceInfo.getHost(), nsdServiceInfo.getPort()), 1000);
                try {
                    socket.close();
                } catch (Exception unused) {
                }
                if (ggVar.t() instanceof vc0) {
                    ggVar.resumeWith(Integer.valueOf(nsdServiceInfo.getPort()));
                    try {
                        NsdManager.DiscoveryListener discoveryListener = (NsdManager.DiscoveryListener) ji0Var.d;
                        if (discoveryListener != null) {
                            nsdManager.stopServiceDiscovery(discoveryListener);
                        }
                    } catch (Exception unused2) {
                    }
                }
            } finally {
            }
        } catch (Exception unused3) {
            AtomicBoolean atomicBoolean = this.f;
            atomicBoolean.set(false);
            d4.e(ggVar, this.j, ji0Var, nsdManager, this.i, atomicBoolean);
        }
    }
}
