package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 implements TextInputSession, ImeEditCommandScope {
    private final /* synthetic */ DefaultImeEditCommandScope $$delegate_0;
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ CursorAnchorInfoController $cursorUpdatesController;
    final /* synthetic */ TextLayoutState $layoutState;
    final /* synthetic */ ky $onImeAction;
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    final /* synthetic */ TransformedTextFieldState $state;
    final /* synthetic */ iy $updateSelectionState;
    final /* synthetic */ ky $updateTouchMode;
    final /* synthetic */ ViewConfiguration $viewConfiguration;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(DefaultImeEditCommandScope defaultImeEditCommandScope, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, ky kyVar, ReceiveContentConfiguration receiveContentConfiguration, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, iy iyVar, ViewConfiguration viewConfiguration, ky kyVar2) {
        this.$state = transformedTextFieldState;
        this.$composeImm = composeInputMethodManager;
        this.$onImeAction = kyVar;
        this.$receiveContentConfiguration = receiveContentConfiguration;
        this.$cursorUpdatesController = cursorAnchorInfoController;
        this.$layoutState = textLayoutState;
        this.$updateSelectionState = iyVar;
        this.$viewConfiguration = viewConfiguration;
        this.$updateTouchMode = kyVar2;
        this.$$delegate_0 = defaultImeEditCommandScope;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        return this.$$delegate_0.beginBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(ky kyVar) {
        this.$$delegate_0.edit(kyVar);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        return this.$$delegate_0.endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public TextFieldCharSequence getText() {
        return this.$state.getVisualText();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public long mo1267mapFromTransformedGEjPoXI(long j) {
        return this.$$delegate_0.mo1267mapFromTransformedGEjPoXI(j);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public long mo1268mapToTransformedGEjPoXI(long j) {
        return this.$$delegate_0.mo1268mapToTransformedGEjPoXI(j);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean onCommitContent(TransferableContent transferableContent) {
        ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.onCommitContent(transferableContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    public void mo1269onImeActionKlQnJC8(int i) {
        ky kyVar = this.$onImeAction;
        if (kyVar != null) {
            kyVar.invoke(ImeAction.m7225boximpl(i));
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public int performHandwritingGesture(HandwritingGesture handwritingGesture) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation(this.$state, handwritingGesture, this.$layoutState, this.$updateSelectionState, this.$viewConfiguration);
        }
        return 2;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation(this.$state, previewableHandwritingGesture, this.$layoutState, cancellationSignal);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void requestCursorUpdates(int i) {
        this.$cursorUpdatesController.requestUpdates(i);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void sendKeyEvent(KeyEvent keyEvent) {
        this.$composeImm.sendKeyEvent(keyEvent);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void updateTouchMode(boolean z) {
        this.$updateTouchMode.invoke(Boolean.valueOf(z));
    }
}
