package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k90 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ SheetState g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ float l;
    public final /* synthetic */ long m;
    public final /* synthetic */ my n;
    public final /* synthetic */ ModalBottomSheetProperties o;
    public final /* synthetic */ ny p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    public /* synthetic */ k90(iy iyVar, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, my myVar, Object obj, ModalBottomSheetProperties modalBottomSheetProperties, ny nyVar, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.e = iyVar;
        this.f = modifier;
        this.g = sheetState;
        this.h = f;
        this.i = shape;
        this.j = j;
        this.k = j2;
        this.l = f2;
        this.m = j3;
        this.n = myVar;
        this.t = obj;
        this.o = modalBottomSheetProperties;
        this.p = nyVar;
        this.q = i;
        this.r = i2;
        this.s = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ModalBottomSheet_dYc4hso$lambda$14;
        w01 ModalBottomSheet_dYc4hso$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ModalBottomSheet_dYc4hso$lambda$14 = ModalBottomSheetKt.ModalBottomSheet_dYc4hso$lambda$14(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (my) this.t, this.o, this.p, this.q, this.r, this.s, (Composer) obj, intValue);
                return ModalBottomSheet_dYc4hso$lambda$14;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ModalBottomSheet_dYc4hso$lambda$0 = ModalBottomSheet_androidKt.ModalBottomSheet_dYc4hso$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (WindowInsets) this.t, this.o, this.p, this.q, this.r, this.s, (Composer) obj, intValue2);
                return ModalBottomSheet_dYc4hso$lambda$0;
        }
    }
}
