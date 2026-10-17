package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qe0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ PagerState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ PaddingValues g;
    public final /* synthetic */ PageSize h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ TargetedFlingBehavior k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ky n;
    public final /* synthetic */ NestedScrollConnection o;
    public final /* synthetic */ SnapPosition p;
    public final /* synthetic */ OverscrollEffect q;
    public final /* synthetic */ oy r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    public /* synthetic */ qe0(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Object obj, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, ky kyVar, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, oy oyVar, int i2, int i3, int i4, int i5) {
        this.d = i5;
        this.e = pagerState;
        this.f = modifier;
        this.g = paddingValues;
        this.h = pageSize;
        this.i = i;
        this.j = f;
        this.v = obj;
        this.k = targetedFlingBehavior;
        this.l = z;
        this.m = z2;
        this.n = kyVar;
        this.o = nestedScrollConnection;
        this.p = snapPosition;
        this.q = overscrollEffect;
        this.r = oyVar;
        this.s = i2;
        this.t = i3;
        this.u = i4;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 VerticalPager__8jOkeI$lambda$0;
        w01 HorizontalPager__8jOkeI$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VerticalPager__8jOkeI$lambda$0 = PagerKt.VerticalPager__8jOkeI$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, (Alignment.Horizontal) this.v, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, intValue);
                return VerticalPager__8jOkeI$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                HorizontalPager__8jOkeI$lambda$0 = PagerKt.HorizontalPager__8jOkeI$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, (Alignment.Vertical) this.v, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, intValue2);
                return HorizontalPager__8jOkeI$lambda$0;
        }
    }
}
