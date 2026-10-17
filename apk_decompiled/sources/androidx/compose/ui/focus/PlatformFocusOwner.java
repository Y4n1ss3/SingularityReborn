package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PlatformFocusOwner {
    void clearOwnerFocus();

    Rect getEmbeddedViewFocusRect();

    /* renamed from: moveFocusInChildren-3ESFkO8, reason: not valid java name */
    boolean mo4457moveFocusInChildren3ESFkO8(int i);

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo4458requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect);

    default void focusTargetAvailable() {
    }
}
