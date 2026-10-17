package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ji0;
import defpackage.m60;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.ra0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", l = {448}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionManager$suggestSelectionForLongPressOrDoubleClick$2 extends us0 implements my {
    final /* synthetic */ ji0 $selectionInSelectable;
    final /* synthetic */ ii0 $targetSelectableId;
    final /* synthetic */ ji0 $textInSelectable;
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(SelectionManager selectionManager, ji0 ji0Var, ji0 ji0Var2, ii0 ii0Var, hm hmVar) {
        super(2, hmVar);
        this.this$0 = selectionManager;
        this.$textInSelectable = ji0Var;
        this.$selectionInSelectable = ji0Var2;
        this.$targetSelectableId = ii0Var;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(this.this$0, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SelectionManager$suggestSelectionForLongPressOrDoubleClick$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        TextRange textRange;
        Selectable selectable;
        TextLayoutResult textLayoutResult;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PlatformSelectionBehaviors platformSelectionBehaviors$foundation = this.this$0.getPlatformSelectionBehaviors$foundation();
            if (platformSelectionBehaviors$foundation == null) {
                textRange = null;
                w01 w01Var = w01.a;
                if (textRange != null && !textRange.equals(this.$selectionInSelectable.d) && (selectable = (Selectable) this.this$0.selectionRegistrar.getSelectableMap$foundation().b(this.$targetSelectableId.d)) != null && selectable.getText() == this.$textInSelectable.d && (textLayoutResult = selectable.textLayoutResult()) != null) {
                    Selection selection = new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m7060getStartimpl(textRange.m7064unboximpl())), TextRange.m7060getStartimpl(textRange.m7064unboximpl()), this.$targetSelectableId.d), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m7055getEndimpl(textRange.m7064unboximpl())), TextRange.m7055getEndimpl(textRange.m7064unboximpl()), this.$targetSelectableId.d), false, 4, null);
                    SelectionRegistrarImpl selectionRegistrarImpl = this.this$0.selectionRegistrar;
                    long j = this.$targetSelectableId.d;
                    ra0 ra0Var = m60.a;
                    ra0 ra0Var2 = new ra0();
                    ra0Var2.h(j, selection);
                    selectionRegistrarImpl.setSubselections(ra0Var2);
                    this.this$0.getOnSelectionChange().invoke(selection);
                    this.this$0.setPreviousSelectionLayout$foundation(null);
                }
                return w01Var;
            }
            CharSequence charSequence = (CharSequence) this.$textInSelectable.d;
            long m7064unboximpl = ((TextRange) this.$selectionInSelectable.d).m7064unboximpl();
            this.label = 1;
            obj = platformSelectionBehaviors$foundation.mo1491suggestSelectionForLongPressOrDoubleClickpYaCww(charSequence, m7064unboximpl, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        textRange = (TextRange) obj;
        w01 w01Var2 = w01.a;
        if (textRange != null) {
            Selection selection2 = new Selection(new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m7060getStartimpl(textRange.m7064unboximpl())), TextRange.m7060getStartimpl(textRange.m7064unboximpl()), this.$targetSelectableId.d), new Selection.AnchorInfo(SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, TextRange.m7055getEndimpl(textRange.m7064unboximpl())), TextRange.m7055getEndimpl(textRange.m7064unboximpl()), this.$targetSelectableId.d), false, 4, null);
            SelectionRegistrarImpl selectionRegistrarImpl2 = this.this$0.selectionRegistrar;
            long j2 = this.$targetSelectableId.d;
            ra0 ra0Var3 = m60.a;
            ra0 ra0Var22 = new ra0();
            ra0Var22.h(j2, selection2);
            selectionRegistrarImpl2.setSubselections(ra0Var22);
            this.this$0.getOnSelectionChange().invoke(selection2);
            this.this$0.setPreviousSelectionLayout$foundation(null);
        }
        return w01Var2;
    }
}
