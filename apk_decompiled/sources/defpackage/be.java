package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ PopupPositionProvider e;
    public final /* synthetic */ my f;
    public final /* synthetic */ BasicTooltipState g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ my k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ be(PopupPositionProvider popupPositionProvider, my myVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, my myVar2, int i, int i2, int i3) {
        this.d = i3;
        this.e = popupPositionProvider;
        this.f = myVar;
        this.g = basicTooltipState;
        this.h = modifier;
        this.i = z;
        this.j = z2;
        this.k = myVar2;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicTooltipBox$lambda$2;
        w01 BasicTooltipBoxAndroid$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicTooltipBox$lambda$2 = BasicTooltipKt.BasicTooltipBox$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue);
                return BasicTooltipBox$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BasicTooltipBoxAndroid$lambda$0 = BasicTooltip_androidKt.BasicTooltipBoxAndroid$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue2);
                return BasicTooltipBoxAndroid$lambda$0;
        }
    }
}
