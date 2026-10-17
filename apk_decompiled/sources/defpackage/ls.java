package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ls implements kn {
    public final /* synthetic */ kn d;
    public final Throwable e;

    public ls(kn knVar, Throwable th) {
        this.d = knVar;
        this.e = th;
    }

    @Override // defpackage.kn
    public final Object fold(Object obj, my myVar) {
        return this.d.fold(obj, myVar);
    }

    @Override // defpackage.kn
    public final in get(jn jnVar) {
        return this.d.get(jnVar);
    }

    @Override // defpackage.kn
    public final kn minusKey(jn jnVar) {
        return this.d.minusKey(jnVar);
    }

    @Override // defpackage.kn
    public final kn plus(kn knVar) {
        return this.d.plus(knVar);
    }
}
