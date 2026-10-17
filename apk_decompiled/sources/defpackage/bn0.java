package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SecureTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bn0 implements my {
    public final /* synthetic */ MutableInteractionSource A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldState e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ TextStyle h;
    public final /* synthetic */ TextFieldLabelPosition i;
    public final /* synthetic */ ny j;
    public final /* synthetic */ my k;
    public final /* synthetic */ my l;
    public final /* synthetic */ my m;
    public final /* synthetic */ my n;
    public final /* synthetic */ my o;
    public final /* synthetic */ my p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ InputTransformation r;
    public final /* synthetic */ int s;
    public final /* synthetic */ char t;
    public final /* synthetic */ KeyboardOptions u;
    public final /* synthetic */ KeyboardActionHandler v;
    public final /* synthetic */ my w;
    public final /* synthetic */ Shape x;
    public final /* synthetic */ TextFieldColors y;
    public final /* synthetic */ PaddingValues z;

    public /* synthetic */ bn0(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, ny nyVar, my myVar, my myVar2, my myVar3, my myVar4, my myVar5, my myVar6, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, my myVar7, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, int i6) {
        this.d = i6;
        this.e = textFieldState;
        this.f = modifier;
        this.g = z;
        this.h = textStyle;
        this.i = textFieldLabelPosition;
        this.j = nyVar;
        this.k = myVar;
        this.l = myVar2;
        this.m = myVar3;
        this.n = myVar4;
        this.o = myVar5;
        this.p = myVar6;
        this.q = z2;
        this.r = inputTransformation;
        this.s = i;
        this.t = c;
        this.u = keyboardOptions;
        this.v = keyboardActionHandler;
        this.w = myVar7;
        this.x = shape;
        this.y = textFieldColors;
        this.z = paddingValues;
        this.A = mutableInteractionSource;
        this.B = i2;
        this.C = i3;
        this.D = i4;
        this.E = i5;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OutlinedSecureTextField_XvU6IwQ$lambda$5;
        w01 SecureTextField_XvU6IwQ$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                OutlinedSecureTextField_XvU6IwQ$lambda$5 = SecureTextFieldKt.OutlinedSecureTextField_XvU6IwQ$lambda$5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (Composer) obj, intValue);
                return OutlinedSecureTextField_XvU6IwQ$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SecureTextField_XvU6IwQ$lambda$2 = SecureTextFieldKt.SecureTextField_XvU6IwQ$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (Composer) obj, intValue2);
                return SecureTextField_XvU6IwQ$lambda$2;
        }
    }
}
