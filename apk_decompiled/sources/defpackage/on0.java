package defpackage;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class on0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectionManager e;

    public /* synthetic */ on0(SelectionManager selectionManager, int i) {
        this.d = i;
        this.e = selectionManager;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 _init_$lambda$2;
        w01 addSelectionContainerTextContextMenuComponents$lambda$0;
        int i = this.d;
        SelectionManager selectionManager = this.e;
        switch (i) {
            case 0:
                _init_$lambda$2 = SelectionManager._init_$lambda$2(selectionManager, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
                return _init_$lambda$2;
            default:
                addSelectionContainerTextContextMenuComponents$lambda$0 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0(selectionManager, (TextContextMenuBuilderScope) obj, (Context) obj2);
                return addSelectionContainerTextContextMenuComponents$lambda$0;
        }
    }
}
