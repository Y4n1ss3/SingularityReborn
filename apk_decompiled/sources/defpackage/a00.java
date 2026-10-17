package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.WideNavigationRailColors;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a00 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ my i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ a00(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, my myVar, WindowInsets windowInsets, Arrangement.Vertical vertical, my myVar2, int i) {
        this.e = modifier;
        this.f = z;
        this.g = z2;
        this.k = wideNavigationRailColors;
        this.h = shape;
        this.i = myVar;
        this.l = windowInsets;
        this.m = vertical;
        this.n = myVar2;
        this.j = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SurfaceIconToggleButton$lambda$27;
        w01 WideNavigationRailLayout$lambda$12;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SurfaceIconToggleButton$lambda$27 = IconButtonKt.SurfaceIconToggleButton$lambda$27(this.f, (ky) this.k, this.e, this.g, this.h, (IconToggleButtonColors) this.l, (BorderStroke) this.m, (MutableInteractionSource) this.n, this.i, this.j, (Composer) obj, intValue);
                return SurfaceIconToggleButton$lambda$27;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                WideNavigationRailLayout$lambda$12 = WideNavigationRailKt.WideNavigationRailLayout$lambda$12(this.e, this.f, this.g, (WideNavigationRailColors) this.k, this.h, this.i, (WindowInsets) this.l, (Arrangement.Vertical) this.m, (my) this.n, this.j, (Composer) obj, intValue2);
                return WideNavigationRailLayout$lambda$12;
        }
    }

    public /* synthetic */ a00(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i) {
        this.f = z;
        this.k = kyVar;
        this.e = modifier;
        this.g = z2;
        this.h = shape;
        this.l = iconToggleButtonColors;
        this.m = borderStroke;
        this.n = mutableInteractionSource;
        this.i = myVar;
        this.j = i;
    }
}
