package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", f = "TextFieldSelectionManager.kt", l = {1078}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1 extends us0 implements my {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0$0(TextFieldSelectionManager textFieldSelectionManager) {
        un coroutineScope$foundation = textFieldSelectionManager.getCoroutineScope$foundation();
        if (coroutineScope$foundation != null) {
            p01.t(coroutineScope$foundation, null, xn.g, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(textFieldSelectionManager, null), 1);
        }
        textFieldSelectionManager.hideSelectionToolbar$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0$1(TextFieldSelectionManager textFieldSelectionManager) {
        un coroutineScope$foundation = textFieldSelectionManager.getCoroutineScope$foundation();
        if (coroutineScope$foundation != null) {
            p01.t(coroutineScope$foundation, null, xn.g, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1(textFieldSelectionManager, null), 1);
        }
        textFieldSelectionManager.hideSelectionToolbar$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0$2(TextFieldSelectionManager textFieldSelectionManager) {
        un coroutineScope$foundation = textFieldSelectionManager.getCoroutineScope$foundation();
        if (coroutineScope$foundation != null) {
            p01.t(coroutineScope$foundation, null, xn.g, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1(textFieldSelectionManager, null), 1);
        }
        textFieldSelectionManager.hideSelectionToolbar$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0$3(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.selectAll$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0$4(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.autofill$foundation();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Rect contentRect;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            this.label = 1;
            Object updateClipboardEntry$foundation = textFieldSelectionManager.updateClipboardEntry$foundation(this);
            vn vnVar = vn.d;
            if (updateClipboardEntry$foundation == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        Snapshot.Companion companion = Snapshot.Companion;
        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            d dVar = textFieldSelectionManager2.canShowCopyMenuItem$foundation() ? new d(textFieldSelectionManager2, 0) : null;
            d dVar2 = textFieldSelectionManager2.canShowCutMenuItem$foundation() ? new d(textFieldSelectionManager2, i2) : null;
            d dVar3 = textFieldSelectionManager2.canShowPasteMenuItem$foundation() ? new d(textFieldSelectionManager2, 2) : null;
            d dVar4 = textFieldSelectionManager2.canShowSelectAllMenuItem$foundation() ? new d(textFieldSelectionManager2, 3) : null;
            d dVar5 = textFieldSelectionManager2.canShowAutofillMenuItem$foundation() ? new d(textFieldSelectionManager2, 4) : null;
            TextToolbar textToolbar = textFieldSelectionManager2.getTextToolbar();
            if (textToolbar != null) {
                contentRect = textFieldSelectionManager2.getContentRect();
                textToolbar.showMenu(contentRect, dVar, dVar3, dVar2, dVar4, dVar5);
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            return w01.a;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
