package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate$layoutChildrenBlock$1 extends f30 implements iy {
    final /* synthetic */ LookaheadPassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$layoutChildrenBlock$1(LookaheadPassDelegate lookaheadPassDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6507invoke() {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        this.this$0.clearPlaceOrder();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass1.INSTANCE);
        LookaheadDelegate lookaheadDelegate = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            boolean isPlacingForAlignment$ui = lookaheadDelegate.isPlacingForAlignment$ui();
            layoutNode2 = this.this$0.getLayoutNode();
            List<LayoutNode> children$ui = layoutNode2.getChildren$ui();
            int size = children$ui.size();
            for (int i = 0; i < size; i++) {
                LookaheadDelegate lookaheadDelegate2 = children$ui.get(i).getOuterCoordinator$ui().getLookaheadDelegate();
                if (lookaheadDelegate2 != null) {
                    lookaheadDelegate2.setPlacingForAlignment$ui(isPlacingForAlignment$ui);
                }
            }
        }
        LookaheadDelegate lookaheadDelegate3 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        lookaheadDelegate3.getClass();
        lookaheadDelegate3.getMeasureResult$ui().placeChildren();
        LookaheadDelegate lookaheadDelegate4 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate4 != null) {
            lookaheadDelegate4.isPlacingForAlignment$ui();
            layoutNode = this.this$0.getLayoutNode();
            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
            int size2 = children$ui2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                LookaheadDelegate lookaheadDelegate5 = children$ui2.get(i2).getOuterCoordinator$ui().getLookaheadDelegate();
                if (lookaheadDelegate5 != null) {
                    lookaheadDelegate5.setPlacingForAlignment$ui(false);
                }
            }
        }
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass4.INSTANCE);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui(false);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AlignmentLinesOwner) obj);
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f30 implements ky {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui());
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AlignmentLinesOwner) obj);
            return w01.a;
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6507invoke();
        return w01.a;
    }
}
