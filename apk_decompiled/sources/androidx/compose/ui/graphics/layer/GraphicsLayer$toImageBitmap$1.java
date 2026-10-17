package androidx.compose.ui.graphics.layer;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", l = {870}, m = "toImageBitmap", v = 1)
/* loaded from: classes.dex */
public final class GraphicsLayer$toImageBitmap$1 extends im {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphicsLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$toImageBitmap$1(GraphicsLayer graphicsLayer, hm hmVar) {
        super(hmVar);
        this.this$0 = graphicsLayer;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toImageBitmap(this);
    }
}
