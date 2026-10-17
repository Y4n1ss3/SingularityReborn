package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import defpackage.o;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m1393calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j) {
        int m7060getStartimpl;
        long m1407getHandleDragPositionF1C5BW0 = textFieldSelectionState.m1407getHandleDragPositionF1C5BW0();
        if ((InlineClassHelperKt.DualUnsignedFloatMask & m1407getHandleDragPositionF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        long m1239getSelectiond9O1mEE = transformedTextFieldState.getVisualText().m1239getSelectiond9O1mEE();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m7060getStartimpl = TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE);
        } else {
            if (i != 3) {
                o.n();
                return 0L;
            }
            m7060getStartimpl = TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE);
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (m1407getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(m7060getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float g = y80.g(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m7780equalsimpl0(j, IntSize.Companion.m7787getZeroYbymL2g()) && Math.abs(intBitsToFloat - g) > ((int) (j >> 32)) / 2) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop) & 4294967295L) | (Float.floatToRawIntBits(g) << 32));
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                m4508constructorimpl = TextLayoutStateKt.m1353coerceIn3MmeM6k(m4508constructorimpl, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m1355fromTextLayoutToCoreUv8p0NA(textLayoutState, m4508constructorimpl);
    }
}
