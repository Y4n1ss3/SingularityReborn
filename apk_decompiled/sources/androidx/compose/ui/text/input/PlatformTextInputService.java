package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    void showSoftwareKeyboard();

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, ky kyVar, ky kyVar2);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    default void startInput() {
    }

    default void notifyFocusedRect(Rect rect) {
    }

    default void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, ky kyVar, Rect rect, Rect rect2) {
    }
}
