package androidx.compose.foundation.lazy.layout;

import defpackage.e10;
import defpackage.f10;
import defpackage.k10;
import defpackage.ma0;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface StickyItemsPlacement {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StickyItemsPlacement StickToTopPlacement = new StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = list.get(i8);
                    if (lazyLayoutMeasuredItem.getIndex() != i) {
                        break;
                    }
                    i8++;
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int mainAxisOffset = lazyLayoutMeasuredItem2 != null ? LazyLayoutStickyItemsKt.getMainAxisOffset(lazyLayoutMeasuredItem2) : Integer.MIN_VALUE;
                int max = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
                return mainAxisOffset != Integer.MIN_VALUE ? Math.min(max, mainAxisOffset - i2) : max;
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public e10 getStickingIndices(int i, int i2, e10 e10Var) {
                int i3;
                if (i2 - i < 0 || (i3 = e10Var.b) == 0) {
                    return f10.a;
                }
                k10 W = y80.W(0, i3);
                int i4 = W.d;
                int i5 = W.e;
                int i6 = -1;
                if (i4 <= i5) {
                    while (e10Var.b(i4) <= i) {
                        i6 = e10Var.b(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i6 == -1) {
                    return f10.a;
                }
                ma0 ma0Var = f10.a;
                ma0 ma0Var2 = new ma0(1);
                ma0Var2.e(i6);
                return ma0Var2;
            }
        };

        private Companion() {
        }

        public final StickyItemsPlacement getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }

    int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    e10 getStickingIndices(int i, int i2, e10 e10Var);
}
