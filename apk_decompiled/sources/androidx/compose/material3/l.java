package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(float f, int i, Object obj) {
        this.d = i;
        this.e = f;
        this.f = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 measure_3p2s80s$lambda$5$lambda$3;
        switch (this.d) {
            case 0:
                invoke$lambda$1$lambda$0 = ChipKt$InputChip$1.invoke$lambda$1$lambda$0(this.e, (Shape) this.f, (GraphicsLayerScope) obj);
                return invoke$lambda$1$lambda$0;
            default:
                measure_3p2s80s$lambda$5$lambda$3 = NavigationDrawerKt$ModalNavigationDrawer$2$6$1.measure_3p2s80s$lambda$5$lambda$3(this.e, (MutableFloatState) this.f, (DraggableAnchorsConfig) obj);
                return measure_3p2s80s$lambda$5$lambda$3;
        }
    }
}
