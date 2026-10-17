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
@bq(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", l = {108}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionContainerKt$SelectionContainer$3$1$1 extends us0 implements my {
    final /* synthetic */ Clipboard $clipboard;
    final /* synthetic */ AnnotatedString $textToCopy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3$1$1(Clipboard clipboard, AnnotatedString annotatedString, hm hmVar) {
        super(2, hmVar);
        this.$clipboard = clipboard;
        this.$textToCopy = annotatedString;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SelectionContainerKt$SelectionContainer$3$1$1(this.$clipboard, this.$textToCopy, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SelectionContainerKt$SelectionContainer$3$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            Clipboard clipboard = this.$clipboard;
            ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(this.$textToCopy);
            this.label = 1;
            Object clipEntry2 = clipboard.setClipEntry(clipEntry, this);
            vn vnVar = vn.d;
            if (clipEntry2 == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
