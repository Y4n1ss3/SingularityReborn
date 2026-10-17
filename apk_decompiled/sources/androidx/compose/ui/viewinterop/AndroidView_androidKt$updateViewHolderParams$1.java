package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$updateViewHolderParams$1 extends f30 implements my {
    public static final AndroidView_androidKt$updateViewHolderParams$1 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$1();

    public AndroidView_androidKt$updateViewHolderParams$1() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Modifier) obj2);
        return w01.a;
    }

    public final void invoke(LayoutNode layoutNode, Modifier modifier) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setModifier(modifier);
    }
}
