package androidx.compose.ui.platform.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.ut;
import defpackage.x0;
import defpackage.y0;
import defpackage.yi;
import defpackage.z0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List list2;
        long m4526unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = ut.d;
        } else {
            ArrayList arrayList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int size = list.size() - 1;
            int i = 0;
            while (i < size) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayList.add(Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m4546getCenterF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m4546getCenterF1C5BW0() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m4546getCenterF1C5BW0() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m4546getCenterF1C5BW0() & 4294967295L)))) & 4294967295L))));
                semanticsNode = semanticsNode2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            m4526unboximpl = ((Offset) yi.p0(list2)).m4526unboximpl();
        } else {
            if (list2.isEmpty()) {
                ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object p0 = yi.p0(list2);
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                int i2 = 1;
                while (true) {
                    p0 = Offset.m4505boximpl(Offset.m4521plusMKHz9U(((Offset) p0).m4526unboximpl(), ((Offset) list2.get(i2)).m4526unboximpl()));
                    if (i2 == size2) {
                        break;
                    }
                    i2++;
                }
            }
            m4526unboximpl = ((Offset) p0).m4526unboximpl();
        }
        return Float.intBitsToFloat((int) (4294967295L & m4526unboximpl)) < Float.intBitsToFloat((int) (m4526unboximpl >> 32));
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, z0 z0Var) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            x0 accessibilityCollectionInfo = toAccessibilityCollectionInfo(collectionInfo);
            z0Var.a.setCollectionInfo(accessibilityCollectionInfo == null ? null : (AccessibilityNodeInfo.CollectionInfo) accessibilityCollectionInfo.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        z0Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(calculateIfHorizontallyStacked ? 1 : arrayList.size(), calculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, z0 z0Var) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            y0 accessibilityCollectionItemInfo = toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode);
            z0Var.a.setCollectionItemInfo(accessibilityCollectionItemInfo == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) accessibilityCollectionItemInfo.a);
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui = parent.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui().getPlaceOrder$ui() < semanticsNode.getLayoutNode$ui().getPlaceOrder$ui()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            z0Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(calculateIfHorizontallyStacked ? 0 : i, 1, calculateIfHorizontallyStacked ? i : 0, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.INSTANCE)).booleanValue()));
        }
    }

    private static final x0 toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return new x0(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0));
    }

    private static final y0 toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return new y0(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.INSTANCE)).booleanValue()));
    }
}
