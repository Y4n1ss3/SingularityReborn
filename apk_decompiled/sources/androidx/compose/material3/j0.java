package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Animatable e;

    public /* synthetic */ j0(Animatable animatable, int i) {
        this.d = i;
        this.e = animatable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        int i = this.d;
        Animatable animatable = this.e;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = ModalBottomSheetKt$ModalBottomSheetContent$7.invoke$lambda$1$lambda$0(animatable, graphicsLayerScope);
                return invoke$lambda$1$lambda$0;
            default:
                invoke$lambda$1$lambda$02 = SearchBarKt$SearchBarImpl$wrappedContent$1.invoke$lambda$1$lambda$0(animatable, graphicsLayerScope);
                return invoke$lambda$1$lambda$02;
        }
    }
}
