package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h30 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ LazyListState f;
    public final /* synthetic */ PaddingValues g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ FlingBehavior i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ OverscrollEffect k;
    public final /* synthetic */ ky l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ h30(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, ky kyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = lazyListState;
        this.g = paddingValues;
        this.h = z;
        this.o = obj;
        this.p = obj2;
        this.i = flingBehavior;
        this.j = z2;
        this.k = overscrollEffect;
        this.l = kyVar;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 LazyColumn$lambda$0;
        w01 LazyRow$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LazyColumn$lambda$0 = LazyDslKt.LazyColumn$lambda$0(this.e, this.f, this.g, this.h, (Arrangement.Vertical) this.o, (Alignment.Horizontal) this.p, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue);
                return LazyColumn$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LazyRow$lambda$0 = LazyDslKt.LazyRow$lambda$0(this.e, this.f, this.g, this.h, (Arrangement.Horizontal) this.o, (Alignment.Vertical) this.p, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue2);
                return LazyRow$lambda$0;
        }
    }
}
