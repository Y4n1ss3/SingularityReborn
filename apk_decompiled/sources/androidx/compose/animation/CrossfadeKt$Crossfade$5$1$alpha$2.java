package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.f30;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1$alpha$2 extends f30 implements ny {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$alpha$2(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        super(3);
        this.$animationSpec = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> segment, Composer composer, int i) {
        composer.startReplaceGroup(955869654);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(955869654, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
        }
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
