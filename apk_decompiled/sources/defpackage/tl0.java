package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class tl0 extends k implements wn {
    public final hm g;

    public tl0(hm hmVar, kn knVar) {
        super(knVar, true);
        this.g = hmVar;
    }

    @Override // defpackage.i20
    public final boolean J() {
        return true;
    }

    @Override // defpackage.wn
    public final wn getCallerFrame() {
        hm hmVar = this.g;
        if (hmVar instanceof wn) {
            return (wn) hmVar;
        }
        return null;
    }

    @Override // defpackage.i20
    public void p(Object obj) {
        q10.B(d41.C(this.g), d41.F(obj));
    }

    @Override // defpackage.i20
    public void q(Object obj) {
        this.g.resumeWith(d41.F(obj));
    }
}
