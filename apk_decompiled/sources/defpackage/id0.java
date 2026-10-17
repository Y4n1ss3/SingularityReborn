package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class id0 extends f30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ rd0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id0(rd0 rd0Var, int i) {
        super(1);
        this.d = i;
        this.e = rd0Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = null;
        rd0 rd0Var = this.e;
        switch (i) {
            case 0:
                gc gcVar = (gc) obj;
                gcVar.getClass();
                qb qbVar = rd0Var.b;
                ListIterator listIterator = qbVar.listIterator(qbVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((hd0) previous).isEnabled()) {
                            obj2 = previous;
                        }
                    }
                }
                hd0 hd0Var = (hd0) obj2;
                rd0Var.c = hd0Var;
                if (hd0Var != null) {
                    hd0Var.handleOnBackStarted(gcVar);
                    break;
                }
                break;
            default:
                gc gcVar2 = (gc) obj;
                gcVar2.getClass();
                hd0 hd0Var2 = rd0Var.c;
                if (hd0Var2 == null) {
                    qb qbVar2 = rd0Var.b;
                    ListIterator listIterator2 = qbVar2.listIterator(qbVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            if (((hd0) previous2).isEnabled()) {
                                obj2 = previous2;
                            }
                        }
                    }
                    hd0Var2 = (hd0) obj2;
                }
                if (hd0Var2 != null) {
                    hd0Var2.handleOnBackProgressed(gcVar2);
                    break;
                }
                break;
        }
        return w01Var;
    }
}
