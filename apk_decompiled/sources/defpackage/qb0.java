package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qb0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qb0(int i, boolean z, Object obj) {
        this.d = i;
        this.e = z;
        this.f = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 NavigationBarItemLayout$lambda$22$lambda$20$lambda$19;
        w01 NavigationRailItemLayout$lambda$17$lambda$15$lambda$14;
        w01 sliderSemantics$lambda$52;
        switch (this.d) {
            case 0:
                NavigationBarItemLayout$lambda$22$lambda$20$lambda$19 = NavigationBarKt.NavigationBarItemLayout$lambda$22$lambda$20$lambda$19(this.e, (iy) this.f, (GraphicsLayerScope) obj);
                return NavigationBarItemLayout$lambda$22$lambda$20$lambda$19;
            case 1:
                NavigationRailItemLayout$lambda$17$lambda$15$lambda$14 = NavigationRailKt.NavigationRailItemLayout$lambda$17$lambda$15$lambda$14(this.e, (iy) this.f, (GraphicsLayerScope) obj);
                return NavigationRailItemLayout$lambda$17$lambda$15$lambda$14;
            default:
                sliderSemantics$lambda$52 = SliderKt.sliderSemantics$lambda$52(this.e, (SliderState) this.f, (SemanticsPropertyReceiver) obj);
                return sliderSemantics$lambda$52;
        }
    }
}
