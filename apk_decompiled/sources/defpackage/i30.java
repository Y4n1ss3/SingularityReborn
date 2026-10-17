package defpackage;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class i30 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ GridCells e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ LazyGridState g;
    public final /* synthetic */ PaddingValues h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Arrangement.Horizontal j;
    public final /* synthetic */ Arrangement.Vertical k;
    public final /* synthetic */ FlingBehavior l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ky n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ i30(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2) {
        this.e = gridCells;
        this.f = modifier;
        this.g = lazyGridState;
        this.h = paddingValues;
        this.i = z;
        this.j = horizontal;
        this.k = vertical;
        this.l = flingBehavior;
        this.m = z2;
        this.n = kyVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 LazyVerticalGrid$lambda$1;
        w01 LazyHorizontalGrid$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                GridCells gridCells = this.e;
                Modifier modifier = this.f;
                LazyGridState lazyGridState = this.g;
                PaddingValues paddingValues = this.h;
                boolean z = this.i;
                Arrangement.Horizontal horizontal = this.j;
                LazyVerticalGrid$lambda$1 = LazyGridDslKt.LazyVerticalGrid$lambda$1(gridCells, modifier, lazyGridState, paddingValues, z, this.k, horizontal, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return LazyVerticalGrid$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LazyHorizontalGrid$lambda$1 = LazyGridDslKt.LazyHorizontalGrid$lambda$1(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return LazyHorizontalGrid$lambda$1;
        }
    }

    public /* synthetic */ i30(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, ky kyVar, int i, int i2) {
        this.e = gridCells;
        this.f = modifier;
        this.g = lazyGridState;
        this.h = paddingValues;
        this.i = z;
        this.k = vertical;
        this.j = horizontal;
        this.l = flingBehavior;
        this.m = z2;
        this.n = kyVar;
        this.o = i;
        this.p = i2;
    }
}
