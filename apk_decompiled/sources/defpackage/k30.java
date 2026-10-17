package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k30 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ oy e;
    public final /* synthetic */ int f;

    public /* synthetic */ k30(oy oyVar, int i, int i2) {
        this.d = i2;
        this.e = oyVar;
        this.f = i;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 stickyHeader$lambda$2;
        w01 stickyHeader$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                stickyHeader$lambda$2 = LazyGridIntervalContent.stickyHeader$lambda$2(this.e, this.f, (LazyGridItemScope) obj, (Composer) obj2, intValue);
                return stickyHeader$lambda$2;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                stickyHeader$lambda$1 = LazyListIntervalContent.stickyHeader$lambda$1(this.e, this.f, (LazyItemScope) obj, (Composer) obj2, intValue2);
                return stickyHeader$lambda$1;
        }
    }
}
