package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ae implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ ty j;

    public /* synthetic */ ae(iy iyVar, boolean z, Modifier modifier, my myVar, int i, int i2) {
        this.d = 2;
        this.i = iyVar;
        this.f = z;
        this.e = modifier;
        this.j = myVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 WrappedAnchor$lambda$1;
        w01 BoxWithConstraints$lambda$1;
        w01 YearPickerMenuButton$lambda$70;
        w01 ExposedDropdownMenuBox$lambda$23;
        w01 Icon$lambda$2;
        int i = this.d;
        Object obj3 = this.e;
        ty tyVar = this.j;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                WrappedAnchor$lambda$1 = BasicTooltipKt.WrappedAnchor$lambda$1(this.f, (BasicTooltipState) obj4, (Modifier) obj3, (my) tyVar, this.g, this.h, (Composer) obj, intValue);
                return WrappedAnchor$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                BoxWithConstraints$lambda$1 = BoxWithConstraintsKt.BoxWithConstraints$lambda$1((Modifier) obj3, (Alignment) obj4, this.f, (ny) tyVar, this.g, this.h, (Composer) obj, intValue2);
                return BoxWithConstraints$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                YearPickerMenuButton$lambda$70 = DatePickerKt.YearPickerMenuButton$lambda$70((iy) obj4, this.f, (Modifier) obj3, (my) tyVar, this.g, this.h, (Composer) obj, intValue3);
                return YearPickerMenuButton$lambda$70;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                ExposedDropdownMenuBox$lambda$23 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$23(this.f, (ky) obj4, (Modifier) obj3, (ny) tyVar, this.g, this.h, (Composer) obj, intValue4);
                return ExposedDropdownMenuBox$lambda$23;
            default:
                int intValue5 = ((Integer) obj2).intValue();
                Icon$lambda$2 = SegmentedButtonDefaults.Icon$lambda$2((SegmentedButtonDefaults) obj4, this.f, (my) tyVar, (my) obj3, this.g, this.h, (Composer) obj, intValue5);
                return Icon$lambda$2;
        }
    }

    public /* synthetic */ ae(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, my myVar, my myVar2, int i, int i2) {
        this.d = 4;
        this.i = segmentedButtonDefaults;
        this.f = z;
        this.j = myVar;
        this.e = myVar2;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ ae(Modifier modifier, Alignment alignment, boolean z, ny nyVar, int i, int i2) {
        this.d = 1;
        this.e = modifier;
        this.i = alignment;
        this.f = z;
        this.j = nyVar;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ ae(boolean z, Object obj, Modifier modifier, ty tyVar, int i, int i2, int i3) {
        this.d = i3;
        this.f = z;
        this.i = obj;
        this.e = modifier;
        this.j = tyVar;
        this.g = i;
        this.h = i2;
    }
}
