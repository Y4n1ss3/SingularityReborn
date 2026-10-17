package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pr0 implements hm, wn {
    public final hm d;
    public final kn e;

    public pr0(hm hmVar, kn knVar) {
        this.d = hmVar;
        this.e = knVar;
    }

    @Override // defpackage.wn
    public final wn getCallerFrame() {
        hm hmVar = this.d;
        if (hmVar instanceof wn) {
            return (wn) hmVar;
        }
        return null;
    }

    @Override // defpackage.hm
    public final kn getContext() {
        return this.e;
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }
}
