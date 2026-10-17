package defpackage;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class mn0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectionManager e;

    public /* synthetic */ mn0(SelectionManager selectionManager, int i) {
        this.d = i;
        this.e = selectionManager;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult SelectionContainer$lambda$10$0;
        w01 _init_$lambda$5;
        w01 _init_$lambda$6;
        w01 _get_modifier_$lambda$1;
        w01 _get_modifier_$lambda$2;
        w01 _get_modifier_$lambda$3;
        Rect _get_contextMenuAreaModifier_$lambda$0;
        w01 onSelectionChange$lambda$0;
        w01 _init_$lambda$0;
        int i = this.d;
        SelectionManager selectionManager = this.e;
        switch (i) {
            case 0:
                SelectionContainer$lambda$10$0 = SelectionContainerKt.SelectionContainer$lambda$10$0(selectionManager, (DisposableEffectScope) obj);
                return SelectionContainer$lambda$10$0;
            case 1:
                _init_$lambda$5 = SelectionManager._init_$lambda$5(selectionManager, ((Long) obj).longValue());
                return _init_$lambda$5;
            case 2:
                _init_$lambda$6 = SelectionManager._init_$lambda$6(selectionManager, ((Long) obj).longValue());
                return _init_$lambda$6;
            case 3:
                _get_modifier_$lambda$1 = SelectionManager._get_modifier_$lambda$1(selectionManager, (LayoutCoordinates) obj);
                return _get_modifier_$lambda$1;
            case 4:
                _get_modifier_$lambda$2 = SelectionManager._get_modifier_$lambda$2(selectionManager, (FocusState) obj);
                return _get_modifier_$lambda$2;
            case 5:
                _get_modifier_$lambda$3 = SelectionManager._get_modifier_$lambda$3(selectionManager, ((Boolean) obj).booleanValue());
                return _get_modifier_$lambda$3;
            case 6:
                _get_contextMenuAreaModifier_$lambda$0 = SelectionManager._get_contextMenuAreaModifier_$lambda$0(selectionManager, (LayoutCoordinates) obj);
                return _get_contextMenuAreaModifier_$lambda$0;
            case 7:
                onSelectionChange$lambda$0 = SelectionManager.onSelectionChange$lambda$0(selectionManager, (Selection) obj);
                return onSelectionChange$lambda$0;
            default:
                _init_$lambda$0 = SelectionManager._init_$lambda$0(selectionManager, ((Long) obj).longValue());
                return _init_$lambda$0;
        }
    }
}
