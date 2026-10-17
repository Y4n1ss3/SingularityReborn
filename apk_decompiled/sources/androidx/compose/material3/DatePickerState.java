package androidx.compose.material3;

import defpackage.k10;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DatePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo1891getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    Locale getLocale();

    SelectableDates getSelectableDates();

    Long getSelectedDateMillis();

    k10 getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo1892setDisplayModevCnGnXg(int i);

    void setDisplayedMonthMillis(long j);

    void setSelectedDateMillis(Long l);
}
