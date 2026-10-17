package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class do0 extends eo0 {
    public static wv W(ao0 ao0Var, ky kyVar) {
        return new wv(new br(ao0Var, kyVar, 3), false, new kl0(29));
    }

    public static List X(ao0 ao0Var) {
        ao0Var.getClass();
        Iterator it = ao0Var.iterator();
        if (!it.hasNext()) {
            return ut.d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return y80.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
