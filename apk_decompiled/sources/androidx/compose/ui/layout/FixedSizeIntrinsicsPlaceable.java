package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSize;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m6301setMeasuredSizeozmzZPI(IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32)));
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
    }
}
