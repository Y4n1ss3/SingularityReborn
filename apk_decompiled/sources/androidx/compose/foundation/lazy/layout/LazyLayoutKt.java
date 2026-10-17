package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.pm;
import defpackage.r4;
import defpackage.t6;
import defpackage.w01;
import defpackage.x4;
import defpackage.yl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    public static final void LazyLayout(iy iyVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        Composer startRestartGroup = composer.startRestartGroup(1055276397);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(lazyLayoutMeasurePolicy) : startRestartGroup.changedInstance(lazyLayoutMeasurePolicy) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            modifier2 = modifier;
            if (i5 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055276397, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState;
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-933153643, true, new pm(lazyLayoutPrefetchState3, modifier2, lazyLayoutMeasurePolicy, SnapshotStateKt.rememberUpdatedState(iyVar, startRestartGroup, i3 & 14), 2), startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new yl(iyVar, modifier2, lazyLayoutPrefetchState2, lazyLayoutMeasurePolicy, i, i2, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyLayout$lambda$0(iy iyVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, my myVar, int i, int i2, Composer composer, int i3) {
        LazyLayout(iyVar, modifier, lazyLayoutPrefetchState, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyLayout$lambda$1(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, State state, SaveableStateHolder saveableStateHolder, Composer composer, int i) {
        SubcomposeLayoutState subcomposeLayoutState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-933153643, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new t6(state, 5));
            composer.updateRememberedValue(rememberedValue);
        }
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(rememberedValue2);
        }
        SubcomposeLayoutState subcomposeLayoutState2 = (SubcomposeLayoutState) rememberedValue2;
        if (lazyLayoutPrefetchState != null) {
            composer.startReplaceGroup(1743490539);
            Object prefetchScheduler$foundation = lazyLayoutPrefetchState.getPrefetchScheduler$foundation();
            if (prefetchScheduler$foundation == null) {
                composer.startReplaceGroup(887527095);
                prefetchScheduler$foundation = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer, 0);
            } else {
                composer.startReplaceGroup(887526010);
            }
            composer.endReplaceGroup();
            Object obj = prefetchScheduler$foundation;
            Object[] objArr = {lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState2, obj};
            boolean changed = composer.changed(lazyLayoutPrefetchState) | composer.changedInstance(lazyLayoutItemContentFactory) | composer.changedInstance(subcomposeLayoutState2) | composer.changedInstance(obj);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                subcomposeLayoutState = subcomposeLayoutState2;
                Object x4Var = new x4(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, obj, 4);
                composer.updateRememberedValue(x4Var);
                rememberedValue3 = x4Var;
            } else {
                subcomposeLayoutState = subcomposeLayoutState2;
            }
            EffectsKt.DisposableEffect(objArr, (ky) rememberedValue3, composer, 0);
        } else {
            subcomposeLayoutState = subcomposeLayoutState2;
            composer.startReplaceGroup(1737291469);
        }
        composer.endReplaceGroup();
        Modifier traversablePrefetchState = LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, lazyLayoutPrefetchState);
        boolean changed2 = composer.changed(lazyLayoutItemContentFactory) | composer.changed(lazyLayoutMeasurePolicy);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new r4(8, lazyLayoutItemContentFactory, lazyLayoutMeasurePolicy);
            composer.updateRememberedValue(rememberedValue4);
        }
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, traversablePrefetchState, (my) rememberedValue4, composer, SubcomposeLayoutState.$stable, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutItemProvider LazyLayout$lambda$1$0$0(State state) {
        return (LazyLayoutItemProvider) ((iy) state.getValue()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LazyLayout$lambda$1$2$0(final LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler, DisposableEffectScope disposableEffectScope) {
        lazyLayoutPrefetchState.setPrefetchHandleProvider$foundation(new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler));
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$lambda$1$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
                if (prefetchHandleProvider$foundation != null) {
                    prefetchHandleProvider$foundation.onDisposed();
                }
                LazyLayoutPrefetchState.this.setPrefetchHandleProvider$foundation(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult LazyLayout$lambda$1$3$0(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return lazyLayoutMeasurePolicy.mo861measure0kLqBqw(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), constraints.m7570unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyLayout$lambda$2(iy iyVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, int i, int i2, Composer composer, int i3) {
        LazyLayout(iyVar, modifier, lazyLayoutPrefetchState, lazyLayoutMeasurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    @er
    public static final /* synthetic */ void LazyLayout(iy iyVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        Composer startRestartGroup = composer.startRestartGroup(2002163445);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            LazyLayoutPrefetchState lazyLayoutPrefetchState3 = i5 != 0 ? null : lazyLayoutPrefetchState;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:68)");
            }
            LazyLayout(iyVar, modifier3, lazyLayoutPrefetchState3, new LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0(myVar), startRestartGroup, i3 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new yl(iyVar, modifier2, lazyLayoutPrefetchState2, (Object) myVar, i, i2, 2));
        }
    }
}
