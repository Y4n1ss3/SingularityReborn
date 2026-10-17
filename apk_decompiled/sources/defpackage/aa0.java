package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class aa0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ py e;

    public /* synthetic */ aa0(int i, py pyVar) {
        this.d = i;
        this.e = pyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 movableContentOf$lambda$4;
        w01 movableContentWithReceiverOf$lambda$4;
        int i = this.d;
        kw0 kw0Var = (kw0) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        py pyVar = this.e;
        switch (i) {
            case 0:
                movableContentOf$lambda$4 = MovableContentKt.movableContentOf$lambda$4(pyVar, kw0Var, composer, intValue);
                return movableContentOf$lambda$4;
            default:
                movableContentWithReceiverOf$lambda$4 = MovableContentKt.movableContentWithReceiverOf$lambda$4(pyVar, kw0Var, composer, intValue);
                return movableContentWithReceiverOf$lambda$4;
        }
    }
}
