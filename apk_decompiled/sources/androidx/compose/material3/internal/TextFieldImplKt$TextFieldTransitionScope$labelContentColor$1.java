package androidx.compose.material3.internal;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 implements ny {
    final /* synthetic */ FiniteAnimationSpec<Color> $colorTransitionSpec;

    public TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1(FiniteAnimationSpec<Color> finiteAnimationSpec) {
        this.$colorTransitionSpec = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer, int i) {
        composer.startReplaceGroup(1190923886);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1190923886, i, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
        }
        FiniteAnimationSpec<Color> finiteAnimationSpec = this.$colorTransitionSpec;
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
