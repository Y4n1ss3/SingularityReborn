package androidx.compose.ui.graphics.colorspace;

import defpackage.f30;
import defpackage.ky;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rgb$eotf$1 extends f30 implements ky {
    final /* synthetic */ Rgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public final Double invoke(double d) {
        float f;
        float f2;
        DoubleFunction eotfOrig$ui_graphics = this.this$0.getEotfOrig$ui_graphics();
        f = this.this$0.min;
        f2 = this.this$0.max;
        return Double.valueOf(eotfOrig$ui_graphics.invoke(y80.f(d, f, f2)));
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
