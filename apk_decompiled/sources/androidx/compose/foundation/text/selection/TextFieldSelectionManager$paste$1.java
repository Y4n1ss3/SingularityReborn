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
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {923, 923}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$paste$1 extends us0 implements my {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldSelectionManager$paste$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionManager$paste$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r6 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == r4) goto L19;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            Clipboard clipboard$foundation = this.this$0.getClipboard$foundation();
            if (clipboard$foundation != null) {
                this.label = 1;
                obj = clipboard$foundation.getClipEntry(this);
            }
            return w01Var;
        }
        if (i != 1) {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            AnnotatedString annotatedString = (AnnotatedString) obj;
            if (annotatedString != null) {
                this.this$0.paste$foundation(annotatedString);
            }
            return w01Var;
        }
        p10.Q(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null) {
            this.label = 2;
            obj = ClipboardUtils_androidKt.readAnnotatedString(clipEntry, this);
        }
        return w01Var;
    }
}
