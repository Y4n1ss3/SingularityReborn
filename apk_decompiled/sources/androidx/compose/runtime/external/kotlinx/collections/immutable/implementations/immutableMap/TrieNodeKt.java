package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.ac;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ac.U(objArr, objArr2, 0, i, 6);
        ac.Q(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeEntryAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ac.U(objArr, objArr2, 0, i, 6);
        ac.Q(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeNodeAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ac.U(objArr, objArr2, 0, i, 6);
        ac.Q(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode<?, ?> trieNode) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ac.U(objArr, objArr2, 0, i, 6);
        ac.Q(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = trieNode;
        ac.Q(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        ac.Q(copyOf, copyOf, i + 2, i + 1, objArr.length);
        ac.Q(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
