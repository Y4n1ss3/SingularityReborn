package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$8 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ny $content;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ MutableTransitionState<Boolean> $visibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$8(MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, ny nyVar, int i, int i2) {
        super(2);
        this.$visibleState = mutableTransitionState;
        this.$modifier = modifier;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$label = str;
        this.$content = nyVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedVisibilityKt.AnimatedVisibility(this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
