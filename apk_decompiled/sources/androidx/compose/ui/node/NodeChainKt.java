package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import defpackage.bv;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (q10.b(element, element2)) {
            return 2;
        }
        return Actual_jvmAndAndroidKt.areObjectsOfSameType(element, element2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier> mutableVector2) {
        mutableVector2.add(modifier);
        NodeChainKt$fillVector$1 nodeChainKt$fillVector$1 = null;
        while (mutableVector2.getSize() != 0) {
            Modifier modifier2 = (Modifier) bv.d(mutableVector2, 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui());
                mutableVector2.add(combinedModifier.getOuter$ui());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (nodeChainKt$fillVector$1 == null) {
                    nodeChainKt$fillVector$1 = new NodeChainKt$fillVector$1(mutableVector);
                }
                modifier2.all(nodeChainKt$fillVector$1);
                nodeChainKt$fillVector$1 = nodeChainKt$fillVector$1;
            }
        }
        return mutableVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        node.getClass();
        modifierNodeElement.update(node);
    }
}
