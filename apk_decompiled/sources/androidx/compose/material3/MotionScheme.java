package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ExpressiveMotionTokens;
import androidx.compose.material3.tokens.StandardMotionTokens;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MotionScheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final MotionScheme expressive$material3() {
            return ExpressiveMotionSchemeImpl.INSTANCE;
        }

        public final MotionScheme standard$material3() {
            return StandardMotionSchemeImpl.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ExpressiveMotionSchemeImpl implements MotionScheme {
        public static final ExpressiveMotionSchemeImpl INSTANCE = new ExpressiveMotionSchemeImpl();
        private static final SpringSpec<Object> defaultEffectsSpec;
        private static final SpringSpec<Object> defaultSpatialSpec;
        private static final SpringSpec<Object> fastEffectsSpec;
        private static final SpringSpec<Object> fastSpatialSpec;
        private static final SpringSpec<Object> slowEffectsSpec;
        private static final SpringSpec<Object> slowSpatialSpec;

        static {
            ExpressiveMotionTokens expressiveMotionTokens = ExpressiveMotionTokens.INSTANCE;
            defaultSpatialSpec = AnimationSpecKt.spring$default(expressiveMotionTokens.getSpringDefaultSpatialDamping(), expressiveMotionTokens.getSpringDefaultSpatialStiffness(), null, 4, null);
            fastSpatialSpec = AnimationSpecKt.spring$default(expressiveMotionTokens.getSpringFastSpatialDamping(), expressiveMotionTokens.getSpringFastSpatialStiffness(), null, 4, null);
            slowSpatialSpec = AnimationSpecKt.spring$default(expressiveMotionTokens.getSpringSlowSpatialDamping(), expressiveMotionTokens.getSpringSlowSpatialStiffness(), null, 4, null);
            defaultEffectsSpec = AnimationSpecKt.spring$default(expressiveMotionTokens.getSpringDefaultEffectsDamping(), expressiveMotionTokens.getSpringDefaultEffectsStiffness(), null, 4, null);
            fastEffectsSpec = AnimationSpecKt.spring$default(expressiveMotionTokens.getSpringFastEffectsDamping(), expressiveMotionTokens.getSpringFastEffectsStiffness(), null, 4, null);
            slowEffectsSpec = AnimationSpecKt.spring$default(expressiveMotionTokens.getSpringSlowEffectsDamping(), expressiveMotionTokens.getSpringSlowEffectsStiffness(), null, 4, null);
        }

        private ExpressiveMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultEffectsSpec() {
            SpringSpec<Object> springSpec = defaultEffectsSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultSpatialSpec() {
            SpringSpec<Object> springSpec = defaultSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastEffectsSpec() {
            SpringSpec<Object> springSpec = fastEffectsSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastSpatialSpec() {
            SpringSpec<Object> springSpec = fastSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowEffectsSpec() {
            SpringSpec<Object> springSpec = slowEffectsSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowSpatialSpec() {
            SpringSpec<Object> springSpec = slowSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class StandardMotionSchemeImpl implements MotionScheme {
        public static final StandardMotionSchemeImpl INSTANCE = new StandardMotionSchemeImpl();
        private static final SpringSpec<Object> defaultEffectsSpec;
        private static final SpringSpec<Object> defaultSpatialSpec;
        private static final SpringSpec<Object> fastEffectsSpec;
        private static final SpringSpec<Object> fastSpatialSpec;
        private static final SpringSpec<Object> slowEffectsSpec;
        private static final SpringSpec<Object> slowSpatialSpec;

        static {
            StandardMotionTokens standardMotionTokens = StandardMotionTokens.INSTANCE;
            defaultSpatialSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringDefaultSpatialDamping(), standardMotionTokens.getSpringDefaultSpatialStiffness(), null, 4, null);
            fastSpatialSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringFastSpatialDamping(), standardMotionTokens.getSpringFastSpatialStiffness(), null, 4, null);
            slowSpatialSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringSlowSpatialDamping(), standardMotionTokens.getSpringSlowSpatialStiffness(), null, 4, null);
            defaultEffectsSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringDefaultEffectsDamping(), standardMotionTokens.getSpringDefaultEffectsStiffness(), null, 4, null);
            fastEffectsSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringFastEffectsDamping(), standardMotionTokens.getSpringFastEffectsStiffness(), null, 4, null);
            slowEffectsSpec = AnimationSpecKt.spring$default(standardMotionTokens.getSpringSlowEffectsDamping(), standardMotionTokens.getSpringSlowEffectsStiffness(), null, 4, null);
        }

        private StandardMotionSchemeImpl() {
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultEffectsSpec() {
            SpringSpec<Object> springSpec = defaultEffectsSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> defaultSpatialSpec() {
            SpringSpec<Object> springSpec = defaultSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastEffectsSpec() {
            SpringSpec<Object> springSpec = fastEffectsSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> fastSpatialSpec() {
            SpringSpec<Object> springSpec = fastSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowEffectsSpec() {
            SpringSpec<Object> springSpec = slowEffectsSpec;
            springSpec.getClass();
            return springSpec;
        }

        @Override // androidx.compose.material3.MotionScheme
        public <T> FiniteAnimationSpec<T> slowSpatialSpec() {
            SpringSpec<Object> springSpec = slowSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }
    }

    <T> FiniteAnimationSpec<T> defaultEffectsSpec();

    <T> FiniteAnimationSpec<T> defaultSpatialSpec();

    <T> FiniteAnimationSpec<T> fastEffectsSpec();

    <T> FiniteAnimationSpec<T> fastSpatialSpec();

    <T> FiniteAnimationSpec<T> slowEffectsSpec();

    <T> FiniteAnimationSpec<T> slowSpatialSpec();
}
