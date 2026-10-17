package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AspectRatioKt {
    public static final Modifier aspectRatio(Modifier modifier, float f, boolean z) {
        return modifier.then(new AspectRatioElement(f, z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f, z) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier aspectRatio$default(Modifier modifier, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aspectRatio(modifier, f, z);
    }

    /* renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m664isSatisfiedByNN6EwU(long j, int i, int i2) {
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        if (i > Constraints.m7564getMaxWidthimpl(j) || m7566getMinWidthimpl > i) {
            return false;
        }
        return i2 <= Constraints.m7563getMaxHeightimpl(j) && Constraints.m7565getMinHeightimpl(j) <= i2;
    }
}
