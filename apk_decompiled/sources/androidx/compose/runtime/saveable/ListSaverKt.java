package androidx.compose.runtime.saveable;

import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.s50;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(my myVar, ky kyVar) {
        s50 s50Var = new s50(0, myVar);
        kyVar.getClass();
        p01.f(1, kyVar);
        return SaverKt.Saver(s50Var, kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object listSaver$lambda$0(my myVar, SaverScope saverScope, Object obj) {
        List list = (List) myVar.invoke(saverScope, obj);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !saverScope.canBeSaved(obj2)) {
                throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj2).toString());
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }
}
