package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final boolean reverseScrolling;
    private final ScrollState scrollState;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z, boolean z2) {
        this.scrollState = scrollState;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollNode create() {
        return new ScrollNode(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return q10.b(this.scrollState, scrollingLayoutElement.scrollState) && this.reverseScrolling == scrollingLayoutElement.reverseScrolling && this.isVertical == scrollingLayoutElement.isVertical;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.isVertical) + kp0.c(this.scrollState.hashCode() * 31, 31, this.reverseScrolling);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.scrollState);
        uf.d(this.reverseScrolling, inspectorInfo.getProperties(), "reverseScrolling", inspectorInfo).set("isVertical", Boolean.valueOf(this.isVertical));
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollNode scrollNode) {
        scrollNode.setState(this.scrollState);
        scrollNode.setReverseScrolling(this.reverseScrolling);
        scrollNode.setVertical(this.isVertical);
    }
}
