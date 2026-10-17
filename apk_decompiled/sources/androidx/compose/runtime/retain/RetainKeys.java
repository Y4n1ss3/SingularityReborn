package androidx.compose.runtime.retain;

import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RetainKeys {
    private final Object[] keys;
    private final long positionalKey;
    private final int typeHash;

    public RetainKeys(Object[] objArr, long j, int i) {
        this.keys = objArr;
        this.positionalKey = j;
        this.typeHash = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RetainKeys)) {
            return false;
        }
        RetainKeys retainKeys = (RetainKeys) obj;
        return retainKeys.positionalKey == this.positionalKey && retainKeys.typeHash == this.typeHash && Arrays.equals(retainKeys.keys, this.keys);
    }

    public final long getPositionalKey() {
        return this.positionalKey;
    }

    public final int getTypeHash() {
        return this.typeHash;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        int hashCode = objArr != null ? Arrays.hashCode(objArr) : 0;
        return Integer.hashCode(this.typeHash) + ((Long.hashCode(this.positionalKey) + (hashCode * 31)) * 31);
    }
}
