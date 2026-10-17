package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1353coerceIn3MmeM6k(long j, Rect rect) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i2) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i2) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i2)) & 4294967295L));
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m1354fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j) {
        Offset offset;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offset = Offset.m4505boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo6243localPositionOfR5De75A(decoratorNodeCoordinates, j) : j);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.m4526unboximpl();
            }
        }
        return j;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m1355fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offset = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (!coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offset = Offset.m4505boximpl(coreNodeCoordinates.mo6243localPositionOfR5De75A(textLayoutNodeCoordinates, j));
                    }
                }
                if (offset != null) {
                    return offset.m4526unboximpl();
                }
            }
        }
        return j;
    }

    public static final Rect fromTextLayoutToDecoration(TextLayoutState textLayoutState, Rect rect) {
        LayoutCoordinates decoratorNodeCoordinates;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates()) != null) {
                LayoutCoordinates layoutCoordinates = decoratorNodeCoordinates.isAttached() ? decoratorNodeCoordinates : null;
                if (layoutCoordinates != null) {
                    return rect.m4553translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(textLayoutNodeCoordinates, false).m4551getTopLeftF1C5BW0());
                }
            }
        }
        return rect;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m1356fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j : decoratorNodeCoordinates.mo6251windowToLocalMKHz9U(j);
    }
}
