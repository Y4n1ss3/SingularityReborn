package androidx.compose.ui.platform;

import defpackage.ao0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final ky info;

    public InspectorValueInfo(ky kyVar) {
        this.info = kyVar;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public ao0 getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
