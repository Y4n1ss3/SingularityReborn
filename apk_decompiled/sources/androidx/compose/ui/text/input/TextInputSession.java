package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class TextInputSession {
    public static final int $stable = 8;
    private final PlatformTextInputService platformTextInputService;
    private final TextInputService textInputService;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean ensureOpenSession(iy iyVar) {
        boolean isOpen = isOpen();
        if (isOpen) {
            iyVar.invoke();
        }
        return isOpen;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean isOpen() {
        return q10.b(this.textInputService.getCurrentInputSession$ui_text(), this);
    }

    public final boolean notifyFocusedRect(Rect rect) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
        return isOpen;
    }

    public final boolean updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, ky kyVar, Rect rect, Rect rect2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, kyVar, rect, rect2);
        }
        return isOpen;
    }
}
