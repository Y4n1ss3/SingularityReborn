package androidx.compose.ui;

import defpackage.ky;
import defpackage.ny;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class KeyedComposedModifier2 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;

    public KeyedComposedModifier2(String str, Object obj, Object obj2, ky kyVar, ny nyVar) {
        super(kyVar, nyVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier2)) {
            return false;
        }
        KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
        return q10.b(this.fqName, keyedComposedModifier2.fqName) && q10.b(this.key1, keyedComposedModifier2.key1) && q10.b(this.key2, keyedComposedModifier2.key2);
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
