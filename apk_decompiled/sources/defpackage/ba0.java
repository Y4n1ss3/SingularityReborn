package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ba0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ qy e;

    public /* synthetic */ ba0(qy qyVar, int i) {
        this.d = i;
        this.e = qyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 movableContentWithReceiverOf$lambda$6;
        w01 movableContentOf$lambda$6;
        int i = this.d;
        Object[] objArr = (Object[]) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        qy qyVar = this.e;
        switch (i) {
            case 0:
                movableContentWithReceiverOf$lambda$6 = MovableContentKt.movableContentWithReceiverOf$lambda$6(qyVar, objArr, composer, intValue);
                return movableContentWithReceiverOf$lambda$6;
            default:
                movableContentOf$lambda$6 = MovableContentKt.movableContentOf$lambda$6(qyVar, objArr, composer, intValue);
                return movableContentOf$lambda$6;
        }
    }
}
