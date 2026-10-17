package defpackage;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ih0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TextStyle f;
    public final /* synthetic */ my g;
    public final /* synthetic */ int h;

    public /* synthetic */ ih0(long j, TextStyle textStyle, my myVar, int i, int i2) {
        this.d = i2;
        this.e = j;
        this.f = textStyle;
        this.g = myVar;
        this.h = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvideContentColorTextStyle_3J_VO9M$lambda$0;
        w01 Decoration_3J_VO9M$lambda$20;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ProvideContentColorTextStyle_3J_VO9M$lambda$0 = ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_3J_VO9M$lambda$0(this.e, this.f, this.g, this.h, (Composer) obj, intValue);
                return ProvideContentColorTextStyle_3J_VO9M$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Decoration_3J_VO9M$lambda$20 = TextFieldImplKt.Decoration_3J_VO9M$lambda$20(this.e, this.f, this.g, this.h, (Composer) obj, intValue2);
                return Decoration_3J_VO9M$lambda$20;
        }
    }
}
