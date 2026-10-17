package defpackage;

import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bc0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ DrawerPredictiveBackState e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ bc0(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, int i) {
        this.d = i;
        this.e = drawerPredictiveBackState;
        this.f = z;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 predictiveBackDrawerChild$lambda$57;
        w01 predictiveBackDrawerContainer$lambda$56;
        switch (this.d) {
            case 0:
                predictiveBackDrawerChild$lambda$57 = NavigationDrawerKt.predictiveBackDrawerChild$lambda$57(this.e, this.f, (GraphicsLayerScope) obj);
                return predictiveBackDrawerChild$lambda$57;
            default:
                predictiveBackDrawerContainer$lambda$56 = NavigationDrawerKt.predictiveBackDrawerContainer$lambda$56(this.e, this.f, (GraphicsLayerScope) obj);
                return predictiveBackDrawerContainer$lambda$56;
        }
    }
}
