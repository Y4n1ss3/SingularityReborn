package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1$5$1$1 extends f30 implements ky {
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
    final /* synthetic */ S $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$5$1$1(SnapshotStateList<S> snapshotStateList, S s, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = s;
        this.$rootScope = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.ky
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
        final S s = this.$stateForContent;
        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.$rootScope;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SnapshotStateList.this.remove(s);
                animatedContentTransitionScopeImpl.getTargetSizeMap$animation().j(s);
            }
        };
    }
}
