package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qp0 {
    public static final /* synthetic */ int b = 0;
    public final i11 a = i11.e;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (q10.b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return q10.b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final t31 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new t31(ut.d);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        pp0.d(sidecarDeviceState2, pp0.b(sidecarDeviceState));
        return new t31(d(pp0.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vz i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public final vz i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        ox oxVar;
        ox oxVar2 = ox.e;
        sidecarDisplayFeature.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new e11(sidecarDisplayFeature, this.a, ts.e).D("Type must be either TYPE_FOLD or TYPE_HINGE", new lp0()).D("Feature bounds must not be 0", new mp0()).D("TYPE_FOLD must have 0 area", new np0()).D("Feature be pinned to either left or top", new op0()).i();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            oxVar = ox.g;
        } else {
            if (type != 2) {
                return null;
            }
            oxVar = ox.h;
        }
        int b2 = pp0.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            oxVar2 = ox.f;
        } else if (b2 != 3 && b2 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new vz(new gf(rect), oxVar, oxVar2);
    }
}
