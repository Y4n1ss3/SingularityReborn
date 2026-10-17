package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        return textLayoutResult.getHorizontalPosition(i, textLayoutResult.getBidiRunDirection(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == textLayoutResult.getParagraphDirection(i));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        float g = y80.g(getHorizontalPosition(textLayoutResult, i, z, z2), 0.0f, (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32));
        float g2 = y80.g(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.m7031getSizeYbymL2g() & 4294967295L));
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(g) << 32) | (Float.floatToRawIntBits(g2) & 4294967295L));
    }
}
