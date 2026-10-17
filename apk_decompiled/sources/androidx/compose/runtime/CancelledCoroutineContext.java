package androidx.compose.runtime;

import defpackage.dq;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CancelledCoroutineContext implements in {
    public static final Key Key = new Key(null);

    @Override // defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) y80.q(this, r, myVar);
    }

    @Override // defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) y80.s(this, jnVar);
    }

    @Override // defpackage.in
    public jn getKey() {
        return Key;
    }

    @Override // defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return y80.F(this, jnVar);
    }

    @Override // defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return y80.I(this, knVar);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Key implements jn {
        public /* synthetic */ Key(dq dqVar) {
            this();
        }

        private Key() {
        }
    }
}
