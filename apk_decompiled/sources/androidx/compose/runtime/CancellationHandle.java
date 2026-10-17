package androidx.compose.runtime;

import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface CancellationHandle {
    public static final Companion Companion = Companion.$$INSTANCE;

    void cancel();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CancellationHandle Empty = new o(5);

        private Companion() {
        }

        public final CancellationHandle getEmpty$runtime() {
            return Empty;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Empty$lambda$0() {
        }
    }
}
