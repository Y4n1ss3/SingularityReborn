package androidx.compose.material3.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", l = {410, 412}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl$show$2 extends us0 implements ky {
    final /* synthetic */ ky $cancellableShow;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", l = {412}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ ky $cancellableShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ky kyVar, hm hmVar) {
            super(2, hmVar);
            this.$cancellableShow = kyVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$cancellableShow, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                ky kyVar = this.$cancellableShow;
                this.label = 1;
                Object invoke = kyVar.invoke(this);
                vn vnVar = vn.d;
                if (invoke == vnVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$2(BasicTooltipStateImpl basicTooltipStateImpl, ky kyVar, hm hmVar) {
        super(1, hmVar);
        this.this$0 = basicTooltipStateImpl;
        this.$cancellableShow = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new BasicTooltipStateImpl$show$2(this.this$0, this.$cancellableShow, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((BasicTooltipStateImpl$show$2) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (defpackage.d41.Q(1500, r6, r5) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, w01] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
        } catch (Throwable th) {
            this.this$0.setVisible(false);
            throw th;
        }
        if (i == 0) {
            p10.Q(obj);
            boolean isPersistent = this.this$0.isPersistent();
            vn vnVar = vn.d;
            if (isPersistent) {
                ky kyVar = this.$cancellableShow;
                this.label = 1;
                if (kyVar.invoke(this) == vnVar) {
                    return vnVar;
                }
            } else {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellableShow, null);
                this.label = 2;
            }
            this.this$0.setVisible(false);
            throw th;
        }
        if (i != 1 && i != 2) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.this$0.setVisible(false);
        this = w01.a;
        return this;
    }
}
