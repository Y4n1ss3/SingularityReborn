package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTextFieldMagnifier_androidKt {
    public static final TextFieldMagnifierNode textFieldMagnifierNode(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        return Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? new TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z) : new TextFieldMagnifierNode() { // from class: androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt$textFieldMagnifierNode$1
            @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
            public void update(TransformedTextFieldState transformedTextFieldState2, TextFieldSelectionState textFieldSelectionState2, TextLayoutState textLayoutState2, boolean z2) {
            }
        };
    }
}
