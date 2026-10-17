package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollModifierKt {
    public static final Modifier nestedScroll(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.then(new NestedScrollElement(nestedScrollConnection, nestedScrollDispatcher));
    }

    public static /* synthetic */ Modifier nestedScroll$default(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return nestedScroll(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }
}
