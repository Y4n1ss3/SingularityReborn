package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformedText {
    public static final int $stable = 8;
    private final OffsetMapping offsetMapping;
    private final AnnotatedString text;

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping) {
        this.text = annotatedString;
        this.offsetMapping = offsetMapping;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        return q10.b(this.text, transformedText.text) && q10.b(this.offsetMapping, transformedText.offsetMapping);
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
