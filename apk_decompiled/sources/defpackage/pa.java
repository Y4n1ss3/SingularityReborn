package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pa extends us0 implements my {
    public SnapshotStateMap d;
    public Context e;
    public MutableState f;
    public Iterator g;
    public b8 h;
    public int i;
    public int j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ SnapshotStateMap l;
    public final /* synthetic */ Context m;
    public final /* synthetic */ MutableState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(ArrayList arrayList, SnapshotStateMap snapshotStateMap, Context context, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.k = arrayList;
        this.l = snapshotStateMap;
        this.m = context;
        this.n = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new pa(this.k, this.l, this.m, this.n, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((pa) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ca -> B:7:0x00cc). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context context;
        MutableState mutableState;
        Iterator it;
        SnapshotStateMap snapshotStateMap;
        int i;
        int i2 = this.j;
        if (i2 == 0) {
            p10.Q(obj);
            Iterator it2 = this.k.iterator();
            SnapshotStateMap snapshotStateMap2 = this.l;
            context = this.m;
            mutableState = this.n;
            it = it2;
            snapshotStateMap = snapshotStateMap2;
            i = 0;
            while (it.hasNext()) {
            }
            return w01.a;
        }
        if (i2 != 1) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.i;
        b8 b8Var = this.h;
        it = this.g;
        mutableState = this.f;
        Context context2 = this.e;
        SnapshotStateMap snapshotStateMap3 = this.d;
        try {
            p10.Q(obj);
        } catch (Exception e) {
            q10.c(Log.e("AppsActivity", "Failed to check update for " + b8Var.a + ": " + e.getMessage()));
        }
        context = context2;
        snapshotStateMap = snapshotStateMap3;
        while (it.hasNext()) {
            b8 b8Var2 = (b8) it.next();
            String str = b8Var2.f;
            String str2 = b8Var2.c;
            String str3 = b8Var2.g;
            e8 e8Var = (e8) snapshotStateMap.get(str2);
            String str4 = e8Var != null ? e8Var.c : null;
            if (str != null && str3 != null && str4 != null) {
                try {
                } catch (Exception e2) {
                    snapshotStateMap3 = snapshotStateMap;
                    context2 = context;
                    q10.c(Log.e("AppsActivity", "Failed to check update for " + b8Var2.a + ": " + e2.getMessage()));
                }
                ni0 ni0Var = kb.a;
                List list = (List) mutableState.getValue();
                if (list == null || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (q10.b(((b8) it3.next()).c, str2)) {
                            break;
                        }
                    }
                }
                boolean z = false;
                String str5 = str4;
                String p = kb.p(ts.k(str, str3, context, false, z, 24).getString("tag_name"));
                p.getClass();
                if (d41.E(p, str5)) {
                    nq nqVar = nr.a;
                    rz rzVar = f80.a;
                    f4 f4Var = new f4(snapshotStateMap, b8Var2, p, null);
                    this.d = snapshotStateMap;
                    this.e = context;
                    this.f = mutableState;
                    this.g = it;
                    this.h = b8Var2;
                    this.i = i;
                    this.j = 1;
                    Object H = p01.H(rzVar, f4Var, this);
                    vn vnVar = vn.d;
                    if (H == vnVar) {
                        return vnVar;
                    }
                    snapshotStateMap3 = snapshotStateMap;
                    context2 = context;
                    context = context2;
                    snapshotStateMap = snapshotStateMap3;
                    while (it.hasNext()) {
                    }
                }
            }
        }
        return w01.a;
    }
}
