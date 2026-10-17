package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeylineSnapPositionKt {
    public static final SnapPosition KeylineSnapPosition(final CarouselPageSize carouselPageSize) {
        return new SnapPosition() { // from class: androidx.compose.material3.carousel.KeylineSnapPositionKt$KeylineSnapPosition$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
            public int position(int i, int i2, int i3, int i4, int i5, int i6) {
                return KeylineSnapPositionKt.getSnapPositionOffset(CarouselPageSize.this.getStrategy(), i5, i6);
            }
        };
    }

    public static final int getSnapPositionOffset(Strategy strategy, int i, int i2) {
        if (!strategy.isValid()) {
            return 0;
        }
        int P = y80.P(strategy.getDefaultKeylines().getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        if (i <= y80.v(strategy.getStartKeylineSteps())) {
            P = y80.P(strategy.getStartKeylineSteps().get(y80.h(y80.v(strategy.getStartKeylineSteps()) - i, 0, y80.v(strategy.getStartKeylineSteps()))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        }
        int i3 = i2 - 1;
        if (i < i3 - y80.v(strategy.getEndKeylineSteps()) || i2 <= strategy.getDefaultKeylines().getFocalCount()) {
            return P;
        }
        return y80.P(strategy.getEndKeylineSteps().get(y80.h(y80.v(strategy.getEndKeylineSteps()) - (i3 - i), 0, y80.v(strategy.getEndKeylineSteps()))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
    }
}
