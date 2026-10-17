package androidx.compose.material3;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.ms;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RippleKt {
    private static final RippleNodeFactory DefaultBoundedRipple;
    private static final RippleNodeFactory DefaultUnboundedRipple;
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new ms(24), 1, null);

    static {
        Dp.Companion companion = Dp.Companion;
        float m7631getUnspecifiedD9Ej5fM = companion.m7631getUnspecifiedD9Ej5fM();
        Color.Companion companion2 = Color.Companion;
        DefaultBoundedRipple = new RippleNodeFactory(true, m7631getUnspecifiedD9Ej5fM, companion2.m4797getUnspecified0d7_KjU(), (dq) null);
        DefaultUnboundedRipple = new RippleNodeFactory(false, companion.m7631getUnspecifiedD9Ej5fM(), companion2.m4797getUnspecified0d7_KjU(), (dq) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleConfiguration LocalRippleConfiguration$lambda$0() {
        return new RippleConfiguration(0L, null, 3, null);
    }

    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m2296rippleH2RKhps(boolean z, float f, long j) {
        return (Dp.m7616equalsimpl0(f, Dp.Companion.m7631getUnspecifiedD9Ej5fM()) && Color.m4762equalsimpl0(j, Color.Companion.m4797getUnspecified0d7_KjU())) ? z ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(z, f, j, (dq) null);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m2297rippleH2RKhps$default(boolean z, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        return m2296rippleH2RKhps(z, f, j);
    }

    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m2298ripplewH6b6FI(ColorProducer colorProducer, boolean z, float f) {
        return new RippleNodeFactory(z, f, colorProducer, (dq) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m2299ripplewH6b6FI$default(ColorProducer colorProducer, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        return m2298ripplewH6b6FI(colorProducer, z, f);
    }
}
