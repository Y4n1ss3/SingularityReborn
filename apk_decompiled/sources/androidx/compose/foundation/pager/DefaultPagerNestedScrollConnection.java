package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.y80;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    private final Orientation orientation;
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m995mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    private final float m996toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m997consumeOnOrientationQWom1Mo(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m7845copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null) : Velocity.m7845copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final PagerState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        return Velocity.m7840boximpl(m997consumeOnOrientationQWom1Mo(j2, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5968getSideEffectWNlRxjI()) || m995mainAxisk4lQ0M(j2) == 0.0f) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo838onPreScrollOzD1aCk(long j, int i) {
        if (!NestedScrollSource.m5957equalsimpl0(i, NestedScrollSource.Companion.m5969getUserInputWNlRxjI()) || Math.abs(this.state.getCurrentPageOffsetFraction()) <= 1.0E-6d || Math.abs(m996toFloatk4lQ0M(j)) <= 0.0f) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation();
        float pageSpacing = ((this.state.getLayoutInfo().getPageSpacing() + this.state.getLayoutInfo().getPageSize()) * (-Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
        if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
            pageSpacing = currentPageOffsetFraction;
            currentPageOffsetFraction = pageSpacing;
        }
        float f = -this.state.dispatchRawDelta(-y80.g(m996toFloatk4lQ0M(j), currentPageOffsetFraction, pageSpacing));
        float intBitsToFloat = this.orientation == Orientation.Horizontal ? f : Float.intBitsToFloat((int) (j >> 32));
        if (this.orientation != Orientation.Vertical) {
            f = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return Offset.m4509copydBAh8RU(j, intBitsToFloat, f);
    }
}
