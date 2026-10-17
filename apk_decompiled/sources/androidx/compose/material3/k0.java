package androidx.compose.material3;

import defpackage.iy;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements iy {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ SheetState e;
    public final /* synthetic */ un f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k0(SheetState sheetState, un unVar, iy iyVar) {
        this.e = sheetState;
        this.g = iyVar;
        this.f = unVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 invoke$lambda$1$lambda$0;
        boolean invoke$lambda$7$lambda$6$lambda$5$lambda$3;
        int i = this.d;
        Object obj = this.g;
        un unVar = this.f;
        SheetState sheetState = this.e;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.invoke$lambda$1$lambda$0(sheetState, (iy) obj, unVar);
                return invoke$lambda$1$lambda$0;
            default:
                invoke$lambda$7$lambda$6$lambda$5$lambda$3 = ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.invoke$lambda$7$lambda$6$lambda$5$lambda$3(sheetState, unVar, (SheetState) obj);
                return Boolean.valueOf(invoke$lambda$7$lambda$6$lambda$5$lambda$3);
        }
    }

    public /* synthetic */ k0(SheetState sheetState, un unVar, SheetState sheetState2) {
        this.e = sheetState;
        this.f = unVar;
        this.g = sheetState2;
    }
}
