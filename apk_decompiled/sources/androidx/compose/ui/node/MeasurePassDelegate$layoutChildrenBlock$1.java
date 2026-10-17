package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MeasurePassDelegate$layoutChildrenBlock$1 extends f30 implements iy {
    final /* synthetic */ MeasurePassDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurePassDelegate$layoutChildrenBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6521invoke() {
        this.this$0.clearPlaceOrder();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass1.INSTANCE);
        if (this.this$0.getInnerCoordinator().isPlacingForAlignment$ui()) {
            List<LayoutNode> children$ui = this.this$0.getLayoutNode().getChildren$ui();
            int size = children$ui.size();
            for (int i = 0; i < size; i++) {
                children$ui.get(i).getOuterCoordinator$ui().setPlacingForAlignment$ui(true);
            }
        }
        this.this$0.getInnerCoordinator().getMeasureResult$ui().placeChildren();
        if (this.this$0.getInnerCoordinator().isPlacingForAlignment$ui()) {
            List<LayoutNode> children$ui2 = this.this$0.getLayoutNode().getChildren$ui();
            int size2 = children$ui2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                children$ui2.get(i2).getOuterCoordinator$ui().setPlacingForAlignment$ui(false);
            }
        }
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass4.INSTANCE);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
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
    /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$4, reason: invalid class name */
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
        m6521invoke();
        return w01.a;
    }
}
