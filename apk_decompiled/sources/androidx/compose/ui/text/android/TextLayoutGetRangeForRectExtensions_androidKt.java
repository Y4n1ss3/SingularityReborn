package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import defpackage.ac;
import defpackage.i10;
import defpackage.k10;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    private static final float getCharacterRightBounds(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, SegmentFinder segmentFinder, my myVar) {
        int start;
        int nextEndBoundary;
        if (!horizontalOverlap(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.right < f2) && (!bidiRun.isRtl() || rectF.left > f)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i4, i, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.right) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.left)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getEnd() - 1;
        }
        int previousStartBoundary = segmentFinder.previousStartBoundary(start + 1);
        if (previousStartBoundary == -1 || (nextEndBoundary = segmentFinder.nextEndBoundary(previousStartBoundary)) <= bidiRun.getStart()) {
            return -1;
        }
        int start2 = bidiRun.getStart();
        if (previousStartBoundary < start2) {
            previousStartBoundary = start2;
        }
        int end2 = bidiRun.getEnd();
        if (nextEndBoundary > end2) {
            nextEndBoundary = end2;
        }
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(nextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(previousStartBoundary, i, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(previousStartBoundary, i, fArr) : getCharacterRightBounds(nextEndBoundary - 1, i, fArr);
            if (((Boolean) myVar.invoke(rectF2, rectF)).booleanValue()) {
                return nextEndBoundary;
            }
            nextEndBoundary = segmentFinder.previousEndBoundary(nextEndBoundary);
            if (nextEndBoundary == -1 || nextEndBoundary <= bidiRun.getStart()) {
                break;
            }
            int previousStartBoundary2 = segmentFinder.previousStartBoundary(nextEndBoundary);
            int start3 = bidiRun.getStart();
            previousStartBoundary = previousStartBoundary2 < start3 ? start3 : previousStartBoundary2;
        }
        return -1;
    }

    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i, my myVar) {
        int i2;
        SegmentFinder wordSegmentFinder = i == 1 ? new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i3, rectF, wordSegmentFinder, myVar, true);
        while (true) {
            i2 = i3;
            if (startOrEndOffsetForRectWithinLine != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i3, rectF, wordSegmentFinder, myVar, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, myVar, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i4, rectF, wordSegmentFinder, myVar, false);
            lineForVertical2 = i4;
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, SegmentFinder segmentFinder, my myVar) {
        int start;
        int previousStartBoundary;
        if (!horizontalOverlap(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.left > f) && (!bidiRun.isRtl() || rectF.right < f2)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i4, i, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (bidiRun.isRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getStart();
        }
        int nextEndBoundary = segmentFinder.nextEndBoundary(start);
        if (nextEndBoundary == -1 || (previousStartBoundary = segmentFinder.previousStartBoundary(nextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int start2 = bidiRun.getStart();
        if (previousStartBoundary < start2) {
            previousStartBoundary = start2;
        }
        int end2 = bidiRun.getEnd();
        if (nextEndBoundary > end2) {
            nextEndBoundary = end2;
        }
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(nextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(previousStartBoundary, i, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(previousStartBoundary, i, fArr) : getCharacterRightBounds(nextEndBoundary - 1, i, fArr);
            if (((Boolean) myVar.invoke(rectF2, rectF)).booleanValue()) {
                return previousStartBoundary;
            }
            previousStartBoundary = segmentFinder.nextStartBoundary(previousStartBoundary);
            if (previousStartBoundary == -1 || previousStartBoundary >= bidiRun.getEnd()) {
                break;
            }
            int nextEndBoundary2 = segmentFinder.nextEndBoundary(previousStartBoundary);
            int end3 = bidiRun.getEnd();
            nextEndBoundary = nextEndBoundary2 > end3 ? end3 : nextEndBoundary2;
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i, RectF rectF, SegmentFinder segmentFinder, my myVar, boolean z) {
        i10 i10Var;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart != lineEnd) {
            float[] fArr = new float[(lineEnd - lineStart) * 2];
            textLayout.fillLineHorizontalBounds$ui_text(i, fArr);
            LayoutHelper.BidiRun[] lineBidiRuns$ui_text = layoutHelper.getLineBidiRuns$ui_text(i);
            if (z) {
                lineBidiRuns$ui_text.getClass();
                i10Var = new k10(0, lineBidiRuns$ui_text.length - 1, 1);
            } else {
                i10Var = new i10(ac.f0(lineBidiRuns$ui_text), 0, -1);
            }
            int i2 = i10Var.d;
            int i3 = i10Var.e;
            int i4 = i10Var.f;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                int i5 = i2;
                while (true) {
                    LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text[i5];
                    float characterLeftBounds = bidiRun.isRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                    float characterRightBounds = bidiRun.isRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                    int startOffsetForRectWithinRun = z ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, myVar) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, myVar);
                    if (startOffsetForRectWithinRun < 0) {
                        if (i5 == i3) {
                            break;
                        }
                        i5 += i4;
                    } else {
                        return startOffsetForRectWithinRun;
                    }
                }
            }
        }
        return -1;
    }

    private static final boolean horizontalOverlap(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
