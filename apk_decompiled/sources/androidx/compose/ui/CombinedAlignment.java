package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CombinedAlignment implements Alignment {
    private final Alignment.Horizontal horizontal;
    private final Alignment.Vertical vertical;

    public CombinedAlignment(Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo4178alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        return IntOffset.m7733constructorimpl((this.horizontal.align((int) (j >> 32), (int) (j2 >> 32), layoutDirection) << 32) | (this.vertical.align((int) (j & 4294967295L), (int) (j2 & 4294967295L)) & 4294967295L));
    }
}
