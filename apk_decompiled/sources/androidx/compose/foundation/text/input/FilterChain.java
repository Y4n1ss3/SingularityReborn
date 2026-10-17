package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FilterChain implements InputTransformation {
    private final InputTransformation first;
    private final InputTransformation second;

    public FilterChain(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        this.first = inputTransformation;
        this.second = inputTransformation2;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.first.applySemantics(semanticsPropertyReceiver);
        this.second.applySemantics(semanticsPropertyReceiver);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        return q10.b(this.first, filterChain.first) && q10.b(this.second, filterChain.second) && q10.b(getKeyboardOptions(), filterChain.getKeyboardOptions());
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public KeyboardOptions getKeyboardOptions() {
        KeyboardOptions fillUnspecifiedValuesWith$foundation;
        KeyboardOptions keyboardOptions = this.second.getKeyboardOptions();
        return (keyboardOptions == null || (fillUnspecifiedValuesWith$foundation = keyboardOptions.fillUnspecifiedValuesWith$foundation(this.first.getKeyboardOptions())) == null) ? this.first.getKeyboardOptions() : fillUnspecifiedValuesWith$foundation;
    }

    public int hashCode() {
        int hashCode = (this.second.hashCode() + (this.first.hashCode() * 31)) * 32;
        KeyboardOptions keyboardOptions = getKeyboardOptions();
        return hashCode + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }

    public String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        this.first.transformInput(textFieldBuffer);
        this.second.transformInput(textFieldBuffer);
    }
}
