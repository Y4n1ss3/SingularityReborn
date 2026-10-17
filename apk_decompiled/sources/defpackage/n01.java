package defpackage;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class n01 implements DisposableEffectResult {
    public final /* synthetic */ Context a;
    public final /* synthetic */ j01 b;
    public final /* synthetic */ y40 c;
    public final /* synthetic */ gx0 d;

    public n01(Context context, j01 j01Var, y40 y40Var, gx0 gx0Var) {
        this.a = context;
        this.b = j01Var;
        this.c = y40Var;
        this.d = gx0Var;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        w50 a = w50.a(this.a);
        j01 j01Var = this.b;
        synchronized (((HashMap) a.b)) {
            try {
                ArrayList arrayList = (ArrayList) ((HashMap) a.b).remove(j01Var);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        v50 v50Var = (v50) arrayList.get(size);
                        v50Var.d = true;
                        for (int i = 0; i < v50Var.a.countActions(); i++) {
                            String action = v50Var.a.getAction(i);
                            ArrayList arrayList2 = (ArrayList) ((HashMap) a.c).get(action);
                            if (arrayList2 != null) {
                                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                    v50 v50Var2 = (v50) arrayList2.get(size2);
                                    if (v50Var2.b == j01Var) {
                                        v50Var2.d = true;
                                        arrayList2.remove(size2);
                                    }
                                }
                                if (arrayList2.size() <= 0) {
                                    ((HashMap) a.c).remove(action);
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
        this.c.getLifecycle().b(this.d);
    }
}
