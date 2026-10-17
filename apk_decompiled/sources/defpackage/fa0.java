package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fa0 implements py {
    public final /* synthetic */ int d;
    public final /* synthetic */ MovableContent e;

    public /* synthetic */ fa0(MovableContent movableContent, int i) {
        this.d = i;
        this.e = movableContent;
    }

    @Override // defpackage.py
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w01 movableContentOf$lambda$5;
        w01 movableContentWithReceiverOf$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj5).intValue();
                movableContentOf$lambda$5 = MovableContentKt.movableContentOf$lambda$5(this.e, obj, obj2, obj3, (Composer) obj4, intValue);
                return movableContentOf$lambda$5;
            default:
                int intValue2 = ((Integer) obj5).intValue();
                movableContentWithReceiverOf$lambda$5 = MovableContentKt.movableContentWithReceiverOf$lambda$5(this.e, obj, obj2, obj3, (Composer) obj4, intValue2);
                return movableContentWithReceiverOf$lambda$5;
        }
    }
}
