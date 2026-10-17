package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ee0 implements my {
    public final /* synthetic */ TextFieldColors A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ TextStyle j;
    public final /* synthetic */ my k;
    public final /* synthetic */ my l;
    public final /* synthetic */ my m;
    public final /* synthetic */ my n;
    public final /* synthetic */ my o;
    public final /* synthetic */ my p;
    public final /* synthetic */ my q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ VisualTransformation s;
    public final /* synthetic */ KeyboardOptions t;
    public final /* synthetic */ KeyboardActions u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ MutableInteractionSource y;
    public final /* synthetic */ Shape z;

    public /* synthetic */ ee0(String str, ky kyVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, my myVar7, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, int i7) {
        this.d = i7;
        this.e = str;
        this.f = kyVar;
        this.g = modifier;
        this.h = z;
        this.i = z2;
        this.j = textStyle;
        this.k = myVar;
        this.l = myVar2;
        this.m = myVar3;
        this.n = myVar4;
        this.o = myVar5;
        this.p = myVar6;
        this.q = myVar7;
        this.r = z3;
        this.s = visualTransformation;
        this.t = keyboardOptions;
        this.u = keyboardActions;
        this.v = z4;
        this.w = i;
        this.x = i2;
        this.y = mutableInteractionSource;
        this.z = shape;
        this.A = textFieldColors;
        this.B = i3;
        this.C = i4;
        this.D = i5;
        this.E = i6;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OutlinedTextField$lambda$5;
        w01 TextField$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OutlinedTextField$lambda$5 = OutlinedTextFieldKt.OutlinedTextField$lambda$5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (Composer) obj, intValue);
                return OutlinedTextField$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TextField$lambda$5 = TextFieldKt.TextField$lambda$5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (Composer) obj, intValue2);
                return TextField$lambda$5;
        }
    }
}
