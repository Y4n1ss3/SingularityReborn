package androidx.compose.ui.text.input;

import defpackage.er;
import defpackage.ky;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public class TextInputService {
    public static final int $stable = 8;
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    public final TextInputSession getCurrentInputSession$ui_text() {
        return this._currentInputSession.get();
    }

    @er
    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    @er
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, kyVar, kyVar2);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(TextInputSession textInputSession) {
        AtomicReference<TextInputSession> atomicReference = this._currentInputSession;
        while (!atomicReference.compareAndSet(textInputSession, null)) {
            if (atomicReference.get() != textInputSession) {
                return;
            }
        }
        this.platformTextInputService.stopInput();
    }

    public final void startInput() {
        this.platformTextInputService.startInput();
        this._currentInputSession.set(new TextInputSession(this, this.platformTextInputService));
    }

    public final void stopInput() {
        this._currentInputSession.set(null);
        this.platformTextInputService.stopInput();
    }
}
