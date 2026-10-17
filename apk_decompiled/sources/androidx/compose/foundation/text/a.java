package androidx.compose.foundation.text;

import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measure_3p2s80s$lambda$1;
        w01 invokeSuspend$lambda$0;
        w01 invoke$lambda$0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$1 = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.measure_3p2s80s$lambda$1((ArrayList) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1;
            case 1:
                invokeSuspend$lambda$0 = CoreTextFieldKt$TextFieldCursorHandle$2$1.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0((TextFieldSelectionManager) obj2, (Offset) obj);
                return invokeSuspend$lambda$0;
            default:
                invoke$lambda$0 = TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.invoke$lambda$0((State) obj2, (Offset) obj);
                return invoke$lambda$0;
        }
    }
}
