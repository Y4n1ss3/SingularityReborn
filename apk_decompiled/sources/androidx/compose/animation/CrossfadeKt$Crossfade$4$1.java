package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import defpackage.f30;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$4$1 extends f30 implements ky {
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    @Override // defpackage.ky
    public final Boolean invoke(T t) {
        return Boolean.valueOf(!q10.b(t, this.$this_Crossfade.getTargetState()));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CrossfadeKt$Crossfade$4$1) obj);
    }
}
