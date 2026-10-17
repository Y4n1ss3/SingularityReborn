package androidx.compose.runtime;

import defpackage.dq;
import defpackage.q10;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Stack<T> {
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m3859boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m3860clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m3862constructorimpl$default(ArrayList arrayList, int i, dq dqVar) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m3861constructorimpl(arrayList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3863equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && q10.b(arrayList, ((Stack) obj).m3875unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3864equalsimpl0(ArrayList<Object> arrayList, ArrayList<Object> arrayList2) {
        return q10.b(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m3865getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3866hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3867isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3868isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m3867isEmptyimpl(arrayList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m3869peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m3865getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m3871popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m3865getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m3872pushimpl(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m3873toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3874toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m3863equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m3866hashCodeimpl(this.backing);
    }

    public String toString() {
        return m3874toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m3875unboximpl() {
        return this.backing;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m3870peekimpl(ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m3861constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }
}
