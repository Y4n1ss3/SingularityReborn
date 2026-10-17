package androidx.compose.runtime.collection;

import defpackage.ac;
import defpackage.cd0;
import defpackage.dd0;
import defpackage.dq;
import defpackage.fb0;
import defpackage.k10;
import defpackage.ky;
import defpackage.q10;
import defpackage.xa0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultiValueMap<K, V> {
    private final fb0 map;

    private /* synthetic */ MultiValueMap(fb0 fb0Var) {
        this.map = fb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m3891addimpl(fb0 fb0Var, K k, V v) {
        int h = fb0Var.h(k);
        boolean z = h < 0;
        Object obj = z ? null : fb0Var.c[h];
        if (obj != null) {
            if (obj instanceof xa0) {
                xa0 xa0Var = (xa0) obj;
                xa0Var.g(v);
                v = xa0Var;
            } else {
                Object[] objArr = dd0.a;
                xa0 xa0Var2 = new xa0(2);
                xa0Var2.g(obj);
                xa0Var2.g(v);
                v = xa0Var2;
            }
        }
        if (!z) {
            fb0Var.c[h] = v;
            return;
        }
        int i = ~h;
        fb0Var.b[i] = k;
        fb0Var.c[i] = v;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m3892boximpl(fb0 fb0Var) {
        return new MultiValueMap(fb0Var);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m3893clearimpl(fb0 fb0Var) {
        fb0Var.f();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ fb0 m3895constructorimpl$default(fb0 fb0Var, int i, dq dqVar) {
        if ((i & 1) != 0) {
            fb0Var = new fb0();
        }
        return m3894constructorimpl(fb0Var);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3896containsimpl(fb0 fb0Var, K k) {
        return fb0Var.a(k);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3897equalsimpl(fb0 fb0Var, Object obj) {
        return (obj instanceof MultiValueMap) && q10.b(fb0Var, ((MultiValueMap) obj).m3910unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3898equalsimpl0(fb0 fb0Var, fb0 fb0Var2) {
        return q10.b(fb0Var, fb0Var2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m3900forEachValueimpl(fb0 fb0Var, ky kyVar) {
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
                            cd0 cd0Var = (cd0) obj;
                            Object[] objArr2 = cd0Var.a;
                            int i4 = cd0Var.b;
                            for (int i5 = 0; i5 < i4; i5++) {
                                Object obj2 = objArr2[i5];
                                obj2.getClass();
                                kyVar.invoke(obj2);
                            }
                        } else {
                            obj.getClass();
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

    /* renamed from: get-impl, reason: not valid java name */
    public static final cd0 m3901getimpl(fb0 fb0Var, K k) {
        Object d = fb0Var.d(k);
        if (d == null) {
            xa0 xa0Var = dd0.b;
            xa0Var.getClass();
            return xa0Var;
        }
        if (d instanceof xa0) {
            return (cd0) d;
        }
        Object[] objArr = dd0.a;
        xa0 xa0Var2 = new xa0(1);
        xa0Var2.g(d);
        return xa0Var2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3902hashCodeimpl(fb0 fb0Var) {
        return fb0Var.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3903isEmptyimpl(fb0 fb0Var) {
        return fb0Var.e();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3904isNotEmptyimpl(fb0 fb0Var) {
        return fb0Var.e != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m3905removeFirstimpl(fb0 fb0Var, K k) {
        V v = (V) fb0Var.d(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof xa0)) {
            fb0Var.j(k);
            return v;
        }
        xa0 xa0Var = (xa0) v;
        V v2 = (V) xa0Var.l(0);
        if (xa0Var.d()) {
            fb0Var.j(k);
        }
        if (xa0Var.b == 1) {
            fb0Var.l(k, xa0Var.a());
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m3906removeLastimpl(fb0 fb0Var, K k) {
        V v = (V) fb0Var.d(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof xa0)) {
            fb0Var.j(k);
            return v;
        }
        xa0 xa0Var = (xa0) v;
        V v2 = (V) ExtensionsKt.removeLast(xa0Var);
        v2.getClass();
        if (xa0Var.d()) {
            fb0Var.j(k);
        }
        if (xa0Var.b == 1) {
            fb0Var.l(k, xa0Var.a());
        }
        return v2;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m3907removeValueIfimpl(fb0 fb0Var, K k, ky kyVar) {
        Object d = fb0Var.d(k);
        if (d != null) {
            if (!(d instanceof xa0)) {
                if (((Boolean) kyVar.invoke(d)).booleanValue()) {
                    fb0Var.j(k);
                    return;
                }
                return;
            }
            xa0 xa0Var = (xa0) d;
            int i = xa0Var.b;
            Object[] objArr = xa0Var.a;
            int i2 = 0;
            k10 W = y80.W(0, i);
            int i3 = W.d;
            int i4 = W.e;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) kyVar.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            ac.X(objArr, i - i2, i, null);
            xa0Var.b -= i2;
            if (xa0Var.d()) {
                fb0Var.j(k);
            }
            if (xa0Var.b == 1) {
                fb0Var.l(k, xa0Var.a());
            }
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3908toStringimpl(fb0 fb0Var) {
        return "MultiValueMap(map=" + fb0Var + ')';
    }

    /* renamed from: values-impl, reason: not valid java name */
    public static final cd0 m3909valuesimpl(fb0 fb0Var) {
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
                                obj.getClass();
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
        return m3897equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m3902hashCodeimpl(this.map);
    }

    public String toString() {
        return m3908toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ fb0 m3910unboximpl() {
        return this.map;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> fb0 m3894constructorimpl(fb0 fb0Var) {
        return fb0Var;
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m3899forEachValueimpl(fb0 fb0Var, K k, ky kyVar) {
        Object d = fb0Var.d(k);
        if (d != null) {
            if (d instanceof xa0) {
                cd0 cd0Var = (cd0) d;
                Object[] objArr = cd0Var.a;
                int i = cd0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = objArr[i2];
                    obj.getClass();
                    kyVar.invoke(obj);
                }
                return;
            }
            kyVar.invoke(d);
        }
    }
}
