package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$layoutNode$1$2 extends f30 implements ky {
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.$layoutNode = layoutNode;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Density) obj);
        return w01.a;
    }

    public final void invoke(Density density) {
        this.$layoutNode.setDensity(density);
    }
}
