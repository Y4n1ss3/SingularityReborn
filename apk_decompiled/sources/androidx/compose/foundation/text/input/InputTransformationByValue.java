package androidx.compose.foundation.text.input;

import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class InputTransformationByValue implements InputTransformation {
    private final my transformation;

    public InputTransformationByValue(my myVar) {
        this.transformation = myVar;
    }

    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, my myVar, int i, Object obj) {
        if ((i & 1) != 0) {
            myVar = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(myVar);
    }

    public final my component1() {
        return this.transformation;
    }

    public final InputTransformationByValue copy(my myVar) {
        return new InputTransformationByValue(myVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && q10.b(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    public final my getTransformation() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence m1228toTextFieldCharSequencewFTz33Y$foundation$default = TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, 0L, null, null, null, 15, null);
        CharSequence charSequence = (CharSequence) this.transformation.invoke(textFieldBuffer.getOriginalValue$foundation(), m1228toTextFieldCharSequencewFTz33Y$foundation$default);
        if (charSequence == m1228toTextFieldCharSequencewFTz33Y$foundation$default) {
            return;
        }
        if (charSequence == textFieldBuffer.getOriginalValue$foundation()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation(charSequence);
        }
    }
}
