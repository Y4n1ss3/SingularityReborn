package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.f30;
import defpackage.iy;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadScopeKt$LookaheadScope$2$2 extends f30 implements my {
    public static final LookaheadScopeKt$LookaheadScope$2$2 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$2();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements iy {
        final /* synthetic */ LayoutNode $this_set;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LayoutNode layoutNode) {
            super(0);
            this.$this_set = layoutNode;
        }

        @Override // defpackage.iy
        public final LayoutCoordinates invoke() {
            LayoutNode parent$ui = this.$this_set.getParent$ui();
            parent$ui.getClass();
            return parent$ui.getInnerCoordinator$ui().getCoordinates();
        }
    }

    public LookaheadScopeKt$LookaheadScope$2$2() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LookaheadScopeImpl) obj2);
        return w01.a;
    }

    public final void invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        lookaheadScopeImpl.setScopeCoordinates(new AnonymousClass1(layoutNode));
    }
}
