package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class jc0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;

    public /* synthetic */ jc0(float f, int i) {
        this.d = i;
        this.e = f;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39;
        w01 padding_3ABfNKs$lambda$0;
        w01 ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21;
        int i = this.d;
        float f = this.e;
        switch (i) {
            case 0:
                placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39 = NavigationItemKt.placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39(f, (GraphicsLayerScope) obj);
                return placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39;
            case 1:
                padding_3ABfNKs$lambda$0 = PaddingKt.padding_3ABfNKs$lambda$0(f, (InspectorInfo) obj);
                return padding_3ABfNKs$lambda$0;
            default:
                ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21 = WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21(f, 0.0f, (DraggableAnchorsConfig) obj);
                return ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21;
        }
    }
}
