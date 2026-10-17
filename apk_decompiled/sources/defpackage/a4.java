package defpackage;

import android.net.nsd.NsdManager;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a4 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a4(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                new Thread(new z3(0, (ji0) obj3, (NsdManager) obj2)).start();
                return w01Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj3;
                String str2 = ((b8) obj2).c;
                Object obj4 = snapshotStateMap.get(str2);
                obj4.getClass();
                snapshotStateMap.put(str2, e8.a((e8) obj4, str, true, null, false, null, 28));
                return w01Var;
            case 2:
                return ((d1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                return ((d1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}
