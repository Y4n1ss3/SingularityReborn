package androidx.compose.foundation.text.selection;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment handleReferencePoint;
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m4532getZeroF1C5BW0();

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long mo1072provideF1C5BW0 = this.positionProvider.mo1072provideF1C5BW0();
        if ((InlineClassHelperKt.DualUnsignedFloatMask & mo1072provideF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            mo1072provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo1072provideF1C5BW0;
        return IntOffset.m7743plusqkQi6aY(IntOffset.m7743plusqkQi6aY(intRect.m7768getTopLeftnOccac(), IntOffsetKt.m7756roundk4lQ0M(mo1072provideF1C5BW0)), this.handleReferencePoint.mo4178alignKFBX0sM(j2, IntSize.Companion.m7787getZeroYbymL2g(), layoutDirection));
    }
}
