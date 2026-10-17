package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalWideNavigationRailProperties;
import androidx.compose.material3.RailPredictiveBackState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.WideNavigationRail_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ff implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ff(iy iyVar, ModalWideNavigationRailProperties modalWideNavigationRailProperties, ky kyVar, iy iyVar2, RailPredictiveBackState railPredictiveBackState, my myVar, int i) {
        this.d = 3;
        this.j = iyVar;
        this.g = modalWideNavigationRailProperties;
        this.h = kyVar;
        this.i = iyVar2;
        this.k = railPredictiveBackState;
        this.f = myVar;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 BottomSheetScaffoldLayout$lambda$16;
        w01 invoke$lambda$4;
        w01 PeriodToggleImpl$lambda$47;
        w01 ModalWideNavigationRailDialog$lambda$10;
        int i = this.d;
        Object obj3 = this.k;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.j;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BottomSheetScaffoldLayout$lambda$16 = BottomSheetScaffoldKt.BottomSheetScaffoldLayout$lambda$16((my) obj8, (my) obj6, (my) obj5, (my) obj4, (iy) obj7, (SheetState) obj3, this.e, (Composer) obj, intValue);
                return BottomSheetScaffoldLayout$lambda$16;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                invoke$lambda$4 = ComposableLambdaImpl.invoke$lambda$4((ComposableLambdaImpl) obj8, this.g, this.h, this.i, this.j, this.k, this.e, (Composer) obj, intValue2);
                return invoke$lambda$4;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                PeriodToggleImpl$lambda$47 = TimePickerKt.PeriodToggleImpl$lambda$47((Modifier) obj8, (TimePickerState) obj6, (TimePickerColors) obj5, (MeasurePolicy) obj4, (Shape) obj7, (Shape) obj3, this.e, (Composer) obj, intValue3);
                return PeriodToggleImpl$lambda$47;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                ModalWideNavigationRailDialog$lambda$10 = WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$10((iy) obj7, (ModalWideNavigationRailProperties) obj6, (ky) obj5, (iy) obj4, (RailPredictiveBackState) obj3, (my) obj8, this.e, (Composer) obj, intValue4);
                return ModalWideNavigationRailDialog$lambda$10;
        }
    }

    public /* synthetic */ ff(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
        this.e = i;
    }
}
