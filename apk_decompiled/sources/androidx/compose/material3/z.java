package androidx.compose.material3;

import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ DateRangePickerState e;

    public /* synthetic */ z(DateRangePickerState dateRangePickerState, int i) {
        this.d = i;
        this.e = dateRangePickerState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$3$lambda$2;
        switch (this.d) {
            case 0:
                invoke$lambda$1$lambda$0 = DateRangePickerKt$DateRangePicker$5.invoke$lambda$1$lambda$0(this.e, (DisplayMode) obj);
                return invoke$lambda$1$lambda$0;
            default:
                invoke$lambda$3$lambda$2 = DateRangePickerKt$DateRangePicker$6.invoke$lambda$3$lambda$2(this.e, ((Long) obj).longValue());
                return invoke$lambda$3$lambda$2;
        }
    }
}
