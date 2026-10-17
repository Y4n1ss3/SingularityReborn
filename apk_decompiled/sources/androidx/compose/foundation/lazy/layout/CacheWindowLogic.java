package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import defpackage.dq;
import defpackage.h10;
import defpackage.na0;
import defpackage.oa0;
import defpackage.q10;
import defpackage.sf;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class CacheWindowLogic {
    public static final int $stable = 8;
    private final LazyLayoutCacheWindow cacheWindow;
    private final boolean enableInitialPrefetch;
    private boolean hasUpdatedVisibleItemsOnce;
    private final oa0 indicesToRemove;
    private int itemsCount;
    private int prefetchWindowEndExtraSpace;
    private int prefetchWindowEndLine;
    private final na0 prefetchWindowHandles;
    private int prefetchWindowStartExtraSpace;
    private int prefetchWindowStartLine;
    private float previousPassDelta;
    private int previousPassItemCount;
    private boolean shouldRefillWindow;
    private final na0 windowCache;

    public CacheWindowLogic(LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z) {
        this.cacheWindow = lazyLayoutCacheWindow;
        this.enableInitialPrefetch = z;
        na0 na0Var = h10.a;
        this.prefetchWindowHandles = new na0();
        this.indicesToRemove = new oa0();
        this.windowCache = new na0();
        this.previousPassItemCount = -1;
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
    }

    private final void cachePrefetchedItem(int i, int i2) {
        this.windowCache.i(i, updateOrCreateCachedItem(i, i2, CachedItem.NoKey));
        if (i > this.prefetchWindowEndLine) {
            this.prefetchWindowEndLine = i;
            this.prefetchWindowEndExtraSpace -= i2;
        } else if (i < this.prefetchWindowStartLine) {
            this.prefetchWindowStartLine = i;
            this.prefetchWindowStartExtraSpace -= i2;
        }
    }

    private final void cacheVisibleItemsInfo(int i, Object obj, int i2) {
        if (this.windowCache.a(i)) {
            Object b = this.windowCache.b(i);
            b.getClass();
            int mainAxisSize = ((CachedItem) b).getMainAxisSize();
            Object b2 = this.windowCache.b(i);
            b2.getClass();
            Object key = ((CachedItem) b2).getKey();
            if (mainAxisSize != i2 || !q10.b(key, obj)) {
                this.shouldRefillWindow = true;
            }
        }
        this.windowCache.i(i, updateOrCreateCachedItem(i, i2, obj));
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, i);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, i);
        List list = (List) this.prefetchWindowHandles.g(i);
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i3)).cancel();
            }
        }
    }

    private final void fillCacheWindowBackward(CacheWindowScope cacheWindowScope, float f) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            int calculateBehindWindow = density != null ? lazyLayoutCacheWindow.calculateBehindWindow(density, mainAxisViewportSize) : 0;
            this.itemsCount = cacheWindowScope.getTotalItemsCount();
            onKeepAround(cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), calculateBehindWindow, f, cacheWindowScope.getTotalItemsCount());
        }
    }

    private final void fillCacheWindowForward(CacheWindowScope cacheWindowScope, float f) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            int calculateAheadWindow = density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0;
            onPrefetchForward(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), calculateAheadWindow, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), f, f <= 0.0f);
        }
    }

    private final int getItemSizeOrPrefetch(CacheWindowScope cacheWindowScope, int i, boolean z) {
        List list;
        List list2;
        if (this.windowCache.a(i)) {
            Object b = this.windowCache.b(i);
            b.getClass();
            return ((CachedItem) b).getMainAxisSize();
        }
        int i2 = 0;
        if (this.prefetchWindowHandles.a(i)) {
            if (!z || (list2 = (List) this.prefetchWindowHandles.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((LazyLayoutPrefetchState.PrefetchHandle) list2.get(i2)).markAsUrgent();
                i2++;
            }
            return -1;
        }
        this.prefetchWindowHandles.i(i, cacheWindowScope.schedulePrefetch(i, new sf(this, cacheWindowScope, i2)));
        if (!z || (list = (List) this.prefetchWindowHandles.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i2)).markAsUrgent();
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 getItemSizeOrPrefetch$lambda$4(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i, int i2) {
        cacheWindowLogic.onItemPrefetched(cacheWindowScope, i, i2);
        return w01.a;
    }

    private final void onDatasetChangedSize(CacheWindowScope cacheWindowScope) {
        this.shouldRefillWindow = true;
        int i = this.prefetchWindowStartLine;
        if (i < 0) {
            i = 0;
        }
        this.prefetchWindowStartLine = i;
        int lastLineIndex = cacheWindowScope.getLastLineIndex();
        if (lastLineIndex != -1) {
            int i2 = this.prefetchWindowEndLine;
            if (i2 <= lastLineIndex) {
                lastLineIndex = i2;
            }
            this.prefetchWindowEndLine = lastLineIndex;
        }
        if (this.previousPassDelta <= 0.0f) {
            removeOutOfBoundsItems(cacheWindowScope.getLastVisibleLineIndex(), this.itemsCount - 1);
        } else {
            removeOutOfBoundsItems(0, cacheWindowScope.getFirstVisibleLineIndex());
        }
    }

    private final void onItemPrefetched(CacheWindowScope cacheWindowScope, int i, int i2) {
        cachePrefetchedItem(i, i2);
        scheduleNextItemIfNeeded(cacheWindowScope);
        traceWindowInfo();
    }

    private final void onKeepAround(int i, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7;
        int i8;
        if (f <= 0.0f) {
            this.prefetchWindowStartExtraSpace = i5 - i4;
            this.prefetchWindowStartLine = i;
            while (this.prefetchWindowStartExtraSpace > 0 && (i8 = this.prefetchWindowStartLine) > 0 && this.windowCache.a(i8 - 1)) {
                Object b = this.windowCache.b(this.prefetchWindowStartLine - 1);
                b.getClass();
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= ((CachedItem) b).getMainAxisSize();
            }
            removeOutOfBoundsItems(0, this.prefetchWindowStartLine - 1);
            return;
        }
        this.prefetchWindowEndExtraSpace = i5 - i3;
        this.prefetchWindowEndLine = i2;
        while (this.prefetchWindowEndExtraSpace > 0 && (i7 = this.prefetchWindowEndLine) < i6 - 1 && this.windowCache.a(i7 + 1)) {
            Object b2 = this.windowCache.b(this.prefetchWindowEndLine + 1);
            b2.getClass();
            int mainAxisSize = ((CachedItem) b2).getMainAxisSize();
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= mainAxisSize;
        }
        removeOutOfBoundsItems(this.prefetchWindowEndLine + 1, i6 - 1);
    }

    private final void onPrefetchForward(CacheWindowScope cacheWindowScope, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = Math.signum(f) == Math.signum(this.previousPassDelta);
        if (!z) {
            if (!z2 || this.shouldRefillWindow) {
                this.prefetchWindowStartExtraSpace = i3 - i5;
                this.prefetchWindowStartLine = i;
            } else {
                int P = y80.P(Math.abs(f)) + this.prefetchWindowStartExtraSpace;
                int i7 = i3 - i5;
                if (P > i7) {
                    P = i7;
                }
                this.prefetchWindowStartExtraSpace = P;
            }
            while (this.prefetchWindowStartExtraSpace > 0 && (i6 = this.prefetchWindowStartLine) > 0) {
                int itemSizeOrPrefetch = getItemSizeOrPrefetch(cacheWindowScope, this.prefetchWindowStartLine - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (itemSizeOrPrefetch == -1) {
                    return;
                }
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= itemSizeOrPrefetch;
            }
            return;
        }
        if (!z2 || this.shouldRefillWindow) {
            this.prefetchWindowEndExtraSpace = i3 - i4;
            this.prefetchWindowEndLine = i2;
        } else {
            int P2 = y80.P(Math.abs(f)) + this.prefetchWindowEndExtraSpace;
            int i8 = i3 - i4;
            if (P2 > i8) {
                P2 = i8;
            }
            this.prefetchWindowEndExtraSpace = P2;
        }
        while (this.prefetchWindowEndExtraSpace > 0 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) != -1 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) < this.itemsCount - 1) {
            int itemSizeOrPrefetch2 = getItemSizeOrPrefetch(cacheWindowScope, this.prefetchWindowEndLine + 1, this.prefetchWindowEndLine + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (itemSizeOrPrefetch2 == -1) {
                return;
            }
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= itemSizeOrPrefetch2;
        }
    }

    private final void refillWindow(CacheWindowScope cacheWindowScope, boolean z) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            onPrefetchForward(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), 0.0f, z);
        }
    }

    private final void removeOutOfBoundsItems(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char c2;
        long j4;
        this.indicesToRemove.d();
        na0 na0Var = this.prefetchWindowHandles;
        int[] iArr = na0Var.b;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j5 = -9187201950435737472L;
        if (length >= 0) {
            int i4 = 0;
            j2 = 128;
            while (true) {
                long j6 = jArr[i4];
                j3 = 255;
                if ((((~j6) << c3) & j6 & j5) != j5) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j6 & 255) < 128) {
                            c2 = c3;
                            int i7 = iArr[(i4 << 3) + i6];
                            if (i <= i7 && i7 <= i2) {
                                j4 = j5;
                                this.indicesToRemove.b(i7);
                                j6 >>= 8;
                                i6++;
                                c3 = c2;
                                j5 = j4;
                            }
                        } else {
                            c2 = c3;
                        }
                        j4 = j5;
                        j6 >>= 8;
                        i6++;
                        c3 = c2;
                        j5 = j4;
                    }
                    c = c3;
                    j = j5;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j5;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                c3 = c;
                j5 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        na0 na0Var2 = this.windowCache;
        int[] iArr2 = na0Var2.b;
        long[] jArr2 = na0Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j7 = jArr2[i8];
                if ((((~j7) << c) & j7 & j) != j) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j7 & j3) < j2 && i <= (i3 = iArr2[(i8 << 3) + i10]) && i3 <= i2) {
                            this.indicesToRemove.b(i3);
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length2) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        oa0 oa0Var = this.indicesToRemove;
        int[] iArr3 = oa0Var.b;
        long[] jArr3 = oa0Var.a;
        int length3 = jArr3.length - 2;
        if (length3 < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j8 = jArr3[i11];
            if ((((~j8) << c) & j8 & j) != j) {
                int i12 = 8 - ((~(i11 - length3)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((j8 & j3) < j2) {
                        int i14 = iArr3[(i11 << 3) + i13];
                        List list = (List) this.prefetchWindowHandles.g(i14);
                        if (list != null) {
                            int size = list.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i15)).cancel();
                            }
                        }
                        this.windowCache.g(i14);
                    }
                    j8 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length3) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final void scheduleNextItemIfNeeded(CacheWindowScope cacheWindowScope) {
        int i;
        int i2 = 1;
        if (Math.signum(this.previousPassDelta) <= 0.0f) {
            if (this.prefetchWindowEndExtraSpace > 0) {
                i = this.prefetchWindowEndLine + 1;
            }
            i = -1;
        } else {
            if (Math.signum(this.previousPassDelta) > 0.0f && this.prefetchWindowStartExtraSpace > 0) {
                i = this.prefetchWindowStartLine - 1;
            }
            i = -1;
        }
        if (i <= 0 || cacheWindowScope.getLastIndexInLine(i) == -1 || cacheWindowScope.getLastIndexInLine(i) >= this.itemsCount) {
            return;
        }
        this.prefetchWindowHandles.i(i, cacheWindowScope.schedulePrefetch(i, new sf(this, cacheWindowScope, i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 scheduleNextItemIfNeeded$lambda$1(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i, int i2) {
        cacheWindowLogic.onItemPrefetched(cacheWindowScope, i, i2);
        return w01.a;
    }

    private final void traceWindowInfo() {
        AndroidTrace_androidKt.traceValue("prefetchWindowStartExtraSpace", this.prefetchWindowStartExtraSpace);
        AndroidTrace_androidKt.traceValue("prefetchWindowEndExtraSpace", this.prefetchWindowEndExtraSpace);
        AndroidTrace_androidKt.traceValue("prefetchWindowStartIndex", this.prefetchWindowStartLine);
        AndroidTrace_androidKt.traceValue("prefetchWindowEndIndex", this.prefetchWindowEndLine);
    }

    private final CachedItem updateOrCreateCachedItem(int i, int i2, Object obj) {
        CachedItem cachedItem = (CachedItem) this.windowCache.b(i);
        if (cachedItem == null) {
            return new CachedItem(CachedItem.NoKey, i2);
        }
        cachedItem.setMainAxisSize(i2);
        cachedItem.setKey(obj);
        return cachedItem;
    }

    public final int getPrefetchWindowEndLine$foundation() {
        return this.prefetchWindowEndLine;
    }

    public final int getPrefetchWindowStartLine$foundation() {
        return this.prefetchWindowStartLine;
    }

    public final boolean hasValidBounds() {
        return (this.prefetchWindowStartLine == Integer.MAX_VALUE || this.prefetchWindowEndLine == Integer.MIN_VALUE) ? false : true;
    }

    public final void onScroll(CacheWindowScope cacheWindowScope, float f) {
        traceWindowInfo();
        fillCacheWindowBackward(cacheWindowScope, f);
        fillCacheWindowForward(cacheWindowScope, f);
        this.previousPassDelta = f;
        traceWindowInfo();
    }

    public final void onVisibleItemsUpdated(CacheWindowScope cacheWindowScope) {
        if (!this.hasUpdatedVisibleItemsOnce && this.enableInitialPrefetch) {
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            if ((density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, cacheWindowScope.getMainAxisViewportSize()) : 0) != 0) {
                this.shouldRefillWindow = true;
            }
            this.hasUpdatedVisibleItemsOnce = true;
        }
        int i = this.previousPassItemCount;
        if (i != -1 && i != cacheWindowScope.getTotalItemsCount()) {
            onDatasetChangedSize(cacheWindowScope);
        }
        this.itemsCount = cacheWindowScope.getTotalItemsCount();
        if (cacheWindowScope.getHasVisibleItems()) {
            int visibleLineCount = cacheWindowScope.getVisibleLineCount();
            for (int i2 = 0; i2 < visibleLineCount; i2++) {
                int visibleItemLine = cacheWindowScope.getVisibleItemLine(i2);
                Object visibleLineKey = cacheWindowScope.getVisibleLineKey(i2);
                int visibleItemSize = cacheWindowScope.getVisibleItemSize(i2);
                if (visibleItemLine != -1) {
                    cacheVisibleItemsInfo(visibleItemLine, visibleLineKey, visibleItemSize);
                }
            }
            if (this.shouldRefillWindow) {
                refillWindow(cacheWindowScope, this.previousPassDelta <= 0.0f);
                this.shouldRefillWindow = false;
            }
        } else {
            resetStrategy();
        }
        this.previousPassItemCount = cacheWindowScope.getTotalItemsCount();
    }

    public final void resetStrategy() {
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
        this.prefetchWindowStartExtraSpace = 0;
        this.prefetchWindowEndExtraSpace = 0;
        this.shouldRefillWindow = false;
        this.windowCache.c();
        na0 na0Var = this.prefetchWindowHandles;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = na0Var.b[i4];
                        List list = (List) na0Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i6)).cancel();
                        }
                        na0Var.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public /* synthetic */ CacheWindowLogic(LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z, int i, dq dqVar) {
        this(lazyLayoutCacheWindow, (i & 2) != 0 ? true : z);
    }
}
