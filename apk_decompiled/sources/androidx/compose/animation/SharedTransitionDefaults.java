package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Rect;
import defpackage.o6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionDefaults {
    public static final SharedTransitionDefaults INSTANCE = new SharedTransitionDefaults();
    private static final BoundsTransform BoundsTransform = new o6(2);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SharedContentConfig implements SharedTransitionScope.SharedContentConfig {
        public static final int $stable = 0;
        public static final SharedContentConfig INSTANCE = new SharedContentConfig();

        private SharedContentConfig() {
        }
    }

    private SharedTransitionDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec BoundsTransform$lambda$0(Rect rect, Rect rect2) {
        SpringSpec springSpec;
        springSpec = SharedTransitionScopeKt.DefaultSpring;
        return springSpec;
    }

    public final BoundsTransform getBoundsTransform() {
        return BoundsTransform;
    }
}
