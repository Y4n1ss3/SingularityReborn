package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedElementKt {
    private static final SpringSpec<Offset> DefaultMomentumSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(3.0f) << 32) | (Float.floatToRawIntBits(3.0f) & 4294967295L))), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasVisibleContent(List<SharedElementEntry> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toOffset-TH1AsA0, reason: not valid java name */
    public static final long m86toOffsetTH1AsA0(long j) {
        float m7849getXimpl = Velocity.m7849getXimpl(j);
        float m7850getYimpl = Velocity.m7850getYimpl(j);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(m7850getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m7849getXimpl) << 32));
    }
}
