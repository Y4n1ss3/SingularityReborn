package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dq;
import defpackage.j50;
import defpackage.kp0;
import defpackage.o;
import defpackage.xe0;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;
    private ChangeTracker backingChangeTracker;
    private final PartialGapBuffer buffer;
    private boolean canCallAddStyle;
    private MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private TextRange composition;
    private xe0 highlight;
    private final OffsetMappingCalculator offsetMappingCalculator;
    private final TextFieldCharSequence originalValue;
    private List<AnnotatedString.Range<AnnotatedString.Annotation>> outputTransformationAnnotations;
    private long selectionInChars;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo1235getOriginalRangejx7JFs(int i);

        /* renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo1236getRangejx7JFs(int i);
    }

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = null;
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.m1239getSelectiond9O1mEE();
        this.composition = textFieldCharSequence.m1238getCompositionMzsxiRA();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations != null && !composingAnnotations.isEmpty()) {
            int size = textFieldCharSequence.getComposingAnnotations().size();
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i = 0; i < size; i++) {
                rangeArr[i] = composingAnnotations$lambda$0(textFieldCharSequence, i);
            }
            mutableVector = new MutableVector<>(rangeArr, size);
        }
        this.composingAnnotations = mutableVector;
        this.canCallAddStyle = this.offsetMappingCalculator != null;
    }

    private final void clearChangeList() {
        getChangeTracker$foundation().clearChanges();
    }

    private static final AnnotatedString.Range composingAnnotations$lambda$0(TextFieldCharSequence textFieldCharSequence, int i) {
        return textFieldCharSequence.getComposingAnnotations().get(i);
    }

    private final void onTextWillChange(int i, int i2, int i3) {
        getChangeTracker$foundation().trackChange(i, i2, i3);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(i, i2, i3);
        }
        this.selectionInChars = TextFieldBufferKt.m1237adjustTextRangevJH6DeI(m1231getSelectiond9O1mEE(), i, i2, i3);
    }

    public static /* synthetic */ void replace$foundation$default(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        textFieldBuffer.replace$foundation(i, i2, charSequence, i6, i4);
    }

    private final void requireValidIndex(int i, boolean z, boolean z2) {
        boolean z3 = false;
        int i2 = z ? 0 : -1;
        int length = getLength();
        if (!z2) {
            length++;
        }
        if (i2 <= i && i < length) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        StringBuilder j = j50.j("Expected ", i, " to be in [", i2, ", ");
        j.append(length);
        j.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(j.toString());
    }

    /* renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m1226requireValidRange5zctL8(long j) {
        long TextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m7050contains5zctL8(TextRange, j)) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + ((Object) TextRange.m7063toStringimpl(j)) + " to be in " + ((Object) TextRange.m7063toStringimpl(TextRange)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setComposition$foundation$default(TextFieldBuffer textFieldBuffer, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.setComposition$foundation(i, i2, list);
    }

    /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
    private final void m1227setCompositionOEnZFl4(TextRange textRange) {
        if (textRange != null && !TextRange.m7054getCollapsedimpl(textRange.m7064unboximpl())) {
            this.composition = textRange;
            return;
        }
        this.composition = null;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
    }

    /* renamed from: toTextFieldCharSequence-wFTz33Y$foundation$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1228toTextFieldCharSequencewFTz33Y$foundation$default(TextFieldBuffer textFieldBuffer, long j, TextRange textRange, List list, List list2, int i, Object obj) {
        List<AnnotatedString.Range<AnnotatedString.Annotation>> asMutableList;
        if ((i & 1) != 0) {
            j = textFieldBuffer.m1231getSelectiond9O1mEE();
        }
        long j2 = j;
        if ((i & 2) != 0) {
            textRange = textFieldBuffer.composition;
        }
        TextRange textRange2 = textRange;
        if ((i & 4) != 0) {
            MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = textFieldBuffer.composingAnnotations;
            list = (mutableVector == null || (asMutableList = mutableVector.asMutableList()) == null || asMutableList.isEmpty()) ? null : asMutableList;
        }
        return textFieldBuffer.m1234toTextFieldCharSequencewFTz33Y$foundation(j2, textRange2, list, (i & 8) != 0 ? null : list2);
    }

    public final void addAnnotation$foundation(AnnotatedString.Annotation annotation, int i, int i2) {
        if (!this.canCallAddStyle) {
            InlineClassHelperKt.throwIllegalStateException("You can add styling to a [TextFieldBuffer] only from an [OutputTransformation].");
        }
        List list = this.outputTransformationAnnotations;
        if (list == null) {
            list = new ArrayList();
            this.outputTransformationAnnotations = list;
        }
        if (list != null) {
            list.add(new AnnotatedString.Range(annotation, i, i2));
        }
    }

    public final void addStyle(SpanStyle spanStyle, int i, int i2) {
        addAnnotation$foundation(spanStyle, i, i2);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i2 - i);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence.subSequence(i, i2), 0, 0, 24, null);
        }
        return this;
    }

    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int i) {
        return this.buffer.charAt(i);
    }

    public final void clearHighlight$foundation() {
        this.highlight = null;
    }

    public final void commitComposition$foundation() {
        m1227setCompositionOEnZFl4(null);
    }

    public final boolean getCanCallAddStyle$foundation() {
        return this.canCallAddStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChangeTracker getChangeTracker$foundation() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    public final ChangeList getChanges() {
        return getChangeTracker$foundation();
    }

    public final MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations$foundation() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA$foundation, reason: not valid java name */
    public final TextRange m1229getCompositionMzsxiRA$foundation() {
        return this.composition;
    }

    public final xe0 getHighlight$foundation() {
        return this.highlight;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1230getOriginalSelectiond9O1mEE() {
        return this.originalValue.m1239getSelectiond9O1mEE();
    }

    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    public final TextFieldCharSequence getOriginalValue$foundation() {
        return this.originalValue;
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getOutputTransformationAnnotations$foundation() {
        return this.outputTransformationAnnotations;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1231getSelectiond9O1mEE() {
        return this.selectionInChars;
    }

    public final boolean hasComposition$foundation() {
        return this.composition != null;
    }

    public final boolean hasSelection() {
        return !TextRange.m7054getCollapsedimpl(m1231getSelectiond9O1mEE());
    }

    public final void placeCursorAfterCharAt(int i) {
        requireValidIndex(i, false, true);
        int i2 = i + 1;
        int length = getLength();
        if (i2 > length) {
            i2 = length;
        }
        this.selectionInChars = TextRangeKt.TextRange(i2);
    }

    public final void placeCursorBeforeCharAt(int i) {
        requireValidIndex(i, true, false);
        this.selectionInChars = TextRangeKt.TextRange(i);
    }

    public final void replace(int i, int i2, CharSequence charSequence) {
        replace$foundation(i, i2, charSequence, 0, charSequence.length());
    }

    public final void replace$foundation(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!(i <= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + i + " <= end=" + i2);
        }
        if (!(i3 <= i4)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=" + i3 + " <= textEnd=" + i4);
        }
        onTextWillChange(i, i2, i4 - i3);
        this.buffer.replace(i, i2, charSequence, i3, i4);
        commitComposition$foundation();
        clearHighlight$foundation();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m1233setSelection5zctL8(this.originalValue.m1239getSelectiond9O1mEE());
        clearChangeList();
    }

    public final void setCanCallAddStyle$foundation(boolean z) {
        this.canCallAddStyle = z;
    }

    public final void setComposition$foundation(int i, int i2, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        if (i < 0 || i > this.buffer.length()) {
            o.i(kp0.f(i, "start (", ") offset is outside of text region "), this.buffer.length());
            return;
        }
        if (i2 < 0 || i2 > this.buffer.length()) {
            o.i(kp0.f(i2, "end (", ") offset is outside of text region "), this.buffer.length());
            return;
        }
        if (i >= i2) {
            o.d(" > ", i, i2, "Do not set reversed or empty range: ");
            return;
        }
        m1227setCompositionOEnZFl4(TextRange.m7048boximpl(TextRangeKt.TextRange(i, i2)));
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector<>(new AnnotatedString.Range[16], 0);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<AnnotatedString.Annotation> range = list.get(i3);
            MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.add(AnnotatedString.Range.copy$default(range, null, range.getStart() + i, range.getEnd() + i, null, 9, null));
            }
        }
    }

    /* renamed from: setHighlight-K7f2yys$foundation, reason: not valid java name */
    public final void m1232setHighlightK7f2yys$foundation(int i, int i2, int i3) {
        if (i2 >= i3) {
            o.d(" > ", i2, i3, "Do not set reversed or empty range: ");
            return;
        }
        this.highlight = new xe0(TextHighlightType.m1245boximpl(i), TextRange.m7048boximpl(TextRangeKt.TextRange(y80.h(i2, 0, getLength()), y80.h(i3, 0, getLength()))));
    }

    public final void setOutputTransformationAnnotations$foundation(List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        this.outputTransformationAnnotations = list;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1233setSelection5zctL8(long j) {
        m1226requireValidRange5zctL8(j);
        this.selectionInChars = j;
        this.highlight = null;
    }

    public final void setTextIfChanged$foundation(CharSequence charSequence) {
        int i;
        int i2;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z = false;
        if (partialGapBuffer.length() <= 0 || charSequence.length() <= 0) {
            i = 0;
            i2 = 0;
        } else {
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (partialGapBuffer.charAt(i3) == charSequence.charAt(i4)) {
                        i3++;
                        i4++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    if (partialGapBuffer.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z2 = true;
                    }
                }
                if (i3 >= length || i4 >= length2 || (z && z2)) {
                    break;
                }
            }
            i = i3;
            i2 = i4;
        }
        int i5 = length;
        int i6 = length2;
        if (i < i5 || i2 < i6) {
            replace$foundation(i, i5, charSequence, i2, i6);
        }
    }

    public String toString() {
        return this.buffer.toString();
    }

    /* renamed from: toTextFieldCharSequence-wFTz33Y$foundation, reason: not valid java name */
    public final TextFieldCharSequence m1234toTextFieldCharSequencewFTz33Y$foundation(long j, TextRange textRange, List<AnnotatedString.Range<AnnotatedString.Annotation>> list, List<AnnotatedString.Range<AnnotatedString.Annotation>> list2) {
        return new TextFieldCharSequence(this.buffer.toString(), j, textRange, null, list, list2, 8, null);
    }

    public final void addStyle(ParagraphStyle paragraphStyle, int i, int i2) {
        addAnnotation$foundation(paragraphStyle, i, i2);
    }

    public static /* synthetic */ void getChanges$annotations() {
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i, dq dqVar) {
        this(textFieldCharSequence, (i & 2) != 0 ? null : changeTracker, (i & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i & 8) != 0 ? null : offsetMappingCalculator);
    }
}
