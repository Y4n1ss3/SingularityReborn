package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidConfig implements ScrollConfig {
    public static final int $stable = 8;
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo387calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        float f = -getVerticalScrollFactor$foundation(density);
        float f2 = -getHorizontalScrollFactor$foundation(density);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset m4505boximpl = Offset.m4505boximpl(Offset.Companion.m4532getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m4505boximpl = Offset.m4505boximpl(Offset.m4521plusMKHz9U(m4505boximpl.m4526unboximpl(), changes.get(i).m6103getScrollDeltaF1C5BW0()));
        }
        long m4526unboximpl = m4505boximpl.m4526unboximpl();
        float intBitsToFloat = Float.intBitsToFloat((int) (m4526unboximpl >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m4526unboximpl & 4294967295L)) * f;
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public final float getHorizontalScrollFactor$foundation(Density density) {
        return ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration);
    }

    public final float getVerticalScrollFactor$foundation(Density density) {
        return ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration);
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }
}
