package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ln0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ SelectionRegistrarImpl e;
    public final /* synthetic */ my f;
    public final /* synthetic */ SelectionManager g;

    public /* synthetic */ ln0(SelectionManager selectionManager, SelectionRegistrarImpl selectionRegistrarImpl, my myVar) {
        this.g = selectionManager;
        this.e = selectionRegistrarImpl;
        this.f = myVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SelectionContainer$lambda$9;
        w01 SelectionContainer$lambda$9$0;
        int i = this.d;
        SelectionManager selectionManager = this.g;
        my myVar = this.f;
        SelectionRegistrarImpl selectionRegistrarImpl = this.e;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                SelectionContainer$lambda$9 = SelectionContainerKt.SelectionContainer$lambda$9(selectionManager, selectionRegistrarImpl, myVar, composer, intValue);
                return SelectionContainer$lambda$9;
            default:
                SelectionContainer$lambda$9$0 = SelectionContainerKt.SelectionContainer$lambda$9$0(selectionRegistrarImpl, myVar, selectionManager, composer, intValue);
                return SelectionContainer$lambda$9$0;
        }
    }

    public /* synthetic */ ln0(SelectionRegistrarImpl selectionRegistrarImpl, my myVar, SelectionManager selectionManager) {
        this.e = selectionRegistrarImpl;
        this.f = myVar;
        this.g = selectionManager;
    }
}
