package androidx.compose.ui.contentcapture;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ContentCaptureManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean isEnabled = true;

        private Companion() {
        }

        public final boolean isEnabled() {
            return isEnabled;
        }

        public final void setEnabled(boolean z) {
            isEnabled = z;
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }
    }
}
