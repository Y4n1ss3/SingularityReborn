package defpackage;

import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.ProgressIndicatorKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class uq implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;

    public /* synthetic */ uq(int i, iy iyVar) {
        this.d = i;
        this.e = iyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        float TwoRowsTopAppBar$lambda$8$lambda$7;
        float TwoRowsTopAppBar$lambda$10$lambda$9;
        boolean TwoRowsTopAppBar$lambda$12$lambda$11;
        boolean Scrim_KTwxG1Y$lambda$31$lambda$30$lambda$29;
        boolean Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67;
        float LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3;
        float CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21;
        int i = this.d;
        iy iyVar = this.e;
        switch (i) {
            case 0:
                TwoRowsTopAppBar$lambda$8$lambda$7 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$8$lambda$7(iyVar);
                return Float.valueOf(TwoRowsTopAppBar$lambda$8$lambda$7);
            case 1:
                TwoRowsTopAppBar$lambda$10$lambda$9 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$10$lambda$9(iyVar);
                return Float.valueOf(TwoRowsTopAppBar$lambda$10$lambda$9);
            case 2:
                TwoRowsTopAppBar$lambda$12$lambda$11 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$12$lambda$11(iyVar);
                return Boolean.valueOf(TwoRowsTopAppBar$lambda$12$lambda$11);
            case 3:
                Scrim_KTwxG1Y$lambda$31$lambda$30$lambda$29 = ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$31$lambda$30$lambda$29(iyVar);
                return Boolean.valueOf(Scrim_KTwxG1Y$lambda$31$lambda$30$lambda$29);
            case 4:
                Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67(iyVar);
                return Boolean.valueOf(Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67);
            case 5:
                LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3 = ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3(iyVar);
                return Float.valueOf(LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3);
            default:
                CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21 = ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21(iyVar);
                return Float.valueOf(CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21);
        }
    }
}
