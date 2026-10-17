package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOwnerImplKt {
    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m4416is1dFocusSearch3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s()) || FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s());
    }
}
