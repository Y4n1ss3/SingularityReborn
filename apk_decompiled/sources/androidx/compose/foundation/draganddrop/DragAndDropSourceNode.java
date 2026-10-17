package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;
import defpackage.w5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private my detectDragStart;
    private ky drawDragDecoration;
    private PointerInputModifierNode inputModifierNode;
    private ky transferData;
    private long size = IntSize.Companion.m7787getZeroYbymL2g();
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) delegate(DragAndDropNodeKt.DragAndDropSourceModifierNode(new w5(this, 5)));

    public DragAndDropSourceNode(ky kyVar, my myVar, ky kyVar2) {
        this.drawDragDecoration = kyVar;
        this.detectDragStart = myVar;
        this.transferData = kyVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropModifierNode$lambda$0(DragAndDropSourceNode dragAndDropSourceNode, DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
        DragAndDropTransferData dragAndDropTransferData = (DragAndDropTransferData) dragAndDropSourceNode.transferData.invoke(offset);
        if (dragAndDropTransferData != null) {
            dragAndDropStartTransferScope.mo4260startDragAndDropTransfer12SF9DM(dragAndDropTransferData, IntSizeKt.m7794toSizeozmzZPI(dragAndDropSourceNode.size), dragAndDropSourceNode.drawDragDecoration);
        }
        return w01.a;
    }

    public final my getDetectDragStart() {
        return this.detectDragStart;
    }

    public final ky getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final ky getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.dragAndDropModifierNode.isRequestDragAndDropTransferRequired()) {
            this.inputModifierNode = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                    Object invoke = DragAndDropSourceNode.this.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, DragAndDropSourceNode.this), hmVar);
                    return invoke == vn.d ? invoke : w01.a;
                }

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements DragAndDropStartDetectorScope, PointerInputScope {
                    private final /* synthetic */ PointerInputScope $$delegate_0;
                    final /* synthetic */ DragAndDropSourceNode this$0;

                    public AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.this$0 = dragAndDropSourceNode;
                        this.$$delegate_0 = pointerInputScope;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public <R> Object awaitPointerEventScope(my myVar, hm hmVar) {
                        return this.$$delegate_0.awaitPointerEventScope(myVar, hmVar);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float getDensity() {
                        return this.$$delegate_0.getDensity();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
                    public long mo357getExtendedTouchPaddingNHjbRc() {
                        return this.$$delegate_0.mo357getExtendedTouchPaddingNHjbRc();
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    public float getFontScale() {
                        return this.$$delegate_0.getFontScale();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public boolean getInterceptOutOfBoundsChildEvents() {
                        return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    /* renamed from: getSize-YbymL2g, reason: not valid java name */
                    public long mo358getSizeYbymL2g() {
                        return this.$$delegate_0.mo358getSizeYbymL2g();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.$$delegate_0.getViewConfiguration();
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
                    public void mo359requestDragAndDropTransferk4lQ0M(long j) {
                        DragAndDropSourceModifierNode dragAndDropSourceModifierNode;
                        dragAndDropSourceModifierNode = this.this$0.dragAndDropModifierNode;
                        dragAndDropSourceModifierNode.mo4263requestDragAndDropTransferk4lQ0M(j);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
                    public int mo360roundToPxR2X_6o(long j) {
                        return this.$$delegate_0.mo360roundToPxR2X_6o(j);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
                    public int mo361roundToPx0680j_4(float f) {
                        return this.$$delegate_0.mo361roundToPx0680j_4(f);
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public void setInterceptOutOfBoundsChildEvents(boolean z) {
                        this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
                    public float mo362toDpGaN1DYA(long j) {
                        return this.$$delegate_0.mo362toDpGaN1DYA(j);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo363toDpu2uoSUM(float f) {
                        return this.$$delegate_0.mo363toDpu2uoSUM(f);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
                    public long mo365toDpSizekrfVVM(long j) {
                        return this.$$delegate_0.mo365toDpSizekrfVVM(j);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toPx--R2X_6o, reason: not valid java name */
                    public float mo366toPxR2X_6o(long j) {
                        return this.$$delegate_0.mo366toPxR2X_6o(j);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toPx-0680j_4, reason: not valid java name */
                    public float mo367toPx0680j_4(float f) {
                        return this.$$delegate_0.mo367toPx0680j_4(f);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public Rect toRect(DpRect dpRect) {
                        return this.$$delegate_0.toRect(dpRect);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
                    public long mo368toSizeXkaWNTQ(long j) {
                        return this.$$delegate_0.mo368toSizeXkaWNTQ(j);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    /* renamed from: toSp-0xMU5do, reason: not valid java name */
                    public long mo369toSp0xMU5do(float f) {
                        return this.$$delegate_0.mo369toSp0xMU5do(f);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo370toSpkPz2Gy4(float f) {
                        return this.$$delegate_0.mo370toSpkPz2Gy4(f);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
                    public float mo364toDpu2uoSUM(int i) {
                        return this.$$delegate_0.mo364toDpu2uoSUM(i);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
                    public long mo371toSpkPz2Gy4(int i) {
                        return this.$$delegate_0.mo371toSpkPz2Gy4(i);
                    }
                }
            }));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PointerInputModifierNode pointerInputModifierNode = this.inputModifierNode;
        if (pointerInputModifierNode != null) {
            undelegate(pointerInputModifierNode);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropModifierNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo356onRemeasuredozmzZPI(long j) {
        this.size = j;
        this.dragAndDropModifierNode.mo356onRemeasuredozmzZPI(j);
    }

    public final void setDetectDragStart(my myVar) {
        this.detectDragStart = myVar;
    }

    public final void setDrawDragDecoration(ky kyVar) {
        this.drawDragDecoration = kyVar;
    }

    public final void setTransferData(ky kyVar) {
        this.transferData = kyVar;
    }
}
