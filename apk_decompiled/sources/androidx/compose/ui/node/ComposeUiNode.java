package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final iy Constructor = LayoutNode.Companion.getConstructor$ui();
        private static final iy VirtualConstructor = ComposeUiNode$Companion$VirtualConstructor$1.INSTANCE;
        private static final my SetModifier = ComposeUiNode$Companion$SetModifier$1.INSTANCE;
        private static final my SetDensity = ComposeUiNode$Companion$SetDensity$1.INSTANCE;
        private static final my SetResolvedCompositionLocals = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.INSTANCE;
        private static final my SetMeasurePolicy = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;
        private static final my SetLayoutDirection = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;
        private static final my SetViewConfiguration = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;
        private static final my SetCompositeKeyHash = ComposeUiNode$Companion$SetCompositeKeyHash$1.INSTANCE;
        private static final ky ApplyOnDeactivatedNodeAssertion = ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1.INSTANCE;

        private Companion() {
        }

        public final ky getApplyOnDeactivatedNodeAssertion() {
            return ApplyOnDeactivatedNodeAssertion;
        }

        public final iy getConstructor() {
            return Constructor;
        }

        public final my getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final my getSetDensity() {
            return SetDensity;
        }

        public final my getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final my getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final my getSetModifier() {
            return SetModifier;
        }

        public final my getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final my getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final iy getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    int getCompositeKeyHash();

    CompositionLocalMap getCompositionLocalMap();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i);

    void setCompositionLocalMap(CompositionLocalMap compositionLocalMap);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);
}
