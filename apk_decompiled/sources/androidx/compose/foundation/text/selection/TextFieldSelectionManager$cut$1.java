package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {966}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$cut$1 extends us0 implements my {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$cut$1(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldSelectionManager$cut$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionManager$cut$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        w01 w01Var = w01.a;
        if (i == 0) {
            p10.Q(obj);
            AnnotatedString cutWithResult$foundation = this.this$0.cutWithResult$foundation();
            if (cutWithResult$foundation == null) {
                return w01Var;
            }
            Clipboard clipboard$foundation = this.this$0.getClipboard$foundation();
            if (clipboard$foundation != null) {
                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(cutWithResult$foundation);
                this.label = 1;
                Object clipEntry2 = clipboard$foundation.setClipEntry(clipEntry, this);
                vn vnVar = vn.d;
                if (clipEntry2 == vnVar) {
                    return vnVar;
                }
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01Var;
    }
}
