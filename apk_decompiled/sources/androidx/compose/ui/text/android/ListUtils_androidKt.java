package androidx.compose.ui.text.android;

import defpackage.ky;
import defpackage.my;
import defpackage.ut;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kyVar.invoke(list.get(i));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(kyVar.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, my myVar) {
        if (list.size() <= 1) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        int size = list.size() - 1;
        while (i < size) {
            i++;
            T t2 = list.get(i);
            arrayList.add(myVar.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }
}
