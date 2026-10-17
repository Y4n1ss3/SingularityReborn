package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.f30;
import defpackage.kf0;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComponent$drawVectorBlock$1 extends f30 implements ky {
    final /* synthetic */ VectorComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.this$0 = vectorComponent;
    }

    public final void invoke(DrawScope drawScope) {
        float f;
        float f2;
        GroupComponent root = this.this$0.getRoot();
        VectorComponent vectorComponent = this.this$0;
        f = vectorComponent.rootScaleX;
        f2 = vectorComponent.rootScaleY;
        long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(f, f2, m4532getZeroF1C5BW0);
            root.draw(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }
}
