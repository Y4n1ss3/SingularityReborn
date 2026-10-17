package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClicksCounter {
    public static final int $stable = 8;
    private int clicks;
    private PointerInputChange prevClick;
    private final ViewConfiguration viewConfiguration;

    public ClicksCounter(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public final int getClicks() {
        return this.clicks;
    }

    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean positionIsTolerable(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        boolean distanceIsTolerable;
        distanceIsTolerable = SelectionGesturesKt.distanceIsTolerable(this.viewConfiguration, pointerInputChange, pointerInputChange2);
        return distanceIsTolerable;
    }

    public final void setClicks(int i) {
        this.clicks = i;
    }

    public final void setPrevClick(PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean timeIsTolerable(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return pointerInputChange2.getUptimeMillis() - pointerInputChange.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis();
    }

    public final void update(PointerEvent pointerEvent) {
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
