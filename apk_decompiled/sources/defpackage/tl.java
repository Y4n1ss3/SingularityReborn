package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class tl implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ ty l;
    public final /* synthetic */ ty m;

    public /* synthetic */ tl(ContextMenuState contextMenuState, iy iyVar, ky kyVar, Modifier modifier, boolean z, iy iyVar2, my myVar, int i, int i2) {
        this.j = contextMenuState;
        this.f = iyVar;
        this.l = kyVar;
        this.g = modifier;
        this.e = z;
        this.k = iyVar2;
        this.m = myVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ContextMenuArea$lambda$3;
        w01 PullToRefreshBox$lambda$1;
        w01 Slider$lambda$7;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ContextMenuArea$lambda$3 = ContextMenuAreaKt.ContextMenuArea$lambda$3((ContextMenuState) this.j, (iy) this.f, (ky) this.l, this.g, this.e, (iy) this.k, (my) this.m, this.h, this.i, (Composer) obj, intValue);
                return ContextMenuArea$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                PullToRefreshBox$lambda$1 = PullToRefreshKt.PullToRefreshBox$lambda$1(this.e, (iy) this.f, this.g, (PullToRefreshState) this.j, (Alignment) this.k, (ny) this.l, (ny) this.m, this.h, this.i, (Composer) obj, intValue2);
                return PullToRefreshBox$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Slider$lambda$7 = SliderKt.Slider$lambda$7((SliderState) this.j, this.g, this.e, (SliderColors) this.f, (MutableInteractionSource) this.k, (ny) this.l, (ny) this.m, this.h, this.i, (Composer) obj, intValue3);
                return Slider$lambda$7;
        }
    }

    public /* synthetic */ tl(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, ny nyVar, ny nyVar2, int i, int i2) {
        this.j = sliderState;
        this.g = modifier;
        this.e = z;
        this.f = sliderColors;
        this.k = mutableInteractionSource;
        this.l = nyVar;
        this.m = nyVar2;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ tl(boolean z, iy iyVar, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, ny nyVar, ny nyVar2, int i, int i2) {
        this.e = z;
        this.f = iyVar;
        this.g = modifier;
        this.j = pullToRefreshState;
        this.k = alignment;
        this.l = nyVar;
        this.m = nyVar2;
        this.h = i;
        this.i = i2;
    }
}
