package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i, my myVar) {
        int i2 = 0;
        while (i != 0) {
            int lowestOneBit = Integer.lowestOneBit(i);
            myVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= lowestOneBit;
        }
    }
}
