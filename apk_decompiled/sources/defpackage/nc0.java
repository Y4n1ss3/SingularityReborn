package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class nc0 implements ky {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ nc0(int i, int i2, ta0 ta0Var, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.e = i;
        this.f = i2;
        this.g = ta0Var;
        this.h = nearestRangeKeyIndexMap;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 lambda$1$0;
        w01 fitInside$lambda$0$1;
        int i = this.d;
        Object obj2 = this.h;
        int i2 = this.f;
        int i3 = this.e;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                lambda$1$0 = NearestRangeKeyIndexMap.lambda$1$0(i3, i2, (ta0) obj3, (NearestRangeKeyIndexMap) obj2, (IntervalList.Interval) obj);
                return lambda$1$0;
            default:
                fitInside$lambda$0$1 = RulerAlignmentKt.fitInside$lambda$0$1((RectRulers) obj3, i3, i2, (Placeable) obj2, (Placeable.PlacementScope) obj);
                return fitInside$lambda$0$1;
        }
    }

    public /* synthetic */ nc0(RectRulers rectRulers, int i, int i2, Placeable placeable) {
        this.g = rectRulers;
        this.e = i;
        this.f = i2;
        this.h = placeable;
    }
}
