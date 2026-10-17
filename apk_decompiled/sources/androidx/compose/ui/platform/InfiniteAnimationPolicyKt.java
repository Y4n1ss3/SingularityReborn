package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import defpackage.hm;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object withInfiniteAnimationFrameNanos(ky kyVar, hm hmVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) hmVar.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(kyVar, hmVar) : infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(kyVar, null), hmVar);
    }
}
