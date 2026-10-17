package androidx.compose.material3;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import defpackage.my;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements my {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        List Saver$lambda$0;
        List Saver$lambda$02;
        List Saver$lambda$03;
        List Saver$lambda$04;
        int minIntrinsicHeight;
        int maxIntrinsicWidth;
        int maxIntrinsicHeight;
        int minIntrinsicWidth;
        int minIntrinsicWidth2;
        int maxIntrinsicWidth2;
        int minIntrinsicHeight2;
        int maxIntrinsicHeight2;
        List Saver$lambda$05;
        switch (this.d) {
            case 0:
                Saver$lambda$0 = AppBarOverflowStateImpl.Saver$lambda$0((SaverScope) obj, (AppBarOverflowStateImpl) obj2);
                return Saver$lambda$0;
            case 1:
                Saver$lambda$02 = DatePickerStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (DatePickerStateImpl) obj2);
                return Saver$lambda$02;
            case 2:
                Saver$lambda$03 = DateRangePickerStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (DateRangePickerStateImpl) obj2);
                return Saver$lambda$03;
            case 3:
                Saver$lambda$04 = EnterAlwaysSearchBarScrollBehavior.Companion.Saver$lambda$0((SaverScope) obj, (EnterAlwaysSearchBarScrollBehavior) obj2);
                return Saver$lambda$04;
            case 4:
                minIntrinsicHeight = ((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicHeight);
            case 5:
                maxIntrinsicWidth = ((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicWidth);
            case 6:
                maxIntrinsicHeight = ((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicHeight);
            case 7:
                minIntrinsicWidth = ((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicWidth);
            case 8:
                minIntrinsicWidth2 = ((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicWidth2);
            case 9:
                maxIntrinsicWidth2 = ((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicWidth2);
            case 10:
                minIntrinsicHeight2 = ((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicHeight2);
            case 11:
                maxIntrinsicHeight2 = ((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicHeight2);
            default:
                Saver$lambda$05 = TimePickerStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (TimePickerStateImpl) obj2);
                return Saver$lambda$05;
        }
    }
}
