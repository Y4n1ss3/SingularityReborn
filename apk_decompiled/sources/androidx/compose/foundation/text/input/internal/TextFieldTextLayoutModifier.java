package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import defpackage.kp0;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;
    private final KeyboardOptions keyboardOptions;
    private final my onTextLayout;
    private final boolean singleLine;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final TextStyle textStyle;

    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, my myVar, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z;
        this.onTextLayout = myVar;
        this.keyboardOptions = keyboardOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldTextLayoutModifierNode create() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return this.singleLine == textFieldTextLayoutModifier.singleLine && q10.b(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && q10.b(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && q10.b(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.onTextLayout == textFieldTextLayoutModifier.onTextLayout && q10.b(this.keyboardOptions, textFieldTextLayoutModifier.keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int b = kp0.b((this.textFieldState.hashCode() + ((this.textLayoutState.hashCode() + (Boolean.hashCode(this.singleLine) * 31)) * 31)) * 31, 31, this.textStyle);
        my myVar = this.onTextLayout;
        return this.keyboardOptions.hashCode() + ((b + (myVar != null ? myVar.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode) {
        textFieldTextLayoutModifierNode.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
