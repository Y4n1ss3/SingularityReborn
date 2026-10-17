package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ae0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ InteractionSource g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ TextFieldColors i;
    public final /* synthetic */ Shape j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ae0(Object obj, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, int i3) {
        this.d = i3;
        this.o = obj;
        this.e = z;
        this.f = z2;
        this.g = interactionSource;
        this.h = modifier;
        this.i = textFieldColors;
        this.j = shape;
        this.k = f;
        this.l = f2;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Container_4EFweAY$lambda$0;
        w01 Container_4EFweAY$lambda$02;
        int i = this.d;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Container_4EFweAY$lambda$0 = OutlinedTextFieldDefaults.Container_4EFweAY$lambda$0((OutlinedTextFieldDefaults) obj3, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue);
                return Container_4EFweAY$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Container_4EFweAY$lambda$02 = TextFieldDefaults.Container_4EFweAY$lambda$0((TextFieldDefaults) obj3, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, intValue2);
                return Container_4EFweAY$lambda$02;
        }
    }
}
