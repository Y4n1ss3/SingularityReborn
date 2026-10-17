package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cj;
import defpackage.g10;
import defpackage.h10;
import defpackage.ky;
import defpackage.mj;
import defpackage.my;
import defpackage.na0;
import defpackage.p01;
import defpackage.xe0;
import defpackage.y80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsSortKt {
    private static final my UnmergedConfigComparator;
    private static final Comparator<SemanticsNode>[] semanticComparators;

    static {
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            final Comparator comparator = i == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final Comparator<LayoutNode> zComparator$ui = LayoutNode.Companion.getZComparator$ui();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compare = comparator.compare(t, t2);
                    return compare != 0 ? compare : zComparator$ui.compare(((SemanticsNode) t).getLayoutNode$ui(), ((SemanticsNode) t2).getLayoutNode$ui());
                }
            };
            comparatorArr[i] = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compare = comparator2.compare(t, t2);
                    return compare != 0 ? compare : p01.i(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
                }
            };
            i++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = SemanticsSortKt$UnmergedConfigComparator$1.INSTANCE;
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, ky kyVar, ky kyVar2, na0 na0Var) {
        boolean booleanValue = ((Boolean) semanticsNode.getUnmergedConfig$ui().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1.INSTANCE)).booleanValue();
        if ((booleanValue || ((Boolean) kyVar2.invoke(semanticsNode)).booleanValue()) && ((Boolean) kyVar.invoke(semanticsNode)).booleanValue()) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            na0Var.i(semanticsNode.getId(), subtreeSortedByGeometryGrouping(semanticsNode, kyVar, kyVar2, semanticsNode.getChildren()));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), arrayList, kyVar, kyVar2, na0Var);
        }
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<xe0> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        int v = y80.v(arrayList);
        if (v >= 0) {
            int i = 0;
            while (true) {
                Rect rect = (Rect) arrayList.get(i).d;
                boolean z2 = rect.getTop() >= rect.getBottom();
                if (!z && !z2 && Math.max(top, rect.getTop()) < Math.min(bottom, rect.getBottom())) {
                    arrayList.set(i, new xe0(rect.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).e));
                    ((List) arrayList.get(i).e).add(semanticsNode);
                    return true;
                }
                if (i == v) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final List<SemanticsNode> sortByGeometryGroupings(SemanticsNode semanticsNode, List<SemanticsNode> list, ky kyVar, g10 g10Var) {
        int i = 0;
        char c = semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        int i2 = 2;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int size = list.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                SemanticsNode semanticsNode2 = list.get(i3);
                if (i3 == 0 || !placedEntryRowOverlaps(arrayList, semanticsNode2)) {
                    arrayList.add(new xe0(semanticsNode2.getBoundsInWindow(), y80.G(semanticsNode2)));
                }
                if (i3 == size) {
                    break;
                }
                i3++;
            }
        }
        cj.b0(arrayList, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList2 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[c ^ 1];
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            xe0 xe0Var = (xe0) arrayList.get(i4);
            cj.b0((List) xe0Var.e, comparator);
            arrayList2.addAll((Collection) xe0Var.e);
        }
        cj.b0(arrayList2, new mj(UnmergedConfigComparator, i2));
        while (i <= arrayList2.size() - 1) {
            List list2 = (List) g10Var.b(((SemanticsNode) arrayList2.get(i)).getId());
            if (list2 != null) {
                if (((Boolean) kyVar.invoke(arrayList2.get(i))).booleanValue()) {
                    i++;
                } else {
                    arrayList2.remove(i);
                }
                arrayList2.addAll(i, list2);
                i += list2.size();
            } else {
                i++;
            }
        }
        return arrayList2;
    }

    public static List sortByGeometryGroupings$default(SemanticsNode semanticsNode, List list, ky kyVar, g10 g10Var, int i, Object obj) {
        if ((i & 2) != 0) {
            kyVar = SemanticsSortKt$sortByGeometryGroupings$1.INSTANCE;
        }
        if ((i & 4) != 0) {
            g10Var = h10.a;
            g10Var.getClass();
        }
        return sortByGeometryGroupings(semanticsNode, list, kyVar, g10Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$1(my myVar, Object obj, Object obj2) {
        return ((Number) myVar.invoke(obj, obj2)).intValue();
    }

    public static final List<SemanticsNode> subtreeSortedByGeometryGrouping(SemanticsNode semanticsNode, ky kyVar, ky kyVar2, List<SemanticsNode> list) {
        na0 na0Var = h10.a;
        na0 na0Var2 = new na0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(list.get(i), arrayList, kyVar, kyVar2, na0Var2);
        }
        return sortByGeometryGroupings(semanticsNode, arrayList, kyVar2, na0Var2);
    }
}
