package androidx.compose.ui.adaptive;

import android.content.Context;
import defpackage.bq;
import defpackage.f80;
import defpackage.hm;
import defpackage.j11;
import defpackage.m21;
import defpackage.mf;
import defpackage.my;
import defpackage.n21;
import defpackage.nq;
import defpackage.nr;
import defpackage.o;
import defpackage.o21;
import defpackage.o3;
import defpackage.p10;
import defpackage.p7;
import defpackage.rz;
import defpackage.sp0;
import defpackage.st;
import defpackage.t31;
import defpackage.ts;
import defpackage.un;
import defpackage.up0;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.wp0;
import defpackage.x31;
import defpackage.y80;
import defpackage.yf;
import defpackage.zk0;
import defpackage.zu;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1", f = "MediaQuery.android.kt", l = {132}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends us0 implements my {
    final /* synthetic */ Context $context;
    final /* synthetic */ UiMediaScopeImpl $scope;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1", f = "MediaQuery.android.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ UiMediaScopeImpl $scope;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UiMediaScopeImpl uiMediaScopeImpl, hm hmVar) {
            super(2, hmVar);
            this.$scope = uiMediaScopeImpl;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(t31 t31Var, hm hmVar) {
            return ((AnonymousClass1) create(t31Var, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            String resolvePosture;
            if (this.label != 0) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            t31 t31Var = (t31) this.L$0;
            UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
            resolvePosture = MediaQuery_androidKt.resolvePosture(t31Var);
            uiMediaScopeImpl.m4251set_windowPostureInyEWag(resolvePosture);
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, UiMediaScopeImpl uiMediaScopeImpl, hm hmVar) {
        super(2, hmVar);
        this.$context = context;
        this.$scope = uiMediaScopeImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MediaQuery_androidKt$obtainUiMediaScope$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r4.e() == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [iw] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        up0 up0Var;
        vn vnVar = vn.d;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            n21 n21Var = o21.c;
            Context context = this.$context;
            n21Var.getClass();
            context.getClass();
            Object obj2 = (m21) n21.b.getValue();
            if (obj2 == null) {
                wp0 wp0Var = wp0.c;
                if (wp0.c == null) {
                    ReentrantLock reentrantLock = wp0.d;
                    reentrantLock.lock();
                    try {
                        if (wp0.c == null) {
                            try {
                                j11 b = sp0.b();
                                if (b != null) {
                                    j11 j11Var = j11.i;
                                    j11Var.getClass();
                                    Object value = b.h.getValue();
                                    value.getClass();
                                    Object value2 = j11Var.h.getValue();
                                    value2.getClass();
                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                        up0Var = new up0(context);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            up0Var = null;
                            wp0.c = new wp0(up0Var);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                obj2 = wp0.c;
                obj2.getClass();
            }
            new x31();
            new zk0(13);
            zu.a();
            p7 p7Var = new p7();
            p7Var.d = obj2;
            n21.c.getClass();
            Context context2 = this.$context;
            context2.getClass();
            o3 o3Var = new o3(p7Var, context2, (hm) null);
            st stVar = st.d;
            yf yfVar = new yf(o3Var, stVar, -2, mf.d);
            nq nqVar = nr.a;
            rz rzVar = f80.a;
            if (rzVar.get(ts.l) != null) {
                o.t(rzVar, "Flow context cannot contain job in it. Had ");
                return null;
            }
            yf yfVar2 = yfVar;
            if (!rzVar.equals(stVar)) {
                yfVar2 = y80.r(yfVar, rzVar, 0, null, 6);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, null);
            this.label = 1;
            if (y80.k(yfVar2, anonymousClass1, this) == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
