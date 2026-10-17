package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$layoutNode$1$1 extends f30 implements ky {
    final /* synthetic */ Modifier $coreModifier;
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, Modifier modifier) {
        super(1);
        this.$layoutNode = layoutNode;
        this.$coreModifier = modifier;
    }

    public final void invoke(Modifier modifier) {
        this.$layoutNode.setModifier(modifier.then(this.$coreModifier));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Modifier) obj);
        return w01.a;
    }
}
