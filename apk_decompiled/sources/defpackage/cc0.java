package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class cc0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ FloatProducer e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ cc0(FloatProducer floatProducer, float f, boolean z, int i) {
        this.d = i;
        this.e = floatProducer;
        this.f = f;
        this.g = z;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 horizontalScaleUp$lambda$54;
        w01 horizontalScaleDown$lambda$55;
        switch (this.d) {
            case 0:
                horizontalScaleUp$lambda$54 = NavigationDrawerKt.horizontalScaleUp$lambda$54(this.e, this.f, this.g, (GraphicsLayerScope) obj);
                return horizontalScaleUp$lambda$54;
            default:
                horizontalScaleDown$lambda$55 = NavigationDrawerKt.horizontalScaleDown$lambda$55(this.e, this.f, this.g, (GraphicsLayerScope) obj);
                return horizontalScaleDown$lambda$55;
        }
    }
}
