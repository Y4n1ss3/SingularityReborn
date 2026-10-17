package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.spatial.RectListKt;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {RectListKt.BitOffsetForFocusable, 63}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2 extends us0 implements my {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ my $session;
    final /* synthetic */ ky $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(ky kyVar, AtomicReference<SessionMutex.Session<T>> atomicReference, my myVar, hm hmVar) {
        super(2, hmVar);
        this.$sessionInitializer = kyVar;
        this.$arg0 = atomicReference;
        this.$session = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, hmVar);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8 == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        if (defpackage.cq.d(r8, r7) == r4) goto L23;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionMutex.Session session;
        ?? r0 = this.label;
        vn vnVar = vn.d;
        try {
            if (r0 == 0) {
                p10.Q(obj);
                un unVar = (un) this.L$0;
                SessionMutex.Session session2 = new SessionMutex.Session(cq.s(unVar.getCoroutineContext()), this.$sessionInitializer.invoke(unVar));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session2);
                session = session2;
                if (session3 != null) {
                    z10 job = session3.getJob();
                    session = session2;
                    if (job != null) {
                        this.L$0 = session2;
                        this.label = 1;
                        session = session2;
                    }
                }
            } else {
                if (r0 != 1) {
                    if (r0 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SessionMutex.Session session4 = (SessionMutex.Session) this.L$0;
                    p10.Q(obj);
                    r0 = session4;
                    Object obj2 = r0;
                    AtomicReference atomicReference = this.$arg0;
                    while (!atomicReference.compareAndSet(obj2, null) && atomicReference.get() == obj2) {
                    }
                    return obj;
                }
                SessionMutex.Session session5 = (SessionMutex.Session) this.L$0;
                p10.Q(obj);
                session = session5;
            }
            my myVar = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = myVar.invoke(value, this);
            r0 = session;
        } catch (Throwable th) {
            AtomicReference atomicReference2 = this.$arg0;
            while (!atomicReference2.compareAndSet(r0, null) && atomicReference2.get() == r0) {
            }
            throw th;
        }
    }
}
