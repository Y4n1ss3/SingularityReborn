package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ea0 implements oy {
    public final /* synthetic */ int d;
    public final /* synthetic */ MovableContent e;

    public /* synthetic */ ea0(MovableContent movableContent, int i) {
        this.d = i;
        this.e = movableContent;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        w01 movableContentOf$lambda$3;
        w01 movableContentWithReceiverOf$lambda$3;
        int i = this.d;
        MovableContent movableContent = this.e;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                movableContentOf$lambda$3 = MovableContentKt.movableContentOf$lambda$3(movableContent, obj, obj2, composer, intValue);
                return movableContentOf$lambda$3;
            default:
                movableContentWithReceiverOf$lambda$3 = MovableContentKt.movableContentWithReceiverOf$lambda$3(movableContent, obj, obj2, composer, intValue);
                return movableContentWithReceiverOf$lambda$3;
        }
    }
}
