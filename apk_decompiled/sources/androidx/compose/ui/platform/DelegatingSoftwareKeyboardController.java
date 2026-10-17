package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    public static final int $stable = 0;
    private final TextInputService textInputService;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService) {
        this.textInputService = textInputService;
    }

    public final TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void hide() {
        this.textInputService.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void show() {
        this.textInputService.showSoftwareKeyboard();
    }
}
