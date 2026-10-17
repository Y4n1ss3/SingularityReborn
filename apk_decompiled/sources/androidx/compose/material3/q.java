package androidx.compose.material3;

import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ DatePickerState e;

    public /* synthetic */ q(DatePickerState datePickerState, int i) {
        this.d = i;
        this.e = datePickerState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        w01 invoke$lambda$3$lambda$2;
        switch (this.d) {
            case 0:
                invoke$lambda$1$lambda$0 = DatePickerKt$DatePicker$5.invoke$lambda$1$lambda$0(this.e, (DisplayMode) obj);
                return invoke$lambda$1$lambda$0;
            case 1:
                invoke$lambda$1$lambda$02 = DatePickerKt$DatePicker$6.invoke$lambda$1$lambda$0(this.e, (Long) obj);
                return invoke$lambda$1$lambda$02;
            default:
                invoke$lambda$3$lambda$2 = DatePickerKt$DatePicker$6.invoke$lambda$3$lambda$2(this.e, ((Long) obj).longValue());
                return invoke$lambda$3$lambda$2;
        }
    }
}
