package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d1(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z) {
        this.f = animatable;
        this.g = railPredictiveBackState;
        this.e = z;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$5$lambda$4;
        w01 invoke$lambda$1$lambda$0;
        switch (this.d) {
            case 0:
                invoke$lambda$5$lambda$4 = SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke$lambda$5$lambda$4(this.e, (String) this.f, (SnackbarData) this.g, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$5$lambda$4;
            default:
                invoke$lambda$1$lambda$0 = WideNavigationRailKt$ModalWideNavigationRailContent$5.invoke$lambda$1$lambda$0((Animatable) this.f, (RailPredictiveBackState) this.g, this.e, (GraphicsLayerScope) obj);
                return invoke$lambda$1$lambda$0;
        }
    }

    public /* synthetic */ d1(boolean z, String str, SnackbarData snackbarData) {
        this.e = z;
        this.f = str;
        this.g = snackbarData;
    }
}
