package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ViewRootForInspector {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getSubCompositionView();
        }

        @Deprecated
        public static View getViewRoot(ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getViewRoot();
        }
    }

    default AbstractComposeView getSubCompositionView() {
        return null;
    }

    default View getViewRoot() {
        return null;
    }
}
