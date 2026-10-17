package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private my dragAndDropSourceHandler;
    private ky drawDragDecoration;
    private long size = IntSize.Companion.m7787getZeroYbymL2g();

    public LegacyDragAndDropSourceNode(ky kyVar, my myVar) {
        this.drawDragDecoration = kyVar;
        this.dragAndDropSourceHandler = myVar;
        final DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode());
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object invoke = LegacyDragAndDropSourceNode.this.getDragAndDropSourceHandler().invoke(new C00051(pointerInputScope, dragAndDropModifierNode, LegacyDragAndDropSourceNode.this), hmVar);
                return invoke == vn.d ? invoke : w01.a;
            }

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00051 implements DragAndDropSourceScope, PointerInputScope {
                private final /* synthetic */ PointerInputScope $$delegate_0;
                final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
                final /* synthetic */ LegacyDragAndDropSourceNode this$0;

                public C00051(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
                    this.$dragAndDropModifierNode = dragAndDropModifierNode;
                    this.this$0 = legacyDragAndDropSourceNode;
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
                /* renamed from: getExtendedTouchPadding-NH-jbRc */
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
                /* renamed from: getSize-YbymL2g */
                public long mo358getSizeYbymL2g() {
                    return this.$$delegate_0.mo358getSizeYbymL2g();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public ViewConfiguration getViewConfiguration() {
                    return this.$$delegate_0.getViewConfiguration();
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: roundToPx--R2X_6o */
                public int mo360roundToPxR2X_6o(long j) {
                    return this.$$delegate_0.mo360roundToPxR2X_6o(j);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: roundToPx-0680j_4 */
                public int mo361roundToPx0680j_4(float f) {
                    return this.$$delegate_0.mo361roundToPx0680j_4(f);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public void setInterceptOutOfBoundsChildEvents(boolean z) {
                    this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z);
                }

                @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
                public void startTransfer(DragAndDropTransferData dragAndDropTransferData) {
                    this.$dragAndDropModifierNode.mo4261drag12SF9DM(dragAndDropTransferData, IntSizeKt.m7794toSizeozmzZPI(mo358getSizeYbymL2g()), this.this$0.getDrawDragDecoration());
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: toDp-GaN1DYA */
                public float mo362toDpGaN1DYA(long j) {
                    return this.$$delegate_0.mo362toDpGaN1DYA(j);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDp-u2uoSUM */
                public float mo363toDpu2uoSUM(float f) {
                    return this.$$delegate_0.mo363toDpu2uoSUM(f);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDpSize-k-rfVVM */
                public long mo365toDpSizekrfVVM(long j) {
                    return this.$$delegate_0.mo365toDpSizekrfVVM(j);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toPx--R2X_6o */
                public float mo366toPxR2X_6o(long j) {
                    return this.$$delegate_0.mo366toPxR2X_6o(j);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toPx-0680j_4 */
                public float mo367toPx0680j_4(float f) {
                    return this.$$delegate_0.mo367toPx0680j_4(f);
                }

                @Override // androidx.compose.ui.unit.Density
                public Rect toRect(DpRect dpRect) {
                    return this.$$delegate_0.toRect(dpRect);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSize-XkaWNTQ */
                public long mo368toSizeXkaWNTQ(long j) {
                    return this.$$delegate_0.mo368toSizeXkaWNTQ(j);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: toSp-0xMU5do */
                public long mo369toSp0xMU5do(float f) {
                    return this.$$delegate_0.mo369toSp0xMU5do(f);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSp-kPz2Gy4 */
                public long mo370toSpkPz2Gy4(float f) {
                    return this.$$delegate_0.mo370toSpkPz2Gy4(f);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDp-u2uoSUM */
                public float mo364toDpu2uoSUM(int i) {
                    return this.$$delegate_0.mo364toDpu2uoSUM(i);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSp-kPz2Gy4 */
                public long mo371toSpkPz2Gy4(int i) {
                    return this.$$delegate_0.mo371toSpkPz2Gy4(i);
                }
            }
        }));
    }

    public final my getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final ky getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        this.size = j;
    }

    public final void setDragAndDropSourceHandler(my myVar) {
        this.dragAndDropSourceHandler = myVar;
    }

    public final void setDrawDragDecoration(ky kyVar) {
        this.drawDragDecoration = kyVar;
    }
}
