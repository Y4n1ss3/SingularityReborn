package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import defpackage.cq;
import defpackage.dq;
import defpackage.iy;
import defpackage.p10;
import defpackage.r60;
import defpackage.xa0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final r60 relevantChanges = new r60(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        r60 r60Var = this.relevantChanges;
        int i = r60Var.g;
        Object[] objArr = r60Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        r60Var.g = 0;
        r60Var.d = false;
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(iy iyVar) {
        LayoutNode layoutNode;
        if (this.relevantChanges.e() != 0 && this.modifierNode.isAttached()) {
            NodeCoordinator coordinator$ui = this.modifierNode.getCoordinator$ui();
            if ((coordinator$ui == null || (layoutNode = coordinator$ui.getLayoutNode()) == null) ? false : layoutNode.isPlaced()) {
                iyVar.invoke();
                return true;
            }
        }
        return false;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m4513equalsimpl0(pointerEvent.getChanges().get(i).m6101getPositionF1C5BW0(), pointerEvent2.getChanges().get(i).m6101getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(r60 r60Var, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        PointerInputChange pointerInputChange;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        int i3;
        boolean buildCache = super.buildCache(r60Var, layoutCoordinates, internalPointerEvent, z);
        boolean z5 = true;
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNode = this.modifierNode;
            int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof PointerInputModifierNode) {
                    this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) delegatingNode);
                } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                    int i4 = 0;
                    delegatingNode = delegatingNode;
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                            i4++;
                            if (i4 == 1) {
                                delegatingNode = delegate$ui;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNode != 0) {
                                    mutableVector.add(delegatingNode);
                                    delegatingNode = 0;
                                }
                                mutableVector.add(delegate$ui);
                            }
                        }
                        delegate$ui = delegate$ui.getChild$ui();
                        delegatingNode = delegatingNode;
                    }
                    if (i4 == 1) {
                    }
                }
                delegatingNode = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.coordinates != null) {
                int e = r60Var.e();
                int i5 = 0;
                while (i5 < e) {
                    long b = r60Var.b(i5);
                    PointerInputChange pointerInputChange2 = (PointerInputChange) r60Var.f(i5);
                    if (this.pointerIds.contains(b)) {
                        boolean z6 = z5;
                        int i6 = i5;
                        long m6102getPreviousPositionF1C5BW0 = pointerInputChange2.m6102getPreviousPositionF1C5BW0();
                        z4 = z6;
                        long m6101getPositionF1C5BW0 = pointerInputChange2.m6101getPositionF1C5BW0();
                        if ((((m6102getPreviousPositionF1C5BW0 & InlineClassHelperKt.DualUnsignedFloatMask) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0 && (((m6101getPositionF1C5BW0 & InlineClassHelperKt.DualUnsignedFloatMask) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(pointerInputChange2.getHistorical().size());
                            List<HistoricalChange> historical = pointerInputChange2.getHistorical();
                            z3 = buildCache;
                            int size = historical.size();
                            i = e;
                            int i7 = 0;
                            while (i7 < size) {
                                HistoricalChange historicalChange = historical.get(i7);
                                int i8 = size;
                                int i9 = i7;
                                long m6001getPositionF1C5BW0 = historicalChange.m6001getPositionF1C5BW0();
                                if ((((m6001getPositionF1C5BW0 & InlineClassHelperKt.DualUnsignedFloatMask) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                                    long uptimeMillis = historicalChange.getUptimeMillis();
                                    i3 = i6;
                                    LayoutCoordinates layoutCoordinates2 = this.coordinates;
                                    layoutCoordinates2.getClass();
                                    arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates2.mo6243localPositionOfR5De75A(layoutCoordinates, m6001getPositionF1C5BW0), historicalChange.getScaleFactor(), historicalChange.m6000getPanOffsetF1C5BW0(), historicalChange.m5999getOriginalEventPositionF1C5BW0$ui(), (dq) null));
                                } else {
                                    i3 = i6;
                                }
                                i7 = i9 + 1;
                                size = i8;
                                i6 = i3;
                            }
                            i2 = i6;
                            r60 r60Var2 = this.relevantChanges;
                            LayoutCoordinates layoutCoordinates3 = this.coordinates;
                            layoutCoordinates3.getClass();
                            long mo6243localPositionOfR5De75A = layoutCoordinates3.mo6243localPositionOfR5De75A(layoutCoordinates, m6102getPreviousPositionF1C5BW0);
                            LayoutCoordinates layoutCoordinates4 = this.coordinates;
                            layoutCoordinates4.getClass();
                            r60Var2.c(b, PointerInputChange.m6087copyOHpmEuE$default(pointerInputChange2, 0L, 0L, layoutCoordinates4.mo6243localPositionOfR5De75A(layoutCoordinates, m6101getPositionF1C5BW0), false, 0L, mo6243localPositionOfR5De75A, false, 0, arrayList, 0L, 731, null));
                        } else {
                            z3 = buildCache;
                            i = e;
                            i2 = i6;
                        }
                    } else {
                        z3 = buildCache;
                        i = e;
                        z4 = z5;
                        i2 = i5;
                    }
                    i5 = i2 + 1;
                    z5 = z4;
                    buildCache = z3;
                    e = i;
                }
                boolean z7 = buildCache;
                boolean z8 = z5;
                boolean z9 = this.relevantChanges.e() == 0 ? z8 : false;
                PointerIdArray pointerIdArray = this.pointerIds;
                if (z9) {
                    pointerIdArray.clear();
                    getChildren().clear();
                    return z8;
                }
                int size2 = pointerIdArray.getSize();
                while (true) {
                    size2--;
                    if (-1 >= size2) {
                        break;
                    }
                    long m6204get_I2yYro = this.pointerIds.m6204get_I2yYro(size2);
                    if (r60Var.d) {
                        int i10 = r60Var.g;
                        long[] jArr = r60Var.e;
                        Object[] objArr = r60Var.f;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj = objArr[i12];
                            if (obj != cq.c) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        r60Var.d = false;
                        r60Var.g = i11;
                    }
                    if (p10.f(r60Var.e, r60Var.g, m6204get_I2yYro) < 0) {
                        this.pointerIds.removeAt(size2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.relevantChanges.e());
                int e2 = this.relevantChanges.e();
                for (int i13 = 0; i13 < e2; i13++) {
                    arrayList2.add(this.relevantChanges.f(i13));
                }
                PointerEvent pointerEvent = new PointerEvent(arrayList2, internalPointerEvent);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size3 = changes.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        pointerInputChange = null;
                        break;
                    }
                    PointerInputChange pointerInputChange3 = changes.get(i14);
                    if (internalPointerEvent.m6006activeHoverEvent0FcD4WY(pointerInputChange3.m6098getIdJ3iCeTQ())) {
                        pointerInputChange = pointerInputChange3;
                        break;
                    }
                    i14++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 != null) {
                    if (z) {
                        z2 = false;
                        if (!this.isIn && (pointerInputChange4.getPressed() || pointerInputChange4.getPreviousPressed())) {
                            this.coordinates.getClass();
                            this.isIn = !PointerEventKt.m6036isOutOfBoundsO0kMr_c(pointerInputChange4, r3.mo6242getSizeYbymL2g());
                        }
                    } else {
                        z2 = false;
                        this.isIn = false;
                    }
                    if (this.isIn != this.wasIn) {
                        int m6034getType7fucELk = pointerEvent.m6034getType7fucELk();
                        PointerEventType.Companion companion = PointerEventType.Companion;
                        if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6047getMove7fucELk()) || PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), companion.m6045getEnter7fucELk()) || PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), companion.m6046getExit7fucELk())) {
                            pointerEvent.m6035setTypeEhbLWgg$ui(this.isIn ? companion.m6045getEnter7fucELk() : companion.m6046getExit7fucELk());
                        }
                    }
                    int m6034getType7fucELk2 = pointerEvent.m6034getType7fucELk();
                    PointerEventType.Companion companion2 = PointerEventType.Companion;
                    if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk2, companion2.m6045getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                        pointerEvent.m6035setTypeEhbLWgg$ui(companion2.m6047getMove7fucELk());
                    } else if (PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), companion2.m6046getExit7fucELk()) && this.isIn && pointerInputChange4.getPressed()) {
                        pointerEvent.m6035setTypeEhbLWgg$ui(companion2.m6047getMove7fucELk());
                    }
                } else {
                    z2 = false;
                }
                boolean z10 = (z7 || !PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), PointerEventType.Companion.m6047getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z8 : z2;
                this.pointerEvent = pointerEvent;
                return z10;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            boolean pressed = pointerInputChange.getPressed();
            boolean m6006activeHoverEvent0FcD4WY = internalPointerEvent.m6006activeHoverEvent0FcD4WY(pointerInputChange.m6098getIdJ3iCeTQ());
            boolean z = this.isIn;
            if ((!pressed && !m6006activeHoverEvent0FcD4WY) || (!pressed && !z)) {
                this.pointerIds.remove(pointerInputChange.m6098getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), PointerEventType.Companion.m6046getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].dispatchCancel();
        }
        DelegatingNode delegatingNode = this.modifierNode;
        int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                int i2 = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                        i2++;
                        if (i2 == 1) {
                            delegatingNode = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                mutableVector.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    delegatingNode = delegatingNode;
                }
                if (i2 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        LayoutNode layoutNode;
        boolean z = false;
        z = false;
        z = false;
        if (this.relevantChanges.e() != 0 && this.modifierNode.isAttached()) {
            NodeCoordinator coordinator$ui = this.modifierNode.getCoordinator$ui();
            if ((coordinator$ui == null || (layoutNode = coordinator$ui.getLayoutNode()) == null) ? false : layoutNode.isPlaced()) {
                PointerEvent pointerEvent = this.pointerEvent;
                pointerEvent.getClass();
                LayoutCoordinates layoutCoordinates = this.coordinates;
                layoutCoordinates.getClass();
                long mo6242getSizeYbymL2g = layoutCoordinates.mo6242getSizeYbymL2g();
                DelegatingNode delegatingNode = this.modifierNode;
                int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode) delegatingNode).mo197onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, mo6242getSizeYbymL2g);
                    } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                        int i = 0;
                        delegatingNode = delegatingNode;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNode = delegate$ui;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        mutableVector.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    mutableVector.add(delegate$ui);
                                }
                            }
                            delegate$ui = delegate$ui.getChild$ui();
                            delegatingNode = delegatingNode;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.pop(mutableVector);
                }
                if (this.modifierNode.isAttached()) {
                    MutableVector<Node> children = getChildren();
                    Node[] nodeArr = children.content;
                    int size = children.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        nodeArr[i2].dispatchFinalEventPass(internalPointerEvent);
                    }
                }
                z = true;
            }
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(r60 r60Var, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        LayoutNode layoutNode;
        if (this.relevantChanges.e() != 0 && this.modifierNode.isAttached()) {
            NodeCoordinator coordinator$ui = this.modifierNode.getCoordinator$ui();
            if ((coordinator$ui == null || (layoutNode = coordinator$ui.getLayoutNode()) == null) ? false : layoutNode.isPlaced()) {
                PointerEvent pointerEvent = this.pointerEvent;
                pointerEvent.getClass();
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                layoutCoordinates2.getClass();
                long mo6242getSizeYbymL2g = layoutCoordinates2.mo6242getSizeYbymL2g();
                DelegatingNode delegatingNode = this.modifierNode;
                int m6573constructorimpl = NodeKind.m6573constructorimpl(16);
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode) delegatingNode).mo197onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, mo6242getSizeYbymL2g);
                    } else if ((delegatingNode.getKindSet$ui() & m6573constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = delegatingNode.getDelegate$ui();
                        int i = 0;
                        delegatingNode = delegatingNode;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet$ui() & m6573constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNode = delegate$ui;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        mutableVector.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    mutableVector.add(delegate$ui);
                                }
                            }
                            delegate$ui = delegate$ui.getChild$ui();
                            delegatingNode = delegatingNode;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.pop(mutableVector);
                }
                if (this.modifierNode.isAttached()) {
                    MutableVector<Node> children = getChildren();
                    Node[] nodeArr = children.content;
                    int size = children.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        Node node = nodeArr[i2];
                        r60 r60Var2 = this.relevantChanges;
                        LayoutCoordinates layoutCoordinates3 = this.coordinates;
                        layoutCoordinates3.getClass();
                        node.dispatchMainEventPass(r60Var2, layoutCoordinates3, internalPointerEvent, z);
                    }
                }
                if (this.modifierNode.isAttached()) {
                    DelegatingNode delegatingNode2 = this.modifierNode;
                    int m6573constructorimpl2 = NodeKind.m6573constructorimpl(16);
                    MutableVector mutableVector2 = null;
                    while (delegatingNode2 != 0) {
                        if (delegatingNode2 instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode2).mo197onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, mo6242getSizeYbymL2g);
                        } else if ((delegatingNode2.getKindSet$ui() & m6573constructorimpl2) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui2 = delegatingNode2.getDelegate$ui();
                            int i3 = 0;
                            delegatingNode2 = delegatingNode2;
                            while (delegate$ui2 != null) {
                                if ((delegate$ui2.getKindSet$ui() & m6573constructorimpl2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        delegatingNode2 = delegate$ui2;
                                    } else {
                                        if (mutableVector2 == null) {
                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode2 != 0) {
                                            mutableVector2.add(delegatingNode2);
                                            delegatingNode2 = 0;
                                        }
                                        mutableVector2.add(delegate$ui2);
                                    }
                                }
                                delegate$ui2 = delegate$ui2.getChild$ui();
                                delegatingNode2 = delegatingNode2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        delegatingNode2 = DelegatableNodeKt.pop(mutableVector2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long j, xa0 xa0Var) {
        if (this.pointerIds.contains(j) && xa0Var.c(this) < 0) {
            this.pointerIds.remove(j);
            this.relevantChanges.d(j);
        }
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].removeInvalidPointerIdsAndChanges(j, xa0Var);
        }
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
