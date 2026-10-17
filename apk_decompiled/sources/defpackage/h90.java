package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h90 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SheetState e;
    public final /* synthetic */ iy f;

    public /* synthetic */ h90(SheetState sheetState, iy iyVar, int i) {
        this.d = i;
        this.e = sheetState;
        this.f = iyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2;
        w01 ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5;
        int i = this.d;
        iy iyVar = this.f;
        SheetState sheetState = this.e;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2(sheetState, iyVar, th);
                return ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2;
            default:
                ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5(sheetState, iyVar, th);
                return ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5;
        }
    }
}
