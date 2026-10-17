package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import defpackage.gi0;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ gi0 e;
    public final /* synthetic */ TransformScope f;

    public /* synthetic */ q(gi0 gi0Var, TransformScope transformScope, int i) {
        this.d = i;
        this.e = gi0Var;
        this.f = transformScope;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        switch (this.d) {
            case 0:
                invokeSuspend$lambda$0 = TransformableStateKt$animateRotateBy$2.invokeSuspend$lambda$0(this.e, this.f, (AnimationScope) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = TransformableStateKt$animateZoomBy$3.invokeSuspend$lambda$0(this.e, this.f, (AnimationScope) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
