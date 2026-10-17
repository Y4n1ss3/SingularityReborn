package androidx.compose.ui.input.pointer.util;

import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j, float f) {
        this.time = j;
        this.dataPoint = f;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dataPointAtTime.time;
        }
        if ((i & 2) != 0) {
            f = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j, f);
    }

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    public final DataPointAtTime copy(long j, float f) {
        return new DataPointAtTime(j, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Float.hashCode(this.dataPoint) + (Long.hashCode(this.time) * 31);
    }

    public final void setDataPoint(float f) {
        this.dataPoint = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.time);
        sb.append(", dataPoint=");
        return k4.g(sb, this.dataPoint, ')');
    }
}
