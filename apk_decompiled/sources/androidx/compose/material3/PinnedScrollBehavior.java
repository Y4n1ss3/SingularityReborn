package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.dq;
import defpackage.hm;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {
    private final iy canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public PinnedScrollBehavior(TopAppBarState topAppBarState, iy iyVar) {
        this.state = topAppBarState;
        this.canScroll = iyVar;
        this.isPinned = true;
        this.nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
                if (Velocity.m7850getYimpl(j2) > 0.0f) {
                    PinnedScrollBehavior.this.getState().setContentOffset(0.0f);
                }
                return super.mo533onPostFlingRZ2iAVY(j, j2, hmVar);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
                if (!((Boolean) PinnedScrollBehavior.this.getCanScroll().invoke()).booleanValue()) {
                    return Offset.Companion.m4532getZeroF1C5BW0();
                }
                TopAppBarState state = PinnedScrollBehavior.this.getState();
                state.setContentOffset(Float.intBitsToFloat((int) (j & 4294967295L)) + state.getContentOffset());
                return Offset.Companion.m4532getZeroF1C5BW0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0() {
        return true;
    }

    public final iy getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, iy iyVar, int i, dq dqVar) {
        this(topAppBarState, (i & 2) != 0 ? new w(7) : iyVar);
    }
}
