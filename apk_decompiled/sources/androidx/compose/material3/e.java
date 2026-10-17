package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.gi0;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
        this.d = 0;
        this.e = placeable;
        this.g = measureScope;
        this.f = placeable2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$2;
        w01 invoke$lambda$1$lambda$0;
        w01 w01Var;
        int i = this.d;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$2 = BadgeKt$BadgedBox$1$1.measure_3p2s80s$lambda$2((Placeable) obj4, (MeasureScope) obj2, (Placeable) obj3, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$2;
            case 1:
                invoke$lambda$1$lambda$0 = DateRangePickerKt$VerticalMonthsList$1.invoke$lambda$1$lambda$0((Long) obj4, (Long) obj3, (my) obj2, ((Long) obj).longValue());
                return invoke$lambda$1$lambda$0;
            default:
                w01Var = EnterAlwaysSearchBarScrollBehavior.settleSearchBar_OhffZ5M$lambda$4((gi0) obj4, (EnterAlwaysSearchBarScrollBehavior) obj3, (gi0) obj2, (AnimationScope) obj);
                return w01Var;
        }
    }

    public /* synthetic */ e(Serializable serializable, Object obj, Object obj2, int i) {
        this.d = i;
        this.e = serializable;
        this.f = obj;
        this.g = obj2;
    }
}
