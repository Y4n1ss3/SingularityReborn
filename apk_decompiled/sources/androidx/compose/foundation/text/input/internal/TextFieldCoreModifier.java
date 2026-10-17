package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;
    private final Brush cursorBrush;
    private final boolean isDragHovered;
    private final boolean isFocused;
    private final Orientation orientation;
    private final PlatformSelectionBehaviors platformSelectionBehaviors;
    private final ScrollState scrollState;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final ToolbarRequester toolbarRequester;
    private final boolean writeable;

    public TextFieldCoreModifier(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequester;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    private final boolean component1() {
        return this.isFocused;
    }

    private final ToolbarRequester component10() {
        return this.toolbarRequester;
    }

    private final PlatformSelectionBehaviors component11() {
        return this.platformSelectionBehaviors;
    }

    private final boolean component2() {
        return this.isDragHovered;
    }

    private final TextLayoutState component3() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component4() {
        return this.textFieldState;
    }

    private final TextFieldSelectionState component5() {
        return this.textFieldSelectionState;
    }

    private final Brush component6() {
        return this.cursorBrush;
    }

    private final boolean component7() {
        return this.writeable;
    }

    private final ScrollState component8() {
        return this.scrollState;
    }

    private final Orientation component9() {
        return this.orientation;
    }

    public static /* synthetic */ TextFieldCoreModifier copy$default(TextFieldCoreModifier textFieldCoreModifier, boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors, int i, Object obj) {
        if ((i & 1) != 0) {
            z = textFieldCoreModifier.isFocused;
        }
        if ((i & 2) != 0) {
            z2 = textFieldCoreModifier.isDragHovered;
        }
        if ((i & 4) != 0) {
            textLayoutState = textFieldCoreModifier.textLayoutState;
        }
        if ((i & 8) != 0) {
            transformedTextFieldState = textFieldCoreModifier.textFieldState;
        }
        if ((i & 16) != 0) {
            textFieldSelectionState = textFieldCoreModifier.textFieldSelectionState;
        }
        if ((i & 32) != 0) {
            brush = textFieldCoreModifier.cursorBrush;
        }
        if ((i & 64) != 0) {
            z3 = textFieldCoreModifier.writeable;
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            scrollState = textFieldCoreModifier.scrollState;
        }
        if ((i & Fields.RotationX) != 0) {
            orientation = textFieldCoreModifier.orientation;
        }
        if ((i & Fields.RotationY) != 0) {
            toolbarRequester = textFieldCoreModifier.toolbarRequester;
        }
        if ((i & Fields.RotationZ) != 0) {
            platformSelectionBehaviors = textFieldCoreModifier.platformSelectionBehaviors;
        }
        ToolbarRequester toolbarRequester2 = toolbarRequester;
        PlatformSelectionBehaviors platformSelectionBehaviors2 = platformSelectionBehaviors;
        ScrollState scrollState2 = scrollState;
        Orientation orientation2 = orientation;
        Brush brush2 = brush;
        boolean z4 = z3;
        TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
        TextLayoutState textLayoutState2 = textLayoutState;
        return textFieldCoreModifier.copy(z, z2, textLayoutState2, transformedTextFieldState, textFieldSelectionState2, brush2, z4, scrollState2, orientation2, toolbarRequester2, platformSelectionBehaviors2);
    }

    public final TextFieldCoreModifier copy(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        return new TextFieldCoreModifier(z, z2, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z3, scrollState, orientation, toolbarRequester, platformSelectionBehaviors);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation, this.toolbarRequester, this.platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && q10.b(this.textLayoutState, textFieldCoreModifier.textLayoutState) && q10.b(this.textFieldState, textFieldCoreModifier.textFieldState) && q10.b(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && q10.b(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && q10.b(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation && q10.b(this.toolbarRequester, textFieldCoreModifier.toolbarRequester) && q10.b(this.platformSelectionBehaviors, textFieldCoreModifier.platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = (this.toolbarRequester.hashCode() + ((this.orientation.hashCode() + ((this.scrollState.hashCode() + kp0.c((this.cursorBrush.hashCode() + ((this.textFieldSelectionState.hashCode() + ((this.textFieldState.hashCode() + ((this.textLayoutState.hashCode() + kp0.c(Boolean.hashCode(this.isFocused) * 31, 31, this.isDragHovered)) * 31)) * 31)) * 31)) * 31, 31, this.writeable)) * 31)) * 31)) * 31;
        PlatformSelectionBehaviors platformSelectionBehaviors = this.platformSelectionBehaviors;
        return hashCode + (platformSelectionBehaviors == null ? 0 : platformSelectionBehaviors.hashCode());
    }

    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ", toolbarRequester=" + this.toolbarRequester + ", platformSelectionBehaviors=" + this.platformSelectionBehaviors + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.updateNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation, this.toolbarRequester, this.platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
