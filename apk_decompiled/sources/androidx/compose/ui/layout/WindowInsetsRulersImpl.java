package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class WindowInsetsRulersImpl implements WindowInsetsRulers {
    private final RectRulers current;
    private final RectRulers maximum;
    private final String name;

    public WindowInsetsRulersImpl(String str) {
        this.name = str;
        this.current = RectRulersKt.RectRulers(str);
        this.maximum = RectRulersKt.RectRulers(str + " maximum");
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public WindowInsetsAnimation getAnimation(Placeable.PlacementScope placementScope) {
        return WindowInsetsRulers_androidKt.findInsetsAnimationProperties(placementScope, this);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getMaximum() {
        return this.maximum;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
