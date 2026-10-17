package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ad implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ TextStyle i;
    public final /* synthetic */ KeyboardOptions j;
    public final /* synthetic */ KeyboardActions k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ VisualTransformation o;
    public final /* synthetic */ ky p;
    public final /* synthetic */ MutableInteractionSource q;
    public final /* synthetic */ Brush r;
    public final /* synthetic */ ny s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;

    public /* synthetic */ ad(Object obj, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, int i3, int i4, int i5, int i6) {
        this.d = i6;
        this.w = obj;
        this.e = kyVar;
        this.f = modifier;
        this.g = z;
        this.h = z2;
        this.i = textStyle;
        this.j = keyboardOptions;
        this.k = keyboardActions;
        this.l = z3;
        this.m = i;
        this.n = i2;
        this.o = visualTransformation;
        this.p = kyVar2;
        this.q = mutableInteractionSource;
        this.r = brush;
        this.s = nyVar;
        this.t = i3;
        this.u = i4;
        this.v = i5;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicTextField$lambda$25;
        w01 BasicTextField$lambda$28;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25((String) this.w, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (Composer) obj, intValue);
                return BasicTextField$lambda$25;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BasicTextField$lambda$28 = BasicTextFieldKt.BasicTextField$lambda$28((TextFieldValue) this.w, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (Composer) obj, intValue2);
                return BasicTextField$lambda$28;
        }
    }
}
