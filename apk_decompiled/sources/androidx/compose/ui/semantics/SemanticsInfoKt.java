package androidx.compose.ui.semantics;

import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SemanticsInfoKt {
    public static final SemanticsInfo findMergingSemanticsParent(SemanticsInfo semanticsInfo) {
        for (SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            SemanticsConfiguration semanticsConfiguration = parentInfo.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                return parentInfo;
            }
        }
        return null;
    }

    public static final SemanticsConfiguration mergedSemanticsConfiguration(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants() && !semanticsConfiguration.isClearingSemantics()) {
            semanticsConfiguration = semanticsConfiguration.copy();
            xa0 xa0Var = new xa0(semanticsInfo.getChildrenInfo().size());
            xa0Var.i(semanticsInfo.getChildrenInfo());
            while (xa0Var.e()) {
                SemanticsInfo semanticsInfo2 = (SemanticsInfo) xa0Var.l(xa0Var.b - 1);
                SemanticsConfiguration semanticsConfiguration2 = semanticsInfo2.getSemanticsConfiguration();
                if (semanticsConfiguration2 != null && !semanticsConfiguration2.isMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui(semanticsConfiguration2);
                    if (!semanticsConfiguration2.isClearingSemantics()) {
                        xa0Var.i(semanticsInfo2.getChildrenInfo());
                    }
                }
            }
        }
        return semanticsConfiguration;
    }

    public static final SemanticsInfo nearestParentThatHasSemantics(SemanticsInfo semanticsInfo) {
        for (SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            if (parentInfo.getSemanticsConfiguration() != null) {
                return parentInfo;
            }
        }
        return null;
    }
}
