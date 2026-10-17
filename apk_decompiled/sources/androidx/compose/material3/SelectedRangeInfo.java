package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.ui.unit.IntOffset;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectedRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    private SelectedRangeInfo(long j, long j2, boolean z, boolean z2) {
        this.gridStartCoordinates = j;
        this.gridEndCoordinates = j2;
        this.firstIsSelectionStart = z;
        this.lastIsSelectionEnd = z2;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2371getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    /* renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2372getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            int daysFromStartOfWeekToFirstOfMonth;
            int numberOfDays;
            if (calendarDate.getUtcTimeMillis() > calendarMonth.getEndUtcTimeMillis() || calendarDate2.getUtcTimeMillis() < calendarMonth.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z = calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis();
            boolean z2 = calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis();
            int dayOfMonth = z ? (calendarDate.getDayOfMonth() + calendarMonth.getDaysFromStartOfWeekToFirstOfMonth()) - 1 : calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
            if (z2) {
                daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                numberOfDays = calendarDate2.getDayOfMonth();
            } else {
                daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                numberOfDays = calendarMonth.getNumberOfDays();
            }
            int i = (numberOfDays + daysFromStartOfWeekToFirstOfMonth) - 1;
            return new SelectedRangeInfo(IntOffset.m7733constructorimpl(((dayOfMonth / 7) & 4294967295L) | ((dayOfMonth % 7) << 32)), IntOffset.m7733constructorimpl(((i / 7) & 4294967295L) | ((i % 7) << 32)), z, z2, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j, long j2, boolean z, boolean z2, dq dqVar) {
        this(j, j2, z, z2);
    }
}
