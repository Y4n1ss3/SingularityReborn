package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ok(WindowInsets windowInsets, my myVar, my myVar2, my myVar3, int i, my myVar4, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, my myVar5) {
        this.f = windowInsets;
        this.g = myVar;
        this.h = myVar2;
        this.i = myVar3;
        this.e = i;
        this.j = myVar4;
        this.k = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.l = myVar5;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$5;
        MeasureResult ScaffoldLayout_FMILGgc$lambda$15$lambda$14;
        int i = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                invoke$lambda$5 = ComposableLambdaImpl.invoke$lambda$5((ComposableLambdaImpl) obj3, this.g, this.h, this.i, this.j, this.k, this.l, this.e, (Composer) obj, intValue);
                return invoke$lambda$5;
            default:
                ScaffoldLayout_FMILGgc$lambda$15$lambda$14 = ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14((WindowInsets) obj3, (my) this.g, (my) this.h, (my) this.i, this.e, (my) this.j, (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) this.k, (my) this.l, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                return ScaffoldLayout_FMILGgc$lambda$15$lambda$14;
        }
    }

    public /* synthetic */ ok(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f = composableLambdaImpl;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.l = obj6;
        this.e = i;
    }
}
