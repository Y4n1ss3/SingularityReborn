package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ab implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ab(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            default:
                w01 w01Var = w01.a;
                ((gg) obj2).resumeWith(w01Var);
                return w01Var;
        }
    }
}
