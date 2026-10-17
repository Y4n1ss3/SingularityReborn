package androidx.compose.runtime;

import defpackage.d41;
import defpackage.gg;
import defpackage.hm;
import defpackage.o;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, hm hmVar) {
        Object obj2;
        Object obj3;
        gg ggVar;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return w01.a;
            }
            gg ggVar2 = new gg(1, d41.C(hmVar));
            ggVar2.u();
            synchronized (obj) {
                try {
                    Object obj7 = this.pendingFrameContinuation;
                    obj3 = RecomposerKt.ProduceAnotherFrame;
                    if (obj7 == obj3) {
                        obj4 = RecomposerKt.FramePending;
                        this.pendingFrameContinuation = obj4;
                        ggVar = ggVar2;
                    } else {
                        this.pendingFrameContinuation = ggVar2;
                        ggVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ggVar != null) {
                ggVar.resumeWith(w01.a);
            }
            Object s = ggVar2.s();
            return s == vn.d ? s : w01.a;
        }
    }

    public final hm requestFrameLocked() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof hm) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (hm) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (!q10.b(obj5, obj)) {
            obj2 = RecomposerKt.FramePending;
            if (!q10.b(obj5, obj2)) {
                if (obj5 == null) {
                    obj3 = RecomposerKt.ProduceAnotherFrame;
                    this.pendingFrameContinuation = obj3;
                    return null;
                }
                o.p(obj5, "invalid pendingFrameContinuation ");
            }
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        Object obj;
        Object obj2 = this.pendingFrameContinuation;
        obj = RecomposerKt.FramePending;
        if (!(obj2 == obj)) {
            PreconditionsKt.throwIllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}
