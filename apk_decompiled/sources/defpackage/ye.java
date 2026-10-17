package defpackage;

import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ye implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ye(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f, float f2, Shape shape, long j, int i, int i2) {
        this.l = bottomSheetDefaults;
        this.e = modifier;
        this.f = f;
        this.g = f2;
        this.i = shape;
        this.h = j;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 DragHandle_lgZ2HuY$lambda$2;
        w01 PrimaryIndicator_10LGxhE$lambda$1;
        int i = this.d;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DragHandle_lgZ2HuY$lambda$2 = BottomSheetDefaults.DragHandle_lgZ2HuY$lambda$2((BottomSheetDefaults) obj3, this.e, this.f, this.g, this.i, this.h, this.j, this.k, (Composer) obj, intValue);
                return DragHandle_lgZ2HuY$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                PrimaryIndicator_10LGxhE$lambda$1 = TabRowDefaults.PrimaryIndicator_10LGxhE$lambda$1((TabRowDefaults) obj3, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue2);
                return PrimaryIndicator_10LGxhE$lambda$1;
        }
    }

    public /* synthetic */ ye(TabRowDefaults tabRowDefaults, Modifier modifier, float f, float f2, long j, Shape shape, int i, int i2) {
        this.l = tabRowDefaults;
        this.e = modifier;
        this.f = f;
        this.g = f2;
        this.h = j;
        this.i = shape;
        this.j = i;
        this.k = i2;
    }
}
