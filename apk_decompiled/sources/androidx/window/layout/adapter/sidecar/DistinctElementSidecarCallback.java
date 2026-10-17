package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.pp0;
import defpackage.q10;
import defpackage.qp0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final SidecarInterface.SidecarCallback d;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(qp0 qp0Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001a, code lost:
    
        if (defpackage.pp0.b(r1) == defpackage.pp0.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.a) {
            try {
                SidecarDeviceState sidecarDeviceState2 = this.b;
                if (!q10.b(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.b = sidecarDeviceState;
                    this.d.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                if (q10.b(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b = qp0.b(pp0.c(sidecarWindowLayoutInfo2), pp0.c(sidecarWindowLayoutInfo));
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
