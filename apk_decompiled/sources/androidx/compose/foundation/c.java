package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 outline$lambda$0;
        int spacingPx_delegate$lambda$0;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                outline$lambda$0 = BackgroundNode.getOutline$lambda$0((BackgroundNode) obj2, (ContentDrawScope) obj);
                return outline$lambda$0;
            default:
                spacingPx_delegate$lambda$0 = MarqueeModifierNode.spacingPx_delegate$lambda$0((MarqueeSpacing) obj2, (MarqueeModifierNode) obj);
                return Integer.valueOf(spacingPx_delegate$lambda$0);
        }
    }
}
