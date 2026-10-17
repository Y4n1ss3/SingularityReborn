package androidx.compose.ui.graphics.colorspace;

import defpackage.f30;
import defpackage.ky;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rgb$oetf$1 extends f30 implements ky {
    final /* synthetic */ Rgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public final Double invoke(double d) {
        float f;
        float f2;
        double invoke = this.this$0.getOetfOrig$ui_graphics().invoke(d);
        f = this.this$0.min;
        f2 = this.this$0.max;
        return Double.valueOf(y80.f(invoke, f, f2));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
