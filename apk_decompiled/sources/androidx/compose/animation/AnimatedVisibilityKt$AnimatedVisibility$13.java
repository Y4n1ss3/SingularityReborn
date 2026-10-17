package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$13 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ny $content;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<T> $this_AnimatedVisibility;
    final /* synthetic */ ky $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$13(Transition<T> transition, ky kyVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, ny nyVar, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = transition;
        this.$visible = kyVar;
        this.$modifier = modifier;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$content = nyVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
