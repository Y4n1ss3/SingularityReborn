package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.RootForTest;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getHasPendingMeasureOrLayout();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static ky onViewCreatedCallback;

        private Companion() {
        }

        public final ky getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(ky kyVar) {
            onViewCreatedCallback = kyVar;
        }

        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }
    }
}
