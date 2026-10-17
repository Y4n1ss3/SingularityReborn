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
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$3 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ny $content;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<T> $transition;
    final /* synthetic */ ky $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$3(Transition<T> transition, ky kyVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, ny nyVar, int i) {
        super(2);
        this.$transition = transition;
        this.$visible = kyVar;
        this.$modifier = modifier;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$content = nyVar;
        this.$$changed = i;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedVisibilityKt.AnimatedVisibilityImpl(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
