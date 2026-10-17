package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import defpackage.ky;
import defpackage.oy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {
    private final IntervalList<PagerIntervalContent> intervals;
    private final ky key;
    private final oy pageContent;
    private final int pageCount;

    public PagerLayoutIntervalContent(oy oyVar, ky kyVar, int i) {
        this.pageContent = oyVar;
        this.key = kyVar;
        this.pageCount = i;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i, new PagerIntervalContent(kyVar, oyVar));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    public final ky getKey() {
        return this.key;
    }

    public final oy getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
