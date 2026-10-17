package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ SheetState e;
    public final /* synthetic */ FiniteAnimationSpec f;
    public final /* synthetic */ FiniteAnimationSpec g;
    public final /* synthetic */ FiniteAnimationSpec h;

    public /* synthetic */ af(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i) {
        this.d = i;
        this.e = sheetState;
        this.f = finiteAnimationSpec;
        this.g = finiteAnimationSpec2;
        this.h = finiteAnimationSpec3;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 StandardBottomSheet_w7I5h1o$lambda$7$lambda$6;
        w01 ModalBottomSheet_YbuCTN8$lambda$1$lambda$0;
        switch (this.d) {
            case 0:
                StandardBottomSheet_w7I5h1o$lambda$7$lambda$6 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$7$lambda$6(this.e, this.f, this.g, this.h);
                return StandardBottomSheet_w7I5h1o$lambda$7$lambda$6;
            default:
                ModalBottomSheet_YbuCTN8$lambda$1$lambda$0 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$1$lambda$0(this.e, this.f, this.g, this.h);
                return ModalBottomSheet_YbuCTN8$lambda$1$lambda$0;
        }
    }
}
