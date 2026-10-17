package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import defpackage.ac;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i, E e) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ac.U(objArr, objArr2, 0, i, 6);
        ac.Q(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = e;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i, ky kyVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            CommonFunctionsKt.m4094assert(i3 <= i2);
            if (((Boolean) kyVar.invoke(objArr[i2])).booleanValue()) {
                objArr2[i + i3] = objArr[i2];
                i3++;
                CommonFunctionsKt.m4094assert(i + i3 <= objArr2.length);
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            kyVar = new ky() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1
                @Override // defpackage.ky
                public final Boolean invoke(Object obj2) {
                    return Boolean.valueOf(obj2 != TrieNode.Companion.getEMPTY$runtime());
                }
            };
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            CommonFunctionsKt.m4094assert(i4 <= i3);
            if (((Boolean) kyVar.invoke(objArr[i3])).booleanValue()) {
                objArr2[i + i4] = objArr[i3];
                i4++;
                CommonFunctionsKt.m4094assert(i + i4 <= objArr2.length);
            }
            i3++;
        }
        return i4;
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ac.U(objArr, objArr2, 0, i, 6);
        ac.Q(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
