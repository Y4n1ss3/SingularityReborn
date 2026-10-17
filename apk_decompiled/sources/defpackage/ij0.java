package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ij0 extends hj0 implements vy {
    private final int arity;

    public ij0(hm hmVar) {
        super(hmVar);
        this.arity = 2;
    }

    @Override // defpackage.vy
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.mc
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        ki0.a.getClass();
        return li0.a(this);
    }
}
