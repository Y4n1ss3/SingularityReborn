package androidx.compose.ui;

import defpackage.ky;
import defpackage.ny;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public KeyedComposedModifierN(String str, Object[] objArr, ky kyVar, ny nyVar) {
        super(kyVar, nyVar);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifierN)) {
            return false;
        }
        KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
        return q10.b(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys);
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return Arrays.hashCode(this.keys) + (this.fqName.hashCode() * 31);
    }
}
