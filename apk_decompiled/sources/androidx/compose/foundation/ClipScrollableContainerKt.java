package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = Dp.m7611constructorimpl(30.0f);

    public static final Modifier clipScrollableContainer(Modifier modifier, Orientation orientation) {
        return modifier.then(orientation == Orientation.Vertical ? ClipKt.clip(Modifier.Companion, VerticalScrollableClipShape.INSTANCE) : ClipKt.clip(Modifier.Companion, HorizontalScrollableClipShape.INSTANCE));
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
