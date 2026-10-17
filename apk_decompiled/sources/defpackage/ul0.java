package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ul0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ ul0(int i, int i2) {
        this.d = i2;
        this.e = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        ScrollState rememberScrollState$lambda$0$0;
        int i = this.d;
        int i2 = this.e;
        switch (i) {
            case 0:
                rememberScrollState$lambda$0$0 = ScrollKt.rememberScrollState$lambda$0$0(i2);
                return rememberScrollState$lambda$0$0;
            default:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
        }
    }
}
