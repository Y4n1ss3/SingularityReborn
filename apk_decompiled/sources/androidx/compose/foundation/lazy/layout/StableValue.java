package androidx.compose.foundation.lazy.layout;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m952boximpl(Object obj) {
        return new StableValue(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m954equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && q10.b(obj, ((StableValue) obj2).m958unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m955equalsimpl0(Object obj, Object obj2) {
        return q10.b(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m956hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m957toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m954equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m956hashCodeimpl(this.value);
    }

    public String toString() {
        return m957toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m958unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m953constructorimpl(T t) {
        return t;
    }
}
