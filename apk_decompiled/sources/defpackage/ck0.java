package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ck0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ RectRulers e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Measurable h;

    public /* synthetic */ ck0(RectRulers rectRulers, int i, int i2, Measurable measurable, int i3) {
        this.d = i3;
        this.e = rectRulers;
        this.f = i;
        this.g = i2;
        this.h = measurable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 fitInside$lambda$0$0;
        w01 fitOutside$lambda$0$0;
        switch (this.d) {
            case 0:
                fitInside$lambda$0$0 = RulerAlignmentKt.fitInside$lambda$0$0(this.e, this.f, this.g, this.h, (Placeable.PlacementScope) obj);
                return fitInside$lambda$0$0;
            default:
                fitOutside$lambda$0$0 = RulerAlignmentKt.fitOutside$lambda$0$0(this.e, this.f, this.g, this.h, (Placeable.PlacementScope) obj);
                return fitOutside$lambda$0$0;
        }
    }
}
