package defpackage;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ g00(Object obj, String str, Modifier modifier, long j, int i, int i2, int i3) {
        this.d = i3;
        this.j = obj;
        this.e = str;
        this.f = modifier;
        this.g = j;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Icon_ww6aTOc$lambda$0;
        w01 Icon_ww6aTOc$lambda$2;
        w01 Icon_ww6aTOc$lambda$6;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Icon_ww6aTOc$lambda$0 = IconKt.Icon_ww6aTOc$lambda$0((ImageVector) this.j, this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue);
                return Icon_ww6aTOc$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Icon_ww6aTOc$lambda$2 = IconKt.Icon_ww6aTOc$lambda$2((ImageBitmap) this.j, this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue2);
                return Icon_ww6aTOc$lambda$2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Icon_ww6aTOc$lambda$6 = IconKt.Icon_ww6aTOc$lambda$6((Painter) this.j, this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue3);
                return Icon_ww6aTOc$lambda$6;
        }
    }
}
