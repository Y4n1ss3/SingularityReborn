package androidx.compose.animation;

import defpackage.f30;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1$3$1 extends f30 implements ky {
    final /* synthetic */ S $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$3$1(S s) {
        super(1);
        this.$stateForContent = s;
    }

    @Override // defpackage.ky
    public final Boolean invoke(S s) {
        return Boolean.valueOf(q10.b(s, this.$stateForContent));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AnimatedContentKt$AnimatedContent$6$1$3$1) obj);
    }
}
