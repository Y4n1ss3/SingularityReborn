package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;
import defpackage.kp0;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m7058getMinimpl(j);
        this.selectionEnd = TextRange.m7057getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m7058getMinimpl = TextRange.m7058getMinimpl(j);
        int m7057getMaximpl = TextRange.m7057getMaximpl(j);
        if (m7058getMinimpl < 0 || m7058getMinimpl > annotatedString.length()) {
            o.i(kp0.f(m7058getMinimpl, "start (", ") offset is outside of text region "), annotatedString.length());
            throw null;
        }
        if (m7057getMaximpl < 0 || m7057getMaximpl > annotatedString.length()) {
            o.i(kp0.f(m7057getMaximpl, "end (", ") offset is outside of text region "), annotatedString.length());
            throw null;
        }
        if (m7058getMinimpl <= m7057getMaximpl) {
            return;
        }
        o.d(" > ", m7058getMinimpl, m7057getMaximpl, "Do not set reversed range: ");
        throw null;
    }

    private final void setSelectionEnd(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i);
        }
        this.selectionEnd = i;
    }

    private final void setSelectionStart(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i);
        }
        this.selectionStart = i;
    }

    public final void cancelComposition$ui_text() {
        replace$ui_text(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text(int i, int i2) {
        long TextRange = TextRangeKt.TextRange(i, i2);
        this.gapBuffer.replace(i, i2, "");
        long m7224updateRangeAfterDeletepWDy79M = EditingBufferKt.m7224updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m7058getMinimpl(m7224updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m7057getMaximpl(m7224updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long m7224updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m7224updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m7054getCollapsedimpl(m7224updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = TextRange.m7058getMinimpl(m7224updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m7057getMaximpl(m7224updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text(int i) {
        return this.gapBuffer.get(i);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final TextRange m7222getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return TextRange.m7048boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getLength$ui_text() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m7223getSelectiond9O1mEE$ui_text() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text(int i, int i2, String str) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            o.i(kp0.f(i, "start (", ") offset is outside of text region "), this.gapBuffer.getLength());
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            o.i(kp0.f(i2, "end (", ") offset is outside of text region "), this.gapBuffer.getLength());
            return;
        }
        if (i > i2) {
            o.d(" > ", i, i2, "Do not set reversed range: ");
            return;
        }
        this.gapBuffer.replace(i, i2, str);
        setSelectionStart(str.length() + i);
        setSelectionEnd(str.length() + i);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void setComposition$ui_text(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            o.i(kp0.f(i, "start (", ") offset is outside of text region "), this.gapBuffer.getLength());
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            o.i(kp0.f(i2, "end (", ") offset is outside of text region "), this.gapBuffer.getLength());
        } else if (i >= i2) {
            o.d(" > ", i, i2, "Do not set reversed or empty range: ");
        } else {
            this.compositionStart = i;
            this.compositionEnd = i2;
        }
    }

    public final void setCursor$ui_text(int i) {
        setSelection$ui_text(i, i);
    }

    public final void setSelection$ui_text(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            o.i(kp0.f(i, "start (", ") offset is outside of text region "), this.gapBuffer.getLength());
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            o.i(kp0.f(i2, "end (", ") offset is outside of text region "), this.gapBuffer.getLength());
        } else if (i > i2) {
            o.d(" > ", i, i2, "Do not set reversed range: ");
        } else {
            setSelectionStart(i);
            setSelectionEnd(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString toAnnotatedString$ui_text() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void replace$ui_text(int i, int i2, AnnotatedString annotatedString) {
        replace$ui_text(i, i2, annotatedString.getText());
    }

    public /* synthetic */ EditingBuffer(String str, long j, dq dqVar) {
        this(str, j);
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, dq dqVar) {
        this(annotatedString, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, (dq) (0 == true ? 1 : 0));
    }
}
