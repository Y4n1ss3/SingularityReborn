package defpackage;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.SelectableDates;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vp implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectableDates e;
    public final /* synthetic */ Locale f;

    public /* synthetic */ vp(SelectableDates selectableDates, Locale locale, int i) {
        this.d = i;
        this.e = selectableDates;
        this.f = locale;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DatePickerStateImpl Saver$lambda$1;
        DateRangePickerStateImpl Saver$lambda$12;
        switch (this.d) {
            case 0:
                Saver$lambda$1 = DatePickerStateImpl.Companion.Saver$lambda$1(this.e, this.f, (List) obj);
                return Saver$lambda$1;
            default:
                Saver$lambda$12 = DateRangePickerStateImpl.Companion.Saver$lambda$1(this.e, this.f, (List) obj);
                return Saver$lambda$12;
        }
    }
}
