package defpackage;

import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.CarouselStateKt;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wg(int i, Object obj, int i2) {
        this.d = i2;
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        CarouselState rememberCarouselState$lambda$1$lambda$0;
        String generateLoremIpsum$lambda$0;
        int updateSelectionBoundary$lambda$0;
        w01 TimeSelector_SAnMeKU$lambda$58$lambda$57;
        int i = this.d;
        Object obj = this.f;
        int i2 = this.e;
        switch (i) {
            case 0:
                rememberCarouselState$lambda$1$lambda$0 = CarouselStateKt.rememberCarouselState$lambda$1$lambda$0(i2, (iy) obj);
                return rememberCarouselState$lambda$1$lambda$0;
            case 1:
                generateLoremIpsum$lambda$0 = LoremIpsum.generateLoremIpsum$lambda$0((hi0) obj, i2);
                return generateLoremIpsum$lambda$0;
            case 2:
                updateSelectionBoundary$lambda$0 = SelectionAdjustmentKt.updateSelectionBoundary$lambda$0((SelectableInfo) obj, i2);
                return Integer.valueOf(updateSelectionBoundary$lambda$0);
            default:
                TimeSelector_SAnMeKU$lambda$58$lambda$57 = TimePickerKt.TimeSelector_SAnMeKU$lambda$58$lambda$57(i2, (TimePickerState) obj);
                return TimeSelector_SAnMeKU$lambda$58$lambda$57;
        }
    }

    public /* synthetic */ wg(Object obj, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = i;
    }
}
