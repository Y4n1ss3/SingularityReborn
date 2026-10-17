package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class im extends mc {
    private final kn _context;
    private transient hm intercepted;

    public im(hm hmVar) {
        this(hmVar, hmVar != null ? hmVar.getContext() : null);
    }

    @Override // defpackage.hm
    public kn getContext() {
        kn knVar = this._context;
        knVar.getClass();
        return knVar;
    }

    public final hm intercepted() {
        hm hmVar = this.intercepted;
        if (hmVar == null) {
            mn mnVar = (mn) getContext().get(ts.i);
            if (mnVar == null || (hmVar = mnVar.interceptContinuation(this)) == null) {
                hmVar = this;
            }
            this.intercepted = hmVar;
        }
        return hmVar;
    }

    @Override // defpackage.mc
    public void releaseIntercepted() {
        hm hmVar = this.intercepted;
        if (hmVar != null && hmVar != this) {
            in inVar = getContext().get(ts.i);
            inVar.getClass();
            ((mn) inVar).releaseInterceptedContinuation(hmVar);
        }
        this.intercepted = rj.e;
    }

    public im(hm hmVar, kn knVar) {
        super(hmVar);
        this._context = knVar;
    }
}
