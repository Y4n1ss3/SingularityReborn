package androidx.compose.material3.internal;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 implements ny {
    final /* synthetic */ FiniteAnimationSpec<Float> $labelTransitionSpec;

    public TextFieldImplKt$TextFieldTransitionScope$labelProgress$1(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.$labelTransitionSpec = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer, int i) {
        composer.startReplaceGroup(-709912974);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-709912974, i, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:390)");
        }
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.$labelTransitionSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<InputPhase>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
