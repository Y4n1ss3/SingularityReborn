package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import defpackage.dq;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ExitAlwaysScrollBehavior implements BottomAppBarScrollBehavior {
    private final iy canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final BottomAppBarState state;

    public ExitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, iy iyVar) {
        this.state = bottomAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = iyVar;
        this.nestedScrollConnection = new ExitAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0() {
        return true;
    }

    public final iy getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public BottomAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    public /* synthetic */ ExitAlwaysScrollBehavior(BottomAppBarState bottomAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, iy iyVar, int i, dq dqVar) {
        this(bottomAppBarState, animationSpec, decayAnimationSpec, (i & 8) != 0 ? new w(5) : iyVar);
    }
}
