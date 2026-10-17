package androidx.compose.ui;

import defpackage.c21;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(ky kyVar) {
        return this.outer.all(kyVar) && this.inner.all(kyVar);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(ky kyVar) {
        return this.outer.any(kyVar) || this.inner.any(kyVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return q10.b(this.outer, combinedModifier.outer) && q10.b(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r, my myVar) {
        return (R) this.inner.foldIn(this.outer.foldIn(r, myVar), myVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r, my myVar) {
        return (R) this.outer.foldOut(this.inner.foldOut(r, myVar), myVar);
    }

    public final Modifier getInner$ui() {
        return this.inner;
    }

    public final Modifier getOuter$ui() {
        return this.outer;
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    public String toString() {
        return c21.a(new StringBuilder("["), (String) foldIn("", CombinedModifier$toString$1.INSTANCE), ']');
    }
}
