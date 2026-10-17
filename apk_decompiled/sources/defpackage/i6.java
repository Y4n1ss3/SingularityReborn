package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.RailPredictiveBackState;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i6 implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i6(iy iyVar, boolean z, ImageBitmap imageBitmap, ColorFilter colorFilter) {
        this.f = iyVar;
        this.e = z;
        this.g = imageBitmap;
        this.h = colorFilter;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 drawSelectionHandle$lambda$0$0$0$0;
        w01 ModalWideNavigationRailContent_pU6N4AM$lambda$20$lambda$19;
        switch (this.d) {
            case 0:
                drawSelectionHandle$lambda$0$0$0$0 = AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0$0$0$0((iy) this.f, this.e, (ImageBitmap) this.g, (ColorFilter) this.h, (ContentDrawScope) obj);
                return drawSelectionHandle$lambda$0$0$0$0;
            default:
                ModalWideNavigationRailContent_pU6N4AM$lambda$20$lambda$19 = WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$20$lambda$19((Animatable) this.f, (ModalWideNavigationRailState) this.g, (RailPredictiveBackState) this.h, this.e, (GraphicsLayerScope) obj);
                return ModalWideNavigationRailContent_pU6N4AM$lambda$20$lambda$19;
        }
    }

    public /* synthetic */ i6(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z) {
        this.f = animatable;
        this.g = modalWideNavigationRailState;
        this.h = railPredictiveBackState;
        this.e = z;
    }
}
