package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ek0 extends im implements jw {
    public final jw d;
    public final kn e;
    public final int f;
    public kn g;
    public hm h;

    public ek0(jw jwVar, kn knVar) {
        super(rj.f, st.d);
        this.d = jwVar;
        this.e = knVar;
        this.f = ((Number) knVar.fold(0, new n30(10))).intValue();
    }

    public final Object e(hm hmVar, Object obj) {
        kn context = hmVar.getContext();
        cq.l(context);
        kn knVar = this.g;
        if (knVar != context) {
            if (knVar instanceof ls) {
                throw new IllegalStateException(es0.W("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ls) knVar).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new w5(this, 10))).intValue() != this.f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.g = context;
        }
        this.h = hmVar;
        ny nyVar = gk0.a;
        jw jwVar = this.d;
        jwVar.getClass();
        Object invoke = nyVar.invoke(jwVar, obj, this);
        if (!q10.b(invoke, vn.d)) {
            this.h = null;
        }
        return invoke;
    }

    @Override // defpackage.jw
    public final Object emit(Object obj, hm hmVar) {
        try {
            Object e = e(hmVar, obj);
            return e == vn.d ? e : w01.a;
        } catch (Throwable th) {
            this.g = new ls(hmVar.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.mc, defpackage.wn
    public final wn getCallerFrame() {
        hm hmVar = this.h;
        if (hmVar instanceof wn) {
            return (wn) hmVar;
        }
        return null;
    }

    @Override // defpackage.im, defpackage.hm
    public final kn getContext() {
        kn knVar = this.g;
        return knVar == null ? st.d : knVar;
    }

    @Override // defpackage.mc
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Throwable a = kj0.a(obj);
        if (a != null) {
            this.g = new ls(getContext(), a);
        }
        hm hmVar = this.h;
        if (hmVar != null) {
            hmVar.resumeWith(obj);
        }
        return vn.d;
    }
}
