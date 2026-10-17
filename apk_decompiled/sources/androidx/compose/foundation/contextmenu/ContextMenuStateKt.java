package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuStateKt {
    private static final String UNSPECIFIED_OFFSET_ERROR_MESSAGE = "ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.";

    public static final void close(ContextMenuState contextMenuState) {
        contextMenuState.setStatus(ContextMenuState.Status.Closed.INSTANCE);
    }
}
