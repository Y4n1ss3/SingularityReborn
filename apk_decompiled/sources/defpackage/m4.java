package defpackage;

import androidx.compose.material3.AlertDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ DialogProperties g;
    public final /* synthetic */ my h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ m4(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = modifier;
        this.g = dialogProperties;
        this.h = myVar;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 AlertDialog$lambda$2;
        w01 BasicAlertDialog$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AlertDialog$lambda$2 = AlertDialogKt.AlertDialog$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue);
                return AlertDialog$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BasicAlertDialog$lambda$1 = AlertDialogKt.BasicAlertDialog$lambda$1(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue2);
                return BasicAlertDialog$lambda$1;
        }
    }
}
