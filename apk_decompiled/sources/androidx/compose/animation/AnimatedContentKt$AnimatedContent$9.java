package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.oy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$9 extends f30 implements my {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ oy $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ ky $contentKey;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ ky $transitionSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$9(Transition<S> transition, Modifier modifier, ky kyVar, Alignment alignment, ky kyVar2, oy oyVar, int i, int i2) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$modifier = modifier;
        this.$transitionSpec = kyVar;
        this.$contentAlignment = alignment;
        this.$contentKey = kyVar2;
        this.$content = oyVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedContentKt.AnimatedContent(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
