package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m1294adjustHandwritingDeleteGestureRange72CqOWE(long j, CharSequence charSequence) {
        int m7060getStartimpl = TextRange.m7060getStartimpl(j);
        int m7055getEndimpl = TextRange.m7055getEndimpl(j);
        int codePointBefore = m7060getStartimpl > 0 ? Character.codePointBefore(charSequence, m7060getStartimpl) : 10;
        int codePointAt = m7055getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, m7055getEndimpl) : 10;
        if (isWhitespaceExceptNewline(codePointBefore) && (isWhitespace(codePointAt) || isPunctuation(codePointAt))) {
            do {
                m7060getStartimpl -= Character.charCount(codePointBefore);
                if (m7060getStartimpl == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, m7060getStartimpl);
            } while (isWhitespaceExceptNewline(codePointBefore));
            return TextRangeKt.TextRange(m7060getStartimpl, m7055getEndimpl);
        }
        if (!isWhitespaceExceptNewline(codePointAt)) {
            return j;
        }
        if (!isWhitespace(codePointBefore) && !isPunctuation(codePointBefore)) {
            return j;
        }
        do {
            m7055getEndimpl += Character.charCount(codePointAt);
            if (m7055getEndimpl == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, m7055getEndimpl);
        } while (isWhitespaceExceptNewline(codePointAt));
        return TextRangeKt.TextRange(m7060getStartimpl, m7055getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt$compoundEditCommand$1
            @Override // androidx.compose.ui.text.input.EditCommand
            public void applyTo(EditingBuffer editingBuffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(editingBuffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m1295enclosurepWDy79M(long j, long j2) {
        return TextRangeKt.TextRange(Math.min(TextRange.m7060getStartimpl(j), TextRange.m7060getStartimpl(j)), Math.max(TextRange.m7055getEndimpl(j2), TextRange.m7055getEndimpl(j2)));
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1296getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i = (int) (4294967295L & j);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i2) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1297getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m1299getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m1299getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long mo6248screenToLocalMKHz9U;
        int m1296getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (m1296getLineForHandwritingGestured4ec7I = m1296getLineForHandwritingGestured4ec7I(multiParagraph, (mo6248screenToLocalMKHz9U = layoutCoordinates.mo6248screenToLocalMKHz9U(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m6921getOffsetForPositionk4lQ0M(Offset.m4510copydBAh8RU$default(mo6248screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineBottom(m1296getLineForHandwritingGestured4ec7I) + multiParagraph.getLineTop(m1296getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m1300getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        long mo6248screenToLocalMKHz9U = layoutCoordinates.mo6248screenToLocalMKHz9U(j);
        long mo6248screenToLocalMKHz9U2 = layoutCoordinates.mo6248screenToLocalMKHz9U(j2);
        int m1296getLineForHandwritingGestured4ec7I = m1296getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), mo6248screenToLocalMKHz9U, viewConfiguration);
        int m1296getLineForHandwritingGestured4ec7I2 = m1296getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), mo6248screenToLocalMKHz9U2, viewConfiguration);
        if (m1296getLineForHandwritingGestured4ec7I != -1) {
            if (m1296getLineForHandwritingGestured4ec7I2 != -1) {
                m1296getLineForHandwritingGestured4ec7I = Math.min(m1296getLineForHandwritingGestured4ec7I, m1296getLineForHandwritingGestured4ec7I2);
            }
            m1296getLineForHandwritingGestured4ec7I2 = m1296getLineForHandwritingGestured4ec7I;
        } else if (m1296getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        float lineBottom = (textLayoutResult.getLineBottom(m1296getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineTop(m1296getLineForHandwritingGestured4ec7I2)) / 2.0f;
        int i = (int) (mo6248screenToLocalMKHz9U >> 32);
        int i2 = (int) (mo6248screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m6922getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom + 0.1f), TextGranularity.Companion.m7022getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m1301getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Companion.m7065getZerod9O1mEE() : multiParagraph.m6922getRangeForRect86BmAI(rect.m4553translatek4lQ0M(layoutCoordinates.mo6248screenToLocalMKHz9U(Offset.Companion.m4532getZeroF1C5BW0())), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1302getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m1301getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1305getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long m1303getRangeForScreenRectOH9lIzo = m1303getRangeForScreenRectOH9lIzo(textLayoutState, rect, i, textInclusionStrategy);
        if (TextRange.m7054getCollapsedimpl(m1303getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        long m1303getRangeForScreenRectOH9lIzo2 = m1303getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i, textInclusionStrategy);
        return TextRange.m7054getCollapsedimpl(m1303getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m7065getZerod9O1mEE() : m1295enclosurepWDy79M(m1303getRangeForScreenRectOH9lIzo, m1303getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        return (i == textLayoutResult.getLineStart(lineForOffset) || i == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i) : textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    private static final boolean isNewline(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    private static final boolean isPunctuation(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i) {
        return Character.isWhitespace(i) || i == NBSP_CODE_POINT;
    }

    private static final boolean isWhitespaceExceptNewline(int i) {
        return isWhitespace(i) && !isNewline(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i) {
        int i2 = i;
        while (i2 > 0) {
            int codePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, i2);
            if (!isWhitespace(codePointBefore)) {
                break;
            }
            i2 -= Character.charCount(codePointBefore);
        }
        while (i < charSequence.length()) {
            int codePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i);
            if (!isWhitespace(codePointAt)) {
                break;
            }
            i += CodepointHelpers_jvmKt.charCount(codePointAt);
        }
        return TextRangeKt.TextRange(i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1303getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m1301getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1298getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m1299getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1304getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long m1302getRangeForScreenRectOH9lIzo = m1302getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i, textInclusionStrategy);
        if (TextRange.m7054getCollapsedimpl(m1302getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        long m1302getRangeForScreenRectOH9lIzo2 = m1302getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i, textInclusionStrategy);
        return TextRange.m7054getCollapsedimpl(m1302getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m7065getZerod9O1mEE() : m1295enclosurepWDy79M(m1302getRangeForScreenRectOH9lIzo, m1302getRangeForScreenRectOH9lIzo2);
    }
}
