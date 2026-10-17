package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import defpackage.hr0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {
    private android.view.inputmethod.InputMethodManager imm;
    private final hr0 softwareKeyboardControllerCompat;
    private final View view;

    public ComposeInputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new hr0(view);
    }

    private final android.view.inputmethod.InputMethodManager createImm() {
        Object systemService = this.view.getContext().getSystemService("input_method");
        systemService.getClass();
        return (android.view.inputmethod.InputMethodManager) systemService;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.a.g();
    }

    public final android.view.inputmethod.InputMethodManager requireImm() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        android.view.inputmethod.InputMethodManager createImm = createImm();
        this.imm = createImm;
        return createImm;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void restartInput() {
        requireImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.a.i();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        requireImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateExtractedText(int i, ExtractedText extractedText) {
        requireImm().updateExtractedText(this.view, i, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateSelection(int i, int i2, int i3, int i4) {
        requireImm().updateSelection(this.view, i, i2, i3, i4);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
    }
}
