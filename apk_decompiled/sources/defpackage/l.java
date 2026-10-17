package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class l implements in {
    private final jn key;

    public l(jn jnVar) {
        jnVar.getClass();
        this.key = jnVar;
    }

    @Override // defpackage.kn
    public <R> R fold(R r, my myVar) {
        return (R) y80.q(this, r, myVar);
    }

    @Override // defpackage.kn
    public <E extends in> E get(jn jnVar) {
        return (E) y80.s(this, jnVar);
    }

    @Override // defpackage.in
    public jn getKey() {
        return this.key;
    }

    @Override // defpackage.kn
    public kn minusKey(jn jnVar) {
        return y80.F(this, jnVar);
    }

    @Override // defpackage.kn
    public kn plus(kn knVar) {
        return y80.I(this, knVar);
    }
}
