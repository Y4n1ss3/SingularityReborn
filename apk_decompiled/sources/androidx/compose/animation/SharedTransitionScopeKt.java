package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fb0;
import defpackage.ny;
import defpackage.oy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeKt {
    public static final boolean VisualDebugging = false;
    private static final SpringSpec<Rect> DefaultSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
    private static final SharedTransitionScope.OverlayClip ParentClip = new SharedTransitionScope.OverlayClip() { // from class: androidx.compose.animation.SharedTransitionScopeKt$ParentClip$1
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            SharedTransitionScope.SharedContentState parentSharedContentState = sharedContentState.getParentSharedContentState();
            if (parentSharedContentState != null) {
                return parentSharedContentState.getClipPathInOverlay();
            }
            return null;
        }
    };
    private static final fb0 cachedScaleToBoundsImplMap = new fb0();

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScaleToBoundsImpl ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
        if (!getShouldCache(contentScale) || !getShouldCache(alignment)) {
            return new ScaleToBoundsImpl(contentScale, alignment);
        }
        fb0 fb0Var = cachedScaleToBoundsImplMap;
        Object d = fb0Var.d(contentScale);
        if (d == null) {
            d = new fb0();
            fb0Var.l(contentScale, d);
        }
        fb0 fb0Var2 = (fb0) d;
        Object d2 = fb0Var2.d(alignment);
        if (d2 == null) {
            d2 = new ScaleToBoundsImpl(contentScale, alignment);
            fb0Var2.l(alignment, d2);
        }
        return (ScaleToBoundsImpl) d2;
    }

    public static final void SharedTransitionLayout(Modifier modifier, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(646379026);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(646379026, i3, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:120)");
            }
            SharedTransitionScope(ComposableLambdaKt.rememberComposableLambda(1948801580, true, new SharedTransitionScopeKt$SharedTransitionLayout$1(modifier, nyVar), startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SharedTransitionScopeKt$SharedTransitionLayout$2(modifier, nyVar, i, i2));
        }
    }

    public static final void SharedTransitionScope(oy oyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1908320054);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(oyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1908320054, i2, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:142)");
            }
            LookaheadScopeKt.LookaheadScope(ComposableLambdaKt.rememberComposableLambda(2062852661, true, new SharedTransitionScopeKt$SharedTransitionScope$1(oyVar), startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SharedTransitionScopeKt$SharedTransitionScope$2(oyVar, i));
        }
    }

    private static final boolean getShouldCache(Alignment alignment) {
        Alignment.Companion companion = Alignment.Companion;
        return alignment == companion.getTopStart() || alignment == companion.getTopCenter() || alignment == companion.getTopEnd() || alignment == companion.getCenterStart() || alignment == companion.getCenter() || alignment == companion.getCenterEnd() || alignment == companion.getBottomStart() || alignment == companion.getBottomCenter() || alignment == companion.getBottomEnd();
    }

    private static final boolean getShouldCache(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.Companion;
        return contentScale == companion.getFillWidth() || contentScale == companion.getFillHeight() || contentScale == companion.getFillBounds() || contentScale == companion.getFit() || contentScale == companion.getCrop() || contentScale == companion.getNone() || contentScale == companion.getInside();
    }
}
