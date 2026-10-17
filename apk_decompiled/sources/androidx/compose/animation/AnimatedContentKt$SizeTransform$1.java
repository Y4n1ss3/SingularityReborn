package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$SizeTransform$1 extends f30 implements my {
    public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1();

    public AnimatedContentKt$SizeTransform$1() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4invokeTemP2vQ(((IntSize) obj).m7786unboximpl(), ((IntSize) obj2).m7786unboximpl());
    }

    /* renamed from: invoke-TemP2vQ, reason: not valid java name */
    public final SpringSpec<IntSize> m4invokeTemP2vQ(long j, long j2) {
        return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    }
}
