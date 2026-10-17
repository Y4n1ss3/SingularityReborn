package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    private ky onEvent;
    private ky onPreEvent;

    public InterceptedKeyInputNode(ky kyVar, ky kyVar2) {
        this.onEvent = kyVar;
        this.onPreEvent = kyVar2;
    }

    public final ky getOnEvent() {
        return this.onEvent;
    }

    public final ky getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo5607onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        ky kyVar = this.onEvent;
        if (kyVar != null) {
            return ((Boolean) kyVar.invoke(KeyEvent.m5915boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo5608onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        ky kyVar = this.onPreEvent;
        if (kyVar != null) {
            return ((Boolean) kyVar.invoke(KeyEvent.m5915boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(ky kyVar) {
        this.onEvent = kyVar;
    }

    public final void setOnPreEvent(ky kyVar) {
        this.onPreEvent = kyVar;
    }
}
