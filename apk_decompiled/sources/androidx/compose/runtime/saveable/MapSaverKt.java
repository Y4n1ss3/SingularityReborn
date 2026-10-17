package androidx.compose.runtime.saveable;

import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.s50;
import defpackage.z4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(my myVar, ky kyVar) {
        return ListSaverKt.listSaver(new s50(1, myVar), new z4(kyVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapSaver$lambda$0(my myVar, SaverScope saverScope, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) myVar.invoke(saverScope, obj)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object mapSaver$lambda$1(ky kyVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            o.f("non-zero remainder");
            return null;
        }
        for (int i = 0; i < list.size(); i += 2) {
            Object obj = list.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, list.get(i + 1));
        }
        return kyVar.invoke(linkedHashMap);
    }
}
