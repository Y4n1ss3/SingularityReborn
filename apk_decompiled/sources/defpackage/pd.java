package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ AnnotatedString e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ TextStyle g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ ky k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ pd(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, Map map, int i3, int i4) {
        this.e = annotatedString;
        this.f = modifier;
        this.g = textStyle;
        this.k = kyVar;
        this.i = i;
        this.h = z;
        this.j = i2;
        this.n = map;
        this.l = i3;
        this.m = i4;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicText_4YKlhWE$lambda$0;
        w01 ClickableText_4YKlhWE$lambda$4;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicText_4YKlhWE$lambda$0 = BasicTextKt.BasicText_4YKlhWE$lambda$0(this.e, this.f, this.g, this.k, this.i, this.h, this.j, (Map) this.n, this.l, this.m, (Composer) obj, intValue);
                return BasicText_4YKlhWE$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ClickableText_4YKlhWE$lambda$4 = ClickableTextKt.ClickableText_4YKlhWE$lambda$4(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ky) this.n, this.l, this.m, (Composer) obj, intValue2);
                return ClickableText_4YKlhWE$lambda$4;
        }
    }

    public /* synthetic */ pd(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, ky kyVar, ky kyVar2, int i3, int i4) {
        this.e = annotatedString;
        this.f = modifier;
        this.g = textStyle;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.k = kyVar;
        this.n = kyVar2;
        this.l = i3;
        this.m = i4;
    }
}
