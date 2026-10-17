package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.hl0;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$updateViewHolderParams$4 extends f30 implements my {
    public static final AndroidView_androidKt$updateViewHolderParams$4 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$4();

    public AndroidView_androidKt$updateViewHolderParams$4() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (hl0) obj2);
        return w01.a;
    }

    public final void invoke(LayoutNode layoutNode, hl0 hl0Var) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setSavedStateRegistryOwner(hl0Var);
    }
}
