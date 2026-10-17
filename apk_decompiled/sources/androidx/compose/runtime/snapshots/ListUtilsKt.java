package androidx.compose.runtime.snapshots;

import defpackage.cd0;
import defpackage.k10;
import defpackage.ky;
import defpackage.my;
import defpackage.y80;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t, ky kyVar) {
        if (kyVar != null) {
            appendable.append((CharSequence) kyVar.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    public static final <T> boolean fastAll(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) kyVar.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) kyVar.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> List<T> fastFilterIndexed(List<? extends T> list, my myVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) myVar.invoke(Integer.valueOf(i), t)).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(cd0 cd0Var, ky kyVar) {
        k10 W = y80.W(0, cd0Var.b);
        int i = W.d;
        int i2 = W.e;
        if (i > i2) {
            return;
        }
        while (true) {
            kyVar.invoke(cd0Var.b(i));
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, my myVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            myVar.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> list, ky kyVar) {
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            Object invoke = kyVar.invoke(t);
            Object obj = hashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(invoke, obj);
            }
            ((ArrayList) obj).add(t);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ky kyVar) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, t, kyVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ky kyVar) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, kyVar)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ky kyVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            kyVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ky kyVar2 = kyVar;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i, charSequence5, kyVar2);
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, ky kyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(kyVar.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, ky kyVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = kyVar.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T> boolean fastNone(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) kyVar.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }

    public static final <T> void fastForEach(List<? extends T> list, ky kyVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kyVar.invoke(list.get(i));
        }
    }
}
