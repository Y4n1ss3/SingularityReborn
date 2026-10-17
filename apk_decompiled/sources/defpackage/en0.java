package defpackage;

import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class en0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ty g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ en0(Modifier modifier, float f, ty tyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = f;
        this.g = tyVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10;
        w01 MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13;
        w01 CircularLayout$lambda$96;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10 = SegmentedButtonKt.SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10(this.e, this.f, (ny) this.g, this.h, this.i, (Composer) obj, intValue);
                return SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13 = SegmentedButtonKt.MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13(this.e, this.f, (ny) this.g, this.h, this.i, (Composer) obj, intValue2);
                return MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                CircularLayout$lambda$96 = TimePickerKt.CircularLayout$lambda$96(this.e, this.f, (my) this.g, this.h, this.i, (Composer) obj, intValue3);
                return CircularLayout$lambda$96;
        }
    }
}
