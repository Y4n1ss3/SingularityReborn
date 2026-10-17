package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OnLayoutRectChangedNode extends Modifier.Node {
    private ky callback;
    private long debounceMillis;
    private DelegatableNode.RegistrationHandle handle;
    private long throttleMillis;

    public OnLayoutRectChangedNode(long j, long j2, ky kyVar) {
        this.throttleMillis = j;
        this.debounceMillis = j2;
        this.callback = kyVar;
    }

    public final void disposeAndRegister() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, this.throttleMillis, this.debounceMillis, this.callback);
    }

    public final ky getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        disposeAndRegister();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = null;
    }

    public final void setCallback(ky kyVar) {
        this.callback = kyVar;
    }

    public final void setDebounceMillis(long j) {
        this.debounceMillis = j;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setThrottleMillis(long j) {
        this.throttleMillis = j;
    }
}
