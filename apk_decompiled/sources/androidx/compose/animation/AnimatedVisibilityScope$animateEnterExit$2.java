package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityScope$animateEnterExit$2 extends f30 implements ny {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ AnimatedVisibilityScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$2(AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        super(3);
        this.this$0 = animatedVisibilityScope;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$label = str;
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(1840112047);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1840112047, i, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:654)");
        }
        Modifier then = modifier.then(EnterExitTransitionKt.createModifier(this.this$0.getTransition(), this.$enter, this.$exit, null, this.$label, composer, 0, 4));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return then;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
