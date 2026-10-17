package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import defpackage.my;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {
    public static final int $stable = 8;
    private LegacyPlatformTextInputNode textInputModifierNode;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface LegacyPlatformTextInputNode {
        LayoutCoordinates getLayoutCoordinates();

        LegacyTextFieldState getLegacyTextFieldState();

        SoftwareKeyboardController getSoftwareKeyboardController();

        TextFieldSelectionManager getTextFieldSelectionManager();

        ViewConfiguration getViewConfiguration();

        z10 launchTextInputSession(my myVar);
    }

    public final LegacyPlatformTextInputNode getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    public final void registerModifier(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.textInputModifierNode == null)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = legacyPlatformTextInputNode;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void startStylusHandwriting();

    public final void unregisterModifier(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.textInputModifierNode == legacyPlatformTextInputNode)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be " + legacyPlatformTextInputNode + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }
}
