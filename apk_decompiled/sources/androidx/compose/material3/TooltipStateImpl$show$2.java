package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TooltipStateImpl$show$2 extends us0 implements ky {
    final /* synthetic */ ky $cancellableShow;
    final /* synthetic */ MutatePriority $mutatePriority;
    int label;
    final /* synthetic */ TooltipStateImpl this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
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
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$2(TooltipStateImpl tooltipStateImpl, ky kyVar, MutatePriority mutatePriority, hm hmVar) {
        super(1, hmVar);
        this.this$0 = tooltipStateImpl;
        this.$cancellableShow = kyVar;
        this.$mutatePriority = mutatePriority;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TooltipStateImpl$show$2(this.this$0, this.$cancellableShow, this.$mutatePriority, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TooltipStateImpl$show$2) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (defpackage.d41.Q(1500, r5, r4) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
        } finally {
            if (this.$mutatePriority != MutatePriority.PreventUserInput) {
            }
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
            if (this.$mutatePriority != MutatePriority.PreventUserInput) {
                this.this$0.dismiss();
            }
        }
        if (i != 1 && i != 2) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        if (this.$mutatePriority != MutatePriority.PreventUserInput) {
            this.this$0.dismiss();
        }
        return w01.a;
    }
}
