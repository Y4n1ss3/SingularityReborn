package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.dq;
import defpackage.fc;
import defpackage.ky;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString;
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, ky kyVar, int i, Object obj2) {
        if (obj2 != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: apply");
            return null;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation().length() > 0) {
            kyVar.invoke(obj);
        }
        obj.getClass();
        return (BaseTextPreparedSelection) obj;
    }

    private final int charOffset(int i) {
        int length = getText$foundation().length() - 1;
        return i > length ? length : i;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
            return 0;
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
            return 0;
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.originalText.length()) {
            long m7032getWordBoundaryjx7JFs = textLayoutResult.m7032getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs) > i) {
                return this.offsetMapping.transformedToOriginal(TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs));
            }
            i++;
        }
        return this.originalText.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
            return 0;
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long m7032getWordBoundaryjx7JFs = textLayoutResult.m7032getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs) < i) {
                return this.offsetMapping.transformedToOriginal(TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs));
            }
            i--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
            return 0;
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i);
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(transformedEndOffset()) : null) != ResolvedTextDirection.Rtl;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1.0f;
        Float cachedX = this.state.getCachedX();
        cachedX.getClass();
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m7030getOffsetForPositionk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(cachedX.floatValue()) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L))));
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        if (fc.a(this) > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        if (fc.a(this) > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        if (fc.a(this) > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        if (fc.a(this) > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m7055getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m7057getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m7058getMinimpl(this.selection));
    }

    public final <U> T apply(U u, boolean z, ky kyVar) {
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation().length() > 0) {
            kyVar.invoke(u);
        }
        u.getClass();
        return (T) u;
    }

    public final T collapseLeftOr(ky kyVar) {
        if (fc.a(this) > 0) {
            if (TextRange.m7054getCollapsedimpl(this.selection)) {
                kyVar.invoke(this);
            } else {
                boolean isLtr = isLtr();
                long j = this.selection;
                if (isLtr) {
                    setCursor(TextRange.m7058getMinimpl(j));
                } else {
                    setCursor(TextRange.m7057getMaximpl(j));
                }
            }
        }
        return this;
    }

    public final T collapseRightOr(ky kyVar) {
        if (fc.a(this) > 0) {
            if (TextRange.m7054getCollapsedimpl(this.selection)) {
                kyVar.invoke(this);
            } else {
                boolean isLtr = isLtr();
                long j = this.selection;
                if (isLtr) {
                    setCursor(TextRange.m7057getMaximpl(j));
                } else {
                    setCursor(TextRange.m7058getMinimpl(j));
                }
            }
        }
        return this;
    }

    public final T deselect() {
        if (fc.a(this) > 0) {
            setCursor(TextRange.m7055getEndimpl(this.selection));
        }
        return this;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m7055getEndimpl(this.selection));
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1479getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m7055getEndimpl(this.selection));
    }

    public final int getPrecedingCodePointOrEmojiStartIndex() {
        return StringHelpers_androidKt.findCodePointOrEmojiStartBefore(this.annotatedString.getText(), TextRange.m7055getEndimpl(this.selection), -1);
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1480getSelectiond9O1mEE() {
        return this.selection;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    public final String getText$foundation() {
        return this.annotatedString.getText();
    }

    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    public final T moveCursorLeft() {
        if (fc.a(this) > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    public final T moveCursorLeftByWord() {
        if (fc.a(this) > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    public final T moveCursorNextByParagraph() {
        if (fc.a(this) > 0) {
            int findParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation(), TextRange.m7057getMaximpl(this.selection));
            if (findParagraphEnd == TextRange.m7057getMaximpl(this.selection) && findParagraphEnd != getText$foundation().length()) {
                findParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation(), findParagraphEnd + 1);
            }
            setCursor(findParagraphEnd);
        }
        return this;
    }

    public final T moveCursorPrevByParagraph() {
        if (fc.a(this) > 0) {
            int findParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation(), TextRange.m7058getMinimpl(this.selection));
            if (findParagraphStart == TextRange.m7058getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation(), findParagraphStart - 1);
            }
            setCursor(findParagraphStart);
        }
        return this;
    }

    public final T moveCursorRight() {
        if (fc.a(this) > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    public final T moveCursorRightByWord() {
        if (fc.a(this) > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    public final T moveCursorToEnd() {
        if (fc.a(this) > 0) {
            setCursor(getText$foundation().length());
        }
        return this;
    }

    public final T moveCursorToHome() {
        if (fc.a(this) > 0) {
            setCursor(0);
        }
        return this;
    }

    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        if (fc.a(this) > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        return this;
    }

    public final T moveCursorToLineLeftSide() {
        if (fc.a(this) > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    public final T moveCursorToLineRightSide() {
        if (fc.a(this) > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        if (fc.a(this) > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        return this;
    }

    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    public final T selectAll() {
        if (fc.a(this) > 0) {
            setSelection(0, getText$foundation().length());
        }
        return this;
    }

    public final T selectMovement() {
        if (getText$foundation().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m7060getStartimpl(this.originalSelection), TextRange.m7055getEndimpl(this.selection));
        }
        return this;
    }

    public final void setAnnotatedString(AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int i) {
        setSelection(i, i);
    }

    public final void setSelection(int i, int i2) {
        this.selection = TextRangeKt.TextRange(i, i2);
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1481setSelection5zctL8(long j) {
        this.selection = j;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, dq dqVar) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }
}
