package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qd implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ TextStyle f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ CharSequence n;
    public final /* synthetic */ Object o;

    public /* synthetic */ qd(CharSequence charSequence, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Object obj, int i4, int i5, int i6) {
        this.d = i6;
        this.n = charSequence;
        this.e = modifier;
        this.f = textStyle;
        this.g = kyVar;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.o = obj;
        this.l = i4;
        this.m = i5;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicText_VhcvRP8$lambda$1;
        w01 BasicText_VhcvRP8$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicText_VhcvRP8$lambda$1 = BasicTextKt.BasicText_VhcvRP8$lambda$1((AnnotatedString) this.n, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Map) this.o, this.l, this.m, (Composer) obj, intValue);
                return BasicText_VhcvRP8$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BasicText_VhcvRP8$lambda$0 = BasicTextKt.BasicText_VhcvRP8$lambda$0((String) this.n, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ColorProducer) this.o, this.l, this.m, (Composer) obj, intValue2);
                return BasicText_VhcvRP8$lambda$0;
        }
    }
}
