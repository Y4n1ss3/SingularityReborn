package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b40 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ oy e;

    public /* synthetic */ b40(oy oyVar, int i) {
        this.d = i;
        this.e = oyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 stickyHeader$lambda$1;
        w01 movableContentOf$lambda$2;
        w01 movableContentWithReceiverOf$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                stickyHeader$lambda$1 = LazyListScope.stickyHeader$lambda$1(this.e, (LazyItemScope) obj, (Composer) obj2, intValue);
                return stickyHeader$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                movableContentOf$lambda$2 = MovableContentKt.movableContentOf$lambda$2(this.e, (xe0) obj, (Composer) obj2, intValue2);
                return movableContentOf$lambda$2;
            default:
                int intValue3 = ((Integer) obj3).intValue();
                movableContentWithReceiverOf$lambda$2 = MovableContentKt.movableContentWithReceiverOf$lambda$2(this.e, (xe0) obj, (Composer) obj2, intValue3);
                return movableContentWithReceiverOf$lambda$2;
        }
    }
}
