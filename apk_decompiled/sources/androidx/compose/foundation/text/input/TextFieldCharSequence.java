package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dq;
import defpackage.ks0;
import defpackage.q10;
import defpackage.xe0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private final TextRange composition;
    private final xe0 highlight;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> outputAnnotations;
    private final long selection;
    private final CharSequence text;

    private TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, xe0 xe0Var, List<AnnotatedString.Range<AnnotatedString.Annotation>> list, List<AnnotatedString.Range<AnnotatedString.Annotation>> list2) {
        this.composingAnnotations = list;
        this.outputAnnotations = list2;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m7066coerceIn8ffj60Q(j, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m7048boximpl(TextRangeKt.m7066coerceIn8ffj60Q(textRange.m7064unboximpl(), 0, charSequence.length())) : null;
        this.highlight = xe0Var != null ? new xe0(xe0Var.d, TextRange.m7048boximpl(TextRangeKt.m7066coerceIn8ffj60Q(((TextRange) xe0Var.e).m7064unboximpl(), 0, charSequence.length()))) : null;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return ks0.Y(this.text, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m7053equalsimpl0(this.selection, textFieldCharSequence.selection) && q10.b(this.composition, textFieldCharSequence.composition) && q10.b(this.highlight, textFieldCharSequence.highlight) && q10.b(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && contentEquals(textFieldCharSequence.text);
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1238getCompositionMzsxiRA() {
        return this.composition;
    }

    public final xe0 getHighlight() {
        return this.highlight;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getOutputAnnotations() {
        return this.outputAnnotations;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1239getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        int m7061hashCodeimpl = (TextRange.m7061hashCodeimpl(this.selection) + (this.text.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        int m7061hashCodeimpl2 = (m7061hashCodeimpl + (textRange != null ? TextRange.m7061hashCodeimpl(textRange.m7064unboximpl()) : 0)) * 31;
        xe0 xe0Var = this.highlight;
        int hashCode = (m7061hashCodeimpl2 + (xe0Var != null ? xe0Var.hashCode() : 0)) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list = this.composingAnnotations;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.text.subSequence(i, i2);
    }

    public final void toCharArray(char[] cArr, int i, int i2, int i3) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, xe0 xe0Var, List list, List list2, dq dqVar) {
        this(charSequence, j, textRange, xe0Var, list, list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, xe0 xe0Var, List list, List list2, int i, dq dqVar) {
        this(r0, r1, r3, r5, r6, (i & 32) == 0 ? list2 : null, null);
        CharSequence charSequence2 = (i & 1) != 0 ? "" : charSequence;
        long m7065getZerod9O1mEE = (i & 2) != 0 ? TextRange.Companion.m7065getZerod9O1mEE() : j;
        TextRange textRange2 = (i & 4) != 0 ? null : textRange;
        xe0 xe0Var2 = (i & 8) != 0 ? null : xe0Var;
        List list3 = (i & 16) != 0 ? null : list;
    }
}
