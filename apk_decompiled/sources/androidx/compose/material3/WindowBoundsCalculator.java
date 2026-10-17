package androidx.compose.material3;

import android.view.View;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowBoundsCalculator {
    public static final int $stable = 8;
    private final View view;

    public WindowBoundsCalculator(View view) {
        this.view = view;
    }

    public final IntRect getVisibleWindowBounds() {
        IntRect windowBounds;
        windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(this.view);
        return windowBounds;
    }
}
