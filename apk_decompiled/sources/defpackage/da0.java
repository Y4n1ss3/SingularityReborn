package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class da0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MovableContent e;

    public /* synthetic */ da0(MovableContent movableContent, int i) {
        this.d = i;
        this.e = movableContent;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 movableContentOf$lambda$1;
        w01 movableContentWithReceiverOf$lambda$1;
        int i = this.d;
        MovableContent movableContent = this.e;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                movableContentOf$lambda$1 = MovableContentKt.movableContentOf$lambda$1(movableContent, obj, composer, intValue);
                return movableContentOf$lambda$1;
            default:
                movableContentWithReceiverOf$lambda$1 = MovableContentKt.movableContentWithReceiverOf$lambda$1(movableContent, obj, composer, intValue);
                return movableContentWithReceiverOf$lambda$1;
        }
    }
}
