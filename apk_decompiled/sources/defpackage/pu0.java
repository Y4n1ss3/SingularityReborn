package defpackage;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pu0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ FontStyle h;
    public final /* synthetic */ FontWeight i;
    public final /* synthetic */ FontFamily j;
    public final /* synthetic */ long k;
    public final /* synthetic */ TextDecoration l;
    public final /* synthetic */ TextAlign m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ ky s;
    public final /* synthetic */ TextStyle t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ CharSequence x;
    public final /* synthetic */ Object y;

    public /* synthetic */ pu0(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, ky kyVar, TextStyle textStyle, int i4, int i5, int i6) {
        this.x = annotatedString;
        this.e = modifier;
        this.f = j;
        this.g = j2;
        this.h = fontStyle;
        this.i = fontWeight;
        this.j = fontFamily;
        this.k = j3;
        this.l = textDecoration;
        this.m = textAlign;
        this.n = j4;
        this.o = i;
        this.p = z;
        this.q = i2;
        this.r = i3;
        this.y = map;
        this.s = kyVar;
        this.t = textStyle;
        this.u = i4;
        this.v = i5;
        this.w = i6;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Text_Nvy7gAk$lambda$2;
        w01 Text_IbK3jfQ$lambda$12;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Text_Nvy7gAk$lambda$2 = TextKt.Text_Nvy7gAk$lambda$2((String) this.x, this.e, this.f, (TextAutoSize) this.y, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (Composer) obj, intValue);
                return Text_Nvy7gAk$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Text_IbK3jfQ$lambda$12 = TextKt.Text_IbK3jfQ$lambda$12((AnnotatedString) this.x, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Map) this.y, this.s, this.t, this.u, this.v, this.w, (Composer) obj, intValue2);
                return Text_IbK3jfQ$lambda$12;
        }
    }

    public /* synthetic */ pu0(String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, ky kyVar, TextStyle textStyle, int i4, int i5, int i6) {
        this.x = str;
        this.e = modifier;
        this.f = j;
        this.y = textAutoSize;
        this.g = j2;
        this.h = fontStyle;
        this.i = fontWeight;
        this.j = fontFamily;
        this.k = j3;
        this.l = textDecoration;
        this.m = textAlign;
        this.n = j4;
        this.o = i;
        this.p = z;
        this.q = i2;
        this.r = i3;
        this.s = kyVar;
        this.t = textStyle;
        this.u = i4;
        this.v = i5;
        this.w = i6;
    }
}
