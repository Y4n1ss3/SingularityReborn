package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import defpackage.g30;
import defpackage.g40;
import defpackage.hr0;
import defpackage.i2;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    private final g30 imm$delegate = y80.B(g40.e, new i2(this, 17));
    private final hr0 softwareKeyboardControllerCompat;
    private final View view;

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new hr0(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.inputmethod.InputMethodManager imm_delegate$lambda$0(InputMethodManagerImpl inputMethodManagerImpl) {
        Object systemService = inputMethodManagerImpl.view.getContext().getSystemService("input_method");
        systemService.getClass();
        return (android.view.inputmethod.InputMethodManager) systemService;
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.a.g();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.a.i();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void startStylusHandwriting() {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34StartStylusHandwriting.INSTANCE.startStylusHandwriting(getImm(), this.view);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateExtractedText(int i, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.view, i, i2, i3, i4);
    }
}
