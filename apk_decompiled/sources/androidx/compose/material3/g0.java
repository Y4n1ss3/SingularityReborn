package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ State e;

    public /* synthetic */ g0(State state, int i) {
        this.d = i;
        this.e = state;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$12$lambda$10$lambda$9;
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        IntOffset invoke$lambda$3$lambda$2;
        int i = this.d;
        State state = this.e;
        switch (i) {
            case 0:
                invoke$lambda$12$lambda$10$lambda$9 = FloatingActionButtonKt$ExtendedFloatingActionButton$5.invoke$lambda$12$lambda$10$lambda$9(state, (GraphicsLayerScope) obj);
                return invoke$lambda$12$lambda$10$lambda$9;
            case 1:
                invoke$lambda$1$lambda$0 = NavigationBarKt$NavigationBarItem$2$indicator$1.invoke$lambda$1$lambda$0(state, (GraphicsLayerScope) obj);
                return invoke$lambda$1$lambda$0;
            case 2:
                invoke$lambda$1$lambda$02 = NavigationRailKt$NavigationRailItem$1$indicator$1.invoke$lambda$1$lambda$0(state, (GraphicsLayerScope) obj);
                return invoke$lambda$1$lambda$02;
            default:
                invoke$lambda$3$lambda$2 = TabRowDefaults$tabIndicatorOffset$2.invoke$lambda$3$lambda$2(state, (Density) obj);
                return invoke$lambda$3$lambda$2;
        }
    }
}
