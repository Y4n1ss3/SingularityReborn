package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.runtime.retain.RetainedEffectImpl;
import androidx.compose.runtime.retain.RetainedEffectKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ou implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;

    public /* synthetic */ ou(ky kyVar, int i) {
        this.d = i;
        this.e = kyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 ExposedDropdownMenuBox$lambda$22$lambda$21;
        RetainedEffectImpl RetainedEffect$lambda$1$0;
        RetainedEffectImpl RetainedEffect$lambda$0$0;
        RetainedEffectImpl RetainedEffect$lambda$2$0;
        RetainedEffectImpl RetainedEffect$lambda$3$0;
        w01 DockedSearchBar_EQC0FA8$lambda$24$lambda$23;
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                ExposedDropdownMenuBox$lambda$22$lambda$21 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$22$lambda$21(kyVar);
                break;
            case 1:
                RetainedEffect$lambda$1$0 = RetainedEffectKt.RetainedEffect$lambda$1$0(kyVar);
                break;
            case 2:
                RetainedEffect$lambda$0$0 = RetainedEffectKt.RetainedEffect$lambda$0$0(kyVar);
                break;
            case 3:
                RetainedEffect$lambda$2$0 = RetainedEffectKt.RetainedEffect$lambda$2$0(kyVar);
                break;
            case 4:
                RetainedEffect$lambda$3$0 = RetainedEffectKt.RetainedEffect$lambda$3$0(kyVar);
                break;
            case 5:
                DockedSearchBar_EQC0FA8$lambda$24$lambda$23 = SearchBarKt.DockedSearchBar_EQC0FA8$lambda$24$lambda$23(kyVar);
                break;
            case 6:
                kyVar.invoke("user");
                break;
            case 7:
                kyVar.invoke("userdebug");
                break;
            default:
                kyVar.invoke("eng");
                break;
        }
        return w01Var;
    }
}
