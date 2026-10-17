package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {
    private final ky callback;
    private final long debounceMillis;
    private final long throttleMillis;

    public OnLayoutRectChangedElement(long j, long j2, ky kyVar) {
        this.throttleMillis = j;
        this.debounceMillis = j2;
        this.callback = kyVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnLayoutRectChangedNode create() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && this.callback == onLayoutRectChangedElement.callback;
    }

    public final ky getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.callback.hashCode() + ((Long.hashCode(this.debounceMillis) + (Long.hashCode(this.throttleMillis) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnLayoutRectChangedNode onLayoutRectChangedNode) {
        onLayoutRectChangedNode.setThrottleMillis(this.throttleMillis);
        onLayoutRectChangedNode.setDebounceMillis(this.debounceMillis);
        onLayoutRectChangedNode.setCallback(this.callback);
        onLayoutRectChangedNode.disposeAndRegister();
    }
}
