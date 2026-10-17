package androidx.compose.ui;

import defpackage.ky;
import defpackage.ny;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class KeyedComposedModifier3 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;
    private final Object key3;

    public KeyedComposedModifier3(String str, Object obj, Object obj2, Object obj3, ky kyVar, ny nyVar) {
        super(kyVar, nyVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier3)) {
            return false;
        }
        KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
        return q10.b(this.fqName, keyedComposedModifier3.fqName) && q10.b(this.key1, keyedComposedModifier3.key1) && q10.b(this.key2, keyedComposedModifier3.key2) && q10.b(this.key3, keyedComposedModifier3.key3);
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

    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.key3;
        return hashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
