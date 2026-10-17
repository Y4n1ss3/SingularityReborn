package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadScopeKt$LookaheadScope$2$1 extends f30 implements ky {
    public static final LookaheadScopeKt$LookaheadScope$2$1 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$1();

    public LookaheadScopeKt$LookaheadScope$2$1() {
        super(1);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return w01.a;
    }

    public final void invoke(LayoutNode layoutNode) {
        layoutNode.setVirtualLookaheadRoot$ui(true);
    }
}
