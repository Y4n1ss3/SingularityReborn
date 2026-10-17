package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.WideNavigationRailState;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.material3.WideNavigationRailValue;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLinkStyles;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vt0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vt0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        Rect textContextMenuToolbarHandlerNode$lambda$0;
        float textFieldScrollable$lambda$1$0$0;
        AnnotatedString.Range createTextWithLinkStyles$lambda$21;
        WideNavigationRailState Saver$lambda$1;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                textContextMenuToolbarHandlerNode$lambda$0 = TextFieldCoreModifierNode.textContextMenuToolbarHandlerNode$lambda$0((TextFieldCoreModifierNode) obj2, (LayoutCoordinates) obj);
                return textContextMenuToolbarHandlerNode$lambda$0;
            case 1:
                textFieldScrollable$lambda$1$0$0 = TextFieldScrollKt.textFieldScrollable$lambda$1$0$0((TextFieldScrollerPosition) obj2, ((Float) obj).floatValue());
                return Float.valueOf(textFieldScrollable$lambda$1$0$0);
            case 2:
                createTextWithLinkStyles$lambda$21 = TextKt.createTextWithLinkStyles$lambda$21((TextLinkStyles) obj2, (AnnotatedString.Range) obj);
                return createTextWithLinkStyles$lambda$21;
            default:
                Saver$lambda$1 = WideNavigationRailStateImpl.Companion.Saver$lambda$1((AnimationSpec) obj2, (WideNavigationRailValue) obj);
                return Saver$lambda$1;
        }
    }
}
