package androidx.compose.runtime.collection;

import defpackage.ac;
import defpackage.dq;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.ky;
import defpackage.my;
import defpackage.no0;
import defpackage.p01;
import defpackage.p80;
import defpackage.q10;
import defpackage.ql0;
import defpackage.rl0;
import defpackage.sl0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {
    private final fb0 map;

    private /* synthetic */ ScopeMap(fb0 fb0Var) {
        this.map = fb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [gb0] */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m3911addimpl(fb0 fb0Var, Key key, Scope scope) {
        int h = fb0Var.h(key);
        boolean z = h < 0;
        Scope scope2 = z ? null : fb0Var.c[h];
        if (scope2 != null) {
            if (scope2 instanceof gb0) {
                ((gb0) scope2).d(scope);
            } else if (scope2 != scope) {
                ?? gb0Var = new gb0();
                gb0Var.d(scope2);
                gb0Var.d(scope);
                scope = gb0Var;
            }
            scope = scope2;
        }
        if (!z) {
            fb0Var.c[h] = scope;
            return;
        }
        int i = ~h;
        fb0Var.b[i] = key;
        fb0Var.c[i] = scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1 != false) goto L20;
     */
    /* renamed from: addAll-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3912addAllimpl(fb0 fb0Var, Key key, rl0 rl0Var) {
        Object obj;
        int h = fb0Var.h(key);
        boolean z = h < 0;
        Object obj2 = z ? null : fb0Var.c[h];
        if (obj2 == null) {
            gb0 gb0Var = sl0.a;
            gb0 gb0Var2 = new gb0();
            gb0Var2.e(rl0Var);
            obj = gb0Var2;
        } else if (obj2 instanceof gb0) {
            gb0 gb0Var3 = (gb0) obj2;
            gb0Var3.e(rl0Var);
            obj = gb0Var3;
        } else {
            if (rl0Var.d == 1) {
                boolean a = rl0Var.a(obj2);
                obj = obj2;
            }
            gb0 gb0Var4 = sl0.a;
            gb0 gb0Var5 = new gb0();
            gb0Var5.k(rl0Var);
            gb0Var5.d(obj2);
            obj = gb0Var5;
        }
        if (!z) {
            fb0Var.c[h] = obj;
            return;
        }
        int i = ~h;
        fb0Var.b[i] = key;
        fb0Var.c[i] = obj;
    }

    /* renamed from: anyScopeOf-impl, reason: not valid java name */
    public static final boolean m3913anyScopeOfimpl(fb0 fb0Var, Key key, ky kyVar) {
        Object d = fb0Var.d(key);
        if (d != null) {
            if (d instanceof gb0) {
                gb0 gb0Var = (gb0) d;
                Object[] objArr = gb0Var.b;
                long[] jArr = gb0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128 && ((Boolean) kyVar.invoke(objArr[(i << 3) + i3])).booleanValue()) {
                                    return true;
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
            } else if (((Boolean) kyVar.invoke(d)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [no0] */
    /* renamed from: asMap-impl, reason: not valid java name */
    public static final Map<Key, Set<Scope>> m3914asMapimpl(fb0 fb0Var) {
        LinkedHashSet linkedHashSet;
        HashMap hashMap = new HashMap();
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            obj.getClass();
                            if (obj2 instanceof gb0) {
                                linkedHashSet = new no0((gb0) obj2);
                            } else {
                                obj2.getClass();
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet(p80.L(1));
                                ac.m0(new Object[]{obj2}, linkedHashSet2);
                                linkedHashSet = linkedHashSet2;
                            }
                            hashMap.put(obj, linkedHashSet);
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
        return hashMap;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m3915boximpl(fb0 fb0Var) {
        return new ScopeMap(fb0Var);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m3916clearimpl(fb0 fb0Var) {
        fb0Var.f();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static fb0 m3918constructorimpl$default(fb0 fb0Var, int i, dq dqVar) {
        if ((i & 1) != 0) {
            long[] jArr = ql0.a;
            fb0Var = new fb0();
        }
        return m3917constructorimpl(fb0Var);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3919containsimpl(fb0 fb0Var, Key key) {
        return fb0Var.b(key);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3920equalsimpl(fb0 fb0Var, Object obj) {
        return (obj instanceof ScopeMap) && q10.b(fb0Var, ((ScopeMap) obj).m3937unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3921equalsimpl0(fb0 fb0Var, fb0 fb0Var2) {
        return q10.b(fb0Var, fb0Var2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m3922forEachimpl(fb0 fb0Var, my myVar) {
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        obj.getClass();
                        myVar.invoke(obj, obj2);
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

    /* renamed from: forEachKey-impl, reason: not valid java name */
    public static final void m3923forEachKeyimpl(fb0 fb0Var, ky kyVar) {
        kyVar.getClass();
        p01.f(1, kyVar);
        Object[] objArr = fb0Var.b;
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
                        kyVar.invoke(objArr[(i << 3) + i3]);
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

    /* renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m3924forEachScopeOfimpl(fb0 fb0Var, Key key, ky kyVar) {
        Object d = fb0Var.d(key);
        if (d == null) {
            return;
        }
        if (!(d instanceof gb0)) {
            kyVar.invoke(d);
            return;
        }
        gb0 gb0Var = (gb0) d;
        Object[] objArr = gb0Var.b;
        long[] jArr = gb0Var.a;
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
                        kyVar.invoke(objArr[(i << 3) + i3]);
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
    public static final Object m3925getimpl(fb0 fb0Var, Key key) {
        return fb0Var.d(key);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m3926getSizeimpl(fb0 fb0Var) {
        return fb0Var.e;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3927hashCodeimpl(fb0 fb0Var) {
        return fb0Var.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3928isEmptyimpl(fb0 fb0Var) {
        return fb0Var.e();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3929isNotEmptyimpl(fb0 fb0Var) {
        return fb0Var.e != 0;
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m3931removeimpl(fb0 fb0Var, Key key, Scope scope) {
        Object d = fb0Var.d(key);
        if (d == null) {
            return false;
        }
        if (!(d instanceof gb0)) {
            if (!d.equals(scope)) {
                return false;
            }
            fb0Var.j(key);
            return true;
        }
        gb0 gb0Var = (gb0) d;
        boolean m = gb0Var.m(scope);
        if (m && gb0Var.b()) {
            fb0Var.j(key);
        }
        return m;
    }

    /* renamed from: removeIf-impl, reason: not valid java name */
    public static final void m3932removeIfimpl(fb0 fb0Var, my myVar) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        boolean booleanValue;
        long[] jArr3;
        long j3;
        long[] jArr4 = fb0Var.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j4 = jArr4[i3];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j4 & 255) < 128) {
                        int i7 = (i3 << 3) + i6;
                        c = c2;
                        Object obj = fb0Var.b[i7];
                        j2 = j5;
                        Object obj2 = fb0Var.c[i7];
                        obj.getClass();
                        if (obj2 instanceof gb0) {
                            gb0 gb0Var = (gb0) obj2;
                            Object[] objArr = gb0Var.b;
                            long[] jArr5 = gb0Var.a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                j = j4;
                                int i8 = i4;
                                int i9 = 0;
                                while (true) {
                                    long j6 = jArr5[i9];
                                    Object[] objArr2 = objArr;
                                    i = i6;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        int i11 = 0;
                                        while (i11 < i10) {
                                            if ((j6 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i12 = (i9 << 3) + i11;
                                                j3 = j6;
                                                if (((Boolean) myVar.invoke(obj, objArr2[i12])).booleanValue()) {
                                                    gb0Var.n(i12);
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i8;
                                            i11++;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i10 != i8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    i6 = i;
                                    objArr = objArr2;
                                    jArr4 = jArr2;
                                    i8 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j = j4;
                                i = i6;
                            }
                            booleanValue = gb0Var.b();
                        } else {
                            jArr2 = jArr4;
                            j = j4;
                            i = i6;
                            obj2.getClass();
                            booleanValue = ((Boolean) myVar.invoke(obj, obj2)).booleanValue();
                        }
                        if (booleanValue) {
                            fb0Var.k(i7);
                        }
                        i2 = 8;
                    } else {
                        jArr2 = jArr4;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i6;
                        i2 = i4;
                    }
                    j4 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j5 = j2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i5 != i4) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            jArr4 = jArr;
        }
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m3933removeScopeimpl(fb0 fb0Var, Scope scope) {
        boolean z;
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
                        int i4 = (i << 3) + i3;
                        Object obj = fb0Var.b[i4];
                        Object obj2 = fb0Var.c[i4];
                        if (obj2 instanceof gb0) {
                            gb0 gb0Var = (gb0) obj2;
                            gb0Var.m(scope);
                            z = gb0Var.b();
                        } else {
                            z = obj2 == scope;
                        }
                        if (z) {
                            fb0Var.k(i4);
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

    /* renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m3934removeScopeIfimpl(fb0 fb0Var, ky kyVar) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean booleanValue;
        gb0 gb0Var;
        long[] jArr3;
        int i2;
        gb0 gb0Var2;
        long[] jArr4 = fb0Var.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr4[i3];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j3 & 255) < 128) {
                        int i7 = (i3 << 3) + i6;
                        c = c2;
                        Object obj = fb0Var.b[i7];
                        Object obj2 = fb0Var.c[i7];
                        j2 = j4;
                        if (obj2 instanceof gb0) {
                            gb0 gb0Var3 = (gb0) obj2;
                            Object[] objArr = gb0Var3.b;
                            long[] jArr5 = gb0Var3.a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i8 = i4;
                                gb0 gb0Var4 = gb0Var3;
                                int i9 = 0;
                                while (true) {
                                    long j5 = jArr5[i9];
                                    j = j3;
                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        int i11 = 0;
                                        while (i11 < i10) {
                                            if ((j5 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i12 = (i9 << 3) + i11;
                                                i2 = i11;
                                                if (((Boolean) kyVar.invoke(objArr[i12])).booleanValue()) {
                                                    gb0Var2 = gb0Var4;
                                                    gb0Var2.n(i12);
                                                    j5 >>= i8;
                                                    gb0Var4 = gb0Var2;
                                                    i11 = i2 + 1;
                                                    jArr4 = jArr3;
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                i2 = i11;
                                            }
                                            gb0Var2 = gb0Var4;
                                            j5 >>= i8;
                                            gb0Var4 = gb0Var2;
                                            i11 = i2 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        gb0Var = gb0Var4;
                                        if (i10 != i8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        gb0Var = gb0Var4;
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    gb0Var4 = gb0Var;
                                    j3 = j;
                                    jArr4 = jArr2;
                                    i8 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j = j3;
                                gb0Var = gb0Var3;
                            }
                            booleanValue = gb0Var.b();
                        } else {
                            jArr2 = jArr4;
                            j = j3;
                            obj2.getClass();
                            booleanValue = ((Boolean) kyVar.invoke(obj2)).booleanValue();
                        }
                        if (booleanValue) {
                            fb0Var.k(i7);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr4;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i4;
                    }
                    j3 = j >> i;
                    i6++;
                    i4 = i;
                    c2 = c;
                    j4 = j2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i5 != i4) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            jArr4 = jArr;
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3935setimpl(fb0 fb0Var, Key key, Scope scope) {
        fb0Var.l(key, scope);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3936toStringimpl(fb0 fb0Var) {
        return "ScopeMap(map=" + fb0Var + ')';
    }

    public boolean equals(Object obj) {
        return m3920equalsimpl(this.map, obj);
    }

    public final fb0 getMap() {
        return this.map;
    }

    public int hashCode() {
        return m3927hashCodeimpl(this.map);
    }

    public String toString() {
        return m3936toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ fb0 m3937unboximpl() {
        return this.map;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> fb0 m3917constructorimpl(fb0 fb0Var) {
        return fb0Var;
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final Object m3930removeimpl(fb0 fb0Var, Key key) {
        return fb0Var.j(key);
    }
}
