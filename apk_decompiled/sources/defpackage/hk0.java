package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hk0 implements hm, wn {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(hk0.class, Object.class, "result");
    public final hm d;
    private volatile Object result;

    public hk0(hm hmVar) {
        vn vnVar = vn.d;
        this.d = hmVar;
        this.result = vnVar;
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
        return this.d.getContext();
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        while (true) {
            Object obj2 = this.result;
            vn vnVar = vn.e;
            if (obj2 == vnVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, vnVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != vnVar) {
                        break;
                    }
                }
                return;
            }
            vn vnVar2 = vn.d;
            if (obj2 != vnVar2) {
                o.f("Already resumed");
                return;
            }
            vn vnVar3 = vn.f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vnVar2, vnVar3)) {
                if (atomicReferenceFieldUpdater.get(this) != vnVar2) {
                    break;
                }
            }
            this.d.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}
