package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface BringIntoViewSpec {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
        };

        private Companion() {
        }

        public final float defaultCalculateScrollDistance$foundation(float f, float f2, float f3) {
            float f4 = f2 + f;
            if (f >= 0.0f && f4 <= f3) {
                return 0.0f;
            }
            if (f < 0.0f && f4 > f3) {
                return 0.0f;
            }
            float f5 = f4 - f3;
            return Math.abs(f) < Math.abs(f5) ? f : f5;
        }

        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation() {
            return DefaultBringIntoViewSpec;
        }

        public final AnimationSpec<Float> getDefaultScrollAnimationSpec$foundation() {
            return DefaultScrollAnimationSpec;
        }
    }

    default float calculateScrollDistance(float f, float f2, float f3) {
        return Companion.defaultCalculateScrollDistance$foundation(f, f2, f3);
    }

    @er
    default AnimationSpec<Float> getScrollAnimationSpec() {
        return Companion.getDefaultScrollAnimationSpec$foundation();
    }

    @er
    static /* synthetic */ void getScrollAnimationSpec$annotations() {
    }
}
