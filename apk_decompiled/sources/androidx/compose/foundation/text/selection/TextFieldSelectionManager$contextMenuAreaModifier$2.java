package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends us0 implements ky {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(1, hmVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r8.mo1490onShowSelectionToolbarSbBc2M(r4, r5, r7) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (r8.updateClipboardEntry$foundation(r7) == r3) goto L19;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xe0 contextTextAndSelection;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.this$0.setTextToolbarShownViaProvider$foundation(true);
                return w01.a;
            }
            p10.Q(obj);
        }
        contextTextAndSelection = this.this$0.getContextTextAndSelection();
        if (contextTextAndSelection != null) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
            String str = (String) contextTextAndSelection.d;
            long m7064unboximpl = ((TextRange) contextTextAndSelection.e).m7064unboximpl();
            PlatformSelectionBehaviors platformSelectionBehaviors$foundation = textFieldSelectionManager2.getPlatformSelectionBehaviors$foundation();
            if (platformSelectionBehaviors$foundation != null) {
                this.label = 2;
            }
        }
        this.this$0.setTextToolbarShownViaProvider$foundation(true);
        return w01.a;
    }
}
