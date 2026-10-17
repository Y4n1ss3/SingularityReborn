package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GraphicsLayerImpl$Companion$DefaultDrawBlock$1 extends f30 implements ky {
    public static final GraphicsLayerImpl$Companion$DefaultDrawBlock$1 INSTANCE = new GraphicsLayerImpl$Companion$DefaultDrawBlock$1();

    public GraphicsLayerImpl$Companion$DefaultDrawBlock$1() {
        super(1);
    }

    public final void invoke(DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, Color.Companion.m4796getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
