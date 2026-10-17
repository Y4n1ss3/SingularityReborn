package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dq;
import defpackage.fo0;
import defpackage.ll0;
import defpackage.q10;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new ll0(26), new fo0(29));
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    private TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m7066coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m7048boximpl(TextRangeKt.m7066coerceIn8ffj60Q(textRange.m7064unboximpl(), 0, getText().length())) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Saver$lambda$0(SaverScope saverScope, TextFieldValue textFieldValue) {
        return y80.a(SaversKt.save(textFieldValue.annotatedString, SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m7048boximpl(textFieldValue.selection), SaversKt.getSaver(TextRange.Companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Saver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        TextRange textRange = null;
        AnnotatedString restore = ((!q10.b(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
        restore.getClass();
        Object obj3 = list.get(1);
        Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
        if ((!q10.b(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textRange = saver.restore(obj3);
        }
        textRange.getClass();
        return new TextFieldValue(restore, textRange.m7064unboximpl(), (TextRange) null, 4, (dq) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m7305copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m7307copy3r_uNRQ(annotatedString, j, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m7308copy3r_uNRQ(String str, long j, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m7053equalsimpl0(this.selection, textFieldValue.selection) && q10.b(this.composition, textFieldValue.composition) && q10.b(this.annotatedString, textFieldValue.annotatedString);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m7309getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m7310getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int m7061hashCodeimpl = (TextRange.m7061hashCodeimpl(this.selection) + (this.annotatedString.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        return m7061hashCodeimpl + (textRange != null ? TextRange.m7061hashCodeimpl(textRange.m7064unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m7063toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m7307copy3r_uNRQ(AnnotatedString annotatedString, long j, TextRange textRange) {
        return new TextFieldValue(annotatedString, j, textRange, (dq) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m7306copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m7308copy3r_uNRQ(str, j, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, dq dqVar) {
        this(str, j, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, dq dqVar) {
        this(annotatedString, j, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, int i, dq dqVar) {
        this(annotatedString, (i & 2) != 0 ? TextRange.Companion.m7065getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (dq) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, dq dqVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Companion.m7065getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (dq) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (dq) null);
    }
}
