package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import defpackage.fb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.ql0;
import defpackage.vt;
import defpackage.y80;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final ky canBeSaved;
    private final fb0 restored;
    private fb0 valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> map, ky kyVar) {
        this.canBeSaved = kyVar;
        this.restored = (map == null || map.isEmpty()) ? null : SaveableStateRegistryKt.toMutableScatterMap(map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return ((Boolean) this.canBeSaved.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        fb0 fb0Var;
        fb0 fb0Var2 = this.restored;
        List list = fb0Var2 != null ? (List) fb0Var2.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (fb0Var = this.restored) != null) {
            List subList = list.subList(1, list.size());
            int h = fb0Var.h(str);
            if (h < 0) {
                h = ~h;
            }
            Object[] objArr = fb0Var.c;
            Object obj = objArr[h];
            fb0Var.b[h] = str;
            objArr[h] = subList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, List<Object>> performSave() {
        char c;
        long j;
        long j2;
        long j3;
        fb0 fb0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        fb0 fb0Var2 = this.restored;
        if (fb0Var2 == null && this.valueProviders == null) {
            return vt.d;
        }
        int i3 = 0;
        int i4 = fb0Var2 != null ? fb0Var2.e : 0;
        fb0 fb0Var3 = this.valueProviders;
        HashMap hashMap = new HashMap(i4 + (fb0Var3 != null ? fb0Var3.e : 0));
        fb0 fb0Var4 = this.restored;
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (fb0Var4 != null) {
            Object[] objArr = fb0Var4.b;
            Object[] objArr2 = fb0Var4.c;
            long[] jArr3 = fb0Var4.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                fb0Var = this.valueProviders;
                if (fb0Var != null) {
                    Object[] objArr3 = fb0Var.b;
                    Object[] objArr4 = fb0Var.c;
                    long[] jArr4 = fb0Var.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object invoke = ((iy) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!canBeSaved(invoke)) {
                                                    throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(invoke).toString());
                                                }
                                                hashMap.put(str, y80.a(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((iy) list.get(i3)).invoke();
                                                if (invoke2 != null && !canBeSaved(invoke2)) {
                                                    throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(invoke2).toString());
                                                }
                                                arrayList.add(invoke2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        fb0Var = this.valueProviders;
        if (fb0Var != null) {
        }
        return hashMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String str, final iy iyVar) {
        boolean fastIsBlank;
        fastIsBlank = SaveableStateRegistryKt.fastIsBlank(str);
        if (fastIsBlank) {
            o.m("Registered key is empty or blank");
            return null;
        }
        final fb0 fb0Var = this.valueProviders;
        if (fb0Var == null) {
            long[] jArr = ql0.a;
            fb0Var = new fb0();
            this.valueProviders = fb0Var;
        }
        Object d = fb0Var.d(str);
        if (d == null) {
            d = new ArrayList();
            fb0Var.l(str, d);
        }
        ((List) d).add(iyVar);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                List list = (List) fb0.this.j(str);
                if (list != null) {
                    list.remove(iyVar);
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                fb0.this.l(str, list);
            }
        };
    }
}
