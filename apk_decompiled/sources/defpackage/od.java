package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ TextStyle f;
    public final /* synthetic */ ky g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ ColorProducer l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ Object p;

    public /* synthetic */ od(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map map, ColorProducer colorProducer, int i4, int i5) {
        this.o = annotatedString;
        this.e = modifier;
        this.f = textStyle;
        this.g = kyVar;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.p = map;
        this.l = colorProducer;
        this.m = i4;
        this.n = i5;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicText_RWo7tUw$lambda$3;
        w01 BasicText_RWo7tUw$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicText_RWo7tUw$lambda$3 = BasicTextKt.BasicText_RWo7tUw$lambda$3((AnnotatedString) this.o, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Map) this.p, this.l, this.m, this.n, (Composer) obj, intValue);
                return BasicText_RWo7tUw$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BasicText_RWo7tUw$lambda$2 = BasicTextKt.BasicText_RWo7tUw$lambda$2((String) this.o, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (TextAutoSize) this.p, this.m, this.n, (Composer) obj, intValue2);
                return BasicText_RWo7tUw$lambda$2;
        }
    }

    public /* synthetic */ od(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, ColorProducer colorProducer, TextAutoSize textAutoSize, int i4, int i5) {
        this.o = str;
        this.e = modifier;
        this.f = textStyle;
        this.g = kyVar;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.l = colorProducer;
        this.p = textAutoSize;
        this.m = i4;
        this.n = i5;
    }
}
