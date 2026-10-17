package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MaxLengthFilter implements InputTransformation {
    private final int maxLength;

    public MaxLengthFilter(int i) {
        this.maxLength = i;
        if (i >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("maxLength must be at least zero");
    }

    private final int component1() {
        return this.maxLength;
    }

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = maxLengthFilter.maxLength;
        }
        return maxLengthFilter.copy(i);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, this.maxLength);
    }

    public final MaxLengthFilter copy(int i) {
        return new MaxLengthFilter(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxLengthFilter) && this.maxLength == ((MaxLengthFilter) obj).maxLength;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLength);
    }

    public String toString() {
        return fc.e(new StringBuilder("InputTransformation.maxLength("), this.maxLength, ')');
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getLength() > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
