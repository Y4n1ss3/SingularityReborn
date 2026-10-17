package defpackage;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class x80 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ColorScheme e;
    public final /* synthetic */ MotionScheme f;
    public final /* synthetic */ Shapes g;
    public final /* synthetic */ Typography h;
    public final /* synthetic */ my i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ x80(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = colorScheme;
        this.f = motionScheme;
        this.g = shapes;
        this.h = typography;
        this.i = myVar;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 MaterialTheme$lambda$1;
        w01 MaterialExpressiveTheme$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MaterialTheme$lambda$1 = MaterialThemeKt.MaterialTheme$lambda$1(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue);
                return MaterialTheme$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                MaterialExpressiveTheme$lambda$2 = MaterialThemeKt.MaterialExpressiveTheme$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue2);
                return MaterialExpressiveTheme$lambda$2;
        }
    }
}
