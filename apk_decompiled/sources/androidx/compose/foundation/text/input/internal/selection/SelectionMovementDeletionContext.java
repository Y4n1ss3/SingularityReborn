package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.dq;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionMovementDeletionContext {
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    private WedgeAffinity wedgeAffinity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public SelectionMovementDeletionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z, float f, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z;
        this.visibleTextLayoutHeight = f;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.selection = visualText.m1239getSelectiond9O1mEE();
            this.text = visualText.getText().toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    private final SelectionMovementDeletionContext applyIfNotEmpty(boolean z, ky kyVar) {
        if (z) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            kyVar.invoke(this);
        }
        return this;
    }

    public static /* synthetic */ SelectionMovementDeletionContext applyIfNotEmpty$default(SelectionMovementDeletionContext selectionMovementDeletionContext, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            selectionMovementDeletionContext.textPreparedSelectionState.resetCachedX();
        }
        if (selectionMovementDeletionContext.text.length() > 0) {
            kyVar.invoke(selectionMovementDeletionContext);
        }
        return selectionMovementDeletionContext;
    }

    private final int charOffset(int i) {
        int length = this.text.length() - 1;
        return i > length ? length : i;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true);
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m7057getMaximpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m7058getMinimpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.initialValue.length()) {
            long m7032getWordBoundaryjx7JFs = textLayoutResult.m7032getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs) > i) {
                return TextRange.m7055getEndimpl(m7032getWordBoundaryjx7JFs);
            }
            i++;
        }
        return this.initialValue.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m7055getEndimpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long m7032getWordBoundaryjx7JFs = textLayoutResult.m7032getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs) < i) {
                return TextRange.m7060getStartimpl(m7032getWordBoundaryjx7JFs);
            }
            i--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m7055getEndimpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getPrevWordOffsetForLayout(textLayoutResult, i);
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m7055getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int m7055getEndimpl = TextRange.m7055getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(m7055getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m7055getEndimpl) + i;
        if (lineForOffset < 0) {
            return Integer.MIN_VALUE;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Integer.MAX_VALUE;
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1.0f;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m7030getOffsetForPositionk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(cachedX) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L)));
    }

    private final int jumpByPagesOffset(int i) {
        int m7055getEndimpl = TextRange.m7055getEndimpl(this.initialValue.m1239getSelectiond9O1mEE());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return m7055getEndimpl;
        }
        Rect translate = this.textLayoutResult.getCursorRect(m7055getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * i);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(translate.getTop()));
        float abs = Math.abs(translate.getTop() - lineBottom);
        float abs2 = Math.abs(translate.getBottom() - lineBottom);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return abs > abs2 ? textLayoutResult.m7030getOffsetForPositionk4lQ0M(translate.m4551getTopLeftF1C5BW0()) : textLayoutResult.m7030getOffsetForPositionk4lQ0M(translate.m4544getBottomLeftF1C5BW0());
    }

    private final SelectionMovementDeletionContext moveCursorTo(boolean z, iy iyVar) {
        if (z) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) iyVar.invoke()).intValue(), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public static /* synthetic */ SelectionMovementDeletionContext moveCursorTo$default(SelectionMovementDeletionContext selectionMovementDeletionContext, boolean z, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            selectionMovementDeletionContext.textPreparedSelectionState.resetCachedX();
        }
        if (selectionMovementDeletionContext.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(selectionMovementDeletionContext.m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) iyVar.invoke()).intValue(), m7055getEndimpl, selectionMovementDeletionContext.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(selectionMovementDeletionContext.m1386getSelectiond9O1mEE())) {
                selectionMovementDeletionContext.m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                selectionMovementDeletionContext.setWedgeAffinity(m1375component2impl);
            }
        }
        return selectionMovementDeletionContext;
    }

    public final SelectionMovementDeletionContext collapseLeftOr(ky kyVar) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m7054getCollapsedimpl(this.selection)) {
                kyVar.invoke(this);
                return this;
            }
            boolean isLtr = isLtr();
            long j = this.selection;
            if (isLtr) {
                this.selection = TextRangeKt.TextRange(TextRange.m7058getMinimpl(j));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m7057getMaximpl(j));
        }
        return this;
    }

    public final SelectionMovementDeletionContext collapseRightOr(ky kyVar) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m7054getCollapsedimpl(this.selection)) {
                kyVar.invoke(this);
                return this;
            }
            boolean isLtr = isLtr();
            long j = this.selection;
            if (isLtr) {
                this.selection = TextRangeKt.TextRange(TextRange.m7057getMaximpl(j));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m7058getMinimpl(j));
        }
        return this;
    }

    public final SelectionMovementDeletionContext deleteMovement() {
        if (this.text.length() > 0) {
            boolean m7054getCollapsedimpl = TextRange.m7054getCollapsedimpl(this.initialValue.m1239getSelectiond9O1mEE());
            TransformedTextFieldState transformedTextFieldState = this.state;
            if (m7054getCollapsedimpl) {
                TransformedTextFieldState.m1359replaceTextM8tDOmk$default(transformedTextFieldState, "", TextRangeKt.TextRange(TextRange.m7060getStartimpl(this.initialValue.m1239getSelectiond9O1mEE()), TextRange.m7055getEndimpl(this.selection)), null, !this.isFromSoftKeyboard, 4, null);
            } else {
                transformedTextFieldState.deleteSelectedText();
            }
            this.selection = this.state.getVisualText().m1239getSelectiond9O1mEE();
            this.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    public final SelectionMovementDeletionContext deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m7055getEndimpl(this.selection));
        }
        return this;
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m7055getEndimpl(this.selection));
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m7055getEndimpl(this.selection));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1386getSelectiond9O1mEE() {
        return this.selection;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final SelectionMovementDeletionContext moveCursorDownByLine() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        int jumpByLinesOffset = textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : Integer.MAX_VALUE;
        if (jumpByLinesOffset == Integer.MAX_VALUE) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            int length = this.text.length();
            if (jumpByLinesOffset > length) {
                jumpByLinesOffset = length;
            }
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByLinesOffset, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorDownByPage() {
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorLeftByChar() {
        return isLtr() ? moveCursorPrevByChar() : moveCursorNextByChar();
    }

    public final SelectionMovementDeletionContext moveCursorLeftByWord() {
        return isLtr() ? moveCursorPrevByWord() : moveCursorNextByWord();
    }

    public final SelectionMovementDeletionContext moveCursorNextByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m7055getEndimpl(this.selection)), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            int findParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m7057getMaximpl(this.selection));
            if (findParagraphEnd == TextRange.m7057getMaximpl(this.selection) && findParagraphEnd != this.text.length()) {
                findParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, findParagraphEnd + 1);
            }
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(findParagraphEnd, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m7055getEndimpl(this.selection)), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByCodePointOrEmoji() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findCodePointOrEmojiStartBefore(this.text, TextRange.m7055getEndimpl(this.selection), -1), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            int findParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m7058getMinimpl(this.selection));
            if (findParagraphStart == TextRange.m7058getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = StringHelpersKt.findParagraphStart(this.text, findParagraphStart - 1);
            }
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(findParagraphStart, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorRightByChar() {
        return isLtr() ? moveCursorNextByChar() : moveCursorPrevByChar();
    }

    public final SelectionMovementDeletionContext moveCursorRightByWord() {
        return isLtr() ? moveCursorNextByWord() : moveCursorPrevByWord();
    }

    public final SelectionMovementDeletionContext moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToLineLeftSide() {
        return isLtr() ? moveCursorToLineStart() : moveCursorToLineEnd();
    }

    public final SelectionMovementDeletionContext moveCursorToLineRightSide() {
        return isLtr() ? moveCursorToLineEnd() : moveCursorToLineStart();
    }

    public final SelectionMovementDeletionContext moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorUpByLine() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        int jumpByLinesOffset = textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : Integer.MIN_VALUE;
        if (jumpByLinesOffset == Integer.MIN_VALUE) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            if (jumpByLinesOffset < 0) {
                jumpByLinesOffset = 0;
            }
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByLinesOffset, m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorUpByPage() {
        if (this.text.length() > 0) {
            int m7055getEndimpl = TextRange.m7055getEndimpl(m1386getSelectiond9O1mEE());
            long calculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), m7055getEndimpl, this.state);
            int m1374component1impl = CursorAndWedgeAffinity.m1374component1impl(calculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity m1375component2impl = CursorAndWedgeAffinity.m1375component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (m1374component1impl != m7055getEndimpl || !TextRange.m7054getCollapsedimpl(m1386getSelectiond9O1mEE())) {
                m1387setSelection5zctL8(TextRangeKt.TextRange(m1374component1impl));
            }
            if (m1375component2impl != null) {
                setWedgeAffinity(m1375component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    public final SelectionMovementDeletionContext selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m7060getStartimpl(this.initialValue.m1239getSelectiond9O1mEE()), TextRange.m7055getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1387setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final void setWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
