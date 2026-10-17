package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import defpackage.ds0;
import defpackage.k10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            i2 = DateVisualTransformation.this.firstDelimiterOffset;
            if (i < i2) {
                return i;
            }
            i3 = DateVisualTransformation.this.secondDelimiterOffset;
            if (i < i3) {
                return i + 1;
            }
            i4 = DateVisualTransformation.this.dateFormatLength;
            if (i <= i4) {
                return i + 2;
            }
            i5 = DateVisualTransformation.this.dateFormatLength;
            return i5 + 2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            i2 = DateVisualTransformation.this.firstDelimiterOffset;
            if (i <= i2 - 1) {
                return i;
            }
            i3 = DateVisualTransformation.this.secondDelimiterOffset;
            if (i <= i3 - 1) {
                return i - 1;
            }
            i4 = DateVisualTransformation.this.dateFormatLength;
            if (i <= i4 + 1) {
                return i - 2;
            }
            i5 = DateVisualTransformation.this.dateFormatLength;
            return i5;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = ds0.l0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, 6);
        this.secondDelimiterOffset = ds0.p0(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter());
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        String text;
        int i = 0;
        if (annotatedString.getText().length() > this.dateFormatLength) {
            String text2 = annotatedString.getText();
            k10 W = y80.W(0, this.dateFormatLength);
            text2.getClass();
            W.getClass();
            text = text2.substring(W.d, W.e + 1);
        } else {
            text = annotatedString.getText();
        }
        String str = "";
        int i2 = 0;
        while (i < text.length()) {
            int i3 = i2 + 1;
            str = str + text.charAt(i);
            if (i3 == this.firstDelimiterOffset || i2 + 2 == this.secondDelimiterOffset) {
                str = str + this.dateInputFormat.getDelimiter();
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(new AnnotatedString(str, null, 2, null), this.dateOffsetTranslator);
    }
}
