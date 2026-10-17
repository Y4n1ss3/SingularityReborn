package androidx.compose.foundation.text.input.internal;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.rr0;
import defpackage.tj;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.z10;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CursorAnimationState$snapToVisibleAndAnimate$2 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CursorAnimationState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ z10 $oldJob;
        int label;
        final /* synthetic */ CursorAnimationState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z10 z10Var, CursorAnimationState cursorAnimationState, hm hmVar) {
            super(2, hmVar);
            this.$oldJob = z10Var;
            this.this$0 = cursorAnimationState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$oldJob, this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
        
            if (defpackage.y80.p(500, r10) == r9) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0042, code lost:
        
            if (defpackage.cq.d(r11, r10) == r9) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:9:0x006f). Please report as a decompilation issue!!! */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            vn vnVar = vn.d;
            try {
                if (i == 0) {
                    p10.Q(obj);
                    z10 z10Var = this.$oldJob;
                    if (z10Var != null) {
                        this.label = 1;
                    }
                } else if (i == 1) {
                    p10.Q(obj);
                } else {
                    if (i == 2) {
                        p10.Q(obj);
                        throw new tj();
                    }
                    if (i == 3) {
                        p10.Q(obj);
                        this.this$0.setCursorAlpha(0.0f);
                        this.label = 4;
                    } else {
                        if (i != 4) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        this.this$0.setCursorAlpha(1.0f);
                        this.label = 3;
                        if (y80.p(500L, this) == vnVar) {
                            return vnVar;
                        }
                        this.this$0.setCursorAlpha(0.0f);
                        this.label = 4;
                    }
                }
                this.this$0.setCursorAlpha(1.0f);
                if (!this.this$0.getAnimate()) {
                    this.label = 2;
                    y80.b(this);
                    return vnVar;
                }
                this.label = 3;
                if (y80.p(500L, this) == vnVar) {
                }
                this.this$0.setCursorAlpha(0.0f);
                this.label = 4;
            } catch (Throwable th) {
                this.this$0.setCursorAlpha(0.0f);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, hm hmVar) {
        super(2, hmVar);
        this.this$0 = cursorAnimationState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, hmVar);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        boolean z;
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        atomicReference = this.this$0.animationJob;
        z10 z10Var = (z10) atomicReference.getAndSet(null);
        atomicReference2 = this.this$0.animationJob;
        rr0 t = p01.t(unVar, null, null, new AnonymousClass1(z10Var, this.this$0, null), 3);
        while (true) {
            if (atomicReference2.compareAndSet(null, t)) {
                z = true;
                break;
            }
            if (atomicReference2.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
