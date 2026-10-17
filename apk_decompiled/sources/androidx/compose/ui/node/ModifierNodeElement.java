package androidx.compose.ui.node;

import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ao0;
import defpackage.ki0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(ki0.a(getClass()).b());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    public abstract N create();

    public abstract boolean equals(Object obj);

    @Override // androidx.compose.ui.platform.InspectableValue
    public final ao0 getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Actual_jvmAndAndroidKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract void update(N n);
}
