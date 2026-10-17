package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fe0 implements my {
    public final /* synthetic */ TextFieldColors A;
    public final /* synthetic */ PaddingValues B;
    public final /* synthetic */ MutableInteractionSource C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ TextStyle i;
    public final /* synthetic */ TextFieldLabelPosition j;
    public final /* synthetic */ ny k;
    public final /* synthetic */ my l;
    public final /* synthetic */ my m;
    public final /* synthetic */ my n;
    public final /* synthetic */ my o;
    public final /* synthetic */ my p;
    public final /* synthetic */ my q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ InputTransformation s;
    public final /* synthetic */ OutputTransformation t;
    public final /* synthetic */ KeyboardOptions u;
    public final /* synthetic */ KeyboardActionHandler v;
    public final /* synthetic */ TextFieldLineLimits w;
    public final /* synthetic */ my x;
    public final /* synthetic */ ScrollState y;
    public final /* synthetic */ Shape z;

    public /* synthetic */ fe0(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, my myVar7, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4, int i5) {
        this.d = i5;
        this.e = textFieldState;
        this.f = modifier;
        this.g = z;
        this.h = z2;
        this.i = textStyle;
        this.j = textFieldLabelPosition;
        this.k = nyVar;
        this.l = myVar;
        this.m = myVar2;
        this.n = myVar3;
        this.o = myVar4;
        this.p = myVar5;
        this.q = myVar6;
        this.r = z3;
        this.s = inputTransformation;
        this.t = outputTransformation;
        this.u = keyboardOptions;
        this.v = keyboardActionHandler;
        this.w = textFieldLineLimits;
        this.x = myVar7;
        this.y = scrollState;
        this.z = shape;
        this.A = textFieldColors;
        this.B = paddingValues;
        this.C = mutableInteractionSource;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OutlinedTextField$lambda$2;
        w01 TextField$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OutlinedTextField$lambda$2 = OutlinedTextFieldKt.OutlinedTextField$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, intValue);
                return OutlinedTextField$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TextField$lambda$2 = TextFieldKt.TextField$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, intValue2);
                return TextField$lambda$2;
        }
    }
}
