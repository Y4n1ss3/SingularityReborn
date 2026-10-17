package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r18, r4.getRight(), r4.getBottom()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CursorAnchorInfo.Builder addCharacterBounds(CursorAnchorInfo.Builder builder, int i, int i2, TextLayoutResult textLayoutResult, Rect rect) {
        int i3;
        float[] fArr = new float[(i2 - i) * 4];
        textLayoutResult.getMultiParagraph().m6920fillBoundingBoxes8ffj60Q(TextRangeKt.TextRange(i, i2), fArr, 0);
        for (int i4 = i; i4 < i2; i4++) {
            int i5 = (i4 - i) * 4;
            Rect rect2 = new Rect(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3]);
            boolean overlaps = rect.overlaps(rect2);
            if (LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, rect2.getLeft(), rect2.getTop())) {
                i3 = overlaps;
            }
            i3 = (overlaps ? 1 : 0) | 2;
            if (textLayoutResult.getBidiRunDirection(i4) == ResolvedTextDirection.Rtl) {
                i3 = (i3 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i4, rect2.getLeft(), rect2.getTop(), rect2.getRight(), rect2.getBottom(), i3);
        }
        return builder;
    }

    /* renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m1277buildvxqZcH0(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int m7058getMinimpl = TextRange.m7058getMinimpl(j);
        builder.setSelectionRange(m7058getMinimpl, TextRange.m7057getMaximpl(j));
        if (z) {
            setInsertionMarker(builder, m7058getMinimpl, textLayoutResult, rect);
        }
        if (z2) {
            int m7058getMinimpl2 = textRange != null ? TextRange.m7058getMinimpl(textRange.m7064unboximpl()) : -1;
            int m7057getMaximpl = textRange != null ? TextRange.m7057getMaximpl(textRange.m7064unboximpl()) : -1;
            if (m7058getMinimpl2 >= 0 && m7058getMinimpl2 < m7057getMaximpl) {
                builder.setComposingText(m7058getMinimpl2, charSequence.subSequence(m7058getMinimpl2, m7057getMaximpl));
                addCharacterBounds(builder, m7058getMinimpl2, m7057getMaximpl, textLayoutResult, rect);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i >= 34 && z4) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    /* renamed from: build-vxqZcH0$default, reason: not valid java name */
    public static /* synthetic */ CursorAnchorInfo m1278buildvxqZcH0$default(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & Fields.SpotShadowColor) != 0) {
            z = true;
        }
        if ((i & Fields.RotationX) != 0) {
            z2 = true;
        }
        if ((i & Fields.RotationY) != 0) {
            z3 = true;
        }
        if ((i & Fields.RotationZ) != 0) {
            z4 = true;
        }
        return m1277buildvxqZcH0(builder, charSequence, j, textRange, textLayoutResult, matrix, rect, rect2, z, z2, z3, z4);
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, TextLayoutResult textLayoutResult, Rect rect) {
        if (i < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i);
        float g = y80.g(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m7031getSizeYbymL2g() >> 32));
        boolean containsInclusive = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, g, cursorRect.getTop());
        boolean containsInclusive2 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, g, cursorRect.getBottom());
        boolean z = textLayoutResult.getBidiRunDirection(i) == ResolvedTextDirection.Rtl;
        int i2 = (containsInclusive || containsInclusive2) ? 1 : 0;
        if (!containsInclusive || !containsInclusive2) {
            i2 |= 2;
        }
        if (z) {
            i2 |= 4;
        }
        builder.setInsertionMarkerLocation(g, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i2);
        return builder;
    }
}
