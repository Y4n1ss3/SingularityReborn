package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import defpackage.dq;
import defpackage.ut;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    public static final int $stable = 8;
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i) {
            maxCurrentLineSpan = i;
        }

        public void setMaxLineSpan(int i) {
            maxLineSpan = i;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i, List<GridItemSpan> list) {
            this.firstItemIndex = i;
            this.spans = list;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.gridContent = lazyGridIntervalContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i = 0;
        arrayList.add(new Bucket(i, i, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = ut.d;
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i) {
        if (i == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(GridItemSpan.m878boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private static final int getLineIndexOfItem$lambda$1(int i, Bucket bucket) {
        return bucket.getFirstItemIndex() - i;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i = 0;
        this.buckets.add(new Bucket(i, i, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef A[LOOP:1: B:34:0x00d1->B:42:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[EDGE_INSN: B:43:0x00f3->B:44:0x00f3 BREAK  A[LOOP:1: B:34:0x00d1->B:42:0x00ef], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150 A[LOOP:2: B:66:0x0133->B:74:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f A[EDGE_INSN: B:75:0x015f->B:76:0x015f BREAK  A[LOOP:2: B:66:0x0133->B:74:0x0150], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LineConfiguration getLineConfiguration(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.gridContent.getHasCustomSpans$foundation()) {
            int i7 = this.slotsPerLine;
            int i8 = i * i7;
            int totalSize = getTotalSize() - i8;
            if (i7 > totalSize) {
                i7 = totalSize;
            }
            return new LineConfiguration(i8, getDefaultSpans(i7 >= 0 ? i7 : 0));
        }
        int min = Math.min(i / getBucketSize(), this.buckets.size() - 1);
        int bucketSize = getBucketSize() * min;
        int firstItemIndex = this.buckets.get(min).getFirstItemIndex();
        int firstItemKnownSpan = this.buckets.get(min).getFirstItemKnownSpan();
        int i9 = this.lastLineIndex;
        if (bucketSize <= i9 && i9 <= i) {
            firstItemIndex = this.lastLineStartItemIndex;
            firstItemKnownSpan = this.lastLineStartKnownSpan;
            bucketSize = i9;
        } else if (min == this.cachedBucketIndex && (i2 = i - bucketSize) < this.cachedBucket.size()) {
            firstItemIndex = this.cachedBucket.get(i2).intValue();
            bucketSize = i;
            firstItemKnownSpan = 0;
        }
        if (bucketSize % getBucketSize() == 0) {
            int bucketSize2 = getBucketSize();
            int i10 = i - bucketSize;
            if (2 <= i10 && i10 < bucketSize2) {
                z = true;
                if (z) {
                    this.cachedBucketIndex = min;
                    this.cachedBucket.clear();
                }
                if (!(bucketSize > i)) {
                    InlineClassHelperKt.throwIllegalStateException("currentLine (" + bucketSize + ") > lineIndex (" + i + ')');
                }
                while (bucketSize < i && firstItemIndex < getTotalSize()) {
                    if (z) {
                        this.cachedBucket.add(Integer.valueOf(firstItemIndex));
                    }
                    i5 = 0;
                    while (i5 < this.slotsPerLine && firstItemIndex < getTotalSize()) {
                        if (firstItemKnownSpan != 0) {
                            i6 = firstItemKnownSpan;
                            firstItemKnownSpan = spanOf(firstItemIndex, this.slotsPerLine - i5);
                        } else {
                            i6 = 0;
                        }
                        i5 += firstItemKnownSpan;
                        if (i5 <= this.slotsPerLine) {
                            break;
                        }
                        firstItemIndex++;
                        firstItemKnownSpan = i6;
                    }
                    bucketSize++;
                    if (bucketSize % getBucketSize() == 0 && firstItemIndex < getTotalSize()) {
                        if (!(this.buckets.size() != bucketSize / getBucketSize())) {
                            InlineClassHelperKt.throwIllegalStateException("invalid starting point");
                        }
                        this.buckets.add(new Bucket(firstItemIndex, firstItemKnownSpan));
                    }
                }
                this.lastLineIndex = i;
                this.lastLineStartItemIndex = firstItemIndex;
                this.lastLineStartKnownSpan = firstItemKnownSpan;
                ArrayList arrayList = new ArrayList();
                i3 = 0;
                int i11 = firstItemIndex;
                while (i3 < this.slotsPerLine && i11 < getTotalSize()) {
                    if (firstItemKnownSpan != 0) {
                        int i12 = firstItemKnownSpan;
                        firstItemKnownSpan = spanOf(i11, this.slotsPerLine - i3);
                        i4 = i12;
                    } else {
                        i4 = 0;
                    }
                    i3 += firstItemKnownSpan;
                    if (i3 <= this.slotsPerLine) {
                        break;
                    }
                    i11++;
                    arrayList.add(GridItemSpan.m878boximpl(LazyGridSpanKt.GridItemSpan(firstItemKnownSpan)));
                    firstItemKnownSpan = i4;
                }
                return new LineConfiguration(firstItemIndex, arrayList);
            }
        }
        z = false;
        if (z) {
        }
        if (!(bucketSize > i)) {
        }
        while (bucketSize < i) {
            if (z) {
            }
            i5 = 0;
            while (i5 < this.slotsPerLine) {
                if (firstItemKnownSpan != 0) {
                }
                i5 += firstItemKnownSpan;
                if (i5 <= this.slotsPerLine) {
                }
            }
            bucketSize++;
            if (bucketSize % getBucketSize() == 0) {
                if (!(this.buckets.size() != bucketSize / getBucketSize())) {
                }
                this.buckets.add(new Bucket(firstItemIndex, firstItemKnownSpan));
            }
        }
        this.lastLineIndex = i;
        this.lastLineStartItemIndex = firstItemIndex;
        this.lastLineStartKnownSpan = firstItemKnownSpan;
        ArrayList arrayList2 = new ArrayList();
        i3 = 0;
        int i112 = firstItemIndex;
        while (i3 < this.slotsPerLine) {
            if (firstItemKnownSpan != 0) {
            }
            i3 += firstItemKnownSpan;
            if (i3 <= this.slotsPerLine) {
            }
        }
        return new LineConfiguration(firstItemIndex, arrayList2);
    }

    public final int getLineIndexOfItem(int i) {
        int i2;
        int i3;
        int i4 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i >= getTotalSize()) {
            InlineClassHelperKt.throwIllegalArgumentException("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans$foundation()) {
            return i / this.slotsPerLine;
        }
        ArrayList<Bucket> arrayList = this.buckets;
        int size = arrayList.size();
        y80.J(arrayList.size(), size);
        int i5 = size - 1;
        int i6 = 0;
        while (true) {
            if (i6 > i5) {
                i2 = -(i6 + 1);
                break;
            }
            i2 = (i6 + i5) >>> 1;
            int lineIndexOfItem$lambda$1 = getLineIndexOfItem$lambda$1(i, arrayList.get(i2));
            if (lineIndexOfItem$lambda$1 >= 0) {
                if (lineIndexOfItem$lambda$1 <= 0) {
                    break;
                }
                i5 = i2 - 1;
            } else {
                i6 = i2 + 1;
            }
        }
        int i7 = 2;
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int bucketSize = getBucketSize() * i2;
        int firstItemIndex = this.buckets.get(i2).getFirstItemIndex();
        if (firstItemIndex > i) {
            InlineClassHelperKt.throwIllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i8 = 0;
        while (true) {
            i3 = this.slotsPerLine;
            if (firstItemIndex >= i) {
                break;
            }
            int i9 = firstItemIndex + 1;
            int spanOf = spanOf(firstItemIndex, i3 - i8);
            i8 += spanOf;
            int i10 = this.slotsPerLine;
            if (i8 >= i10) {
                if (i8 == i10) {
                    bucketSize++;
                    i8 = 0;
                } else {
                    bucketSize++;
                    i8 = spanOf;
                }
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                this.buckets.add(new Bucket(i9 - (i8 > 0 ? 1 : 0), i4, i7, null));
            }
            firstItemIndex = i9;
        }
        return spanOf(i, i3 - i8) + i8 > this.slotsPerLine ? bucketSize + 1 : bucketSize;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.slotsPerLine) {
            this.slotsPerLine = i;
            invalidateCache();
        }
    }

    public final int spanOf(int i, int i2) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i2);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i);
        return GridItemSpan.m882getCurrentLineSpanimpl(((GridItemSpan) interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i - interval.getStartIndex()))).m885unboximpl());
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public /* synthetic */ Bucket(int i, int i2, int i3, dq dqVar) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public Bucket(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }
    }
}
