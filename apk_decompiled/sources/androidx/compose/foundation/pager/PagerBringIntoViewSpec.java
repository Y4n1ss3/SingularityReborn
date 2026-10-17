package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    private final BringIntoViewSpec defaultBringIntoViewSpec;
    private final PagerState pagerState;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = bringIntoViewSpec;
    }

    private final float overrideProposedOffsetMove(float f) {
        float firstVisiblePageOffset$foundation = this.pagerState.getFirstVisiblePageOffset$foundation() * (-1.0f);
        while (f > 0.0f && firstVisiblePageOffset$foundation < f) {
            firstVisiblePageOffset$foundation += this.pagerState.getPageSizeWithSpacing$foundation();
        }
        while (f < 0.0f && firstVisiblePageOffset$foundation > f) {
            firstVisiblePageOffset$foundation -= this.pagerState.getPageSizeWithSpacing$foundation();
        }
        return firstVisiblePageOffset$foundation;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float f, float f2, float f3) {
        float calculateScrollDistance = this.defaultBringIntoViewSpec.calculateScrollDistance(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f ? f + f2 <= 0.0f : f + f2 > f3) {
            z = true;
        }
        if (Math.abs(calculateScrollDistance) != 0.0f && z) {
            return overrideProposedOffsetMove(calculateScrollDistance);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset$foundation()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset$foundation = this.pagerState.getFirstVisiblePageOffset$foundation() * (-1.0f);
        if (this.pagerState.getLastScrolledForward()) {
            firstVisiblePageOffset$foundation += this.pagerState.getPageSizeWithSpacing$foundation();
        }
        return y80.g(firstVisiblePageOffset$foundation, -f3, f3);
    }

    public final BringIntoViewSpec getDefaultBringIntoViewSpec() {
        return this.defaultBringIntoViewSpec;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }
}
