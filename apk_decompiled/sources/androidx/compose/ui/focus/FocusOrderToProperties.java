package androidx.compose.ui.focus;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final ky focusOrderReceiver;

    public FocusOrderToProperties(ky kyVar) {
        this.focusOrderReceiver = kyVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    public final ky getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
