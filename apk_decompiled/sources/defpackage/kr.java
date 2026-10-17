package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kr extends mr implements wn, hm {
    public static final /* synthetic */ long k = dc.a.objectFieldOffset(kr.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final mn g;
    public final hm h;
    public Object i;
    public final Object j;

    public kr(mn mnVar, hm hmVar) {
        super(-1);
        this.g = mnVar;
        this.h = hmVar;
        this.i = q10.e;
        this.j = y80.U(hmVar.getContext());
    }

    @Override // defpackage.wn
    public final wn getCallerFrame() {
        hm hmVar = this.h;
        if (hmVar instanceof wn) {
            return (wn) hmVar;
        }
        return null;
    }

    @Override // defpackage.hm
    public final kn getContext() {
        return this.h.getContext();
    }

    @Override // defpackage.mr
    public final Object i() {
        Object obj = this.i;
        this.i = q10.e;
        return obj;
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        Throwable a = kj0.a(obj);
        Object sjVar = a == null ? obj : new sj(a, false);
        hm hmVar = this.h;
        kn context = hmVar.getContext();
        mn mnVar = this.g;
        if (mnVar.isDispatchNeeded(context)) {
            this.i = sjVar;
            this.f = 0;
            mnVar.dispatch(hmVar.getContext(), this);
            return;
        }
        du a2 = xu0.a();
        if (a2.d >= 4294967296L) {
            this.i = sjVar;
            this.f = 0;
            a2.i(this);
            return;
        }
        a2.j(true);
        try {
            kn context2 = hmVar.getContext();
            Object X = y80.X(context2, this.j);
            try {
                hmVar.resumeWith(obj);
                while (a2.l()) {
                }
            } finally {
                y80.N(context2, X);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.g + ", " + cq.H(this.h) + ']';
    }

    @Override // defpackage.mr
    public final hm e() {
        return this;
    }
}
