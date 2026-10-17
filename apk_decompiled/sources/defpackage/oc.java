package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ oc(iy iyVar, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, ny nyVar, int i, int i2) {
        this.d = 0;
        this.j = iyVar;
        this.g = modifier;
        this.k = dialogProperties;
        this.e = z;
        this.f = z2;
        this.l = nyVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BasicEdgeToEdgeDialog$lambda$12;
        w01 WrappedAnchor$lambda$7;
        w01 Checkbox$lambda$3;
        w01 RadioButton$lambda$2;
        w01 ContainerBox$lambda$7;
        int i = this.d;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.g;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BasicEdgeToEdgeDialog$lambda$12 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$12((iy) obj6, (Modifier) obj5, (DialogProperties) obj4, this.e, this.f, (ny) obj3, this.h, this.i, (Composer) obj, intValue);
                return BasicEdgeToEdgeDialog$lambda$12;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                WrappedAnchor$lambda$7 = BasicTooltipKt.WrappedAnchor$lambda$7(this.e, (TooltipState) obj6, (MutableState) obj4, this.f, (Modifier) obj5, (my) obj3, this.h, this.i, (Composer) obj, intValue2);
                return WrappedAnchor$lambda$7;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                Checkbox$lambda$3 = CheckboxKt.Checkbox$lambda$3(this.e, (ky) obj6, (Modifier) obj5, this.f, (CheckboxColors) obj4, (MutableInteractionSource) obj3, this.h, this.i, (Composer) obj, intValue3);
                return Checkbox$lambda$3;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                RadioButton$lambda$2 = RadioButtonKt.RadioButton$lambda$2(this.e, (iy) obj6, (Modifier) obj5, this.f, (RadioButtonColors) obj4, (MutableInteractionSource) obj3, this.h, this.i, (Composer) obj, intValue4);
                return RadioButton$lambda$2;
            default:
                int intValue5 = ((Integer) obj2).intValue();
                ContainerBox$lambda$7 = TextFieldDefaults.ContainerBox$lambda$7((TextFieldDefaults) obj6, this.e, this.f, (InteractionSource) obj5, (TextFieldColors) obj4, (Shape) obj3, this.h, this.i, (Composer) obj, intValue5);
                return ContainerBox$lambda$7;
        }
    }

    public /* synthetic */ oc(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
        this.d = 4;
        this.j = textFieldDefaults;
        this.e = z;
        this.f = z2;
        this.g = interactionSource;
        this.k = textFieldColors;
        this.l = shape;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ oc(boolean z, ty tyVar, Modifier modifier, boolean z2, Object obj, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.d = i3;
        this.e = z;
        this.j = tyVar;
        this.g = modifier;
        this.f = z2;
        this.k = obj;
        this.l = mutableInteractionSource;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ oc(boolean z, TooltipState tooltipState, MutableState mutableState, boolean z2, Modifier modifier, my myVar, int i, int i2) {
        this.d = 1;
        this.e = z;
        this.j = tooltipState;
        this.k = mutableState;
        this.f = z2;
        this.g = modifier;
        this.l = myVar;
        this.h = i;
        this.i = i2;
    }
}
