package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import defpackage.ky;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface AlignmentLinesOwner extends Measurable {
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(ky kyVar);

    AlignmentLines getAlignmentLines();

    NodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    int getPlaceOrder();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
