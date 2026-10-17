package androidx.compose.foundation.text.input.internal;

import defpackage.m50;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCacheKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> mergeNullableLists(List<? extends T> list, List<? extends T> list2) {
        if ((list == 0 || list.isEmpty()) && (list2 == 0 || list2.isEmpty())) {
            return null;
        }
        if (list == 0 || list.isEmpty()) {
            return list2;
        }
        if (list2 == 0 || list2.isEmpty()) {
            return list;
        }
        m50 o = y80.o();
        o.addAll(list);
        o.addAll(list2);
        return y80.d(o);
    }
}
