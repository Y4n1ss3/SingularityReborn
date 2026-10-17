package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraggableAnchorsElementV2$inspectableProperties$$inlined$debugInspectorInfo$1 extends f30 implements ky {
    final /* synthetic */ DraggableAnchorsElementV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableAnchorsElementV2$inspectableProperties$$inlined$debugInspectorInfo$1(DraggableAnchorsElementV2 draggableAnchorsElementV2) {
        super(1);
        this.this$0 = draggableAnchorsElementV2;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState;
        my myVar;
        Orientation orientation;
        ValueElementSequence properties = inspectorInfo.getProperties();
        anchoredDraggableState = this.this$0.state;
        properties.set("state", anchoredDraggableState);
        ValueElementSequence properties2 = inspectorInfo.getProperties();
        myVar = this.this$0.anchors;
        properties2.set("anchors", myVar);
        ValueElementSequence properties3 = inspectorInfo.getProperties();
        orientation = this.this$0.orientation;
        properties3.set("orientation", orientation);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return w01.a;
    }
}
