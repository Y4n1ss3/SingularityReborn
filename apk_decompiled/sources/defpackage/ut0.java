package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ut0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldCoreModifierNode e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Placeable g;
    public final /* synthetic */ MeasureScope h;

    public /* synthetic */ ut0(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope, int i2) {
        this.d = i2;
        this.e = textFieldCoreModifierNode;
        this.f = i;
        this.g = placeable;
        this.h = measureScope;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measureHorizontalScroll_3p2s80s$lambda$0;
        w01 measureVerticalScroll_3p2s80s$lambda$0;
        int i = this.d;
        MeasureScope measureScope = this.h;
        Placeable placeable = this.g;
        int i2 = this.f;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                measureHorizontalScroll_3p2s80s$lambda$0 = TextFieldCoreModifierNode.measureHorizontalScroll_3p2s80s$lambda$0(textFieldCoreModifierNode, i2, placeable, measureScope, placementScope);
                return measureHorizontalScroll_3p2s80s$lambda$0;
            default:
                measureVerticalScroll_3p2s80s$lambda$0 = TextFieldCoreModifierNode.measureVerticalScroll_3p2s80s$lambda$0(textFieldCoreModifierNode, i2, placeable, measureScope, placementScope);
                return measureVerticalScroll_3p2s80s$lambda$0;
        }
    }
}
