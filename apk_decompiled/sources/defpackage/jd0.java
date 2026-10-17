package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class jd0 extends f30 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ rd0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd0(rd0 rd0Var, int i) {
        super(0);
        this.d = i;
        this.e = rd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // defpackage.iy
    public final Object invoke() {
        hd0 hd0Var;
        int i = this.d;
        w01 w01Var = w01.a;
        rd0 rd0Var = this.e;
        switch (i) {
            case 0:
                rd0Var.b();
                break;
            case 1:
                hd0 hd0Var2 = rd0Var.c;
                if (hd0Var2 == null) {
                    qb qbVar = rd0Var.b;
                    ListIterator listIterator = qbVar.listIterator(qbVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            hd0Var = listIterator.previous();
                            if (((hd0) hd0Var).isEnabled()) {
                            }
                        } else {
                            hd0Var = 0;
                        }
                    }
                    hd0Var2 = hd0Var;
                }
                rd0Var.c = null;
                if (hd0Var2 != null) {
                    hd0Var2.handleOnBackCancelled();
                    break;
                }
                break;
            default:
                rd0Var.b();
                break;
        }
        return w01Var;
    }
}
