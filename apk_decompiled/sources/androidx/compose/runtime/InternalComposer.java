package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import defpackage.fb0;
import defpackage.iy;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class InternalComposer implements Composer {
    public static final int $stable = 0;

    public abstract void changesApplied$runtime();

    /* renamed from: composeContent--ZbOJvo$runtime */
    public abstract void mo3841composeContentZbOJvo$runtime(fb0 fb0Var, my myVar, ShouldPauseCallback shouldPauseCallback);

    public abstract void deactivate$runtime();

    public abstract void dispose$runtime();

    public abstract void endReuseFromRoot$runtime();

    public abstract boolean forceRecomposeScopes$runtime();

    public abstract boolean getAreChildrenComposing$runtime();

    public abstract RecomposeScopeImpl getCurrentRecomposeScope$runtime();

    public abstract Changes getDeferredChanges$runtime();

    public abstract CompositionErrorContextImpl getErrorContext$runtime();

    public abstract boolean getHasPendingChanges$runtime();

    public abstract boolean getSourceMarkersEnabled$runtime();

    public abstract boolean isComposing$runtime();

    public abstract int parentKey$runtime();

    public abstract List<ComposeStackTraceFrame> parentStackTrace$runtime();

    public abstract void prepareCompose$runtime(iy iyVar);

    /* renamed from: recompose-aFTiNEg$runtime */
    public abstract boolean mo3842recomposeaFTiNEg$runtime(fb0 fb0Var, ShouldPauseCallback shouldPauseCallback);

    public abstract ComposeStackTrace stackTraceForValue$runtime(Object obj);

    public abstract int stacksSize$runtime();

    public abstract void startReuseFromRoot$runtime();

    public abstract boolean tryImminentInvalidation$runtime(RecomposeScopeImpl recomposeScopeImpl, Object obj);

    /* renamed from: updateComposerInvalidations-RY85e9Y$runtime */
    public abstract void mo3843updateComposerInvalidationsRY85e9Y$runtime(fb0 fb0Var);

    public abstract void verifyConsistent$runtime();
}
