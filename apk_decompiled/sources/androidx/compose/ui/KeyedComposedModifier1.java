package androidx.compose.ui;

import defpackage.ky;
import defpackage.ny;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class KeyedComposedModifier1 extends ComposedModifier {
    private final String fqName;
    private final Object key1;

    public KeyedComposedModifier1(String str, Object obj, ky kyVar, ny nyVar) {
        super(kyVar, nyVar);
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifier1)) {
            return false;
        }
        KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
        return q10.b(this.fqName, keyedComposedModifier1.fqName) && q10.b(this.key1, keyedComposedModifier1.key1);
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public int hashCode() {
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
