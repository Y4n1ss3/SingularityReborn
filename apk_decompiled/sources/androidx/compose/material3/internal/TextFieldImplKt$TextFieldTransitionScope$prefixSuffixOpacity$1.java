package androidx.compose.material3.internal;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 implements ny {
    final /* synthetic */ FiniteAnimationSpec<Float> $fastOpacityTransitionSpec;

    public TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.$fastOpacityTransitionSpec = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer, int i) {
        composer.startReplaceGroup(2126293195);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2126293195, i, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
        }
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.$fastOpacityTransitionSpec;
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
