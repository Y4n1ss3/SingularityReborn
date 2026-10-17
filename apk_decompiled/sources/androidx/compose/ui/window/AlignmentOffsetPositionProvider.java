package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        return IntOffset.m7743plusqkQi6aY(IntOffset.m7743plusqkQi6aY(IntOffset.m7743plusqkQi6aY(intRect.m7768getTopLeftnOccac(), alignment.mo4178alignKFBX0sM(companion.m7787getZeroYbymL2g(), intRect.m7766getSizeYbymL2g(), layoutDirection)), IntOffset.m7747unaryMinusnOccac(this.alignment.mo4178alignKFBX0sM(companion.m7787getZeroYbymL2g(), j2, layoutDirection))), IntOffset.m7733constructorimpl(((IntOffset.m7739getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32) | (IntOffset.m7740getYimpl(this.offset) & 4294967295L)));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m7871getOffsetnOccac() {
        return this.offset;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j, dq dqVar) {
        this(alignment, j);
    }
}
