package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.iy;
import defpackage.lu0;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface OverlayClip {
        Path getClipPath(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface PlaceholderSize {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PlaceholderSize AnimatedSize = new PlaceholderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceholderSize$Companion$AnimatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo87calculateSizeJyjRU_E(long j, long j2) {
                    return j2;
                }
            };
            private static final PlaceholderSize ContentSize = new PlaceholderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo87calculateSizeJyjRU_E(long j, long j2) {
                    return j;
                }
            };

            private Companion() {
            }

            public final PlaceholderSize getAnimatedSize() {
                return AnimatedSize;
            }

            public final PlaceholderSize getContentSize() {
                return ContentSize;
            }
        }

        /* renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo87calculateSizeJyjRU_E(long j, long j2);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface ResizeMode {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public static /* synthetic */ ResizeMode scaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i, Object obj) {
                if ((i & 1) != 0) {
                    contentScale = ContentScale.Companion.getFillWidth();
                }
                if ((i & 2) != 0) {
                    alignment = Alignment.Companion.getCenter();
                }
                return companion.scaleToBounds(contentScale, alignment);
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }

            public final ResizeMode scaleToBounds(ContentScale contentScale, Alignment alignment) {
                ScaleToBoundsImpl ScaleToBoundsCached;
                ScaleToBoundsCached = SharedTransitionScopeKt.ScaleToBoundsCached(contentScale, alignment);
                return ScaleToBoundsCached;
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface SharedContentConfig {
        /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA, reason: not valid java name */
        default Rect m88alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(SharedContentState sharedContentState, Rect rect, long j) {
            return null;
        }

        default boolean getShouldKeepEnabledForOngoingAnimation() {
            return true;
        }

        default boolean isEnabled(SharedContentState sharedContentState) {
            return true;
        }
    }

    static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, float f, iy iyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
            return null;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            iyVar = new SharedTransitionScope$renderInSharedTransitionScopeOverlay$1(sharedTransitionScope);
        }
        return sharedTransitionScope.renderInSharedTransitionScopeOverlay(modifier, f, iyVar);
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceholderSize placeholderSize, boolean z, float f, OverlayClip overlayClip, int i, Object obj) {
        OverlayClip overlayClip2;
        OverlayClip overlayClip3;
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: sharedBounds");
            return null;
        }
        EnterTransition fadeIn$default = (i & 4) != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : enterTransition;
        ExitTransition fadeOut$default = (i & 8) != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null) : exitTransition;
        BoundsTransform boundsTransform2 = (i & 16) != 0 ? SharedTransitionDefaults.INSTANCE.getBoundsTransform() : boundsTransform;
        ResizeMode scaleToBounds = (i & 32) != 0 ? ResizeMode.Companion.scaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter()) : resizeMode;
        PlaceholderSize contentSize = (i & 64) != 0 ? PlaceholderSize.Companion.getContentSize() : placeholderSize;
        boolean z2 = (i & Fields.SpotShadowColor) != 0 ? true : z;
        float f2 = (i & Fields.RotationX) != 0 ? 0.0f : f;
        if ((i & Fields.RotationY) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, fadeIn$default, fadeOut$default, boundsTransform2, scaleToBounds, contentSize, z2, f2, overlayClip2);
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z, float f, OverlayClip overlayClip, int i, Object obj) {
        OverlayClip overlayClip2;
        OverlayClip overlayClip3;
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: sharedElement");
            return null;
        }
        if ((i & 4) != 0) {
            boundsTransform = SharedTransitionDefaults.INSTANCE.getBoundsTransform();
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i & 8) != 0) {
            placeholderSize = PlaceholderSize.Companion.getContentSize();
        }
        PlaceholderSize placeholderSize2 = placeholderSize;
        boolean z2 = (i & 16) != 0 ? true : z;
        float f2 = (i & 32) != 0 ? 0.0f : f;
        if ((i & 64) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform2, placeholderSize2, z2, f2, overlayClip2);
    }

    static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z2, float f, OverlayClip overlayClip, int i, Object obj) {
        OverlayClip overlayClip2;
        OverlayClip overlayClip3;
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
            return null;
        }
        if ((i & 4) != 0) {
            boundsTransform = SharedTransitionDefaults.INSTANCE.getBoundsTransform();
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i & 8) != 0) {
            placeholderSize = PlaceholderSize.Companion.getContentSize();
        }
        PlaceholderSize placeholderSize2 = placeholderSize;
        boolean z3 = (i & 16) != 0 ? true : z2;
        float f2 = (i & 32) != 0 ? 0.0f : f;
        if ((i & 64) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScope.sharedElementWithCallerManagedVisibility(modifier, sharedContentState, z, boundsTransform2, placeholderSize2, z3, f2, overlayClip2);
    }

    static /* synthetic */ Modifier skipToLookaheadPosition$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, iy iyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: skipToLookaheadPosition");
            return null;
        }
        if ((i & 1) != 0) {
            iyVar = new SharedTransitionScope$skipToLookaheadPosition$1(sharedTransitionScope);
        }
        return sharedTransitionScope.skipToLookaheadPosition(modifier, iyVar);
    }

    static /* synthetic */ Modifier skipToLookaheadSize$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, iy iyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: skipToLookaheadSize");
            return null;
        }
        if ((i & 1) != 0) {
            iyVar = new SharedTransitionScope$skipToLookaheadSize$1(sharedTransitionScope);
        }
        return sharedTransitionScope.skipToLookaheadSize(modifier, iyVar);
    }

    OverlayClip OverlayClip(Shape shape);

    default SharedContentConfig SharedContentConfig() {
        return CachedSharedContentConfig.INSTANCE;
    }

    boolean isTransitionActive();

    default SharedContentState rememberSharedContentState(Object obj, SharedContentConfig sharedContentConfig, Composer composer, int i) {
        composer.startReplaceGroup(-148945892);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-148945892, i, -1, "androidx.compose.animation.SharedTransitionScope.rememberSharedContentState (SharedTransitionScope.kt:818)");
        }
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SharedContentState(obj, sharedContentConfig);
            composer.updateRememberedValue(rememberedValue);
        }
        SharedContentState sharedContentState = (SharedContentState) rememberedValue;
        sharedContentState.setConfig$animation(sharedContentConfig);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sharedContentState;
    }

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, float f, iy iyVar);

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceholderSize placeholderSize, boolean z, float f, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z, float f, OverlayClip overlayClip);

    Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z2, float f, OverlayClip overlayClip);

    default Modifier skipToLookaheadPosition(Modifier modifier, iy iyVar) {
        return LookaheadScopeKt.approachLayout(modifier, SharedTransitionScope$skipToLookaheadPosition$2.INSTANCE, new SharedTransitionScope$skipToLookaheadPosition$3(iyVar), new SharedTransitionScope$skipToLookaheadPosition$4(iyVar, this));
    }

    Modifier skipToLookaheadSize(Modifier modifier, iy iyVar);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SharedContentState {
        public static final int $stable = 8;
        private final MutableState config$delegate;
        private final MutableState internalState$delegate;
        private final Object key;

        public SharedContentState(Object obj, SharedContentConfig sharedContentConfig) {
            this.key = obj;
            this.config$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentConfig, null, 2, null);
            this.internalState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        private final SharedElementEntry getNonNullInternalState() {
            SharedElementEntry internalState$animation = getInternalState$animation();
            if (internalState$animation != null) {
                return internalState$animation;
            }
            o.m("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
            return null;
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation();
        }

        public final SharedContentConfig getConfig$animation() {
            return (SharedContentConfig) this.config$delegate.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SharedElementEntry getInternalState$animation() {
            return (SharedElementEntry) this.internalState$delegate.getValue();
        }

        public final Object getKey() {
            return this.key;
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementEntry parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        public final boolean isAnimating$animation() {
            BoundsAnimation boundsAnimation;
            SharedElementEntry internalState$animation = getInternalState$animation();
            return ((internalState$animation == null || (boundsAnimation = internalState$animation.getBoundsAnimation()) == null) ? null : boundsAnimation.getAnimationState()) != null;
        }

        public final boolean isEnabledByUser$animation() {
            SharedContentConfig config$animation = getConfig$animation();
            if (config$animation.isEnabled(this)) {
                return true;
            }
            return isAnimating$animation() && config$animation.getShouldKeepEnabledForOngoingAnimation();
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementEntry internalState$animation = getInternalState$animation();
            if (internalState$animation == null || (sharedElement = internalState$animation.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        /* renamed from: prepareTransitionWithInitialVelocity-TH1AsA0, reason: not valid java name */
        public final void m89prepareTransitionWithInitialVelocityTH1AsA0(long j) {
            SharedElementEntry nonNullInternalState = getNonNullInternalState();
            if (getConfig$animation().isEnabled(this)) {
                nonNullInternalState.getSharedElement().m83updateExitVelocityTH1AsA0$animation(j);
            }
        }

        public final void setConfig$animation(SharedContentConfig sharedContentConfig) {
            this.config$delegate.setValue(sharedContentConfig);
        }

        public final void setInternalState$animation(SharedElementEntry sharedElementEntry) {
            this.internalState$delegate.setValue(sharedElementEntry);
        }

        public /* synthetic */ SharedContentState(Object obj, SharedContentConfig sharedContentConfig, int i, dq dqVar) {
            this(obj, (i & 2) != 0 ? SharedTransitionDefaults.SharedContentConfig.INSTANCE : sharedContentConfig);
        }
    }

    default SharedContentState rememberSharedContentState(Object obj, Composer composer, int i) {
        composer.startReplaceGroup(800730162);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(800730162, i, -1, "androidx.compose.animation.SharedTransitionScope.rememberSharedContentState (SharedTransitionScope.kt:796)");
        }
        SharedContentState rememberSharedContentState = rememberSharedContentState(obj, SharedTransitionDefaults.SharedContentConfig.INSTANCE, composer, ((i << 3) & 896) | (i & 14) | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberSharedContentState;
    }
}
