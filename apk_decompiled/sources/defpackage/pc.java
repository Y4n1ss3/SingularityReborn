package defpackage;

import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pc implements MarqueeSpacing {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ pc(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i, int i2) {
        int MarqueeSpacing_0680j_4$lambda$0;
        int fractionOfContainer$lambda$0;
        int i3 = this.a;
        float f = this.b;
        switch (i3) {
            case 0:
                MarqueeSpacing_0680j_4$lambda$0 = BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$0(f, density, i, i2);
                return MarqueeSpacing_0680j_4$lambda$0;
            default:
                fractionOfContainer$lambda$0 = MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f, density, i, i2);
                return fractionOfContainer$lambda$0;
        }
    }
}
