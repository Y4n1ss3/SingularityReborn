package androidx.compose.runtime;

import defpackage.dq;
import defpackage.er;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HotReloader {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime();
        }

        public final void clearErrors() {
            Recomposer.Companion.clearErrors$runtime();
        }

        @er
        public final List<RecomposerErrorInfo> getCurrentErrors() {
            return Recomposer.Companion.getCurrentErrors$runtime();
        }

        public final List<RecomposerErrorInformation> getRecomposerErrors() {
            return Recomposer.Companion.getRecomposerErrors$runtime();
        }

        public final void invalidateGroupsWithKey(int i) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime(i);
        }

        public final void simulateHotReload$runtime(Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        private Companion() {
        }
    }
}
