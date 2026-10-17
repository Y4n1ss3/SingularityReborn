package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class de extends k {
    public final Thread g;
    public final du h;

    public de(kn knVar, Thread thread, du duVar) {
        super(knVar, true);
        this.g = thread;
        this.h = duVar;
    }

    @Override // defpackage.i20
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.g;
        if (q10.b(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
