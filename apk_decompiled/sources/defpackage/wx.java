package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wx implements nl {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nl
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xx xxVar = (xx) obj;
                if (xxVar == null) {
                    xxVar = new xx(-3);
                }
                ((bg) this.b).c(xxVar);
                return;
            default:
                xx xxVar2 = (xx) obj;
                synchronized (yx.c) {
                    try {
                        bq0 bq0Var = yx.d;
                        ArrayList arrayList = (ArrayList) bq0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        bq0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((nl) arrayList.get(i)).accept(xxVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
