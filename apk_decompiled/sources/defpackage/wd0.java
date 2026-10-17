package defpackage;

import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTableKt;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class wd0 implements SlotTableEditor.VisitSlotsInRememberOrderCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ RememberManager b;

    public /* synthetic */ wd0(RememberManager rememberManager, int i) {
        this.a = i;
        this.b = rememberManager;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
    public final boolean visit(int i, int i2, Object obj) {
        boolean execute$lambda$0;
        boolean removeGroupAndForgetSlots$lambda$0;
        boolean deactivateCurrentGroup$lambda$0;
        boolean removeCurrentGroup$lambda$0;
        int i3 = this.a;
        RememberManager rememberManager = this.b;
        switch (i3) {
            case 0:
                execute$lambda$0 = Operation.RemoveTailGroupsAndValues.execute$lambda$0(rememberManager, i, i2, obj);
                return execute$lambda$0;
            case 1:
                removeGroupAndForgetSlots$lambda$0 = SlotTableEditorKt.removeGroupAndForgetSlots$lambda$0(rememberManager, i, i2, obj);
                return removeGroupAndForgetSlots$lambda$0;
            case 2:
                deactivateCurrentGroup$lambda$0 = SlotTableKt.deactivateCurrentGroup$lambda$0(rememberManager, i, i2, obj);
                return deactivateCurrentGroup$lambda$0;
            default:
                removeCurrentGroup$lambda$0 = SlotTableKt.removeCurrentGroup$lambda$0(rememberManager, i, i2, obj);
                return removeCurrentGroup$lambda$0;
        }
    }
}
