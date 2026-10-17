package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.dq;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<iy> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", (my) null, 2, (dq) (0 == true ? 1 : 0));

    public static final boolean equalsIncludingNaN(float f, float f2) {
        return (Float.isNaN(f) && Float.isNaN(f2)) || f == f2;
    }

    public static final SemanticsPropertyKey<iy> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    public static final boolean isPlatformMagnifierSupported(int i) {
        return i >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }

    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m293magnifierUpNRX3w(Modifier modifier, ky kyVar, ky kyVar2, ky kyVar3, float f, long j, float f2, float f3, boolean z) {
        return m296magnifierjPUL71Q$default(modifier, kyVar, kyVar2, kyVar3, f, false, j, f2, f3, z, null, Fields.RotationY, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m294magnifierUpNRX3w$default(Modifier modifier, ky kyVar, ky kyVar2, ky kyVar3, float f, long j, float f2, float f3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar2 = null;
        }
        if ((i & 4) != 0) {
            kyVar3 = null;
        }
        if ((i & 8) != 0) {
            f = Float.NaN;
        }
        if ((i & 16) != 0) {
            j = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
        }
        if ((i & 32) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 64) != 0) {
            f3 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            z = true;
        }
        return m293magnifierUpNRX3w(modifier, kyVar, kyVar2, kyVar3, f, j, f2, f3, z);
    }

    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m295magnifierjPUL71Q(Modifier modifier, ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(kyVar, kyVar2, kyVar3, f, z, j, f2, f3, z2, platformMagnifierFactory == null ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m296magnifierjPUL71Q$default(Modifier modifier, ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar2 = null;
        }
        if ((i & 4) != 0) {
            kyVar3 = null;
        }
        if ((i & 8) != 0) {
            f = Float.NaN;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            j = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
        }
        if ((i & 64) != 0) {
            f2 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & Fields.SpotShadowColor) != 0) {
            f3 = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & Fields.RotationX) != 0) {
            z2 = true;
        }
        if ((i & Fields.RotationY) != 0) {
            platformMagnifierFactory = null;
        }
        return m295magnifierjPUL71Q(modifier, kyVar, kyVar2, kyVar3, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }
}
