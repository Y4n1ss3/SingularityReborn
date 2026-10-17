package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;

    public /* synthetic */ lf(Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = modifier;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Box$lambda$1;
        w01 DisplaySeparator$lambda$54;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Box$lambda$1 = BoxKt.Box$lambda$1(this.e, this.f, composer, intValue);
                return Box$lambda$1;
            default:
                DisplaySeparator$lambda$54 = TimePickerKt.DisplaySeparator$lambda$54(this.e, this.f, composer, intValue);
                return DisplaySeparator$lambda$54;
        }
    }
}
