package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.jb0;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final InputTransformation filter;
    private final MutableInteractionSource interactionSource;
    private final boolean isPassword;
    private final KeyboardActionHandler keyboardActionHandler;
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;
    private final jb0 stylusHandwritingTrigger;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;

    public TextFieldDecoratorModifier(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, jb0 jb0Var) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z4;
        this.stylusHandwritingTrigger = jb0Var;
    }

    private final TransformedTextFieldState component1() {
        return this.textFieldState;
    }

    private final MutableInteractionSource component10() {
        return this.interactionSource;
    }

    private final boolean component11() {
        return this.isPassword;
    }

    private final jb0 component12() {
        return this.stylusHandwritingTrigger;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TextFieldSelectionState component3() {
        return this.textFieldSelectionState;
    }

    private final InputTransformation component4() {
        return this.filter;
    }

    private final boolean component5() {
        return this.enabled;
    }

    private final boolean component6() {
        return this.readOnly;
    }

    private final KeyboardOptions component7() {
        return this.keyboardOptions;
    }

    private final KeyboardActionHandler component8() {
        return this.keyboardActionHandler;
    }

    private final boolean component9() {
        return this.singleLine;
    }

    public static /* synthetic */ TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier textFieldDecoratorModifier, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, jb0 jb0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            transformedTextFieldState = textFieldDecoratorModifier.textFieldState;
        }
        if ((i & 2) != 0) {
            textLayoutState = textFieldDecoratorModifier.textLayoutState;
        }
        if ((i & 4) != 0) {
            textFieldSelectionState = textFieldDecoratorModifier.textFieldSelectionState;
        }
        if ((i & 8) != 0) {
            inputTransformation = textFieldDecoratorModifier.filter;
        }
        if ((i & 16) != 0) {
            z = textFieldDecoratorModifier.enabled;
        }
        if ((i & 32) != 0) {
            z2 = textFieldDecoratorModifier.readOnly;
        }
        if ((i & 64) != 0) {
            keyboardOptions = textFieldDecoratorModifier.keyboardOptions;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            keyboardActionHandler = textFieldDecoratorModifier.keyboardActionHandler;
        }
        if ((i & Fields.RotationX) != 0) {
            z3 = textFieldDecoratorModifier.singleLine;
        }
        if ((i & Fields.RotationY) != 0) {
            mutableInteractionSource = textFieldDecoratorModifier.interactionSource;
        }
        if ((i & Fields.RotationZ) != 0) {
            z4 = textFieldDecoratorModifier.isPassword;
        }
        if ((i & Fields.CameraDistance) != 0) {
            jb0Var = textFieldDecoratorModifier.stylusHandwritingTrigger;
        }
        boolean z5 = z4;
        jb0 jb0Var2 = jb0Var;
        boolean z6 = z3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        boolean z7 = z;
        boolean z8 = z2;
        return textFieldDecoratorModifier.copy(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z7, z8, keyboardOptions2, keyboardActionHandler2, z6, mutableInteractionSource2, z5, jb0Var2);
    }

    public final TextFieldDecoratorModifier copy(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, jb0 jb0Var) {
        return new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z, z2, keyboardOptions, keyboardActionHandler, z3, mutableInteractionSource, z4, jb0Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return q10.b(this.textFieldState, textFieldDecoratorModifier.textFieldState) && q10.b(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && q10.b(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && q10.b(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && q10.b(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && q10.b(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && q10.b(this.interactionSource, textFieldDecoratorModifier.interactionSource) && this.isPassword == textFieldDecoratorModifier.isPassword && q10.b(this.stylusHandwritingTrigger, textFieldDecoratorModifier.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = (this.textFieldSelectionState.hashCode() + ((this.textLayoutState.hashCode() + (this.textFieldState.hashCode() * 31)) * 31)) * 31;
        InputTransformation inputTransformation = this.filter;
        int hashCode2 = (this.keyboardOptions.hashCode() + kp0.c(kp0.c((hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31, 31, this.enabled), 31, this.readOnly)) * 31;
        KeyboardActionHandler keyboardActionHandler = this.keyboardActionHandler;
        int c = kp0.c((this.interactionSource.hashCode() + kp0.c((hashCode2 + (keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode())) * 31, 31, this.singleLine)) * 31, 31, this.isPassword);
        jb0 jb0Var = this.stylusHandwritingTrigger;
        return c + (jb0Var != null ? jb0Var.hashCode() : 0);
    }

    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ", isPassword=" + this.isPassword + ", stylusHandwritingTrigger=" + this.stylusHandwritingTrigger + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
