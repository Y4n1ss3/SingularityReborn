package androidx.compose.runtime;

import defpackage.ao0;
import defpackage.cc;
import defpackage.cd0;
import defpackage.do0;
import defpackage.e10;
import defpackage.es0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ComposePausableCompositionException extends RuntimeException {
    private final cd0 instances;
    private final int lastOperation;
    private final e10 operations;
    private final cd0 reused;

    public ComposePausableCompositionException(cd0 cd0Var, cd0 cd0Var2, e10 e10Var, int i, Throwable th) {
        super(th);
        this.instances = cd0Var;
        this.reused = cd0Var2;
        this.operations = e10Var;
        this.lastOperation = i;
    }

    private final ao0 operationsSequence() {
        return new cc(new ComposePausableCompositionException$operationsSequence$1(this, null), 3);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.lastOperation);
        sb.append(":\n            |");
        List X = do0.X(operationsSequence());
        int size = X.size();
        if (50 >= size) {
            collection = yi.I0(X);
        } else {
            ArrayList arrayList = new ArrayList(50);
            if (X instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList.add(X.get(i));
                }
            } else {
                ListIterator listIterator = X.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            collection = arrayList;
        }
        sb.append(yi.u0(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        return es0.X(sb.toString());
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
