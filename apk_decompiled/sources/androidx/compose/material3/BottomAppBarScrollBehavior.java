package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface BottomAppBarScrollBehavior {
    DecayAnimationSpec<Float> getFlingAnimationSpec();

    NestedScrollConnection getNestedScrollConnection();

    AnimationSpec<Float> getSnapAnimationSpec();

    BottomAppBarState getState();

    boolean isPinned();
}
