package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pp implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ LazyListState f;

    public /* synthetic */ pp(un unVar, LazyListState lazyListState, int i) {
        this.d = i;
        this.e = unVar;
        this.f = lazyListState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 DatePickerContent$lambda$36$lambda$29$lambda$28;
        w01 DatePickerContent$lambda$36$lambda$31$lambda$30;
        boolean customScrollActions$lambda$16;
        int i = this.d;
        un unVar = this.e;
        LazyListState lazyListState = this.f;
        switch (i) {
            case 0:
                DatePickerContent$lambda$36$lambda$29$lambda$28 = DatePickerKt.DatePickerContent$lambda$36$lambda$29$lambda$28(unVar, lazyListState);
                return DatePickerContent$lambda$36$lambda$29$lambda$28;
            case 1:
                DatePickerContent$lambda$36$lambda$31$lambda$30 = DatePickerKt.DatePickerContent$lambda$36$lambda$31$lambda$30(unVar, lazyListState);
                return DatePickerContent$lambda$36$lambda$31$lambda$30;
            case 2:
                customScrollActions$lambda$16 = DateRangePickerKt.customScrollActions$lambda$16(lazyListState, unVar);
                break;
            default:
                customScrollActions$lambda$16 = DateRangePickerKt.customScrollActions$lambda$17(lazyListState, unVar);
                break;
        }
        return Boolean.valueOf(customScrollActions$lambda$16);
    }

    public /* synthetic */ pp(LazyListState lazyListState, un unVar, int i) {
        this.d = i;
        this.f = lazyListState;
        this.e = unVar;
    }
}
