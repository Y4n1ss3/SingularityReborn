package androidx.compose.ui.focus;

import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FocusManager {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: clearFocus");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        focusManager.clearFocus(z);
    }

    void clearFocus(boolean z);

    /* renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo4403moveFocus3ESFkO8(int i);
}
