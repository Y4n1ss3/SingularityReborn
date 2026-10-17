package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.ui.semantics.SemanticsSortKt;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class mj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int sort$lambda$1;
        int sortByGeometryGroupings$lambda$1;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (ky kyVar : (ky[]) obj3) {
                    int i2 = p01.i((Comparable) kyVar.invoke(obj), (Comparable) kyVar.invoke(obj2));
                    if (i2 != 0) {
                        return i2;
                    }
                }
                return 0;
            case 1:
                sort$lambda$1 = SelectionRegistrarImpl.sort$lambda$1((w5) obj3, obj, obj2);
                return sort$lambda$1;
            default:
                sortByGeometryGroupings$lambda$1 = SemanticsSortKt.sortByGeometryGroupings$lambda$1((my) obj3, obj, obj2);
                return sortByGeometryGroupings$lambda$1;
        }
    }
}
