package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CodepointTransformationKt {
    public static final CodepointTransformation mask(CodepointTransformation.Companion companion, char c) {
        return new MaskCodepointTransformation(c);
    }

    public static final CharSequence toVisualText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < textFieldCharSequence.length()) {
            int codePointAt = CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i);
            int transform = codepointTransformation.transform(i2, codePointAt);
            int charCount = CodepointHelpers_jvmKt.charCount(codePointAt);
            if (transform != codePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + charCount, CodepointHelpers_jvmKt.charCount(transform));
                z = true;
            }
            StringHelpers_jvmKt.appendCodePointX(sb, transform);
            i += charCount;
            i2++;
        }
        return z ? sb.toString() : textFieldCharSequence;
    }
}
