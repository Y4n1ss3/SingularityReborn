package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.dq;
import defpackage.fi0;
import defpackage.ji0;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;
    private PointerIcon icon;
    private boolean overrideDescendants;

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, dq dqVar) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode findOverridingAncestorNode = findOverridingAncestorNode();
        if (findOverridingAncestorNode == null || (pointerIcon = findOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        ji0 ji0Var = new ji0();
        TraversableNodeKt.traverseAncestors(this, new HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(ji0Var));
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ji0Var.d;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
        } else {
            displayIcon(null);
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        HoverIconModifierNode findDescendantNodeWithCursorInBounds;
        if (this.cursorInBoundsOfNode) {
            if (!this.overrideDescendants && (findDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) != null) {
                this = findDescendantNodeWithCursorInBounds;
            }
            this.displayIcon();
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        fi0 fi0Var = new fi0();
        fi0Var.d = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(fi0Var));
        }
        if (fi0Var.d) {
            displayIcon();
        }
    }

    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        ji0 ji0Var = new ji0();
        TraversableNodeKt.traverseDescendants(this, new HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(ji0Var));
        return (HoverIconModifierNode) ji0Var.d;
    }

    private final HoverIconModifierNode findOverridingAncestorNode() {
        ji0 ji0Var = new ji0();
        TraversableNodeKt.traverseAncestors(this, new HoverIconModifierNode$findOverridingAncestorNode$1(ji0Var));
        return (HoverIconModifierNode) ji0Var.d;
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public abstract void displayIcon(PointerIcon pointerIcon);

    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1225getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m6452roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.Companion.m6674getNoneRZrCHBk();
    }

    /* renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo6005isRelevantPointerTypeuerMTgs(int i);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (mo6005isRelevantPointerTypeuerMTgs(changes.get(i).m6104getTypeT8wyACA())) {
                    int m6034getType7fucELk = pointerEvent.m6034getType7fucELk();
                    PointerEventType.Companion companion = PointerEventType.Companion;
                    if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6045getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m6041equalsimpl0(pointerEvent.m6034getType7fucELk(), companion.m6046getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void setDpTouchBoundsExpansion(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (q10.b(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if (this.overrideDescendants != z) {
            this.overrideDescendants = z;
            boolean z2 = this.cursorInBoundsOfNode;
            if (z) {
                if (z2) {
                    displayIcon();
                }
            } else if (z2) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }
}
