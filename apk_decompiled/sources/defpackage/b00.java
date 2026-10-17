package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b00 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ky h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ b00(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2) {
        this.d = 0;
        this.f = z;
        this.h = kyVar;
        this.e = modifier;
        this.g = z2;
        this.k = shape;
        this.l = iconToggleButtonColors;
        this.m = borderStroke;
        this.n = mutableInteractionSource;
        this.o = myVar;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OutlinedIconToggleButton$lambda$21;
        w01 LazyColumn$lambda$1;
        w01 LazyRow$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OutlinedIconToggleButton$lambda$21 = IconButtonKt.OutlinedIconToggleButton$lambda$21(this.f, this.h, this.e, this.g, (Shape) this.k, (IconToggleButtonColors) this.l, (BorderStroke) this.m, (MutableInteractionSource) this.n, (my) this.o, this.i, this.j, (Composer) obj, intValue);
                return OutlinedIconToggleButton$lambda$21;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                LazyColumn$lambda$1 = LazyDslKt.LazyColumn$lambda$1(this.e, (LazyListState) this.k, (PaddingValues) this.l, this.f, (Arrangement.Vertical) this.m, (Alignment.Horizontal) this.n, (FlingBehavior) this.o, this.g, this.h, this.i, this.j, (Composer) obj, intValue2);
                return LazyColumn$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                LazyRow$lambda$1 = LazyDslKt.LazyRow$lambda$1(this.e, (LazyListState) this.k, (PaddingValues) this.l, this.f, (Arrangement.Horizontal) this.m, (Alignment.Vertical) this.n, (FlingBehavior) this.o, this.g, this.h, this.i, this.j, (Composer) obj, intValue3);
                return LazyRow$lambda$1;
        }
    }

    public /* synthetic */ b00(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.k = lazyListState;
        this.l = paddingValues;
        this.f = z;
        this.m = obj;
        this.n = obj2;
        this.o = flingBehavior;
        this.g = z2;
        this.h = kyVar;
        this.i = i;
        this.j = i2;
    }
}
