package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.compose.ui.text.TextRange;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextClassificationResult {
    private final long selection;
    private final CharSequence text;
    private final TextClassification textClassification;

    private TextClassificationResult(CharSequence charSequence, long j, TextClassification textClassification) {
        this.text = charSequence;
        this.selection = j;
        this.textClassification = textClassification;
    }

    /* renamed from: copy-Sb-Bc2M$default, reason: not valid java name */
    public static /* synthetic */ TextClassificationResult m1544copySbBc2M$default(TextClassificationResult textClassificationResult, CharSequence charSequence, long j, TextClassification textClassification, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = textClassificationResult.text;
        }
        if ((i & 2) != 0) {
            j = textClassificationResult.selection;
        }
        if ((i & 4) != 0) {
            textClassification = textClassificationResult.textClassification;
        }
        return textClassificationResult.m1546copySbBc2M(charSequence, j, textClassification);
    }

    public final CharSequence component1() {
        return this.text;
    }

    /* renamed from: component2-d9O1mEE, reason: not valid java name */
    public final long m1545component2d9O1mEE() {
        return this.selection;
    }

    public final TextClassification component3() {
        return this.textClassification;
    }

    /* renamed from: copy-Sb-Bc2M, reason: not valid java name */
    public final TextClassificationResult m1546copySbBc2M(CharSequence charSequence, long j, TextClassification textClassification) {
        return new TextClassificationResult(charSequence, j, textClassification, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextClassificationResult)) {
            return false;
        }
        TextClassificationResult textClassificationResult = (TextClassificationResult) obj;
        return q10.b(this.text, textClassificationResult.text) && TextRange.m7053equalsimpl0(this.selection, textClassificationResult.selection) && q10.b(this.textClassification, textClassificationResult.textClassification);
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1547getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public int hashCode() {
        return this.textClassification.hashCode() + ((TextRange.m7061hashCodeimpl(this.selection) + (this.text.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.text) + ", selection=" + ((Object) TextRange.m7063toStringimpl(this.selection)) + ", textClassification=" + this.textClassification + ')';
    }

    public /* synthetic */ TextClassificationResult(CharSequence charSequence, long j, TextClassification textClassification, dq dqVar) {
        this(charSequence, j, textClassification);
    }
}
