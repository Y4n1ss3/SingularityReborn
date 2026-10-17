package androidx.compose.runtime;

import androidx.compose.animation.core.AnimationKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 implements ky {
    final /* synthetic */ ky $onFrame;

    public MonotonicFrameClockKt$withFrameMillis$2(ky kyVar) {
        this.$onFrame = kyVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R, java.lang.Object] */
    public final R invoke(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / AnimationKt.MillisToNanos));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
