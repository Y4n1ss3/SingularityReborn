package androidx.compose.foundation.lazy.layout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Averages {
    public static final int $stable = 8;
    private long applyTimeNanos;
    private long compositionTimeNanos;
    private long measureTimeNanos;
    private int nestedPrefetchCount = -1;
    private long pauseTimeNanos;
    private long resumeTimeNanos;

    private final int calculateAverageCount(int i, int i2) {
        return i2 == -1 ? i : ((i2 * 3) + i) / 4;
    }

    private final long calculateAverageTime(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        return (j / 4) + ((j2 / 4) * 3);
    }

    public final void clearMeasureTime() {
        this.measureTimeNanos = 0L;
    }

    public final long getApplyTimeNanos() {
        return this.applyTimeNanos;
    }

    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final int getNestedPrefetchCount() {
        return this.nestedPrefetchCount;
    }

    public final long getPauseTimeNanos() {
        return this.pauseTimeNanos;
    }

    public final long getResumeTimeNanos() {
        return this.resumeTimeNanos;
    }

    public final void saveApplyTimeNanos(long j) {
        this.applyTimeNanos = calculateAverageTime(j, this.applyTimeNanos);
    }

    public final void saveCompositionTimeNanos(long j) {
        this.compositionTimeNanos = calculateAverageTime(j, this.compositionTimeNanos);
    }

    public final void saveMeasureTimeNanos(long j) {
        this.measureTimeNanos = calculateAverageTime(j, this.measureTimeNanos);
    }

    public final void saveNestedPrefetchCount(int i) {
        this.nestedPrefetchCount = calculateAverageCount(i, this.nestedPrefetchCount);
    }

    public final void savePauseTimeNanos(long j) {
        this.pauseTimeNanos = calculateAverageTime(j, this.pauseTimeNanos);
    }

    public final void saveResumeTimeNanos(long j) {
        this.resumeTimeNanos = calculateAverageTime(j, this.resumeTimeNanos);
    }

    public final void setApplyTimeNanos(long j) {
        this.applyTimeNanos = j;
    }

    public final void setCompositionTimeNanos(long j) {
        this.compositionTimeNanos = j;
    }

    public final void setMeasureTimeNanos(long j) {
        this.measureTimeNanos = j;
    }

    public final void setNestedPrefetchCount(int i) {
        this.nestedPrefetchCount = i;
    }

    public final void setPauseTimeNanos(long j) {
        this.pauseTimeNanos = j;
    }

    public final void setResumeTimeNanos(long j) {
        this.resumeTimeNanos = j;
    }
}
