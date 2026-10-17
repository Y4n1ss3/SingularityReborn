package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class kn0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectionManager e;

    public /* synthetic */ kn0(SelectionManager selectionManager, int i) {
        this.d = i;
        this.e = selectionManager;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Offset SelectionContainer$lambda$9$0$0$0$0$1$1;
        Offset SelectionContainer$lambda$9$0$0$0$0$1$0;
        w01 _get_modifier_$lambda$0;
        w01 _init_$lambda$4;
        Rect contentRect;
        w01 contextMenuBuilder$lambda$0$0;
        w01 contextMenuBuilder$lambda$0$1;
        w01 addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0;
        boolean addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1;
        w01 addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2;
        int i = this.d;
        SelectionManager selectionManager = this.e;
        switch (i) {
            case 0:
                SelectionContainer$lambda$9$0$0$0$0$1$1 = SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$1(selectionManager);
                return SelectionContainer$lambda$9$0$0$0$0$1$1;
            case 1:
                SelectionContainer$lambda$9$0$0$0$0$1$0 = SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$0(selectionManager);
                return SelectionContainer$lambda$9$0$0$0$0$1$0;
            case 2:
                _get_modifier_$lambda$0 = SelectionManager._get_modifier_$lambda$0(selectionManager);
                return _get_modifier_$lambda$0;
            case 3:
                _init_$lambda$4 = SelectionManager._init_$lambda$4(selectionManager);
                return _init_$lambda$4;
            case 4:
                contentRect = selectionManager.getContentRect();
                return contentRect;
            case 5:
                contextMenuBuilder$lambda$0$0 = SelectionManagerKt.contextMenuBuilder$lambda$0$0(selectionManager);
                return contextMenuBuilder$lambda$0$0;
            case 6:
                contextMenuBuilder$lambda$0$1 = SelectionManagerKt.contextMenuBuilder$lambda$0$1(selectionManager);
                return contextMenuBuilder$lambda$0$1;
            case 7:
                addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0(selectionManager);
                return addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0;
            case 8:
                addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1(selectionManager);
                return Boolean.valueOf(addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1);
            default:
                addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2(selectionManager);
                return addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2;
        }
    }
}
