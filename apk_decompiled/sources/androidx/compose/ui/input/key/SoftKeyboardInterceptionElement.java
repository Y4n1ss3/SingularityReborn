package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {
    private final ky onKeyEvent;
    private final ky onPreKeyEvent;

    public SoftKeyboardInterceptionElement(ky kyVar, ky kyVar2) {
        this.onKeyEvent = kyVar;
        this.onPreKeyEvent = kyVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return this.onKeyEvent == softKeyboardInterceptionElement.onKeyEvent && this.onPreKeyEvent == softKeyboardInterceptionElement.onPreKeyEvent;
    }

    public final ky getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final ky getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ky kyVar = this.onKeyEvent;
        int hashCode = (kyVar != null ? kyVar.hashCode() : 0) * 31;
        ky kyVar2 = this.onPreKeyEvent;
        return hashCode + (kyVar2 != null ? kyVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        ky kyVar = this.onKeyEvent;
        if (kyVar != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", kyVar);
        }
        ky kyVar2 = this.onPreKeyEvent;
        if (kyVar2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", kyVar2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
