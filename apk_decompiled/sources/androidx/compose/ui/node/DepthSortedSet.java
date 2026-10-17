package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.ad0;
import defpackage.ky;
import defpackage.ta0;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final boolean extraAssertions;
    private ta0 mapOfOriginalDepth;
    private final SortedSet<LayoutNode> set;

    public DepthSortedSet(boolean z) {
        Comparator comparator;
        this.extraAssertions = z;
        comparator = DepthSortedSetKt.DepthComparator;
        this.set = new SortedSet<>(comparator);
    }

    private final ta0 safeMapOfOriginalDepth() {
        ta0 ta0Var = this.mapOfOriginalDepth;
        if (ta0Var != null) {
            return ta0Var;
        }
        ta0 ta0Var2 = ad0.a;
        ta0 ta0Var3 = new ta0();
        this.mapOfOriginalDepth = ta0Var3;
        return ta0Var3;
    }

    public final void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            ta0 safeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int a = safeMapOfOriginalDepth.a(layoutNode);
            int i = a >= 0 ? safeMapOfOriginalDepth.c[a] : Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                safeMapOfOriginalDepth.h(layoutNode.getDepth$ui(), layoutNode);
            } else if (i != layoutNode.getDepth$ui()) {
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean contains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (contains == (safeMapOfOriginalDepth().a(layoutNode) >= 0)) {
                return contains;
            }
            InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
        }
        return contains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final LayoutNode pop() {
        LayoutNode first = this.set.first();
        remove(first);
        return first;
    }

    public final void popEach(ky kyVar) {
        while (!isEmpty()) {
            kyVar.invoke(pop());
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            ta0 safeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (safeMapOfOriginalDepth.a(layoutNode) >= 0) {
                int b = safeMapOfOriginalDepth.b(layoutNode);
                int a = safeMapOfOriginalDepth.a(layoutNode);
                if (a >= 0) {
                    safeMapOfOriginalDepth.g(a);
                }
                if (b == (remove ? layoutNode.getDepth$ui() : Integer.MAX_VALUE)) {
                    return remove;
                }
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        return remove;
    }

    public String toString() {
        return this.set.toString();
    }
}
