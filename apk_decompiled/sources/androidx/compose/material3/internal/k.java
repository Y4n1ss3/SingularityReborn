package androidx.compose.material3.internal;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ State e;

    public /* synthetic */ k(State state, int i) {
        this.d = i;
        this.e = state;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        w01 invoke$lambda$1$lambda$03;
        int i = this.d;
        State state = this.e;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1.invoke$lambda$1$lambda$0(state, graphicsLayerScope);
                return invoke$lambda$1$lambda$0;
            case 1:
                invoke$lambda$1$lambda$02 = TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1.invoke$lambda$1$lambda$0(state, graphicsLayerScope);
                return invoke$lambda$1$lambda$02;
            default:
                invoke$lambda$1$lambda$03 = TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1.invoke$lambda$1$lambda$0(state, graphicsLayerScope);
                return invoke$lambda$1$lambda$03;
        }
    }
}
