package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends us0 implements ky {
    final /* synthetic */ ky $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(ky kyVar, hm hmVar) {
        super(1, hmVar);
        this.$onFrame = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return obj;
            }
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        ky kyVar = this.$onFrame;
        this.label = 1;
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(kyVar, this);
        vn vnVar = vn.d;
        return withFrameNanos == vnVar ? vnVar : withFrameNanos;
    }
}
