package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class dn implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextFieldSelectionManager e;

    public /* synthetic */ dn(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.d = i;
        this.e = textFieldSelectionManager;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult CoreTextField$lambda$21$0;
        Rect _get_contextMenuAreaModifier_$lambda$0;
        int i = this.d;
        TextFieldSelectionManager textFieldSelectionManager = this.e;
        switch (i) {
            case 0:
                CoreTextField$lambda$21$0 = CoreTextFieldKt.CoreTextField$lambda$21$0(textFieldSelectionManager, (DisposableEffectScope) obj);
                return CoreTextField$lambda$21$0;
            default:
                _get_contextMenuAreaModifier_$lambda$0 = TextFieldSelectionManager._get_contextMenuAreaModifier_$lambda$0(textFieldSelectionManager, (LayoutCoordinates) obj);
                return _get_contextMenuAreaModifier_$lambda$0;
        }
    }
}
