package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class jw0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Transition e;

    public /* synthetic */ jw0(Transition transition, int i) {
        this.d = i;
        this.e = transition;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult rememberTransition$lambda$2$0;
        DisposableEffectResult updateTransition$lambda$1$0;
        int i = this.d;
        Transition transition = this.e;
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (i) {
            case 0:
                rememberTransition$lambda$2$0 = TransitionKt.rememberTransition$lambda$2$0(transition, disposableEffectScope);
                return rememberTransition$lambda$2$0;
            default:
                updateTransition$lambda$1$0 = TransitionKt.updateTransition$lambda$1$0(transition, disposableEffectScope);
                return updateTransition$lambda$1$0;
        }
    }
}
