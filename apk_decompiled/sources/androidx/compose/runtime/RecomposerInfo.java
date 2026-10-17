package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import defpackage.iw;
import defpackage.p10;
import defpackage.ur0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface RecomposerInfo {
    public static final /* synthetic */ Companion Companion = Companion.$$INSTANCE;

    long getChangeCount();

    default ur0 getErrorState() {
        return Companion.DefaultErrorStateFlow;
    }

    boolean getHasPendingWork();

    iw getState();

    default CompositionObserverHandle observe(CompositionRegistrationObserver compositionRegistrationObserver) {
        return null;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ur0 DefaultErrorStateFlow = p10.b(null);

        private Companion() {
        }

        private static /* synthetic */ void getDefaultErrorStateFlow$annotations() {
        }
    }

    static /* synthetic */ void getErrorState$annotations() {
    }
}
