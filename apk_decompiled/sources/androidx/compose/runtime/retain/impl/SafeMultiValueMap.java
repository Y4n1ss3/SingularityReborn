package androidx.compose.runtime.retain.impl;

import defpackage.cd0;
import defpackage.dd0;
import defpackage.dq;
import defpackage.fb0;
import defpackage.ky;
import defpackage.q10;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SafeMultiValueMap<K, V> {
    private final fb0 map;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ValueSafetyWrapper {
        public static final int $stable = 8;
        private final Object value;

        public ValueSafetyWrapper(Object obj) {
            this.value = obj;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SafeMultiValueMap(fb0 fb0Var) {
        this.map = fb0Var;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m4125addimpl(fb0 fb0Var, K k, V v) {
        Object obj;
        Object obj2;
        Object obj3;
        if (k == null) {
            obj3 = SafeMultiValueMapKt.NULL_SENTINEL;
            k = (K) obj3;
        }
        int h = fb0Var.h(k);
        boolean z = h < 0;
        Object obj4 = null;
        Object obj5 = z ? null : fb0Var.c[h];
        if (obj5 == null) {
            obj2 = m4141safeWrapIfNecessaryimpl$runtime_retain(fb0Var, v);
        } else if (obj5 instanceof xa0) {
            xa0 xa0Var = (xa0) obj5;
            xa0Var.g(v);
            obj2 = xa0Var;
        } else {
            if (obj5 instanceof ValueSafetyWrapper) {
                obj4 = ((ValueSafetyWrapper) obj5).getValue();
            } else {
                obj = SafeMultiValueMapKt.NULL_SENTINEL;
                if (obj5 != obj) {
                    obj4 = obj5;
                }
            }
            Object[] objArr = dd0.a;
            xa0 xa0Var2 = new xa0(2);
            xa0Var2.g(obj4);
            xa0Var2.g(v);
            obj2 = xa0Var2;
        }
        if (!z) {
            fb0Var.c[h] = obj2;
            return;
        }
        int i = ~h;
        fb0Var.b[i] = k;
        fb0Var.c[i] = obj2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SafeMultiValueMap m4126boximpl(fb0 fb0Var) {
        return new SafeMultiValueMap(fb0Var);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m4127clearimpl(fb0 fb0Var) {
        fb0Var.f();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ fb0 m4129constructorimpl$default(fb0 fb0Var, int i, dq dqVar) {
        if ((i & 1) != 0) {
            fb0Var = new fb0();
        }
        return m4128constructorimpl(fb0Var);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m4130containsimpl(fb0 fb0Var, K k) {
        Object obj;
        if (k == null) {
            obj = SafeMultiValueMapKt.NULL_SENTINEL;
            k = (K) obj;
        }
        return fb0Var.a(k);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4131equalsimpl(fb0 fb0Var, Object obj) {
        return (obj instanceof SafeMultiValueMap) && q10.b(fb0Var, ((SafeMultiValueMap) obj).m4145unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4132equalsimpl0(fb0 fb0Var, fb0 fb0Var2) {
        return q10.b(fb0Var, fb0Var2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m4134forEachValueimpl(fb0 fb0Var, ky kyVar) {
        Object[] objArr = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        if (obj instanceof xa0) {
                            xa0 xa0Var = (xa0) obj;
                            Object[] objArr2 = xa0Var.a;
                            int i4 = xa0Var.b;
                            for (int i5 = 0; i5 < i4; i5++) {
                                kyVar.invoke(objArr2[i5]);
                            }
                        } else {
                            kyVar.invoke(obj);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4135hashCodeimpl(fb0 fb0Var) {
        return fb0Var.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m4136isEmptyimpl(fb0 fb0Var) {
        return fb0Var.e();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m4137isNotEmptyimpl(fb0 fb0Var) {
        return fb0Var.e != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m4138removeFirstimpl(fb0 fb0Var, K k, V v) {
        Object obj;
        Object obj2;
        if (k == null) {
            obj2 = SafeMultiValueMapKt.NULL_SENTINEL;
            k = (K) obj2;
        }
        Object d = fb0Var.d(k);
        if (d == null) {
            return v;
        }
        if (d instanceof xa0) {
            xa0 xa0Var = (xa0) d;
            V v2 = (V) xa0Var.l(0);
            if (xa0Var.d()) {
                fb0Var.j(k);
            }
            if (xa0Var.b == 1) {
                fb0Var.l(k, m4141safeWrapIfNecessaryimpl$runtime_retain(fb0Var, xa0Var.a()));
            }
            return v2;
        }
        V v3 = (V) fb0Var.j(k);
        if (v3 instanceof ValueSafetyWrapper) {
            return (V) ((ValueSafetyWrapper) v3).getValue();
        }
        obj = SafeMultiValueMapKt.NULL_SENTINEL;
        if (v3 == obj) {
            return null;
        }
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m4140removeLastimpl(fb0 fb0Var, K k, V v) {
        Object obj;
        Object obj2;
        if (k == null) {
            obj2 = SafeMultiValueMapKt.NULL_SENTINEL;
            k = (K) obj2;
        }
        V v2 = (V) fb0Var.d(k);
        if (v2 == 0) {
            return v;
        }
        if (v2 instanceof xa0) {
            xa0 xa0Var = (xa0) v2;
            V v3 = (V) xa0Var.l(xa0Var.b - 1);
            if (xa0Var.d()) {
                fb0Var.j(k);
            }
            if (xa0Var.b == 1) {
                fb0Var.l(k, m4141safeWrapIfNecessaryimpl$runtime_retain(fb0Var, xa0Var.a()));
            }
            return v3;
        }
        fb0Var.j(k);
        if (v2 instanceof ValueSafetyWrapper) {
            return (V) ((ValueSafetyWrapper) v2).getValue();
        }
        obj = SafeMultiValueMapKt.NULL_SENTINEL;
        if (v2 == obj) {
            return null;
        }
        return v2;
    }

    /* renamed from: safeWrapIfNecessary-impl$runtime_retain, reason: not valid java name */
    public static final Object m4141safeWrapIfNecessaryimpl$runtime_retain(fb0 fb0Var, Object obj) {
        Object obj2;
        if (obj instanceof xa0) {
            return new ValueSafetyWrapper(obj);
        }
        if (obj != null) {
            return obj;
        }
        obj2 = SafeMultiValueMapKt.NULL_SENTINEL;
        return obj2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4142toStringimpl(fb0 fb0Var) {
        return "SafeMultiValueMap(map=" + fb0Var + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: unwrapSafeValue-impl$runtime_retain, reason: not valid java name */
    public static final V m4143unwrapSafeValueimpl$runtime_retain(fb0 fb0Var, Object obj) {
        Object obj2;
        if (obj instanceof ValueSafetyWrapper) {
            return (V) ((ValueSafetyWrapper) obj).getValue();
        }
        obj2 = SafeMultiValueMapKt.NULL_SENTINEL;
        if (obj == obj2) {
            return null;
        }
        return obj;
    }

    /* renamed from: values-impl, reason: not valid java name */
    public static final cd0 m4144valuesimpl(fb0 fb0Var) {
        if (fb0Var.e()) {
            xa0 xa0Var = dd0.b;
            xa0Var.getClass();
            return xa0Var;
        }
        xa0 xa0Var2 = new xa0();
        Object[] objArr = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof xa0) {
                                xa0Var2.h((xa0) obj);
                            } else {
                                xa0Var2.g(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return xa0Var2;
    }

    public boolean equals(Object obj) {
        return m4131equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m4135hashCodeimpl(this.map);
    }

    public String toString() {
        return m4142toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ fb0 m4145unboximpl() {
        return this.map;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> fb0 m4128constructorimpl(fb0 fb0Var) {
        return fb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m4139removeLastimpl(fb0 fb0Var, K k) {
        Object obj;
        Object obj2;
        if (k == null) {
            obj2 = SafeMultiValueMapKt.NULL_SENTINEL;
            k = (K) obj2;
        }
        V v = (V) fb0Var.d(k);
        if (v == 0) {
            return null;
        }
        if (v instanceof xa0) {
            xa0 xa0Var = (xa0) v;
            V v2 = (V) xa0Var.l(xa0Var.b - 1);
            if (xa0Var.b == 1) {
                fb0Var.l(k, m4141safeWrapIfNecessaryimpl$runtime_retain(fb0Var, xa0Var.a()));
            }
            return v2;
        }
        fb0Var.j(k);
        if (v instanceof ValueSafetyWrapper) {
            return (V) ((ValueSafetyWrapper) v).getValue();
        }
        obj = SafeMultiValueMapKt.NULL_SENTINEL;
        if (v == obj) {
            return null;
        }
        return v;
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m4133forEachValueimpl(fb0 fb0Var, K k, ky kyVar) {
        Object obj;
        Object obj2;
        if (k == null) {
            obj2 = SafeMultiValueMapKt.NULL_SENTINEL;
            k = (K) obj2;
        }
        Object d = fb0Var.d(k);
        if (d != null) {
            if (d instanceof xa0) {
                xa0 xa0Var = (xa0) d;
                Object[] objArr = xa0Var.a;
                int i = xa0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    kyVar.invoke(objArr[i2]);
                }
                return;
            }
            if (d instanceof ValueSafetyWrapper) {
                d = ((ValueSafetyWrapper) d).getValue();
            } else {
                obj = SafeMultiValueMapKt.NULL_SENTINEL;
                if (d == obj) {
                    d = null;
                }
            }
            kyVar.invoke(d);
        }
    }
}
