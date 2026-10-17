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
public final /* synthetic */ class yc implements my {
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
    public final /* synthetic */ VisualTransformation n;
    public final /* synthetic */ ky o;
    public final /* synthetic */ MutableInteractionSource p;
    public final /* synthetic */ Brush q;
    public final /* synthetic */ ny r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    public /* synthetic */ yc(Object obj, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, ky kyVar2, MutableInteractionSource mutableInteractionSource, Brush brush, ny nyVar, int i2, int i3, int i4, int i5) {
        this.d = i5;
        this.v = obj;
        this.e = kyVar;
        this.f = modifier;
        this.g = z;
        this.h = z2;
        this.i = textStyle;
        this.j = keyboardOptions;
        this.k = keyboardActions;
        this.l = z3;
        this.m = i;
        this.n = visualTransformation;
        this.o = kyVar2;
        this.p = mutableInteractionSource;
        this.q = brush;
        this.r = nyVar;
        this.s = i2;
        this.t = i3;
        this.u = i4;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicTextField$lambda$34;
        w01 BasicTextField$lambda$31;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicTextField$lambda$34 = BasicTextFieldKt.BasicTextField$lambda$34((TextFieldValue) this.v, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, intValue);
                return BasicTextField$lambda$34;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BasicTextField$lambda$31 = BasicTextFieldKt.BasicTextField$lambda$31((String) this.v, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, intValue2);
                return BasicTextField$lambda$31;
        }
    }
}
