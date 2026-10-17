package androidx.compose.runtime.composer.linkbuffer;

import defpackage.ky;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkGroupSourceInformationKt {
    private static final <T> int fastIndexOf(ArrayList<T> arrayList, ky kyVar) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) kyVar.invoke(arrayList.get(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, ky kyVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = arrayList.get(size);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }
}
