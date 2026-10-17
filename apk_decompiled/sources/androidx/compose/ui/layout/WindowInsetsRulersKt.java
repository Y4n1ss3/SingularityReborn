package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WindowInsetsRulersKt {
    private static final RectRulers NeverProvidedRectRulers = RectRulersKt.RectRulers();

    public static final List<RectRulers> getDisplayCutoutBounds(Placeable.PlacementScope placementScope) {
        return WindowInsetsRulers_androidKt.findDisplayCutouts(placementScope);
    }

    public static final RectRulers getNeverProvidedRectRulers() {
        return NeverProvidedRectRulers;
    }
}
